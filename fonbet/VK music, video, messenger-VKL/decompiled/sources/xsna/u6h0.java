package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import java.lang.ref.WeakReference;
import xsna.big;
import xsna.u7h0;

/* compiled from: ScheduledCallsAdapter.kt */
/* loaded from: classes7.dex */
public final class u6h0 extends sxm implements vel0 {
    public final VoipScheduledCallsFragment.c i;
    public RecyclerView j;
    public wii0 k;

    public u6h0(VoipScheduledCallsFragment.c cVar) {
        this.i = cVar;
        x0(big.a.class, new svz(25));
        x0(big.d.class, new azt(22));
        x0(big.c.class, new ux40(this, 24));
        x0(big.b.class, new vsq(26));
        x0(u7h0.a.class, new wq20(this, 25));
        x0(ScheduledCallViewItem.b.class, new whg0(this, 2));
        x0(ScheduledCallViewItem.ScheduledCall.class, new uh40(this, 23));
        x0(ScheduledCallViewItem.a.class, new ye40(13));
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: E0 */
    public final vfz onCreateViewHolder(int i, ViewGroup viewGroup) {
        wii0 wii0Var;
        vfz onCreateViewHolder = super.onCreateViewHolder(i, viewGroup);
        if ((onCreateViewHolder instanceof phh0) && (wii0Var = this.k) != null) {
            VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) wii0Var.c;
            if (onCreateViewHolder instanceof phh0) {
                voipScheduledCallsFragment.U.add(new WeakReference<>(onCreateViewHolder));
            } else {
                int i2 = VoipScheduledCallsFragment.c0;
            }
        }
        return onCreateViewHolder;
    }

    @Override // xsna.vel0
    public final boolean V(int i) {
        return this.h.get(i) instanceof u7h0.a;
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView;
        this.j = recyclerView;
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f = null;
        this.j = null;
    }

    @Override // xsna.vel0
    public final void l(View view) {
    }

    @Override // xsna.vel0
    public final void b0(int i, View view) {
    }

    @Override // xsna.vel0
    public final void o(int i, View view) {
    }
}
