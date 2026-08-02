package one.video.calls.sdk.net.signaling;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import okhttp3.o;
import okhttp3.p;
import one.video.calls.sdk_private.wss.a;
import one.video.calls.sdk_private.wss.b;
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
import xsna.bpn0;
import xsna.eg1;
import xsna.gzs;
import xsna.ikk0;
import xsna.izs;
import xsna.phx0;
import xsna.s3q0;
import xsna.vhu0;
import xsna.wyg0;
import xsna.yuh;
import xsna.zcl;

/* compiled from: r8-map-id-cc4c1e6558630cf7ba5e355c7bcb3cc9779e4bdb3dccad6bc7dbe1b632974ab0 */
/* loaded from: classes8.dex */
public final class WSSignaling extends SignalingTransport {
    private final Lazy http$delegate;
    private final Lazy sniProvider$delegate;
    private phx0 socket;
    private final Lazy sslSocketFactory$delegate;
    private final Lazy trustManager$delegate;

    /* compiled from: r8-map-id-cc4c1e6558630cf7ba5e355c7bcb3cc9779e4bdb3dccad6bc7dbe1b632974ab0 */
    public static final class Builder extends SignalingTransportBuilder<Builder> {
        @Override // ru.ok.android.webrtc.signaling.api.SignalingTransportBuilder
        public WSSignaling build() {
            Objects.requireNonNull(getSignalingStat(), "Signaling statistics is required");
            Objects.requireNonNull(getExecutor(), "executor is required");
            Objects.requireNonNull(getLog(), "log is required");
            Objects.requireNonNull(getTimeProvider(), "time provider is required");
            Objects.requireNonNull(getLogConfiguration(), "log configuration is required");
            Objects.requireNonNull(getEndpointParameters(), "endpoing parameters are required");
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
            boolean isSummaryStatsEnabled = isSummaryStatsEnabled();
            boolean isSignalingLogThrottlingEnabled = isSignalingLogThrottlingEnabled();
            boolean isUseOfIPEnabled = isUseOfIPEnabled();
            boolean isSNIEnabled = isSNIEnabled();
            gzs<Long> peerIdGenerator = getPeerIdGenerator();
            getSslProvider();
            WSSignaling wSSignaling = new WSSignaling(timeoutMS, connectFailureListener, signalingStat, executor, log, logConfiguration, serverPingTimeoutMs, isFastRecoverEnabled, endpointParameters, isReplaceParametersInEndpointEnabled, timeProvider, getTimeouts(), isSummaryStatsEnabled, isSignalingLogThrottlingEnabled, isUseOfIPEnabled, isSNIEnabled, null, peerIdGenerator, null);
            wSSignaling.init();
            return wSSignaling;
        }
    }

    public /* synthetic */ WSSignaling(long j, Signaling.ConnectFailureListener connectFailureListener, SignalingStat signalingStat, ExecutorService executorService, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, long j2, boolean z, EndpointParameters endpointParameters, boolean z2, TimeProvider timeProvider, SignalingTransport.Timeouts timeouts, boolean z3, boolean z4, boolean z5, boolean z6, wyg0 wyg0Var, gzs gzsVar, zcl zclVar) {
        this(j, connectFailureListener, signalingStat, executorService, rTCLog, rTCLogConfiguration, j2, z, endpointParameters, z2, timeProvider, timeouts, z3, z4, z5, z6, wyg0Var, gzsVar);
    }

    private final o getHttp() {
        return (o) this.http$delegate.getValue();
    }

    private final a getSniProvider() {
        return (a) this.sniProvider$delegate.getValue();
    }

    private final SSLSocketFactory getSslSocketFactory() {
        return (SSLSocketFactory) this.sslSocketFactory$delegate.getValue();
    }

    private final X509TrustManager getTrustManager() {
        return (X509TrustManager) this.trustManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o http_delegate$lambda$0(SignalingTransport.Timeouts timeouts, WSSignaling wSSignaling) {
        o.a aVar = new o.a();
        aVar.c(timeouts != null ? timeouts.getConnectTimeout() : 10000L, TimeUnit.MILLISECONDS);
        SignalingTransport.HostnameVerifier hostnameVerifier = wSSignaling.getHostnameVerifier();
        if (!hostnameVerifier.equals(aVar.t)) {
            aVar.B = null;
        }
        aVar.t = hostnameVerifier;
        a sniProvider = wSSignaling.getSniProvider();
        if (sniProvider != null) {
            aVar.f(sniProvider, sniProvider.b);
        } else {
            SSLSocketFactory sslSocketFactory = wSSignaling.getSslSocketFactory();
            X509TrustManager trustManager = wSSignaling.getTrustManager();
            if (sslSocketFactory != null && trustManager != null) {
                aVar.f(sslSocketFactory, trustManager);
            }
        }
        return new o(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a sniProvider_delegate$lambda$0(boolean z, RTCLog rTCLog, WSSignaling wSSignaling) {
        if (z) {
            try {
                return new a(rTCLog, wSSignaling.getSslSocketFactory(), wSSignaling.getTrustManager());
            } catch (Throwable th) {
                wSSignaling.getSignalingLogger().logException("Can't create SNI provider", th);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SSLSocketFactory sslSocketFactory_delegate$lambda$0(wyg0 wyg0Var, WSSignaling wSSignaling) {
        SSLContext b;
        if (wyg0Var == null || (b = wyg0Var.b()) == null) {
            return null;
        }
        b.init(null, new X509TrustManager[]{wSSignaling.getTrustManager()}, null);
        return b.getSocketFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X509TrustManager trustManager_delegate$lambda$0(wyg0 wyg0Var) {
        if (wyg0Var != null) {
            return wyg0Var.a();
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public boolean safelyCloseSocketWithCodeAndReason(int i, String str) {
        phx0 phx0Var = this.socket;
        this.socket = null;
        if (phx0Var == null) {
            return false;
        }
        phx0Var.close(i, str);
        return true;
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public void safelyCreateNewSocket(String str, String str2, SignalingTransport.SocketListener socketListener) {
        p.a aVar = new p.a();
        aVar.i(str);
        p b = aVar.b();
        a sniProvider = getSniProvider();
        if (sniProvider != null) {
            sniProvider.d = str2;
        }
        this.socket = getHttp().f(b, new b(socketListener));
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public void safelyDoIfSocketExists(izs<? super String, s3q0> izsVar) {
        phx0 phx0Var = this.socket;
        if (phx0Var != null) {
            izsVar.invoke(phx0Var.request().toString());
        }
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public void safelyResetSocketReference() {
        this.socket = null;
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport
    public boolean safelySendSocketMessage(String str) {
        phx0 phx0Var = this.socket;
        if (phx0Var == null) {
            return false;
        }
        phx0Var.send(str);
        return true;
    }

    private WSSignaling(long j, Signaling.ConnectFailureListener connectFailureListener, SignalingStat signalingStat, ExecutorService executorService, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, long j2, boolean z, EndpointParameters endpointParameters, boolean z2, TimeProvider timeProvider, SignalingTransport.Timeouts timeouts, boolean z3, boolean z4, boolean z5, boolean z6, wyg0 wyg0Var, gzs<Long> gzsVar) {
        super(TransportType.WS.INSTANCE, j, connectFailureListener, signalingStat, executorService, rTCLog, rTCLogConfiguration, j2, z, endpointParameters, z2, new SignalingStat.SignalingType(CallEventualStatName.WS_RESTART, CallEventualStatName.WS_CONNECTED, CallEventualStatName.WS_RECONNECTED, CallEventualStatName.WS_FAILED_PINGS, CallEventualStatName.WS_FAILED_EXCEPTION, CallEventualStatName.WS_TIMEOUT), timeProvider, z3, z4, null, timeouts, z5, z6, wyg0Var, gzsVar, 32768, null);
        this.trustManager$delegate = new bpn0(new vhu0(2));
        this.sslSocketFactory$delegate = new bpn0(new ikk0(this, 23));
        this.sniProvider$delegate = new bpn0(new yuh(z6, rTCLog, this, 2));
        this.http$delegate = new bpn0(new eg1(22, timeouts, this));
    }
}
