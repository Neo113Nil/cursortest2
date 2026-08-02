package xsna;

/* compiled from: PinReviewManageServiceViewState.kt */
/* loaded from: classes18.dex */
public final class rkn0 {
    public final String a;

    public rkn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkn0) && epx.f(this.a, ((rkn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SuspendedSubscriptionInfo(price="), this.a, ')');
    }
}
