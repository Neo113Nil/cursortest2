package xsna;

import android.text.SpannableStringBuilder;

/* compiled from: PinReviewManageServiceViewState.kt */
/* loaded from: classes18.dex */
public final class g770 {
    public final String a;
    public final CharSequence b;

    public g770(String str, SpannableStringBuilder spannableStringBuilder) {
        this.a = str;
        this.b = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g770)) {
            return false;
        }
        g770 g770Var = (g770) obj;
        return epx.f(this.a, g770Var.a) && epx.f(this.b, g770Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotSubscriptionBuyerInfo(title=");
        sb.append(this.a);
        sb.append(", description=");
        return thl0.a(sb, this.b, ')');
    }
}
