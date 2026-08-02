package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.p8a0;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsAdapter.kt */
/* loaded from: classes4.dex */
public final class j8a0 extends androidx.recyclerview.widget.x<q8a0, p8a0> implements vic {
    public final kdg0 c;
    public final d0w d;
    public final qw30 e;

    public j8a0(kdg0 kdg0Var, d0w d0wVar, qw30 qw30Var) {
        super(k8a0.a);
        this.c = kdg0Var;
        this.d = d0wVar;
        this.e = qw30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        q8a0 item = getItem(i);
        if (item instanceof q8a0.a.C3553a) {
            return R.layout.item_pfs_private_album;
        }
        if (epx.f(item, q8a0.b.C3554b.a)) {
            return R.layout.item_pfs_private_albums_header;
        }
        if (item instanceof q8a0.a.b) {
            return R.layout.item_pfs_album;
        }
        if (epx.f(item, q8a0.b.c.a)) {
            return R.layout.item_pfs_header;
        }
        if (epx.f(item, q8a0.b.a.a)) {
            return R.layout.item_pfs_closed_profile_albums_header;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((p8a0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, i, viewGroup, false);
        d0w d0wVar = this.d;
        qw30 qw30Var = this.e;
        kdg0 kdg0Var = this.c;
        if (i == R.layout.item_pfs_private_album) {
            return new p8a0.b(b, d0wVar, qw30Var, kdg0Var);
        }
        if (i == R.layout.item_pfs_album) {
            return new p8a0.d(b, d0wVar, qw30Var, kdg0Var);
        }
        if (i == R.layout.item_pfs_private_albums_header) {
            return new p8a0.c(b);
        }
        if (i == R.layout.item_pfs_header) {
            return new p8a0.e(b);
        }
        if (i == R.layout.item_pfs_closed_profile_albums_header) {
            return new p8a0.a(b);
        }
        throw new IllegalStateException("Unsupported view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((p8a0) e0Var).W5(getItem(i), list);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
