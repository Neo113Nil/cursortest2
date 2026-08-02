package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.SocialButtonType;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hss;
import xsna.nqs;

/* compiled from: FriendsListAdapter.kt */
/* loaded from: classes15.dex */
public final class zps extends xb {
    public final ris g;
    public final PaginatedFriendsListFragment.b h;

    public zps(ris risVar, hg6 hg6Var, PaginatedFriendsListFragment.b bVar) {
        super(hg6Var);
        this.g = risVar;
        this.h = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        nqs nqsVar = (nqs) this.c.c(i);
        if (nqsVar instanceof nqs.a) {
            return ((nqs.a) nqsVar).a.e0 == SocialButtonType.FOLLOW ? 1 : 0;
        }
        if (nqsVar instanceof pqs) {
            return 3;
        }
        if (nqsVar instanceof oqs) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ris risVar = this.g;
        if (i == 0) {
            return new mqs(risVar.a(viewGroup, new hss.a(3)), wps.b);
        }
        if (i == 1) {
            return new mqs(risVar.a(viewGroup, new hss.b(false)), xps.b);
        }
        if (i == 2) {
            axu axuVar = new axu(viewGroup);
            return new mqs(axuVar, new gmj(axuVar, 13));
        }
        if (i != 3) {
            throw new IllegalArgumentException(lhg.a(i, "Unsupported view type "));
        }
        ekq0 ekq0Var = new ekq0(viewGroup, R.layout.user_item, false, false);
        ekq0Var.t = new h57(11, this, ekq0Var);
        return new mqs(ekq0Var, yps.b);
    }

    @Override // xsna.xb
    public final int v(int i) {
        if (getItemViewType(i) == 2) {
            return this.f;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((vif0) e0Var).W5(this.c.c(i), list);
    }
}
