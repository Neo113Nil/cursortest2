package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartFwdTimeHolder.kt */
/* loaded from: classes2.dex */
public final class rq30 extends hr30<Attach, sq30> {
    public TimeAndStatusView d;
    public final v5t e = new v5t(R.layout.vkim_msg_part_fwd_time);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TimeAndStatusView timeAndStatusView = this.d;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(sq30 sq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        jr30 jr30Var = sq30Var.b;
        TimeAndStatusView timeAndStatusView = this.d;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.e.c(layoutInflater, viewGroup);
        this.d = (TimeAndStatusView) c.findViewById(R.id.msg_part_fwd_time);
        return c;
    }
}
