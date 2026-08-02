package xsna;

import android.net.Uri;

/* compiled from: DashVkHostResolver.kt */
/* loaded from: classes.dex */
public final class gtk extends dzu0 {
    @Override // androidx.media3.datasource.g.b
    public final Uri a(Uri uri) {
        if (!dzu0.c(uri)) {
            return uri;
        }
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        if (!epx.f(uri.getHost(), o260Var.h().getHost())) {
            return uri;
        }
        String b = dzu0.b(uri, "ct");
        String b2 = dzu0.b(uri, "id");
        return (b == null || b2 == null || this.b.isEmpty()) ? uri : f(uri, b2);
    }

    @Override // androidx.media3.datasource.g.b
    public final evk d(evk evkVar) {
        if (dzu0.c(evkVar.a)) {
            Uri uri = evkVar.a;
            String host = uri.getHost();
            String b = dzu0.b(uri, "ct");
            String b2 = dzu0.b(uri, "id");
            o260 o260Var = d260.a;
            if (o260Var == null) {
                o260Var = null;
            }
            String host2 = o260Var.h().getHost();
            if (host != null && !host.equals(host2) && b != null && b2 != null) {
                this.b.put(b2, host);
            }
        }
        return evkVar;
    }
}
