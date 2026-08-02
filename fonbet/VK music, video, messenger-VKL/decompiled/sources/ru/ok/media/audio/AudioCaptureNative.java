package ru.ok.media.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Objects;
import one.video.streaming.tools.TimeMachine;
import ru.ok.audio.util.SystemAudioConfiguration;
import ru.ok.media.utils.DebugUtils;
import ru.ok.media.utils.WeightedAverage;
import xsna.fp;
import xsna.ne7;
import xsna.odj;
import xsna.tj0;
import xsna.zvo0;

/* loaded from: classes9.dex */
public class AudioCaptureNative {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long MAX_ALLOWED_SAMPLE_CLOCK_FORWARD_DIFF_MS = 200;
    private static final long MAX_ALLOWED_SAMPLE_CLOCK_LAG_MS = 199;
    private static final int MIC_TYPE_CAMCORDER = 1;
    private static final int MIC_TYPE_DEFAULT = 0;
    private static final String TAG = "ru.ok.media.audio.AudioCaptureNative";
    private int appliedBitrate;
    private long audioRecordHandle;
    private volatile int bitrate;
    private long bufferSizeMs;
    private int bufferSizeSamples;
    private int channelCount;

    @NonNull
    private final Context context;
    private final int disguiseAudioShift;
    private volatile AudioEffectsState effects;
    long emulateAudioCaptureErrorAfterMs;
    private final zvo0 emulateCaptureError;
    private long encoderDelayMs;
    private int encoderDelaySamples;
    private volatile boolean forceOpenSL;
    private volatile long lastSampleTime;
    private final boolean logFramesCaptured;
    private long maxTime;
    private float micLevel;
    private final String micType;
    private volatile long nativeAudioProcessingFactory;
    private boolean paused;
    private volatile boolean resync;
    private int sampleRate;
    private volatile boolean stopped;
    private final SystemAudioConfiguration systemConfig;

    @NonNull
    private final TimeMachine timeMachine;
    private long totalSamples;
    private final Object tsLock = new Object();
    private volatile long playbackPosition = -1;
    private volatile VoiceConfig voiceConfigRequested = null;
    private boolean muteRequested = false;
    private VoiceConfig voiceConfigApplied = new VoiceConfig(this);
    private long baseTimestamp = -1;
    private long _startTimestamp = -1;
    private long _totalMonoSamplesSinceStartTimestamp = 0;
    private WeightedAverage drift = new WeightedAverage(0.1f);
    private final Object audioRecordHandleMutex = new Object();

    public static class AudioEncoderParams {
        public final int bitrate;
        public final int channelCount;
        public final int sampleRate;

        public AudioEncoderParams(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.bitrate = i3;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AudioEncoderParams) {
                AudioEncoderParams audioEncoderParams = (AudioEncoderParams) obj;
                if (this.sampleRate == audioEncoderParams.sampleRate && this.channelCount == audioEncoderParams.channelCount && this.bitrate == audioEncoderParams.bitrate) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount), Integer.valueOf(this.bitrate));
        }
    }

    public static class AudioState {
        long playbackPositionMS = -1;
        float micLevel = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public AudioState() {
            reset();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.playbackPositionMS = -1L;
            this.micLevel = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public String toString() {
            return "playbackPositionMS=" + this.playbackPositionMS + " micLevel=" + this.micLevel;
        }
    }

    public AudioCaptureNative(SystemAudioConfiguration systemAudioConfiguration, String str, @NonNull AudioEncoderParams audioEncoderParams, int i, Context context, boolean z, @NonNull TimeMachine timeMachine, long j) {
        this.systemConfig = systemAudioConfiguration;
        this.micType = str;
        this.sampleRate = audioEncoderParams.sampleRate;
        this.channelCount = audioEncoderParams.channelCount;
        this.bitrate = audioEncoderParams.bitrate;
        this.disguiseAudioShift = i;
        this.context = context;
        this.logFramesCaptured = z;
        this.timeMachine = timeMachine;
        this.emulateAudioCaptureErrorAfterMs = j;
        if (j <= 0) {
            this.emulateCaptureError = null;
            return;
        }
        zvo0 zvo0Var = new zvo0(timeMachine);
        this.emulateCaptureError = zvo0Var;
        zvo0Var.b();
    }

    public static /* bridge */ /* synthetic */ int N(AudioCaptureNative audioCaptureNative, long j, ByteBuffer byteBuffer, int i, AudioState audioState) {
        return audioCaptureNative.readData(j, byteBuffer, 0, i, 200, audioState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long channelSamples2Ms(long j) {
        return monoSamples2Ms(toMonoSamples(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native long createNativeCapture(int i, int i2, int i3, String str, int i4, int i5, boolean z, AudioRecordCapture audioRecordCapture);

    /* JADX INFO: Access modifiers changed from: private */
    public native void discardData(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public void doApplyEffects(long j, AudioEffectsState audioEffectsState, AudioEffectsState audioEffectsState2) {
        if (audioEffectsState == null) {
            audioEffectsState = new AudioEffectsState();
        }
        if (audioEffectsState2 == null) {
            audioEffectsState2 = new AudioEffectsState();
        }
        String playbackFile = audioEffectsState2.getPlaybackFile();
        if (!objectsEqual(audioEffectsState.getPlaybackFile(), playbackFile)) {
            stopMP3Mix(j);
            if (playbackFile != null) {
                mixMP3(j, playbackFile);
                pauseFile(j, audioEffectsState2.isPause());
            }
        }
        if (audioEffectsState.isPause() != audioEffectsState2.isPause()) {
            pauseFile(j, audioEffectsState2.isPause());
        }
        if (!objectsEqual(audioEffectsState.getFilter(), audioEffectsState2.getFilter())) {
            setFilter(j, audioEffectsState2.getFilter());
        }
        setPlaybackSettings(j, audioEffectsState2.getShiftMS(), audioEffectsState2.getMusicHalftone(), audioEffectsState2.getFileSpeakerVolume(), audioEffectsState2.getFileStreamVolume(), audioEffectsState2.getMicVolume());
        if (audioEffectsState.isMixToSpeaker() != audioEffectsState2.isMixToSpeaker()) {
            setMixToSpeaker(j, audioEffectsState2.isMixToSpeaker());
        }
        if (audioEffectsState.isNoiseSuppressionEnabled() != audioEffectsState2.isNoiseSuppressionEnabled()) {
            setNoiseSuppression(j, audioEffectsState2.isNoiseSuppressionEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int getEncodedDataMaxSize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int getEncoderConfig(long j, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native int getEncoderDelaySamples(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int getFrameSizeSamples(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public int getMicTypeInt() {
        return BuildConfig.FLAVOR.equalsIgnoreCase(this.micType) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getTimestampMs() {
        return ((this._startTimestamp - this.bufferSizeMs) - this.encoderDelayMs) + monoSamples2Ms(this._totalMonoSamplesSinceStartTimestamp);
    }

    private void handleTimestampGap() {
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        long timestampMs = getTimestampMs();
        long j = currentTimeMillis - timestampMs;
        long j2 = this.bufferSizeMs + j + this.encoderDelayMs;
        if (j2 < 0) {
            String str = TAG;
            StringBuilder b = fp.b(j2, "handleTimestampGap() - delta= ", " now= ");
            b.append(currentTimeMillis);
            tj0.d(b, " ts= ", timestampMs, " (");
            b.append(j);
            b.append(") bufferSizeMs= ");
            b.append(this.bufferSizeMs);
            b.append(" encoderDelayMs= ");
            b.append(this.encoderDelayMs);
            ne7.n(str, b.toString());
        }
        if (j2 < -200 || j2 > MAX_ALLOWED_SAMPLE_CLOCK_LAG_MS) {
            ne7.m(TAG, "handleTimestampGap() - resetting due to delta= " + j2);
            resetStartTimestamp();
        }
    }

    private native void mixAudio(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean mixMP3(long j, String str);

    private long monoSamples2Ms(long j) {
        return (j * 1000) / this.sampleRate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetAudioProcessingFactory(long j, long j2);

    private boolean objectsEqual(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void pauseCapture(long j, boolean z);

    private native void pauseFile(long j, boolean z);

    private native int readData(long j, ByteBuffer byteBuffer, int i, int i2, int i3, AudioState audioState);

    /* JADX INFO: Access modifiers changed from: private */
    public void resetStartTimestamp() {
        this._startTimestamp = this.timeMachine.currentTimeMillis();
        this._totalMonoSamplesSinceStartTimestamp = 0L;
    }

    private void samplesAdded(long j) {
        this._totalMonoSamplesSinceStartTimestamp += toMonoSamples(j);
    }

    private native void setFilter(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void setForceOpenSL(long j, boolean z);

    private native void setMixToSpeaker(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void setMuted(long j, boolean z);

    private native void setNoiseSuppression(long j, boolean z);

    private native void setPlaybackSettings(long j, int i, int i2, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void setVoiceEnabled(long j, boolean z, boolean z2, boolean z3, boolean z4);

    /* JADX INFO: Access modifiers changed from: private */
    public native void setupEncoder(long j, int i, int i2, int i3, int i4);

    private native void stopMP3Mix(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void stopNativeCapture(long j);

    private long toMonoSamples(long j) {
        return j / this.channelCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unsetStartTimestamp() {
        this._startTimestamp = -1L;
        this._totalMonoSamplesSinceStartTimestamp = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void updateEncoderBitrate(long j, int i);

    public int getBitrate() {
        return this.bitrate;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public long getCurrentTime() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.tsLock) {
            try {
                if (currentTimeMillis - this.lastSampleTime > 500) {
                    return this.maxTime;
                }
                long j = this.baseTimestamp;
                long max = Math.max(this.maxTime, j == -1 ? 0L : currentTimeMillis - j);
                this.maxTime = max;
                return max;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long getFilePlaybackPositionMS() {
        return this.playbackPosition;
    }

    public float getMicLevel() {
        return this.micLevel;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public boolean isQueueBlocked() {
        return false;
    }

    public void mixAudio(int i, int i2, ByteBuffer byteBuffer) {
        synchronized (this.audioRecordHandleMutex) {
            try {
                long j = this.audioRecordHandle;
                if (j != 0) {
                    mixAudio(j, i, i2, byteBuffer, byteBuffer.remaining());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pause() {
        this.paused = true;
    }

    public void pushEncodedFrame(ByteBuffer byteBuffer, int i) {
        handleTimestampGap();
        long timestampMs = getTimestampMs();
        samplesAdded(i);
        long j = this.totalSamples + (i / this.channelCount);
        this.totalSamples = j;
        updateTS(((j + this.encoderDelaySamples) * 1000) / this.sampleRate);
        handleEncodedData(byteBuffer, timestampMs);
    }

    public void requestVoice(boolean z, boolean z2, boolean z3, boolean z4) {
        this.voiceConfigRequested = new VoiceConfig(z, z2, z3, z4);
    }

    public void resume() {
        this.resync = true;
        this.paused = false;
    }

    public void setAudioEffectsState(AudioEffectsState audioEffectsState) {
        this.effects = audioEffectsState;
    }

    public void setAudioParams(int i, int i2, int i3) {
        this.sampleRate = i;
        this.channelCount = i2;
        this.encoderDelaySamples = i3;
        this.encoderDelayMs = channelSamples2Ms(i3);
        String str = TAG;
        StringBuilder a = odj.a(i, i2, "setAudioParams() - sampleRate= ", " channelCount= ", " encoderDelaySamples= ");
        a.append(i3);
        a.append(" encoderDelayMs= ");
        a.append(this.encoderDelayMs);
        ne7.m(str, a.toString());
    }

    public void setBitrate(int i) {
        if (this.bitrate != i) {
            ne7.t(TAG, "Changing bitrate: " + this.bitrate + "=>" + i);
            this.bitrate = i;
        }
    }

    public void setForceOpenSL(boolean z) {
        this.forceOpenSL = z;
    }

    public void setMuted(boolean z) {
        this.muteRequested = z;
    }

    public void setNativeAudioProcessingFactory(long j) {
        this.nativeAudioProcessingFactory = j;
    }

    public void start() {
        this.stopped = false;
        new Thread(new Runnable() { // from class: ru.ok.media.audio.AudioCaptureNative.1
            /* JADX WARN: Removed duplicated region for block: B:40:0x04c7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                long j;
                int i;
                boolean z;
                boolean z2;
                boolean z3;
                ByteBuffer byteBuffer;
                long j2;
                long j3;
                ne7.m(AudioCaptureNative.TAG, "run() - thread started");
                synchronized (AudioCaptureNative.this.audioRecordHandleMutex) {
                    j = 0;
                    AudioCaptureNative.this.audioRecordHandle = 0L;
                }
                try {
                    AudioState audioState = new AudioState();
                    boolean z4 = false;
                    AudioEffectsState audioEffectsState = null;
                    boolean z5 = false;
                    boolean z6 = false;
                    boolean z7 = false;
                    int i2 = 0;
                    ByteBuffer byteBuffer2 = null;
                    long j4 = 0;
                    while (!AudioCaptureNative.this.stopped) {
                        if (AudioCaptureNative.this.paused) {
                            try {
                                if (AudioCaptureNative.this.audioRecordHandle == j || z5) {
                                    j2 = j;
                                    j3 = 100;
                                } else {
                                    AudioEffectsState audioEffectsState2 = new AudioEffectsState(audioEffectsState);
                                    audioEffectsState2.setPause(true);
                                    j3 = 100;
                                    AudioCaptureNative audioCaptureNative = AudioCaptureNative.this;
                                    j2 = j;
                                    audioCaptureNative.doApplyEffects(audioCaptureNative.audioRecordHandle, audioEffectsState, audioEffectsState2);
                                    AudioCaptureNative audioCaptureNative2 = AudioCaptureNative.this;
                                    audioCaptureNative2.pauseCapture(audioCaptureNative2.audioRecordHandle, true);
                                    AudioCaptureNative.this.unsetStartTimestamp();
                                    z5 = true;
                                }
                                if (AudioCaptureNative.this.logFramesCaptured) {
                                    ne7.m(AudioCaptureNative.TAG, "run() - paused, sleeping...");
                                }
                                Thread.sleep(j3);
                                if (AudioCaptureNative.this.logFramesCaptured) {
                                    ne7.m(AudioCaptureNative.TAG, "run() - paused, awakened");
                                }
                                j = j2;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    ne7.o(AudioCaptureNative.TAG, "Audio capture error", th);
                                    AudioCaptureNative.this.handleError(th);
                                    if (AudioCaptureNative.this.audioRecordHandle != 0) {
                                    }
                                    AudioCaptureNative.this.unsetStartTimestamp();
                                } catch (Throwable th2) {
                                    if (AudioCaptureNative.this.audioRecordHandle != 0) {
                                        synchronized (AudioCaptureNative.this.audioRecordHandleMutex) {
                                            AudioCaptureNative audioCaptureNative3 = AudioCaptureNative.this;
                                            audioCaptureNative3.stopNativeCapture(audioCaptureNative3.audioRecordHandle);
                                            AudioCaptureNative.this.audioRecordHandle = 0L;
                                        }
                                    }
                                    AudioCaptureNative.this.unsetStartTimestamp();
                                    throw th2;
                                }
                            }
                        } else {
                            long j5 = j;
                            if (AudioCaptureNative.this.audioRecordHandle == j5) {
                                int samplerate = AudioCaptureNative.this.systemConfig.getSamplerate();
                                AudioCaptureNative audioCaptureNative4 = AudioCaptureNative.this;
                                audioCaptureNative4.bufferSizeSamples = audioCaptureNative4.systemConfig.getBufferSize();
                                AudioCaptureNative audioCaptureNative5 = AudioCaptureNative.this;
                                audioCaptureNative5.bufferSizeMs = audioCaptureNative5.channelSamples2Ms(audioCaptureNative5.bufferSizeSamples);
                                ne7.m(AudioCaptureNative.TAG, "run() - creating audio record, nativeSamplerate= " + samplerate + " bufferSize= " + AudioCaptureNative.this.bufferSizeSamples + " bufferSizeMs= " + AudioCaptureNative.this.bufferSizeMs);
                                synchronized (AudioCaptureNative.this.audioRecordHandleMutex) {
                                    AudioRecordCapture audioRecordCapture = new AudioRecordCapture(AudioCaptureNative.this.context, (AudioManager) AudioCaptureNative.this.context.getSystemService("audio"), 7);
                                    AudioCaptureNative audioCaptureNative6 = AudioCaptureNative.this;
                                    audioCaptureNative6.audioRecordHandle = audioCaptureNative6.createNativeCapture(samplerate, audioCaptureNative6.bufferSizeSamples, Build.VERSION.SDK_INT, AudioCaptureNative.this.context.getFilesDir().getAbsolutePath(), AudioCaptureNative.this.getMicTypeInt(), AudioCaptureNative.this.disguiseAudioShift, AudioCaptureNative.this.logFramesCaptured, audioRecordCapture);
                                }
                                ne7.m(AudioCaptureNative.TAG, "run() - created audio record");
                                AudioCaptureNative audioCaptureNative7 = AudioCaptureNative.this;
                                audioCaptureNative7.voiceConfigApplied = new VoiceConfig(audioCaptureNative7);
                                int i3 = AudioCaptureNative.this.bitrate;
                                AudioCaptureNative audioCaptureNative8 = AudioCaptureNative.this;
                                audioCaptureNative8.setupEncoder(audioCaptureNative8.audioRecordHandle, 0, AudioCaptureNative.this.sampleRate, AudioCaptureNative.this.channelCount, i3);
                                ne7.m(AudioCaptureNative.TAG, "run() - setupEncoder() done");
                                AudioCaptureNative.this.appliedBitrate = i3;
                                AudioCaptureNative audioCaptureNative9 = AudioCaptureNative.this;
                                int i4 = audioCaptureNative9.sampleRate;
                                int i5 = AudioCaptureNative.this.channelCount;
                                AudioCaptureNative audioCaptureNative10 = AudioCaptureNative.this;
                                audioCaptureNative9.setAudioParams(i4, i5, audioCaptureNative10.getEncoderDelaySamples(audioCaptureNative10.audioRecordHandle));
                                AudioCaptureNative audioCaptureNative11 = AudioCaptureNative.this;
                                i = audioCaptureNative11.getFrameSizeSamples(audioCaptureNative11.audioRecordHandle);
                                AudioCaptureNative audioCaptureNative12 = AudioCaptureNative.this;
                                byteBuffer2 = ByteBuffer.allocateDirect(audioCaptureNative12.getEncodedDataMaxSize(audioCaptureNative12.audioRecordHandle));
                                AudioCaptureNative audioCaptureNative13 = AudioCaptureNative.this;
                                int encoderConfig = audioCaptureNative13.getEncoderConfig(audioCaptureNative13.audioRecordHandle, byteBuffer2);
                                ne7.m(AudioCaptureNative.TAG, "run() - first encoder config retrieved");
                                byteBuffer2.limit(encoderConfig);
                                AudioCaptureNative.this.resetStartTimestamp();
                                AudioCaptureNative audioCaptureNative14 = AudioCaptureNative.this;
                                audioCaptureNative14.handleFormatChange(byteBuffer2, audioCaptureNative14.getTimestampMs());
                                j4 = j5;
                            } else {
                                i = i2;
                            }
                            if (z5) {
                                ne7.m(AudioCaptureNative.TAG, "run() - resuming from pause...");
                                AudioCaptureNative audioCaptureNative15 = AudioCaptureNative.this;
                                audioCaptureNative15.pauseCapture(audioCaptureNative15.audioRecordHandle, z4);
                                ne7.m(AudioCaptureNative.TAG, "run() - resumed");
                                AudioCaptureNative.this.resetStartTimestamp();
                                z = z4;
                            } else {
                                z = z5;
                            }
                            if (z7 != AudioCaptureNative.this.muteRequested) {
                                ne7.m(AudioCaptureNative.TAG, "run() - muted= " + AudioCaptureNative.this.muteRequested);
                                boolean z8 = AudioCaptureNative.this.muteRequested;
                                AudioCaptureNative audioCaptureNative16 = AudioCaptureNative.this;
                                audioCaptureNative16.setMuted(audioCaptureNative16.audioRecordHandle, z8);
                                z2 = z8;
                            } else {
                                z2 = z7;
                            }
                            long j6 = AudioCaptureNative.this.nativeAudioProcessingFactory;
                            if (j4 != j6) {
                                ne7.m(AudioCaptureNative.TAG, "run() - calling nativeSetAudioProcessingFactory()...");
                                AudioCaptureNative audioCaptureNative17 = AudioCaptureNative.this;
                                audioCaptureNative17.nativeSetAudioProcessingFactory(audioCaptureNative17.audioRecordHandle, j6);
                                ne7.m(AudioCaptureNative.TAG, "run() - done nativeSetAudioProcessingFactory()...");
                                j4 = j6;
                            }
                            if (AudioCaptureNative.this.forceOpenSL != z6) {
                                ne7.m(AudioCaptureNative.TAG, "run() - calling setForceOpenSL(" + AudioCaptureNative.this.forceOpenSL + ")...");
                                boolean z9 = AudioCaptureNative.this.forceOpenSL;
                                AudioCaptureNative audioCaptureNative18 = AudioCaptureNative.this;
                                audioCaptureNative18.setForceOpenSL(audioCaptureNative18.audioRecordHandle, AudioCaptureNative.this.forceOpenSL);
                                ne7.m(AudioCaptureNative.TAG, "run() - done setForceOpenSL()");
                                z3 = z9;
                            } else {
                                z3 = z6;
                            }
                            VoiceConfig voiceConfig = AudioCaptureNative.this.voiceConfigRequested;
                            if (voiceConfig != AudioCaptureNative.this.voiceConfigApplied) {
                                ne7.m(AudioCaptureNative.TAG, "run() - calling setVoiceEnabled()...");
                                AudioCaptureNative audioCaptureNative19 = AudioCaptureNative.this;
                                audioCaptureNative19.setVoiceEnabled(audioCaptureNative19.audioRecordHandle, voiceConfig.voice, voiceConfig.agc, voiceConfig.ns, voiceConfig.suppress16K);
                                ne7.m(AudioCaptureNative.TAG, "run() - done setVoiceEnabled()");
                                AudioCaptureNative.this.voiceConfigApplied = voiceConfig;
                            }
                            AudioEffectsState audioEffectsState3 = AudioCaptureNative.this.effects;
                            if (audioEffectsState != audioEffectsState3) {
                                ne7.m(AudioCaptureNative.TAG, "run() - calling doApplyEffects()...");
                                AudioCaptureNative audioCaptureNative20 = AudioCaptureNative.this;
                                audioCaptureNative20.doApplyEffects(audioCaptureNative20.audioRecordHandle, audioEffectsState, audioEffectsState3);
                                ne7.m(AudioCaptureNative.TAG, "run() - done doApplyEffects()");
                                audioEffectsState = audioEffectsState3;
                            }
                            int i6 = AudioCaptureNative.this.bitrate;
                            if (AudioCaptureNative.this.appliedBitrate != i6) {
                                ne7.m(AudioCaptureNative.TAG, "run() - calling doApplyEffects()...");
                                AudioCaptureNative audioCaptureNative21 = AudioCaptureNative.this;
                                audioCaptureNative21.updateEncoderBitrate(audioCaptureNative21.audioRecordHandle, i6);
                                ne7.m(AudioCaptureNative.TAG, "run() - done doApplyEffects()");
                                AudioCaptureNative.this.appliedBitrate = i6;
                            }
                            if (AudioCaptureNative.this.stopped) {
                                break;
                            }
                            if (AudioCaptureNative.this.isQueueBlocked()) {
                                try {
                                    if (AudioCaptureNative.this.logFramesCaptured) {
                                        ne7.m(AudioCaptureNative.TAG, "run() - queue blocked, sleeping()...");
                                    }
                                    Thread.sleep(100L);
                                    if (AudioCaptureNative.this.logFramesCaptured) {
                                        ne7.m(AudioCaptureNative.TAG, "run() - queue blocked, done sleeping()");
                                    }
                                    if (AudioCaptureNative.this.logFramesCaptured) {
                                        ne7.m(AudioCaptureNative.TAG, "run() - queue blocked, discarding data...");
                                    }
                                    AudioCaptureNative audioCaptureNative22 = AudioCaptureNative.this;
                                    audioCaptureNative22.discardData(audioCaptureNative22.audioRecordHandle);
                                    if (AudioCaptureNative.this.logFramesCaptured) {
                                        ne7.m(AudioCaptureNative.TAG, "run() - queue blocked, data discarded");
                                    }
                                    AudioCaptureNative.this.resetStartTimestamp();
                                    byteBuffer = byteBuffer2;
                                } catch (InterruptedException unused) {
                                    ne7.m(AudioCaptureNative.TAG, "run() - queue blocked, thread interrupted");
                                    if (AudioCaptureNative.this.audioRecordHandle != j5) {
                                        synchronized (AudioCaptureNative.this.audioRecordHandleMutex) {
                                            AudioCaptureNative audioCaptureNative23 = AudioCaptureNative.this;
                                            audioCaptureNative23.stopNativeCapture(audioCaptureNative23.audioRecordHandle);
                                            AudioCaptureNative.this.audioRecordHandle = j5;
                                        }
                                    }
                                }
                            } else {
                                audioState.reset();
                                byteBuffer2.clear();
                                if (AudioCaptureNative.this.logFramesCaptured) {
                                    ne7.m(AudioCaptureNative.TAG, "run() - reading...");
                                }
                                byteBuffer = byteBuffer2;
                                AudioCaptureNative audioCaptureNative24 = AudioCaptureNative.this;
                                int N = AudioCaptureNative.N(audioCaptureNative24, audioCaptureNative24.audioRecordHandle, byteBuffer, byteBuffer.remaining(), audioState);
                                if (AudioCaptureNative.this.logFramesCaptured) {
                                    ne7.m(AudioCaptureNative.TAG, "run() - read " + N + " byte(s)");
                                }
                                AudioCaptureNative.this.playbackPosition = audioState.playbackPositionMS;
                                AudioCaptureNative.this.micLevel = audioState.micLevel;
                                if (N < 0) {
                                    throw new RuntimeException("Failed to capture audio, result=" + N);
                                }
                                if (N > 0) {
                                    byteBuffer.limit(N);
                                    AudioCaptureNative.this.pushEncodedFrame(byteBuffer, i);
                                }
                            }
                            i2 = i;
                            z5 = z;
                            byteBuffer2 = byteBuffer;
                            z7 = z2;
                            z6 = z3;
                            z4 = false;
                            j = 0;
                        }
                    }
                    AudioCaptureNative.this.handleStopped();
                    if (AudioCaptureNative.this.audioRecordHandle != 0) {
                        synchronized (AudioCaptureNative.this.audioRecordHandleMutex) {
                            AudioCaptureNative audioCaptureNative25 = AudioCaptureNative.this;
                            audioCaptureNative25.stopNativeCapture(audioCaptureNative25.audioRecordHandle);
                            AudioCaptureNative.this.audioRecordHandle = 0L;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ne7.o(AudioCaptureNative.TAG, "Audio capture error", th);
                    AudioCaptureNative.this.handleError(th);
                    if (AudioCaptureNative.this.audioRecordHandle != 0) {
                        synchronized (AudioCaptureNative.this.audioRecordHandleMutex) {
                            AudioCaptureNative audioCaptureNative26 = AudioCaptureNative.this;
                            audioCaptureNative26.stopNativeCapture(audioCaptureNative26.audioRecordHandle);
                            AudioCaptureNative.this.audioRecordHandle = 0L;
                        }
                    }
                    AudioCaptureNative.this.unsetStartTimestamp();
                }
                AudioCaptureNative.this.unsetStartTimestamp();
            }
        }).start();
    }

    public void stop() {
        this.stopped = true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(this.micType);
        if (this.stopped) {
            sb.append(" stopped");
        } else {
            if (this.paused) {
                sb.append(" paused");
            }
            sb.append(this.systemConfig.getSamplerate());
            sb.append("->");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%f", Double.valueOf(this.sampleRate / 1000.0d)));
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(DebugUtils.channelsString(this.channelCount, true));
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(DebugUtils.formatBitrate(this.appliedBitrate, true));
            if (this.appliedBitrate != this.bitrate) {
                sb.append(" (");
                sb.append(DebugUtils.formatBitrate(this.bitrate, true));
                sb.append(")");
            }
            sb.append(String.format(locale, " lvl: %.2f", Float.valueOf(this.micLevel)));
        }
        return sb.toString();
    }

    public void updateTS(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.tsLock) {
            try {
                if (this.baseTimestamp == -1) {
                    this.baseTimestamp = currentTimeMillis - j;
                }
                long j2 = currentTimeMillis - (this.baseTimestamp + j);
                this.drift.update(j2);
                if (Math.abs(j2) > 1000 || Math.abs(this.drift.getValue()) > 150.0f || this.resync) {
                    this.baseTimestamp = currentTimeMillis - j;
                    this.drift.reset();
                    this.resync = false;
                }
                this.lastSampleTime = currentTimeMillis;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public class VoiceConfig {
        final boolean agc;
        final boolean ns;
        final boolean suppress16K;
        final boolean voice;

        public VoiceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
            this.voice = z;
            this.agc = z2;
            this.ns = z3;
            this.suppress16K = z4;
        }

        public VoiceConfig(AudioCaptureNative audioCaptureNative) {
            this(false, false, false, false);
        }
    }

    public void handleStopped() {
    }

    public void handleError(@NonNull Throwable th) {
    }

    public void handleEncodedData(ByteBuffer byteBuffer, long j) {
    }

    public void handleFormatChange(ByteBuffer byteBuffer, long j) {
    }
}
