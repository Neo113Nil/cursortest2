package xsna;

/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class ks90 {
    public final int a;
    public final String b;

    public ks90(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks90)) {
            return false;
        }
        ks90 ks90Var = (ks90) obj;
        return this.a == ks90Var.a && epx.f(this.b, ks90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentDate(date=");
        sb.append(this.a);
        sb.append(", dateText=");
        return ho8.a(sb, this.b, ')');
    }
}
