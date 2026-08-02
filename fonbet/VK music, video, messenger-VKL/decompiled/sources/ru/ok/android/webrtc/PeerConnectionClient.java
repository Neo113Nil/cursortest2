package ru.ok.android.webrtc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.webrtc.AddIceObserver;
import org.webrtc.AudioTrack;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.DataChannel;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RTCErrorType;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import org.webrtc.Size;
import org.webrtc.StatsObserver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.FingerprintProcessor;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.PatchedVideoEncoderFactory;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.PeerConnectionParameters;
import ru.ok.android.webrtc.PeerConnectionWebRtcParams;
import ru.ok.android.webrtc.animoji.recv.AnimojiReceiver;
import ru.ok.android.webrtc.animoji.send.AnimojiSender;
import ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior;
import ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiverImpl;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.visible.VisibleParticipants;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;
import ru.ok.android.webrtc.protocol.commands.ChangeSimulcastCommand;
import ru.ok.android.webrtc.protocol.commands.ChangeSimulcastResponse;
import ru.ok.android.webrtc.protocol.commands.RequestAsrCommand;
import ru.ok.android.webrtc.protocol.impl.commands.RtcCommandExecutorImpl;
import ru.ok.android.webrtc.protocol.impl.notifications.RtcNotificationReceiverImpl;
import ru.ok.android.webrtc.protocol.impl.serializers.RtcCommandsJsonSerializer;
import ru.ok.android.webrtc.protocol.impl.serializers.RtcCommandsMsgPackSerializer;
import ru.ok.android.webrtc.protocol.impl.serializers.RtcNotificationsMsgPackSerializer;
import ru.ok.android.webrtc.protocol.impl.transport.DataChannelRtcTransport;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.screenshare.recv.ParticipantRendererCollection;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareReceiver;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.simulcast.SimulcastConfig;
import ru.ok.android.webrtc.simulcast.SimulcastScalerImpl;
import ru.ok.android.webrtc.simulcast.SimulcastSdpProcessor;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.android.webrtc.stat.ice.IceCandidatesStatMapper;
import ru.ok.android.webrtc.stat.listener.ConnectionLogger;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;
import ru.ok.android.webrtc.stat.utils.StringExtKt;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.utils.CodecPreferenceUtils;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.IceCandidateLogger;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.PCExecutor;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.video.VideoSettingsCalculator;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.DefaultRemoteVideoTracks;
import ru.ok.android.webrtc.videotracks.ParticipantsAgnosticRemoteVideoTracks;
import ru.ok.android.webrtc.videotracks.RemoteVideoTracks;
import ru.ok.android.webrtc.videotracks.TrackVideoKeyMapper;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.at6;
import xsna.boy0;
import xsna.bt90;
import xsna.cgn;
import xsna.ch5;
import xsna.d8h;
import xsna.ds4;
import xsna.dxt;
import xsna.et90;
import xsna.f2l;
import xsna.go9;
import xsna.gp;
import xsna.h12;
import xsna.he6;
import xsna.i5s;
import xsna.jvf0;
import xsna.jx8;
import xsna.l370;
import xsna.l960;
import xsna.o63;
import xsna.od6;
import xsna.op0;
import xsna.or4;
import xsna.p31;
import xsna.pzl;
import xsna.q6x;
import xsna.qn9;
import xsna.qye;
import xsna.rj4;
import xsna.rzl;
import xsna.sc2;
import xsna.sgr;
import xsna.sl9;
import xsna.t33;
import xsna.tou;
import xsna.tw3;
import xsna.ugr;
import xsna.v9j;
import xsna.w9j;
import xsna.wc2;
import xsna.x6q;
import xsna.xqc;
import xsna.xw1;
import xsna.y57;
import xsna.yy4;

/* loaded from: classes9.dex */
public final class PeerConnectionClient implements LocalMediaStreamSource.EventListener, LocalMediaStreamSource.DataChannelScreenCaptureHolder, FingerprintProcessor.FingerprintChangedListener, PatchedVideoEncoderFactory.Listener, ParticipantRendererCollection {
    public static final int DATA_CHANNEL_SHUTDOWN_WAIT_MILLIS = 500;
    public static final String DTLS_SRTP_KEY_AGREEMENT_CONSTRAINT = "DtlsSrtpKeyAgreement";
    public static final String VIDEO_CODEC_H264 = "H264";
    public static final Pattern i0;
    public static volatile PeerConnectionParameters j0;
    public static final DefLoggable k0;
    public final ScreenshareFirstFrameStat A;
    public final IceCandidateLogger B;
    public final RtcCommandExecutorImpl C;
    public final RtcNotificationReceiverImpl D;
    public final FingerprintProcessor E;
    public final boolean F;
    public final String[] G;
    public final String[] H;
    public volatile PeerConnection I;
    public boolean J;
    public EventListener K;
    public final WeakReference L;
    public RtpSender M;
    public RtpSender N;
    public RtpSender O;
    public List P;
    public RtpSender Q;
    public LocalMediaStreamSource.LocalMediaStream S;
    public final boolean T;
    public volatile boolean V;
    public volatile boolean W;
    public boolean X;
    public volatile boolean Y;
    public final boolean a;
    public PeerVideoSettings a0;
    public final PeerConnection.IceTransportsType b;
    public final VideoSettingsCalculator b0;
    public final PeerConnection.VpnPreference c;
    public final RemoteVideoTracks c0;
    public PeerConnection.IceGatheringState currentGatheringState;
    public final ScreenshareReceiver d;
    public final ScreenCapturePermissionProvider d0;
    public boolean disableTCPCandidates;
    public final AsrOnlineReceiverImpl e;
    public final boolean e0;
    public final boolean f;
    public final jvf0 f0;
    public final boolean g;
    public final CallTimings g0;
    public final AnimojiSender h;
    public boolean h0;
    public boolean i;
    public final AnimojiReceiver j;
    public final AnimojiChannelBehavior k;
    public final RtpSenderHelper p;
    public final Integer r;
    public final SharedPeerConnectionFactory t;
    public final LocalMediaStreamSource u;
    public final ExecutorService v;
    public final PCExecutor w;
    public final RTCLog x;
    public final CallParams y;
    public final ExperimentsInterface z;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public final IceCandidatesStatMapper q = new IceCandidatesStatMapper();
    public final Handler s = new Handler(Looper.getMainLooper());
    public long iceGatheringStartTime = -1;
    public final ArrayList R = new ArrayList();
    public SimulcastConfig U = null;
    public volatile boolean Z = true;

    @CallInternalApi
    public static final class Builder {
        public ScreenCapturePermissionProvider A;
        public PeerConnection.IceTransportsType B;
        public PeerConnection.VpnPreference C;
        public Call.PeerConnectionEventListener D;
        public CallTimings E;
        public CropAndScaleParamsProvider F;
        public Integer G;
        public SharedPeerConnectionFactory a;
        public LocalMediaStreamSource b;
        public ExecutorService c;
        public CallParams d;
        public Context e;
        public RTCLog f;
        public MappingProcessor u;
        public AnimojiSender v;
        public AnimojiReceiver w;
        public ScreenshareFirstFrameStat y;
        public TimeProvider z;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;
        public boolean m = false;
        public String[] n = null;
        public String[] o = null;
        public boolean p = false;
        public boolean q = false;
        public boolean r = false;
        public boolean s = false;
        public boolean t = false;
        public AnimojiChannelBehavior x = AnimojiChannelBehavior.NONE;

        @NonNull
        public PeerConnectionClient build() {
            if (this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.u != null && this.z != null && this.E != null) {
                return new PeerConnectionClient(this);
            }
            throw new IllegalStateException("failed to build peerConnectionClient" + this.a + " " + this.b + " " + this.c + " " + this.d + " " + this.e + " " + this.f + " " + this.u + " " + this.z + " " + this.E);
        }

        public Builder setAnimojiChannelBehavior(AnimojiChannelBehavior animojiChannelBehavior) {
            this.x = animojiChannelBehavior;
            return this;
        }

        public Builder setAnimojiReceiver(AnimojiReceiver animojiReceiver) {
            this.w = animojiReceiver;
            return this;
        }

        public Builder setAnimojiSender(AnimojiSender animojiSender) {
            this.v = animojiSender;
            return this;
        }

        public Builder setAsrEnabled(boolean z) {
            this.k = z;
            return this;
        }

        public Builder setCallParams(@NonNull CallParams callParams) {
            this.d = callParams;
            return this;
        }

        public Builder setCallTimings(CallTimings callTimings) {
            this.E = callTimings;
            return this;
        }

        public Builder setCommandExecutorEnabled(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setContext(@NonNull Context context) {
            this.e = context;
            return this;
        }

        public Builder setCropAndScaleParamsProvider(CropAndScaleParamsProvider cropAndScaleParamsProvider) {
            this.F = cropAndScaleParamsProvider;
            return this;
        }

        public Builder setDataChannelAsrRecvEnabled(boolean z) {
            this.j = z;
            return this;
        }

        public Builder setDataChannelScreenshareRecvEnabled(boolean z) {
            this.i = z;
            return this;
        }

        public Builder setDataChannelScreenshareSendEnabled(boolean z) {
            this.l = z;
            return this;
        }

        public Builder setExecutor(ExecutorService executorService) {
            this.c = executorService;
            return this;
        }

        public Builder setForceRelayPolicy(boolean z) {
            this.p = z;
            return this;
        }

        public Builder setH265Prioritized(boolean z) {
            this.r = z;
            return this;
        }

        public Builder setIceCandidatesPoolSize(Integer num) {
            this.G = num;
            return this;
        }

        public Builder setIceTransportsType(PeerConnection.IceTransportsType iceTransportsType) {
            this.B = iceTransportsType;
            return this;
        }

        public Builder setLocalMediaStreamSource(LocalMediaStreamSource localMediaStreamSource) {
            this.b = localMediaStreamSource;
            return this;
        }

        public Builder setMappingProcessor(MappingProcessor mappingProcessor) {
            this.u = mappingProcessor;
            return this;
        }

        public Builder setNonOpusRemovalEnabled(boolean z) {
            this.s = z;
            return this;
        }

        public Builder setNotificationsReceiverEnabled(boolean z) {
            this.h = z;
            return this;
        }

        public Builder setPeerConnectionEventListener(Call.PeerConnectionEventListener peerConnectionEventListener) {
            this.D = peerConnectionEventListener;
            return this;
        }

        public Builder setRtcLog(@NonNull RTCLog rTCLog) {
            this.f = rTCLog;
            return this;
        }

        public Builder setScreenCapturePermissionProvider(ScreenCapturePermissionProvider screenCapturePermissionProvider) {
            this.A = screenCapturePermissionProvider;
            return this;
        }

        public Builder setScreenshareFirstFrameStat(ScreenshareFirstFrameStat screenshareFirstFrameStat) {
            this.y = screenshareFirstFrameStat;
            return this;
        }

        public Builder setSharedPeerConnectionFactory(SharedPeerConnectionFactory sharedPeerConnectionFactory) {
            this.a = sharedPeerConnectionFactory;
            return this;
        }

        public Builder setSimulcastEnabled(boolean z) {
            this.t = z;
            return this;
        }

        public Builder setTimeProvider(TimeProvider timeProvider) {
            this.z = timeProvider;
            return this;
        }

        public Builder setVideoTracksCountEnabled(boolean z) {
            this.q = z;
            return this;
        }

        public Builder setVpnPreference(PeerConnection.VpnPreference vpnPreference) {
            this.C = vpnPreference;
            return this;
        }

        public Builder setWebRTCAudioCodecs(String[] strArr) {
            this.n = strArr;
            return this;
        }

        public Builder setWebRTCCodecFilteringEnabled(boolean z) {
            this.m = z;
            return this;
        }

        public Builder setWebRTCVideoCodecs(String[] strArr) {
            this.o = strArr;
            return this;
        }
    }

    public static class DefLoggable implements Loggable {
        public WeakReference a;

        @Override // org.webrtc.Loggable
        public void onLogMessage(String str, Logging.Severity severity, String str2) {
            RTCLog rTCLog;
            WeakReference weakReference = this.a;
            if (weakReference == null || str == null || str2 == null || (rTCLog = (RTCLog) weakReference.get()) == null) {
                return;
            }
            rTCLog.log(str2, str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Schema {
        public static final int RECEIVE = 2;
        public static final int SEND = 1;
        public static final int SEND_RECEIVE = 0;
    }

    static {
        Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
        i0 = Pattern.compile("^a=animoji:(\\d+)", 8);
        j0 = null;
        k0 = new DefLoggable();
    }

    public PeerConnectionClient(Builder builder) {
        CallParams callParams;
        Context applicationContext = builder.e.getApplicationContext();
        RTCLog rTCLog = builder.f;
        this.x = rTCLog;
        this.g0 = builder.E;
        CallParams callParams2 = builder.d;
        this.y = callParams2;
        ExperimentsInterface experiments = callParams2.getExperiments();
        this.z = experiments;
        this.p = new RtpSenderHelper(builder.F, rTCLog);
        this.T = builder.t;
        SharedPeerConnectionFactory sharedPeerConnectionFactory = builder.a;
        this.t = sharedPeerConnectionFactory;
        ExecutorService executor = sharedPeerConnectionFactory != null ? sharedPeerConnectionFactory.getExecutor() : builder.c;
        this.v = executor;
        this.F = builder.m;
        this.G = builder.n;
        this.H = builder.o;
        this.w = executor == null ? new PCExecutor() : null;
        this.f0 = experiments.b0() == ExperimentsInterface.EmulatedIceCandidatesError.REMOTE ? new q6x() : new l370();
        this.u = builder.b;
        this.disableTCPCandidates = callParams2.getDisableTCPCandidates();
        this.B = new IceCandidateLogger(rTCLog, 0);
        this.r = builder.G;
        MappingProcessor mappingProcessor = builder.u;
        if (builder.D != null) {
            this.L = new WeakReference(builder.D);
        }
        if (builder.g) {
            this.C = new RtcCommandExecutorImpl.Builder().setSerializer(callParams2.getProducerCommandDataChannelVersion() == 3 ? new RtcCommandsMsgPackSerializer(mappingProcessor) : new RtcCommandsJsonSerializer()).setLog(rTCLog).build();
        } else {
            this.C = null;
        }
        if (builder.h) {
            this.D = new RtcNotificationReceiverImpl.Builder().setSerializer(new RtcNotificationsMsgPackSerializer(mappingProcessor, rTCLog)).setLog(rTCLog).build();
        } else {
            this.D = null;
        }
        Future submit = (executor == null || sharedPeerConnectionFactory == null) ? null : executor.submit(new bt90(sharedPeerConnectionFactory, 0));
        if (!builder.i || submit == null) {
            this.d = null;
        } else {
            this.d = new ScreenshareReceiver(builder.f, mappingProcessor, submit, this, builder.z);
        }
        if (builder.j) {
            this.e = new AsrOnlineReceiverImpl(mappingProcessor);
        } else {
            this.e = null;
        }
        this.i = builder.k;
        this.E = new FingerprintProcessor(this);
        this.b = builder.B;
        this.c = builder.C;
        this.a = builder.p;
        this.g = builder.r;
        this.f = builder.s;
        if (builder.q) {
            callParams = callParams2;
            this.c0 = new ParticipantsAgnosticRemoteVideoTracks(new r(this), rTCLog, d(), mappingProcessor, callParams);
        } else {
            callParams = callParams2;
            this.c0 = new DefaultRemoteVideoTracks(new r(this), rTCLog, d(), mappingProcessor, callParams);
        }
        this.h = builder.v;
        this.j = builder.w;
        this.k = builder.x;
        this.A = builder.y;
        if (sharedPeerConnectionFactory != null) {
            sharedPeerConnectionFactory.addEncoderFactoryListener(this);
        }
        this.b0 = new VideoSettingsCalculator(sharedPeerConnectionFactory, applicationContext, callParams, rTCLog, new SimulcastScalerImpl(builder.F));
        this.d0 = builder.A;
        this.e0 = builder.l;
        rTCLog.log("PeerConnectionClient", "client created");
    }

    public static /* synthetic */ EglBase.Context a(SharedPeerConnectionFactory sharedPeerConnectionFactory) {
        EglBase eglBase = sharedPeerConnectionFactory.getEglBase();
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public static String getFieldTrials(String str) {
        return (j0 == null ? new PeerConnectionWebRtcParams.Builder().build() : j0.getWebRtcParams()).getFieldTrialsAsString(str);
    }

    public static void init(@NonNull Context context, @Nullable PeerConnectionParameters peerConnectionParameters, @Nullable NativeLibraryLoader nativeLibraryLoader) {
        if (j0 == null) {
            if (peerConnectionParameters == null) {
                peerConnectionParameters = new PeerConnectionParameters.Builder().build();
            }
            RTCLog logger = peerConnectionParameters.getLogger();
            if (logger != null) {
                DefLoggable defLoggable = k0;
                defLoggable.getClass();
                defLoggable.a = new WeakReference(logger);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(k0, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
            j0 = peerConnectionParameters;
        }
    }

    public static boolean isEarlyAudioRecordingEnabled() {
        return (j0 == null ? new PeerConnectionWebRtcParams.Builder().build() : j0.getWebRtcParams()).isEarlyAudioRecordingEnabled();
    }

    public void addRemoteIceCandidate(@NonNull IceCandidate iceCandidate) {
        final IceCandidate l = this.f0.l(iceCandidate);
        this.x.log("PeerConnectionClient", "addRemoteIceCandidate, " + this);
        a("addRemoteIceCandidate", new u(this, new Consumer() { // from class: xsna.it90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(l, (PeerConnection) obj);
            }
        }));
    }

    public void applyMediaSettings(MutableMediaSettings mutableMediaSettings) {
        boolean isScreenCaptureEnabled = mutableMediaSettings.isScreenCaptureEnabled();
        if (isScreenCaptureEnabled != this.X) {
            ScreenCapturePermissionProvider screenCapturePermissionProvider = this.d0;
            if (screenCapturePermissionProvider == null) {
                this.x.reportException("PeerConnectionClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
            } else {
                this.X = isScreenCaptureEnabled;
                a("screenCaptureEnable", new boy0(this, mutableMediaSettings, screenCapturePermissionProvider, 4));
            }
        }
    }

    public void assertPCExecutorThread() {
        PCExecutor pCExecutor = this.w;
        if ((pCExecutor == null || !pCExecutor.isExecuterThread()) && this.v == null) {
            this.s.post(new xw1(new RuntimeException(), 10));
        }
    }

    public final /* synthetic */ void b(String str) {
        this.s.post(new tou(3, this, str));
    }

    public final void c() {
        this.x.log("PeerConnectionClient", "createPeerConnectionInternal, " + this);
        if (this.J) {
            this.x.log("PeerConnectionClient", this + ": fatal error occurred");
            return;
        }
        PeerConnectionFactory factory = this.t.getFactory();
        if (factory == null) {
            this.x.log("PeerConnectionClient", this + ": no peer connection factory");
            return;
        }
        PeerConnection.RTCConfiguration a = a(this.P);
        assertPCExecutorThread();
        final ConnectionLogger connectionLogger = new ConnectionLogger(this.x);
        this.x.log("PeerConnectionClient", "create PC");
        this.I = factory.createPeerConnection(a, new PeerConnection.Observer() { // from class: ru.ok.android.webrtc.PeerConnectionClient.2
            @Override // org.webrtc.PeerConnection.Observer
            public void onAddStream(MediaStream mediaStream) {
                PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                peerConnectionClient.x.log("PeerConnectionClient", "handlePeerConnectionAddStream, " + peerConnectionClient + ", stream =" + MiscHelper.identity2(mediaStream) + ", video tracks=" + MiscHelper.identity((List<?>) mediaStream.videoTracks));
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
                PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                peerConnectionClient.x.log("PeerConnectionClient", "handlePeerConnectionAddTrack, " + peerConnectionClient + ", receiver=" + rtpReceiver + ", streams=" + MiscHelper.identity((Object[]) mediaStreamArr));
                peerConnectionClient.a(rtpReceiver);
                peerConnectionClient.c0.handleVideoTracks(rtpReceiver, mediaStreamArr);
                peerConnectionClient.a(mediaStreamArr);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
                PeerConnectionClient.this.a(peerConnectionState);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onDataChannel(DataChannel dataChannel) {
                PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                peerConnectionClient.getClass();
                if (DataChannels.ANIMOJI.equals(dataChannel.label()) && peerConnectionClient.k == AnimojiChannelBehavior.EXPECT_SENDRECV) {
                    DataChannelRtcTransport dataChannelRtcTransport = new DataChannelRtcTransport(dataChannel, peerConnectionClient.x);
                    AnimojiReceiver animojiReceiver = peerConnectionClient.j;
                    if (animojiReceiver != null) {
                        animojiReceiver.setTransport(dataChannelRtcTransport);
                    }
                    AnimojiSender animojiSender = peerConnectionClient.h;
                    if (animojiSender != null) {
                        animojiSender.setTransport(dataChannelRtcTransport);
                    }
                }
                peerConnectionClient.x.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + DomExceptionUtils.SEPARATOR + dataChannel.id());
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onIceCandidate(IceCandidate iceCandidate) {
                PeerConnectionClient.this.a(iceCandidate);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent) {
                PeerConnectionClient.this.a(iceCandidateErrorEvent);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
                PeerConnectionClient.this.a(iceCandidateArr);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
                PeerConnectionClient.this.a(iceConnectionState);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onIceConnectionReceivingChange(boolean z) {
                PeerConnectionClient.this.getClass();
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
                PeerConnectionClient.this.a(iceGatheringState);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onRemoveStream(MediaStream mediaStream) {
                PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                peerConnectionClient.x.log("PeerConnectionClient", "handlePeerConnectionRemoveStream, " + peerConnectionClient + ", stream=" + MiscHelper.identity2(mediaStream));
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onRenegotiationNeeded() {
                PeerConnectionClient.this.f();
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
                connectionLogger.onSelectedCandidatePairChanged(candidatePairChangeEvent);
                PeerConnectionClient.this.a(candidatePairChangeEvent);
            }

            @Override // org.webrtc.PeerConnection.Observer
            public void onSignalingChange(PeerConnection.SignalingState signalingState) {
                PeerConnectionClient.this.a(signalingState);
            }
        });
        if (this.I == null) {
            throw new IllegalStateException("peerconnection is null");
        }
        LocalMediaStreamSource.LocalMediaStream mediaStream = this.u.getMediaStream();
        this.S = mediaStream;
        if (mediaStream != null) {
            this.x.log("PeerConnectionClient", this + ": has " + MiscHelper.identity2(this.S));
            Size cameraVideoSize = this.S.getCameraVideoSize();
            this.n = cameraVideoSize.width;
            this.o = cameraVideoSize.height;
            this.m = this.S.getScreenShareVideoHeight();
            this.l = this.S.getScreenShareVideoWidth();
            this.b0.setCameraHeight(this.o);
            this.b0.setCameraWidth(this.n);
            this.b0.setScreenShareHeight(this.S.getScreenShareVideoHeight());
            this.b0.setScreenShareWidth(this.S.getScreenShareVideoWidth());
            if (this.T) {
                PeerConnection peerConnection = this.I;
                LocalMediaStreamSource.LocalMediaStream localMediaStream = this.S;
                List<String> singletonList = Collections.singletonList(localMediaStream.getStreamId());
                AudioTrack audioTrack = localMediaStream.getAudioTrack();
                if (audioTrack != null) {
                    this.N = this.p.setUpAudioSender(peerConnection.addTrack(audioTrack, singletonList));
                }
                c(peerConnection);
                this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this.N) + "(audio) created");
            } else {
                PeerConnection peerConnection2 = this.I;
                LocalMediaStreamSource.LocalMediaStream localMediaStream2 = this.S;
                List<String> singletonList2 = Collections.singletonList(localMediaStream2.getStreamId());
                AudioTrack audioTrack2 = localMediaStream2.getAudioTrack();
                if (audioTrack2 != null) {
                    this.N = this.p.setUpAudioSender(peerConnection2.addTrack(audioTrack2, singletonList2));
                }
                c(peerConnection2);
                this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this.N) + "(audio) created");
                a(this.I, this.S);
            }
            l();
            this.S.addEventListener(this);
            if (this.e0) {
                this.S.initDataChannelScreenShareSender(this, a(DataChannels.SCREENSHARE_SEND, new DataChannel.Init()));
            }
        }
        if (this.C != null) {
            this.C.setTransport(a(DataChannels.PRODUCER_COMMAND, new DataChannel.Init()));
        }
        if (this.D != null) {
            this.D.setTransport(a(DataChannels.PRODUCER_NOTIFICATIONS, new DataChannel.Init()));
        }
        ScreenshareReceiver screenshareReceiver = this.d;
        if (screenshareReceiver != null) {
            screenshareReceiver.setTransport(a(DataChannels.SCREENSHARE_RECV, new DataChannel.Init()));
        }
        if (this.e != null) {
            this.e.setTransport(a(DataChannels.ASR, new DataChannel.Init()));
        }
        AnimojiChannelBehavior animojiChannelBehavior = this.k;
        if (animojiChannelBehavior == AnimojiChannelBehavior.CREATE_SENDRECV || animojiChannelBehavior == AnimojiChannelBehavior.CREATE_FIXED_ID) {
            DataChannel.Init init = new DataChannel.Init();
            if (this.k == AnimojiChannelBehavior.CREATE_FIXED_ID) {
                init.id = 1;
                init.negotiated = true;
            }
            DataChannelRtcTransport a2 = a(DataChannels.ANIMOJI, init);
            AnimojiSender animojiSender = this.h;
            if (animojiSender != null) {
                animojiSender.setTransport(a2);
            }
            AnimojiReceiver animojiReceiver = this.j;
            if (animojiReceiver != null) {
                animojiReceiver.setTransport(a2);
            }
        }
        this.x.log("PeerConnectionClient", this + ": peer connection created");
    }

    public void clearRemoteVideoRenderers() {
        this.c0.clearRemoteVideoRenderers();
    }

    public void clearRemoteVideoRenderersForParticipant(String str, CallParticipant.ParticipantId participantId) {
        this.c0.clearRemoteVideoRenderersForParticipant(str, participantId);
    }

    public void close() {
        a(false);
    }

    public void createAnswer() {
        this.x.log("PeerConnectionClient", "createAnswer, " + this);
        this.g0.trace("pc.answer.requested");
        this.Z = false;
        a("createAnswer", new u(this, new Consumer() { // from class: xsna.pt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a((PeerConnection) obj);
            }
        }));
    }

    public void createOffer(final boolean z) {
        this.x.log("PeerConnectionClient", "createOffer, " + this + " iceRestart=" + z);
        if (z) {
            m();
        }
        this.Z = false;
        this.g0.trace("pc.offer.requested");
        a("createOffer", new u(this, new Consumer() { // from class: xsna.nt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(z, (PeerConnection) obj);
            }
        }));
    }

    public void createPeerConnection(List<PeerConnection.IceServer> list) {
        if (j0 == null) {
            this.x.log("PeerConnectionClient", "Creating peer connection without initializing factory.");
            return;
        }
        if (!this.W) {
            this.g0.trace("pc.request.confirmed");
            this.W = true;
            a("createPeerConnection", new d8h(4, this, list));
        } else {
            this.x.log("PeerConnectionClient", this + ": creation of a peer connection is already scheduled");
        }
    }

    public void createPeerConnectionFactory() {
        this.I = null;
        this.J = false;
        this.M = null;
        this.N = null;
        this.O = null;
        this.Q = null;
        a("createPeerConnectionFactoryInternal", new p31(this, 15));
    }

    public final RemoteVideoTracks.Listener d() {
        return new l960(this, 2);
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.recv.ParticipantRendererCollection
    public void deliverScreenCaptureFrame(CallParticipant.ParticipantId participantId, VideoFrame videoFrame) {
        ScreenshareFirstFrameStat screenshareFirstFrameStat = this.A;
        if (screenshareFirstFrameStat != null) {
            screenshareFirstFrameStat.onScreenShareFrame(participantId, videoFrame);
        }
        this.c0.deliverScreenCaptureFrame(participantId, videoFrame);
    }

    public final Call.PeerConnectionEventListener e() {
        WeakReference weakReference = this.L;
        if (weakReference == null) {
            return null;
        }
        return (Call.PeerConnectionEventListener) weakReference.get();
    }

    public final void f() {
        this.x.log("PeerConnectionClient", "handlePeerConnectionRenegotiationNeeded, " + this);
        this.s.post(new sc2(this, 5));
    }

    public final /* synthetic */ void g() {
        this.W = false;
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionCreated(this);
        }
    }

    public AsrOnlineReceiverImpl getAsrOnlineReceiver() {
        return this.e;
    }

    @NonNull
    public RtcCommandExecutor getCommandExecutor() {
        RtcCommandExecutorImpl rtcCommandExecutorImpl = this.C;
        if (rtcCommandExecutorImpl != null) {
            return rtcCommandExecutorImpl;
        }
        throw new IllegalStateException("Command executor is not enabled");
    }

    public PeerConnection.IceConnectionState getIceConnectionState() {
        PeerConnection peerConnection = this.I;
        if (peerConnection == null) {
            return null;
        }
        try {
            return peerConnection.iceConnectionState();
        } catch (Exception e) {
            this.x.reportException("PeerConnectionClient", "pc.conn.state", e);
            return null;
        }
    }

    public long getIceGatheringStartTime() {
        return this.iceGatheringStartTime;
    }

    public RtcNotificationReceiver getNotificationReceiver() {
        RtcNotificationReceiverImpl rtcNotificationReceiverImpl = this.D;
        if (rtcNotificationReceiverImpl != null) {
            return rtcNotificationReceiverImpl;
        }
        throw new IllegalStateException("Notifications receiver is not enabled");
    }

    public Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getScreenshareRecvStats() {
        ScreenshareReceiver screenshareReceiver = this.d;
        if (screenshareReceiver == null) {
            return null;
        }
        return screenshareReceiver.getStats();
    }

    public void getStats(@NonNull final StatsObserver statsObserver) {
        a("getStats.legacy", new u(this, new Consumer() { // from class: xsna.ht90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(statsObserver, (PeerConnection) obj);
            }
        }));
    }

    @NonNull
    public TrackVideoKeyMapper getTrackVideoKeyMapper() {
        return this.c0;
    }

    public final /* synthetic */ void h() {
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionRenegotiationNeeded(this);
        }
    }

    public final /* synthetic */ void i() {
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionClientFirstDataReceived(this);
        }
    }

    public boolean isAbleToCreatePeerConnection() {
        return (this.W || this.V || this.I != null) ? false : true;
    }

    public boolean isCreationScheduled() {
        return this.W;
    }

    public boolean isReady() {
        return (this.V || this.W || this.I == null) ? false : true;
    }

    public boolean isReadyForIceCandidates() {
        return this.Y;
    }

    public boolean isSetRemoteDescriptionNeeded() {
        return this.I != null && this.I.signalingState() == PeerConnection.SignalingState.STABLE && this.I.getRemoteDescription() == null;
    }

    public boolean isStable() {
        return this.Z;
    }

    public final /* synthetic */ void j() {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onIceRestart();
        }
    }

    public final /* synthetic */ void k() {
        this.J = true;
    }

    public final void l() {
        LocalMediaStreamSource.LocalMediaStream localMediaStream = this.S;
        if (localMediaStream != null) {
            this.x.log("PeerConnectionClient", "maybeUpdateSenders, " + this + ", " + MiscHelper.identity2(localMediaStream));
            if (p() != null) {
                localMediaStream.bindTracksWith(this.N, this.M);
            }
        }
    }

    public final void m() {
        this.s.post(new o63(this, 11));
    }

    public final void n() {
        a();
        AnimojiSender animojiSender = this.h;
        if (animojiSender != null) {
            animojiSender.release();
        }
        AnimojiReceiver animojiReceiver = this.j;
        if (animojiReceiver != null) {
            animojiReceiver.release();
        }
        this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this) + " was released");
    }

    public final void o() {
        int i;
        RtpSenderHelper rtpSenderHelper = this.p;
        RtpSender rtpSender = this.M;
        int i2 = this.n;
        getCommandExecutor().execute(new ChangeSimulcastCommand(rtpSenderHelper.getSimulcastLayersInfo(rtpSender, (i2 == 0 || (i = this.o) == 0) ? new Size(VideoRecord.DEFAULT_MAX_DIMENSION, 544) : new Size(i2, i))), new op0(this, 27));
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.DataChannelScreenCaptureHolder
    public void onDataChannelScreenCapturerBound() {
        this.x.log("PeerConnectionClient", "Data channel screen capturer bound to " + this);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.DataChannelScreenCaptureHolder
    public void onDataChannelScreenCapturerUnbound() {
        this.x.log("PeerConnectionClient", "Data channel screen capturer unbound from " + this);
    }

    @Override // ru.ok.android.webrtc.FingerprintProcessor.FingerprintChangedListener
    public void onFingerprintChanged(long j) {
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionFingerprintChanged(this, j);
        }
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.EventListener
    public void onLocalMediaStreamChanged(@NonNull LocalMediaStreamSource.LocalMediaStream localMediaStream) {
        this.x.log("PeerConnectionClient", "onLocalMediaStreamChanged, " + this + " ms=" + MiscHelper.identity2(localMediaStream));
        final Size cameraVideoSize = localMediaStream.getCameraVideoSize();
        final int screenShareVideoWidth = localMediaStream.getScreenShareVideoWidth();
        final int screenShareVideoHeight = localMediaStream.getScreenShareVideoHeight();
        a("maybeUpdateSenders", new u(this, new Consumer() { // from class: xsna.st90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(cameraVideoSize, screenShareVideoWidth, screenShareVideoHeight, (PeerConnection) obj);
            }
        }));
    }

    @Override // ru.ok.android.webrtc.PatchedVideoEncoderFactory.Listener
    public void onNewCodecIsCreating(String str) {
        a("onNewCodecIsCreating", new u(this, new Consumer() { // from class: xsna.at90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.b((PeerConnection) obj);
            }
        }));
    }

    public void onVisibleSetChanged(VisibleParticipants visibleParticipants) {
        ScreenshareReceiver screenshareReceiver = this.d;
        if (screenshareReceiver != null) {
            screenshareReceiver.setVisibleParticipants(visibleParticipants);
        }
    }

    public final PeerConnection p() {
        if (this.I != null && !this.V && !this.J) {
            return this.I;
        }
        StringBuilder sb = new StringBuilder();
        if (this.I == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.J) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        if (this.V) {
            this.x.log("PeerConnectionClient", this + ": (closed) " + ((Object) sb));
            return null;
        }
        this.x.log("PeerConnectionClient", this + ": (unclosed null peer connection) " + ((Object) sb));
        return null;
    }

    public void release() {
        a(true);
    }

    public void removeRemoteIceCandidates(@NonNull final IceCandidate[] iceCandidateArr) {
        this.x.log("PeerConnectionClient", "removeRemoteIceCandidates, " + this);
        a("removeRemoteIceCandidates", new u(this, new Consumer() { // from class: xsna.gt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ((PeerConnection) obj).removeIceCandidates(iceCandidateArr);
            }
        }));
    }

    public void restartIce() {
        this.x.log("PeerConnectionClient", "restartIce, " + this);
        m();
        a("restartIce", new u(this, new et90()));
    }

    public void setAsrEnabled(boolean z) {
        this.i = z;
    }

    public void setConfig(final List<PeerConnection.IceServer> list) {
        this.x.log("PeerConnectionClient", "setConfig, servers=" + list + ", " + this);
        a("setConfig", new u(this, new Consumer() { // from class: xsna.lt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(list, (PeerConnection) obj);
            }
        }));
    }

    public void setEventListener(EventListener eventListener) {
        this.K = eventListener;
    }

    public void setIsP2PRelayEnabled(boolean z) {
        this.h0 = z;
    }

    public void setPeerVideoSettings(PeerVideoSettings peerVideoSettings) {
        if (peerVideoSettings == null || peerVideoSettings.equals(this.a0)) {
            return;
        }
        PeerVideoSettings peerVideoSettings2 = this.a0;
        final boolean z = (peerVideoSettings2 == null || Objects.equals(peerVideoSettings2.getSource(), peerVideoSettings.getSource())) ? false : true;
        this.a0 = peerVideoSettings;
        this.b0.setPeerVideoSettings(peerVideoSettings);
        this.x.log("PeerConnectionClient", "setPeerVideoSettings, " + this + " settings=" + peerVideoSettings.toString());
        a("setPeerVideoSettings", new u(this, new Consumer() { // from class: xsna.dt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.b(z, (PeerConnection) obj);
            }
        }));
    }

    public void setRemoteDescription(@NonNull final SessionDescription sessionDescription) {
        this.x.log("PeerConnectionClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.Z = false;
        this.Y = false;
        this.B.markIceStart();
        a("setRemoteDescription", new u(this, new Consumer() { // from class: xsna.mt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.b(sessionDescription, (PeerConnection) obj);
            }
        }));
    }

    public void setRemoteVideoRenderers(@NonNull String str, @NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<VideoSink> list) {
        this.c0.setRemoteVideoRenderers(str, callVideoTrackParticipantKey, list);
    }

    public String toString() {
        return MiscHelper.identity(this) + "@PeerConnection@" + MiscHelper.identity(this.I);
    }

    public void updateVideoQuality(final VideoQualityUpdate videoQualityUpdate) {
        if (videoQualityUpdate.equals(this.b0.getVideoQualityUpdateBySource(videoQualityUpdate.getSource()))) {
            return;
        }
        this.b0.setVideoQualityUpdate(videoQualityUpdate);
        this.x.log("PeerConnectionClient", "updateVideoQuality, " + this + " update=" + videoQualityUpdate);
        a("updateVideoQuality", new u(this, new Consumer() { // from class: xsna.ft90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(videoQualityUpdate, (PeerConnection) obj);
            }
        }));
    }

    public final /* synthetic */ void b(PeerConnection peerConnection) {
        b(peerConnection, false);
        a(peerConnection, false);
    }

    public final void d(SessionDescription sessionDescription) {
        FingerprintProcessor fingerprintProcessor = this.E;
        String str = sessionDescription.description;
        if (fingerprintProcessor.a) {
            fingerprintProcessor.localFp = 0L;
            fingerprintProcessor.remoteFp = 0L;
            fingerprintProcessor.a = false;
        }
        long a = FingerprintProcessor.a(str);
        fingerprintProcessor.remoteFp = a;
        long j = fingerprintProcessor.localFp;
        if (j != 0 && a != 0) {
            fingerprintProcessor.a = true;
            fingerprintProcessor.b.onFingerprintChanged(a ^ j);
        }
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionRemoteDescription(this, sessionDescription);
        }
    }

    public final /* synthetic */ void a(String str) {
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionRemoteVideoTrackAdded(this, str);
        }
    }

    public final /* synthetic */ void e(NegotiationError negotiationError) {
        a("set sdp error " + negotiationError.getMessage(), "set.sdp2");
        this.s.post(new v9j(4, this, negotiationError));
    }

    public void getStats(@NonNull final StatsCallback statsCallback) {
        a("getStats.new", new u(this, new Consumer() { // from class: xsna.jt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ((PeerConnection) obj).getStats(new zj0(StatsCallback.this, 21));
            }
        }));
    }

    public final /* synthetic */ void b(boolean z, PeerConnection peerConnection) {
        b(peerConnection, z);
        a(peerConnection, z);
    }

    public final void a(Size size, int i, int i2, PeerConnection peerConnection) {
        l();
        int i3 = size.width;
        int i4 = size.height;
        if (this.n != i3 || this.o != i4) {
            this.b0.setCameraHeight(i4);
            this.b0.setCameraWidth(i3);
            RTCLog rTCLog = this.x;
            StringBuilder sb = new StringBuilder("Camera video size changed: ");
            sb.append(this.n);
            sb.append("x");
            cgn.a(this.o, i3, " -> ", "x", sb);
            sb.append(i4);
            rTCLog.log("PeerConnectionClient", sb.toString());
            this.n = i3;
            this.o = i4;
            b(peerConnection, false);
        }
        if (this.l == i && this.m == i2) {
            return;
        }
        this.b0.setScreenShareWidth(i);
        this.b0.setScreenShareHeight(i2);
        this.l = i;
        this.m = i2;
        a(peerConnection, false);
    }

    public final void b(PeerConnection peerConnection, boolean z) {
        try {
            a(peerConnection, z, false, this.M);
        } catch (IllegalStateException e) {
            this.x.log("PeerConnectionClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            this.x.log("PeerConnectionClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void b(List list) {
        this.g0.trace("pc.request.inprogress");
        try {
            if (this.I != null) {
                this.x.log("PeerConnectionClient", toString() + ": peer connection is already created");
                return;
            }
            this.P = list;
            c();
            this.g0.trace("pc.created");
            this.s.post(new tw3(this, 16));
        } catch (Exception e) {
            this.J = true;
            this.x.reportException("PeerConnectionClient", "pc.create", e);
            throw e;
        }
    }

    public final /* synthetic */ void d(NegotiationError negotiationError) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onNegotiationError(negotiationError);
        }
    }

    /* renamed from: ru.ok.android.webrtc.PeerConnectionClient$8, reason: invalid class name */
    public class AnonymousClass8 implements AddIceObserver {
        public final /* synthetic */ IceCandidate a;

        public AnonymousClass8(IceCandidate iceCandidate) {
            this.a = iceCandidate;
        }

        public final /* synthetic */ void a(String str, RTCErrorType rTCErrorType, IceCandidate iceCandidate) {
            Call.PeerConnectionEventListener e = PeerConnectionClient.this.e();
            if (e != null) {
                e.onIceCandidateAddFailed(PeerConnectionClient.this.q.mapAddFailure(str, rTCErrorType, iceCandidate));
            }
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddFailure(final RTCErrorType rTCErrorType, final String str) {
            PeerConnectionClient.this.x.reportException("PeerConnectionClient", PeerConnectionClient.this.toString() + ": ❄️ FAILED to add remote ice candidate " + this.a + "\nreason: " + str, new Exception("add.ice.candidate.fail"));
            Handler handler = PeerConnectionClient.this.s;
            final IceCandidate iceCandidate = this.a;
            handler.post(new Runnable() { // from class: ru.ok.android.webrtc.a0
                @Override // java.lang.Runnable
                public final void run() {
                    PeerConnectionClient.AnonymousClass8.this.a(str, rTCErrorType, iceCandidate);
                }
            });
        }

        @Override // org.webrtc.AddIceObserver
        public void onAddSuccess() {
        }
    }

    public final void b() {
        this.x.log("PeerConnectionClient", "createPeerConnectionFactoryInternal, " + this);
        this.J = false;
    }

    public final /* synthetic */ void b(IceCandidate iceCandidate, PeerConnection peerConnection) {
        this.g0.trace("pc.candidate " + iceCandidate.sdp);
        this.B.logCandidate(iceCandidate);
        this.R.add(iceCandidate);
        this.x.log("PeerConnectionClient", "❄ -> ice candidate: " + iceCandidate);
        this.s.post(new jx8(5, this, iceCandidate));
    }

    public final void a(PeerConnection peerConnection, boolean z) {
        try {
            a(peerConnection, z, true, this.Q);
        } catch (IllegalStateException e) {
            this.x.log("PeerConnectionClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            this.x.log("PeerConnectionClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final /* synthetic */ void b(IceCandidate iceCandidate) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onLocalCandidateCreated(iceCandidate.sdp);
        }
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionIceCandidate(this, iceCandidate);
        }
    }

    public final void a(boolean z) {
        this.V = true;
        this.Z = false;
        this.Y = false;
        this.K = null;
        this.c0.close();
        SharedPeerConnectionFactory sharedPeerConnectionFactory = this.t;
        if (sharedPeerConnectionFactory != null) {
            sharedPeerConnectionFactory.removeEncoderFactoryListener(this);
        }
        this.s.removeCallbacksAndMessages(null);
        if (z) {
            a("releaseInternal", new ds4(this, 6));
        } else {
            a("closeInternal", new wc2(this, 11));
        }
    }

    public final /* synthetic */ void b(IceCandidateErrorEvent iceCandidateErrorEvent) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onIceCandidateGatheringFailed(this.q.mapGatheringFailure(iceCandidateErrorEvent));
        }
    }

    public final /* synthetic */ void b(IceCandidate[] iceCandidateArr) {
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionIceCandidatesRemoved(this, iceCandidateArr);
        }
    }

    public final /* synthetic */ void b(PeerConnection.IceConnectionState iceConnectionState) {
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            a("maybeUpdateSenders", new s(this));
        }
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionIceConnectionChange(this, iceConnectionState);
        }
    }

    public final /* synthetic */ void a(VideoQualityUpdate videoQualityUpdate, PeerConnection peerConnection) {
        if (videoQualityUpdate.isForCamera()) {
            b(peerConnection, false);
        } else {
            a(peerConnection, false);
        }
    }

    public final /* synthetic */ void b(PeerConnection.IceGatheringState iceGatheringState) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onPeerConnectionIceGatheringStateChanged(iceGatheringState);
        }
    }

    public final void a(PeerConnection peerConnection, boolean z, boolean z2, RtpSender rtpSender) {
        RtpParameters.DegradationPreference degradationPreference;
        PeerVideoSettings peerVideoSettings = this.a0;
        if (peerVideoSettings == null) {
            this.x.log("PeerConnectionClient", "updatePVS(), no video settings, ignore this update");
            return;
        }
        if (z2) {
            this.b0.maybeUpdateEncodedFastScreenShareVideoSize(this.S, peerVideoSettings);
        }
        int temporalLayersCount = peerVideoSettings.getTemporalLayersCount();
        int maxFrameRate = peerVideoSettings.getMaxFrameRate();
        int maxDimension = peerVideoSettings.getMaxDimension();
        if (!z2) {
            this.b0.maybeUpdateEncodedVideoSize(this.S, maxDimension);
        }
        int bitrateVideo = this.b0.getMaxBitrates(z2).getBitrateVideo();
        if (!z2 && this.T && this.U != null) {
            if (this.p.updateVideoSenderWithSimulcast(rtpSender, z, this.b0.generateSimulcastLayers(Integer.valueOf(maxDimension), this.U, maxFrameRate, temporalLayersCount > 0 ? Integer.valueOf(temporalLayersCount) : null))) {
                o();
            }
        } else {
            RtpSenderHelper rtpSenderHelper = this.p;
            Integer valueOf = bitrateVideo > 0 ? Integer.valueOf(bitrateVideo) : null;
            Integer valueOf2 = temporalLayersCount > 0 ? Integer.valueOf(temporalLayersCount) : null;
            Integer valueOf3 = maxFrameRate > 0 ? Integer.valueOf(maxFrameRate) : null;
            String degradationPreference2 = peerVideoSettings.getDegradationPreference();
            if (z2) {
                degradationPreference = RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE;
            } else {
                if (!TextUtils.isEmpty(degradationPreference2)) {
                    String lowerCase = degradationPreference2.toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "disabled":
                            degradationPreference = RtpParameters.DegradationPreference.DISABLED;
                            break;
                        case "maintain-resolution":
                            degradationPreference = RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION;
                            break;
                        case "maintain-framerate":
                            degradationPreference = RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE;
                            break;
                    }
                }
                degradationPreference = RtpParameters.DegradationPreference.BALANCED;
            }
            rtpSenderHelper.updateVideoSender(rtpSender, z2, z, valueOf, valueOf2, valueOf3, degradationPreference);
        }
        c(peerConnection);
    }

    public final /* synthetic */ void b(MediaStream[] mediaStreamArr) {
        if (this.K != null) {
            Iterator<AudioTrack> it = mediaStreamArr[0].audioTracks.iterator();
            while (it.hasNext()) {
                this.K.onPeerConnectionAudioTrackAddEvent(this, it.next().id());
            }
        }
    }

    public final /* synthetic */ void b(PeerConnection.SignalingState signalingState) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onPeerConnectionSignalingStateChanged(signalingState);
        }
        this.Y = signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || signalingState == PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER || signalingState == PeerConnection.SignalingState.STABLE;
        boolean z = signalingState == PeerConnection.SignalingState.STABLE;
        this.Z = z;
        if (z) {
            a("maybeUpdateSenders", new t(this));
        }
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionSignalingState(this, signalingState);
        }
    }

    public final /* synthetic */ void b(CandidatePairChangeEvent candidatePairChangeEvent) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    public final /* synthetic */ void b(SessionDescription sessionDescription) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onLocalSdpCreated(sessionDescription.type);
        }
    }

    public final /* synthetic */ void b(PeerConnection.PeerConnectionState peerConnectionState) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onPeerConnectionStateChanged(peerConnectionState, this.h0);
        }
    }

    public final /* synthetic */ void b(NegotiationError negotiationError) {
        Call.PeerConnectionEventListener e = e();
        if (e != null) {
            e.onNegotiationError(negotiationError);
        }
    }

    public interface EventListener {
        void onPeerConnectionAudioTrackAddEvent(PeerConnectionClient peerConnectionClient, String str);

        void onPeerConnectionClientFirstDataReceived(PeerConnectionClient peerConnectionClient);

        void onPeerConnectionCreated(PeerConnectionClient peerConnectionClient);

        void onPeerConnectionIceCandidate(PeerConnectionClient peerConnectionClient, IceCandidate iceCandidate);

        void onPeerConnectionIceCandidatesRemoved(PeerConnectionClient peerConnectionClient, IceCandidate[] iceCandidateArr);

        void onPeerConnectionIceConnectionChange(PeerConnectionClient peerConnectionClient, PeerConnection.IceConnectionState iceConnectionState);

        void onPeerConnectionLocalDescription(PeerConnectionClient peerConnectionClient, SessionDescription sessionDescription);

        void onPeerConnectionRemoteDescription(PeerConnectionClient peerConnectionClient, SessionDescription sessionDescription);

        void onPeerConnectionRemoteVideoTrackAdded(PeerConnectionClient peerConnectionClient, String str);

        void onPeerConnectionRenegotiationNeeded(PeerConnectionClient peerConnectionClient);

        void onPeerConnectionSignalingState(PeerConnectionClient peerConnectionClient, PeerConnection.SignalingState signalingState);

        default void onPeerConnectionFingerprintChanged(PeerConnectionClient peerConnectionClient, long j) {
        }
    }

    public final void b(SessionDescription sessionDescription, PeerConnection peerConnection) {
        String group;
        String str = sessionDescription.description;
        CodecPreferenceUtils.dumpCodecs(str, false, this.x);
        final SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, a(str, false));
        if (!this.h.isVersionSpecified()) {
            Matcher matcher = i0.matcher(sessionDescription.description);
            int i = 1;
            if (matcher.find() && (group = matcher.group(1)) != null) {
                i = Integer.parseInt(group);
            }
            int animojiDataChannelVersion = this.y.getAnimojiDataChannelVersion();
            int min = Math.min(i, animojiDataChannelVersion);
            RTCLog rTCLog = this.x;
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(": set animoji protocol version: ");
            sb.append(min);
            sb.append("(local: ");
            rTCLog.log("PeerConnectionClient", rzl.a(animojiDataChannelVersion, i, ", remote: ", ")", sb));
            this.h.setVersion(min);
        }
        this.x.log("PeerConnectionClient", toString() + ": set remote sdp from " + sessionDescription.type);
        NegotiationError.Type x = this.z.x();
        if (NegotiationError.Type.isOneOfSetRemote(x) && x != null) {
            sessionDescription2 = new SessionDescription(NegotiationError.Type.mapToSdpType(x), "fake sdp");
        }
        peerConnection.setRemoteDescription(new SdpObserverAdapter() { // from class: ru.ok.android.webrtc.PeerConnectionClient.9
            @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
            public void onSetFailure(String str2) {
                PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                SessionDescription sessionDescription3 = sessionDescription2;
                peerConnectionClient.a(new NegotiationError(NegotiationError.Type.from(sessionDescription3.type, false), str2, peerConnectionClient.I.getLocalDescription(), sessionDescription3), false, sessionDescription3);
            }

            @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
            public void onSetSuccess() {
                PeerConnectionClient.this.a(sessionDescription2, false);
            }
        }, sessionDescription2);
    }

    public final /* synthetic */ void c(NegotiationError negotiationError) {
        a("create sdp error " + negotiationError.getMessage(), "create.sdp2");
        this.s.post(new ch5(1, this, negotiationError));
    }

    public final void c(SessionDescription sessionDescription) {
        FingerprintProcessor fingerprintProcessor = this.E;
        String str = sessionDescription.description;
        if (fingerprintProcessor.a) {
            fingerprintProcessor.localFp = 0L;
            fingerprintProcessor.remoteFp = 0L;
            fingerprintProcessor.a = false;
        }
        long a = FingerprintProcessor.a(str);
        fingerprintProcessor.localFp = a;
        if (a != 0) {
            long j = fingerprintProcessor.remoteFp;
            if (j != 0) {
                fingerprintProcessor.a = true;
                fingerprintProcessor.b.onFingerprintChanged(a ^ j);
            }
        }
        EventListener eventListener = this.K;
        if (eventListener != null) {
            eventListener.onPeerConnectionLocalDescription(this, sessionDescription);
        }
    }

    public final void a(PeerConnection peerConnection, LocalMediaStreamSource.LocalMediaStream localMediaStream) {
        Size size;
        int i;
        List<String> singletonList = Collections.singletonList(localMediaStream.getStreamId());
        VideoTrack cameraTrack = localMediaStream.getCameraTrack();
        if (cameraTrack == null) {
            c(peerConnection);
            this.x.log("PeerConnectionClient", this + ": no camera track, skip video sender creation");
            return;
        }
        RtpSender rtpSender = this.M;
        if (rtpSender != null && rtpSender.track() == cameraTrack) {
            c(peerConnection);
            this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this.M) + "(video) already exists, skip addTrack");
            return;
        }
        RtpSender rtpSender2 = this.M;
        if (rtpSender2 != null) {
            rtpSender2.setTrack(cameraTrack, false);
            c(peerConnection);
            this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this.M) + "(video) track replaced");
            return;
        }
        RtpSender addTrack = peerConnection.addTrack(cameraTrack, singletonList);
        if (this.T) {
            RtpSenderHelper rtpSenderHelper = this.p;
            VideoSettingsCalculator videoSettingsCalculator = this.b0;
            SimulcastConfig simulcastConfig = this.U;
            int i2 = this.n;
            if (i2 != 0 && (i = this.o) != 0) {
                size = new Size(i2, i);
            } else {
                size = new Size(VideoRecord.DEFAULT_MAX_DIMENSION, 544);
            }
            this.M = rtpSenderHelper.setUpVideoSenderWithSimulcast(addTrack, videoSettingsCalculator.generateDefaultSimulcastLayers(simulcastConfig, size));
        } else {
            this.M = this.p.setUpVideoSender(addTrack);
        }
        c(peerConnection);
        this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this.M) + "(video) created");
    }

    public final void c(PeerConnection peerConnection) {
        int audioMinBitrate = this.p.getAudioMinBitrate();
        int senderMaxBitrate = this.p.getSenderMaxBitrate(this.Q) + this.p.getSenderMaxBitrate(this.M) + this.p.getSenderMaxBitrate(this.O) + this.p.getSenderMaxBitrate(this.N);
        peerConnection.setBitrate(Integer.valueOf(audioMinBitrate), null, Integer.valueOf(senderMaxBitrate));
        this.x.log("PeerConnectionClient", sl9.c(audioMinBitrate, senderMaxBitrate, "Bitrate constraints were set to [", StringUtils.PROCESS_POSTFIX_DELIMITER, X3.j.e));
    }

    public final DataChannelRtcTransport a(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel createDataChannel = this.I.createDataChannel(str, init);
        RTCLog rTCLog = this.x;
        StringBuilder a = t33.a("DATACH create data channel: name: ", str, ", id: ");
        a.append(createDataChannel.id());
        rTCLog.log("PeerConnectionClient", a.toString());
        return new DataChannelRtcTransport(createDataChannel, this.x);
    }

    public final PeerConnection.RTCConfiguration a(List list) {
        PeerConnection.IceTransportsType iceTransportsType;
        ArrayList arrayList = new ArrayList();
        int tcpTurnCount = this.y.getTcpTurnCount();
        boolean z = this.disableTCPCandidates;
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str != null && iceServer.password != null && iceServer.username != null) {
                if (str.startsWith("turn")) {
                    if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                        arrayList.add(iceServer);
                        if (!z && tcpTurnCount > 0) {
                            arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                            tcpTurnCount--;
                        }
                        z2 = true;
                    }
                } else if (iceServer.uri.startsWith("stun")) {
                    arrayList.add(iceServer);
                    z3 = true;
                }
            } else {
                throw new NullPointerException(iceServer.toString());
            }
        }
        if (!z2 || !z3) {
            this.x.log("PeerConnectionClient", this + ": stun or turn servers are absent");
        }
        this.x.log("PeerConnectionClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        if (!z) {
            rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        } else {
            rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
        }
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        if (this.a) {
            iceTransportsType = PeerConnection.IceTransportsType.RELAY;
        } else {
            iceTransportsType = this.b;
            if (iceTransportsType == null) {
                iceTransportsType = PeerConnection.IceTransportsType.ALL;
            }
        }
        rTCConfiguration.iceTransportsType = iceTransportsType;
        this.x.log("PeerConnectionClient", "iceTransportType was set to " + rTCConfiguration.iceTransportsType);
        Integer num = this.r;
        if (num != null) {
            rTCConfiguration.iceCandidatePoolSize = num.intValue();
            this.x.log("PeerConnectionClient", "iceCandidatesPoolSize was set to " + rTCConfiguration.iceCandidatePoolSize);
        }
        PeerConnection.VpnPreference vpnPreference = this.c;
        if (vpnPreference != null) {
            rTCConfiguration.vpnPreference = vpnPreference;
        }
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.audioJitterBufferMaxPackets = 200;
        this.x.log("PeerConnectionClient", "Jitter buffer size set to " + rTCConfiguration.audioJitterBufferMaxPackets);
        return rTCConfiguration;
    }

    public final void a() {
        this.x.log("PeerConnectionClient", "closeInternal, " + this);
        this.N = null;
        this.M = null;
        this.O = null;
        this.Q = null;
        LocalMediaStreamSource.LocalMediaStream localMediaStream = this.S;
        if (localMediaStream != null) {
            localMediaStream.releaseDataChannelScreenShareSender(this);
            this.S.removeEventListener(this);
            this.S = null;
        }
        RtcCommandExecutorImpl rtcCommandExecutorImpl = this.C;
        if (rtcCommandExecutorImpl != null) {
            rtcCommandExecutorImpl.dispose(false);
        }
        RtcNotificationReceiverImpl rtcNotificationReceiverImpl = this.D;
        if (rtcNotificationReceiverImpl != null) {
            rtcNotificationReceiverImpl.dispose(false);
        }
        AsrOnlineReceiverImpl asrOnlineReceiverImpl = this.e;
        if (asrOnlineReceiverImpl != null) {
            asrOnlineReceiverImpl.release();
        }
        RtcCommandExecutorImpl rtcCommandExecutorImpl2 = this.C;
        if (rtcCommandExecutorImpl2 != null) {
            try {
                rtcCommandExecutorImpl2.awaitTermination(500L);
            } catch (InterruptedException e) {
                this.x.reportException("PeerConnectionClient", "command.exec.shutdown", e);
            }
        }
        RtcNotificationReceiverImpl rtcNotificationReceiverImpl2 = this.D;
        if (rtcNotificationReceiverImpl2 != null) {
            try {
                rtcNotificationReceiverImpl2.awaitTermination(500);
            } catch (InterruptedException e2) {
                this.x.reportException("PeerConnectionClient", "notif.recv.shutdown", e2);
            }
        }
        ScreenshareReceiver screenshareReceiver = this.d;
        if (screenshareReceiver != null) {
            screenshareReceiver.dispose();
        }
        AnimojiReceiver animojiReceiver = this.j;
        if (animojiReceiver != null) {
            animojiReceiver.clearTransport();
        }
        AnimojiSender animojiSender = this.h;
        if (animojiSender != null) {
            animojiSender.clearTransport();
        }
        AnimojiSender animojiSender2 = this.h;
        if (animojiSender2 != null) {
            animojiSender2.clearTransport();
        }
        AnimojiReceiver animojiReceiver2 = this.j;
        if (animojiReceiver2 != null) {
            animojiReceiver2.clearTransport();
        }
        if (this.I != null) {
            this.I.dispose();
            this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this.I) + " was disposed");
            this.I = null;
        }
        this.x.log("PeerConnectionClient", this + ": " + MiscHelper.identity2(this) + " was closed");
    }

    public final void a(StatsObserver statsObserver, PeerConnection peerConnection) {
        if (peerConnection.getStats(statsObserver, (MediaStreamTrack) null)) {
            return;
        }
        this.x.log("PeerConnectionClient", toString() + ": failed to get stats");
    }

    public final void a(final IceCandidate iceCandidate) {
        this.x.log("PeerConnectionClient", "handlePeerConnectionIceCandidate, " + this);
        a("onIceCandidate", new u(this, new Consumer() { // from class: xsna.rt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.b(iceCandidate, (PeerConnection) obj);
            }
        }));
    }

    public final void a(IceCandidateErrorEvent iceCandidateErrorEvent) {
        this.x.log("PeerConnectionClient", "handlePeerConnectionIceCandidateError, " + this + ", event=" + StringExtKt.asString(iceCandidateErrorEvent));
        this.s.post(new yy4(6, this, iceCandidateErrorEvent));
    }

    public final void a(final IceCandidate[] iceCandidateArr) {
        this.x.log("PeerConnectionClient", "handlePeerConnectionIceCandidatesRemoved, " + this);
        a("onIceCandidatesRemoved", new u(this, new Consumer() { // from class: xsna.kt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(iceCandidateArr, (PeerConnection) obj);
            }
        }));
    }

    public final /* synthetic */ void a(IceCandidate[] iceCandidateArr, PeerConnection peerConnection) {
        this.x.log("PeerConnectionClient", "❄ -> removed ice candidates: " + Arrays.toString(iceCandidateArr));
        this.s.post(new at6(7, this, iceCandidateArr));
    }

    public final void a(PeerConnection.IceConnectionState iceConnectionState) {
        this.x.log("PeerConnectionClient", "handlePeerConnectionIceConnectionChange, " + this + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        if (iceConnectionState == iceConnectionState2) {
            this.B.logConnection(true);
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            this.B.logConnection(false);
        }
        if (iceConnectionState == iceConnectionState2 && this.i) {
            RequestAsrCommand requestAsrCommand = new RequestAsrCommand(true);
            RtcCommandExecutorImpl rtcCommandExecutorImpl = this.C;
            if (rtcCommandExecutorImpl != null) {
                rtcCommandExecutorImpl.execute(requestAsrCommand);
            }
        }
        this.s.post(new sgr(2, this, iceConnectionState));
    }

    public final void a(final PeerConnection.IceGatheringState iceGatheringState) {
        this.x.log("PeerConnectionClient", "handlePeerConnectionIceGatheringChange, " + this + ", state=" + iceGatheringState);
        this.s.post(new dxt(3, this, iceGatheringState));
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            this.B.markGatheringStart();
        }
        a("onIceGatheringChange", new u(this, new Consumer() { // from class: xsna.qt90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(iceGatheringState, (PeerConnection) obj);
            }
        }));
    }

    public final void a(PeerConnection.IceGatheringState iceGatheringState, PeerConnection peerConnection) {
        this.currentGatheringState = iceGatheringState;
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            this.iceGatheringStartTime = SystemClock.elapsedRealtime();
        }
        if (iceGatheringState == PeerConnection.IceGatheringState.COMPLETE) {
            this.x.log("PeerConnectionClient", toString() + ": iceGatheringState=" + this.R.size() + " " + this.R);
        }
    }

    public final void a(MediaStream[] mediaStreamArr) {
        this.s.post(new x6q(4, this, mediaStreamArr));
    }

    public final void a(RtpReceiver rtpReceiver) {
        rtpReceiver.SetObserver(new rj4(this, 26));
    }

    public final /* synthetic */ void a(MediaStreamTrack.MediaType mediaType) {
        if (mediaType == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
            this.t.d();
        }
        this.s.post(new xqc(this, 7));
    }

    public final void a(PeerConnection.SignalingState signalingState) {
        this.x.log("PeerConnectionClient", "handlePeerConnectionSignalingChange, " + this + ", state=" + signalingState);
        this.s.post(new f2l(4, this, signalingState));
    }

    public final void a(CandidatePairChangeEvent candidatePairChangeEvent) {
        RTCLog rTCLog = this.x;
        StringBuilder sb = new StringBuilder("handleSelectedCandidatePairChanged, ");
        sb.append(this);
        sb.append(", event=");
        sb.append("CandidatePairChangeEvent\nlocal=" + candidatePairChangeEvent.local + "\nremote=" + candidatePairChangeEvent.remote + "\nlastDataReceivedMs=" + candidatePairChangeEvent.lastDataReceivedMs + "\nreason=" + candidatePairChangeEvent.reason + "\nestimatedDisconnectedTimeMs=" + candidatePairChangeEvent.estimatedDisconnectedTimeMs);
        rTCLog.log("PeerConnectionClient", sb.toString());
        this.s.post(new ugr(3, this, candidatePairChangeEvent));
    }

    public final void a(final SessionDescription sessionDescription) {
        this.x.log("PeerConnectionClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        this.s.post(new h12(9, this, sessionDescription));
        a("handleSdpCreateSuccess", new u(this, new Consumer() { // from class: xsna.ct90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(sessionDescription, (PeerConnection) obj);
            }
        }));
    }

    public final void a(SessionDescription sessionDescription, PeerConnection peerConnection) {
        String str;
        Size size;
        int i;
        String str2 = sessionDescription.description;
        CodecPreferenceUtils.dumpCodecs(str2, true, this.x);
        String a = a(str2, true);
        if (this.f) {
            Object[] objArr = {"opus", "red"};
            ArrayList arrayList = new ArrayList(2);
            for (int i2 = 0; i2 < 2; i2++) {
                Object obj = objArr[i2];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            if (!CodecPreferenceUtils.hasAnyCodec(a, unmodifiableList, true, this.x)) {
                this.x.reportException("PeerConnectionClient", "SDP has no 'Opus' codec; cannot remove others", new IllegalArgumentException("SDP has no 'Opus' codec; cannot remove others"));
            } else {
                a = CodecPreferenceUtils.preferCodec3(a, true, unmodifiableList, null, this.x);
            }
        }
        String preferCodec2 = CodecPreferenceUtils.preferCodec2(CodecPreferenceUtils.preferCodec2(CodecPreferenceUtils.addFmtpParam(a, "opus", "audio", "dred", "100", true, this.x), Collections.singletonList("opus"), "audio", this.x), Collections.singletonList("red"), "audio", this.x);
        if (preferCodec2.endsWith("\n")) {
            str = "";
        } else {
            str = "\r\n";
        }
        String addFmtpParam = CodecPreferenceUtils.addFmtpParam(pzl.b(preferCodec2, str, "a=animoji:2\r\n"), "opus", "audio", "usedtx", String.valueOf(1), true, this.x);
        if (this.g) {
            addFmtpParam = CodecPreferenceUtils.preferCodec2(addFmtpParam, Collections.singletonList("H265"), "video", false, this.x);
        }
        if (this.T) {
            RtpSenderHelper rtpSenderHelper = this.p;
            RtpSender rtpSender = this.M;
            String mid = this.U.getMid();
            int i3 = this.n;
            if (i3 != 0 && (i = this.o) != 0) {
                size = new Size(i3, i);
            } else {
                size = new Size(VideoRecord.DEFAULT_MAX_DIMENSION, 544);
            }
            addFmtpParam = SimulcastSdpProcessor.INSTANCE.addSimulcastLayers(addFmtpParam, rtpSenderHelper.getLocalSimulcastConfig(rtpSender, mid, size), this.x);
            o();
        }
        final SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, addFmtpParam);
        this.x.log("PeerConnectionClient", toString() + ": set local sdp from " + sessionDescription2.type);
        NegotiationError.Type x = this.z.x();
        if (NegotiationError.Type.isOneOfSetLocal(x) && x != null) {
            sessionDescription2 = new SessionDescription(NegotiationError.Type.mapToSdpType(x), "fake sdp");
        }
        peerConnection.setLocalDescription(new SdpObserverAdapter() { // from class: ru.ok.android.webrtc.PeerConnectionClient.5
            @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
            public void onSetFailure(String str3) {
                PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                SessionDescription sessionDescription3 = sessionDescription2;
                peerConnectionClient.a(new NegotiationError(NegotiationError.Type.from(sessionDescription3.type, true), str3, sessionDescription3, peerConnectionClient.I.getRemoteDescription()), true, sessionDescription3);
            }

            @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
            public void onSetSuccess() {
                PeerConnectionClient.this.a(sessionDescription2, true);
            }
        }, sessionDescription2);
    }

    public final void a(PeerConnection.PeerConnectionState peerConnectionState) {
        this.x.log("PeerConnectionClient", "handleConnectionStateChanged, " + this + " state " + peerConnectionState);
        this.s.post(new od6(4, this, peerConnectionState));
    }

    public final String a(String str, boolean z) {
        LinkedList<String> a;
        String sb;
        LinkedList<String> a2 = a(this.G);
        if (this.T && this.y.getExperiments().h() == ExperimentsInterface.SimulcastState.ONLY_SW_VP8) {
            a = a(new String[]{"VP8"});
        } else {
            a = a(this.H);
        }
        boolean z2 = this.F || (this.T && this.y.getExperiments().h() == ExperimentsInterface.SimulcastState.ONLY_SW_VP8);
        RTCLog rTCLog = this.x;
        StringBuilder c = gp.c("applyPreferCodec, local=", ", filter=", ", video=[", z, z2);
        String str2 = "null";
        if (a == null) {
            sb = "null";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : a) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(str3);
            }
            sb = sb2.toString();
        }
        c.append(sb);
        c.append("], audio=[");
        if (a2 != null) {
            StringBuilder sb3 = new StringBuilder();
            for (String str4 : a2) {
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(str4);
            }
            str2 = sb3.toString();
        }
        c.append(str2);
        c.append(X3.j.e);
        rTCLog.log("PeerConnectionClient", c.toString());
        String preferCodec3 = CodecPreferenceUtils.preferCodec3(str, z2, a2, a, this.x);
        if (!Objects.equals(str, preferCodec3)) {
            try {
                this.x.log("PeerConnectionClient", "applyPreferCodec, local=" + z + ", description before=[" + str.replace("\r\n", "\\r\\n") + X3.j.e);
                this.x.log("PeerConnectionClient", "applyPreferCodec, local=" + z + ", description after=[" + preferCodec3.replace("\r\n", "\\r\\n") + X3.j.e);
                return preferCodec3;
            } catch (Throwable th) {
                this.x.reportException("PeerConnectionClient", "applyPreferCodec, failed to log sdp difference", th);
            }
        }
        return preferCodec3;
    }

    public static LinkedList a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i < length) {
                        int codePointAt = str.codePointAt(i);
                        if (!Character.isWhitespace(codePointAt)) {
                            linkedList.add(str);
                            break;
                        }
                        i += Character.charCount(codePointAt);
                    }
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final void a(NegotiationError negotiationError) {
        this.x.log("PeerConnectionClient", "handleSdpCreateFailure, " + this + ", error=" + negotiationError.getMessage());
        a("handleSdpCreateFailure", new qn9(6, this, negotiationError));
    }

    public final void a(final SessionDescription sessionDescription, final boolean z) {
        this.x.log("PeerConnectionClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z);
        a("handleSdpSetSuccess", new u(this, new Consumer() { // from class: xsna.ot90
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                PeerConnectionClient.this.a(z, sessionDescription, (PeerConnection) obj);
            }
        }));
    }

    public final void a(boolean z, SessionDescription sessionDescription, PeerConnection peerConnection) {
        if (z) {
            this.s.post(new w9j(5, this, sessionDescription));
            return;
        }
        if (this.T) {
            this.U = SimulcastSdpProcessor.INSTANCE.parseSimulcastInfo(sessionDescription.description, this.x);
            a(this.I, this.S);
            l();
            for (RtpTransceiver rtpTransceiver : this.I.getTransceivers()) {
                if (rtpTransceiver.getSender() == this.M) {
                    rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                }
            }
        }
        this.s.post(new qye(9, this, sessionDescription));
    }

    public final /* synthetic */ void a(ChangeSimulcastCommand changeSimulcastCommand, ChangeSimulcastResponse changeSimulcastResponse) {
        this.x.log("PeerConnectionClient", "ChangeSimulcastCommand response = " + changeSimulcastResponse);
    }

    public final void a(NegotiationError negotiationError, boolean z, SessionDescription sessionDescription) {
        this.x.log("PeerConnectionClient", "handleSdpSetFailure " + sessionDescription.type + " " + z + " " + sessionDescription.description);
        this.x.reportException("PeerConnectionClient", i5s.a(new StringBuilder("set."), z ? "local" : "remote", ".sdp.failed"), new Exception(negotiationError.getMessage()));
        a("onSetFailure", new he6(4, this, negotiationError));
    }

    public final void a(boolean z, PeerConnection peerConnection) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (z) {
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
        }
        NegotiationError.Type type = NegotiationError.Type.CREATE_OFFER;
        if (type.equals(this.z.x())) {
            a(new NegotiationError(type, "emulated error", null, null));
        } else {
            peerConnection.createOffer(new SdpObserverAdapter() { // from class: ru.ok.android.webrtc.PeerConnectionClient.6
                @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
                public void onCreateFailure(String str) {
                    PeerConnectionClient.this.g0.trace("pc.offer.failed");
                    PeerConnectionClient.this.a(new NegotiationError(NegotiationError.Type.CREATE_OFFER, str, null, null));
                }

                @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                    PeerConnectionClient.this.g0.trace("pc.offer.created");
                    PeerConnectionClient.this.a(sessionDescription);
                }
            }, mediaConstraints);
        }
    }

    public final void a(PeerConnection peerConnection) {
        RtpTransceiver rtpTransceiver;
        AudioTrack audioShareTrack;
        RtpTransceiver rtpTransceiver2;
        VideoTrack screenShareTrack;
        List<RtpTransceiver> transceivers = peerConnection.getTransceivers();
        this.O = null;
        this.Q = null;
        Iterator<RtpTransceiver> it = transceivers.iterator();
        while (true) {
            if (!it.hasNext()) {
                rtpTransceiver = null;
                break;
            }
            rtpTransceiver = it.next();
            if (rtpTransceiver.getMid() != null && rtpTransceiver.getMid().contains(UcumUtils.UCUM_SECONDS) && rtpTransceiver.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                this.x.log("PeerConnectionClient", "audioShareTransceiver found");
                break;
            }
        }
        if (rtpTransceiver != null) {
            try {
                rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
            } catch (Exception e) {
                this.x.log("PeerConnectionClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
            }
            LocalMediaStreamSource.LocalMediaStream mediaStream = this.u.getMediaStream();
            if (mediaStream != null && (audioShareTrack = mediaStream.getAudioShareTrack()) != null) {
                RtpSender sender = rtpTransceiver.getSender();
                this.O = sender;
                this.p.setUpAudioShareSender(sender).setTrack(audioShareTrack, false);
                this.x.log("PeerConnectionClient", "audioShareTransceiver setTrack, trackId = " + audioShareTrack.id());
            }
        }
        Iterator<RtpTransceiver> it2 = transceivers.iterator();
        while (true) {
            if (!it2.hasNext()) {
                rtpTransceiver2 = null;
                break;
            }
            rtpTransceiver2 = it2.next();
            if (rtpTransceiver2.getMid() != null && rtpTransceiver2.getMid().contains(UcumUtils.UCUM_SECONDS) && rtpTransceiver2.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                this.x.log("PeerConnectionClient", "shareScreenTransceiver found");
                break;
            }
        }
        if (rtpTransceiver2 != null) {
            try {
                rtpTransceiver2.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
            } catch (Exception e2) {
                this.x.log("PeerConnectionClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
            }
            LocalMediaStreamSource.LocalMediaStream mediaStream2 = this.u.getMediaStream();
            if (mediaStream2 != null && (screenShareTrack = mediaStream2.getScreenShareTrack()) != null) {
                RtpSender upScreenShareSender = this.p.setUpScreenShareSender(rtpTransceiver2.getSender());
                this.Q = upScreenShareSender;
                upScreenShareSender.setTrack(screenShareTrack, false);
                this.x.log("PeerConnectionClient", "shareScreenTransceiver setTrack, trackId = " + screenShareTrack.id());
                try {
                    a(peerConnection, false, true, this.Q);
                } catch (IllegalStateException e3) {
                    this.x.log("PeerConnectionClient", "IllegalStateException, " + this + " ex=" + e3);
                } catch (Exception e4) {
                    this.x.log("PeerConnectionClient", "Exception, " + this + " ex=" + e4);
                }
            }
        }
        c(peerConnection);
        NegotiationError.Type type = NegotiationError.Type.CREATE_ANSWER;
        if (type.equals(this.z.x())) {
            a(new NegotiationError(type, "emulated error", null, this.I.getRemoteDescription()));
        } else {
            peerConnection.createAnswer(new SdpObserverAdapter() { // from class: ru.ok.android.webrtc.PeerConnectionClient.7
                @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
                public void onCreateFailure(String str) {
                    PeerConnectionClient.this.g0.trace("pc.answer.failed");
                    PeerConnectionClient peerConnectionClient = PeerConnectionClient.this;
                    peerConnectionClient.a(new NegotiationError(NegotiationError.Type.CREATE_ANSWER, str, null, peerConnectionClient.I.getRemoteDescription()));
                }

                @Override // ru.ok.android.webrtc.SdpObserverAdapter, org.webrtc.SdpObserver
                public void onCreateSuccess(SessionDescription sessionDescription) {
                    PeerConnectionClient.this.g0.trace("pc.answer.created");
                    PeerConnectionClient.this.a(sessionDescription);
                }
            }, new MediaConstraints());
        }
    }

    public final /* synthetic */ void a(IceCandidate iceCandidate, PeerConnection peerConnection) {
        peerConnection.addIceCandidate(iceCandidate, new AnonymousClass8(iceCandidate));
        this.B.markIceStart();
    }

    public final void a(String str, String str2) {
        this.x.reportException("PeerConnectionClient", y57.a("reportError, ", str, " ", str2), new Exception(go9.b("peer.connection.error.", str)));
        a("reportError", new or4(this, 8));
    }

    public final /* synthetic */ void a(List list, PeerConnection peerConnection) {
        peerConnection.setConfiguration(a(list));
    }

    public static /* synthetic */ void a(RuntimeException runtimeException) {
        throw runtimeException;
    }

    public final void a(String str, Runnable runnable) {
        ExecutorService executorService = this.v;
        if (executorService != null) {
            executorService.execute(runnable);
        } else {
            this.w.execute(str, runnable);
        }
    }

    public final /* synthetic */ void a(MutableMediaSettings mutableMediaSettings, ScreenCapturePermissionProvider screenCapturePermissionProvider) {
        LocalMediaStreamSource.LocalMediaStream mediaStream = this.u.getMediaStream();
        if (mediaStream != null) {
            mediaStream.applyFastScreenShare(mutableMediaSettings, screenCapturePermissionProvider);
            mediaStream.applyDataChannelScreenShare(mutableMediaSettings, screenCapturePermissionProvider);
        }
    }
}
