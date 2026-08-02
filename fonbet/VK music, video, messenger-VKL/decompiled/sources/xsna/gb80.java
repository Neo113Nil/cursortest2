package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.lists.RecyclerPaginatedView;

/* compiled from: OnScrollGrowthTrapButtonRenderer.kt */
/* loaded from: classes16.dex */
public final class gb80 extends RecyclerView.t {
    public final /* synthetic */ hb80 b;
    public final /* synthetic */ RecyclerPaginatedView c;
    public final /* synthetic */ Context d;

    public gb80(hb80 hb80Var, RecyclerPaginatedView recyclerPaginatedView, Context context) {
        this.b = hb80Var;
        this.c = recyclerPaginatedView;
        this.d = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        hb80 hb80Var = this.b;
        if (v <= x) {
            hb80Var.getClass();
            while (true) {
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
                tca tcaVar = findViewHolderForAdapterPosition instanceof tca ? (tca) findViewHolderForAdapterPosition : null;
                UIBlock uIBlock = tcaVar != null ? tcaVar.n : null;
                UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
                if ((uIBlockPlaceholder != null ? uIBlockPlaceholder.d : null) != CatalogViewType.SUPERAPP_TRAFFIC_GROUP_BANNER) {
                    if (v == x) {
                        break;
                    } else {
                        v++;
                    }
                } else {
                    if (hb80Var.d == null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 81;
                        ComposeView composeView = new ComposeView(this.d, null, 6);
                        composeView.setLayoutParams(layoutParams);
                        composeView.setContent(new jai(1056288651, new s77(hb80Var, 10), true));
                        this.c.addView(composeView);
                        hb80Var.d = composeView;
                    }
                    ComposeView composeView2 = hb80Var.d;
                    if (composeView2 != null) {
                        f4m.j(composeView2);
                    }
                    hb80Var.f = false;
                    return;
                }
            }
        }
        ComposeView composeView3 = hb80Var.d;
        if (composeView3 != null) {
            composeView3.setVisibility(0);
            if (hb80Var.f) {
                return;
            }
            hb80Var.f = true;
            hb80Var.c.invoke();
        }
    }
}
