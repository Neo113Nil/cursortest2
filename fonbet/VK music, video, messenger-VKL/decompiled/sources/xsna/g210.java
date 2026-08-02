package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewDeletedItem.kt */
/* loaded from: classes18.dex */
public final class g210 implements hfz {
    public final int b;
    public final long c;
    public final String d;
    public final UserId e;
    public final boolean f;

    public g210(UserId userId, String str, int i, boolean z, long j) {
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = userId;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g210)) {
            return false;
        }
        g210 g210Var = (g210) obj;
        return this.b == g210Var.b && this.c == g210Var.c && epx.f(this.d, g210Var.d) && epx.f(this.e, g210Var.e) && this.f == g210Var.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + bh10.a(urd0.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewDeletedItem(id=");
        sb.append(this.b);
        sb.append(", productId=");
        sb.append(this.c);
        sb.append(", authorImg=");
        sb.append(this.d);
        sb.append(", userId=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
