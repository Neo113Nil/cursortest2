package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategory;
import com.vk.catalog2.common.dto.api.market.CatalogMarketCategoryMappings;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: EcommBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class axo {

    /* compiled from: EcommBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.ICONS_SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.LARGE_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.STACKED_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.ARTIST_MERCH_SLIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<UIBlock> a(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, boolean z) {
        ArrayList arrayList;
        CatalogClassifiedYoulaCity catalogClassifiedYoulaCity;
        String str;
        List<CatalogMarketCategoryContext> list;
        List<CatalogMarketCategoryMappings> list2 = catalogExtendedData.N;
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = Gb.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof CatalogNavigationTab) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            CatalogNavigationTab catalogNavigationTab = (CatalogNavigationTab) it2.next();
            CatalogMarketFilter catalogMarketFilter = catalogNavigationTab.k;
            if (catalogMarketFilter == null || (list = catalogMarketFilter.g) == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    Integer num = ((CatalogMarketCategoryContext) it3.next()).c;
                    if (num != null) {
                        arrayList4.add(num);
                    }
                }
                arrayList = new ArrayList(arrayList4);
            }
            Integer num2 = catalogNavigationTab.i;
            if (num2 != null) {
                arrayList.add(Integer.valueOf(num2.intValue()));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (true) {
                catalogClassifiedYoulaCity = null;
                catalogClassifiedYoulaCity = null;
                if (!it4.hasNext()) {
                    break;
                }
                int intValue = ((Number) it4.next()).intValue();
                CatalogMarketCategory catalogMarketCategory = catalogExtendedData.M.get(String.valueOf(intValue));
                Pair pair = catalogMarketCategory != null ? new Pair(Integer.valueOf(intValue), catalogMarketCategory) : null;
                if (pair != null) {
                    arrayList5.add(pair);
                }
            }
            Map s = pn00.s(arrayList5);
            CatalogMarketFilter catalogMarketFilter2 = catalogNavigationTab.k;
            if (catalogMarketFilter2 != null && (str = catalogMarketFilter2.f) != null) {
                catalogClassifiedYoulaCity = catalogExtendedData.L.get(str);
            }
            arrayList3.add(new UIBlockNavigationTab(!z ? bi20Var.b() : bi20Var.c(CatalogViewType.BUTTON), catalogNavigationTab, s, list2, catalogClassifiedYoulaCity));
        }
        return !z ? arrayList3 : Collections.singletonList(new UIBlockButtons(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, arrayList3, null));
    }
}
