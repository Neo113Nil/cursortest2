package xsna;

import java.io.IOException;
import okhttp3.Interceptor;

/* compiled from: HandshakeNPEInterceptorFix.kt */
/* loaded from: classes.dex */
public final class ptu implements Interceptor, uz80 {
    public static final ptu a = new ptu();

    @Override // xsna.uz80
    public final String getTag() {
        return "HandshakeNPE";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        try {
            return aVar.a(aVar.request());
        } catch (NullPointerException e) {
            if (!drm0.D(e.toString(), "ssl_session", true)) {
                throw e;
            }
            com.vk.metrics.eventtracking.b.a.a(e);
            throw new IOException("Google Conscrypt bug", e);
        }
    }
}
