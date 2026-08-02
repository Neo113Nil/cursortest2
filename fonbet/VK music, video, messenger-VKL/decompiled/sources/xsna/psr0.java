package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;

/* compiled from: VhMsgCallAsrFailed.kt */
/* loaded from: classes2.dex */
public final class psr0 extends osr0<qsr0> {
    public static final /* synthetic */ int n = 0;
    public final TextView m;

    public psr0(View view) {
        super(view);
        this.m = (TextView) view.findViewById(R.id.text);
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.CallAsrFailed);
    }

    @Override // xsna.osr0
    public final /* bridge */ /* synthetic */ void V5(Object obj, pk30 pk30Var) {
        a6((qsr0) obj);
    }

    public final void a6(qsr0 qsr0Var) {
        TextView textView = this.m;
        textView.setText(R.string.vkim_msg_call_asr_failed);
        if (qsr0Var.c) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
    }
}
