package xsna;

import java.util.Iterator;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class w2k0 implements evi, Iterable<Object>, gcy {
    public final v2k0 b;
    public final int c;
    public final int d;

    public w2k0(v2k0 v2k0Var, int i, int i2) {
        this.b = v2k0Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w2k0)) {
            return false;
        }
        w2k0 w2k0Var = (w2k0) obj;
        return w2k0Var.c == this.c && w2k0Var.d == this.d && epx.f(w2k0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        v2k0 v2k0Var = this.b;
        if (v2k0Var.i != this.d) {
            x2k0.g();
        }
        int i = this.c;
        wgt h0 = v2k0Var.h0(i);
        return h0 != null ? new qgk0(v2k0Var, i, h0, new g12(i)) : new ilu(v2k0Var, i + 1, x2k0.a(i, v2k0Var.b) + i);
    }
}
