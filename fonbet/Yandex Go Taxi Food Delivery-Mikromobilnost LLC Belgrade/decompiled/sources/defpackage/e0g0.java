package defpackage;

/* loaded from: classes2.dex */
public final class e0g0 {
    public final Object a;
    public final nze0 b;
    public final yf70 c;

    public e0g0(String str, nze0 nze0Var, yf70 yf70Var) {
        this.a = str;
        this.b = nze0Var;
        this.c = yf70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0g0)) {
            return false;
        }
        e0g0 e0g0Var = (e0g0) obj;
        return jl40.l(this.a, e0g0Var.a) && this.b.equals(e0g0Var.b) && this.c.equals(e0g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PurchasePlanInput(commonPeriodDuration=" + this.a + ", commonPrice=" + this.b + ", quantity=" + this.c + ')';
    }
}
