package xsna;

import java.io.IOException;
import okhttp3.Interceptor;

/* compiled from: NativeCryptoSslInterceptorFix.kt */
/* loaded from: classes.dex */
public final class qv50 implements Interceptor, uz80 {
    @Override // xsna.uz80
    public final String getTag() {
        return "NativeCrypto";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        try {
            return aVar.a(aVar.request());
        } catch (NullPointerException e) {
            if (!drm0.D(e.toString(), "ssl == null", true)) {
                throw e;
            }
            com.vk.metrics.eventtracking.b.a.a(e);
            throw new IOException("Workaround for NativeCrypto bug", e);
        }
    }
}
