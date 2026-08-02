package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GroupPickerTargetsAdapter.kt */
/* loaded from: classes5.dex */
public final class tlu extends RecyclerView.Adapter<slu> {
    public final xlu c;

    public tlu(xlu xluVar) {
        this.c = xluVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.getTargets().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.c.getTargets().get(i).c.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(slu sluVar, int i) {
        sluVar.l.setTarget(this.c.getTargets().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final slu onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new slu(new d4o0(viewGroup.getContext()), new u61(this, 6));
    }
}
