package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.good2.presentation.maininfo.ProductMarketItemType;
import com.vk.stat.scheme.CommonMarketStat$ProductCardFomoLabels;
import com.vk.stat.scheme.CommonMarketStat$RatingType;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketFomoLabelClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemRatingItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRatingBlockItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRatingClick;
import com.vk.stat.scheme.CommonMarketStat$TypeRatingPhotosItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRatingView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.hzp0;
import xsna.mt00;

/* compiled from: ProductCardMainInfoAnalyticsMiddleware.kt */
/* loaded from: classes18.dex */
public final class jld0 implements h7f0<nmd0, ejd0, on50, smd0, xld0, tkd0> {
    public final sl50<nmd0, ejd0, on50, smd0, xld0, tkd0> b;
    public final rkd0 c;
    public final bpn0 d = new bpn0(new jo60(4));

    /* compiled from: ProductCardMainInfoAnalyticsMiddleware.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductMarketItemType.values().length];
            try {
                iArr[ProductMarketItemType.OZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductMarketItemType.VK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jld0(sl50<nmd0, ejd0, on50, smd0, xld0, tkd0> sl50Var, rkd0 rkd0Var) {
        this.b = sl50Var;
        this.c = rkd0Var;
    }

    public static CommonMarketStat$RatingType a(ProductMarketItemType productMarketItemType) {
        int i = productMarketItemType == null ? -1 : a.$EnumSwitchMapping$0[productMarketItemType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return CommonMarketStat$RatingType.OZON_ITEM;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CommonMarketStat$RatingType.ITEM;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        pld0 pld0Var;
        uqd0 uqd0Var;
        int size;
        pld0 pld0Var2;
        uqd0 uqd0Var2;
        Map<String, lpd0> map;
        lpd0 lpd0Var;
        ejd0 ejd0Var = (ejd0) lj50Var;
        if (ejd0Var instanceof ejd0.f.a) {
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = ((nmd0) getCurrentState()).e;
            mt00.h(new mt00.a((int) ((nmd0) getCurrentState()).c, ((nmd0) getCurrentState()).b, ((ejd0.f.a) ejd0Var).b, ((nmd0) getCurrentState()).f, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.g : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.b : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.c : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.d : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.e : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, 6144));
            return;
        }
        if (ejd0Var instanceof ejd0.f.c) {
            String str = ((ejd0.f.c) ejd0Var).b;
            pld0 pld0Var3 = ((nmd0) getCurrentState()).l;
            if (pld0Var3 == null || (map = pld0Var3.i) == null || (lpd0Var = map.get(str)) == null) {
                if (epx.f(str, "review_unique_id")) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(((nmd0) getCurrentState()).c), Long.valueOf(((nmd0) getCurrentState()).b.b), null, null, null, 56, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketFomoLabelClickItem(new CommonMarketStat$ProductCardFomoLabels(Collections.singletonList(CampaignEx.JSON_KEY_STAR), Collections.singletonList(-1))), 63), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                    c();
                    return;
                }
                return;
            }
            long j = ((nmd0) getCurrentState()).c;
            UserId userId = ((nmd0) getCurrentState()).b;
            List singletonList = Collections.singletonList(lpd0Var.c);
            Integer num = lpd0Var.g;
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(userId.b), null, null, null, 56, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketFomoLabelClickItem(new CommonMarketStat$ProductCardFomoLabels(singletonList, Collections.singletonList(Integer.valueOf(num != null ? num.intValue() : -1)))), 63), 2);
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var2 = UiTracker.h;
            uzp0Var2.getClass();
            new bjc(c2, b2, uzp0Var2.a).q();
            return;
        }
        if (ejd0Var instanceof ejd0.f.e) {
            c();
            return;
        }
        boolean z = ejd0Var instanceof ejd0.f.C2819f;
        bpn0 bpn0Var = this.d;
        rkd0 rkd0Var = this.c;
        if (!z) {
            if (!(ejd0Var instanceof ejd0.f.g) || !((Boolean) bpn0Var.getValue()).booleanValue() || (pld0Var = ((nmd0) getCurrentState()).l) == null || (uqd0Var = pld0Var.e) == null) {
                return;
            }
            long j2 = ((nmd0) getCurrentState()).c;
            long j3 = ((nmd0) getCurrentState()).b.b;
            CommonMarketStat$RatingType a2 = a(pld0Var.j);
            List<List<BaseImageDto>> list = pld0Var.m;
            size = list != null ? list.size() : 0;
            b8u b8uVar = (b8u) rkd0Var.N.getValue();
            String str2 = pld0Var.n;
            Integer valueOf = Integer.valueOf(size);
            Float f = uqd0Var.a;
            Integer num2 = uqd0Var.b;
            b8uVar.getClass();
            new hzp0.q(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j2), Long.valueOf(j3), null, null, null, 56, null), new CommonMarketStat$TypeRatingView(CommonMarketStat$TypeRatingView.Type.TYPE_RATING_SHOW_BLOCK, null, new CommonMarketStat$TypeRatingBlockItem(j3, Long.valueOf(j2), a2, str2, valueOf, f, num2), 2, null)).a();
            return;
        }
        if (!((Boolean) bpn0Var.getValue()).booleanValue() || (pld0Var2 = ((nmd0) getCurrentState()).l) == null || (uqd0Var2 = pld0Var2.e) == null) {
            return;
        }
        CommonMarketStat$RatingType a3 = a(pld0Var2.j);
        List<List<BaseImageDto>> list2 = pld0Var2.m;
        size = list2 != null ? list2.size() : 0;
        b8u b8uVar2 = (b8u) rkd0Var.N.getValue();
        long j4 = ((nmd0) getCurrentState()).c;
        long j5 = ((nmd0) getCurrentState()).b.b;
        String str3 = pld0Var2.n;
        Integer valueOf2 = Integer.valueOf(size);
        Float f2 = uqd0Var2.a;
        Integer num3 = uqd0Var2.b;
        b8uVar2.getClass();
        SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(j4), Long.valueOf(j5), null, null, null, 56, null), CommonMarketStat$TypeRatingClick.a.a(new CommonMarketStat$TypeRatingPhotosItem(j5, Long.valueOf(j4), a3, str3, valueOf2, f2, num3)), 2);
        UiTracker uiTracker3 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
        uzp0 uzp0Var3 = UiTracker.h;
        uzp0Var3.getClass();
        new bjc(c3, b3, uzp0Var3.a).q();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void c() {
        Integer num;
        uqd0 uqd0Var;
        boolean booleanValue = ((Boolean) this.d.getValue()).booleanValue();
        rkd0 rkd0Var = this.c;
        if (!booleanValue) {
            pld0 pld0Var = ((nmd0) getCurrentState()).l;
            if (pld0Var != null) {
                uqd0 uqd0Var2 = pld0Var.e;
                if (uqd0Var2 != null && (num = uqd0Var2.b) != null) {
                    r4 = num.intValue();
                }
                if (pld0Var.j != ProductMarketItemType.OZON || r4 <= 0) {
                    return;
                }
                b8u b8uVar = (b8u) rkd0Var.N.getValue();
                long j = ((nmd0) getCurrentState()).c;
                long j2 = ((nmd0) getCurrentState()).b.b;
                b8uVar.getClass();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(j), Long.valueOf(j2), null, null, null, 56, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketItemRatingItem(CommonMarketStat$RatingType.OZON_ITEM, null, null, 6, null), 63), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                return;
            }
            return;
        }
        pld0 pld0Var2 = ((nmd0) getCurrentState()).l;
        if (pld0Var2 == null || (uqd0Var = pld0Var2.e) == null) {
            return;
        }
        long j3 = ((nmd0) getCurrentState()).c;
        long j4 = ((nmd0) getCurrentState()).b.b;
        CommonMarketStat$RatingType a2 = a(pld0Var2.j);
        List<List<BaseImageDto>> list = pld0Var2.m;
        r4 = list != null ? list.size() : 0;
        b8u b8uVar2 = (b8u) rkd0Var.N.getValue();
        String str = pld0Var2.n;
        Integer valueOf = Integer.valueOf(r4);
        Float f = uqd0Var.a;
        Integer num2 = uqd0Var.b;
        b8uVar2.getClass();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(j3), Long.valueOf(j4), null, null, null, 56, null), CommonMarketStat$TypeRatingClick.a.a(new CommonMarketStat$TypeRatingBlockItem(j4, Long.valueOf(j3), a2, str, valueOf, f, num2)), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, b2, uzp0Var2.a).q();
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
