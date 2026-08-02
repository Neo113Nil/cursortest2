package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerActionDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerDto;
import com.vk.api.generated.market.dto.MarketIntegrationSettingsAdminBannerModalDto;
import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: ProductsManagementBannerMapper.kt */
/* loaded from: classes18.dex */
public final class ssd0 {

    /* compiled from: ProductsManagementBannerMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ProductsManagementActionType.values().length];
            try {
                iArr[ProductsManagementActionType.HIDE_VK_PRODUCTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductsManagementActionType.ALLOW_VK_PRODUCTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductsManagementActionType.RESTORE_VK_PRODUCTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductsManagementActionType.DO_NOT_RESTORE_VK_PRODUCTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductsManagementActionType.HIDE_LIMIT_BANNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductsManagementActionType.CLOSE_BANNER_FINALLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.values().length];
            try {
                iArr2[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.HIDE_VK_PRODUCTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.ALLOW_VK_PRODUCTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.RESTORE_VK_PRODUCTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.DO_NOT_RESTORE_VK_PRODUCTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MarketIntegrationSettingsAdminBannerActionDto.TypeDto.HIDE_LIMIT_BANNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MarketIntegrationSettingsAdminBannerModalDto.TypeDto.values().length];
            try {
                iArr3[MarketIntegrationSettingsAdminBannerModalDto.TypeDto.HIDE_VK_PRODUCTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[MarketIntegrationSettingsAdminBannerModalDto.TypeDto.ALLOW_VK_PRODUCTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[MarketIntegrationSettingsAdminBannerModalDto.TypeDto.RESTORE_VK_PRODUCTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[MarketIntegrationSettingsAdminBannerModalDto.TypeDto.DO_NOT_RESTORE_VK_PRODUCTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static usd0 b(MarketIntegrationSettingsAdminBannerActionDto marketIntegrationSettingsAdminBannerActionDto) {
        ProductsManagementActionType productsManagementActionType;
        String title = marketIntegrationSettingsAdminBannerActionDto.getTitle();
        boolean z = marketIntegrationSettingsAdminBannerActionDto.d() == MarketIntegrationSettingsAdminBannerActionDto.StyleDto.PRIMARY;
        switch (a.$EnumSwitchMapping$1[marketIntegrationSettingsAdminBannerActionDto.e().ordinal()]) {
            case 1:
                productsManagementActionType = ProductsManagementActionType.HIDE_VK_PRODUCTS;
                break;
            case 2:
                productsManagementActionType = ProductsManagementActionType.ALLOW_VK_PRODUCTS;
                break;
            case 3:
                productsManagementActionType = ProductsManagementActionType.RESTORE_VK_PRODUCTS;
                break;
            case 4:
                productsManagementActionType = ProductsManagementActionType.DO_NOT_RESTORE_VK_PRODUCTS;
                break;
            case 5:
                productsManagementActionType = ProductsManagementActionType.CANCEL;
                break;
            case 6:
                productsManagementActionType = ProductsManagementActionType.HIDE_LIMIT_BANNER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new usd0(title, z, productsManagementActionType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final tsd0 a(MarketIntegrationSettingsAdminBannerDto marketIntegrationSettingsAdminBannerDto) {
        ?? r6;
        String title = marketIntegrationSettingsAdminBannerDto.getTitle();
        String str = title == null ? "" : title;
        String message = marketIntegrationSettingsAdminBannerDto.getMessage();
        String str2 = message == null ? "" : message;
        BaseImageDto f = marketIntegrationSettingsAdminBannerDto.f();
        String url = f != null ? f.getUrl() : null;
        List<MarketIntegrationSettingsAdminBannerActionDto> d = marketIntegrationSettingsAdminBannerDto.d();
        if (d != null) {
            List<MarketIntegrationSettingsAdminBannerActionDto> list = d;
            r6 = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r6.add(b((MarketIntegrationSettingsAdminBannerActionDto) it.next()));
            }
        } else {
            r6 = EmptyList.b;
        }
        List<MarketIntegrationSettingsAdminBannerModalDto> g = marketIntegrationSettingsAdminBannerDto.g();
        return new tsd0(str, str2, url, r6, g != null ? p4g.s(g, new o440(this, 19), new rj60(this, 14)) : jgp.b, epx.f(marketIntegrationSettingsAdminBannerDto.e(), Boolean.TRUE) ? new usd0("", false, ProductsManagementActionType.CLOSE_BANNER_FINALLY) : null, PsExtractor.AUDIO_STREAM);
    }
}
