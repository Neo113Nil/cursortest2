package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;

/* compiled from: VhMsgConversationRequestSent.kt */
/* loaded from: classes2.dex */
public final class wtr0 extends osr0<lur0> {
    public static final /* synthetic */ int n = 0;
    public final TextView m;

    public wtr0(View view) {
        super(view);
        this.m = (TextView) view.findViewById(R.id.text);
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ConversationRequestSent);
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        lur0 lur0Var = (lur0) obj;
        boolean z = lur0Var.e;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        textView.setText(lur0Var.d ? R.string.vkim_msg_chat_request_conversation_sender : R.string.vkim_msg_chat_request_conversation_receiver);
    }
}
