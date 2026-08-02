package xsna;

import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import java.util.List;
import java.util.Map;

/* compiled from: CommunityReviewsListScreenModel.kt */
/* loaded from: classes18.dex */
public final class hzh {
    public final Map<Integer, txh> a;
    public final Float b;
    public final ReviewsSort c;
    public final int d;
    public final List<dye0> e;
    public final boolean f;
    public final int g;
    public final List<vd10> h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public hzh(Map<Integer, txh> map, Float f, ReviewsSort reviewsSort, int i, List<dye0> list, boolean z, int i2, List<vd10> list2, Integer num, Integer num2, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6) {
        this.a = map;
        this.b = f;
        this.c = reviewsSort;
        this.d = i;
        this.e = list;
        this.f = z;
        this.g = i2;
        this.h = list2;
        this.i = num;
        this.j = num2;
        this.k = z2;
        this.l = z3;
        this.m = str;
        this.n = z4;
        this.o = z5;
        this.p = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzh)) {
            return false;
        }
        hzh hzhVar = (hzh) obj;
        return epx.f(this.a, hzhVar.a) && epx.f(this.b, hzhVar.b) && this.c == hzhVar.c && this.d == hzhVar.d && epx.f(this.e, hzhVar.e) && this.f == hzhVar.f && this.g == hzhVar.g && epx.f(this.h, hzhVar.h) && epx.f(this.i, hzhVar.i) && epx.f(this.j, hzhVar.j) && this.k == hzhVar.k && this.l == hzhVar.l && epx.f(this.m, hzhVar.m) && this.n == hzhVar.n && this.o == hzhVar.o && this.p == hzhVar.p;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int a = fw3.a(shy.a(this.g, qoy.b(fw3.a(shy.a(this.d, (this.c.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31, 31), 31, this.e), 31, this.f), 31), 31, this.h);
        Integer num = this.i;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        return Boolean.hashCode(this.p) + qoy.b(qoy.b(urd0.a(qoy.b(qoy.b((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsListScreenModel(items=");
        sb.append(this.a);
        sb.append(", communityRating=");
        sb.append(this.b);
        sb.append(", sort=");
        sb.append(this.c);
        sb.append(", reviewsCount=");
        sb.append(this.d);
        sb.append(", marksStat=");
        sb.append(this.e);
        sb.append(", nextPageLoading=");
        sb.append(this.f);
        sb.append(", reviewFriendsTotal=");
        sb.append(this.g);
        sb.append(", reviewFriends=");
        sb.append(this.h);
        sb.append(", reviewIdToReply=");
        sb.append(this.i);
        sb.append(", replyIdToReply=");
        sb.append(this.j);
        sb.append(", isPaginationError=");
        sb.append(this.k);
        sb.append(", showYClientsImport=");
        sb.append(this.l);
        sb.append(", reviewsFaq=");
        sb.append(this.m);
        sb.append(", isAdmin=");
        sb.append(this.n);
        sb.append(", hasPinnedReview=");
        sb.append(this.o);
        sb.append(", canShowHint=");
        return defpackage.q0.a(sb, this.p, ')');
    }
}
