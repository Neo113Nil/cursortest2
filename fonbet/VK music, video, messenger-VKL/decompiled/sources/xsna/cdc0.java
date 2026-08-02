package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.sharing.api.dto.Target;

/* compiled from: PostingAuthorsAdapter.kt */
/* loaded from: classes4.dex */
public final class cdc0 extends zoj0<Target, vif0<Target>> {
    public final f180 e;
    public int f = -1;

    /* compiled from: PostingAuthorsAdapter.kt */
    public static final class a extends vif0<Target> {
        public final d4o0 n;

        public a(ViewGroup viewGroup, f180 f180Var) {
            super(new d4o0(viewGroup.getContext()));
            d4o0 d4o0Var = (d4o0) this.itemView;
            this.n = d4o0Var;
            d4o0Var.setIconContentDescription(null);
            d4o0Var.setOnClickListener(new ufg(2, this, f180Var));
        }

        @Override // xsna.vif0
        public final void i6(Target target) {
            this.n.setTarget(target);
        }
    }

    public cdc0(f180 f180Var) {
        this.e = f180Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        Target target = (Target) this.c.c(i);
        target.g = i == this.f;
        vif0Var.V5(target);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.e);
    }
}
