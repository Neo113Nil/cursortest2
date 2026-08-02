package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingState;
import com.vk.ecomm.market.good.good2.presentation.restrictions.ProductCardRestrictions;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ProductCardState.kt */
/* loaded from: classes18.dex */
public final class nmd0 implements lm50 {
    public final UserId b;
    public final long c;
    public final String d;
    public final GoodFragmentAnalyticsParams e;
    public final CommonMarketStat$TypeRefSource f;
    public final String g;
    public final MobileOfficialAppsCoreNavStat$EventScreen h;
    public final cld0 i;
    public final ekd0 j;
    public final kkd0 k;
    public final pld0 l;
    public final ProductCardRestrictions m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final ProductCardBusinessOnboardingState s;

    public nmd0(UserId userId, long j, String str, GoodFragmentAnalyticsParams goodFragmentAnalyticsParams, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, cld0 cld0Var, ekd0 ekd0Var, kkd0 kkd0Var, pld0 pld0Var, ProductCardRestrictions productCardRestrictions, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ProductCardBusinessOnboardingState productCardBusinessOnboardingState) {
        this.b = userId;
        this.c = j;
        this.d = str;
        this.e = goodFragmentAnalyticsParams;
        this.f = commonMarketStat$TypeRefSource;
        this.g = str2;
        this.h = mobileOfficialAppsCoreNavStat$EventScreen;
        this.i = cld0Var;
        this.j = ekd0Var;
        this.k = kkd0Var;
        this.l = pld0Var;
        this.m = productCardRestrictions;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = productCardBusinessOnboardingState;
    }

    public static nmd0 a(nmd0 nmd0Var, long j, cld0 cld0Var, ekd0 ekd0Var, kkd0 kkd0Var, pld0 pld0Var, ProductCardRestrictions productCardRestrictions, boolean z, boolean z2, boolean z3, ProductCardBusinessOnboardingState productCardBusinessOnboardingState, int i) {
        UserId userId = nmd0Var.b;
        long j2 = (i & 2) != 0 ? nmd0Var.c : j;
        String str = nmd0Var.d;
        long j3 = j2;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = nmd0Var.e;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = nmd0Var.f;
        String str2 = nmd0Var.g;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = nmd0Var.h;
        cld0 cld0Var2 = (i & 128) != 0 ? nmd0Var.i : cld0Var;
        ekd0 ekd0Var2 = (i & 256) != 0 ? nmd0Var.j : ekd0Var;
        kkd0 kkd0Var2 = (i & 512) != 0 ? nmd0Var.k : kkd0Var;
        pld0 pld0Var2 = (i & 1024) != 0 ? nmd0Var.l : pld0Var;
        ProductCardRestrictions productCardRestrictions2 = (i & 2048) != 0 ? nmd0Var.m : productCardRestrictions;
        boolean z4 = (i & 4096) != 0 ? nmd0Var.n : false;
        boolean z5 = (i & 8192) != 0 ? nmd0Var.o : z;
        boolean z6 = (i & 16384) != 0 ? nmd0Var.p : false;
        boolean z7 = (32768 & i) != 0 ? nmd0Var.q : z2;
        boolean z8 = (65536 & i) != 0 ? nmd0Var.r : z3;
        ProductCardBusinessOnboardingState productCardBusinessOnboardingState2 = (i & 131072) != 0 ? nmd0Var.s : productCardBusinessOnboardingState;
        nmd0Var.getClass();
        return new nmd0(userId, j3, str, goodFragmentAnalyticsParams, commonMarketStat$TypeRefSource, str2, mobileOfficialAppsCoreNavStat$EventScreen, cld0Var2, ekd0Var2, kkd0Var2, pld0Var2, productCardRestrictions2, z4, z5, z6, z7, z8, productCardBusinessOnboardingState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd0)) {
            return false;
        }
        nmd0 nmd0Var = (nmd0) obj;
        return epx.f(this.b, nmd0Var.b) && this.c == nmd0Var.c && epx.f(this.d, nmd0Var.d) && epx.f(this.e, nmd0Var.e) && this.f == nmd0Var.f && epx.f(this.g, nmd0Var.g) && this.h == nmd0Var.h && epx.f(this.i, nmd0Var.i) && epx.f(this.j, nmd0Var.j) && epx.f(this.k, nmd0Var.k) && epx.f(this.l, nmd0Var.l) && this.m == nmd0Var.m && this.n == nmd0Var.n && this.o == nmd0Var.o && this.p == nmd0Var.p && this.q == nmd0Var.q && this.r == nmd0Var.r && epx.f(this.s, nmd0Var.s);
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = this.e;
        int hashCode2 = (hashCode + (goodFragmentAnalyticsParams == null ? 0 : goodFragmentAnalyticsParams.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.f;
        int hashCode3 = (hashCode2 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.h;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        cld0 cld0Var = this.i;
        int hashCode6 = (hashCode5 + (cld0Var == null ? 0 : cld0Var.hashCode())) * 31;
        ekd0 ekd0Var = this.j;
        int hashCode7 = (hashCode6 + (ekd0Var == null ? 0 : ekd0Var.hashCode())) * 31;
        kkd0 kkd0Var = this.k;
        int hashCode8 = (hashCode7 + (kkd0Var == null ? 0 : kkd0Var.hashCode())) * 31;
        pld0 pld0Var = this.l;
        int hashCode9 = (hashCode8 + (pld0Var == null ? 0 : pld0Var.hashCode())) * 31;
        ProductCardRestrictions productCardRestrictions = this.m;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode9 + (productCardRestrictions == null ? 0 : productCardRestrictions.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        ProductCardBusinessOnboardingState productCardBusinessOnboardingState = this.s;
        return b + (productCardBusinessOnboardingState != null ? productCardBusinessOnboardingState.hashCode() : 0);
    }

    public final String toString() {
        return "ProductCardState(groupId=" + this.b + ", productId=" + this.c + ", accessKey=" + this.d + ", analyticParams=" + this.e + ", source=" + this.f + ", adsLabel=" + this.g + ", previousScreen=" + this.h + ", gallery=" + this.i + ", communityInfo=" + this.j + ", communityMarketInfo=" + this.k + ", mainInfo=" + this.l + ", restrictions=" + this.m + ", isLoading=" + this.n + ", isRefreshing=" + this.o + ", isBlockingProgress=" + this.p + ", isReviewInProgress=" + this.q + ", containsOtherProductsBlock=" + this.r + ", businessOnboardingState=" + this.s + ')';
    }
}
