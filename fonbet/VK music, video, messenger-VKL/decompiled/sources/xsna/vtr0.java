package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;

/* compiled from: VhMsgConversationRequestRejected.kt */
/* loaded from: classes2.dex */
public final class vtr0 extends osr0<kur0> {
    public static final /* synthetic */ int n = 0;
    public final TextView m;

    public vtr0(View view) {
        super(view);
        this.m = (TextView) view.findViewById(R.id.text);
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ConversationRequestRejected);
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        boolean z = ((kur0) obj).d;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        textView.setText(R.string.vkim_msg_chat_request_conversation_reject);
    }
}
