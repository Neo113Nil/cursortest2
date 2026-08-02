package xsna;

/* compiled from: QuickAction.kt */
/* loaded from: classes2.dex */
public final class lse0 {
    public final int a;
    public final int b;
    public final String c;

    public lse0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lse0)) {
            return false;
        }
        lse0 lse0Var = (lse0) obj;
        return this.a == lse0Var.a && this.b == lse0Var.b && epx.f(this.c, lse0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickAction(actionId=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }
}
