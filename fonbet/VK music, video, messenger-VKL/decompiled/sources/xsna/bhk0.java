package xsna;

/* compiled from: BasePinLockView.kt */
/* loaded from: classes15.dex */
public final class bhk0 {
    public final float a;
    public final float b;

    public bhk0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhk0)) {
            return false;
        }
        bhk0 bhk0Var = (bhk0) obj;
        return pco.b(this.a, bhk0Var.a) && pco.b(this.b, bhk0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacerDefaults(height=");
        oq.f(this.a, ", width=", sb);
        return ir.f(')', this.b, sb);
    }
}
