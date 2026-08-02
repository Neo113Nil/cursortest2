package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vkontakte.android.R;

/* compiled from: CommunityCheckListCategoryViewHolder.kt */
/* loaded from: classes18.dex */
public final class xvg extends vfz<uvg> {
    public final tvg l;

    public xvg(ViewGroup viewGroup, RecyclerView.u uVar, dwg dwgVar, xcd xcdVar, CommunityCheckListFragment.b bVar) {
        super(R.layout.community_check_list_category_item, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView;
        tvg tvgVar = new tvg(dwgVar, xcdVar, bVar);
        this.l = tvgVar;
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setAdapter(tvgVar);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(uvg uvgVar) {
        this.l.setItems(uvgVar.c);
    }
}
