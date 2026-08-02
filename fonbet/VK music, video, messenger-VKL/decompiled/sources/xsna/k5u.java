package xsna;

import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.dto.common.Price;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.RelatedCategoryItem;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: GoodPageData.kt */
/* loaded from: classes18.dex */
public final class k5u {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Price e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public final List<String> i;
    public final List<Object> j;
    public final GroupMarketInfo.b k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final List<RelatedCategoryItem> p;
    public final List<QuickMessageItem> q;
    public final List<MarketProductLinkedContentItemDto> r;
    public final Integer s;
    public final OwnerResponseTime t;
    public final LinkedHashMap<String, lpd0> u;
    public final Float v;
    public final Integer w;

    public k5u(String str, String str2, String str3, String str4, Price price, Integer num, Integer num2, boolean z, List<String> list, List<Object> list2, GroupMarketInfo.b bVar, boolean z2, boolean z3, String str5, String str6, List<RelatedCategoryItem> list3, List<QuickMessageItem> list4, List<MarketProductLinkedContentItemDto> list5, Integer num3, OwnerResponseTime ownerResponseTime, LinkedHashMap<String, lpd0> linkedHashMap, Float f, Integer num4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = price;
        this.f = num;
        this.g = num2;
        this.h = z;
        this.i = list;
        this.j = list2;
        this.k = bVar;
        this.l = z2;
        this.m = z3;
        this.n = str5;
        this.o = str6;
        this.p = list3;
        this.q = list4;
        this.r = list5;
        this.s = num3;
        this.t = ownerResponseTime;
        this.u = linkedHashMap;
        this.v = f;
        this.w = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5u)) {
            return false;
        }
        k5u k5uVar = (k5u) obj;
        return epx.f(this.a, k5uVar.a) && epx.f(this.b, k5uVar.b) && epx.f(this.c, k5uVar.c) && epx.f(this.d, k5uVar.d) && epx.f(this.e, k5uVar.e) && epx.f(this.f, k5uVar.f) && epx.f(this.g, k5uVar.g) && this.h == k5uVar.h && epx.f(this.i, k5uVar.i) && epx.f(this.j, k5uVar.j) && epx.f(this.k, k5uVar.k) && this.l == k5uVar.l && this.m == k5uVar.m && epx.f(this.n, k5uVar.n) && epx.f(this.o, k5uVar.o) && epx.f(this.p, k5uVar.p) && epx.f(this.q, k5uVar.q) && epx.f(this.r, k5uVar.r) && epx.f(this.s, k5uVar.s) && epx.f(this.t, k5uVar.t) && epx.f(this.u, k5uVar.u) && epx.f(this.v, k5uVar.v) && epx.f(this.w, k5uVar.w);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Price price = this.e;
        int hashCode5 = (hashCode4 + (price == null ? 0 : price.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int b = qoy.b((hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.h);
        List<String> list = this.i;
        int hashCode7 = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.j;
        int b2 = qoy.b(qoy.b((this.k.hashCode() + ((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31, 31, this.l), 31, this.m);
        String str5 = this.n;
        int a = urd0.a((b2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.o);
        List<RelatedCategoryItem> list3 = this.p;
        int hashCode8 = (a + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<QuickMessageItem> list4 = this.q;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MarketProductLinkedContentItemDto> list5 = this.r;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num3 = this.s;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        OwnerResponseTime ownerResponseTime = this.t;
        int hashCode12 = (hashCode11 + (ownerResponseTime == null ? 0 : ownerResponseTime.hashCode())) * 31;
        LinkedHashMap<String, lpd0> linkedHashMap = this.u;
        int hashCode13 = (hashCode12 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        Float f = this.v;
        int hashCode14 = (hashCode13 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num4 = this.w;
        return hashCode14 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodPageData(groupName=");
        sb.append(this.a);
        sb.append(", groupPhoto=");
        sb.append(this.b);
        sb.append(", wikiUrl=");
        sb.append(this.c);
        sb.append(", wikiTitle=");
        sb.append(this.d);
        sb.append(", minOrderPrice=");
        sb.append(this.e);
        sb.append(", membersCount=");
        sb.append(this.f);
        sb.append(", friendsCount=");
        sb.append(this.g);
        sb.append(", isSubscribed=");
        sb.append(this.h);
        sb.append(", photos=");
        sb.append(this.i);
        sb.append(", similarItems=");
        sb.append(this.j);
        sb.append(", shopConditionsState=");
        sb.append(this.k);
        sb.append(", canEdit=");
        sb.append(this.l);
        sb.append(", isNeedGroupDescription=");
        sb.append(this.m);
        sb.append(", groupDescription=");
        sb.append(this.n);
        sb.append(", relatedCategoriesTitle=");
        sb.append(this.o);
        sb.append(", relatedCategories=");
        sb.append(this.p);
        sb.append(", quickMessages=");
        sb.append(this.q);
        sb.append(", linkedContentItems=");
        sb.append(this.r);
        sb.append(", linkedContentTotalCount=");
        sb.append(this.s);
        sb.append(", ownerResponseTime=");
        sb.append(this.t);
        sb.append(", labels=");
        sb.append(this.u);
        sb.append(", communityRating=");
        sb.append(this.v);
        sb.append(", communityRatingCount=");
        return uqi.b(sb, this.w, ')');
    }
}
