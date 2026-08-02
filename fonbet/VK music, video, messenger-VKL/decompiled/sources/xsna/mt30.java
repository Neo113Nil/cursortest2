package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartShowFwdButtonHolder.kt */
/* loaded from: classes2.dex */
public final class mt30 extends hr30<Attach, lt30> {
    public pk30 d;
    public com.vk.im.engine.models.messages.a e;
    public View f;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.g;
        View view = this.f;
        if (view == null) {
            view = null;
        }
        ((TextView) view.findViewById(R.id.tv_three_dots)).setTextColor(i);
        ((TextView) view.findViewById(R.id.tv_show_more)).setTextColor(i);
    }

    @Override // xsna.hr30
    public final void p(lt30 lt30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        this.d = pk30Var;
        this.e = lt30Var.b;
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_show_full_fwd, viewGroup, false);
        this.f = inflate;
        bwt0.i0(inflate, new jjx(this, 11));
        View view = this.f;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // xsna.hr30
    public final void r() {
        this.d = null;
        this.e = null;
    }
}
