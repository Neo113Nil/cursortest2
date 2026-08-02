package xsna;

import android.view.ViewGroup;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import java.lang.ref.WeakReference;
import xsna.big;
import xsna.op90;

/* compiled from: VoipPastCallsAdapter.kt */
/* loaded from: classes7.dex */
public final class muw0 extends sxm {
    public final VoipPastCallsFragment.c i;
    public uf20 j;
    public os8 k;

    public muw0(VoipPastCallsFragment.c cVar) {
        this.i = cVar;
        y0(new huw0(cVar));
        x0(op90.a.class, new wlw0(this, 2));
        x0(op90.c.class, new ltl0(16));
        x0(big.d.class, new jyq0(12));
        x0(big.c.class, new mdk0(this, 27));
        setHasStableIds(true);
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: E0 */
    public final vfz onCreateViewHolder(int i, ViewGroup viewGroup) {
        uf20 uf20Var;
        vfz onCreateViewHolder = super.onCreateViewHolder(i, viewGroup);
        if ((onCreateViewHolder instanceof phh0) && (uf20Var = this.j) != null) {
            VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) uf20Var.c;
            if (onCreateViewHolder instanceof phh0) {
                voipPastCallsFragment.W.add(new WeakReference<>(onCreateViewHolder));
            } else {
                int i2 = VoipPastCallsFragment.a0;
            }
        }
        return onCreateViewHolder;
    }
}
