package xsna;

/* compiled from: TopshelfCardPaginationAppearance.kt */
/* loaded from: classes2.dex */
public final class cbp0 {
    public final float a;
    public final float b;

    public cbp0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbp0)) {
            return false;
        }
        cbp0 cbp0Var = (cbp0) obj;
        return pco.b(this.a, cbp0Var.a) && pco.b(this.b, cbp0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardPaginationAppearance(height=");
        oq.f(this.a, ", bottomSpacingWithoutPagination=", sb);
        return ir.f(')', this.b, sb);
    }
}
