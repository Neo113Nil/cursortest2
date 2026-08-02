package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgChatMemberKickFromCall.kt */
/* loaded from: classes2.dex */
public final class itr0 extends osr0<jtr0> {
    public static final /* synthetic */ int r = 0;
    public final qz30 m;
    public final List<Object> n;
    public final TextView o;
    public Peer p;
    public pk30 q;

    /* compiled from: VhMsgChatMemberKickFromCall.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            itr0 itr0Var = itr0.this;
            Peer peer = itr0Var.p;
            if (peer == null || (pk30Var = itr0Var.q) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public itr0(View view) {
        super(view);
        this.m = new qz30(view.getContext());
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.o = textView;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MemberKickFromCall);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.n = e43.l(new StyleSpan(1), new a());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(jtr0 jtr0Var, pk30 pk30Var) {
        this.q = pk30Var;
        boolean z = jtr0Var.b;
        TextView textView = this.o;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.p = jtr0Var.d;
        boolean z2 = jtr0Var.e;
        textView.setText(this.m.i(jtr0Var.c, this.n, z2));
    }
}
