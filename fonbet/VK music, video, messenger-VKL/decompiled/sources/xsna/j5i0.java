package xsna;

/* compiled from: VkSegmentedControl.kt */
/* loaded from: classes17.dex */
public final class j5i0 {
    public final float a;
    public final float b;

    public j5i0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5i0)) {
            return false;
        }
        j5i0 j5i0Var = (j5i0) obj;
        return pco.b(this.a, j5i0Var.a) && pco.b(this.b, j5i0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentPosition(start=");
        oq.f(this.a, ", width=", sb);
        return ir.f(')', this.b, sb);
    }
}
