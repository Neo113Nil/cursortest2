package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartShowFwdButtonHolderRedesigned.kt */
/* loaded from: classes2.dex */
public final class nt30 extends hr30<Attach, lt30> {
    public View d;
    public TextView e;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.g);
        View view = this.d;
        (view != null ? view : null).getBackground().setTint(bubbleColors.B);
    }

    @Override // xsna.hr30
    public final void p(lt30 lt30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        lt30 lt30Var2 = lt30Var;
        View view = this.d;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new d05(26, pk30Var, lt30Var2));
        int U9 = lt30Var2.b.U9();
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        String f = enj.f(R.plurals.vkim_msg_list_fwd_show_all_num_messages, U9, textView.getContext());
        TextView textView2 = this.e;
        (textView2 != null ? textView2 : null).setText(f);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_show_full_fwd_redesigned, viewGroup, false);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.vkim_fwd_message_show_full);
        View view = this.d;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // xsna.hr30
    public final void r() {
        View view = this.d;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(null);
    }
}
