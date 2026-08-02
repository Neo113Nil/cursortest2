package xsna;

/* compiled from: MarketItemReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class q48 {
    public final String a;
    public final String b;

    public q48(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q48)) {
            return false;
        }
        q48 q48Var = (q48) obj;
        return epx.f(this.a, q48Var.a) && epx.f(this.b, q48Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomButtonData(text=");
        sb.append(this.a);
        sb.append(", link=");
        return ho8.a(sb, this.b, ')');
    }
}
