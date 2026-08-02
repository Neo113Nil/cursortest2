package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.FaveTag;
import java.util.ArrayList;
import xsna.gsq;

/* compiled from: TagsEditorAdapter.kt */
/* loaded from: classes4.dex */
public final class t1o0 extends zoj0<FaveTag, vif0<?>> {
    public final gsq.b e;
    public final gsq.c f;
    public final gsq.d g;

    public t1o0(gsq.b bVar, gsq.c cVar, gsq.d dVar) {
        this.e = bVar;
        this.f = cVar;
        this.g = dVar;
    }

    public final boolean K0() {
        return ((ArrayList) y0()).size() >= 20;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return K0() ? super.getItemCount() : super.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((K0() || i != 0) ? 0 : 1) ^ 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        if (vif0Var instanceof h0o0) {
            ((h0o0) vif0Var).V5(s3q0.a);
        } else if (vif0Var instanceof dsq) {
            dsq dsqVar = (dsq) vif0Var;
            if (!K0()) {
                i--;
            }
            dsqVar.V5(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new h0o0(viewGroup, this.f);
        }
        if (i == 1) {
            return new dsq(viewGroup, this.e, this.g);
        }
        throw new IllegalStateException(lhg.a(i, "Can't create view holder for edit tags: "));
    }
}
