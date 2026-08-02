package xsna;

import com.vk.init.network.exceptions.RetryRequestException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.IOException;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.Interceptor;

/* compiled from: ImageRetryInterceptor.kt */
/* loaded from: classes2.dex */
public final class nlw implements Interceptor, uz80 {
    @Override // xsna.uz80
    public final String getTag() {
        return "ImageRetry";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return r0;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        String uuid = UUID.randomUUID().toString();
        okhttp3.p request = aVar.request();
        String a = p2i0.c.a(aVar.request().a.i);
        Exception e = null;
        int i = 0;
        loop0: while (true) {
            Exception exc = e;
            while (ref$IntRef.element < 3) {
                L.d(new x0o(ref$IntRef, uuid, this, request));
                try {
                    okhttp3.u a2 = aVar.a(request);
                    i = a2.e;
                    if (a2.t()) {
                        break loop0;
                    }
                    if (a2.e == 404) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"ImageRetryInterceptor TRY ERROR 404 [" + uuid + "] - " + a});
                            break;
                        }
                        break;
                    }
                    m63.a(m63.c(), "retry.attempt", new Pair("retry.count", Integer.valueOf(ref$IntRef.element + 1)), new Pair("retry.status_code", Integer.valueOf(a2.e)));
                    x2r0.c(a2);
                    ref$IntRef.element++;
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof IOException) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{ss9.a("ImageRetryInterceptor TRY ERROR_IO [", uuid, "] - ", a, ". Error:")});
                        }
                        throw e;
                    }
                    ref$IntRef.element++;
                    m63.a(m63.c(), "retry.attempt", new Pair("retry.count", Integer.valueOf(ref$IntRef.element)), new Pair("retry.error", e.getClass().getSimpleName()));
                    if (exc != null) {
                        mnh0.d(e, exc);
                    }
                }
            }
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{y57.a("ImageRetryInterceptor TRY ERROR [", uuid, "] - ", a)});
            }
            m63.a(m63.c(), "retry.exhausted", new Pair("retry.total_attempts", Integer.valueOf(ref$IntRef.element)), new Pair("retry.last_code", Integer.valueOf(i)));
            RetryRequestException retryRequestException = new RetryRequestException(zil0.a(i, "Can't load image ", a, " with 3 times. Response code: "));
            if (exc != null) {
                retryRequestException.addSuppressed(exc);
            }
            throw retryRequestException;
        }
    }
}
