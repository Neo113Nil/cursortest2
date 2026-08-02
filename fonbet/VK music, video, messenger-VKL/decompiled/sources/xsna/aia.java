package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogShowFiltersButton;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.api.style.CatalogSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: CatalogVideoKidsFilterReplacementPresenter.kt */
/* loaded from: classes16.dex */
public final class aia extends eda {
    /* JADX WARN: Removed duplicated region for block: B:119:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024b  */
    @Override // xsna.eda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(UIBlock uIBlock, CatalogReplacementResponse catalogReplacementResponse, String str) {
        Object obj;
        Pair pair;
        Iterator<T> it;
        Object obj2;
        UIBlockFilter2D uIBlockFilter2D;
        boolean z;
        boolean z2;
        CatalogReplacement catalogReplacement;
        CatalogFilterData catalogFilterData;
        CatalogFilterData catalogFilterData2;
        CatalogReplacementResponse catalogReplacementResponse2 = catalogReplacementResponse;
        List<CatalogReplacement> list = catalogReplacementResponse2.b;
        if ((uIBlock instanceof UIBlockList) && k5a.b(uIBlock, new ol(6))) {
            if (list.isEmpty()) {
                UIBlockList uIBlockList = (UIBlockList) uIBlock;
                ArrayList arrayList = new ArrayList();
                CatalogExtendedData catalogExtendedData = new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                if (!k5a.b(uIBlockList, new yy(8))) {
                    ArrayList<UIBlock> arrayList2 = uIBlockList.y;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (obj3 instanceof UIBlockVideoAlbum) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((UIBlockVideoAlbum) it2.next()).b);
                    }
                    if (!arrayList4.isEmpty()) {
                        CatalogExtendedData catalogExtendedData2 = new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, pn00.m(new Pair("video_kids_filter_fake_placeholder", new CatalogStateInfo("video_kids_filter_fake_placeholder", "", null, null, "", EmptyList.b, null, null, 0, null, null, null, null, null, null, null, null, 129032, null))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 7, null);
                        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_PLACEHOLDER;
                        pair = new Pair(new CatalogReplacement(arrayList4, Collections.singletonList(new CatalogBlock("video_kids_filter_fake_placeholder", catalogDataType, null, null, null, null, null, new CatalogLayout(CatalogViewType.PLACEHOLDER, null, null, null, null, false, yfb.b(new Pair(CatalogCustomAttributes$Keys.STYLE.h(), PlaceholderCatalogViewStyle.Style.KidsFilter.i())), null, null, 446, null), null, null, null, new CatalogBlockItemsData(catalogDataType, e43.o("video_kids_filter_fake_placeholder"), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null))), catalogExtendedData2);
                        if (pair != null) {
                            CatalogReplacement catalogReplacement2 = (CatalogReplacement) pair.d();
                            CatalogExtendedData catalogExtendedData3 = (CatalogExtendedData) pair.g();
                            arrayList.add(catalogReplacement2);
                            catalogExtendedData.zb(catalogExtendedData3);
                        }
                        it = uIBlockList.y.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = it.next();
                                if (obj2 instanceof UIBlockFilter2D) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        if (!(obj2 instanceof UIBlockFilter2D)) {
                            obj2 = null;
                        }
                        uIBlockFilter2D = (UIBlockFilter2D) obj2;
                        if (uIBlockFilter2D != null) {
                            catalogReplacement = null;
                        } else {
                            String str2 = uIBlockFilter2D.b;
                            CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_ACTION;
                            UIBlockList uIBlockList2 = uIBlockFilter2D.z;
                            ArrayList<UIBlock> arrayList5 = uIBlockList2.y;
                            if (arrayList5 == null || !arrayList5.isEmpty()) {
                                for (UIBlock uIBlock2 : arrayList5) {
                                    if ((uIBlock2 instanceof UIBlockActionFilter) && epx.f(((UIBlockActionFilter) uIBlock2).z.b, str)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                            ArrayList<UIBlock> arrayList6 = uIBlockList2.y;
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj4 : arrayList6) {
                                if (obj4 instanceof UIBlockActionFilter) {
                                    arrayList7.add(obj4);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                            Iterator it3 = arrayList7.iterator();
                            while (it3.hasNext()) {
                                UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) it3.next();
                                if (z) {
                                    CatalogFilterData catalogFilterData3 = uIBlockActionFilter.z;
                                    catalogFilterData2 = CatalogFilterData.zb(catalogFilterData3, null, null, epx.f(catalogFilterData3.b, str), 503);
                                } else {
                                    catalogFilterData2 = uIBlockActionFilter.z;
                                }
                                arrayList8.add(catalogFilterData2);
                            }
                            CatalogButtonFilters catalogButtonFilters = new CatalogButtonFilters("block_filter", null, "", "", arrayList8, null, null, 96, null);
                            UIBlockList uIBlockList3 = uIBlockFilter2D.y;
                            ArrayList<UIBlock> arrayList9 = uIBlockList3.y;
                            if (arrayList9 == null || !arrayList9.isEmpty()) {
                                for (UIBlock uIBlock3 : arrayList9) {
                                    if ((uIBlock3 instanceof UIBlockActionFilter) && epx.f(((UIBlockActionFilter) uIBlock3).z.b, str)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                            ArrayList<UIBlock> arrayList10 = uIBlockList3.y;
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj5 : arrayList10) {
                                if (obj5 instanceof UIBlockActionFilter) {
                                    arrayList11.add(obj5);
                                }
                            }
                            ArrayList arrayList12 = new ArrayList(c5g.u(arrayList11, 10));
                            Iterator it4 = arrayList11.iterator();
                            while (it4.hasNext()) {
                                UIBlockActionFilter uIBlockActionFilter2 = (UIBlockActionFilter) it4.next();
                                if (z2) {
                                    CatalogFilterData catalogFilterData4 = uIBlockActionFilter2.z;
                                    catalogFilterData = CatalogFilterData.zb(catalogFilterData4, null, null, epx.f(catalogFilterData4.b, str), 503);
                                } else {
                                    catalogFilterData = uIBlockActionFilter2.z;
                                }
                                arrayList12.add(catalogFilterData);
                            }
                            ArrayList a = e43.a(catalogButtonFilters, new CatalogShowFiltersButton("show_filters", null, "", "", arrayList12, "", null));
                            CatalogViewType catalogViewType = CatalogViewType.SLIDER;
                            CatalogViewStyle catalogViewStyle = uIBlockFilter2D.l;
                            CatalogSliderViewStyle catalogSliderViewStyle = catalogViewStyle instanceof CatalogSliderViewStyle ? (CatalogSliderViewStyle) catalogViewStyle : null;
                            catalogReplacement = new CatalogReplacement(Collections.singletonList(uIBlockFilter2D.b), Collections.singletonList(new CatalogBlock(str2, catalogDataType2, null, null, null, null, null, new CatalogLayout(catalogViewType, null, null, null, null, false, catalogSliderViewStyle != null ? yfb.b(new Pair(CatalogCustomAttributes$Keys.STYLE.h(), catalogSliderViewStyle.b.i())) : new Bundle(), null, null, 446, null), a, null, null, new CatalogBlockItemsData(CatalogDataType.DATA_TYPE_ACTION, null, null, null, null, null, null, null, null, null, null, null, 4094, null), null, null, null, null, null, null, null, null, null, 2094716, null)));
                        }
                        if (catalogReplacement != null) {
                            arrayList.add(catalogReplacement);
                        }
                        catalogReplacementResponse2 = new CatalogReplacementResponse(arrayList, catalogExtendedData, null);
                    }
                }
                pair = null;
                if (pair != null) {
                }
                it = uIBlockList.y.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                if (!(obj2 instanceof UIBlockFilter2D)) {
                }
                uIBlockFilter2D = (UIBlockFilter2D) obj2;
                if (uIBlockFilter2D != null) {
                }
                if (catalogReplacement != null) {
                }
                catalogReplacementResponse2 = new CatalogReplacementResponse(arrayList, catalogExtendedData, null);
            } else if (k5a.b((UIBlockList) uIBlock, new d37(3))) {
                ArrayList arrayList13 = new ArrayList(list);
                Iterator it5 = arrayList13.iterator();
                loop9: while (true) {
                    if (!it5.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it5.next();
                    List<CatalogBlock> list2 = ((CatalogReplacement) obj).c;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it6 = list2.iterator();
                        while (it6.hasNext()) {
                            if (((CatalogBlock) it6.next()).c == CatalogDataType.DATA_TYPE_VIDEO_ALBUMS) {
                                break loop9;
                            }
                        }
                    }
                }
                CatalogReplacement catalogReplacement3 = (CatalogReplacement) obj;
                if (catalogReplacement3 != null) {
                    arrayList13.remove(catalogReplacement3);
                    arrayList13.add(new CatalogReplacement(j5g.u0(Collections.singletonList("video_kids_filter_fake_placeholder"), catalogReplacement3.b), catalogReplacement3.c));
                    catalogReplacementResponse2 = new CatalogReplacementResponse(arrayList13, catalogReplacementResponse2.c, catalogReplacementResponse2.d);
                }
            }
        }
        super.a(uIBlock, catalogReplacementResponse2, str);
    }
}
