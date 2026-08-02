package xsna;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;

/* compiled from: VhMsgChatTitleUpdate.kt */
/* loaded from: classes2.dex */
public final class str0 extends osr0<ttr0> {
    public static final /* synthetic */ int u = 0;
    public final TextView m;
    public final qz30 n;
    public final List<Object> o;
    public final List<Object> p;
    public final List<Object> q;
    public final ucp r;
    public Peer s;
    public pk30 t;

    /* compiled from: VhMsgChatTitleUpdate.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            str0 str0Var = str0.this;
            Peer peer = str0Var.s;
            if (peer == null || (pk30Var = str0Var.t) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public str0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        this.n = new qz30(view.getContext());
        this.r = ucp.a;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ChatTitleUpdate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.o = e43.l(new StyleSpan(1), new a());
        this.p = Collections.singletonList(new StyleSpan(1));
        this.q = Collections.singletonList(new StyleSpan(1));
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(ttr0 ttr0Var, pk30 pk30Var) {
        this.t = pk30Var;
        boolean z = ttr0Var.b;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.s = ttr0Var.d;
        String str = ttr0Var.f;
        String str2 = ttr0Var.g;
        boolean z2 = ttr0Var.e;
        Spannable j = this.n.j(ttr0Var.c, str, str2, this.o, this.p, this.q, z2);
        this.r.getClass();
        textView.setText(ucp.i(j));
    }
}
