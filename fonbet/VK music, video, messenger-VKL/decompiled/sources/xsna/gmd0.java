package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingState;
import com.vk.ecomm.market.good.good2.presentation.maininfo.ProductMarketItemType;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.xld0;

/* compiled from: ProductCardReducer.kt */
/* loaded from: classes18.dex */
public final class gmd0 implements bm50<nmd0, xld0> {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new c2c0(4));

    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bm50
    public final nmd0 a(nmd0 nmd0Var, xld0 xld0Var) {
        OwnerResponseTime ownerResponseTime;
        nmd0 nmd0Var2;
        cld0 cld0Var;
        boolean z;
        boolean z2;
        pld0 pld0Var;
        pld0 pld0Var2;
        String str;
        ProductMarketItemType productMarketItemType;
        ProductMarketItemType productMarketItemType2;
        nmd0 nmd0Var3 = nmd0Var;
        xld0 xld0Var2 = xld0Var;
        cld0 cld0Var2 = nmd0Var3.i;
        pld0 pld0Var3 = nmd0Var3.l;
        if (xld0Var2 instanceof xld0.f) {
            return nmd0.a(nmd0Var3, 0L, null, null, null, null, null, true, false, false, null, 253951);
        }
        if (!(xld0Var2 instanceof xld0.c)) {
            if (xld0Var2 instanceof xld0.e) {
                return nmd0.a(nmd0Var3, 0L, null, null, null, null, null, false, false, false, null, 245759);
            }
            if (xld0Var2 instanceof xld0.d) {
                return nmd0.a(nmd0Var3, 0L, null, null, null, null, ((xld0.d) xld0Var2).a, false, false, false, null, 260095);
            }
            if (xld0Var2 instanceof xld0.b) {
                return nmd0.a(nmd0Var3, 0L, cld0Var2 != null ? cld0.a(cld0Var2, ((xld0.b) xld0Var2).a) : null, null, null, null, null, false, false, false, null, 262015);
            }
            if (xld0Var2 instanceof xld0.a) {
                return nmd0.a(nmd0Var3, 0L, cld0Var2 != null ? cld0.a(cld0Var2, cld0Var2.b.size() + ((xld0.a) xld0Var2).a) : null, null, null, null, null, false, false, false, null, 262015);
            }
            if (xld0Var2 instanceof yld0) {
                yld0 yld0Var = (yld0) xld0Var2;
                ekd0 ekd0Var = nmd0Var3.j;
                ekd0 ekd0Var2 = ekd0Var != null ? new ekd0(ekd0Var.a, ekd0Var.b, ekd0Var.c, yld0Var.a, ekd0Var.e, ekd0Var.f, ekd0Var.g, ekd0Var.h, ekd0Var.i) : null;
                kkd0 kkd0Var = nmd0Var3.k;
                return nmd0.a(nmd0Var3, 0L, null, ekd0Var2, kkd0Var != null ? new kkd0(kkd0Var.a, kkd0Var.b, kkd0Var.c, kkd0Var.d, yld0Var.a, kkd0Var.f, kkd0Var.g) : null, null, null, false, false, false, null, 261375);
            }
            if (xld0Var2 instanceof zld0) {
                return nmd0.a(nmd0Var3, 0L, null, null, null, pld0Var3 != null ? pld0.a(pld0Var3, false, null, null, null, null, ((zld0) xld0Var2).a, false, null, null, null, false, 16351) : null, null, false, false, false, null, 261119);
            }
            if (xld0Var2 instanceof amd0) {
                return nmd0.a(nmd0Var3, 0L, null, null, null, pld0Var3 != null ? pld0.a(pld0Var3, false, null, null, null, null, false, false, null, null, null, ((amd0) xld0Var2).a, 15359) : null, null, false, false, false, null, 261119);
            }
            if (xld0Var2 instanceof bmd0) {
                return nmd0.a(nmd0Var3, 0L, null, null, null, null, null, false, ((bmd0) xld0Var2).a, false, null, 229375);
            }
            if (!(xld0Var2 instanceof wld0)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductCardBusinessOnboardingState productCardBusinessOnboardingState = nmd0Var3.s;
            return nmd0.a(nmd0Var3, 0L, null, null, null, null, null, false, false, false, productCardBusinessOnboardingState != null ? new ProductCardBusinessOnboardingState(productCardBusinessOnboardingState.b, productCardBusinessOnboardingState.c, productCardBusinessOnboardingState.d, productCardBusinessOnboardingState.e, false) : null, 131071);
        }
        d210 d210Var = ((xld0.c) xld0Var2).a;
        Good good = d210Var.a;
        long j = good != null ? good.b : nmd0Var3.c;
        List list = good != null ? good.A : null;
        if (list == null) {
            list = EmptyList.b;
        }
        Iterable iterable = d210Var.D;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            VideoRestriction O = ((VideoFile) next).O();
            if (O != null ? O.f : true) {
                arrayList.add(next);
            }
        }
        cld0 cld0Var3 = new cld0(list, arrayList, 0, good != null ? good.V : false);
        String str2 = d210Var.d;
        LinkedHashMap<String, lpd0> linkedHashMap = d210Var.J;
        Good good2 = d210Var.a;
        String str3 = d210Var.e;
        VerifyInfo verifyInfo = d210Var.s;
        boolean z3 = d210Var.y;
        String str4 = d210Var.h == 0 ? d210Var.f : null;
        Float f = d210Var.M;
        Integer num = d210Var.N;
        List<QuickMessageItem> list2 = d210Var.H;
        Iterable iterable2 = d210Var.w;
        if (iterable2 == null) {
            iterable2 = EmptyList.b;
        }
        Iterable iterable3 = iterable2;
        if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
            Iterator it2 = iterable3.iterator();
            while (it2.hasNext()) {
                if (((CallProducerButton) it2.next()).b == 0) {
                    ownerResponseTime = null;
                    break;
                }
            }
        }
        ownerResponseTime = d210Var.L;
        ekd0 ekd0Var3 = new ekd0(str2, str3, verifyInfo, z3, str4, f, num, list2, ownerResponseTime);
        boolean booleanValue = ((Boolean) this.a.getValue()).booleanValue();
        GroupMarketInfo.b bVar = d210Var.E;
        UserId userId = d210Var.b;
        Integer num2 = d210Var.z;
        int intValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = d210Var.A;
        kkd0 kkd0Var2 = new kkd0(userId, intValue, num3 != null ? num3.intValue() : 0, d210Var.B, d210Var.y, b210.a(good2, booleanValue) ? booleanValue ? bVar.e : bVar.d : bVar.c, good2 != null ? good2.V : false);
        if (pld0Var3 != null) {
            if (good2 == null) {
                nmd0Var2 = nmd0Var3;
                cld0Var = cld0Var3;
                z = true;
                z2 = false;
            } else {
                boolean z4 = good2.A != null ? !r6.isEmpty() : false;
                frd0 a = vld0.a(good2.h, linkedHashMap);
                boolean z5 = z4;
                String str5 = good2.d;
                String str6 = good2.a0;
                MarketItemRating marketItemRating = good2.t;
                uqd0 uqd0Var = marketItemRating != null ? new uqd0(marketItemRating.b, marketItemRating.c, marketItemRating.d) : null;
                boolean z6 = good2.J;
                Owner owner = good2.M;
                LinkedHashMap<String, lpd0> linkedHashMap2 = d210Var.J;
                MarketItemType marketItemType = good2.f;
                if (marketItemType != null) {
                    int h = marketItemType.h();
                    productMarketItemType2 = h != 1 ? h != 3 ? ProductMarketItemType.VK : ProductMarketItemType.OZON : ProductMarketItemType.VK;
                } else {
                    productMarketItemType2 = null;
                }
                nmd0Var2 = nmd0Var3;
                z = true;
                cld0Var = cld0Var3;
                z2 = false;
                pld0Var3 = pld0.a(pld0Var3, z5, a, str5, str6, uqd0Var, z6, d210Var.O, owner, linkedHashMap2, productMarketItemType2, false, 15360);
            }
            pld0Var2 = pld0Var3;
        } else {
            nmd0Var2 = nmd0Var3;
            cld0Var = cld0Var3;
            z = true;
            z2 = false;
            if (good2 == null || (str = good2.d) == null) {
                pld0Var = null;
            } else {
                boolean z7 = good2.A != null ? !r6.isEmpty() : false;
                frd0 a2 = vld0.a(good2.h, linkedHashMap);
                String str7 = good2.a0;
                MarketItemRating marketItemRating2 = good2.t;
                uqd0 uqd0Var2 = marketItemRating2 != null ? new uqd0(marketItemRating2.b, marketItemRating2.c, marketItemRating2.d) : null;
                boolean z8 = good2.J;
                Owner owner2 = good2.M;
                LinkedHashMap<String, lpd0> linkedHashMap3 = d210Var.J;
                MarketItemType marketItemType2 = good2.f;
                if (marketItemType2 != null) {
                    int h2 = marketItemType2.h();
                    productMarketItemType = h2 != 1 ? h2 != 3 ? ProductMarketItemType.VK : ProductMarketItemType.OZON : ProductMarketItemType.VK;
                } else {
                    productMarketItemType = null;
                }
                boolean z9 = d210Var.O;
                List<List<BaseImageDto>> list3 = d210Var.P;
                pld0Var = new pld0(z7, a2, str, str7, uqd0Var2, z8, z9, owner2, linkedHashMap3, productMarketItemType, false, list3, list3 != null ? j5g.H0(list3, 3) : null, d210Var.Q);
            }
            pld0Var2 = pld0Var;
        }
        return nmd0.a(nmd0Var2, j, cld0Var, ekd0Var3, kkd0Var2, pld0Var2, null, false, false, d210Var.r != null ? z : z2, null, 182397);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(xld0 xld0Var) {
        return true;
    }
}
