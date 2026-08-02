package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartBlockedHolder.kt */
/* loaded from: classes2.dex */
public final class io30 extends hr30<Attach, jo30> {
    public View d;
    public TextView e;
    public final v5t f = new v5t(R.layout.vkim_msg_part_blocked_post);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setLinkTextColor(bubbleColors.e);
        TextView textView2 = this.e;
        (textView2 != null ? textView2 : null).setTextColor(bubbleColors.i);
    }

    @Override // xsna.hr30
    public final void p(jo30 jo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        jo30 jo30Var2 = jo30Var;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(jo30Var2.c);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.f.c(layoutInflater, viewGroup);
        this.d = c;
        if (c == null) {
            c = null;
        }
        this.e = (TextView) c.findViewById(R.id.vkim_geoblocked_msg_part_text_view);
        View view = this.d;
        if (view == null) {
            return null;
        }
        return view;
    }
}
