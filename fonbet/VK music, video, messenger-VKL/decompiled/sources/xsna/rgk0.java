package xsna;

import java.util.Iterator;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class rgk0 implements evi, Iterable<Object>, gcy {
    public final v2k0 b;
    public final int c;
    public final wgt d;
    public final ysf0 e;

    public rgk0(v2k0 v2k0Var, int i, wgt wgtVar, ysf0 ysf0Var) {
        this.b = v2k0Var;
        this.c = i;
        this.d = wgtVar;
        this.e = ysf0Var;
        wgtVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rgk0)) {
            return false;
        }
        rgk0 rgk0Var = (rgk0) obj;
        return rgk0Var.c == this.c && rgk0Var.b.equals(this.b) && rgk0Var.e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.b.hashCode() + (this.c * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new qgk0(this.b, this.c, this.d, this.e);
    }
}
