package ru.ok.media;

import android.content.Context;
import android.os.Handler;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import one.video.streaming.tools.TimeMachine;
import ru.ok.audio.util.SystemAudioConfiguration;
import ru.ok.media.api.AACAudioProvider;
import ru.ok.media.audio.AudioCaptureNative;
import xsna.a0m;
import xsna.epx;
import xsna.jr;
import xsna.ne7;
import xsna.o1;
import xsna.r490;
import xsna.tv9;
import xsna.zcl;

/* compiled from: NativeAACCaptureAndEncode.kt */
/* loaded from: classes9.dex */
public final class NativeAACCaptureAndEncode implements AACAudioProvider {
    private static final String TAG = "Publisher";
    private AudioCapture _audioCapture;
    private volatile boolean _muteMediaCallbacks;
    private volatile AACAudioProvider.Params _params;
    private final boolean agc;
    private final Context context;
    private final int disguiseAudioShift;
    private final long emulateAudioCaptureErrorAfterMs;
    private final boolean logFramesCaptured;
    private final String microphoneType;
    private final boolean ns;
    private final boolean suppress16K;
    private final String systemAudioCfg;
    private final TimeMachine timeMachine;
    private final Handler workingHandler;
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger s_nextAudioCaptureId = new AtomicInteger(0);
    private volatile AACAudioProvider.State _state = AACAudioProvider.State.IDLE;
    private AtomicLong _encodedConfigs = new AtomicLong(0);
    private AtomicLong _encodedDataCallbacks = new AtomicLong(0);

    /* compiled from: NativeAACCaptureAndEncode.kt */
    public final class AudioCapture extends AudioCaptureNative {
        private final int _id;
        private Boolean _prevActive;
        private final AACAudioProvider.Params params;

        public AudioCapture(AACAudioProvider.Params params) {
            super(SystemAudioConfiguration.getSystemConfig(NativeAACCaptureAndEncode.this.context, NativeAACCaptureAndEncode.this.systemAudioCfg), NativeAACCaptureAndEncode.this.microphoneType, new AudioCaptureNative.AudioEncoderParams(params.getSampleRate(), params.getChannelCount(), params.getBitrate()), NativeAACCaptureAndEncode.this.disguiseAudioShift, NativeAACCaptureAndEncode.this.context, NativeAACCaptureAndEncode.this.logFramesCaptured, NativeAACCaptureAndEncode.this.timeMachine, NativeAACCaptureAndEncode.this.emulateAudioCaptureErrorAfterMs);
            this.params = params;
            this._id = NativeAACCaptureAndEncode.s_nextAudioCaptureId.getAndIncrement();
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleEncodedData(ByteBuffer byteBuffer, long j) {
            NativeAACCaptureAndEncode.this._encodedDataCallbacks.incrementAndGet();
            if (byteBuffer.remaining() <= 0 || !isActive() || NativeAACCaptureAndEncode.this._muteMediaCallbacks) {
                return;
            }
            this.params.getConsumer().handleAACAudioFrame(byteBuffer, j, ((1024 / this.params.getChannelCount()) * 1000) / this.params.getSampleRate());
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleError(Throwable th) {
            ne7.m(NativeAACCaptureAndEncode.TAG, "AudioCaptureNative.handleError() - [" + this._id + "] t= " + th);
            if (!isActive() || NativeAACCaptureAndEncode.this._muteMediaCallbacks) {
                return;
            }
            NativeAACCaptureAndEncode.this._audioCapture = null;
            if (NativeAACCaptureAndEncode.this._state == AACAudioProvider.State.RUNNING) {
                NativeAACCaptureAndEncode.this._state = AACAudioProvider.State.IDLE;
            }
            this.params.getConsumer().handleAACStopped(AACAudioProvider.StopReason.CAPTURE_ERROR, String.valueOf(th));
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleFormatChange(ByteBuffer byteBuffer, long j) {
            NativeAACCaptureAndEncode.this._encodedConfigs.incrementAndGet();
            if (byteBuffer.remaining() <= 0 || !isActive()) {
                ne7.m(NativeAACCaptureAndEncode.TAG, "AudioCaptureNative.handleFormatChange() - [" + this._id + "] ignored codecConfig=" + r490.f(byteBuffer, true));
                return;
            }
            int i = this._id;
            String f = r490.f(byteBuffer, true);
            StringBuilder b = jr.b(i, "AudioCaptureNative.handleFormatChange() - [", "] ts= ", j);
            b.append(" codecConfig=");
            b.append(f);
            ne7.m(NativeAACCaptureAndEncode.TAG, b.toString());
            if (NativeAACCaptureAndEncode.this._muteMediaCallbacks) {
                return;
            }
            this.params.getConsumer().handleAACConfig(byteBuffer, j);
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleStopped() {
            ne7.m(NativeAACCaptureAndEncode.TAG, "AudioCaptureNative.handleStopped()");
            if (!isActive() || NativeAACCaptureAndEncode.this._muteMediaCallbacks) {
                return;
            }
            NativeAACCaptureAndEncode.this._audioCapture = null;
            if (NativeAACCaptureAndEncode.this._state == AACAudioProvider.State.RUNNING) {
                NativeAACCaptureAndEncode.this._state = AACAudioProvider.State.IDLE;
            }
            this.params.getConsumer().handleAACStopped(AACAudioProvider.StopReason.STOP, "");
        }

        public final boolean isActive() {
            boolean z = this == NativeAACCaptureAndEncode.this._audioCapture && this.params == NativeAACCaptureAndEncode.this._params;
            if (!Boolean.valueOf(z).equals(this._prevActive)) {
                ne7.m(NativeAACCaptureAndEncode.TAG, "AudioCaptureNative.isActive() - [" + this._id + "] " + this._prevActive + " -> " + z);
                this._prevActive = Boolean.valueOf(z);
            }
            return z;
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public boolean isQueueBlocked() {
            if (!isActive() || NativeAACCaptureAndEncode.this._muteMediaCallbacks) {
                return true;
            }
            return this.params.getConsumer().isAACBlocked();
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public String toString() {
            return com.vk.movika.sdk.base.model.history.b.b(this._id, X3.j.d, "] ", super.toString());
        }
    }

    /* compiled from: NativeAACCaptureAndEncode.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: NativeAACCaptureAndEncode.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AACAudioProvider.State.values().length];
            try {
                iArr[AACAudioProvider.State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AACAudioProvider.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AACAudioProvider.State.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NativeAACCaptureAndEncode(Context context, Handler handler, String str, String str2, boolean z, boolean z2, boolean z3, int i, boolean z4, TimeMachine timeMachine, long j) {
        this.context = context;
        this.workingHandler = handler;
        this.systemAudioCfg = str;
        this.microphoneType = str2;
        this.agc = z;
        this.ns = z2;
        this.suppress16K = z3;
        this.disguiseAudioShift = i;
        this.logFramesCaptured = z4;
        this.timeMachine = timeMachine;
        this.emulateAudioCaptureErrorAfterMs = j;
    }

    private final void internalStart(AACAudioProvider.Params params) {
        this._muteMediaCallbacks = false;
        this._params = params;
        AudioCapture audioCapture = new AudioCapture(params);
        audioCapture.requestVoice(false, this.agc, this.ns, this.suppress16K);
        audioCapture.setBitrate(params.getBitrate());
        this._audioCapture = audioCapture;
        audioCapture.start();
        this._state = AACAudioProvider.State.RUNNING;
    }

    private final void internalStop(AACAudioProvider.StopReason stopReason, AACAudioProvider.State state) {
        AACAudioProvider.Consumer consumer;
        if (this._state != AACAudioProvider.State.RELEASED) {
            this._state = state;
        }
        AACAudioProvider.Params params = this._params;
        this._params = null;
        AudioCapture audioCapture = this._audioCapture;
        if (audioCapture != null) {
            audioCapture.stop();
        }
        this._audioCapture = null;
        if (params == null || (consumer = params.getConsumer()) == null) {
            return;
        }
        consumer.handleAACStopped(stopReason, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$2(NativeAACCaptureAndEncode nativeAACCaptureAndEncode) {
        ne7.t(TAG, "NativeAACCaptureAndEncode.release() - in state " + nativeAACCaptureAndEncode._state);
        int i = WhenMappings.$EnumSwitchMapping$0[nativeAACCaptureAndEncode._state.ordinal()];
        if (i == 1) {
            nativeAACCaptureAndEncode._state = AACAudioProvider.State.RELEASED;
        } else if (i == 2) {
            nativeAACCaptureAndEncode.internalStop(AACAudioProvider.StopReason.RELEASED, AACAudioProvider.State.RELEASED);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(NativeAACCaptureAndEncode nativeAACCaptureAndEncode, AACAudioProvider.Params params) {
        ne7.t(TAG, "NativeAACCaptureAndEncode.start() - in state " + nativeAACCaptureAndEncode._state + " params=" + params);
        int i = WhenMappings.$EnumSwitchMapping$0[nativeAACCaptureAndEncode._state.ordinal()];
        if (i == 1) {
            nativeAACCaptureAndEncode.internalStart(params);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (epx.f(nativeAACCaptureAndEncode._params, params)) {
                return;
            }
            nativeAACCaptureAndEncode.internalStop(AACAudioProvider.StopReason.PARAMS_CHANGED, AACAudioProvider.State.IDLE);
            nativeAACCaptureAndEncode.internalStart(params);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(NativeAACCaptureAndEncode nativeAACCaptureAndEncode) {
        ne7.t(TAG, "NativeAACCaptureAndEncode.stop() - in state " + nativeAACCaptureAndEncode._state);
        int i = WhenMappings.$EnumSwitchMapping$0[nativeAACCaptureAndEncode._state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                nativeAACCaptureAndEncode.internalStop(AACAudioProvider.StopReason.STOP, AACAudioProvider.State.IDLE);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // ru.ok.media.api.AACAudioProvider
    public AACAudioProvider.Params getCurrentParams() {
        return this._params;
    }

    @Override // ru.ok.media.api.AACAudioProvider
    public String getDebugString() {
        String str;
        AudioCapture audioCapture = this._audioCapture;
        AACAudioProvider.Params params = this._params;
        AACAudioProvider.State state = this._state;
        if (audioCapture != null) {
            str = audioCapture.isActive() ? " active" : " inactive";
        } else {
            str = " cfgs: " + this._encodedConfigs + " dcb: " + this._encodedDataCallbacks;
        }
        return "AAC: " + state + " params: " + params + "\n" + audioCapture + str;
    }

    @Override // ru.ok.media.api.AACAudioProvider
    public AACAudioProvider.State getState() {
        return this._state;
    }

    @Override // ru.ok.media.api.AACAudioProvider
    public void release() {
        this._muteMediaCallbacks = true;
        this.workingHandler.post(new tv9(this, 7));
    }

    @Override // ru.ok.media.api.AACAudioProvider
    public void start(AACAudioProvider.Params params) {
        this.workingHandler.post(new a0m(2, this, params));
    }

    @Override // ru.ok.media.api.AACAudioProvider
    public void stop() {
        this._muteMediaCallbacks = true;
        this.workingHandler.post(new o1(this, 11));
    }
}
