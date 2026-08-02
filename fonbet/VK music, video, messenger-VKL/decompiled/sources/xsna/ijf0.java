package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.lists.ListDataSet;
import xsna.mca;

/* compiled from: RecyclerPoolAdapter.kt */
/* loaded from: classes16.dex */
public final class ijf0 extends zoj0<UIBlock, tca> {
    public final com.vk.catalog2.common.ui.mvp.configuration.a e;
    public final u4a f;
    public final mca g;
    public zg h;

    public ijf0(com.vk.catalog2.common.ui.mvp.configuration.a aVar, u4a u4aVar, mca mcaVar) {
        super(new ListDataSet());
        this.e = aVar;
        this.f = u4aVar;
        this.g = mcaVar;
        this.h = null;
    }

    @Override // xsna.zoj0
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView;
        zg zgVar = this.h;
        return (zgVar == null || (recyclerView = (RecyclerView) zgVar.c) == null) ? this.d : recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        mca.a c = this.g.c(Math.abs(i));
        CatalogViewHolder w = this.e.w(c.a, c.b, c.c, null, this.f);
        return new tca(viewGroup, w, new zha(w));
    }
}
