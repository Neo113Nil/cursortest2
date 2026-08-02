package xsna;

import java.util.List;

/* compiled from: MarketAllAggregatedReviewsModel.kt */
/* loaded from: classes18.dex */
public final class vr00 {
    public final String a;
    public final int b;
    public final List<a610> c;
    public final String d;
    public final int e;
    public final List<df10> f;
    public final String g;
    public final int h;
    public final Integer i;
    public final List<cf10> j;
    public final boolean k;

    public vr00(String str, int i, List<a610> list, String str2, int i2, List<df10> list2, String str3, int i3, Integer num, List<cf10> list3, boolean z) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = str2;
        this.e = i2;
        this.f = list2;
        this.g = str3;
        this.h = i3;
        this.i = num;
        this.j = list3;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr00)) {
            return false;
        }
        vr00 vr00Var = (vr00) obj;
        return epx.f(this.a, vr00Var.a) && this.b == vr00Var.b && epx.f(this.c, vr00Var.c) && epx.f(this.d, vr00Var.d) && this.e == vr00Var.e && epx.f(this.f, vr00Var.f) && epx.f(this.g, vr00Var.g) && this.h == vr00Var.h && epx.f(this.i, vr00Var.i) && epx.f(this.j, vr00Var.j) && this.k == vr00Var.k;
    }

    public final int hashCode() {
        String str = this.a;
        int a = fw3.a(shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        String str2 = this.d;
        int a2 = fw3.a(shy.a(this.e, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f);
        String str3 = this.g;
        int a3 = shy.a(this.h, (a2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.i;
        return Boolean.hashCode(this.k) + fw3.a((a3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAllAggregatedReviewsModel(itemForReviewsTitle=");
        sb.append(this.a);
        sb.append(", itemForReviewsCount=");
        sb.append(this.b);
        sb.append(", itemsForReview=");
        sb.append(this.c);
        sb.append(", goodReviewsTitle=");
        sb.append(this.d);
        sb.append(", goodReviewsCount=");
        sb.append(this.e);
        sb.append(", goodItemReviews=");
        sb.append(this.f);
        sb.append(", communityReviewsTitle=");
        sb.append(this.g);
        sb.append(", communityReviewsCount=");
        sb.append(this.h);
        sb.append(", communityReviewsLastId=");
        sb.append(this.i);
        sb.append(", communityReviews=");
        sb.append(this.j);
        sb.append(", hasNextCommunityReviews=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
