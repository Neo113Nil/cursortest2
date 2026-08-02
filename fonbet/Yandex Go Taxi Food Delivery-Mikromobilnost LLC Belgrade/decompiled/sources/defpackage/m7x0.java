package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class m7x0 implements k7x0 {
    public final pwy0 a;

    public m7x0(pwy0 pwy0Var) {
        this.a = pwy0Var;
    }

    public final String a(String str) {
        return new Uri.Builder().scheme("tag").authority("t").path("t").appendQueryParameter("t", str).appendQueryParameter("c", this.a.getThemeType().c() ? "d" : "l").build().toString();
    }
}
