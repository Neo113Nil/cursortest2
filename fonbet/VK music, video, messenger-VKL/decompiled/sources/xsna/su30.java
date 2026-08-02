package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartWallPostPlaceholderHolder.kt */
/* loaded from: classes2.dex */
public final class su30 extends hr30<AttachWall, tu30> {
    public TextView d;
    public View e;
    public TimeAndStatusView f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_wall_post_placeholder_new);

    @Override // xsna.hr30
    public final void p(tu30 tu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        tu30 tu30Var2 = tu30Var;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(tu30Var2.b);
        View view = this.e;
        if (view == null) {
            view = null;
        }
        view.setBackgroundResource(tu30Var2.c);
        jr30 jr30Var = tu30Var2.e;
        TimeAndStatusView timeAndStatusView = this.f;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.g.c(layoutInflater, viewGroup);
        this.d = (TextView) c.findViewById(R.id.title);
        this.e = c.findViewById(R.id.icon);
        TimeAndStatusView timeAndStatusView = (TimeAndStatusView) c.findViewById(R.id.timeAndStatus);
        this.f = timeAndStatusView;
        timeAndStatusView.setVisibility(0);
        bwt0.d(c, e3m.d(R.attr.im_msg_part_corner_radius_big, c.getContext()), true, false);
        bwt0.c0(iah0.a(176), c);
        f4m.y(iah0.a(20), c);
        return c;
    }
}
