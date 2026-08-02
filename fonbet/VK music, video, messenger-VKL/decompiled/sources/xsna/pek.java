package xsna;

import com.vk.knet.core.http.HttpProtocol;
import com.vk.knet.core.http.metric.HttpMetrics;
import java.util.Date;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: CronetExt.kt */
/* loaded from: classes2.dex */
public final class pek {

    /* compiled from: CronetExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpProtocol.values().length];
            try {
                iArr[HttpProtocol.QUIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpProtocol.HTTP_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final HttpMetrics a(RequestFinishedInfo requestFinishedInfo, long j, long j2, pkv pkvVar, boolean z) {
        String str;
        int i;
        String str2;
        sjv c;
        int i2;
        boolean z2;
        String str3;
        String message;
        String str4;
        Long totalTimeMs = requestFinishedInfo.getMetrics().getTotalTimeMs();
        long longValue = totalTimeMs != null ? totalTimeMs.longValue() : 0L;
        if (pkvVar != null) {
            HttpProtocol httpProtocol = pkvVar.d;
            int i3 = httpProtocol == null ? -1 : a.$EnumSwitchMapping$0[httpProtocol.ordinal()];
            if (i3 != 1) {
                str4 = i3 == 2 ? "1.2" : "1.3";
            }
            str = str4;
            UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
            String proxyServer = responseInfo == null ? responseInfo.getProxyServer() : null;
            String str5 = (proxyServer != null || proxyServer.equals(":0")) ? "" : proxyServer;
            if (z) {
                i = 1;
                str2 = str;
                c = c(requestFinishedInfo.getMetrics());
            } else {
                sjv c2 = c(requestFinishedInfo.getMetrics());
                Long ttfbMs = requestFinishedInfo.getMetrics().getTtfbMs();
                i = 1;
                str2 = str;
                c = new sjv(c2.a, c2.b, c2.c, c2.d, c2.e, ttfbMs != null ? ttfbMs.longValue() : 0L);
            }
            HttpMetrics.Source source = HttpMetrics.Source.CRONET;
            boolean socketReused = requestFinishedInfo.getMetrics().getSocketReused();
            boolean z3 = (drm0.N(str5) ? 1 : 0) ^ i;
            if (requestFinishedInfo.getFinishedReason() == i) {
                i2 = 2;
                if (requestFinishedInfo.getFinishedReason() != 2) {
                    z2 = 0;
                    if (requestFinishedInfo.getFinishedReason() == i2) {
                        message = "request cancelled";
                    } else {
                        CronetException exception = requestFinishedInfo.getException();
                        if (exception == null) {
                            str3 = null;
                            return new HttpMetrics(source, socketReused, str2, z3, str5, c, longValue, j2, j, z2, pkvVar == null ? pkvVar.d : null, str3);
                        }
                        message = exception.getMessage();
                    }
                    str3 = message;
                    return new HttpMetrics(source, socketReused, str2, z3, str5, c, longValue, j2, j, z2, pkvVar == null ? pkvVar.d : null, str3);
                }
            } else {
                i2 = 2;
            }
            z2 = i;
            if (requestFinishedInfo.getFinishedReason() == i2) {
            }
            str3 = message;
            return new HttpMetrics(source, socketReused, str2, z3, str5, c, longValue, j2, j, z2, pkvVar == null ? pkvVar.d : null, str3);
        }
        str = "";
        UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 == null) {
        }
        if (proxyServer != null) {
        }
        if (z) {
        }
        HttpMetrics.Source source2 = HttpMetrics.Source.CRONET;
        boolean socketReused2 = requestFinishedInfo.getMetrics().getSocketReused();
        boolean z32 = (drm0.N(str5) ? 1 : 0) ^ i;
        if (requestFinishedInfo.getFinishedReason() == i) {
        }
        z2 = i;
        if (requestFinishedInfo.getFinishedReason() == i2) {
        }
        str3 = message;
        return new HttpMetrics(source2, socketReused2, str2, z32, str5, c, longValue, j2, j, z2, pkvVar == null ? pkvVar.d : null, str3);
    }

    public static final HttpProtocol b(String str) {
        if (str.equalsIgnoreCase("h2")) {
            return HttpProtocol.HTTP_2;
        }
        if (str.equalsIgnoreCase("http/2")) {
            return HttpProtocol.HTTP_2;
        }
        if (str.equalsIgnoreCase("http/1.1")) {
            return HttpProtocol.HTTP_1_1;
        }
        if (drm0.D(str, "quic", true)) {
            return HttpProtocol.QUIC;
        }
        if (drm0.D(str, "h3", true)) {
            return HttpProtocol.QUIC;
        }
        if (drm0.D(str, "spdy", true)) {
            return HttpProtocol.SPDY;
        }
        HttpProtocol.Companion.getClass();
        return HttpProtocol.HTTP_2;
    }

    public static final sjv c(RequestFinishedInfo.Metrics metrics) {
        Date dnsStart = metrics.getDnsStart();
        long time = dnsStart != null ? dnsStart.getTime() : 0L;
        Date dnsEnd = metrics.getDnsEnd();
        long time2 = dnsEnd != null ? dnsEnd.getTime() : 0L;
        Date connectStart = metrics.getConnectStart();
        long time3 = connectStart != null ? connectStart.getTime() : 0L;
        Date connectEnd = metrics.getConnectEnd();
        long time4 = connectEnd != null ? connectEnd.getTime() : 0L;
        Date sslStart = metrics.getSslStart();
        long time5 = sslStart != null ? sslStart.getTime() : 0L;
        Date sslEnd = metrics.getSslEnd();
        long time6 = sslEnd != null ? sslEnd.getTime() : 0L;
        Date sendingStart = metrics.getSendingStart();
        long time7 = sendingStart != null ? sendingStart.getTime() : 0L;
        Date sendingEnd = metrics.getSendingEnd();
        long time8 = sendingEnd != null ? sendingEnd.getTime() : 0L;
        Date responseStart = metrics.getResponseStart();
        long time9 = responseStart != null ? responseStart.getTime() : 0L;
        Date requestEnd = metrics.getRequestEnd();
        return new tjv(time, time2, time3, time4, time5, time6, time7, time8, time9, requestEnd != null ? requestEnd.getTime() : 0L).c();
    }
}
