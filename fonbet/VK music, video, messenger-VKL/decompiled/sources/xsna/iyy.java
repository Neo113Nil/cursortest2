package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ryy;

/* compiled from: LeadFormAdapter.kt */
/* loaded from: classes4.dex */
public final class iyy extends RecyclerView.Adapter<RecyclerView.e0> {
    public final tyy c;
    public final ExtendedProfilesRepository d;
    public final dvq0 e;
    public final LeadFormHolder.b f;
    public final ArrayList g = new ArrayList();

    public iyy(tyy tyyVar, ExtendedProfilesRepository extendedProfilesRepository, dvq0 dvq0Var, LeadFormHolder.b bVar) {
        this.c = tyyVar;
        this.d = extendedProfilesRepository;
        this.e = dvq0Var;
        this.f = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ryy ryyVar = (ryy) this.g.get(i);
        if (ryyVar instanceof ryy.c) {
            return 0;
        }
        if (ryyVar instanceof ryy.a.c) {
            return 1;
        }
        if (ryyVar instanceof ryy.a.b) {
            return 2;
        }
        if (ryyVar instanceof ryy.a.C3642a) {
            return 3;
        }
        if (ryyVar instanceof ryy.b) {
            return 4;
        }
        if (ryyVar instanceof ryy.d) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ryy ryyVar = (ryy) this.g.get(i);
        vif0 vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
        if (vif0Var != null) {
            vif0Var.V5(ryyVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LeadFormHolder.b bVar = this.f;
        if (i == 0) {
            return new com.vk.newsfeed.common.recycler.holders.c(viewGroup, bVar);
        }
        tyy tyyVar = this.c;
        if (i == 1) {
            return new com.vk.newsfeed.common.recycler.holders.g(viewGroup, bVar, tyyVar);
        }
        if (i == 2) {
            return new com.vk.newsfeed.common.recycler.holders.e(viewGroup, bVar, tyyVar);
        }
        if (i == 3) {
            return new com.vk.newsfeed.common.recycler.holders.d(viewGroup, bVar, tyyVar);
        }
        if (i != 4) {
            if (i == 5) {
                return new com.vk.newsfeed.common.recycler.holders.f(viewGroup, bVar);
            }
            throw new IllegalStateException("Unsupported view type");
        }
        return new com.vk.newsfeed.common.recycler.holders.b(viewGroup, this.e, this.d, this.c, this.f);
    }
}
