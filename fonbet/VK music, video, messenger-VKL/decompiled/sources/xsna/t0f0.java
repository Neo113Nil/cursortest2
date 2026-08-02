package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ReactionChipsAdapter.kt */
/* loaded from: classes2.dex */
public final class t0f0 extends RecyclerView.Adapter<r0f0> {
    public final zaw c;
    public final paw d;
    public izs<? super k0f0, s3q0> e = new j0r(25);
    public izs<? super k0f0, s3q0> f = new p7x(20);
    public List<k0f0> g = EmptyList.b;
    public ProfilesSimpleInfo h = new ProfilesSimpleInfo();

    public t0f0(zaw zawVar, paw pawVar) {
        this.c = zawVar;
        this.d = pawVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(r0f0 r0f0Var, int i) {
        r0f0 r0f0Var2 = r0f0Var;
        r0f0Var2.l.setProfilesInfo(this.h);
        r0f0Var2.l.e(this.g.get(i), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final r0f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        m0f0 m0f0Var = new m0f0(viewGroup.getContext());
        m0f0Var.setAssetsRepo(this.c);
        m0f0Var.setAnimationCoordinator(this.d);
        return new r0f0(m0f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(r0f0 r0f0Var, int i, List list) {
        r0f0 r0f0Var2 = r0f0Var;
        final k0f0 k0f0Var = this.g.get(i);
        View view = r0f0Var2.itemView;
        m0f0 m0f0Var = r0f0Var2.l;
        view.setOnClickListener(new xnb(2, this, k0f0Var));
        r0f0Var2.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.s0f0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                t0f0.this.f.invoke(k0f0Var);
                return true;
            }
        });
        if (!list.isEmpty()) {
            m0f0Var.setProfilesInfo(this.h);
            m0f0Var.e(k0f0Var, true);
        } else {
            m0f0Var.setProfilesInfo(this.h);
            m0f0Var.e(this.g.get(i), false);
        }
    }
}
