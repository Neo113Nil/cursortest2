package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: FriendsCatalogDecorator.kt */
/* loaded from: classes16.dex */
public final class cms extends sca {
    @Override // xsna.sca, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        UIBlock uIBlock;
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        Object obj = pd90Var != null ? pd90Var.c : null;
        lca lcaVar = obj instanceof lca ? (lca) obj : null;
        if (lcaVar == null) {
            throw new IllegalArgumentException("adapter should be descendant of CatalogRecyclerAdapter");
        }
        uuk uukVar = lcaVar.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        UIBlock uIBlock2 = (UIBlock) uukVar.c(childAdapterPosition);
        int i = sca.i;
        if (childAdapterPosition == 0 && uIBlock2.e == CatalogDataType.DATA_TYPE_CATALOG_USERS) {
            rect.top = i;
        }
        if (childAdapterPosition == 0 || uIBlock2 == null || (uIBlock = (UIBlock) uukVar.c(childAdapterPosition - 1)) == null) {
            return;
        }
        CatalogViewType catalogViewType = uIBlock.d;
        boolean z = true;
        UIBlock uIBlock3 = (UIBlock) uukVar.c(childAdapterPosition + 1);
        CatalogViewType catalogViewType2 = uIBlock2.d;
        CatalogViewType catalogViewType3 = CatalogViewType.SEPARATOR;
        if (catalogViewType2 != catalogViewType3 && catalogViewType2 != CatalogViewType.SEPARATOR_COMPACT) {
            z = false;
        }
        int i2 = sca.h;
        if (z && uIBlock.e == CatalogDataType.DATA_TYPE_CATALOG_USERS) {
            rect.top = i2;
        }
        if (z && (catalogViewType == CatalogViewType.LIST_FRIENDS_SUGGEST || catalogViewType == CatalogViewType.FRIENDS_UNREAD_REQUEST || catalogViewType == CatalogViewType.FRIENDS_BIRTHDAYS_LIST)) {
            rect.top += i2;
        }
        if (catalogViewType2 == CatalogViewType.HEADER_COMPACT) {
            rect.bottom = (uIBlock3 != null ? uIBlock3.e : null) != CatalogDataType.DATA_TYPE_CATALOG_USERS ? i2 : 0;
        }
        if (catalogViewType2 == CatalogViewType.FRIENDS_REQUEST && (catalogViewType == catalogViewType3 || catalogViewType == CatalogViewType.SEPARATOR_COMPACT)) {
            rect.top = sca.k;
        }
        if (catalogViewType2 == CatalogViewType.SYNTHETIC_ACTION_FRIENDS_SORT_MODES) {
            rect.bottom += i;
        }
    }
}
