package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class h1h {
    public final o3h a;
    public final zh11 b;
    public final q0h c;

    public h1h(o3h o3hVar, zh11 zh11Var, q0h q0hVar) {
        this.a = o3hVar;
        this.b = zh11Var;
        this.c = q0hVar;
    }

    public final boolean a(Uri uri) {
        ((pux0) this.a).getClass();
        if (!a.G(pux0.b, uri.getScheme())) {
            return false;
        }
        String authority = uri.getAuthority();
        return authority == null || evu0.J(authority) || this.c.a(uri) != null;
    }

    public final Intent b(Context context, Uri uri, v770 v770Var) {
        this.b.a(uri);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (v770Var != null) {
            intent.putExtra("KEY_OPEN_REASON", v770Var.a);
        }
        if (a(uri)) {
            intent.setPackage(context.getPackageName());
        }
        return intent;
    }
}
