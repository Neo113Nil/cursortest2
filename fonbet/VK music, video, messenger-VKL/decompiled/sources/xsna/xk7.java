package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BonusCatalogTutorialsHolderDs.kt */
/* loaded from: classes5.dex */
public final class xk7 extends qf6 {
    public final a l;

    /* compiled from: BonusCatalogTutorialsHolderDs.kt */
    public static final class a extends sxm {
    }

    /* compiled from: BonusCatalogTutorialsHolderDs.kt */
    public static final class b extends RecyclerView.n {
        public final bpn0 b = new bpn0(new vi0(4));

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            if (childAdapterPosition == 0) {
                rect.left = l() + rect.left;
                return;
            }
            if (childAdapterPosition == (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
                rect.right = l() + rect.right;
            } else {
                rect.left = l() + rect.left;
                rect.right = l() + rect.right;
            }
        }

        public final int l() {
            return ((Number) this.b.getValue()).intValue();
        }
    }

    public xk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_tutorials_item_ds, 1);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.list);
        a aVar = new a();
        int i = 11;
        aVar.x0(wk7.class, new w8(bonusCatalogFragment, i));
        this.l = aVar;
        androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(new b());
        Context context = this.itemView.getContext();
        HashSet hashSet = iah0.a;
        if (!fnj.b(context)) {
            wVar.attachToRecyclerView(recyclerView);
        }
        bwt0.i0(this.itemView, new mz(bonusCatalogFragment, i));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        List<? extends hfz> list = ((yk7) hfzVar).c;
        if (list == null) {
            list = EmptyList.b;
        }
        this.l.setItems(list);
    }
}
