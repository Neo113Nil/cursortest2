package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class c8x0 implements qrq0, cnm {
    public final qrq0 a;
    public final int b;

    public c8x0(qrq0 qrq0Var, int i) {
        this.a = qrq0Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        w511.f(oyr.e('.', i, "count must be non-negative, but was "));
        throw null;
    }

    @Override // defpackage.cnm
    public final qrq0 a(int i) {
        return i >= this.b ? this : new c8x0(this.a, i);
    }

    @Override // defpackage.cnm
    public final qrq0 drop(int i) {
        int i2 = this.b;
        return i >= i2 ? ixn.a : new pyu0(this.a, i, i2);
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new irv(this);
    }
}
