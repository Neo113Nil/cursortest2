package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.EntryPointsItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.hzp0;

/* compiled from: EntryPointsItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class vrp extends zoj0<EntryPointsItem, nrp> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        EntryPointsItem entryPointsItem = (EntryPointsItem) this.c.c(i);
        ((nrp) e0Var).V5(entryPointsItem);
        new hzp0.t(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, entryPointsItem.e, null, 46, null), i, new com.vk.stat.scheme.c0()).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new nrp(viewGroup);
    }
}
