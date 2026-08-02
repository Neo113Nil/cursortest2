package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: ClassifiedsCatalogSimpleParams.kt */
/* loaded from: classes18.dex */
public final class ngc {
    public final Integer a;
    public final String b;
    public final String c;
    public final UserId d;
    public final Long e;
    public final Long f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final String k;
    public final MarketAnalyticsParams l;
    public final Integer m;
    public final boolean n;
    public final String o;
    public final boolean p;

    public ngc() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 4194303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngc)) {
            return false;
        }
        ngc ngcVar = (ngc) obj;
        return epx.f(this.a, ngcVar.a) && epx.f(this.b, ngcVar.b) && epx.f(this.c, ngcVar.c) && epx.f(this.d, ngcVar.d) && epx.f(this.e, ngcVar.e) && epx.f(this.f, ngcVar.f) && epx.f(this.g, ngcVar.g) && epx.f(this.h, ngcVar.h) && epx.f(this.i, ngcVar.i) && epx.f(this.j, ngcVar.j) && epx.f(this.k, ngcVar.k) && epx.f(this.l, ngcVar.l) && epx.f(this.m, ngcVar.m) && this.n == ngcVar.n && epx.f(this.o, ngcVar.o) && this.p == ngcVar.p;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 961;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.d;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 961;
        Long l = this.e;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 923521;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketAnalyticsParams marketAnalyticsParams = this.l;
        int hashCode12 = (hashCode11 + (marketAnalyticsParams == null ? 0 : marketAnalyticsParams.hashCode())) * 31;
        Integer num2 = this.m;
        int b = qoy.b((hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.n);
        String str5 = this.o;
        return Boolean.hashCode(this.p) + ((b + (str5 != null ? str5.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsCatalogSimpleParams(categoryId=");
        sb.append(this.a);
        sb.append(", itemId=null, sectionId=");
        sb.append(this.b);
        sb.append(", catalogContext=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", distanceMax=null, priceMin=");
        sb.append(this.e);
        sb.append(", priceMax=");
        sb.append(this.f);
        sb.append(", statusId=");
        sb.append(this.g);
        sb.append(", latitude=null, longitude=null, locationName=null, discountEnabled=");
        sb.append(this.h);
        sb.append(", friendsReviewsEnabled=");
        sb.append(this.i);
        sb.append(", friendsWishlistEnabled=");
        sb.append(this.j);
        sb.append(", sortingOptionId=");
        sb.append(this.k);
        sb.append(", analyticsParams=");
        sb.append(this.l);
        sb.append(", albumId=");
        sb.append(this.m);
        sb.append(", albumEditStatus=");
        sb.append(this.n);
        sb.append(", title=");
        sb.append(this.o);
        sb.append(", query=null, isShowAllFragment=");
        return defpackage.q0.a(sb, this.p, ')');
    }

    public ngc(Integer num, String str, UserId userId, Long l, Long l2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, MarketAnalyticsParams marketAnalyticsParams, Integer num2, boolean z, String str4, int i) {
        Integer num3 = (i & 1) != 0 ? null : num;
        String str5 = (i & 4) != 0 ? null : str;
        String str6 = (i & 8) != 0 ? null : "market";
        UserId userId2 = (i & 16) != 0 ? null : userId;
        Long l3 = (i & 64) != 0 ? null : l;
        Long l4 = (i & 128) != 0 ? null : l2;
        String str7 = (i & 256) != 0 ? null : str2;
        Boolean bool4 = (i & 4096) != 0 ? null : bool;
        Boolean bool5 = (i & 8192) != 0 ? null : bool2;
        Boolean bool6 = (i & 16384) != 0 ? null : bool3;
        String str8 = (32768 & i) != 0 ? null : str3;
        MarketAnalyticsParams marketAnalyticsParams2 = (65536 & i) != 0 ? null : marketAnalyticsParams;
        Integer num4 = (131072 & i) != 0 ? null : num2;
        boolean z2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z;
        String str9 = (i & 524288) != 0 ? null : str4;
        boolean z3 = (i & 2097152) == 0;
        this.a = num3;
        this.b = str5;
        this.c = str6;
        this.d = userId2;
        this.e = l3;
        this.f = l4;
        this.g = str7;
        this.h = bool4;
        this.i = bool5;
        this.j = bool6;
        this.k = str8;
        this.l = marketAnalyticsParams2;
        this.m = num4;
        this.n = z2;
        this.o = str9;
        this.p = z3;
    }
}
