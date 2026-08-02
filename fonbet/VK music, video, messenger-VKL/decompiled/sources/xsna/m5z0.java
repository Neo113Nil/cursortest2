package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import xsna.pdz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class m5z0 extends RecyclerView.Adapter {
    public List c = new ArrayList();
    public final pdz0.a d;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a extends RecyclerView.e0 {
        public final uyy0 l;

        public a(uyy0 uyy0Var) {
            super(uyy0Var);
            this.l = uyy0Var;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends RecyclerView.e0 {
        public final ycz0 l;

        public b(ycz0 ycz0Var) {
            super(ycz0Var);
            this.l = ycz0Var;
        }
    }

    public m5z0(pdz0.a aVar) {
        this.d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((m6z0) this.c.get(i)).a.c0 != null ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        m6z0 m6z0Var = (m6z0) this.c.get(i);
        if (e0Var instanceof b) {
            ((b) e0Var).l.setBannerData(m6z0Var);
        } else {
            ((a) e0Var).l.setBannerData(m6z0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        baz0 baz0Var = new baz0(this.d);
        return i == 1 ? new b(new ycz0(viewGroup.getContext(), baz0Var)) : new a(new uyy0(viewGroup.getContext(), baz0Var));
    }
}
