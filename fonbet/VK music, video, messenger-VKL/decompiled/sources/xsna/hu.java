package xsna;

import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogActionFilterStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* compiled from: ActionBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class hu {

    /* compiled from: ActionBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_ACTION_LIST_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.FRIENDS_BUTTON_LIST_WIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.CHIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Pair<List<UIBlockAction>, Set<UIBlockDragDropAction>> a(List<? extends UIBlockAction> list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UIBlockAction uIBlockAction : list) {
            if (uIBlockAction instanceof UIBlockDragDropAction) {
                linkedHashSet.add(uIBlockAction);
            } else {
                arrayList.add(uIBlockAction);
            }
        }
        return new Pair<>(arrayList, linkedHashSet);
    }

    public static final ArrayList b(CatalogViewType catalogViewType, String str, String str2, String str3, List list, bi20 bi20Var) {
        bi20 bi20Var2 = bi20Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String str4 = bi20Var2.a + '_' + i;
            CatalogDataType catalogDataType = bi20Var2.c;
            String str5 = bi20Var2.k;
            UserId userId = bi20Var2.e;
            List<String> list3 = bi20Var2.j;
            Set<UIBlockDragDropAction> set = bi20Var2.m;
            UIBlockHint uIBlockHint = bi20Var2.o;
            String str6 = bi20Var2.b;
            CatalogActionFilterStyle.Style.a aVar = CatalogActionFilterStyle.Style.Companion;
            String string = bi20Var2.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
            aVar.getClass();
            arrayList.add(new UIBlockActionFilter(str4, catalogViewType, catalogDataType, str5, userId, list3, set, uIBlockHint, str, (CatalogFilterData) obj, str2, str6, new CatalogActionFilterStyle(CatalogActionFilterStyle.Style.a.a(string)), str3));
            bi20Var2 = bi20Var;
            i = i2;
        }
        return arrayList;
    }

    public static ArrayList c(bi20 bi20Var, List list, String str, String str2, CatalogViewType catalogViewType, String str3, int i) {
        if ((i & 16) != 0) {
            catalogViewType = bi20Var.d;
        }
        CatalogViewType catalogViewType2 = catalogViewType;
        if ((i & 32) != 0) {
            str3 = "";
        }
        return b(catalogViewType2, str, str2, str3, list, bi20Var);
    }
}
