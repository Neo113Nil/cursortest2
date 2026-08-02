package defpackage;

import android.net.Uri;
import androidx.fragment.app.Fragment;

/* loaded from: classes15.dex */
public final class b0x implements sfl0 {
    public final x220 a;
    public final Fragment b;
    public final a0x c;
    public final j0x d;
    public final j420 e;

    public b0x(x220 x220Var, Fragment fragment, a0x a0xVar, j0x j0xVar, j420 j420Var) {
        this.a = x220Var;
        this.b = fragment;
        this.c = a0xVar;
        this.d = j0xVar;
        this.e = j420Var;
    }

    public final void b(String str) {
        this.d.a(Uri.parse(str));
    }

    public final void c() {
        this.a.getClass();
    }
}
