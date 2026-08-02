package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;

/* compiled from: SelectedMediaPreviewAdapter.kt */
/* loaded from: classes4.dex */
public final class xai0 extends androidx.recyclerview.widget.x<zai0, yai0> {
    public static final a f = new a();
    public final kdg0 c;
    public final bjk d;
    public final el30 e;

    /* compiled from: SelectedMediaPreviewAdapter.kt */
    public static final class a extends m.e<zai0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(zai0 zai0Var, zai0 zai0Var2) {
            return zai0Var.equals(zai0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(zai0 zai0Var, zai0 zai0Var2) {
            return zai0Var.equals(zai0Var2);
        }
    }

    public xai0(kdg0 kdg0Var, bjk bjkVar, el30 el30Var) {
        super(f);
        this.c = kdg0Var;
        this.d = bjkVar;
        this.e = el30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((yai0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new yai0(viewGroup, this.c, this.d, this.e);
    }
}
