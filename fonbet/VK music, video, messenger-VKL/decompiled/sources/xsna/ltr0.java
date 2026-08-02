package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgChatMemberLeave.kt */
/* loaded from: classes2.dex */
public final class ltr0 extends osr0<mtr0> {
    public static final /* synthetic */ int r = 0;
    public final qz30 m;
    public final List<Object> n;
    public final TextView o;
    public Peer p;
    public pk30 q;

    /* compiled from: VhMsgChatMemberLeave.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            ltr0 ltr0Var = ltr0.this;
            Peer peer = ltr0Var.p;
            if (peer == null || (pk30Var = ltr0Var.q) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public ltr0(View view) {
        super(view);
        this.m = new qz30(view.getContext());
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.o = textView;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MemberLeave);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.n = e43.l(new StyleSpan(1), new a());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(mtr0 mtr0Var, pk30 pk30Var) {
        this.q = pk30Var;
        boolean z = mtr0Var.b;
        TextView textView = this.o;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.p = mtr0Var.d;
        qtd0 qtd0Var = mtr0Var.c;
        qz30 qz30Var = this.m;
        qz30Var.getClass();
        textView.setText(qz30.b(qz30Var, qtd0Var, this.n, R.string.vkim_msg_leave_female, R.string.vkim_msg_leave_male, R.string.vkim_msg_leave_you, "%who_name%", 64));
    }
}
