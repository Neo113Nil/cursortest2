package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.k9z;

/* compiled from: MusicLinkItemAdapter.kt */
/* loaded from: classes16.dex */
public final class nm40 extends zoj0<UIBlock, k9z> {
    public final CatalogViewType e;
    public final LinkVh.a f;
    public final k7a g;
    public final nq1 h;

    /* compiled from: MusicLinkItemAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.ENTITY_DOUBLE_GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nm40(CatalogViewType catalogViewType, LinkVh.a aVar, k7a k7aVar, nq1 nq1Var) {
        this.e = catalogViewType;
        this.f = aVar;
        this.g = k7aVar;
        this.h = nq1Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((k9z) e0Var).V5((UIBlockLink) ((ArrayList) y0()).get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (a.$EnumSwitchMapping$0[this.e.ordinal()] != 1) {
            return new k9z.a(bwt0.I(R.layout.catalog_empty_view, viewGroup, false));
        }
        return new q3k0(bwt0.I(R.layout.catalog_vk_cell_item, viewGroup, false), this.g, this.f, this.h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        k9z k9zVar = (k9z) e0Var;
        k9zVar.getClass();
        super.onViewDetachedFromWindow(k9zVar);
    }
}
