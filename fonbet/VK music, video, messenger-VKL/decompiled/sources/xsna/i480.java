package xsna;

/* compiled from: OnDialogOrderUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class i480 extends sxp {
    public final Object b;
    public final gkx0 c;
    public final int d;

    public i480(Object obj, gkx0 gkx0Var, int i) {
        this.b = obj;
        this.c = gkx0Var;
        this.d = i;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i480)) {
            return false;
        }
        i480 i480Var = (i480) obj;
        return epx.f(this.b, i480Var.b) && epx.f(this.c, i480Var.c) && this.d == i480Var.d;
    }

    public final int hashCode() {
        Object obj = this.b;
        return Integer.hashCode(this.d) + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDialogOrderUpdateEvent(changerTag=");
        sb.append(this.b);
        sb.append(", sinceWeight=");
        sb.append(this.c);
        sb.append(", count=");
        return vu5.b(sb, this.d, ')');
    }
}
