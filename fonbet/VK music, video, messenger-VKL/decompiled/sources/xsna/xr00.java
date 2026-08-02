package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import java.util.List;

/* compiled from: MarketAllReviewsCommunityReviewItem.kt */
/* loaded from: classes18.dex */
public final class xr00 implements hfz {
    public final int b;
    public final int c;
    public final List<BaseImageDto> d;
    public final String e;
    public final int f;
    public final List<y2u0> g;
    public final String h;
    public final boolean i;
    public final int j;
    public final ReviewStatus k;
    public final String l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final int r;

    public xr00(int i, int i2, List list, String str, int i3, List list2, String str2, boolean z, int i4, ReviewStatus reviewStatus, String str3, int i5, int i6, boolean z2, boolean z3, boolean z4, int i7) {
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = str;
        this.f = i3;
        this.g = list2;
        this.h = str2;
        this.i = z;
        this.j = i4;
        this.k = reviewStatus;
        this.l = str3;
        this.m = i5;
        this.n = i6;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr00)) {
            return false;
        }
        xr00 xr00Var = (xr00) obj;
        return this.b == xr00Var.b && this.c == xr00Var.c && epx.f(this.d, xr00Var.d) && epx.f(this.e, xr00Var.e) && this.f == xr00Var.f && epx.f(this.g, xr00Var.g) && epx.f(this.h, xr00Var.h) && this.i == xr00Var.i && this.j == xr00Var.j && this.k == xr00Var.k && epx.f(this.l, xr00Var.l) && this.m == xr00Var.m && this.n == xr00Var.n && this.o == xr00Var.o && this.p == xr00Var.p && this.q == xr00Var.q && this.r == xr00Var.r;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        List<BaseImageDto> list = this.d;
        int a2 = fw3.a(shy.a(this.f, urd0.a((a + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31), 31, this.g);
        String str = this.h;
        int hashCode = (this.k.hashCode() + shy.a(this.j, qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31)) * 31;
        String str2 = this.l;
        return Integer.hashCode(this.r) + qoy.b(qoy.b(qoy.b(shy.a(this.n, shy.a(this.m, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 961, 31), 31), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketAllReviewsCommunityReviewItem(id=");
        sb.append(this.b);
        sb.append(", communityId=");
        sb.append(this.c);
        sb.append(", communityImg=");
        sb.append(this.d);
        sb.append(", communityDisplayName=");
        sb.append(this.e);
        sb.append(", rating=");
        sb.append(this.f);
        sb.append(", images=");
        sb.append(this.g);
        sb.append(", reviewDescription=");
        sb.append(this.h);
        sb.append(", isExpanded=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", status=");
        sb.append(this.k);
        sb.append(", statusText=");
        sb.append(this.l);
        sb.append(", statusContentDescriptionText=, statusColor=");
        sb.append(this.m);
        sb.append(", backgroundResId=");
        sb.append(this.n);
        sb.append(", isShowActionButton=");
        sb.append(this.o);
        sb.append(", isShowForceEditButton=");
        sb.append(this.p);
        sb.append(", hasGoodItemsForReview=");
        sb.append(this.q);
        sb.append(", communityReviewsCount=");
        return vu5.b(sb, this.r, ')');
    }
}
