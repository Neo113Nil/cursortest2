package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.mp90;
import xsna.xo90;

/* compiled from: PastCallDialogCallsBlockOngoingCallViewHolder.kt */
/* loaded from: classes7.dex */
public final class zo90 extends vfz<xo90.b.C4028b> {
    public final TextView l;
    public final TextView m;
    public final View n;

    public zo90(ViewGroup viewGroup, k59<? super mp90.b> k59Var) {
        super(R.layout.voip_history_past_call_details_calls_block_call_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.past_call_details_calls_block_call_time);
        this.m = (TextView) this.itemView.findViewById(R.id.past_call_details_calls_block_call_state);
        this.n = this.itemView.findViewById(R.id.past_call_details_calls_block_call_chevron);
    }

    @Override // xsna.vfz
    public final void W5(xo90.b.C4028b c4028b) {
        at.d(this.itemView, R.string.voip_history_past_call_details_ongoing_call_time_now, this.l);
        this.m.setTextColor(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext()));
        this.itemView.getContext();
        c4028b.getClass();
        throw null;
    }
}
