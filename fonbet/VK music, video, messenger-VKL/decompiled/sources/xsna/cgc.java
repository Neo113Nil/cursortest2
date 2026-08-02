package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;

/* compiled from: ClassifiedsCatalogParams.kt */
/* loaded from: classes18.dex */
public final class cgc {
    public final Integer a;
    public final String b;
    public final UserId c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final MarketAnalyticsParams g;

    public cgc() {
        this(null, null, false, null, null, 262143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgc)) {
            return false;
        }
        cgc cgcVar = (cgc) obj;
        return epx.f(this.a, cgcVar.a) && epx.f(this.b, cgcVar.b) && epx.f(this.c, cgcVar.c) && this.d == cgcVar.d && this.e == cgcVar.e && epx.f(this.f, cgcVar.f) && epx.f(this.g, cgcVar.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 961;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.c;
        int b = qoy.b(qoy.b((hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * (-1807454463), 31, this.d), 961, this.e);
        String str2 = this.f;
        int hashCode3 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketAnalyticsParams marketAnalyticsParams = this.g;
        return Boolean.hashCode(false) + ((hashCode3 + (marketAnalyticsParams == null ? 0 : marketAnalyticsParams.hashCode())) * 961);
    }

    public final String toString() {
        return "ClassifiedsCatalogParams(categoryId=" + this.a + ", sectionId=null, catalogContext=" + this.b + ", ownerId=" + this.c + ", distanceMax=null, priceMin=null, priceMax=null, statusId=null, latitude=null, longitude=null, locationName=null, openVoiceSearch=" + this.d + ", isSearchOnlyMode=" + this.e + ", searchQuery=null, searchSectionId=" + this.f + ", analyticsParams=" + this.g + ", albumId=null, albumEditStatus=false)";
    }

    public cgc(Integer num, UserId userId, boolean z, String str, MarketAnalyticsParams marketAnalyticsParams, int i) {
        num = (i & 1) != 0 ? null : num;
        String str2 = (i & 4) != 0 ? null : "market";
        userId = (i & 8) != 0 ? null : userId;
        z = (i & 2048) != 0 ? false : z;
        boolean z2 = (i & 4096) == 0;
        str = (i & 16384) != 0 ? null : str;
        marketAnalyticsParams = (i & 32768) != 0 ? null : marketAnalyticsParams;
        this.a = num;
        this.b = str2;
        this.c = userId;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = marketAnalyticsParams;
    }
}
