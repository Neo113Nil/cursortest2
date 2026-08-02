package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartTextView;
import com.vkontakte.android.R;

/* compiled from: MsgPartDeletedHolder.kt */
/* loaded from: classes2.dex */
public final class mp30 extends hr30<AttachDeleted, np30> {
    public MsgPartTextView d;
    public com.vk.im.ui.formatters.a e;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setTextColor(bubbleColors.i);
        MsgPartTextView msgPartTextView2 = this.d;
        (msgPartTextView2 != null ? msgPartTextView2 : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(np30 np30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        String string;
        AttachDeleted attachDeleted;
        np30 np30Var2 = np30Var;
        MsgPartTextView msgPartTextView = this.d;
        MsgPartTextView msgPartTextView2 = msgPartTextView == null ? null : msgPartTextView;
        if (np30Var2.d != 1 || (attachDeleted = np30Var2.e) == null) {
            if (msgPartTextView == null) {
                msgPartTextView = null;
            }
            string = msgPartTextView.getContext().getString(R.string.vkim_msg_etc_deleted);
        } else {
            com.vk.im.ui.formatters.a aVar = this.e;
            if (aVar == null) {
                aVar = null;
            }
            string = aVar.a(attachDeleted);
        }
        msgPartTextView2.setText(string);
        jr30 jr30Var = np30Var2.b;
        MsgPartTextView msgPartTextView3 = this.d;
        hr30.m(jr30Var, msgPartTextView3 != null ? msgPartTextView3 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MsgPartTextView msgPartTextView = (MsgPartTextView) layoutInflater.inflate(R.layout.vkim_msg_part_deleted, viewGroup, false);
        this.d = msgPartTextView;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        this.e = new com.vk.im.ui.formatters.a(msgPartTextView.getContext());
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            return null;
        }
        return msgPartTextView2;
    }
}
