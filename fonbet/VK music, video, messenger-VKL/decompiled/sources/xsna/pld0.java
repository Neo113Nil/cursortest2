package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.market.good.good2.presentation.maininfo.ProductMarketItemType;
import java.util.List;
import java.util.Map;

/* compiled from: ProductCardMainInfoState.kt */
/* loaded from: classes18.dex */
public final class pld0 {
    public final boolean a;
    public final frd0 b;
    public final String c;
    public final String d;
    public final uqd0 e;
    public final boolean f;
    public final boolean g;
    public final Owner h;
    public final Map<String, lpd0> i;
    public final ProductMarketItemType j;
    public final boolean k;
    public final List<List<BaseImageDto>> l;
    public final List<List<BaseImageDto>> m;
    public final String n;

    /* JADX WARN: Multi-variable type inference failed */
    public pld0(boolean z, frd0 frd0Var, String str, String str2, uqd0 uqd0Var, boolean z2, boolean z3, Owner owner, Map<String, lpd0> map, ProductMarketItemType productMarketItemType, boolean z4, List<? extends List<BaseImageDto>> list, List<? extends List<BaseImageDto>> list2, String str3) {
        this.a = z;
        this.b = frd0Var;
        this.c = str;
        this.d = str2;
        this.e = uqd0Var;
        this.f = z2;
        this.g = z3;
        this.h = owner;
        this.i = map;
        this.j = productMarketItemType;
        this.k = z4;
        this.l = list;
        this.m = list2;
        this.n = str3;
    }

    public static pld0 a(pld0 pld0Var, boolean z, frd0 frd0Var, String str, String str2, uqd0 uqd0Var, boolean z2, boolean z3, Owner owner, Map map, ProductMarketItemType productMarketItemType, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? pld0Var.a : z;
        frd0 frd0Var2 = (i & 2) != 0 ? pld0Var.b : frd0Var;
        String str3 = (i & 4) != 0 ? pld0Var.c : str;
        String str4 = (i & 8) != 0 ? pld0Var.d : str2;
        uqd0 uqd0Var2 = (i & 16) != 0 ? pld0Var.e : uqd0Var;
        boolean z6 = (i & 32) != 0 ? pld0Var.f : z2;
        boolean z7 = (i & 64) != 0 ? pld0Var.g : z3;
        Owner owner2 = (i & 128) != 0 ? pld0Var.h : owner;
        Map map2 = (i & 256) != 0 ? pld0Var.i : map;
        ProductMarketItemType productMarketItemType2 = (i & 512) != 0 ? pld0Var.j : productMarketItemType;
        boolean z8 = (i & 1024) != 0 ? pld0Var.k : z4;
        List<List<BaseImageDto>> list = pld0Var.l;
        List<List<BaseImageDto>> list2 = pld0Var.m;
        String str5 = pld0Var.n;
        pld0Var.getClass();
        return new pld0(z5, frd0Var2, str3, str4, uqd0Var2, z6, z7, owner2, map2, productMarketItemType2, z8, list, list2, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pld0)) {
            return false;
        }
        pld0 pld0Var = (pld0) obj;
        return this.a == pld0Var.a && epx.f(this.b, pld0Var.b) && epx.f(this.c, pld0Var.c) && epx.f(this.d, pld0Var.d) && epx.f(this.e, pld0Var.e) && this.f == pld0Var.f && this.g == pld0Var.g && epx.f(this.h, pld0Var.h) && epx.f(this.i, pld0Var.i) && this.j == pld0Var.j && this.k == pld0Var.k && epx.f(this.l, pld0Var.l) && epx.f(this.m, pld0Var.m) && epx.f(this.n, pld0Var.n);
    }

    public final int hashCode() {
        int a = urd0.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        uqd0 uqd0Var = this.e;
        int b = qoy.b(qoy.b((hashCode + (uqd0Var == null ? 0 : uqd0Var.hashCode())) * 31, 31, this.f), 31, this.g);
        Owner owner = this.h;
        int hashCode2 = (b + (owner == null ? 0 : owner.hashCode())) * 31;
        Map<String, lpd0> map = this.i;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        ProductMarketItemType productMarketItemType = this.j;
        int b2 = qoy.b((hashCode3 + (productMarketItemType == null ? 0 : productMarketItemType.hashCode())) * 31, 31, this.k);
        List<List<BaseImageDto>> list = this.l;
        int hashCode4 = (b2 + (list == null ? 0 : list.hashCode())) * 31;
        List<List<BaseImageDto>> list2 = this.m;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.n;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCardMainInfoState(hasPhoto=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", serviceDurationText=");
        sb.append(this.d);
        sb.append(", marketItemRating=");
        sb.append(this.e);
        sb.append(", isFave=");
        sb.append(this.f);
        sb.append(", isShowReviews=");
        sb.append(this.g);
        sb.append(", owner=");
        sb.append(this.h);
        sb.append(", labels=");
        sb.append(this.i);
        sb.append(", itemType=");
        sb.append(this.j);
        sb.append(", canAddReview=");
        sb.append(this.k);
        sb.append(", reviewThumbs=");
        sb.append(this.l);
        sb.append(", reviewThumbsDisplayed=");
        sb.append(this.m);
        sb.append(", integrationType=");
        return ho8.a(sb, this.n, ')');
    }
}
