package xsna;

import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.DoubleListViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.style.CatalogTabStyle;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: ListBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class bez {
    public static final UIBlock a(List list, bi20 bi20Var) {
        CatalogViewType catalogViewType = bi20Var.d;
        CatalogDataType catalogDataType = bi20Var.c;
        if (catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_CATEGORY_ITEMS && catalogViewType == CatalogViewType.TRIPLE_STACKED_SLIDER) {
            return b(bi20Var, list, EmptyList.b, null, CatalogViewType.SYNTHETIC_STAGGERED_TRIPLE_STACKED_SLIDER, CatalogDataType.DATA_SYNTHETIC_SECTION, null, false, null, false, null, 524184);
        }
        return (catalogDataType == CatalogDataType.DATA_TYPE_ACTION && catalogViewType == CatalogViewType.SLIDER && (j5g.a0(list) instanceof UIBlockFilter2D)) ? (UIBlock) j5g.Y(list) : b(bi20Var, list, bi20Var.l, null, null, CatalogDataType.DATA_SYNTHETIC_SECTION, null, false, null, false, null, 524216);
    }

    public static UIBlockList b(bi20 bi20Var, List list, List list2, UIBlockBadge uIBlockBadge, CatalogViewType catalogViewType, CatalogDataType catalogDataType, UIBlockHint uIBlockHint, boolean z, CatalogTabStyle.Gradient gradient, boolean z2, DoubleListViewStyle doubleListViewStyle, int i) {
        UIBlockBadge uIBlockBadge2 = (i & 8) != 0 ? null : uIBlockBadge;
        String str = bi20Var.a;
        CatalogViewType catalogViewType2 = (i & 32) != 0 ? bi20Var.d : catalogViewType;
        CatalogDataType catalogDataType2 = (i & 64) != 0 ? bi20Var.c : catalogDataType;
        String str2 = bi20Var.k;
        UserId userId = bi20Var.e;
        List<String> list3 = bi20Var.j;
        Set<UIBlockDragDropAction> set = bi20Var.m;
        UIBlockHint uIBlockHint2 = (i & 2048) != 0 ? bi20Var.o : uIBlockHint;
        String str3 = bi20Var.q;
        String str4 = bi20Var.f;
        String str5 = bi20Var.n;
        boolean z3 = (32768 & i) != 0 ? false : z;
        CatalogTabStyle.Gradient gradient2 = (65536 & i) != 0 ? null : gradient;
        boolean z4 = (131072 & i) != 0 ? false : z2;
        DoubleListViewStyle doubleListViewStyle2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : doubleListViewStyle;
        List list4 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            List list5 = list4;
            if (obj instanceof UIBlockActionShowFilters) {
                arrayList.add(obj);
            }
            list4 = list5;
        }
        List list6 = list4;
        UIBlockActionShowFilters uIBlockActionShowFilters = (UIBlockActionShowFilters) j5g.a0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list6) {
            if (obj2 instanceof UIBlockActionEnterEditMode) {
                arrayList2.add(obj2);
            }
        }
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode = (UIBlockActionEnterEditMode) j5g.a0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list6) {
            if (obj3 instanceof UIBlockActionGoToOwner) {
                arrayList3.add(obj3);
            }
        }
        UIBlockActionGoToOwner uIBlockActionGoToOwner = (UIBlockActionGoToOwner) j5g.a0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list6) {
            if (obj4 instanceof UIBlockActionClearSection) {
                arrayList4.add(obj4);
            }
        }
        UIBlockActionClearSection uIBlockActionClearSection = (UIBlockActionClearSection) j5g.a0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list6) {
            String str6 = str5;
            if (((UIBlockAction) obj5).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION) {
                arrayList5.add(obj5);
            }
            str5 = str6;
        }
        String str7 = str5;
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof UIBlockActionOpenSection) {
                arrayList6.add(next);
            }
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) j5g.a0(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : list6) {
            if (((UIBlockAction) obj6).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL) {
                arrayList7.add(obj6);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof UIBlockActionOpenUrl) {
                arrayList8.add(next2);
            }
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) j5g.a0(arrayList8);
        ArrayList arrayList9 = new ArrayList();
        for (Object obj7 : list6) {
            if (obj7 instanceof UIBlockActionSearchMode) {
                arrayList9.add(obj7);
            }
        }
        UIBlockActionSearchMode uIBlockActionSearchMode = (UIBlockActionSearchMode) j5g.a0(arrayList9);
        ArrayList arrayList10 = new ArrayList();
        for (Object obj8 : list6) {
            if (obj8 instanceof UIBlockDownloadAll) {
                arrayList10.add(obj8);
            }
        }
        return new UIBlockList(str, catalogViewType2, catalogDataType2, str2, userId, list3, set, uIBlockHint2, str3, str4, list, str7, uIBlockActionShowFilters, uIBlockActionEnterEditMode, uIBlockActionGoToOwner, uIBlockActionSearchMode, uIBlockActionClearSection, uIBlockActionOpenSection, uIBlockActionOpenUrl, uIBlockBadge2, z3, gradient2, z4, bi20Var.t, doubleListViewStyle2, false, bi20Var.b, bi20Var.u, null, (UIBlockDownloadAll) j5g.a0(arrayList10), 301989888, null);
    }

    public static final List c(ArrayList arrayList, bi20 bi20Var) {
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        DoubleListViewStyle.Style.Companion.getClass();
        return Collections.singletonList(b(bi20Var, arrayList, EmptyList.b, null, null, null, null, false, null, false, new DoubleListViewStyle(DoubleListViewStyle.Style.a.a(string)), 262136));
    }
}
