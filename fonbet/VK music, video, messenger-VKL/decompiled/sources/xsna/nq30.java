package xsna;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartFwdHeaderHolder.kt */
/* loaded from: classes2.dex */
public final class nq30 extends hr30<AttachWall, oq30> {
    public TextView d;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.i;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        TextView textView2 = this.d;
        hno0.a(textView2 != null ? textView2 : null, ColorStateList.valueOf(i));
    }

    @Override // xsna.hr30
    public final void p(oq30 oq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        oq30 oq30Var2 = oq30Var;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(enj.f(R.plurals.vkim_msg_list_forward_header_num_messages, oq30Var2.b, textView.getContext()));
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.vkim_msg_part_fwd_header, viewGroup, false);
        this.d = textView;
        if (textView == null) {
            return null;
        }
        return textView;
    }
}
