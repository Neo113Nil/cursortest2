package xsna;

/* compiled from: BottomSheetLayout.kt */
/* loaded from: classes18.dex */
public final class a98 {
    public final uog0 a;
    public final long b;
    public final float c;

    public a98(uog0 uog0Var, long j, float f) {
        this.a = uog0Var;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a98)) {
            return false;
        }
        a98 a98Var = (a98) obj;
        return this.a.equals(a98Var.a) && l5g.d(this.b, a98Var.b) && pco.b(this.c, a98Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = l5g.l;
        return Float.hashCode(this.c) + bh10.a(hashCode, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetStyle(shape=");
        sb.append(this.a);
        sb.append(", background=");
        dn.h(this.b, ", elevation=", sb);
        return ir.f(')', this.c, sb);
    }
}
