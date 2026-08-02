package xsna;

/* compiled from: CheckoutState.kt */
/* loaded from: classes18.dex */
public final class q1n0 {
    public final boolean a;

    public q1n0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1n0) && this.a == ((q1n0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SuccessCheckout(isOrderPaid="), this.a, ')');
    }
}
