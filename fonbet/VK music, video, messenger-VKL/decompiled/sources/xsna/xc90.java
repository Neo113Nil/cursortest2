package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.fave.entities.FavePage;
import xsna.uqq;

/* compiled from: PagesAdapter.kt */
/* loaded from: classes4.dex */
public final class xc90 extends zoj0<FavePage, f990> {
    public final uqq.a e;

    public xc90(uqq.a aVar) {
        this.e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((f990) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new f990(viewGroup, this.e);
    }
}
