package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class pyu0 implements qrq0, cnm {
    public final qrq0 a;
    public final int b;
    public final int c;

    public pyu0(qrq0 qrq0Var, int i, int i2) {
        this.a = qrq0Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            w511.f(oyr.i(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            w511.f(oyr.i(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        w511.f(oyr.h(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.cnm
    public final qrq0 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new pyu0(this.a, i3, i + i3);
    }

    @Override // defpackage.cnm
    public final qrq0 drop(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? ixn.a : new pyu0(this.a, i3 + i, i2);
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        return new q2b0(this);
    }
}
