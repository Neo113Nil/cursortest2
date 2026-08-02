package xsna;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class uez0 {
    public static final uez0 c = new uez0(udz0.j);
    public final udz0 a;
    public final String b;

    public uez0(udz0 udz0Var) {
        this.a = udz0Var;
        this.b = "";
    }

    public final ooy0 a(giy0 giy0Var) {
        return new ooy0(giy0Var, this.b, true, true);
    }

    public final uez0 b(String str) {
        String str2 = this.b;
        if (!str2.isEmpty()) {
            str = pzl.b(str2, ".", str);
        }
        return new uez0(this.a, str);
    }

    public final void c(int i) {
        this.a.b(0, i, e(""));
    }

    public final void d(int i, String str) {
        this.a.b(0, i, e(str));
    }

    public final String e(String str) {
        String str2 = this.b;
        return str2.isEmpty() ? str : str.isEmpty() ? str2 : pzl.b(str2, ": ", str);
    }

    public final void f() {
        this.a.d(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, e(""));
    }

    public final uez0 g(int i) {
        return new uez0(this.a, this.b + X3.j.d + i + X3.j.e);
    }

    public uez0(udz0 udz0Var, String str) {
        this.a = udz0Var;
        this.b = str;
    }
}
