package ru.ok.android.webrtc.signaling.transport;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.ui.r0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingStat;
import ru.ok.android.webrtc.signaling.api.TransportType;
import ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter;
import ru.ok.android.webrtc.signaling.transport.exception.BadEndpointException;
import ru.ok.android.webrtc.signaling.transport.log.SignalingLogger;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.an10;
import xsna.arm0;
import xsna.bh10;
import xsna.bhz0;
import xsna.bpn0;
import xsna.cr90;
import xsna.diz0;
import xsna.e630;
import xsna.ebx;
import xsna.epx;
import xsna.fp;
import xsna.gzs;
import xsna.i0b0;
import xsna.izs;
import xsna.j5g;
import xsna.kyc;
import xsna.lhg;
import xsna.rx1;
import xsna.s3q0;
import xsna.ues;
import xsna.w3t;
import xsna.wn4;
import xsna.wt30;
import xsna.wyg0;
import xsna.zcl;

/* loaded from: classes9.dex */
public abstract class SignalingTransport implements Signaling.Transport, SignalingTransportAdapter.FallbackAwareSignalingTransport {
    public static final int CLOSE_SOCKET_CODE_DISPOSE = 1001;
    public static final int CLOSE_SOCKET_CODE_TIMEOUT = 4000;
    public static final Companion Companion = new Companion(null);
    public static final long FALLBACK_TO_OTHER_TRANSPORT_TIMEOUT = 21000;
    public static final int MSG_PING_FROM_SERVER_TIMEOUT = 2;
    public static final int MSG_RECONNECT = 1;
    public static final int MSG_REQUEST_FALLBACK = 3;
    public static final String PING = "ping";
    public static final String PONG = "pong";
    public static final long RECONNECT_DELAY_MILLIS = 2000;
    public static final long SERVER_PING_TIMEOUT_MAX = 61000;
    public static final long SERVER_PING_TIMEOUT_MIN = 11000;
    public static final String URL_TYPE_RETRY = "retry";
    public final Object A;
    public diz0 B;
    public final ReentrantLock C;
    public volatile SignalingTransportAdapter.FallbackAwareSignalingTransport.Listener D;
    public final EndpointValidator E;
    public final Pair F;
    public final List G;
    public final Lazy H;
    public final ReentrantLock I;
    public boolean J;
    public Long K;
    public final TransportType a;
    public long b;
    public final Signaling.ConnectFailureListener c;
    public final SignalingStat d;
    public final ExecutorService e;
    public final RTCLog f;
    public long g;
    public final boolean h;
    public final EndpointParameters i;
    public final boolean j;
    public final SignalingStat.SignalingType k;
    public final TimeProvider l;
    public final boolean m;
    public final FallbackParams n;
    public final Timeouts o;
    public final boolean p;
    public final wyg0 q;
    public final Handler r;
    public final Object s;
    public boolean t;
    public volatile String u;
    public volatile long v;
    public volatile long w;
    public Signaling.Transport.Listener x;
    public volatile bhz0 y;
    public final SignalingLogger z;

    public static final class FallbackParams {
        public final boolean a;
        public final Long b;
        public final boolean c;
        public final long d;

        public FallbackParams() {
            this(false, null, false, 0L, 15, null);
        }

        public static /* synthetic */ FallbackParams copy$default(FallbackParams fallbackParams, boolean z, Long l, boolean z2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = fallbackParams.a;
            }
            if ((i & 2) != 0) {
                l = fallbackParams.b;
            }
            if ((i & 4) != 0) {
                z2 = fallbackParams.c;
            }
            if ((i & 8) != 0) {
                j = fallbackParams.d;
            }
            boolean z3 = z2;
            return fallbackParams.copy(z, l, z3, j);
        }

        public final boolean component1() {
            return this.a;
        }

        public final Long component2() {
            return this.b;
        }

        public final boolean component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        public final FallbackParams copy(boolean z, Long l, boolean z2, long j) {
            return new FallbackParams(z, l, z2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FallbackParams)) {
                return false;
            }
            FallbackParams fallbackParams = (FallbackParams) obj;
            return this.a == fallbackParams.a && epx.f(this.b, fallbackParams.b) && this.c == fallbackParams.c && this.d == fallbackParams.d;
        }

        public final long getConnectTimeout() {
            return this.d;
        }

        public final boolean getEnableTimeoutBasedFallback() {
            return this.a;
        }

        public final boolean getFallbackOnAnyReconnectCase() {
            return this.c;
        }

        public final Long getTimeoutMS() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Long l = this.b;
            return Long.hashCode(this.d) + wn4.b(this.c, (hashCode + (l == null ? 0 : l.hashCode())) * 31);
        }

        public String toString() {
            return "FallbackParams(enableTimeoutBasedFallback=" + this.a + ", timeoutMS=" + this.b + ", fallbackOnAnyReconnectCase=" + this.c + ", connectTimeout=" + this.d + ")";
        }

        public FallbackParams(boolean z, Long l, boolean z2, long j) {
            this.a = z;
            this.b = l;
            this.c = z2;
            this.d = j;
        }

        public /* synthetic */ FallbackParams(boolean z, Long l, boolean z2, long j, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? 5000L : j);
        }
    }

    public interface HostnameVerifier extends javax.net.ssl.HostnameVerifier {
        boolean verify(String str, X509Certificate x509Certificate);
    }

    public static final class Timeouts {
        public final long a;
        public final long b;
        public final float c;
        public final long d;

        public Timeouts() {
            this(0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
        }

        public static /* synthetic */ Timeouts copy$default(Timeouts timeouts, long j, long j2, float f, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeouts.a;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = timeouts.b;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                f = timeouts.c;
            }
            float f2 = f;
            if ((i & 8) != 0) {
                j3 = timeouts.d;
            }
            return timeouts.copy(j4, j5, f2, j3);
        }

        public final long component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        public final float component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        public final Timeouts copy(long j, long j2, float f, long j3) {
            return new Timeouts(j, j2, f, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Timeouts)) {
                return false;
            }
            Timeouts timeouts = (Timeouts) obj;
            return this.a == timeouts.a && this.b == timeouts.b && Float.compare(this.c, timeouts.c) == 0 && this.d == timeouts.d;
        }

        public final long getConnectTimeout() {
            return this.a;
        }

        public final long getInitialReconnectDelay() {
            return this.b;
        }

        public final long getMaxReconnectDelay() {
            return this.d;
        }

        public final float getReconnectDelayScaleFactor() {
            return this.c;
        }

        public int hashCode() {
            return Long.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
        }

        public String toString() {
            long j = this.a;
            long j2 = this.b;
            float f = this.c;
            long j3 = this.d;
            StringBuilder b = fp.b(j, "Timeouts(connectTimeout=", ", initialReconnectDelay=");
            b.append(j2);
            b.append(", reconnectDelayScaleFactor=");
            b.append(f);
            return e630.c(b, ", maxReconnectDelay=", j3, ")");
        }

        public Timeouts(long j, long j2, float f, long j3) {
            this.a = j;
            this.b = j2;
            this.c = f;
            this.d = j3;
        }

        public /* synthetic */ Timeouts(long j, long j2, float f, long j3, int i, zcl zclVar) {
            this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? 2000L : j2, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? 2000L : j3);
        }
    }

    public SignalingTransport(TransportType transportType, long j, Signaling.ConnectFailureListener connectFailureListener, SignalingStat signalingStat, ExecutorService executorService, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, long j2, boolean z, EndpointParameters endpointParameters, boolean z2, SignalingStat.SignalingType signalingType, TimeProvider timeProvider, boolean z3, boolean z4, FallbackParams fallbackParams, Timeouts timeouts, boolean z5, boolean z6, wyg0 wyg0Var, gzs<Long> gzsVar) {
        this.a = transportType;
        this.b = j;
        this.c = connectFailureListener;
        this.d = signalingStat;
        this.e = executorService;
        this.f = rTCLog;
        this.g = j2;
        this.h = z;
        this.i = endpointParameters;
        this.j = z2;
        this.k = signalingType;
        this.l = timeProvider;
        this.m = z3;
        this.n = fallbackParams;
        this.o = timeouts;
        this.p = z6;
        this.s = new Object();
        this.v = timeProvider.getMsSinceBoot();
        this.y = new bhz0(null, null);
        SignalingLogger signalingLogger = new SignalingLogger(rTCLog, rTCLogConfiguration, timeProvider, transportType.getKey(), z4);
        this.z = signalingLogger;
        this.A = new Object();
        this.C = new ReentrantLock();
        this.E = new EndpointValidator();
        this.H = new bpn0(new wt30(this, 20));
        this.I = new ReentrantLock();
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalStateException("Looper thread is required to create signaling transport");
        }
        this.F = z5 ? Companion.access$getDefaultDestination(Companion, endpointParameters.getEndpointBaseUrl()) : null;
        List a = z5 ? a(endpointParameters) : EmptyList.b;
        this.G = a;
        if (gzsVar != null) {
            this.u = EndpointParametersUtilsKt.addPeerIdToEndpointIfMissing(z2 ? EndpointParametersUtilsKt.createEndpointUrlWithReplaceParameters(endpointParameters) : Companion.createEndpointUrl(endpointParameters), new r0(24, this, gzsVar), new ebx(this, 26));
        } else {
            this.u = z2 ? EndpointParametersUtilsKt.createEndpointUrlWithReplaceParameters(endpointParameters) : Companion.createEndpointUrl(endpointParameters);
        }
        if (a.size() > 1) {
            this.u = Companion.access$applyCustomDestination(Companion, this.u, a, signalingLogger);
        }
        this.r = new Handler(myLooper, new cr90(this, 1));
    }

    public static final SignalingHostnameVerifier a(SignalingTransport signalingTransport) {
        return new SignalingHostnameVerifier(new c(signalingTransport), new d(signalingTransport));
    }

    public static final String access$getOriginalEndpoint(SignalingTransport signalingTransport) {
        Pair pair = signalingTransport.F;
        if (pair != null) {
            return (String) pair.i();
        }
        return null;
    }

    public static final diz0 access$getReconnectContext(SignalingTransport signalingTransport) {
        ReentrantLock reentrantLock = signalingTransport.C;
        reentrantLock.lock();
        try {
            diz0 diz0Var = signalingTransport.B;
            if (diz0Var == null) {
                diz0Var = new diz0(signalingTransport);
                signalingTransport.B = diz0Var;
                signalingTransport.z.log("Reconnection context created");
            }
            return diz0Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void access$handleSocketFailure(SignalingTransport signalingTransport, boolean z, Throwable th) {
        signalingTransport.z.logException("handleWebSocketFailure", th);
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException)) {
            synchronized (signalingTransport.A) {
                signalingTransport.u = Companion.access$applyCustomDestination(Companion, signalingTransport.u, signalingTransport.G, signalingTransport.z);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        signalingTransport.d.onFailedByException(signalingTransport.k, th);
        signalingTransport.a(z);
    }

    public static final void access$handleSocketOpen(SignalingTransport signalingTransport) {
        signalingTransport.z.log("handleWebSocketOpen");
        signalingTransport.d.onConnected(signalingTransport.k);
        Signaling.Transport.Listener listener = signalingTransport.x;
        if (listener != null) {
            listener.onConnected();
        }
    }

    public static final void access$resetReconnectContext(SignalingTransport signalingTransport) {
        ReentrantLock reentrantLock = signalingTransport.C;
        reentrantLock.lock();
        try {
            if (signalingTransport.B != null) {
                signalingTransport.z.log("Reconnection context released");
            }
            signalingTransport.B = null;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final void access$resetReconnectDelay(SignalingTransport signalingTransport) {
        ReentrantLock reentrantLock = signalingTransport.I;
        reentrantLock.lock();
        try {
            if (signalingTransport.o != null) {
                signalingTransport.K = null;
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final void access$validateEndpoint(SignalingTransport signalingTransport) {
        if (!signalingTransport.E.isEndpointValid(signalingTransport.u)) {
            throw new BadEndpointException(signalingTransport.u);
        }
    }

    public static final void b(SignalingTransport signalingTransport, String str) {
        synchronized (signalingTransport.A) {
            try {
                if (signalingTransport.safelySendSocketMessage(str)) {
                    signalingTransport.z.logSignalingCommand(str);
                    if (signalingTransport.m) {
                        signalingTransport.d.onCommandSent(signalingTransport.k, a(str, "command"), false);
                    }
                } else {
                    signalingTransport.z.log("Socket is absent, waiting?");
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String createEndpointUrl(EndpointParameters endpointParameters) {
        return Companion.createEndpointUrl(endpointParameters);
    }

    public static final String replaceOrAppendQueryParam(String str, String str2, String str3) {
        return Companion.replaceOrAppendQueryParam(str, str2, str3);
    }

    public final void c() {
        this.z.log("reconnect requested");
        this.e.execute(new kyc(this, 7));
    }

    public final void d() {
        ReentrantLock reentrantLock = this.I;
        reentrantLock.lock();
        try {
            if (this.o == null || !this.J) {
                this.J = true;
                long a = a();
                this.z.log("submit request to reconnect in " + a + " ms");
                this.r.removeMessages(1);
                this.r.sendEmptyMessageDelayed(1, a);
                s3q0 s3q0Var = s3q0.a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void dispose() {
        this.z.log("transport.dispose");
        synchronized (this.s) {
            if (this.t) {
                return;
            }
            this.t = true;
            this.r.removeCallbacksAndMessages(null);
            this.e.execute(new rx1(this, 1));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final HostnameVerifier getHostnameVerifier() {
        return (HostnameVerifier) this.H.getValue();
    }

    public final RTCLog getLog() {
        return this.f;
    }

    public final SignalingLogger getSignalingLogger() {
        return this.z;
    }

    public final Object getSocketLock() {
        return this.A;
    }

    public final wyg0 getSslProvider() {
        return null;
    }

    public final void init() {
        a("init", true);
    }

    public boolean isFallbackSupported() {
        return false;
    }

    public final boolean isSNIEnabled() {
        return this.p;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void registerListener(Signaling.Transport.Listener listener) {
        this.x = listener;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void restart(String str, Long l) {
        if (str == null) {
            return;
        }
        this.d.onRestart(this.k);
        this.e.execute(new ues(this, str, l, 1));
    }

    public abstract boolean safelyCloseSocketWithCodeAndReason(int i, String str);

    public abstract void safelyCreateNewSocket(String str, String str2, SocketListener socketListener);

    public abstract void safelyDoIfSocketExists(izs<? super String, s3q0> izsVar);

    public abstract void safelyResetSocketReference();

    public abstract boolean safelySendSocketMessage(String str);

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void send(String str) {
        if (str == null) {
            return;
        }
        this.e.execute(new w3t(3, this, str));
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter.FallbackAwareSignalingTransport
    public void setListener(SignalingTransportAdapter.FallbackAwareSignalingTransport.Listener listener) {
        this.D = listener;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void tryReconnectNow() {
        ReentrantLock reentrantLock = this.I;
        reentrantLock.lock();
        try {
            this.z.log("check if in await reconnect state");
            if (this.J) {
                this.z.log("reconnect state confirmed. try reconnect right now");
                this.r.removeMessages(1);
                this.r.sendEmptyMessage(1);
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public TransportType type() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport
    public void updateActivityTimeout(long j) {
        this.b = Math.max(Math.max(j / 2, j - 60000), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
        if (this.g > 0) {
            this.g = Math.max(Math.min(j / 4, SERVER_PING_TIMEOUT_MAX), SERVER_PING_TIMEOUT_MIN);
        }
        SignalingLogger signalingLogger = this.z;
        long j2 = this.b;
        long j3 = this.g;
        StringBuilder b = fp.b(j2, "updateTimeoutMS timeoutMS=", " serverPingTimeoutMs=");
        b.append(j3);
        signalingLogger.log(b.toString());
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public static String a(String str, List list, SignalingLogger signalingLogger) {
            String uri = EndpointParametersUtilsKt.applyCustomAuthority(Uri.parse(str), list).toString();
            signalingLogger.log("Provide new endpoint " + uri + "\ninstead of " + str);
            return uri;
        }

        public static final /* synthetic */ String access$applyCustomDestination(Companion companion, String str, List list, SignalingLogger signalingLogger) {
            companion.getClass();
            return a(str, list, signalingLogger);
        }

        public static final String access$copyEndpointWithRecoverTs(Companion companion, String str, long j) {
            if (j > 0) {
                return companion.replaceOrAppendQueryParam(str, EndpointParameters.Name.RECOVER_TS, String.valueOf(j));
            }
            companion.getClass();
            return str;
        }

        public static final String access$copyEndpointWithTgt(Companion companion, String str, String str2) {
            return companion.replaceOrAppendQueryParam(str, EndpointParameters.Name.TGT, str2);
        }

        public static final String access$copyEndpointWithToken(Companion companion, String str, String str2) {
            return companion.replaceOrAppendQueryParam(str, "token", str2);
        }

        public static final String access$copyEndpointWithUserId(Companion companion, String str, String str2) {
            return companion.replaceOrAppendQueryParam(str, "userId", str2);
        }

        public static final /* synthetic */ String access$fillEndpointParams(Companion companion, Uri.Builder builder, EndpointParameters endpointParameters) {
            companion.getClass();
            return a(builder, endpointParameters);
        }

        public static final Pair access$getDefaultDestination(Companion companion, String str) {
            companion.getClass();
            try {
                Uri parse = Uri.parse(str);
                return new Pair(parse.getHost(), Integer.valueOf(parse.getPort()));
            } catch (Throwable unused) {
                return null;
            }
        }

        public final String createEndpointUrl(EndpointParameters endpointParameters) {
            Uri.Builder buildUpon = Uri.parse(endpointParameters.getEndpointBaseUrl()).buildUpon();
            String userId = endpointParameters.getUserId();
            if (userId != null) {
                buildUpon.appendQueryParameter("userId", userId);
            }
            buildUpon.appendQueryParameter("token", endpointParameters.getToken()).appendQueryParameter("conversationId", endpointParameters.getConversationId());
            if (endpointParameters.getProtocolVersion() >= 6) {
                buildUpon.appendQueryParameter("deviceIdx", String.valueOf(endpointParameters.getDeviceIndex()));
            }
            Long peerId = endpointParameters.getPeerId();
            if (peerId != null) {
                buildUpon.appendQueryParameter("peerId", String.valueOf(peerId.longValue()));
            }
            Locale locale = endpointParameters.getLocale();
            if (locale != null) {
                buildUpon.appendQueryParameter("locale", locale.getLanguage());
            }
            if (endpointParameters.getRecoverTs() > 0) {
                buildUpon.appendQueryParameter(EndpointParameters.Name.RECOVER_TS, String.valueOf(endpointParameters.getRecoverTs()));
            }
            return a(buildUpon, endpointParameters);
        }

        public final String replaceOrAppendQueryParam(String str, String str2, String str3) {
            Uri.Builder buildUpon;
            Uri parse = Uri.parse(str);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                buildUpon = parse.buildUpon().clearQuery();
                for (String str4 : queryParameterNames) {
                    if (str2.equals(str4)) {
                        buildUpon.appendQueryParameter(str4, str3);
                    } else {
                        buildUpon.appendQueryParameter(str4, parse.getQueryParameter(str4));
                    }
                }
            } else {
                buildUpon = parse.buildUpon();
                buildUpon.appendQueryParameter(str2, str3);
            }
            return buildUpon.build().toString();
        }

        public static String a(Uri.Builder builder, EndpointParameters endpointParameters) {
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("version", String.valueOf(endpointParameters.getProtocolVersion())).appendQueryParameter("capabilities", endpointParameters.getCapabilities()).appendQueryParameter("device", Build.MANUFACTURER + DomExceptionUtils.SEPARATOR + Build.MODEL).appendQueryParameter("platform", "ANDROID").appendQueryParameter("clientType", endpointParameters.getClientType()).appendQueryParameter("appVersion", endpointParameters.getAppVersion()).appendQueryParameter(EndpointParameters.Name.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter(EndpointParameters.Name.ISP_AS_ORG, endpointParameters.getIspAsOrg()).appendQueryParameter(EndpointParameters.Name.LOC_CC, endpointParameters.getLocCc()).appendQueryParameter(EndpointParameters.Name.LOC_REG, endpointParameters.getLocReg());
            Integer ispAsNo = endpointParameters.getIspAsNo();
            if (ispAsNo != null) {
                appendQueryParameter.appendQueryParameter(EndpointParameters.Name.ISP_AS_NO, String.valueOf(ispAsNo.intValue()));
            }
            String startUrlType = endpointParameters.getStartUrlType();
            if (startUrlType != null) {
                appendQueryParameter.appendQueryParameter(EndpointParameters.Name.TGT, startUrlType);
            }
            String compression = endpointParameters.getCompression();
            if (compression != null) {
                appendQueryParameter.appendQueryParameter(EndpointParameters.Name.COMPRESSION, compression);
            }
            return appendQueryParameter.build().toString();
        }
    }

    public static final long a(SignalingTransport signalingTransport, gzs gzsVar) {
        signalingTransport.z.log("Generate new peer id");
        return ((Number) gzsVar.invoke()).longValue();
    }

    public static final s3q0 a(SignalingTransport signalingTransport, long j) {
        signalingTransport.z.log("Remember peer id " + j);
        signalingTransport.y = new bhz0(Long.valueOf(j), signalingTransport.i.getConversationId());
        return s3q0.a;
    }

    public static final void b(SignalingTransport signalingTransport) {
        String str = signalingTransport.u;
        if (signalingTransport.h) {
            str = Companion.access$copyEndpointWithRecoverTs(Companion, str, signalingTransport.w);
        }
        signalingTransport.z.log("transport.reconnect");
        synchronized (signalingTransport.A) {
            signalingTransport.u = str;
            s3q0 s3q0Var = s3q0.a;
        }
        synchronized (signalingTransport.s) {
            signalingTransport.t = false;
            signalingTransport.a("reconnect", false);
        }
    }

    public static final boolean a(SignalingTransport signalingTransport, Message message) {
        signalingTransport.a(message);
        return true;
    }

    public static final void a(SignalingTransport signalingTransport, String str, Long l) {
        String str2 = signalingTransport.u;
        Companion companion = Companion;
        String access$copyEndpointWithToken = Companion.access$copyEndpointWithToken(companion, str2, str);
        if (l != null) {
            access$copyEndpointWithToken = Companion.access$copyEndpointWithUserId(companion, access$copyEndpointWithToken, String.valueOf(l.longValue()));
        }
        String access$copyEndpointWithTgt = Companion.access$copyEndpointWithTgt(companion, access$copyEndpointWithToken, URL_TYPE_RETRY);
        if (signalingTransport.h) {
            access$copyEndpointWithTgt = Companion.access$copyEndpointWithRecoverTs(companion, access$copyEndpointWithTgt, signalingTransport.w);
        }
        signalingTransport.z.log("transport.restart");
        synchronized (signalingTransport.A) {
            signalingTransport.u = access$copyEndpointWithTgt;
            s3q0 s3q0Var = s3q0.a;
        }
        synchronized (signalingTransport.s) {
            signalingTransport.t = false;
            signalingTransport.a("restart", false);
        }
    }

    public interface SocketListener {
        void onFailure(Throwable th);

        default void onOpen() {
        }

        default void onMessage(String str) {
        }

        default void onClosed(int i, String str) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0.getFallbackOnAnyReconnectCase() == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean safelyCloseSocketWithCodeAndReason;
        this.z.log("handleServerPingTimeout, timeout=" + this.g);
        synchronized (this.A) {
            safelyCloseSocketWithCodeAndReason = safelyCloseSocketWithCodeAndReason(4000, "dispose");
            s3q0 s3q0Var = s3q0.a;
        }
        if (safelyCloseSocketWithCodeAndReason) {
            this.d.onFailedByPings(this.k);
        }
        FallbackParams fallbackParams = this.n;
        boolean z = fallbackParams != null;
        a(z);
    }

    public final void a(String str, boolean z) {
        this.z.log("connect, " + str);
        if (this.g > 0) {
            this.r.removeMessages(2);
        }
        synchronized (this.s) {
            if (this.t) {
                this.z.log("cant connect because released");
                return;
            }
            long msSinceBoot = this.l.getMsSinceBoot();
            long j = this.v;
            if (j != 0 && msSinceBoot - j > this.b) {
                this.d.onTimeout(this.k);
                this.z.log("not connecting, lastPongTime = " + j + " time = " + msSinceBoot);
                Signaling.ConnectFailureListener connectFailureListener = this.c;
                if (connectFailureListener != null) {
                    connectFailureListener.onConnectFailed(new Signaling.ConnectFailureListener.FailureReason.ReconnectTimeout(), this);
                }
                dispose();
                s3q0 s3q0Var = s3q0.a;
            }
            this.d.onConnect(this.k);
            this.e.execute(new a(this, z));
            s3q0 s3q0Var2 = s3q0.a;
        }
    }

    public final void b(String str) {
        Object obj;
        String createEndpointUrl;
        String optString;
        this.z.logSignalingMessage(str);
        if (this.m) {
            if (epx.f(str, PING)) {
                this.d.onMessageReceived(this.k, str, true);
            } else {
                this.d.onMessageReceived(this.k, a(str, "response"), false);
            }
        } else {
            this.d.onMessageReceived(this.k, null, true);
        }
        if (this.g > 0) {
            this.r.removeMessages(2);
            synchronized (this.A) {
                safelyDoIfSocketExists(new i0b0(this, 12));
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (epx.f(str, PING)) {
            synchronized (this.A) {
                try {
                    if (safelySendSocketMessage(PONG)) {
                        this.z.logSignalingCommand(PONG);
                        if (this.m) {
                            this.d.onCommandSent(this.k, PONG, true);
                        }
                        this.v = this.l.getMsSinceBoot();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("type", null);
            String optString3 = jSONObject.optString("error", null);
            if ("error".equals(optString2) && "conversation-ended".equals(optString3)) {
                dispose();
            }
            long optLong = jSONObject.optLong(SignalingProtocol.KEY_STAMP, 0L);
            if (optLong > 0) {
                synchronized (this.A) {
                    this.w = Math.max(optLong, this.w);
                    s3q0 s3q0Var3 = s3q0.a;
                }
            }
            Signaling.Transport.Listener listener = this.x;
            if (listener != null) {
                listener.onMessage(jSONObject);
            }
            String optString4 = jSONObject.optString("notification", null);
            if (!"notification".equals(optString2) || !SignalingProtocol.NOTIFY_CONNECTION.equals(optString4)) {
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("peerId");
            Long n = (optJSONObject == null || (optString = optJSONObject.optString("id", null)) == null) ? null : arm0.n(optString);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(SignalingProtocol.KEY_CONVERSATION);
            String optString5 = optJSONObject2 != null ? optJSONObject2.optString("id", null) : null;
            if (optString5 == null || n == null) {
                return;
            }
            bhz0 bhz0Var = this.y;
            this.z.log("Peer update: " + bhz0Var.a + " -> " + n + ", " + bhz0Var.b + " -> " + optString5);
            Object obj2 = this.A;
            synchronized (obj2) {
                try {
                    this.y = new bhz0(n, optString5);
                    try {
                        obj = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                    try {
                        EndpointParameters copy$default = EndpointParameters.copy$default(this.i, optString5, null, null, 0, null, null, null, n, null, null, 0, null, null, null, null, null, null, null, 0L, 524158, null);
                        if (this.j) {
                            createEndpointUrl = EndpointParametersUtilsKt.createEndpointUrlWithReplaceParameters(copy$default);
                        } else {
                            createEndpointUrl = Companion.createEndpointUrl(copy$default);
                        }
                        this.u = createEndpointUrl;
                        s3q0 s3q0Var4 = s3q0.a;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            }
        } catch (JSONException e) {
            this.z.reportException("ws.signaling.json", e);
        } catch (Throwable th5) {
            this.z.reportException("ws.signaling.unexpected_throwable", th5);
        }
    }

    public /* synthetic */ SignalingTransport(TransportType transportType, long j, Signaling.ConnectFailureListener connectFailureListener, SignalingStat signalingStat, ExecutorService executorService, RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, long j2, boolean z, EndpointParameters endpointParameters, boolean z2, SignalingStat.SignalingType signalingType, TimeProvider timeProvider, boolean z3, boolean z4, FallbackParams fallbackParams, Timeouts timeouts, boolean z5, boolean z6, wyg0 wyg0Var, gzs gzsVar, int i, zcl zclVar) {
        this(transportType, j, connectFailureListener, signalingStat, executorService, rTCLog, rTCLogConfiguration, j2, z, endpointParameters, z2, signalingType, timeProvider, z3, z4, (i & 32768) != 0 ? null : fallbackParams, (i & 65536) != 0 ? null : timeouts, z5, z6, wyg0Var, gzsVar);
    }

    public final void a(Message message) {
        int i = message.what;
        if (i == 1) {
            c();
            ReentrantLock reentrantLock = this.I;
            reentrantLock.lock();
            try {
                this.J = false;
                s3q0 s3q0Var = s3q0.a;
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (i == 2) {
            b();
            return;
        }
        if (i == 3) {
            Object obj = message.obj;
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar == null) {
                return;
            }
            SignalingTransportAdapter.FallbackAwareSignalingTransport.Listener listener = bVar.a;
            bhz0 bhz0Var = bVar.b;
            listener.onFallbackNeeded(this, new SignalingTransportAdapter.Params(true, bhz0Var.b, bhz0Var.a, this.w));
            return;
        }
        throw new RuntimeException(lhg.a(message.what, "unhandled message "));
    }

    public final void a(boolean z) {
        this.z.log("handleDisconnected");
        if (this.g > 0) {
            this.r.removeMessages(2);
        }
        synchronized (this.A) {
            safelyResetSocketReference();
            s3q0 s3q0Var = s3q0.a;
        }
        synchronized (this.s) {
            if (!this.t && !b(z)) {
                d();
            }
        }
        Signaling.Transport.Listener listener = this.x;
        if (listener != null) {
            listener.onDisconnected();
        }
    }

    public static String a(String str, String str2) {
        Object failure;
        String optString;
        try {
            failure = new JSONObject(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        JSONObject jSONObject = (JSONObject) failure;
        if (jSONObject == null || (optString = jSONObject.optString(str2)) == null || optString.length() <= 0) {
            return null;
        }
        return optString;
    }

    public static final s3q0 a(SignalingTransport signalingTransport, String str) {
        signalingTransport.r.sendEmptyMessageDelayed(2, signalingTransport.g);
        return s3q0.a;
    }

    public final void a(String str) {
        this.z.log("handleWebSocketClosed, reason=" + str);
        this.d.onDisconnectedSuccessfully(this.k);
        a(false);
    }

    public final boolean b(boolean z) {
        if (!z) {
            this.z.log("fallback condition not satisfied. ignore fallback request");
            return false;
        }
        if (!isFallbackSupported()) {
            this.z.log("fallback is not supported for this kind of transport");
            return false;
        }
        SignalingTransportAdapter.FallbackAwareSignalingTransport.Listener listener = this.D;
        if (listener == null) {
            this.z.log("no fallback request listener provided, will not request fallback");
            return false;
        }
        this.r.removeMessages(3);
        Handler handler = this.r;
        bhz0 bhz0Var = this.y;
        handler.sendMessage(handler.obtainMessage(3, new b(listener, new bhz0(bhz0Var.a, bhz0Var.b))));
        this.z.log("fallback to another instance request submitted");
        return true;
    }

    public final List a(EndpointParameters endpointParameters) {
        ArrayList arrayList = new ArrayList();
        Pair pair = this.F;
        int intValue = pair != null ? ((Number) pair.j()).intValue() : -1;
        List<String> endpointIPs = endpointParameters.getEndpointIPs();
        if (endpointIPs != null) {
            for (String str : endpointIPs) {
                if (intValue > 0) {
                    arrayList.add(str + StringUtils.PROCESS_POSTFIX_DELIMITER + intValue);
                } else {
                    arrayList.add(str);
                }
            }
        }
        Pair pair2 = this.F;
        String str2 = pair2 != null ? (String) pair2.i() : null;
        if (str2 != null) {
            if (intValue > 0) {
                arrayList.add(str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + intValue);
            } else {
                arrayList.add(str2);
            }
        }
        return j5g.O0(arrayList);
    }

    public final long a() {
        if (this.o == null) {
            return 2000L;
        }
        ReentrantLock reentrantLock = this.I;
        reentrantLock.lock();
        try {
            Long l = this.K;
            long longValue = l != null ? l.longValue() : this.o.getInitialReconnectDelay();
            long min = Math.min(an10.c(longValue * this.o.getReconnectDelayScaleFactor()), this.o.getMaxReconnectDelay());
            this.K = Long.valueOf(min + an10.c(((0.5d - Math.random()) * min) / 100));
            reentrantLock.unlock();
            return longValue;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
