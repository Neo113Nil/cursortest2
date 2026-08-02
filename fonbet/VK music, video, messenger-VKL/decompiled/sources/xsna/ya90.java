package xsna;

import java.util.Collections;
import java.util.List;
import xsna.cuy;

/* compiled from: PagerCacheWindowLogic.kt */
/* loaded from: classes11.dex */
public final class ya90 implements cy8 {
    public final tu80 a;
    public tb90 b;
    public cuy c;

    public ya90(tu80 tu80Var) {
        this.a = tu80Var;
    }

    @Override // xsna.cy8
    public final List<cuy.b> a(int i, wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        tb90 tb90Var = this.b;
        if (tb90Var == null) {
            tb90Var = null;
        }
        long j = tb90Var.u;
        cuy cuyVar = this.c;
        return Collections.singletonList((cuyVar != null ? cuyVar : null).a(i, j, true, new eaa(25, wzsVar, this)));
    }

    public final int c() {
        tb90 tb90Var = this.b;
        if (tb90Var == null) {
            tb90Var = null;
        }
        if (tb90Var.a.isEmpty()) {
            return -1;
        }
        tb90 tb90Var2 = this.b;
        if (tb90Var2 == null) {
            tb90Var2 = null;
        }
        long j = ((kp10) j5g.Y(tb90Var2.a)).a - (this.b != null ? r0 : null).h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public final boolean d() {
        tb90 tb90Var = this.b;
        if (tb90Var == null) {
            tb90Var = null;
        }
        return !tb90Var.a.isEmpty();
    }

    public final int e() {
        tb90 tb90Var = this.b;
        if (tb90Var == null) {
            tb90Var = null;
        }
        if (tb90Var.a.isEmpty()) {
            return -1;
        }
        tb90 tb90Var2 = this.b;
        if (tb90Var2 == null) {
            tb90Var2 = null;
        }
        long j = ((kp10) j5g.i0(tb90Var2.a)).a + (this.b != null ? r0 : null).h;
        long h = h() - 1;
        if (j > h) {
            j = h;
        }
        return (int) j;
    }

    public final int f() {
        tb90 tb90Var = this.b;
        if (tb90Var == null) {
            tb90Var = null;
        }
        if (tb90Var.a.isEmpty()) {
            return 0;
        }
        tb90 tb90Var2 = this.b;
        if (tb90Var2 == null) {
            tb90Var2 = null;
        }
        int i = ((kp10) j5g.i0(tb90Var2.a)).k;
        tb90 tb90Var3 = this.b;
        return Math.abs(((i + (tb90Var3 != null ? tb90Var3 : null).b) + (tb90Var3 != null ? tb90Var3 : null).c) - (tb90Var3 != null ? tb90Var3 : null).g);
    }

    public final int g() {
        tb90 tb90Var = this.b;
        if (tb90Var == null) {
            tb90Var = null;
        }
        if (tb90Var.a.isEmpty()) {
            return 0;
        }
        tb90 tb90Var2 = this.b;
        if (tb90Var2 == null) {
            tb90Var2 = null;
        }
        int i = ((kp10) j5g.Y(tb90Var2.a)).k;
        tb90 tb90Var3 = this.b;
        int i2 = i + (-(tb90Var3 != null ? tb90Var3 : null).f);
        return Math.abs(i2 <= 0 ? i2 : 0);
    }

    public final int h() {
        return ((Number) this.a.invoke()).intValue();
    }

    @Override // xsna.cy8
    public final int b(int i) {
        return i;
    }
}
