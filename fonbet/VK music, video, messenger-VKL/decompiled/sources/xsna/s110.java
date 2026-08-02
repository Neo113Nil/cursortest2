package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemForReviewItem.kt */
/* loaded from: classes18.dex */
public final class s110 {
    public final long a;
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    public s110(long j, UserId userId, String str, String str2, String str3, int i, boolean z) {
        this.a = j;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s110)) {
            return false;
        }
        s110 s110Var = (s110) obj;
        return this.a == s110Var.a && epx.f(this.b, s110Var.b) && epx.f(this.c, s110Var.c) && epx.f(this.d, s110Var.d) && epx.f(this.e, s110Var.e) && this.f == s110Var.f && this.g == s110Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + shy.a(this.f, urd0.a(urd0.a(urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemForReviewItem(itemId=");
        sb.append(this.a);
        sb.append(", communityId=");
        sb.append(this.b);
        sb.append(", productImageUrl=");
        sb.append(this.c);
        sb.append(", productName=");
        sb.append(this.d);
        sb.append(", productCategory=");
        sb.append(this.e);
        sb.append(", rating=");
        sb.append(this.f);
        sb.append(", isReviewed=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
