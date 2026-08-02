package xsna;

/* compiled from: PinReviewToggleSubscriptionResult.kt */
/* loaded from: classes18.dex */
public final class lna0 {
    public final String a;
    public final String b;

    public lna0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lna0)) {
            return false;
        }
        lna0 lna0Var = (lna0) obj;
        return epx.f(this.a, lna0Var.a) && epx.f(this.b, lna0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinReviewToggleSubscriptionResult(title=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
