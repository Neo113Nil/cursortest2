package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vkontakte.android.R;

/* compiled from: ScheduledCallDateIntervalHolder.kt */
/* loaded from: classes7.dex */
public final class a6h0 extends mj8 {
    public final TextView m;

    public a6h0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.voip_call_list_scheduled_date_interval, 1);
        this.m = (TextView) this.itemView.findViewById(R.id.scheduled_date_interval_text);
    }

    @Override // xsna.mj8, xsna.vfz
    public final void W5(hfz hfzVar) {
        this.m.setText(((ScheduledCallViewItem.a) hfzVar).b);
    }

    @Override // xsna.mj8
    public final void i6(l59 l59Var) {
        this.m.setText(((ScheduledCallViewItem.a) l59Var).b);
    }
}
