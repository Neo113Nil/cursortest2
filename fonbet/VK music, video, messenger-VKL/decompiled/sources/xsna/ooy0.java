package xsna;

import com.ironsource.X3;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ooy0 {
    public static final ooy0 e = new ooy0(giy0.d, "", false, true);
    public final giy0 a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ooy0(giy0 giy0Var, String str, boolean z, boolean z2) {
        this.a = giy0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final ooy0 a(String str) {
        String str2 = this.b;
        if (!str2.isEmpty()) {
            str = pzl.b(str2, ".", str);
        }
        return new ooy0(this.a, str, this.c, this.d);
    }

    public final void b(int i) {
        this.a.c(0, i, e(""));
    }

    public final void c(int i, String str) {
        this.a.c(0, i, e(str));
    }

    public final void d(String str, Throwable th) {
        this.a.g(0, 3001, e(str) + "\nexception=" + gu8.b(th));
    }

    public final String e(String str) {
        boolean isEmpty = str.isEmpty();
        String str2 = this.b;
        return isEmpty ? str2 : pzl.b(str2, ": ", str);
    }

    public final ooy0 f(int i) {
        return new ooy0(this.a, this.b + X3.j.d + i + X3.j.e, this.c, this.d);
    }

    public final void g(int i) {
        this.a.g(0, i, e(""));
    }

    public final void h(int i, String str) {
        this.a.g(0, i, e(str));
    }

    public final ooy0 i() {
        return new ooy0(this.a, this.b, false, this.d);
    }
}
