package xsna;

/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class l6d0 {
    public final int a;
    public final String b;

    public l6d0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6d0)) {
            return false;
        }
        l6d0 l6d0Var = (l6d0) obj;
        return this.a == l6d0Var.a && epx.f(this.b, l6d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(price=");
        sb.append(this.a);
        sb.append(", priceText=");
        return ho8.a(sb, this.b, ')');
    }
}
