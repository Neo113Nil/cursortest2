package org.webrtc;

import android.content.Context;
import android.os.Process;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.webrtc.Environment;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeDoubleArrayConsumer;
import org.webrtc.NativeLibrary;
import org.webrtc.PeerConnection;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;
import xsna.odj;

/* loaded from: classes9.dex */
public class PeerConnectionFactory {
    private static final String TAG = "PeerConnectionFactory";
    public static final String TRIAL_ENABLED = "Enabled";
    private static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";

    @Deprecated
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;

    @Nullable
    private static ThreadInfo staticNetworkThread;

    @Nullable
    private static ThreadInfo staticSignalingThread;

    @Nullable
    private static ThreadInfo staticWorkerThread;
    private long nativeFactory;

    @Nullable
    private volatile ThreadInfo networkThread;

    @Nullable
    private volatile ThreadInfo signalingThread;

    @Nullable
    private volatile ThreadInfo workerThread;

    public static class Builder {
        private AudioDecoderFactoryFactory audioDecoderFactoryFactory;

        @Nullable
        private AudioDeviceModule audioDeviceModule;
        private AudioEncoderFactoryFactory audioEncoderFactoryFactory;

        @Nullable
        private AudioProcessingFactory audioProcessingFactory;
        private Environment.Builder envBuilder;

        @Nullable
        private FecControllerFactoryFactoryInterface fecControllerFactoryFactory;

        @Nullable
        private NetEqFactoryFactory neteqFactoryFactory;

        @Nullable
        private NetworkControllerFactoryFactory networkControllerFactoryFactory;

        @Nullable
        private NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;

        @Nullable
        private Options options;

        @Nullable
        private VideoDecoderFactory videoDecoderFactory;

        @Nullable
        private VideoEncoderFactory videoEncoderFactory;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public PeerConnectionFactory createPeerConnectionFactory() {
            Environment environment;
            Context context;
            long createNative;
            PeerConnectionFactory.checkInitializeHasBeenCalled();
            Environment build = this.envBuilder.build();
            try {
                if (this.audioDeviceModule == null) {
                    this.audioDeviceModule = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext()).createAudioDeviceModule();
                }
                Context applicationContext = ContextUtils.getApplicationContext();
                Options options = this.options;
                long ref = build.ref();
                long j = this.audioDeviceModule.getNative(build.ref());
                long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
                long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
                VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
                VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
                AudioProcessingFactory audioProcessingFactory = this.audioProcessingFactory;
                if (audioProcessingFactory == null) {
                    environment = build;
                    context = applicationContext;
                    createNative = 0;
                } else {
                    environment = build;
                    context = applicationContext;
                    try {
                        createNative = audioProcessingFactory.createNative(environment.ref());
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        if (environment == null) {
                            throw th2;
                        }
                        try {
                            environment.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface = this.fecControllerFactoryFactory;
                long createNative2 = fecControllerFactoryFactoryInterface == null ? 0L : fecControllerFactoryFactoryInterface.createNative();
                NetworkControllerFactoryFactory networkControllerFactoryFactory = this.networkControllerFactoryFactory;
                long createNativeNetworkControllerFactory = networkControllerFactoryFactory == null ? 0L : networkControllerFactoryFactory.createNativeNetworkControllerFactory();
                NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory = this.networkStatePredictorFactoryFactory;
                long createNativeNetworkStatePredictorFactory = networkStatePredictorFactoryFactory == null ? 0L : networkStatePredictorFactoryFactory.createNativeNetworkStatePredictorFactory();
                NetEqFactoryFactory netEqFactoryFactory = this.neteqFactoryFactory;
                PeerConnectionFactory nativeCreatePeerConnectionFactory = PeerConnectionFactory.nativeCreatePeerConnectionFactory(context, options, ref, j, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, videoEncoderFactory, videoDecoderFactory, createNative, createNative2, createNativeNetworkControllerFactory, createNativeNetworkStatePredictorFactory, netEqFactoryFactory != null ? netEqFactoryFactory.createNativeNetEqFactory() : 0L);
                environment.close();
                return nativeCreatePeerConnectionFactory;
            } catch (Throwable th4) {
                th = th4;
                environment = build;
            }
        }

        public AudioDeviceModule getAudioDeviceModule() {
            return this.audioDeviceModule;
        }

        public Builder setAudioDecoderFactoryFactory(AudioDecoderFactoryFactory audioDecoderFactoryFactory) {
            if (audioDecoderFactoryFactory == null) {
                throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
            }
            this.audioDecoderFactoryFactory = audioDecoderFactoryFactory;
            return this;
        }

        public Builder setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
            this.audioDeviceModule = audioDeviceModule;
            return this;
        }

        public Builder setAudioEncoderFactoryFactory(AudioEncoderFactoryFactory audioEncoderFactoryFactory) {
            if (audioEncoderFactoryFactory == null) {
                throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
            }
            this.audioEncoderFactoryFactory = audioEncoderFactoryFactory;
            return this;
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory) {
            if (audioProcessingFactory == null) {
                throw new NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
            }
            this.audioProcessingFactory = audioProcessingFactory;
            return this;
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setFieldTrials(String str) {
            this.envBuilder.setFieldTrials(str);
            return this;
        }

        public Builder setNetEqFactoryFactory(NetEqFactoryFactory netEqFactoryFactory) {
            this.neteqFactoryFactory = netEqFactoryFactory;
            return this;
        }

        public Builder setNetworkControllerFactoryFactory(NetworkControllerFactoryFactory networkControllerFactoryFactory) {
            this.networkControllerFactoryFactory = networkControllerFactoryFactory;
            return this;
        }

        public Builder setNetworkStatePredictorFactoryFactory(NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory) {
            this.networkStatePredictorFactoryFactory = networkStatePredictorFactoryFactory;
            return this;
        }

        public Builder setOptions(Options options) {
            this.options = options;
            return this;
        }

        public Builder setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
            this.videoDecoderFactory = videoDecoderFactory;
            return this;
        }

        public Builder setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
            this.videoEncoderFactory = videoEncoderFactory;
            return this;
        }

        private Builder() {
            this.envBuilder = Environment.builder();
            this.audioEncoderFactoryFactory = new BuiltinAudioEncoderFactoryFactory();
            this.audioDecoderFactoryFactory = new BuiltinAudioDecoderFactoryFactory();
        }
    }

    public enum EnhancerKind {
        NONE(0),
        BASELINE(1),
        PIPELINE(2);

        private final int value;

        EnhancerKind(int i) {
            this.value = i;
        }
    }

    public static class InitializationOptions {
        final Context applicationContext;
        final boolean enableInternalTracer;
        final String fieldTrials;

        @Nullable
        Loggable loggable;

        @Nullable
        Logging.Severity loggableSeverity;
        final NativeLibraryLoader nativeLibraryLoader;
        final String nativeLibraryName;

        public static class Builder {
            private final Context applicationContext;
            private boolean enableInternalTracer;

            @Nullable
            private Loggable loggable;

            @Nullable
            private Logging.Severity loggableSeverity;
            private String fieldTrials = "";
            private NativeLibraryLoader nativeLibraryLoader = new NativeLibrary.DefaultLoader();
            private String nativeLibraryName = "jingle_peerconnection_so";

            public Builder(Context context) {
                this.applicationContext = context;
            }

            public InitializationOptions createInitializationOptions() {
                return new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity, 0);
            }

            public Builder setEnableInternalTracer(boolean z) {
                this.enableInternalTracer = z;
                return this;
            }

            public Builder setFieldTrials(String str) {
                this.fieldTrials = str;
                return this;
            }

            public Builder setInjectableLogger(Loggable loggable, Logging.Severity severity) {
                this.loggable = loggable;
                this.loggableSeverity = severity;
                return this;
            }

            public Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader) {
                this.nativeLibraryLoader = nativeLibraryLoader;
                return this;
            }

            public Builder setNativeLibraryName(String str) {
                this.nativeLibraryName = str;
                return this;
            }
        }

        public /* synthetic */ InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity, int i) {
            this(context, str, z, nativeLibraryLoader, str2, loggable, severity);
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }

        private InitializationOptions(Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader, String str2, @Nullable Loggable loggable, @Nullable Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }
    }

    public static class Options {
        public static final int ADAPTER_TYPE_ANY = 32;
        public static final int ADAPTER_TYPE_CELLULAR = 4;
        public static final int ADAPTER_TYPE_ETHERNET = 1;
        public static final int ADAPTER_TYPE_LOOPBACK = 16;
        public static final int ADAPTER_TYPE_UNKNOWN = 0;
        public static final int ADAPTER_TYPE_VPN = 8;
        public static final int ADAPTER_TYPE_WIFI = 2;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public int networkIgnoreMask;

        @CalledByNative("Options")
        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        @CalledByNative("Options")
        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        @CalledByNative("Options")
        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    public static class ThreadInfo {
        final Thread thread;
        final int tid;

        private ThreadInfo(Thread thread, int i) {
            this.thread = thread;
            this.tid = i;
        }

        public static ThreadInfo getCurrent() {
            return new ThreadInfo(Thread.currentThread(), Process.myTid());
        }
    }

    @CalledByNative
    public PeerConnectionFactory(long j) {
        checkInitializeHasBeenCalled();
        if (j == 0) {
            throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
        }
        this.nativeFactory = j;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkInitializeHasBeenCalled() {
        if (!NativeLibrary.isLoaded() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    private void checkPeerConnectionFactoryExists() {
        if (this.nativeFactory == 0) {
            throw new IllegalStateException("PeerConnectionFactory has been disposed.");
        }
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        Loggable loggable = initializationOptions.loggable;
        if (loggable != null) {
            Logging.injectLoggable(loggable, initializationOptions.loggableSeverity);
            nativeInjectLoggable(new JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
        } else {
            Logging.d(TAG, "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
            Logging.deleteInjectedLoggable();
            nativeDeleteLoggable();
        }
    }

    @Deprecated
    public static void initializeFieldTrials(String str) {
        nativeInitializeFieldTrials(str);
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    private static native void nativeClearDumpRequests(long j);

    private static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    private static native long nativeCreateAudioTrack(long j, String str, long j2);

    private static native long nativeCreateLocalMediaStream(long j, String str);

    private static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    /* JADX INFO: Access modifiers changed from: private */
    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, long j4, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j5, long j6, long j7, long j8, long j9);

    private static native long nativeCreateVideoSource(long j, boolean z, boolean z2);

    private static native long nativeCreateVideoTrack(long j, String str, long j2);

    private static native void nativeDeleteLoggable();

    private static native void nativeFreeFactory(long j);

    private static native long nativeGetNativePeerConnectionFactory(long j);

    private static native RtpCapabilities nativeGetRtpReceiverCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    private static native RtpCapabilities nativeGetRtpSenderCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    private static native void nativePrintStackTrace(int i);

    private static native void nativeSetAnimojiParams(long j, boolean z, String str, NativeDoubleArrayConsumer nativeDoubleArrayConsumer);

    private static native void nativeSetPreprocessorParams(long j, boolean z, int i, String str, int i2, int i3, int i4, int i5, int i6, boolean z2, NativeRunnable nativeRunnable);

    private static native void nativeSetTFLiteLibraryPath(long j, String str);

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j, int i, int i2);

    private static native boolean nativeStartInternalTracingCapture(String str);

    private static native void nativeStopAecDump(long j);

    private static native void nativeStopInternalTracingCapture();

    private static native void nativeSubmitDumpRequest(long j, String str, int i, int[] iArr, DumpCallback dumpCallback);

    @CalledByNative
    private void onNetworkThreadReady() {
        this.networkThread = ThreadInfo.getCurrent();
        staticNetworkThread = this.networkThread;
        Logging.d(TAG, "onNetworkThreadReady");
    }

    @CalledByNative
    private void onSignalingThreadReady() {
        this.signalingThread = ThreadInfo.getCurrent();
        staticSignalingThread = this.signalingThread;
        Logging.d(TAG, "onSignalingThreadReady");
    }

    @CalledByNative
    private void onWorkerThreadReady() {
        this.workerThread = ThreadInfo.getCurrent();
        staticWorkerThread = this.workerThread;
        Logging.d(TAG, "onWorkerThreadReady");
    }

    private static void printStackTrace(@Nullable ThreadInfo threadInfo, boolean z) {
        if (threadInfo == null) {
            return;
        }
        String name = threadInfo.thread.getName();
        StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
        if (stackTrace.length > 0) {
            Logging.w(TAG, name + " stacktrace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                Logging.w(TAG, stackTraceElement.toString());
            }
        }
        if (z) {
            Logging.w(TAG, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
            StringBuilder a = odj.a(Process.myPid(), threadInfo.tid, "pid: ", ", tid: ", ", name: ");
            a.append(name);
            a.append("  >>> WebRTC <<<");
            Logging.w(TAG, a.toString());
            nativePrintStackTrace(threadInfo.tid);
        }
    }

    @Deprecated
    public static void printStackTraces() {
        printStackTrace(staticNetworkThread, false);
        printStackTrace(staticWorkerThread, false);
        printStackTrace(staticSignalingThread, false);
    }

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    public static boolean startInternalTracingCapture(String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    public void clearDumpRequests() {
        nativeClearDumpRequests(this.nativeFactory);
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        checkPeerConnectionFactoryExists();
        return new AudioSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        checkPeerConnectionFactoryExists();
        return new AudioTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.getNativeAudioSource()));
    }

    public MediaStream createLocalMediaStream(String str) {
        checkPeerConnectionFactoryExists();
        return new MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    @Nullable
    @Deprecated
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, null);
    }

    @Nullable
    public PeerConnection createPeerConnectionInternal(PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, PeerConnection.Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        checkPeerConnectionFactoryExists();
        long createNativePeerConnectionObserver = PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver == 0) {
            return null;
        }
        long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver, sSLCertificateVerifier);
        if (nativeCreatePeerConnection == 0) {
            return null;
        }
        return new PeerConnection(nativeCreatePeerConnection);
    }

    public VideoSource createVideoSource(boolean z, boolean z2) {
        checkPeerConnectionFactoryExists();
        return new VideoSource(nativeCreateVideoSource(this.nativeFactory, z, z2));
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        checkPeerConnectionFactoryExists();
        return new VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.getNativeVideoTrackSource()));
    }

    public void dispose() {
        checkPeerConnectionFactoryExists();
        nativeFreeFactory(this.nativeFactory);
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
        this.nativeFactory = 0L;
    }

    public long getNativeOwnedFactoryAndThreads() {
        checkPeerConnectionFactoryExists();
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        checkPeerConnectionFactoryExists();
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public RtpCapabilities getRtpReceiverCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpReceiverCapabilities(this.nativeFactory, mediaType);
    }

    public RtpCapabilities getRtpSenderCapabilities(MediaStreamTrack.MediaType mediaType) {
        checkPeerConnectionFactoryExists();
        return nativeGetRtpSenderCapabilities(this.nativeFactory, mediaType);
    }

    public void printInternalStackTraces(boolean z) {
        printStackTrace(this.signalingThread, z);
        printStackTrace(this.workerThread, z);
        printStackTrace(this.networkThread, z);
    }

    public void setAnimojiParams(boolean z, String str, NativeDoubleArrayConsumer.Consumer consumer) {
        nativeSetAnimojiParams(this.nativeFactory, z, str, new NativeDoubleArrayConsumer(consumer));
    }

    public void setPreprocessorParams(boolean z, EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z2, Runnable runnable) {
        long j = this.nativeFactory;
        if (enhancerKind == null) {
            enhancerKind = EnhancerKind.NONE;
        }
        nativeSetPreprocessorParams(j, z, enhancerKind.value, str, i, i2, i3, i4, i5, z2, new NativeRunnable(runnable));
    }

    public void setTFLiteLibraryPath(String str) {
        nativeSetTFLiteLibraryPath(this.nativeFactory, str);
    }

    public boolean startAecDump(int i, int i2) {
        checkPeerConnectionFactoryExists();
        return nativeStartAecDump(this.nativeFactory, i, i2);
    }

    public void stopAecDump() {
        checkPeerConnectionFactoryExists();
        nativeStopAecDump(this.nativeFactory);
    }

    public void submitDumpRequest(String str, int i, @Nullable DumpCallback dumpCallback) {
        submitDumpRequest(str, i, null, dumpCallback);
    }

    @Nullable
    @Deprecated
    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, MediaConstraints mediaConstraints, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, mediaConstraints, observer);
    }

    public void submitDumpRequest(String str, int i, Set<DumpSource> set, @Nullable DumpCallback dumpCallback) {
        int[] iArr;
        if (set != null) {
            iArr = new int[set.size()];
            Iterator<DumpSource> it = set.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().key;
                i2++;
            }
        } else {
            iArr = null;
        }
        nativeSubmitDumpRequest(this.nativeFactory, str, i, iArr, dumpCallback);
    }

    public VideoSource createVideoSource(boolean z) {
        return createVideoSource(z, true);
    }

    @Nullable
    public PeerConnection createPeerConnection(List<PeerConnection.IceServer> list, PeerConnection.Observer observer) {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(list);
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        return createPeerConnection(rTCConfiguration, observer);
    }

    @Nullable
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer) {
        return createPeerConnection(rTCConfiguration, (MediaConstraints) null, observer);
    }

    @Nullable
    public PeerConnection createPeerConnection(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, null, peerConnectionDependencies.getObserver(), peerConnectionDependencies.getSSLCertificateVerifier());
    }
}
