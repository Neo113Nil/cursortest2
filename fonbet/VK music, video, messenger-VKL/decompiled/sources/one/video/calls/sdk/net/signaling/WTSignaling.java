package one.video.calls.sdk.net.signaling;

import android.annotation.TargetApi;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.X509TrustManager;
import one.video.calls.sdk.net.signaling.wt.nal.NAL;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk_private.wts.a;
import one.video.calls.sdk_private.wts.b;
import one.video.calls.sdk_private.wts.c;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingStat;
import ru.ok.android.webrtc.signaling.api.SignalingTransportBuilder;
import ru.ok.android.webrtc.signaling.api.TransportType;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.wyg0;
import xsna.zcl;

/* compiled from: r8-map-id-b60fecdec90728a8a3a0c07eda950c1720c8e7dcb79a20187f93a68f412a0d42 */
@TargetApi(26)
/* loaded from: classes8.dex */
public final class WTSignaling extends SignalingTransport {
    public static final Companion Companion = new Companion(null);
    private static final String TRANSPORT_TAG = "WebTransportNetworking";
    private final NAL nal;
    private NALSocket socket;

    /* compiled from: r8-map-id-b60fecdec90728a8a3a0c07eda950c1720c8e7dcb79a20187f93a68f412a0d42 */
    @TargetApi(26)
    public static final class Builder extends SignalingTransportBuilder<Builder> {
        private SignalingTransport.FallbackParams fallbackParams;
        private boolean isDataCompressionEnabled = true;

        public final Builder setDataCompressionEnabled(boolean z) {
            this.isDataCompressionEnabled = z;
            return this;
        }

        public final Builder setFallbackParams(SignalingTransport.FallbackParams fallbackParams) {
            this.fallbackParams = fallbackParams;
            return this;
        }

        @Override // ru.ok.android.webrtc.signaling.api.SignalingTransportBuilder
        public WTSignaling build() {
            Objects.requireNonNull(getSignalingStat(), "Signaling statistics is required");
            Objects.requireNonNull(getExecutor(), "executor is required");
            Objects.requireNonNull(getLog(), "log is required");
            Objects.requireNonNull(getTimeProvider(), "time provider is required");
            Objects.requireNonNull(getLogConfiguration(), "log configuration is required");
            Objects.requireNonNull(getEndpointParameters(), "endpoint parameters are required");
            long timeoutMS = getTimeoutMS();
            Signaling.ConnectFailureListener connectFailureListener = getConnectFailureListener();
            SignalingStat signalingStat = getSignalingStat();
            ExecutorService executor = getExecutor();
            RTCLog log = getLog();
            RTCLogConfiguration logConfiguration = getLogConfiguration();
            long serverPingTimeoutMs = getServerPingTimeoutMs();
            boolean isFastRecoverEnabled = isFastRecoverEnabled();
            EndpointParameters endpointParameters = getEndpointParameters();
            boolean isReplaceParametersInEndpointEnabled = isReplaceParametersInEndpointEnabled();
            TimeProvider timeProvider = getTimeProvider();
            SignalingTransport.FallbackParams fallbackParams = this.fallbackParams;
            SignalingTransport.Timeouts timeouts = getTimeouts();
            boolean isSummaryStatsEnabled = isSummaryStatsEnabled();
            boolean isSignalingLogThrottlingEnabled = isSignalingLogThrottlingEnabled();
            boolean isUseOfIPEnabled = isUseOfIPEnabled();
            boolean isSNIEnabled = isSNIEnabled();
            getSslProvider();
            WTSignaling wTSignaling = new WTSignaling(timeoutMS, connectFailureListener, signalingStat, executor, log, logConfiguration, serverPingTimeoutMs, isFastRecoverEnabled, endpointParameters, isReplaceParametersInEndpointEnabled, timeProvider, fallbackParams, timeouts, isSummaryStatsEnabled, isSignalingLogThrottlingEnabled, isUseOfIPEnabled, isSNIEnabled, null, getPeerIdGenerator(), null);
            wTSignaling.init();
            return wTSignaling;
        }
    }

    /* compiled from: r8-map-id-b60fecdec90728a8a3a0c07eda950c1720c8e7dcb79a20187f93a68f412a0d42 */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String getDefaultCompression() {
            return NALSocket.Companion.getCOMPRESSION_NAME();
        }

        public final boolean isAvailable() {
            return true;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDefaultCompression$annotations() {
        }

        public static /* synthetic */ void isAvailable$annotations() {
        }
    }

    public /* synthetic */ WTSignaling(long j, Signaling.ConnectFailureListener connectFailureListener, SignalingStat signalingStat, ExecutorService executorService, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, long j2, boolean z, EndpointParameters endpointParameters, boolean z2, TimeProvider timeProvider, SignalingTransport.FallbackParams fallbackParams, SignalingTransport.Timeouts timeouts, boolean z3, boolean z4, boolean z5, boolean z6, wyg0 wyg0Var, gzs gzsVar, zcl zclVar) {
        this(j, connectFailureListener, signalingStat, executorService, rTCLog, rTCLogConfiguration, j2, z, endpointParameters, z2, timeProvider, fallbackParams, timeouts, z3, z4, z5, z6, wyg0Var, gzsVar);
    }

    public static final String getDefaultCompression() {
        return Companion.getDefaultCompression();
    }

    public static final boolean isAvailable() {
        return Companion.isAvailable();
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public boolean isFallbackSupported() {
        return true;
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public boolean safelyCloseSocketWithCodeAndReason(int i, String str) {
        NALSocket nALSocket = this.socket;
        this.socket = null;
        if (nALSocket == null) {
            return false;
        }
        nALSocket.close(i, str);
        return true;
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public void safelyCreateNewSocket(String str, String str2, SignalingTransport.SocketListener socketListener) {
        NAL nal = this.nal;
        if (!isSNIEnabled()) {
            str2 = null;
        }
        this.socket = nal.createSocket(str, str2, new c(socketListener));
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public void safelyDoIfSocketExists(izs<? super String, s3q0> izsVar) {
        NALSocket nALSocket = this.socket;
        if (nALSocket != null) {
            izsVar.invoke(nALSocket.getId());
        }
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public void safelyResetSocketReference() {
        try {
            NALSocket nALSocket = this.socket;
            if (nALSocket != null) {
                nALSocket.close(0, "");
            }
        } catch (Throwable th) {
            getLog().reportException(TRANSPORT_TAG, "Can't close socket by reference reset request", new IllegalStateException("Error on close before reset", th));
        }
        this.socket = null;
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public boolean safelySendSocketMessage(String str) {
        NALSocket nALSocket = this.socket;
        if (nALSocket == null) {
            return false;
        }
        nALSocket.send(str);
        return true;
    }

    private WTSignaling(long j, Signaling.ConnectFailureListener connectFailureListener, SignalingStat signalingStat, ExecutorService executorService, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, long j2, boolean z, EndpointParameters endpointParameters, boolean z2, TimeProvider timeProvider, SignalingTransport.FallbackParams fallbackParams, SignalingTransport.Timeouts timeouts, boolean z3, boolean z4, boolean z5, boolean z6, wyg0 wyg0Var, gzs<Long> gzsVar) {
        super(TransportType.WT.INSTANCE, j, connectFailureListener, signalingStat, executorService, rTCLog, rTCLogConfiguration, j2, z, endpointParameters, z2, new SignalingStat.SignalingType(CallEventualStatName.WT_RESTART, CallEventualStatName.WT_CONNECTED, CallEventualStatName.WT_RECONNECTED, CallEventualStatName.WT_FAILED_PINGS, CallEventualStatName.WT_FAILED_EXCEPTION, CallEventualStatName.WT_TIMEOUT), timeProvider, z3, z4, fallbackParams, timeouts, z5, z6, wyg0Var, gzsVar);
        long connectTimeout;
        a aVar = new a(this);
        Long l = null;
        X509TrustManager a = wyg0Var != null ? wyg0Var.a() : null;
        if (fallbackParams == null) {
            connectTimeout = timeouts != null ? timeouts.getConnectTimeout() : connectTimeout;
            this.nal = new NAL(aVar, l, a, new b(rTCLog));
        }
        connectTimeout = fallbackParams.getConnectTimeout();
        l = Long.valueOf(connectTimeout);
        this.nal = new NAL(aVar, l, a, new b(rTCLog));
    }
}
