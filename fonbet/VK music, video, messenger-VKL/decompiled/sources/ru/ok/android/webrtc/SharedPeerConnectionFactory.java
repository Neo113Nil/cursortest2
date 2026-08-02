package ru.ok.android.webrtc;

import android.content.Context;
import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderExceptionHandler;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.webrtc.PatchedVideoEncoderFactory;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.mediaadaptation.NetworkConditionProvider;
import ru.ok.android.webrtc.mediarecord.AudioFormat;
import ru.ok.android.webrtc.mediarecord.AudioMonitor;
import ru.ok.android.webrtc.mediarecord.AudioRecordCallback;
import ru.ok.android.webrtc.processing.MicListener;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.TopologyProvider;
import xsna.a2j0;
import xsna.bjn0;
import xsna.ch10;
import xsna.cy3;
import xsna.epx;
import xsna.fo8;
import xsna.fv90;
import xsna.go9;
import xsna.h73;
import xsna.hv2;
import xsna.jaj0;
import xsna.kv3;
import xsna.le9;
import xsna.mx5;
import xsna.ne9;
import xsna.o060;
import xsna.qc1;
import xsna.rc1;
import xsna.s3q0;
import xsna.sc1;
import xsna.vk9;
import xsna.vlc0;
import xsna.y63;

@CallInternalApi
/* loaded from: classes9.dex */
public final class SharedPeerConnectionFactory {
    public final ExecutorService a;
    public final RTCLog b;
    public volatile String c;
    public volatile PeerConnectionFactory d;
    public final OKDefaultVideoDecoderFactory e;
    public MicListener f;
    public JavaAudioDeviceModule g;
    public AudioMonitor h;
    public EglBase i;
    public final NetworkConditionProvider j;
    public final PatchedVideoEncoderFactory k;
    public volatile io.reactivex.rxjava3.disposables.c m;
    public y n;
    public final boolean p;
    public int l = 0;
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();

    /* renamed from: ru.ok.android.webrtc.SharedPeerConnectionFactory$1, reason: invalid class name */
    class AnonymousClass1 implements JavaAudioDeviceModule.AudioRecordErrorCallback {
        public final /* synthetic */ AudioRecordCallback a;
        public final /* synthetic */ RTCLog b;

        public AnonymousClass1(AudioRecordCallback audioRecordCallback, RTCLog rTCLog) {
            this.a = audioRecordCallback;
            this.b = rTCLog;
        }

        public final /* synthetic */ void a(String str) {
            SharedPeerConnectionFactory.this.a(str);
        }

        @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
        public void onWebRtcAudioRecordError(String str) {
            this.a.onWebRtcAudioRecordError(str);
            bjn0.b("onWebRtcAudioRecordError: ", str, this.b, "SharedPeerConnectionFac");
            this.b.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(go9.b("onWebRtcAudioRecordError ", str)));
        }

        @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
        public void onWebRtcAudioRecordInitError(String str) {
            this.a.onWebRtcAudioRecordInitError(str);
            bjn0.b("onWebRtcAudioRecordInitError: ", str, this.b, "SharedPeerConnectionFac");
            this.b.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(go9.b("onWebRtcAudioRecordInitError ", str)));
        }

        @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
        public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, final String str) {
            this.a.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
            bjn0.b("onWebRtcAudioRecordStartError: . ", str, this.b, "SharedPeerConnectionFac");
            SharedPeerConnectionFactory.this.a.execute(new Runnable() { // from class: ru.ok.android.webrtc.b0
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPeerConnectionFactory.AnonymousClass1.this.a(str);
                }
            });
        }
    }

    public interface AudioEventsListener {
        void onAudioError(AudioErrorEvent audioErrorEvent);
    }

    public SharedPeerConnectionFactory(@NonNull final Context context, @NonNull ExecutorService executorService, @NonNull final EglBase eglBase, @NonNull final RTCLog rTCLog, @NonNull final CallParams callParams, @NonNull NetworkConditionProvider networkConditionProvider, @NonNull CallEventualStatSender callEventualStatSender, final boolean z, @NonNull TopologyProvider topologyProvider, @NonNull CropAndScaleParamsProvider cropAndScaleParamsProvider, @NonNull HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        boolean z2 = false;
        this.a = executorService;
        this.b = rTCLog;
        this.j = networkConditionProvider;
        this.p = callParams.getExperiments().W();
        PatchedVideoEncoderFactory.setUpBitrateAdjusterForH265Encoder(rTCLog, callParams);
        this.e = new OKDefaultVideoDecoderFactory(eglBase.getEglBaseContext(), rTCLog, callParams);
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        if (callParams.getMediaAdaptation() != null && ((callParams.getMediaAdaptation().getP2pCallSettings() != null && callParams.getMediaAdaptation().getP2pCallSettings().isEnabled()) || (callParams.getMediaAdaptation().getGroupCallSettings() != null && callParams.getMediaAdaptation().getGroupCallSettings().isEnabled()))) {
            z2 = true;
        }
        PatchedVideoEncoderFactory patchedVideoEncoderFactory = new PatchedVideoEncoderFactory(eglBaseContext, z2, callEventualStatSender, callParams, rTCLog, topologyProvider, cropAndScaleParamsProvider, hardwareVideoEncoderExceptionHandler);
        this.k = patchedVideoEncoderFactory;
        if (networkConditionProvider != null) {
            networkConditionProvider.addEventListener(patchedVideoEncoderFactory);
        }
        rTCLog.log("SharedPeerConnectionFac", "System supports ll audio: " + z);
        executorService.execute(new Runnable() { // from class: xsna.laj0
            @Override // java.lang.Runnable
            public final void run() {
                SharedPeerConnectionFactory.this.a(context, eglBase, rTCLog, callParams, z);
            }
        });
    }

    public final void a(Context context, EglBase eglBase, RTCLog rTCLog, CallParams callParams, boolean z) {
        String str;
        ExperimentsInterface experiments = callParams.getExperiments();
        String m = experiments.m();
        StringBuilder sb = new StringBuilder();
        if (experiments.d0()) {
            sb.append("WebRTC-Audio-OpusGeneratePlc/Enabled/WebRTC-OVC-OpusMaxPlcDurationMs/200/");
        }
        qc1 o = experiments.o();
        if (o instanceof rc1) {
            sb.append("WebRTC-OVC-OpusParameterPredictor/Enabled|" + ((rc1) o).a + DomExceptionUtils.SEPARATOR);
        } else if (epx.f(o, sc1.a)) {
            sb.append("WebRTC-OVC-OpusParameterPredictor/Enabled/");
        } else {
            if (!epx.f(o, qc1.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            s3q0 s3q0Var = s3q0.a;
        }
        if (experiments.f()) {
            sb.append("WebRTC-OVC-LinearMinBitrate/Enabled/");
        }
        if (experiments.V()) {
            sb.append("WebRTC-OVC-DisableAudioProcessing/Enabled/");
        }
        if (experiments.w()) {
            sb.append("WebRTC-OVC-LogAudioCapture/Enabled/");
        }
        if (experiments.S()) {
            sb.append("WebRTC-OVC-AdaptComplexity/Enabled/");
        }
        ExperimentsInterface.a f0 = experiments.f0();
        if (f0 instanceof ExperimentsInterface.a.b) {
            sb.append("WebRTC-OVC-PathToBitrateDump/" + ((ExperimentsInterface.a.b) f0).a.replace('/', '|') + DomExceptionUtils.SEPARATOR);
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            sb2 = null;
        }
        if (m == null && sb2 == null) {
            str = null;
        } else if (m != null || sb2 == null) {
            if (m == null || sb2 != null) {
                m = fo8.a(sb2, m);
            }
            str = m;
        } else {
            str = sb2;
        }
        a(context, eglBase, rTCLog, str, callParams.getExperiments().w(), z && callParams.getExperiments().s(), callParams.getExperiments().g() || callParams.getExperiments().a0(), callParams.getExperiments().Q());
    }

    public void addEncoderFactoryListener(PatchedVideoEncoderFactory.Listener listener) {
        PatchedVideoEncoderFactory patchedVideoEncoderFactory = this.k;
        if (patchedVideoEncoderFactory != null) {
            patchedVideoEncoderFactory.addListener(listener);
        }
    }

    public final /* synthetic */ void b(boolean z) {
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.setMicrophoneMute(z);
        }
    }

    public final /* synthetic */ void c(boolean z) {
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.setNoiseSuppressorEnabled(z);
        }
    }

    public final void d(final boolean z) {
        this.a.execute(new Runnable() { // from class: xsna.kaj0
            @Override // java.lang.Runnable
            public final void run() {
                SharedPeerConnectionFactory.this.a(z);
            }
        });
    }

    public void disableHWVPX() {
        this.e.disableHWVPX();
    }

    public final void e(boolean z) {
        this.a.execute(new jaj0(this, z));
    }

    public final void f(boolean z) {
        this.a.execute(new a2j0(this, z));
    }

    public EglBase getEglBase() {
        return this.i;
    }

    @NonNull
    public ExecutorService getExecutor() {
        return this.a;
    }

    public PeerConnectionFactory getFactory() {
        return this.d;
    }

    @Nullable
    public String getLastSelectedEncoderName() {
        return this.k.getLastSelectedEncoderName();
    }

    public String getPreferredVideoCodec() {
        return this.c;
    }

    public void release() {
        this.b.log("SharedPeerConnectionFac", "release");
        this.a.execute(new hv2(this, 12));
    }

    public void removeEncoderFactoryListener(PatchedVideoEncoderFactory.Listener listener) {
        PatchedVideoEncoderFactory patchedVideoEncoderFactory = this.k;
        if (patchedVideoEncoderFactory != null) {
            patchedVideoEncoderFactory.removeListener(listener);
        }
    }

    public final void d() {
        this.a.execute(new kv3(this, 20));
    }

    public final void e() {
        this.a.execute(new vk9(this, 9));
    }

    public final /* synthetic */ void b() {
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.restartAudioRecording(false);
        }
    }

    public final void c(AudioEventsListener audioEventsListener) {
        this.a.execute(new le9(1, this, audioEventsListener));
    }

    public final void d(AudioEventsListener audioEventsListener) {
        this.a.execute(new cy3(8, this, audioEventsListener));
    }

    public final s3q0 c(AudioErrorEvent audioErrorEvent) {
        this.a.execute(new h73(6, this, audioErrorEvent));
        return s3q0.a;
    }

    public final void b(SharedLocalMediaStreamSource sharedLocalMediaStreamSource, MediaProjection mediaProjection) {
        this.a.execute(new y63(this, sharedLocalMediaStreamSource, mediaProjection, 2));
    }

    public final void b(SharedLocalMediaStreamSource sharedLocalMediaStreamSource) {
        this.a.execute(new ne9(5, this, sharedLocalMediaStreamSource));
    }

    public final void c() {
        this.b.log("SharedPeerConnectionFac", "releaseInternal");
        PeerConnectionFactory peerConnectionFactory = this.d;
        if (peerConnectionFactory != null) {
            NetworkConditionProvider networkConditionProvider = this.j;
            if (networkConditionProvider != null) {
                networkConditionProvider.removeEventListener(this.k);
            }
            peerConnectionFactory.dispose();
            this.b.log("SharedPeerConnectionFac", MiscHelper.identity2(peerConnectionFactory) + " was disposed.");
            this.d = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        AudioMonitor audioMonitor = this.h;
        if (audioMonitor != null) {
            audioMonitor.release();
            this.h = null;
        }
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.release();
            this.g = null;
        }
        y yVar = this.n;
        MicListener micListener = this.f;
        if (yVar == null || micListener == null) {
            return;
        }
        micListener.removeCallback(yVar);
    }

    public final void b(final MicSampleListener micSampleListener, final long j) {
        this.a.execute(new Runnable() { // from class: xsna.iaj0
            @Override // java.lang.Runnable
            public final void run() {
                SharedPeerConnectionFactory.this.a(micSampleListener, j);
            }
        });
    }

    public final void b(MicSampleListener micSampleListener) {
        this.a.execute(new mx5(5, this, micSampleListener));
    }

    public final /* synthetic */ void b(AudioEventsListener audioEventsListener) {
        this.o.remove(audioEventsListener);
    }

    public final /* synthetic */ void b(AudioErrorEvent audioErrorEvent) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((AudioEventsListener) it.next()).onAudioError(audioErrorEvent);
        }
    }

    public final void a(Context context, EglBase eglBase, RTCLog rTCLog, String str, boolean z, boolean z2, boolean z3, AudioFormat.Config config) {
        Integer sampleRateForAudioRecord;
        this.i = eglBase;
        rTCLog.log("SharedPeerConnectionFac", "create");
        this.c = PeerConnectionClient.VIDEO_CODEC_H264;
        rTCLog.log("SharedPeerConnectionFac", "Preferred video codec: " + this.c);
        rTCLog.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
        AudioRecordCallback audioRecordCallback = new AudioRecordCallback(rTCLog, new fv90(this, 25));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(audioRecordCallback, rTCLog);
        JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(context);
        MicListener micListener = new MicListener();
        this.f = micListener;
        JavaAudioDeviceModule.Builder useLowLatency = builder.setAudioRecordSampleHook(micListener).setAudioRecordStateCallback(audioRecordCallback).setAudioRecordErrorCallback(anonymousClass1).setAudioTrackStateCallback(audioRecordCallback).setAudioTrackErrorCallback(audioRecordCallback).setUseSilenceProviderIfMutedOnInit(PeerConnectionClient.isEarlyAudioRecordingEnabled()).setReadyToPlayModeEnabled(z3).setUseLowLatency(z2);
        if (config != null && config.isEnabled() && (sampleRateForAudioRecord = new AudioFormat(config, rTCLog).getSampleRateForAudioRecord()) != null) {
            useLowLatency.setSampleRate(sampleRateForAudioRecord.intValue());
        }
        this.g = useLowLatency.createAudioDeviceModule();
        AudioMonitor audioMonitor = new AudioMonitor(new WeakReference(context), rTCLog, this.p, new vlc0(this, 10));
        this.h = audioMonitor;
        audioMonitor.start();
        if (z) {
            MicListener micListener2 = this.f;
            y yVar = new y();
            this.n = yVar;
            micListener2.registerCallback(yVar, 0L);
        }
        if (PeerConnectionClient.isEarlyAudioRecordingEnabled()) {
            this.g.setMicrophoneMute(true);
        }
        String fieldTrials = PeerConnectionClient.getFieldTrials(str);
        rTCLog.log("SharedPeerConnectionFac", "Field trials: " + fieldTrials);
        PeerConnectionFactory.initializeFieldTrials(fieldTrials);
        this.d = PeerConnectionFactory.builder().setVideoDecoderFactory(this.e).setVideoEncoderFactory(this.k).setAudioDeviceModule(this.g).createPeerConnectionFactory();
        if (this.d != null) {
            rTCLog.log("SharedPeerConnectionFac", MiscHelper.identity2(this.d) + " was created");
            StringBuilder sb = new StringBuilder("Is VIDEO HW acceleration enabled? ");
            sb.append(MiscHelper.toYesNo(Boolean.valueOf(MiscHelper.isVideoHwAccelerationEnabled())));
            rTCLog.log("SharedPeerConnectionFac", sb.toString());
            if (!MiscHelper.isVideoHwAccelerationEnabled() || eglBase == null) {
                return;
            }
            rTCLog.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for " + MiscHelper.identity2(this.d));
            return;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ s3q0 a(AudioErrorEvent audioErrorEvent) {
        c(audioErrorEvent);
        return s3q0.a;
    }

    public final /* synthetic */ void a(boolean z) {
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.setSpeakerMute(z);
        }
    }

    public final /* synthetic */ void a() {
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.setReadyToPlay();
        }
    }

    public final /* synthetic */ void a(SharedLocalMediaStreamSource sharedLocalMediaStreamSource, MediaProjection mediaProjection) {
        sharedLocalMediaStreamSource.setScreenShareAudioRecordEnabled(true);
        this.g.startDeviceAudioShare(mediaProjection);
    }

    public final /* synthetic */ void a(SharedLocalMediaStreamSource sharedLocalMediaStreamSource) {
        sharedLocalMediaStreamSource.setScreenShareAudioRecordEnabled(false);
        this.g.stopDeviceAudioShare();
    }

    public final /* synthetic */ void a(MicSampleListener micSampleListener, long j) {
        MicListener micListener = this.f;
        if (micListener != null) {
            micListener.registerCallback(micSampleListener, j);
        }
    }

    public final /* synthetic */ void a(MicSampleListener micSampleListener) {
        MicListener micListener = this.f;
        if (micListener != null) {
            micListener.removeCallback(micSampleListener);
        }
    }

    public final /* synthetic */ void a(AudioEventsListener audioEventsListener) {
        this.o.add(audioEventsListener);
    }

    public final void a(String str) {
        if (this.d == null) {
            this.b.log("SharedPeerConnectionFac", "Already released. Ignore audio restart request");
            return;
        }
        int i = this.l;
        if (i >= 3) {
            this.b.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception("onWebRtcAudioRecordStartError(" + this.l + " attempts done) " + str));
            return;
        }
        this.l = i + 1;
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = io.reactivex.rxjava3.core.q.B0(1000L, TimeUnit.MILLISECONDS).a0(new io.reactivex.rxjava3.internal.schedulers.d(this.a, false)).subscribe(new ch10(3, this, str), new o060(this, 12));
    }

    public final /* synthetic */ void a(String str, Long l) {
        JavaAudioDeviceModule javaAudioDeviceModule = this.g;
        if (javaAudioDeviceModule == null) {
            return;
        }
        bjn0.b("Restart audio recording after error: ", str, this.b, "SharedPeerConnectionFac");
        javaAudioDeviceModule.restartAudioRecording(true);
    }

    public final /* synthetic */ void a(Throwable th) {
        this.b.reportException("SharedPeerConnectionFac", "Can't restart audio on start error", new IllegalStateException("Audio restart failed", th));
    }
}
