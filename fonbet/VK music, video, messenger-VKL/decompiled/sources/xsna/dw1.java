package xsna;

/* compiled from: Amount.kt */
/* loaded from: classes3.dex */
public final class dw1 {
    public final int a;
    public final String b;

    public dw1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1Var = (dw1) obj;
        return this.a == dw1Var.a && epx.f(this.b, dw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Amount(value=");
        sb.append(this.a);
        sb.append(", currency=");
        return ho8.a(sb, this.b, ')');
    }
}
