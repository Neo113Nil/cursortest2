package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.market.item.MarketSingleItemViewHolder;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseEcommCatalogConfig.kt */
/* loaded from: classes18.dex */
public abstract class zc6 extends com.vk.catalog2.common.ui.mvp.configuration.a {

    /* compiled from: BaseEcommCatalogConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_MARKET_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public zc6() {
        super(UserId.d, null);
    }

    public static Image z0(Good good, CatalogViewType catalogViewType) {
        if (catalogViewType.n()) {
            List<Image> list = good.m0;
            if ((list != null ? list.size() : 0) > 1) {
                List<Image> list2 = good.m0;
                if (list2 != null) {
                    return (Image) j5g.a0(list2);
                }
                return null;
            }
        }
        return good.n;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int C(UIBlock uIBlock) {
        int i = a.$EnumSwitchMapping$1[uIBlock.e.ordinal()];
        if (i == 1) {
            if (uIBlock instanceof UIBlockMarketItem) {
                return 1;
            }
            return super.C(uIBlock);
        }
        if (i != 2) {
            return super.C(uIBlock);
        }
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return super.C(uIBlock);
        }
        UIBlock uIBlock2 = (UIBlock) j5g.a0(uIBlockList.y);
        if (uIBlockList.d.j() && (uIBlock2 instanceof UIBlockMarketItem)) {
            return 5;
        }
        return super.C(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return a.$EnumSwitchMapping$2[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new rca() : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String X(Context context, int i, UIBlock uIBlock, s8a s8aVar) {
        ImageSize Cb;
        ImageSize Cb2;
        ArrayList arrayList;
        UIBlockMarketItem uIBlockMarketItem;
        ImageSize Cb3;
        ArrayList<UIBlock> arrayList2;
        CatalogViewType catalogViewType = uIBlock.d;
        int i2 = a.$EnumSwitchMapping$1[uIBlock.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return super.X(context, i, uIBlock, s8aVar);
            }
            UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
            if (uIBlockList == null || (arrayList2 = uIBlockList.y) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (UIBlock uIBlock2 : arrayList2) {
                    UIBlockMarketItem uIBlockMarketItem2 = uIBlock2 instanceof UIBlockMarketItem ? (UIBlockMarketItem) uIBlock2 : null;
                    if (uIBlockMarketItem2 != null) {
                        arrayList.add(uIBlockMarketItem2);
                    }
                }
            }
            if (arrayList == null || (uIBlockMarketItem = (UIBlockMarketItem) j5g.b0(i, arrayList)) == null) {
                return super.X(context, i, uIBlock, s8aVar);
            }
            Image z0 = z0(uIBlockMarketItem.y, uIBlockMarketItem.d);
            int a2 = e3m.a(R.dimen.market_catalog_slider_market_item_width, context) - (e3m.a(R.dimen.market_product_tile_image_horizontal_padding, context) * 2);
            if (z0 != null && (Cb3 = z0.Cb(a2, true, false)) != null) {
                return Cb3.d.d;
            }
        } else {
            if (!(uIBlock instanceof UIBlockMarketItem)) {
                return super.X(context, i, uIBlock, s8aVar);
            }
            Integer num = s8aVar.b;
            Integer num2 = s8aVar.c;
            Image z02 = z0(((UIBlockMarketItem) uIBlock).y, catalogViewType);
            if (catalogViewType.j()) {
                int a3 = e3m.a(R.dimen.market_catalog_slider_market_item_width, context) - (e3m.a(R.dimen.market_product_tile_image_horizontal_padding, context) * 2);
                if (z02 != null && (Cb2 = z02.Cb(a3, true, false)) != null) {
                    return Cb2.d.d;
                }
            } else if (num != null && num2 != null && num.intValue() > 0) {
                int intValue = ((num2.intValue() * (s8aVar.a - (e3m.a(R.dimen.market_catalog_stacked_market_item_horizontal_padding, context) * 2))) / num.intValue()) - (e3m.a(R.dimen.market_product_tile_image_horizontal_padding, context) * 2);
                if (z02 != null && (Cb = z02.Cb(intValue, true, false)) != null) {
                    return Cb.d.d;
                }
            }
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new VerticalStackedListVh(this, hVar, tbaVar, u4aVar, null, 0, null, new xe10(), 976);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int u(UIBlock uIBlock) {
        int i = a.$EnumSwitchMapping$1[uIBlock.e.ordinal()];
        return 1;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int v() {
        return 16;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        return a.$EnumSwitchMapping$1[catalogDataType.ordinal()] == 1 ? a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? new MarketSingleItemViewHolder(u4aVar, false) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }
}
