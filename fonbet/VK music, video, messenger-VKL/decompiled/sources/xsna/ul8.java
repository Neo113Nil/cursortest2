package xsna;

/* compiled from: EasyPromoteState.kt */
/* loaded from: classes14.dex */
public final class ul8 {
    public final float a;
    public final bwf<Float> b;
    public final int c;
    public final int d;

    public ul8(float f, bwf<Float> bwfVar, int i, int i2) {
        this.a = f;
        this.b = bwfVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul8)) {
            return false;
        }
        ul8 ul8Var = (ul8) obj;
        return Float.compare(this.a, ul8Var.a) == 0 && epx.f(this.b, ul8Var.b) && this.c == ul8Var.c && this.d == ul8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BudgetState(budgetRatio=");
        sb.append(this.a);
        sb.append(", budgetRange=");
        sb.append(this.b);
        sb.append(", budgetSteps=");
        sb.append(this.c);
        sb.append(", budgetValue=");
        return vu5.b(sb, this.d, ')');
    }
}
