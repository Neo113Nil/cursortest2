package defpackage;

import com.yandex.plus.core.user.SubscriptionStatus;

/* loaded from: classes8.dex */
public final class c5d0 {
    public final double a;
    public final SubscriptionStatus b;

    public c5d0(double d, SubscriptionStatus subscriptionStatus) {
        this.a = d;
        this.b = subscriptionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5d0)) {
            return false;
        }
        c5d0 c5d0Var = (c5d0) obj;
        return Double.compare(this.a, c5d0Var.a) == 0 && this.b == c5d0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlusInfo(balance=" + this.a + ", subscriptionStatus=" + this.b + ')';
    }
}
