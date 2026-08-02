package defpackage;

import android.net.Uri;

/* loaded from: classes15.dex */
public final class bwu0 extends l1b1 {
    public final Uri a;

    public bwu0(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.l1b1
    public final void j(sh3 sh3Var) {
        Uri uri = sh3Var.d;
        Uri uri2 = this.a;
        if (jl40.l(uri, uri2)) {
            return;
        }
        sh3Var.d = uri2;
        sh3Var.e.invoke(uri2);
    }

    public bwu0() {
        this(Uri.EMPTY);
    }
}
