package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ItemStatus;
import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import java.util.List;

/* compiled from: MarketUserReviewsItemsReview.kt */
/* loaded from: classes18.dex */
public final class df10 {
    public final String a;
    public final ReviewStatus b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final UserId g;
    public final int h;
    public final int i;
    public final UsersUserDto j;
    public final BaseImageDto k;
    public final String l;
    public final String m;
    public final String n;
    public final List<List<BaseImageDto>> o;
    public final ItemStatus p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    /* JADX WARN: Multi-variable type inference failed */
    public df10(String str, ReviewStatus reviewStatus, String str2, String str3, int i, long j, UserId userId, int i2, int i3, UsersUserDto usersUserDto, BaseImageDto baseImageDto, String str4, String str5, String str6, List<? extends List<BaseImageDto>> list, ItemStatus itemStatus, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = reviewStatus;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j;
        this.g = userId;
        this.h = i2;
        this.i = i3;
        this.j = usersUserDto;
        this.k = baseImageDto;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = list;
        this.p = itemStatus;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = z4;
    }

    public static df10 a(df10 df10Var, boolean z, boolean z2, int i) {
        ItemStatus itemStatus;
        String str = df10Var.a;
        ReviewStatus reviewStatus = df10Var.b;
        String str2 = df10Var.c;
        String str3 = df10Var.d;
        int i2 = df10Var.e;
        long j = df10Var.f;
        UserId userId = df10Var.g;
        int i3 = df10Var.h;
        int i4 = df10Var.i;
        UsersUserDto usersUserDto = df10Var.j;
        BaseImageDto baseImageDto = df10Var.k;
        String str4 = df10Var.l;
        String str5 = df10Var.m;
        String str6 = df10Var.n;
        List<List<BaseImageDto>> list = df10Var.o;
        ItemStatus itemStatus2 = df10Var.p;
        if ((i & 65536) != 0) {
            itemStatus = itemStatus2;
            z = df10Var.q;
        } else {
            itemStatus = itemStatus2;
        }
        return new df10(str, reviewStatus, str2, str3, i2, j, userId, i3, i4, usersUserDto, baseImageDto, str4, str5, str6, list, itemStatus, z, df10Var.r, df10Var.s, (i & 524288) != 0 ? df10Var.t : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df10)) {
            return false;
        }
        df10 df10Var = (df10) obj;
        return epx.f(this.a, df10Var.a) && this.b == df10Var.b && epx.f(this.c, df10Var.c) && epx.f(this.d, df10Var.d) && this.e == df10Var.e && this.f == df10Var.f && epx.f(this.g, df10Var.g) && this.h == df10Var.h && this.i == df10Var.i && epx.f(this.j, df10Var.j) && epx.f(this.k, df10Var.k) && epx.f(this.l, df10Var.l) && epx.f(this.m, df10Var.m) && epx.f(this.n, df10Var.n) && epx.f(this.o, df10Var.o) && this.p == df10Var.p && this.q == df10Var.q && this.r == df10Var.r && this.s == df10Var.s && this.t == df10Var.t;
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.e, urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31), 31, this.f);
        UserId userId = this.g;
        int hashCode = (this.j.hashCode() + shy.a(this.i, shy.a(this.h, (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31), 31)) * 31;
        BaseImageDto baseImageDto = this.k;
        int hashCode2 = (hashCode + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        String str = this.l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.o;
        return Boolean.hashCode(this.t) + qoy.b(qoy.b(qoy.b((this.p.hashCode() + ((hashCode5 + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketUserReviewsItemsReview(name=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", statusText=");
        sb.append(this.c);
        sb.append(", fullItemReviewId=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", itemId=");
        sb.append(this.f);
        sb.append(", ownerId=");
        sb.append(this.g);
        sb.append(", rating=");
        sb.append(this.h);
        sb.append(", date=");
        sb.append(this.i);
        sb.append(", user=");
        sb.append(this.j);
        sb.append(", img=");
        sb.append(this.k);
        sb.append(", pros=");
        sb.append(this.l);
        sb.append(", cons=");
        sb.append(this.m);
        sb.append(", comment=");
        sb.append(this.n);
        sb.append(", thumb=");
        sb.append(this.o);
        sb.append(", itemStatus=");
        sb.append(this.p);
        sb.append(", isExpanded=");
        sb.append(this.q);
        sb.append(", canUpdate=");
        sb.append(this.r);
        sb.append(", canDelete=");
        sb.append(this.s);
        sb.append(", isDeleted=");
        return defpackage.q0.a(sb, this.t, ')');
    }
}
