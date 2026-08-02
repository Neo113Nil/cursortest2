package ru.ok.android.externcalls.sdk.api.retry;

import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.x;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.utils.retry.Backoff;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.iyd0;
import xsna.s3q0;
import xsna.y6c;

/* compiled from: retry.kt */
/* loaded from: classes9.dex */
public final class RetryKt {
    private static final String LOG_TAG = "CallsApiRetry";

    private static final Backoff createFastBackoff() {
        return new Backoff(new ExponentialAlgorithm(0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 15, null), 3, 5000L);
    }

    private static final Backoff createSlowBackoff() {
        return new Backoff(new ExponentialAlgorithm(1000L, 0L, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, null), 3, 10000L);
    }

    public static final <T> x<T> retryApiCallForBackgroundWork(x<T> xVar, RTCLog rTCLog) {
        return retryWithSlowBackoff(xVar, rTCLog);
    }

    public static final <T> x<T> retryApiCallForFastWorkRequired(x<T> xVar, RTCLog rTCLog) {
        return retryWithFastBackoff(xVar, rTCLog);
    }

    public static final <T> x<T> retryApiCallForIncoming(x<T> xVar, RTCLog rTCLog) {
        return retryWithSlowBackoff(xVar, rTCLog);
    }

    public static final <T> x<T> retryApiCallForJoining(x<T> xVar, RTCLog rTCLog) {
        return retryWithFastBackoff(xVar, rTCLog);
    }

    public static final <T> x<T> retryApiCallForOutgoing(x<T> xVar, RTCLog rTCLog) {
        return retryWithFastBackoff(xVar, rTCLog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryApiExceptionFilter(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException) || (th instanceof HttpRetryException)) {
            return true;
        }
        if (!(th instanceof HttpStatusApiException)) {
            return (th instanceof ProtocolException) || (th instanceof IOException);
        }
        int statusCode = ((HttpStatusApiException) th).getStatusCode();
        return statusCode == 502 || statusCode == 504;
    }

    private static final <T> x<T> retryApiWithBackoff(x<T> xVar, RTCLog rTCLog, Backoff backoff) {
        return ru.ok.android.webrtc.utils.retry.RetryKt.retryWithBackoff$default(xVar, backoff, RetryKt$retryApiWithBackoff$1.INSTANCE, new y6c(rTCLog, 12), new iyd0(rTCLog, 3), (w) null, 16, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 retryApiWithBackoff$lambda$0(RTCLog rTCLog, Throwable th, int i) {
        rTCLog.log(LOG_TAG, "retry attempt " + i + " after " + th);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 retryApiWithBackoff$lambda$1(RTCLog rTCLog, Throwable th) {
        rTCLog.log(LOG_TAG, "retry failed with last exception " + th);
        return s3q0.a;
    }

    private static final <T> x<T> retryWithFastBackoff(x<T> xVar, RTCLog rTCLog) {
        return retryApiWithBackoff(xVar, rTCLog, createFastBackoff());
    }

    private static final <T> x<T> retryWithSlowBackoff(x<T> xVar, RTCLog rTCLog) {
        return retryApiWithBackoff(xVar, rTCLog, createSlowBackoff());
    }
}
