package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewData.kt */
/* loaded from: classes18.dex */
public final class f210 {
    public final UserId a;
    public final int b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public f210(UserId userId, int i, long j, String str, boolean z, boolean z2, boolean z3) {
        this.a = userId;
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f210)) {
            return false;
        }
        f210 f210Var = (f210) obj;
        return epx.f(this.a, f210Var.a) && this.b == f210Var.b && this.c == f210Var.c && epx.f(this.d, f210Var.d) && this.e == f210Var.e && this.f == f210Var.f && this.g == f210Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(urd0.a(bh10.a(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewData(reviewAuthorId=");
        sb.append(this.a);
        sb.append(", reviewId=");
        sb.append(this.b);
        sb.append(", productId=");
        sb.append(this.c);
        sb.append(", reviewText=");
        sb.append(this.d);
        sb.append(", canEdit=");
        sb.append(this.e);
        sb.append(", canDelete=");
        sb.append(this.f);
        sb.append(", canReply=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
