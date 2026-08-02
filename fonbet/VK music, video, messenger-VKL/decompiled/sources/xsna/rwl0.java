package xsna;

import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.uwl0;

/* compiled from: StoryActionAdapter.kt */
/* loaded from: classes6.dex */
public final class rwl0 extends RecyclerView.Adapter<cc<?>> {
    public final jzl0 c;
    public final twl0 d;
    public final ArrayList e = new ArrayList();
    public List<? extends uwl0> f = EmptyList.b;

    public rwl0(jzl0 jzl0Var, twl0 twl0Var) {
        this.c = jzl0Var;
        this.d = twl0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.f.get(i).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(cc<?> ccVar, int i) {
        cc<?> ccVar2 = ccVar;
        ccVar2.h6(this.f.get(i));
        this.e.add(ccVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final cc<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.d.a(viewGroup, i, this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(cc<?> ccVar) {
        cc<?> ccVar2 = ccVar;
        super.onViewRecycled(ccVar2);
        this.e.remove(ccVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(cc<?> ccVar, int i, List list) {
        cc<?> ccVar2 = ccVar;
        if (!list.isEmpty()) {
            Object obj = list.get(0);
            uwl0.a aVar = obj instanceof uwl0.a ? (uwl0.a) obj : null;
            if (aVar != null) {
                ccVar2.g6(aVar);
                return;
            }
            return;
        }
        super.onBindViewHolder(ccVar2, i, list);
    }

    /* compiled from: StoryActionAdapter.kt */
    public interface a extends v2d0 {
        void a(uwl0 uwl0Var);

        default void b(MotionEvent motionEvent) {
        }

        default void e(uwl0 uwl0Var, int i) {
        }
    }
}
