package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgChatMemberInvite.kt */
/* loaded from: classes2.dex */
public final class btr0 extends osr0<gtr0> {
    public static final /* synthetic */ int t = 0;
    public final TextView m;
    public final qz30 n;
    public final List<Object> o;
    public final List<Object> p;
    public pk30 q;
    public Peer r;
    public Peer s;

    /* compiled from: VhMsgChatMemberInvite.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            btr0 btr0Var = btr0.this;
            Peer peer = btr0Var.r;
            if (peer == null || (pk30Var = btr0Var.q) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    /* compiled from: VhMsgChatMemberInvite.kt */
    public static final class b extends u120 {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            btr0 btr0Var = btr0.this;
            Peer peer = btr0Var.s;
            if (peer == null || (pk30Var = btr0Var.q) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public btr0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        this.n = new qz30(view.getContext());
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MemberInvite);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.o = e43.l(new StyleSpan(1), new a());
        this.p = e43.l(new StyleSpan(1), new b());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(gtr0 gtr0Var, pk30 pk30Var) {
        this.q = pk30Var;
        boolean z = gtr0Var.b;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.r = gtr0Var.e;
        this.s = gtr0Var.f;
        textView.setText(this.n.f(gtr0Var.c, gtr0Var.d, this.o, this.p));
    }
}
