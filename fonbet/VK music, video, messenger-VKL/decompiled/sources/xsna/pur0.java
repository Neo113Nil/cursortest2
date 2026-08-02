package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgUnPin.kt */
/* loaded from: classes2.dex */
public final class pur0 extends osr0<qur0> {
    public static final /* synthetic */ int s = 0;
    public final TextView m;
    public final qz30 n;
    public final List<Object> o;
    public final List<Object> p;
    public Peer q;
    public pk30 r;

    public pur0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        this.n = new qz30(view.getContext());
        this.o = e43.l(new StyleSpan(1), new ima0(new w2j0(this, 13)));
        this.p = e43.l(new StyleSpan(1), new ima0(new qbe0(8)));
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MsgUnPin);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(qur0 qur0Var, pk30 pk30Var) {
        this.r = pk30Var;
        boolean z = qur0Var.b;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.q = qur0Var.d;
        qtd0 qtd0Var = qur0Var.c;
        qz30 qz30Var = this.n;
        textView.setText(qz30.l(qz30Var, qtd0Var, R.string.vkim_msg_unpin_you, R.string.vkim_msg_unpin_female, R.string.vkim_msg_unpin_male, this.o, qz30Var.a.getString(R.string.vkim_msg), "%message%", this.p, null, 514));
    }
}
