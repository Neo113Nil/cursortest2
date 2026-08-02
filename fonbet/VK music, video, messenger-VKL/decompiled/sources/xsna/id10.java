package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.design.demo.presentation.screens.ecomm.tile.ImageCount;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import xsna.efu;
import xsna.wid0;

/* compiled from: MarketProductTileViewContent.kt */
/* loaded from: classes18.dex */
public final class id10 {

    /* compiled from: MarketProductTileViewContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[xzt0.values().length];
            try {
                iArr[xzt0.Favorite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xzt0.Picker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xzt0.NoPicture.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xzt0.FewPictures.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xzt0.Cta.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[xzt0.CtaWithIcon.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[xzt0.StatusBadge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[xzt0.OwnerVerified.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[xzt0.LongOwnerVerified.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[xzt0.WithOzonBadge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[xzt0.WithDiscount.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[xzt0.OutOfStockUser.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[xzt0.OutOfStockAdmin.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[xzt0.SoftBlockUser.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[xzt0.SoftBlockAdmin.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[xzt0.HardBlockUser.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[xzt0.HardBlockAdmin.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[xzt0.RemoderationUser.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[xzt0.RemoderationAdmin.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[xzt0.PaginationPlaceholder.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        Object obj;
        int i4;
        boolean z;
        MarketProductTileConfig a2;
        androidx.compose.runtime.a M = aVar.M(1509460770);
        int i5 = 0;
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1509460770, i, -1, "com.vk.design.demo.presentation.screens.ecomm.tile.MarketProductTileViewContent (MarketProductTileViewContent.kt:30)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                MapBuilder mapBuilder = new MapBuilder();
                MarketProductTileConfig marketProductTileConfig = new MarketProductTileConfig(new MarketProductTileConfig.d((Image) j5g.Y(wc10.b(ImageCount.OneImage)), false, 28), (MarketProductTileConfig.g) null, new MarketProductTileConfig.h("1 500 ₽", null, null, null, false, 94), new MarketProductTileConfig.e("Товар, название не помещается, не должно поместиться и должно уйти в три точки", false, null, 22), new MarketProductTileConfig.f("Рога и копыта", false, true, 10), (MarketProductTileConfig.b) null, (MarketProductTileConfig.c) null, new MarketProductTileConfig.j(Float.valueOf(4.5f), "8 отзывов", true, 8), (MarketProductTileConfig.k) null, (List) null, (MarketProductTileConfig.a) null, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 65378);
                for (xzt0 xzt0Var : xzt0.h()) {
                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_gallery_outline_56);
                    int i6 = a.$EnumSwitchMapping$0[xzt0Var.ordinal()];
                    MarketProductTileConfig.f fVar = marketProductTileConfig.e;
                    MarketProductTileConfig.h hVar = marketProductTileConfig.c;
                    MarketProductTileConfig.d dVar = marketProductTileConfig.a;
                    MarketProductTileConfig.e eVar = marketProductTileConfig.d;
                    switch (i6) {
                        case 1:
                            obj = null;
                            marketProductTileConfig.f.getClass();
                            i4 = 0;
                            z = true;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, null, new MarketProductTileConfig.b(false, true), null, null, null, null, null, new uw3(19), null, 57311);
                            break;
                        case 2:
                            obj = null;
                            marketProductTileConfig.g.getClass();
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, null, null, new MarketProductTileConfig.c(false, true), null, null, null, new l9(17), null, null, 61375);
                            i4 = 0;
                            z = true;
                            break;
                        case 3:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, new MarketProductTileConfig.d(null, null, valueOf, false, false, true), null, null, null, null, null, null, null, null, null, null, null, null, 65534);
                            i4 = 0;
                            z = true;
                            break;
                        case 4:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, MarketProductTileConfig.d.a(dVar, 31), new MarketProductTileConfig.g(wc10.b(ImageCount.TwoImages), 62), null, null, null, null, null, null, null, null, null, null, null, 65532);
                            i4 = 0;
                            z = true;
                            break;
                        case 5:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, null, null, null, null, null, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Positive, "В корзине", null, true, null, 40), null, null, new l35(18), 47103);
                            i4 = 0;
                            z = true;
                            break;
                        case 6:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, null, null, null, null, null, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, "Написать", Integer.valueOf(R.drawable.vk_icon_link_outline_16), true, null, 32), null, null, null, 63487);
                            i4 = 0;
                            z = true;
                            break;
                        case 7:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, null, null, null, new MarketProductTileConfig.k("1 шт.", true), null, null, null, null, null, 65023);
                            i4 = 0;
                            z = true;
                            break;
                        case 8:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, MarketProductTileConfig.f.a(fVar, 13), null, null, null, null, null, null, null, null, 65519);
                            i4 = 0;
                            z = true;
                            break;
                        case 9:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, MarketProductTileConfig.f.a(fVar, 12), null, null, null, null, null, null, null, null, 65519);
                            i4 = 0;
                            z = true;
                            break;
                        case 10:
                            obj = null;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, null, null, null, null, null, Collections.singletonList(new wid0.c(null)), null, null, null, null, 64511);
                            i4 = 0;
                            z = true;
                            break;
                        case 11:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, MarketProductTileConfig.h.a(hVar, null, 125), null, null, null, null, null, Collections.singletonList(new wid0.a(new wid0.a.InterfaceC3933a.C3934a("–25%"))), null, null, null, null, 64507);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 12:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, MarketProductTileConfig.d.a(dVar, 55), null, MarketProductTileConfig.h.a(hVar, MarketProductTileConfig.ProductStatus.OutOfStock, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null, null, null, null, new MarketProductTileConfig.k("Нет в наличии", true), null, null, null, null, null, 65018);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 13:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, MarketProductTileConfig.e.a(eVar, null, MarketProductTileConfig.ProductStatus.OutOfStock, 25), null, null, null, new MarketProductTileConfig.k("Нет в наличии", true), null, null, null, null, null, 65015);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 14:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, MarketProductTileConfig.d.a(dVar, 47), null, null, MarketProductTileConfig.e.a(eVar, "Уточните возраст", null, 30), null, null, null, new MarketProductTileConfig.k("Товар 18+", true), null, null, null, null, null, 65014);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 15:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, MarketProductTileConfig.e.a(eVar, null, MarketProductTileConfig.ProductStatus.OutOfStock, 25), null, null, null, null, null, null, null, null, null, 65527);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 16:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, MarketProductTileConfig.d.a(dVar, 58), null, MarketProductTileConfig.h.a(hVar, MarketProductTileConfig.ProductStatus.HardBlock, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), MarketProductTileConfig.e.a(eVar, "Товар недоступен", null, 30), null, null, null, null, null, null, null, null, null, 65522);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 17:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, MarketProductTileConfig.e.a(eVar, null, MarketProductTileConfig.ProductStatus.HardBlock, 25), null, null, null, new MarketProductTileConfig.k("Заблокировано", true), null, null, null, null, null, 65015);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 18:
                            MarketProductTileConfig.d a3 = MarketProductTileConfig.d.a(dVar, 58);
                            MarketProductTileConfig.ProductStatus productStatus = MarketProductTileConfig.ProductStatus.Moderation;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, a3, null, MarketProductTileConfig.h.a(hVar, productStatus, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), MarketProductTileConfig.e.a(eVar, "Товар недоступен", productStatus, 26), null, null, null, null, null, null, null, null, null, 65522);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 19:
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, null, null, null, MarketProductTileConfig.e.a(eVar, null, MarketProductTileConfig.ProductStatus.Moderation, 25), null, null, null, new MarketProductTileConfig.k("На модерации", true), null, null, null, null, null, 65015);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        case 20:
                            MarketProductTileConfig.d a4 = MarketProductTileConfig.d.a(dVar, 31);
                            ListBuilder e = e43.e();
                            e.add(new Image((List<ImageSize>) Collections.singletonList(new ImageSize((String) null, 0, (char) 0, false, 12, (zcl) null))));
                            e.addAll(wc10.b(ImageCount.TwoImages));
                            s3q0 s3q0Var = s3q0.a;
                            a2 = MarketProductTileConfig.a(marketProductTileConfig, a4, new MarketProductTileConfig.g(e.g(), 54), null, null, null, null, null, null, null, null, null, null, null, 65532);
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                        default:
                            a2 = marketProductTileConfig;
                            i4 = 0;
                            obj = null;
                            z = true;
                            break;
                    }
                    mapBuilder.put(xzt0Var, a2);
                    i5 = i4;
                }
                i3 = i5;
                x = mapBuilder.h();
                M.R(x);
            } else {
                i3 = 0;
            }
            Map map = (Map) x;
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.d(q630Var, 1.0f));
            efu.b bVar = new efu.b(2);
            boolean y = M.y(map);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new mgz(map, 5);
                M.R(x2);
            }
            i2 = i3;
            uqy.b(bVar, F, null, null, null, null, null, false, null, (izs) x2, M, 0, 0, 1020);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 0;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dd10(q630Var, i, i2);
        }
    }
}
