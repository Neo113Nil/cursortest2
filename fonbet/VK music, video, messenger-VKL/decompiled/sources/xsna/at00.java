package xsna;

/* compiled from: MarketAllReviewsRestoreCommunityItem.kt */
/* loaded from: classes18.dex */
public final class at00 implements hfz {
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public at00(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at00)) {
            return false;
        }
        at00 at00Var = (at00) obj;
        return this.b == at00Var.b && this.c == at00Var.c && epx.f(this.d, at00Var.d) && this.e == at00Var.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAllReviewsRestoreCommunityItem(id=");
        sb.append(this.b);
        sb.append(", communityId=");
        sb.append(this.c);
        sb.append(", communityName=");
        sb.append(this.d);
        sb.append(", backgroundResId=");
        return vu5.b(sb, this.e, ')');
    }
}
