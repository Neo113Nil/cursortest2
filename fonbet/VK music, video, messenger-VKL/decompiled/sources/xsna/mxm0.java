package xsna;

/* compiled from: PinReviewManageServiceState.kt */
/* loaded from: classes18.dex */
public final class mxm0 {
    public final String a;
    public final CharSequence b;

    public mxm0(String str, CharSequence charSequence) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxm0)) {
            return false;
        }
        mxm0 mxm0Var = (mxm0) obj;
        return epx.f(this.a, mxm0Var.a) && epx.f(this.b, mxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionAdditionalInfo(title=");
        sb.append(this.a);
        sb.append(", description=");
        return thl0.a(sb, this.b, ')');
    }
}
