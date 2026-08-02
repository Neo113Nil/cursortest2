package xsna;

import com.unity3d.ads.BuildConfig;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import java.util.List;
import java.util.Set;

/* compiled from: FeedBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class exq {

    /* compiled from: FeedBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UIBlockGroup a(bi20 bi20Var, Group group, GroupCatalogItem groupCatalogItem, String str, String str2, CatalogViewType catalogViewType) {
        String str3 = bi20Var.a;
        CatalogDataType catalogDataType = bi20Var.c;
        String str4 = bi20Var.k;
        UserId userId = bi20Var.e;
        List<String> list = bi20Var.j;
        Set<UIBlockDragDropAction> set = bi20Var.m;
        UIBlockHint uIBlockHint = bi20Var.o;
        String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
        return new UIBlockGroup(str3, catalogViewType, catalogDataType, str4, userId, list, set, uIBlockHint, group, groupCatalogItem, false, null, str, str2, string != null ? new VideoCatalogViewStyle(string) : null, 2048, null);
    }

    public static UIBlockGroup b(bi20 bi20Var, Group group, GroupCatalogItem groupCatalogItem, int i) {
        if ((i & 4) != 0) {
            groupCatalogItem = null;
        }
        return a(bi20Var, group, groupCatalogItem, null, BuildConfig.FLAVOR, bi20Var.d);
    }
}
