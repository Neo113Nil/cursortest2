package defpackage;

import android.net.Uri;

/* loaded from: classes14.dex */
public final class lz11 {
    public final ibw0 a;
    public final mz11 b;

    public lz11(ibw0 ibw0Var, mz11 mz11Var) {
        this.a = ibw0Var;
        this.b = mz11Var;
    }

    public static String a(Uri uri) {
        return unr0.o(uri.getScheme(), "://", uri.getAuthority(), uri.getPath());
    }
}
