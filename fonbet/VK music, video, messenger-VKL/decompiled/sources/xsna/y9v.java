package xsna;

import android.net.Uri;
import xsna.dzu0;

/* compiled from: HlsVkHostResolver.kt */
/* loaded from: classes3.dex */
public final class y9v extends dzu0 {
    @Override // androidx.media3.datasource.g.b
    public final Uri a(Uri uri) {
        dzu0.a e;
        if (!dzu0.c(uri)) {
            return uri;
        }
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        return (!epx.f(uri.getHost(), o260Var.h().getHost()) || (e = dzu0.e(uri, ".ts")) == null || this.b.isEmpty()) ? uri : f(uri, e.b);
    }

    @Override // androidx.media3.datasource.g.b
    public final evk d(evk evkVar) {
        dzu0.a e;
        Uri uri = evkVar.a;
        if (dzu0.c(uri) && (e = dzu0.e(uri, ".m3u8")) != null) {
            this.b.put(e.b, e.a);
        }
        return evkVar;
    }
}
