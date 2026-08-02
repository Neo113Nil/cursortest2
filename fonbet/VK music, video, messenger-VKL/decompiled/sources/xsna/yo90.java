package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.xo90;

/* compiled from: PastCallDialogCallsBlockDateHeaderViewHolder.kt */
/* loaded from: classes7.dex */
public final class yo90 extends vfz<xo90.b.a> {
    public final i59 l;
    public final TextView m;

    public yo90(ViewGroup viewGroup) {
        super(R.layout.voip_history_past_call_details_calls_block_date_header_item, viewGroup);
        this.l = new i59(this.itemView.getContext(), R.string.voip_history_past_call_date_today_format, R.string.voip_history_past_call_date_yesterday_format, R.string.voip_history_past_call_date_same_year_format, R.string.voip_history_past_call_date_another_year_format);
        this.m = (TextView) this.itemView.findViewById(R.id.past_call_details_calls_block_date_header_title);
    }

    @Override // xsna.vfz
    public final void W5(xo90.b.a aVar) {
        this.m.setText(this.l.a(aVar.b));
    }
}
