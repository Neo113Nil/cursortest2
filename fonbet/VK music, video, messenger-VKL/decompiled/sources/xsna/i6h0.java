package xsna;

import android.view.ViewGroup;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vkontakte.android.R;

/* compiled from: ScheduledCallNoCallsEmptyStubHolder.kt */
/* loaded from: classes7.dex */
public final class i6h0 extends mj8 {
    public final yu60 m;

    public i6h0(yu60 yu60Var, ViewGroup viewGroup) {
        super(viewGroup, R.layout.voip_call_list_scheduled_no_calls_empty_stub, 1);
        this.m = yu60Var;
    }

    @Override // xsna.mj8, xsna.vfz
    public final void W5(hfz hfzVar) {
        ScheduledCallViewItem.b bVar = (ScheduledCallViewItem.b) hfzVar;
        Integer num = (Integer) this.m.invoke();
        if (num != null) {
            this.itemView.post(new h6h0(this, num.intValue(), bVar));
        }
    }

    @Override // xsna.mj8
    public final void i6(l59 l59Var) {
        ScheduledCallViewItem.b bVar = (ScheduledCallViewItem.b) l59Var;
        Integer num = (Integer) this.m.invoke();
        if (num != null) {
            this.itemView.post(new h6h0(this, num.intValue(), bVar));
        }
    }
}
