package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: PastBroadcastsDividerViewHolder.kt */
/* loaded from: classes7.dex */
public final class yn90 extends vfz<go90> {
    public final View l;

    public yn90(ViewGroup viewGroup) {
        super(R.layout.voip_past_broadcasts_item_divider, viewGroup);
        this.l = this.itemView.findViewById(R.id.past_broadcasts_list_divider);
    }

    @Override // xsna.vfz
    public final void W5(go90 go90Var) {
        bwt0.f0(this.l, 0, go90Var.b, 0, 0, 5);
    }
}
