package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketBadgeTypeDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketCustomButtonInaccessibilityMessageDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.market.GoodBadge;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.vid0;
import xsna.wfq0;

/* compiled from: ContentProductsExtensions.kt */
/* loaded from: classes18.dex */
public final class dkj {

    /* compiled from: ContentProductsExtensions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[GoodBadge.BadgeType.values().length];
            try {
                iArr[GoodBadge.BadgeType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoodBadge.BadgeType.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoodBadge.BadgeType.PARTNER_INTEGRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketCustomButtonFullDto.TypeDto.values().length];
            try {
                iArr2[MarketCustomButtonFullDto.TypeDto.WRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarketCustomButtonFullDto.TypeDto.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarketCustomButtonFullDto.TypeDto.ADD_IN_CART.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MarketCustomButtonFullDto.TypeDto.GO_TO_CART.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MarketProductTileConfig.CtaButtonType.values().length];
            try {
                iArr3[MarketProductTileConfig.CtaButtonType.InCart.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[MarketProductTileConfig.CtaButtonType.ToCart.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<hpd0> a(List<MarketMarketItemFullDto> list, ujj ujjVar, kc10 kc10Var) {
        ArrayList arrayList;
        ?? r7;
        ?? r11;
        zjk zjkVar;
        zjk zjkVar2;
        vid0 aVar;
        ely elyVar;
        ProductCtaButton productCtaButton;
        ProductCtaButton.Type type;
        if (list == null) {
            return EmptyList.b;
        }
        List<MarketMarketItemFullDto> list2 = list;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (MarketMarketItemFullDto marketMarketItemFullDto : list2) {
            c530 c = e530.c(marketMarketItemFullDto);
            ModerationRestriction a2 = ujjVar.a.a(c);
            MarketMarketItemRatingDto F = marketMarketItemFullDto.F();
            Float valueOf = F != null ? Float.valueOf(F.d()) : null;
            MarketMarketItemRatingDto F2 = marketMarketItemFullDto.F();
            String f = F2 != null ? F2.f() : null;
            List<List<BaseImageDto>> N0 = marketMarketItemFullDto.N0();
            if (N0 != null) {
                List<List<BaseImageDto>> list3 = N0;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, i));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(b210.f((List) it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            List<BaseImageDto> K0 = marketMarketItemFullDto.K0();
            Image f2 = K0 != null ? b210.f(K0) : null;
            List<MarketCustomButtonFullDto> j = marketMarketItemFullDto.j();
            if (j != null) {
                r7 = new ArrayList();
                for (MarketCustomButtonFullDto marketCustomButtonFullDto : j) {
                    String title = marketCustomButtonFullDto.getTitle();
                    if (title != null) {
                        switch (marketCustomButtonFullDto.j().i()) {
                            case 0:
                                type = ProductCtaButton.Type.Write;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                            case 1:
                                type = ProductCtaButton.Type.Link;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                            case 2:
                                type = ProductCtaButton.Type.Call;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                            case 3:
                                type = ProductCtaButton.Type.GoToCart;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                            case 4:
                                type = ProductCtaButton.Type.AddToCart;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                            case 5:
                                type = ProductCtaButton.Type.Similar;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                            case 6:
                                type = ProductCtaButton.Type.Link;
                                productCtaButton = new ProductCtaButton(type, title);
                                break;
                        }
                        if (productCtaButton == null) {
                            r7.add(productCtaButton);
                        }
                    }
                    productCtaButton = null;
                    if (productCtaButton == null) {
                    }
                }
            } else {
                r7 = 0;
            }
            if (r7 == 0) {
                r7 = EmptyList.b;
            }
            List list4 = r7;
            List<MarketBadgeDto> g = marketMarketItemFullDto.g();
            int i2 = 3;
            if (g != null) {
                r11 = new ArrayList();
                for (MarketBadgeDto marketBadgeDto : g) {
                    GoodBadge.BadgeType.a aVar2 = GoodBadge.BadgeType.Companion;
                    MarketBadgeTypeDto k = marketBadgeDto.k();
                    Integer valueOf2 = k != null ? Integer.valueOf(k.i()) : null;
                    aVar2.getClass();
                    GoodBadge.BadgeType a3 = GoodBadge.BadgeType.a.a(valueOf2);
                    int i3 = a3 == null ? -1 : a.$EnumSwitchMapping$0[a3.ordinal()];
                    if (i3 == 1) {
                        aVar = new vid0.a(marketBadgeDto.g());
                    } else if (i3 == 2) {
                        aVar = vid0.c.a;
                    } else if (i3 != i2) {
                        aVar = null;
                    } else {
                        List<BaseImageDto> f3 = marketBadgeDto.f();
                        if (f3 != null) {
                            Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                            elyVar = new ely(GoodBadge.a.c(f3), GoodBadge.a.a(f3), GoodBadge.a.d(f3), GoodBadge.a.b(f3));
                        } else {
                            elyVar = null;
                        }
                        aVar = new vid0.b(elyVar);
                    }
                    if (aVar != null) {
                        r11.add(aVar);
                    }
                    i2 = 3;
                }
            } else {
                r11 = 0;
            }
            if (r11 == 0) {
                r11 = EmptyList.b;
            }
            List list5 = r11;
            Boolean o1 = marketMarketItemFullDto.o1();
            Boolean bool = Boolean.TRUE;
            boolean f4 = epx.f(o1, bool);
            MarketPriceDto a0 = marketMarketItemFullDto.a0();
            grd0 grd0Var = new grd0(a0.n(), a0.l(), a0.j());
            long id = marketMarketItemFullDto.getId();
            String title2 = marketMarketItemFullDto.getTitle();
            boolean f5 = epx.f(marketMarketItemFullDto.n1(), bool);
            MarketItemRejectInfoDto v0 = marketMarketItemFullDto.v0();
            boolean z = v0 != null && v0.e();
            MarketItemRejectInfoDto v02 = marketMarketItemFullDto.v0();
            fc10 fc10Var = new fc10(valueOf, f, arrayList, f2, list4, list5, f4, grd0Var, id, title2, Boolean.valueOf(v02 != null && v02.g() == 2), f5, Boolean.valueOf(z), marketMarketItemFullDto.f() == MarketMarketItemAvailabilityDto.AVAILABLE, epx.f(marketMarketItemFullDto.d1(), bool));
            boolean h = a2.h();
            wfq0.c cVar2 = wfq0.c.a;
            kc10Var.getClass();
            MarketProductTileConfig a4 = kc10.a(fc10Var, h, cVar2);
            long id2 = marketMarketItemFullDto.getId();
            UserId q = marketMarketItemFullDto.q();
            MarketFavable marketFavable = new MarketFavable(marketMarketItemFullDto.getId(), marketMarketItemFullDto.q(), null, epx.f(marketMarketItemFullDto.s1(), bool), epx.f(marketMarketItemFullDto.d1(), bool));
            Integer l = marketMarketItemFullDto.l();
            int intValue = l != null ? l.intValue() : 0;
            List<MarketCustomButtonFullDto> j2 = marketMarketItemFullDto.j();
            if (j2 != null) {
                MarketCustomButtonFullDto marketCustomButtonFullDto2 = (MarketCustomButtonFullDto) j5g.a0(j2);
                if (marketCustomButtonFullDto2 != null) {
                    int i4 = a.$EnumSwitchMapping$1[marketCustomButtonFullDto2.j().ordinal()];
                    ProductCtaButton.Type type2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? ProductCtaButton.Type.Link : ProductCtaButton.Type.GoToCart : ProductCtaButton.Type.AddToCart : ProductCtaButton.Type.Call : ProductCtaButton.Type.Write;
                    String title3 = marketCustomButtonFullDto2.getTitle();
                    String str = title3 == null ? "" : title3;
                    String url = marketCustomButtonFullDto2.getUrl();
                    String str2 = url == null ? "" : url;
                    UserId userId = marketCustomButtonFullDto2.getUserId();
                    String g2 = marketCustomButtonFullDto2.g();
                    String str3 = g2 == null ? "" : g2;
                    String e = marketCustomButtonFullDto2.e();
                    String str4 = e == null ? "" : e;
                    boolean f6 = epx.f(marketCustomButtonFullDto2.l(), bool);
                    MarketCustomButtonInaccessibilityMessageDto f7 = marketCustomButtonFullDto2.f();
                    zjkVar2 = new zjk(type2, str, str2, userId, str3, str4, f6, f7 != null ? new InaccessibilityMessage(f7.getTitle(), f7.d()) : null);
                } else {
                    zjkVar2 = null;
                }
                zjkVar = zjkVar2;
            } else {
                zjkVar = null;
            }
            arrayList2.add(new hpd0(id2, q, a4, c, marketFavable, intValue, zjkVar));
            i = 10;
        }
        return arrayList2;
    }

    public static final ArrayList b(List list, Context context, hpd0 hpd0Var, boolean z) {
        MarketProductTileConfig.b bVar;
        List<hpd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (hpd0 hpd0Var2 : list2) {
            if (hpd0Var.equals(hpd0Var2)) {
                MarketProductTileConfig marketProductTileConfig = hpd0Var2.c;
                MarketProductTileConfig.b bVar2 = marketProductTileConfig.p;
                MarketProductTileConfig.CtaButtonType ctaButtonType = z ? MarketProductTileConfig.CtaButtonType.InCart : MarketProductTileConfig.CtaButtonType.ToCart;
                int i = a.$EnumSwitchMapping$2[ctaButtonType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (bVar2 != null) {
                            bVar2 = MarketProductTileConfig.b.a(bVar2, ctaButtonType, context.getString(R.string.content_product_to_cart), 4);
                        }
                        bVar = null;
                    }
                    bVar = bVar2;
                } else {
                    if (bVar2 != null) {
                        bVar2 = MarketProductTileConfig.b.a(bVar2, ctaButtonType, context.getString(R.string.content_product_in_cart), 4);
                        bVar = bVar2;
                    }
                    bVar = null;
                }
                MarketProductTileConfig a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, false, null, null, false, null, null, null, null, null, null, bVar, 98303);
                zjk zjkVar = hpd0Var2.g;
                hpd0Var2 = hpd0.a(hpd0Var2, a2, null, zjkVar != null ? new zjk(z ? ProductCtaButton.Type.GoToCart : ProductCtaButton.Type.AddToCart, zjkVar.b, zjkVar.c, zjkVar.d, zjkVar.e, zjkVar.f, zjkVar.g, zjkVar.h) : null, 123);
            }
            arrayList.add(hpd0Var2);
        }
        return arrayList;
    }

    public static final ArrayList c(List list, hpd0 hpd0Var, boolean z) {
        List<hpd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (hpd0 hpd0Var2 : list2) {
            if (hpd0Var.equals(hpd0Var2)) {
                MarketFavable marketFavable = hpd0Var.e;
                marketFavable.f = z;
                hpd0Var2 = hpd0.a(hpd0Var2, MarketProductTileConfig.a(hpd0Var2.c, null, null, null, null, false, null, null, false, null, null, new MarketProductTileConfig.i.b(z), null, null, null, null, 129023), marketFavable, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);
            }
            arrayList.add(hpd0Var2);
        }
        return arrayList;
    }

    public static final ArrayList d(List list, ujj ujjVar) {
        List<hpd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (hpd0 hpd0Var : list2) {
            arrayList.add(hpd0.a(hpd0Var, MarketProductTileConfig.a(hpd0Var.c, null, null, null, null, false, null, null, ujjVar.a.a(hpd0Var.d).h(), null, null, null, null, null, null, null, 130943), null, null, 251));
        }
        return arrayList;
    }
}
