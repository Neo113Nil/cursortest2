package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCategory;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupCollection;
import com.vk.dto.group.GroupsCategory;
import com.vk.dto.group.GroupsEntityCatalogItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class zsg {

    /* compiled from: CommunityBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER_PICKER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.MAP_PREVIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ArrayList a(CatalogExtendedData catalogExtendedData, List list, bi20 bi20Var) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GroupCatalogItem groupCatalogItem = (GroupCatalogItem) it.next();
                Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, String.valueOf(groupCatalogItem.b));
                Group group = Ab instanceof Group ? (Group) Ab : null;
                if (group != null) {
                    arrayList.add(exq.b(bi20Var, group, groupCatalogItem, 56));
                }
            }
        }
        return arrayList;
    }

    public static final UIBlockGroupsCategory b(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, GroupsCategory groupsCategory, nq8 nq8Var) {
        boolean z = catalogBlock.i.b == CatalogViewType.LARGE_SLIDER;
        CatalogButton Db = catalogBlock.Db(groupsCategory.b);
        UIBlockAction uIBlockAction = Db != null ? (UIBlockAction) j5g.a0(nq8Var.a(catalogExtendedData, Collections.singletonList(Db), bi20Var)) : null;
        if (!z) {
            return new UIBlockGroupsCategory(bi20Var.b(), groupsCategory, uIBlockAction, EmptyList.b);
        }
        Object zb = catalogBlock.m.zb(groupsCategory.b);
        GroupsEntityCatalogItem groupsEntityCatalogItem = zb instanceof GroupsEntityCatalogItem ? (GroupsEntityCatalogItem) zb : null;
        return new UIBlockGroupsCategory(bi20Var.b(), groupsCategory, uIBlockAction, a(catalogExtendedData, groupsEntityCatalogItem != null ? groupsEntityCatalogItem.c : null, bi20Var));
    }

    public static final UIBlockGroupsCollection c(bi20 bi20Var, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, GroupCollection groupCollection, com.vk.catalog2.common.dto.api.ui.a aVar) {
        Object zb = catalogBlock.m.zb(groupCollection.b);
        GroupsEntityCatalogItem groupsEntityCatalogItem = zb instanceof GroupsEntityCatalogItem ? (GroupsEntityCatalogItem) zb : null;
        if (groupsEntityCatalogItem != null) {
            return new UIBlockGroupsCollection(bi20Var.b(), groupCollection, a(catalogExtendedData, groupsEntityCatalogItem.c, bi20Var));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = groupCollection.i.iterator();
        while (it.hasNext()) {
            Object zb2 = catalogBlock.m.zb(Long.valueOf(((Number) it.next()).longValue()));
            GroupCatalogItem groupCatalogItem = zb2 instanceof GroupCatalogItem ? (GroupCatalogItem) zb2 : null;
            Object Ab = groupCatalogItem != null ? catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS, String.valueOf(groupCatalogItem.b)) : null;
            Group group = Ab instanceof Group ? (Group) Ab : null;
            if (group != null) {
                arrayList.add(exq.b(bi20Var, group, groupCatalogItem, 56));
            }
        }
        return new UIBlockGroupsCollection(aVar, groupCollection, arrayList);
    }
}
