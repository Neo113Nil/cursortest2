package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.FaveTag;
import java.util.Iterator;

/* compiled from: TagsFilterAdapter.kt */
/* loaded from: classes18.dex */
public final class y1o0 extends zoj0<FaveTag, j0o0> {
    public final p5e e;
    public FaveTag f;

    public y1o0(FaveTag faveTag, p5e p5eVar) {
        this.e = p5eVar;
        K0(faveTag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(FaveTag faveTag) {
        FaveTag faveTag2 = this.f;
        this.f = faveTag;
        Iterator it = j5g.W0(y0()).iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                return;
            }
            xtw xtwVar = (xtw) ztwVar.next();
            FaveTag faveTag3 = (FaveTag) xtwVar.b;
            if (epx.f(faveTag3, faveTag2) || epx.f(faveTag3, faveTag)) {
                notifyItemChanged(xtwVar.a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((j0o0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new j0o0(viewGroup, this.e, new defpackage.m0(this, y1o0.class, "selectedTag", "getSelectedTag()Lcom/vk/dto/newsfeed/FaveTag;", 0));
    }
}
