package xsna;

/* compiled from: PinReviewManageServiceViewState.kt */
/* loaded from: classes18.dex */
public final class n80 {
    public final String a;
    public final String b;

    public n80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj;
        return epx.f(this.a, n80Var.a) && epx.f(this.b, n80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveSubscriptionInfo(price=");
        sb.append(this.a);
        sb.append(", nextPaymentDate=");
        return ho8.a(sb, this.b, ')');
    }
}
