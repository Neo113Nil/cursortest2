package defpackage;

import com.yandex.go.taxi.summary.repository.b;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class biv0 {
    public final r0 a = bvf0.c(fpv0.a);
    public final r0 b = bvf0.c(null);
    public final r0 c = bvf0.c(0);
    public final n0 d;
    public final b e;

    public biv0() {
        n0 c = ffx.c(0, 1, null, 5);
        this.d = c;
        this.e = new b(c, this);
    }

    public final bov0 a() {
        return (bov0) this.b.getValue();
    }

    public final jpv0 b() {
        return (jpv0) this.a.getValue();
    }

    public final boolean c() {
        return ((Number) this.c.getValue()).intValue() == 3 && (this.a.getValue() instanceof hpv0);
    }

    public final void d(jpv0 jpv0Var) {
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, jpv0Var);
        this.d.g(zy11.a);
    }

    public final void e() {
        r0 r0Var;
        Object value;
        bov0 bov0Var;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            bov0Var = (bov0) value;
        } while (!r0Var.k(value, bov0Var != null ? new bov0(bov0Var.a, (khv0) new bhv0(0), bov0Var.c, false) : bov0.e));
    }
}
