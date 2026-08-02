package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;

/* compiled from: VhMsgChatDonKick.kt */
/* loaded from: classes2.dex */
public final class zsr0 extends osr0<atr0> {
    public static final /* synthetic */ int n = 0;
    public final TextView m;

    public zsr0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.DonKick);
        float f = 20;
        f4m.s(iah0.a(f), textView);
        f4m.r(iah0.a(f), textView);
    }

    @Override // xsna.osr0
    public final /* bridge */ /* synthetic */ void V5(Object obj, pk30 pk30Var) {
        a6((atr0) obj);
    }

    public final void a6(atr0 atr0Var) {
        boolean z = atr0Var.c;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        textView.setText(R.string.vkim_msg_kick_don);
    }
}
