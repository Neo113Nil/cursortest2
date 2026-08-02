package xsna;

import android.net.Uri;
import kotlin.collections.EmptyList;

/* compiled from: WebAuthApiCommand.kt */
/* loaded from: classes6.dex */
public final class zfx0 extends nx2<yfx0> {
    public final String b;
    public final wwu0 c;
    public final String d;
    public final String e;

    public zfx0(String str, wwu0 wwu0Var, String str2) {
        this.b = str;
        this.c = wwu0Var;
        this.d = str2;
        String path = Uri.parse(str).getPath();
        this.e = path == null ? "" : path;
    }

    @Override // xsna.nx2
    public final yfx0 f(l7r0 l7r0Var) {
        String a = i7r0.a(l7r0Var.i().e.getValue());
        String str = this.b;
        int i = dgn0.a().j;
        alv alvVar = new alv(str, 0L, i, i, new x0o(this, l7r0Var, a, 6), EmptyList.b);
        return (yfx0) zdq.a(l7r0Var, alvVar, new bgx0(l7r0Var, alvVar, this.d), true);
    }
}
