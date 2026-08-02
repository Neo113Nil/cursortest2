package xsna;

import android.net.Uri;

/* compiled from: OAuthUri.kt */
@vby
/* loaded from: classes15.dex */
public final class fo70 {
    public static final void a(Uri.Builder builder, uf7 uf7Var) {
        builder.appendQueryParameter("state", (String) uf7Var.a);
        builder.appendQueryParameter("code_challenge", (String) uf7Var.c);
        builder.appendQueryParameter("code_challenge_method", (String) uf7Var.d);
    }
}
