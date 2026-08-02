package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.stat.scheme.CommonCatalogStat$TypeCatalogItemView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import xsna.fb80;
import xsna.hzp0;
import xsna.vha;

/* compiled from: CommunityUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class p4i extends vha {
    public final boolean f;
    public final s1v g;

    /* compiled from: CommunityUiViewTracker.kt */
    public static final class a extends vha.a {
        public final boolean w;
        public final RecyclerView x;
        public final View y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View] */
        public a(fb80.b bVar, boolean z, RecyclerView recyclerView, RecyclerView recyclerView2, onb onbVar, int i) {
            super((fb80.b<Object>) bVar, z, recyclerView, (i & 16) != 0 ? null : onbVar);
            recyclerView2 = (i & 8) != 0 ? null : recyclerView2;
            this.w = z;
            this.x = recyclerView2;
            if (recyclerView2 == null) {
                this.y = null;
                return;
            }
            while (recyclerView != null && !epx.f(recyclerView.getParent(), this.x)) {
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            this.y = recyclerView;
        }

        @Override // xsna.jm6
        public final boolean d(RecyclerView recyclerView, View view) {
            View view2;
            RecyclerView recyclerView2 = this.x;
            boolean z = this.w;
            if (z || recyclerView2 != null) {
                return (recyclerView2 == null || (view2 = this.y) == null) ? fco0.f(recyclerView, view, 0.7f, 0.7f, z) : fco0.f(recyclerView, view, 0.7f, 0.7f, z) && fco0.f(recyclerView2, view2, 0.7f, 0.7f, true);
            }
            return false;
        }

        @Override // xsna.vha.a
        public final vha.b n(RecyclerView.e0 e0Var, UIBlock uIBlock, tca tcaVar) {
            int i;
            View view;
            RecyclerView recyclerView = this.x;
            if (recyclerView != null && (view = this.y) != null) {
                RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(view);
                tca tcaVar2 = findContainingViewHolder instanceof tca ? (tca) findContainingViewHolder : null;
                UIBlock uIBlock2 = tcaVar2 != null ? tcaVar2.n : null;
                if (tcaVar2 != null && uIBlock2 != null) {
                    i = o(uIBlock2, tcaVar2);
                    vha.b n = super.n(e0Var, uIBlock, tcaVar);
                    return new b(n.a, n.b, i);
                }
            }
            i = 0;
            vha.b n2 = super.n(e0Var, uIBlock, tcaVar);
            return new b(n2.a, n2.b, i);
        }
    }

    /* compiled from: CommunityUiViewTracker.kt */
    public static final class b extends vha.b {
        public final int c;

        public b(UIBlock uIBlock, int i, int i2) {
            super(i, uIBlock);
            this.c = i2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p4i(boolean z, sng sngVar) {
        super(z, r0, sngVar, 8);
        s1v s1vVar = new s1v();
        this.f = z;
        this.g = s1vVar;
    }

    @Override // xsna.vha, xsna.d680
    public final List<hzp0> j(Object obj) {
        if (obj instanceof vha.b) {
            vha.b bVar = (vha.b) obj;
            UIBlock uIBlock = bVar.a;
            if (!(uIBlock instanceof UIBlockHeader)) {
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, s1v.f(bVar.a), this.g.e(uIBlock), null, 38, null);
                b bVar2 = obj instanceof b ? (b) obj : null;
                CommonCatalogStat$TypeCatalogItemView commonCatalogStat$TypeCatalogItemView = new CommonCatalogStat$TypeCatalogItemView(bVar.a.b, bVar2 != null ? bVar2.c : 0);
                dha dhaVar = this.c;
                return Collections.singletonList(new hzp0.d(schemeStat$EventItem, commonCatalogStat$TypeCatalogItemView, dhaVar != null ? dhaVar.a() : null, bVar.b));
            }
        }
        return null;
    }

    @Override // xsna.vha
    public final c2q0<Object> p(RecyclerView recyclerView) {
        return new a(this, this.f, recyclerView, null, new onb(2, this, recyclerView), 8);
    }
}
