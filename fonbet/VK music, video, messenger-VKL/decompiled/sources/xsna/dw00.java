package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.catalog2.common.ui.mvp.holder.market.item.ProductCellBadge$BadgeType;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.isd0;
import xsna.wid0;

/* compiled from: MarketCommonItemConfigConverter.kt */
/* loaded from: classes16.dex */
public final class dw00 {
    public final boolean a;
    public final Context b;
    public final isd0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new sk4(22));

    /* compiled from: MarketCommonItemConfigConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductTileCtaButtonType.values().length];
            try {
                iArr[ProductTileCtaButtonType.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTileCtaButtonType.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductTileCtaButtonType.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductTileCtaButtonType.CALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductTileCtaButtonType.GO_TO_CART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductTileCtaButtonType.PARTNER_LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductTileCtaButtonType.ADD_TO_CART.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductTileCtaButtonType.SIMILAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dw00(boolean z, Context context, isd0 isd0Var) {
        this.a = z;
        this.b = context;
        this.c = isd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0332  */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cw00 a(dw00 dw00Var, Good good, boolean z, UIBlockMarketItemStyle uIBlockMarketItemStyle) {
        boolean z2;
        snd0 snd0Var;
        String string;
        List<GoodBadge> list;
        boolean z3;
        Iterator it;
        List<Image> list2;
        wid0 aVar;
        ely elyVar;
        List list3;
        isd0 isd0Var;
        MarketProductTileConfig.a aVar2;
        CallProducerButton callProducerButton;
        VkButton.Mode mode;
        VkButton.Appearance appearance;
        MarketProductTileConfig.a aVar3;
        VerifyInfo verifyInfo;
        Float f;
        UIBlockMarketItemStyle uIBlockMarketItemStyle2 = uIBlockMarketItemStyle;
        Context context = dw00Var.b;
        MarketItemRating marketItemRating = good.t;
        boolean z4 = good.i0;
        boolean z5 = good.g0;
        boolean z6 = !z5 && z4;
        Image image = (!z5 && z4) ? null : good.n;
        boolean z7 = dw00Var.a;
        List<Image> list4 = good.m0;
        List<Image> list5 = (z7 && ((z5 && list4 != null && list4.size() > 1) || !(z4 || list4 == null || list4.size() <= 1))) ? list4 : null;
        int i = R.drawable.vk_icon_gallery_outline_56;
        if (!z5 && z4) {
            i = R.drawable.vk_icon_block_outline_56;
        }
        int i2 = i;
        boolean z8 = (z5 || z4 || z || good.Bb()) ? false : true;
        MarketRejectInfo marketRejectInfo = good.e0;
        MarketProductTileConfig.ProductStatus productStatus = (marketRejectInfo == null || !marketRejectInfo.g) ? z4 ? MarketProductTileConfig.ProductStatus.HardBlock : marketRejectInfo != null ? MarketProductTileConfig.ProductStatus.SoftBlock : !good.Bb() ? MarketProductTileConfig.ProductStatus.OutOfStock : MarketProductTileConfig.ProductStatus.Normal : MarketProductTileConfig.ProductStatus.Moderation;
        String str = good.d;
        if (!z5) {
            if (z4) {
                str = context.getString(R.string.product_tile_unavailable);
            } else if (z) {
                str = context.getString(R.string.product_tile_specify_age);
            }
        }
        String str2 = str;
        boolean z9 = ((marketItemRating == null || (f = marketItemRating.b) == null) ? 0.0f : f.floatValue()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Owner owner = good.M;
        if ((owner != null ? owner.c : null) != null && !z9) {
            if (uIBlockMarketItemStyle2 != null ? uIBlockMarketItemStyle2.i() : false) {
                z2 = true;
                if (z5) {
                    if (!z4) {
                        if (z) {
                            snd0Var = new snd0(R.string.product_tile_status_badge_for_adults);
                        } else if (!good.Bb()) {
                            snd0Var = new snd0(R.string.product_tile_status_badge_not_in_stock);
                        }
                        if (snd0Var != null) {
                            string = context.getString(snd0Var.a);
                        }
                        string = null;
                    }
                    snd0Var = null;
                    if (snd0Var != null) {
                    }
                    string = null;
                } else {
                    snd0 snd0Var2 = z4 ? new snd0(R.string.product_tile_status_badge_blocked) : (z || good.Bb()) ? null : new snd0(R.string.product_tile_status_badge_inactive);
                    if (snd0Var2 != null) {
                        string = context.getString(snd0Var2.a);
                    }
                    string = null;
                }
                if (z4 || (list = good.O) == null) {
                    z3 = true;
                    list2 = list5;
                    list3 = null;
                } else {
                    List<GoodBadge> list6 = list;
                    z3 = true;
                    ArrayList arrayList = new ArrayList(c5g.u(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        GoodBadge goodBadge = (GoodBadge) it.next();
                        GoodBadge.BadgeType badgeType = goodBadge.c;
                        Iterator it2 = it;
                        if (badgeType != null) {
                            list2 = list5;
                            if (badgeType.i() == ProductCellBadge$BadgeType.OZON.h()) {
                                if (!(uIBlockMarketItemStyle2 == UIBlockMarketItemStyle.MARKET_ITEM_COMMUNITY)) {
                                    aVar = new wid0.c(null);
                                    arrayList.add(aVar);
                                    uIBlockMarketItemStyle2 = uIBlockMarketItemStyle;
                                    it = it2;
                                    list5 = list2;
                                }
                            }
                        } else {
                            list2 = list5;
                        }
                        if (badgeType != null && badgeType.i() == GoodBadge.BadgeType.PARTNER_INTEGRATION.i()) {
                            if (!(uIBlockMarketItemStyle2 == UIBlockMarketItemStyle.MARKET_ITEM_COMMUNITY) && ((Boolean) dw00Var.d.getValue()).booleanValue()) {
                                List<BaseImageDto> list7 = goodBadge.h;
                                if (list7 != null) {
                                    Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                                    elyVar = new ely(GoodBadge.a.c(list7), GoodBadge.a.a(list7), GoodBadge.a.d(list7), GoodBadge.a.b(list7));
                                } else {
                                    elyVar = null;
                                }
                                aVar = new wid0.d(elyVar);
                                arrayList.add(aVar);
                                uIBlockMarketItemStyle2 = uIBlockMarketItemStyle;
                                it = it2;
                                list5 = list2;
                            }
                        }
                        if (badgeType == null || badgeType.i() != ProductCellBadge$BadgeType.DEFAULT.h()) {
                            list3 = EmptyList.b;
                            break;
                        }
                        aVar = new wid0.a(new wid0.a.InterfaceC3933a.C3934a(goodBadge.b));
                        arrayList.add(aVar);
                        uIBlockMarketItemStyle2 = uIBlockMarketItemStyle;
                        it = it2;
                        list5 = list2;
                    }
                    list2 = list5;
                    list3 = arrayList;
                }
                if (list3 == null) {
                    list3 = EmptyList.b;
                }
                List list8 = list3;
                if ((47 & 1) != 0) {
                    VkButton.Mode mode2 = VkButton.Mode.Primary;
                }
                if ((47 & 2) != 0) {
                    VkButton.Appearance appearance2 = VkButton.Appearance.Accent;
                }
                if ((47 & 32) != 0) {
                    MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType = MarketProductTileConfig.DisplayCtaButtonType.BOTTOM;
                }
                isd0Var = dw00Var.c;
                if (isd0Var == null) {
                    aVar3 = new MarketProductTileConfig.a(null, null, null, null, false, null, 47);
                } else {
                    List<CallProducerButton> list9 = good.n0;
                    if (list9 == null || (callProducerButton = (CallProducerButton) j5g.a0(list9)) == null) {
                        aVar2 = new MarketProductTileConfig.a(null, null, null, null, false, null, 47);
                        boolean z10 = z2;
                        List<Image> list10 = list2;
                        boolean z11 = z9;
                        MarketProductTileConfig.d dVar = new MarketProductTileConfig.d(image, str2, Integer.valueOf(i2), z8, z, (list10 != null || list10.isEmpty()) ? z3 : false);
                        boolean z12 = z8;
                        MarketProductTileConfig.g gVar = new MarketProductTileConfig.g(list2, string == null ? z3 : false, str2, Integer.valueOf(i2), z12, z, !((list10 != null || list10.isEmpty()) ? z3 : false));
                        Price price = good.h;
                        MarketProductTileConfig.h hVar = new MarketProductTileConfig.h(price.e, price.f, price.i, productStatus, false, 80);
                        MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(str2, z3, productStatus, 16);
                        Owner owner2 = good.M;
                        return new cw00(new MarketProductTileConfig(dVar, gVar, hVar, eVar, new MarketProductTileConfig.f(owner2 == null ? owner2.c : null, (owner2 != null || (verifyInfo = owner2.f) == null) ? false : verifyInfo.b, z10, 8), new MarketProductTileConfig.b(good.J, true), (MarketProductTileConfig.c) null, new MarketProductTileConfig.j(marketItemRating == null ? marketItemRating.b : null, marketItemRating == null ? marketItemRating.d : null, z11, 8), new MarketProductTileConfig.k(string, string == null), list8, aVar2, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61760), z6, z12);
                    }
                    int i3 = callProducerButton.b;
                    if (epx.f(callProducerButton.f, Boolean.FALSE) && i3 == 2) {
                        aVar3 = new MarketProductTileConfig.a(null, null, null, null, false, null, 47);
                    } else {
                        hsd0 a2 = isd0Var.a(context, new isd0.b(i3, callProducerButton.c));
                        ProductTileCtaButtonType productTileCtaButtonType = a2.a;
                        int[] iArr = a.$EnumSwitchMapping$0;
                        switch (iArr[productTileCtaButtonType.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                mode = VkButton.Mode.Primary;
                                break;
                            case 8:
                                mode = VkButton.Mode.Outline;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        VkButton.Mode mode3 = mode;
                        switch (iArr[productTileCtaButtonType.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                            case 7:
                            case 8:
                                appearance = VkButton.Appearance.Accent;
                                break;
                            case 5:
                                appearance = VkButton.Appearance.Positive;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        aVar3 = new MarketProductTileConfig.a(mode3, appearance, a2.b, a2.c, a2.d, null, 32);
                    }
                }
                aVar2 = aVar3;
                boolean z102 = z2;
                List<Image> list102 = list2;
                boolean z112 = z9;
                MarketProductTileConfig.d dVar2 = new MarketProductTileConfig.d(image, str2, Integer.valueOf(i2), z8, z, (list102 != null || list102.isEmpty()) ? z3 : false);
                boolean z122 = z8;
                MarketProductTileConfig.g gVar2 = new MarketProductTileConfig.g(list2, string == null ? z3 : false, str2, Integer.valueOf(i2), z122, z, !((list102 != null || list102.isEmpty()) ? z3 : false));
                Price price2 = good.h;
                MarketProductTileConfig.h hVar2 = new MarketProductTileConfig.h(price2.e, price2.f, price2.i, productStatus, false, 80);
                MarketProductTileConfig.e eVar2 = new MarketProductTileConfig.e(str2, z3, productStatus, 16);
                Owner owner22 = good.M;
                return new cw00(new MarketProductTileConfig(dVar2, gVar2, hVar2, eVar2, new MarketProductTileConfig.f(owner22 == null ? owner22.c : null, (owner22 != null || (verifyInfo = owner22.f) == null) ? false : verifyInfo.b, z102, 8), new MarketProductTileConfig.b(good.J, true), (MarketProductTileConfig.c) null, new MarketProductTileConfig.j(marketItemRating == null ? marketItemRating.b : null, marketItemRating == null ? marketItemRating.d : null, z112, 8), new MarketProductTileConfig.k(string, string == null), list8, aVar2, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61760), z6, z122);
            }
        }
        z2 = false;
        if (z5) {
        }
        if (z4) {
            List<GoodBadge> list62 = list;
            z3 = true;
            ArrayList arrayList2 = new ArrayList(c5g.u(list62, 10));
            it = list62.iterator();
            while (it.hasNext()) {
            }
            list2 = list5;
            list3 = arrayList2;
            if (list3 == null) {
            }
            List list82 = list3;
            if ((47 & 1) != 0) {
            }
            if ((47 & 2) != 0) {
            }
            if ((47 & 32) != 0) {
            }
            isd0Var = dw00Var.c;
            if (isd0Var == null) {
            }
            aVar2 = aVar3;
            boolean z1022 = z2;
            List<Image> list1022 = list2;
            boolean z1122 = z9;
            MarketProductTileConfig.d dVar22 = new MarketProductTileConfig.d(image, str2, Integer.valueOf(i2), z8, z, (list1022 != null || list1022.isEmpty()) ? z3 : false);
            boolean z1222 = z8;
            MarketProductTileConfig.g gVar22 = new MarketProductTileConfig.g(list2, string == null ? z3 : false, str2, Integer.valueOf(i2), z1222, z, !((list1022 != null || list1022.isEmpty()) ? z3 : false));
            Price price22 = good.h;
            MarketProductTileConfig.h hVar22 = new MarketProductTileConfig.h(price22.e, price22.f, price22.i, productStatus, false, 80);
            MarketProductTileConfig.e eVar22 = new MarketProductTileConfig.e(str2, z3, productStatus, 16);
            Owner owner222 = good.M;
            return new cw00(new MarketProductTileConfig(dVar22, gVar22, hVar22, eVar22, new MarketProductTileConfig.f(owner222 == null ? owner222.c : null, (owner222 != null || (verifyInfo = owner222.f) == null) ? false : verifyInfo.b, z1022, 8), new MarketProductTileConfig.b(good.J, true), (MarketProductTileConfig.c) null, new MarketProductTileConfig.j(marketItemRating == null ? marketItemRating.b : null, marketItemRating == null ? marketItemRating.d : null, z1122, 8), new MarketProductTileConfig.k(string, string == null), list82, aVar2, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61760), z6, z1222);
        }
        z3 = true;
        list2 = list5;
        list3 = null;
        if (list3 == null) {
        }
        List list822 = list3;
        if ((47 & 1) != 0) {
        }
        if ((47 & 2) != 0) {
        }
        if ((47 & 32) != 0) {
        }
        isd0Var = dw00Var.c;
        if (isd0Var == null) {
        }
        aVar2 = aVar3;
        boolean z10222 = z2;
        List<Image> list10222 = list2;
        boolean z11222 = z9;
        MarketProductTileConfig.d dVar222 = new MarketProductTileConfig.d(image, str2, Integer.valueOf(i2), z8, z, (list10222 != null || list10222.isEmpty()) ? z3 : false);
        boolean z12222 = z8;
        MarketProductTileConfig.g gVar222 = new MarketProductTileConfig.g(list2, string == null ? z3 : false, str2, Integer.valueOf(i2), z12222, z, !((list10222 != null || list10222.isEmpty()) ? z3 : false));
        Price price222 = good.h;
        MarketProductTileConfig.h hVar222 = new MarketProductTileConfig.h(price222.e, price222.f, price222.i, productStatus, false, 80);
        MarketProductTileConfig.e eVar222 = new MarketProductTileConfig.e(str2, z3, productStatus, 16);
        Owner owner2222 = good.M;
        return new cw00(new MarketProductTileConfig(dVar222, gVar222, hVar222, eVar222, new MarketProductTileConfig.f(owner2222 == null ? owner2222.c : null, (owner2222 != null || (verifyInfo = owner2222.f) == null) ? false : verifyInfo.b, z10222, 8), new MarketProductTileConfig.b(good.J, true), (MarketProductTileConfig.c) null, new MarketProductTileConfig.j(marketItemRating == null ? marketItemRating.b : null, marketItemRating == null ? marketItemRating.d : null, z11222, 8), new MarketProductTileConfig.k(string, string == null), list822, aVar2, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61760), z6, z12222);
    }
}
