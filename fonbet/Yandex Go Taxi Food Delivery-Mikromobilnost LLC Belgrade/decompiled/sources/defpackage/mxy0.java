package defpackage;

import android.net.Uri;

/* loaded from: classes13.dex */
public final class mxy0 {
    public final k7x0 a;

    public mxy0(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public final String a(String str, boolean z) {
        if (evu0.J(str)) {
            return null;
        }
        ((m7x0) this.a).getClass();
        return new Uri.Builder().scheme("tag").authority("t").path("t").appendQueryParameter("t", str).appendQueryParameter("c", z ? "d" : "l").build().toString();
    }
}
