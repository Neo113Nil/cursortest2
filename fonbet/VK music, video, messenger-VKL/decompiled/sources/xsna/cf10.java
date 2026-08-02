package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import java.util.List;

/* compiled from: MarketUserReviewsCommunitiesReview.kt */
/* loaded from: classes18.dex */
public final class cf10 {
    public final int a;
    public final int b;
    public final String c;
    public final ReviewStatus d;
    public final String e;
    public final int f;
    public final int g;
    public final UsersUserDto h;
    public final String i;
    public final BaseImageDto j;
    public final List<List<BaseImageDto>> k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public cf10(int i, int i2, String str, ReviewStatus reviewStatus, String str2, int i3, int i4, UsersUserDto usersUserDto, String str3, BaseImageDto baseImageDto, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = reviewStatus;
        this.e = str2;
        this.f = i3;
        this.g = i4;
        this.h = usersUserDto;
        this.i = str3;
        this.j = baseImageDto;
        this.k = list;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
    }

    public static cf10 a(cf10 cf10Var, boolean z, boolean z2, int i) {
        return new cf10(cf10Var.a, cf10Var.b, cf10Var.c, cf10Var.d, cf10Var.e, cf10Var.f, cf10Var.g, cf10Var.h, cf10Var.i, cf10Var.j, cf10Var.k, (i & 2048) != 0 ? cf10Var.l : z, cf10Var.m, cf10Var.n, (i & 32768) != 0 ? cf10Var.o : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf10)) {
            return false;
        }
        cf10 cf10Var = (cf10) obj;
        return this.a == cf10Var.a && this.b == cf10Var.b && epx.f(this.c, cf10Var.c) && this.d == cf10Var.d && epx.f(this.e, cf10Var.e) && this.f == cf10Var.f && this.g == cf10Var.g && epx.f(this.h, cf10Var.h) && epx.f(this.i, cf10Var.i) && epx.f(this.j, cf10Var.j) && epx.f(this.k, cf10Var.k) && this.l == cf10Var.l && this.m == cf10Var.m && this.n == cf10Var.n && this.o == cf10Var.o;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + shy.a(this.g, shy.a(this.f, urd0.a((this.d.hashCode() + urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31), 31)) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseImageDto baseImageDto = this.j;
        int hashCode3 = (hashCode2 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.k;
        return Boolean.hashCode(this.o) + qoy.b(qoy.b(qoy.b(qoy.b((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.l), 31, this.m), 31, false), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsCommunitiesReview(id=");
        sb.append(this.a);
        sb.append(", communityId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", statusText=");
        sb.append(this.e);
        sb.append(", mark=");
        sb.append(this.f);
        sb.append(", date=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", comment=");
        sb.append(this.i);
        sb.append(", img=");
        sb.append(this.j);
        sb.append(", thumb=");
        sb.append(this.k);
        sb.append(", isExpanded=");
        sb.append(this.l);
        sb.append(", canEdit=");
        sb.append(this.m);
        sb.append(", canCopy=false, canDelete=");
        sb.append(this.n);
        sb.append(", isDeleted=");
        return defpackage.q0.a(sb, this.o, ')');
    }
}
