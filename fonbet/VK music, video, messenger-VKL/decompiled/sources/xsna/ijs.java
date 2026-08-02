package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.List;
import xsna.hss;

/* compiled from: FriendRequestsAdapter.kt */
/* loaded from: classes16.dex */
public final class ijs extends awu<RequestUserProfile> {
    public final ris i;
    public boolean j;
    public final ListDataSet<RequestUserProfile> k;
    public int l;
    public int m;
    public final s170 n;
    public ArrayList<RequestUserProfile> o;
    public boolean p;
    public String q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ijs(ris risVar, enh enhVar, FriendRequestsFragment.f fVar, boolean z) {
        super(r0);
        ListDataSet<RequestUserProfile> listDataSet = new ListDataSet<>();
        this.i = risVar;
        this.j = z;
        this.k = listDataSet;
        this.n = new s170();
        K0(new q8g0(this, fVar));
        K0(new u860(this));
        K0(new q2u0(this));
        K0(new nhj0(this, enhVar));
        K0(new wbf0(this));
    }

    @Override // xsna.awu
    public final int N0(int i) {
        RequestUserProfile requestUserProfile = (RequestUserProfile) this.c.c(i);
        boolean z = requestUserProfile.n0;
        if (z && requestUserProfile.a0) {
            return 5;
        }
        return z ? 3 : 2;
    }

    @Override // xsna.awu
    public final void O0(RecyclerView.e0 e0Var, int i) {
        RequestUserProfile requestUserProfile = (RequestUserProfile) this.c.c(i);
        if (requestUserProfile == null) {
            return;
        }
        vif0 vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
        if (vif0Var != null) {
            vif0Var.V5(requestUserProfile);
        }
    }

    @Override // xsna.awu
    public final RecyclerView.e0 P0(int i, ViewGroup viewGroup) {
        ris risVar = this.i;
        return i != 3 ? i != 5 ? risVar.a(viewGroup, new hss.a(1)) : risVar.a(viewGroup, new hss.b(true)) : risVar.a(viewGroup, new hss.a(2));
    }

    @Override // xsna.zoj0, xsna.uuk, xsna.vic, com.vk.lists.c.i
    public final void clear() {
        super.clear();
        this.o = null;
        this.n.e(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<? extends Object> list) {
        super.onBindViewHolder(e0Var, i, list);
        RequestUserProfile requestUserProfile = (RequestUserProfile) this.c.c(i);
        if (requestUserProfile == null) {
            return;
        }
        vif0 vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
        if (vif0Var != null) {
            vif0Var.W5(requestUserProfile, list);
        }
    }
}
