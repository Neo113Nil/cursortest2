package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.api.generated.market.dto.MarketItemLabelDto;
import com.vk.api.generated.market.dto.MarketItemLabelSubtypeDto;
import com.vk.api.generated.market.dto.MarketItemLabelTypeDto;
import com.vk.api.generated.market.dto.MarketModalDto;
import com.vk.api.generated.market.dto.MarketModalIntegrationFullSizeContentItemDto;
import com.vk.api.generated.market.dto.MarketModalOzonFullSizeContentItemDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.market.GoodBadge;
import com.vk.ecomm.market.good.good2.presentation.label.ContentItemType;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelType;
import com.vk.toggle.features.SoccomFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ppd0;

/* compiled from: MarketItemInteractor.kt */
/* loaded from: classes18.dex */
public final class x110 {
    public final /* synthetic */ yo9 a;
    public final /* synthetic */ uy9 b;
    public final b510 c;
    public final h010 d;
    public final bpn0 e = new bpn0(new ig(15));
    public final bpn0 f = new bpn0(new i21(16));

    /* compiled from: MarketItemInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[MarketItemLabelTypeDto.values().length];
            try {
                iArr[MarketItemLabelTypeDto.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketItemLabelTypeDto.OZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketItemLabelSubtypeDto.values().length];
            try {
                iArr2[MarketItemLabelSubtypeDto.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.CART_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_VIEWS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_BOOKMARKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_PURCHASES.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_FRIENDS_VIEWS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_FRIENDS_PURCHASES.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_POPULAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.OZON_ONBOARDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.INTEGRATION_ONBOARDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_POPULAR_SELLER.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.FOMO_GOOD_SELLER.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[MarketItemLabelSubtypeDto.DEFAULT.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MarketModalOzonFullSizeContentItemDto.TypeDto.values().length];
            try {
                iArr3[MarketModalOzonFullSizeContentItemDto.TypeDto.PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[MarketModalOzonFullSizeContentItemDto.TypeDto.DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[MarketModalOzonFullSizeContentItemDto.TypeDto.APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[MarketModalIntegrationFullSizeContentItemDto.TypeDto.values().length];
            try {
                iArr4[MarketModalIntegrationFullSizeContentItemDto.TypeDto.PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[MarketModalIntegrationFullSizeContentItemDto.TypeDto.DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[MarketModalIntegrationFullSizeContentItemDto.TypeDto.APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public x110(yo9 yo9Var, wlb0 wlb0Var, uy9 uy9Var, b510 b510Var, h010 h010Var) {
        this.a = yo9Var;
        this.b = uy9Var;
        this.c = b510Var;
        this.d = h010Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap<String, lpd0> a(LinkedHashMap<String, MarketItemLabelDto> linkedHashMap) {
        ProductLabelType productLabelType;
        ProductLabelSubtype productLabelSubtype;
        boolean z;
        Iterator it;
        MarketItemLabelDto marketItemLabelDto;
        ppd0 ppd0Var;
        String str;
        String str2;
        Integer num;
        Integer num2;
        ppd0 ppd0Var2;
        Image image;
        EmptyList emptyList;
        ppd0 opd0Var;
        ContentItemType contentItemType;
        Iterator it2;
        String str3;
        List<BaseImageDto> d;
        MarketItemLabelDto marketItemLabelDto2;
        MarketModalIntegrationFullSizeContentItemDto marketModalIntegrationFullSizeContentItemDto;
        String str4;
        BaseImageDto baseImageDto;
        BaseImageDto baseImageDto2;
        Object obj;
        Object obj2;
        Image image2;
        EmptyList emptyList2;
        ContentItemType contentItemType2;
        Image image3;
        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
        soccomFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(soccomFeatures);
        Set<Map.Entry<String, MarketItemLabelDto>> entrySet = linkedHashMap.entrySet();
        LinkedHashMap<String, lpd0> linkedHashMap2 = new LinkedHashMap<>();
        Iterator it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str5 = (String) entry.getKey();
            MarketItemLabelDto marketItemLabelDto3 = (MarketItemLabelDto) entry.getValue();
            int i = a.$EnumSwitchMapping$0[marketItemLabelDto3.l().ordinal()];
            if (i == 1) {
                productLabelType = ProductLabelType.VK;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                productLabelType = ProductLabelType.OZON;
            }
            ProductLabelType productLabelType2 = productLabelType;
            switch (a.$EnumSwitchMapping$1[marketItemLabelDto3.g().ordinal()]) {
                case 1:
                    productLabelSubtype = ProductLabelSubtype.DELIVERY;
                    break;
                case 2:
                    productLabelSubtype = ProductLabelSubtype.PAYMENT;
                    break;
                case 3:
                    productLabelSubtype = ProductLabelSubtype.CART_PRICE;
                    break;
                case 4:
                    productLabelSubtype = ProductLabelSubtype.FOMO_VIEWS;
                    break;
                case 5:
                    productLabelSubtype = ProductLabelSubtype.FOMO_BOOKMARKS;
                    break;
                case 6:
                    productLabelSubtype = ProductLabelSubtype.FOMO_PURCHASES;
                    break;
                case 7:
                    productLabelSubtype = ProductLabelSubtype.FOMO_FRIENDS_VIEWS;
                    break;
                case 8:
                    productLabelSubtype = ProductLabelSubtype.FOMO_FRIENDS_PURCHASES;
                    break;
                case 9:
                    productLabelSubtype = ProductLabelSubtype.FOMO_POPULAR;
                    break;
                case 10:
                    productLabelSubtype = ProductLabelSubtype.OZON_ONBOARDING;
                    break;
                case 11:
                    productLabelSubtype = ProductLabelSubtype.INTEGRATION_ONBOARDING;
                    break;
                case 12:
                    productLabelSubtype = ProductLabelSubtype.FOMO_POPULAR_SELLER;
                    break;
                case 13:
                    productLabelSubtype = ProductLabelSubtype.FOMO_GOOD_SELLER;
                    break;
                case 14:
                    productLabelSubtype = ProductLabelSubtype.DEFAULT;
                    break;
                default:
                    productLabelSubtype = ProductLabelSubtype.UNKNOWN;
                    break;
            }
            ProductLabelSubtype productLabelSubtype2 = productLabelSubtype;
            String i2 = marketItemLabelDto3.i().i();
            String j = marketItemLabelDto3.j();
            String k = marketItemLabelDto3.k();
            MarketItemLabelActionDto d2 = marketItemLabelDto3.d();
            if (d2 != null) {
                if (d2 instanceof MarketItemLabelActionDto.MarketItemLabelActionOpenUrlDto) {
                    ppd0Var2 = new ppd0.a(((MarketItemLabelActionDto.MarketItemLabelActionOpenUrlDto) d2).getUrl());
                } else {
                    if (!(d2 instanceof MarketItemLabelActionDto.MarketItemLabelActionOpenModalDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MarketItemLabelActionDto.MarketItemLabelActionOpenModalDto marketItemLabelActionOpenModalDto = (MarketItemLabelActionDto.MarketItemLabelActionOpenModalDto) d2;
                    MarketModalDto d3 = marketItemLabelActionOpenModalDto.d();
                    boolean z2 = d3 instanceof MarketModalDto.MarketModalApproveInfoDto;
                    bpn0 bpn0Var = this.e;
                    if (z2) {
                        MarketModalDto.MarketModalApproveInfoDto marketModalApproveInfoDto = (MarketModalDto.MarketModalApproveInfoDto) marketItemLabelActionOpenModalDto.d();
                        String title = marketModalApproveInfoDto.getTitle();
                        String f = marketModalApproveInfoDto.f();
                        String d4 = marketModalApproveInfoDto.d();
                        List<BaseImageDto> e = marketModalApproveInfoDto.e();
                        if (e != null) {
                            ((ne6) bpn0Var.getValue()).getClass();
                            image3 = ne6.a(e);
                        } else {
                            image3 = null;
                        }
                        ppd0Var2 = new mpd0(title, f, d4, image3);
                    } else {
                        if (d3 instanceof MarketModalDto.MarketModalOzonFullSizeDto) {
                            MarketModalDto.MarketModalOzonFullSizeDto marketModalOzonFullSizeDto = (MarketModalDto.MarketModalOzonFullSizeDto) marketItemLabelActionOpenModalDto.d();
                            String title2 = marketModalOzonFullSizeDto.getTitle();
                            String g = marketModalOzonFullSizeDto.g();
                            String d5 = marketModalOzonFullSizeDto.d();
                            List<BaseImageDto> f2 = marketModalOzonFullSizeDto.f();
                            if (f2 != null) {
                                ((ne6) bpn0Var.getValue()).getClass();
                                image2 = ne6.a(f2);
                            } else {
                                image2 = null;
                            }
                            List<MarketModalOzonFullSizeContentItemDto> e2 = marketModalOzonFullSizeDto.e();
                            if (e2 != null) {
                                List<MarketModalOzonFullSizeContentItemDto> list = e2;
                                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                for (MarketModalOzonFullSizeContentItemDto marketModalOzonFullSizeContentItemDto : list) {
                                    int i3 = a.$EnumSwitchMapping$2[marketModalOzonFullSizeContentItemDto.e().ordinal()];
                                    if (i3 == 1) {
                                        contentItemType2 = ContentItemType.PAYMENT;
                                    } else if (i3 == 2) {
                                        contentItemType2 = ContentItemType.DELIVERY;
                                    } else {
                                        if (i3 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        contentItemType2 = ContentItemType.APPLICATION;
                                    }
                                    arrayList.add(new ihj(contentItemType2, marketModalOzonFullSizeContentItemDto.getTitle(), marketModalOzonFullSizeContentItemDto.d(), null));
                                    a2 = a2;
                                    it3 = it3;
                                }
                                z = a2;
                                it = it3;
                                emptyList2 = arrayList;
                            } else {
                                z = a2;
                                it = it3;
                                emptyList2 = EmptyList.b;
                            }
                            opd0Var = new npd0(title2, g, d5, image2, emptyList2);
                            marketItemLabelDto = marketItemLabelDto3;
                        } else {
                            z = a2;
                            it = it3;
                            if (d3 instanceof MarketModalDto.MarketModalIntegrationFullSizeDto) {
                                SoccomFeatures soccomFeatures2 = SoccomFeatures.MULTI_INTEGRATION;
                                soccomFeatures2.getClass();
                                if (com.vk.toggle.b.A.a(soccomFeatures2)) {
                                    MarketModalDto.MarketModalIntegrationFullSizeDto marketModalIntegrationFullSizeDto = (MarketModalDto.MarketModalIntegrationFullSizeDto) marketItemLabelActionOpenModalDto.d();
                                    String title3 = marketModalIntegrationFullSizeDto.getTitle();
                                    String g2 = marketModalIntegrationFullSizeDto.g();
                                    String d6 = marketModalIntegrationFullSizeDto.d();
                                    List<BaseImageDto> f3 = marketModalIntegrationFullSizeDto.f();
                                    if (f3 != null) {
                                        ((ne6) bpn0Var.getValue()).getClass();
                                        image = ne6.a(f3);
                                    } else {
                                        image = null;
                                    }
                                    List<MarketModalIntegrationFullSizeContentItemDto> e3 = marketModalIntegrationFullSizeDto.e();
                                    if (e3 != null) {
                                        List<MarketModalIntegrationFullSizeContentItemDto> list2 = e3;
                                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                                        Iterator it4 = list2.iterator();
                                        while (it4.hasNext()) {
                                            MarketModalIntegrationFullSizeContentItemDto marketModalIntegrationFullSizeContentItemDto2 = (MarketModalIntegrationFullSizeContentItemDto) it4.next();
                                            int i4 = a.$EnumSwitchMapping$3[marketModalIntegrationFullSizeContentItemDto2.f().ordinal()];
                                            if (i4 == 1) {
                                                contentItemType = ContentItemType.PAYMENT;
                                            } else if (i4 == 2) {
                                                contentItemType = ContentItemType.DELIVERY;
                                            } else {
                                                if (i4 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                contentItemType = ContentItemType.APPLICATION;
                                            }
                                            String title4 = marketModalIntegrationFullSizeContentItemDto2.getTitle();
                                            String e4 = marketModalIntegrationFullSizeContentItemDto2.e();
                                            List<BaseImageDto> d7 = marketModalIntegrationFullSizeContentItemDto2.d();
                                            if (d7 != null) {
                                                Iterator<T> it5 = d7.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        obj2 = it5.next();
                                                        it2 = it4;
                                                        if (((BaseImageDto) obj2).d() != BaseImageDto.ThemeDto.LIGHT) {
                                                            it4 = it2;
                                                        }
                                                    } else {
                                                        it2 = it4;
                                                        obj2 = null;
                                                    }
                                                }
                                                BaseImageDto baseImageDto3 = (BaseImageDto) obj2;
                                                if (baseImageDto3 != null) {
                                                    str3 = baseImageDto3.getUrl();
                                                    d = marketModalIntegrationFullSizeContentItemDto2.d();
                                                    if (d == null) {
                                                        Iterator<T> it6 = d.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                obj = it6.next();
                                                                marketItemLabelDto2 = marketItemLabelDto3;
                                                                marketModalIntegrationFullSizeContentItemDto = marketModalIntegrationFullSizeContentItemDto2;
                                                                if (((BaseImageDto) obj).d() != BaseImageDto.ThemeDto.DARK) {
                                                                    marketModalIntegrationFullSizeContentItemDto2 = marketModalIntegrationFullSizeContentItemDto;
                                                                    marketItemLabelDto3 = marketItemLabelDto2;
                                                                }
                                                            } else {
                                                                marketItemLabelDto2 = marketItemLabelDto3;
                                                                marketModalIntegrationFullSizeContentItemDto = marketModalIntegrationFullSizeContentItemDto2;
                                                                obj = null;
                                                            }
                                                        }
                                                        BaseImageDto baseImageDto4 = (BaseImageDto) obj;
                                                        if (baseImageDto4 != null) {
                                                            str4 = baseImageDto4.getUrl();
                                                            List<BaseImageDto> d8 = marketModalIntegrationFullSizeContentItemDto.d();
                                                            Integer valueOf = (d8 != null || (baseImageDto2 = (BaseImageDto) j5g.a0(d8)) == null) ? null : Integer.valueOf(baseImageDto2.getWidth());
                                                            List<BaseImageDto> d9 = marketModalIntegrationFullSizeContentItemDto.d();
                                                            arrayList2.add(new ihj(contentItemType, title4, e4, new dly(str3, str4, valueOf, (d9 != null || (baseImageDto = (BaseImageDto) j5g.a0(d9)) == null) ? null : Integer.valueOf(baseImageDto.getHeight()))));
                                                            it4 = it2;
                                                            marketItemLabelDto3 = marketItemLabelDto2;
                                                        }
                                                    } else {
                                                        marketItemLabelDto2 = marketItemLabelDto3;
                                                        marketModalIntegrationFullSizeContentItemDto = marketModalIntegrationFullSizeContentItemDto2;
                                                    }
                                                    str4 = null;
                                                    List<BaseImageDto> d82 = marketModalIntegrationFullSizeContentItemDto.d();
                                                    if (d82 != null) {
                                                    }
                                                    List<BaseImageDto> d92 = marketModalIntegrationFullSizeContentItemDto.d();
                                                    arrayList2.add(new ihj(contentItemType, title4, e4, new dly(str3, str4, valueOf, (d92 != null || (baseImageDto = (BaseImageDto) j5g.a0(d92)) == null) ? null : Integer.valueOf(baseImageDto.getHeight()))));
                                                    it4 = it2;
                                                    marketItemLabelDto3 = marketItemLabelDto2;
                                                }
                                            } else {
                                                it2 = it4;
                                            }
                                            str3 = null;
                                            d = marketModalIntegrationFullSizeContentItemDto2.d();
                                            if (d == null) {
                                            }
                                            str4 = null;
                                            List<BaseImageDto> d822 = marketModalIntegrationFullSizeContentItemDto.d();
                                            if (d822 != null) {
                                            }
                                            List<BaseImageDto> d922 = marketModalIntegrationFullSizeContentItemDto.d();
                                            arrayList2.add(new ihj(contentItemType, title4, e4, new dly(str3, str4, valueOf, (d922 != null || (baseImageDto = (BaseImageDto) j5g.a0(d922)) == null) ? null : Integer.valueOf(baseImageDto.getHeight()))));
                                            it4 = it2;
                                            marketItemLabelDto3 = marketItemLabelDto2;
                                        }
                                        marketItemLabelDto = marketItemLabelDto3;
                                        emptyList = arrayList2;
                                    } else {
                                        marketItemLabelDto = marketItemLabelDto3;
                                        emptyList = EmptyList.b;
                                    }
                                    opd0Var = new opd0(title3, g2, d6, image, emptyList);
                                }
                            }
                            marketItemLabelDto = marketItemLabelDto3;
                            ppd0Var2 = null;
                            ppd0Var = ppd0Var2;
                        }
                        ppd0Var2 = opd0Var;
                        ppd0Var = ppd0Var2;
                    }
                }
                z = a2;
                it = it3;
                marketItemLabelDto = marketItemLabelDto3;
                ppd0Var = ppd0Var2;
            } else {
                z = a2;
                it = it3;
                marketItemLabelDto = marketItemLabelDto3;
                ppd0Var = null;
            }
            Integer e5 = marketItemLabelDto.e();
            List<BaseImageDto> f4 = marketItemLabelDto.f();
            if (f4 != null) {
                Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                str = GoodBadge.a.c(f4);
            } else {
                str = null;
            }
            List<BaseImageDto> f5 = marketItemLabelDto.f();
            if (f5 != null) {
                Serializer.c<GoodBadge> cVar2 = GoodBadge.CREATOR;
                str2 = GoodBadge.a.a(f5);
            } else {
                str2 = null;
            }
            List<BaseImageDto> f6 = marketItemLabelDto.f();
            if (f6 != null) {
                Serializer.c<GoodBadge> cVar3 = GoodBadge.CREATOR;
                num = GoodBadge.a.d(f6);
            } else {
                num = null;
            }
            List<BaseImageDto> f7 = marketItemLabelDto.f();
            if (f7 != null) {
                Serializer.c<GoodBadge> cVar4 = GoodBadge.CREATOR;
                num2 = GoodBadge.a.b(f7);
            } else {
                num2 = null;
            }
            Pair pair = new Pair(str5, new lpd0(productLabelType2, productLabelSubtype2, i2, j, k, ppd0Var, e5, z ? new dly(str, str2, num, num2) : null));
            linkedHashMap2.put(pair.i(), pair.j());
            a2 = z;
            it3 = it;
        }
        return linkedHashMap2;
    }
}
