package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgMrAccepted.kt */
/* loaded from: classes2.dex */
public final class cur0 extends osr0<dur0> {
    public static final /* synthetic */ int r = 0;
    public final qz30 m;
    public final List<Object> n;
    public final TextView o;
    public Peer p;
    public pk30 q;

    /* compiled from: VhMsgMrAccepted.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            cur0 cur0Var = cur0.this;
            Peer peer = cur0Var.p;
            if (peer == null || (pk30Var = cur0Var.q) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public cur0(View view) {
        super(view);
        this.m = new qz30(view.getContext());
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.o = textView;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MrAccepted);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.n = e43.l(new StyleSpan(1), new a());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(dur0 dur0Var, pk30 pk30Var) {
        CharSequence b;
        this.q = pk30Var;
        boolean z = dur0Var.b;
        TextView textView = this.o;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.p = dur0Var.d;
        qtd0 qtd0Var = dur0Var.c;
        boolean z2 = dur0Var.i;
        qz30 qz30Var = this.m;
        if (z2) {
            b = qz30Var.a.getString(R.string.vkim_msg_mr_edu_accepted);
        } else {
            qz30Var.getClass();
            b = qz30.b(qz30Var, qtd0Var, this.n, R.string.vkim_msg_mr_accepted, R.string.vkim_msg_mr_accepted, R.string.vkim_msg_mr_accepted, "%contact%", 64);
        }
        textView.setText(b);
    }
}
