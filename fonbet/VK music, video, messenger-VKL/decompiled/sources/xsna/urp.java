package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.EntryPoints;
import com.vkontakte.android.R;

/* compiled from: EntryPointsHolder.kt */
/* loaded from: classes4.dex */
public final class urp extends qi6<EntryPoints> {
    public final vrp C;

    public urp(ViewGroup viewGroup) {
        super(R.layout.entry_points_holder, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler);
        vrp vrpVar = new vrp();
        this.C = vrpVar;
        trp trpVar = new trp();
        if (t5m.b()) {
            recyclerView.setLayerType(1, null);
        }
        recyclerView.setAdapter(vrpVar);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.addItemDecoration(new r3n0(new rrp(this), new srp(this)));
        recyclerView.addItemDecoration(trpVar);
    }

    @Override // xsna.qi6
    public final void E6(EntryPoints entryPoints) {
        this.C.setItems(entryPoints.j);
    }
}
