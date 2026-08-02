package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: MsgSearchListAdapter.kt */
/* loaded from: classes2.dex */
public final class rx30 extends qul {
    public final mkr0 h;
    public final LayoutInflater i;
    public final RecyclerView.u j;

    public rx30(mkr0 mkr0Var, LayoutInflater layoutInflater, final boolean z) {
        super(true);
        this.h = mkr0Var;
        this.i = layoutInflater;
        this.j = new RecyclerView.u();
        setHasStableIds(true);
        x0(gk30.class, new wq20(this, 3));
        x0(gu70.class, new owv(this, 8));
        x0(vt90.class, new l6u(this, 17));
        x0(n1u.class, new px30(this, 0));
        x0(t9f0.class, new ire(this, 29));
        x0(rvh0.class, new cqv(this, 16));
        x0(w6v.class, new q130(this, 2));
        x0(nx30.class, new kdn(this, 26));
        x0(p7k.class, new uv20(this, 4));
        if (z) {
            x0(i0b.class, new o010(this, 8));
        } else {
            x0(uwm0.class, new cww(this, 15));
            x0(r6q0.class, new p010(this, 10));
        }
        x0(lcf0.class, new d410(this, 7));
        x0(pbb.class, new izs() { // from class: xsna.qx30
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ViewGroup viewGroup = (ViewGroup) obj;
                if (z) {
                    int i = qqr0.m;
                    return new qqr0((ShimmerFrameLayout) bwt0.I(R.layout.vkim_channel_search_skeleton_cell_item, viewGroup, false));
                }
                int i2 = rqr0.m;
                return new rqr0((ShimmerFrameLayout) bwt0.I(R.layout.vkim_channel_search_skeleton_item, viewGroup, false));
            }
        });
        x0(u8j.class, new bgy(this, 11));
        x0(ljq.class, new lxz(this, 6));
        x0(gon0.class, new c230(this, 2));
    }
}
