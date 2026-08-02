package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vk.im.ui.views.span.SpanPressableTextView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgPin.kt */
/* loaded from: classes2.dex */
public final class eur0 extends osr0<fur0> {
    public static final /* synthetic */ int t = 0;
    public final SpanPressableTextView m;
    public final qz30 n;
    public String o;
    public final List<Object> p;
    public final List<Object> q;
    public MsgPin r;
    public pk30 s;

    public eur0(View view) {
        super(view);
        SpanPressableTextView spanPressableTextView = (SpanPressableTextView) view.findViewById(R.id.text);
        spanPressableTextView.setEmojiCompatEnabled(false);
        this.m = spanPressableTextView;
        this.n = new qz30(view.getContext());
        this.o = "";
        this.p = e43.l(new StyleSpan(1), new ima0(new ofc0(this, 20)));
        this.q = e43.l(new StyleSpan(1), new ima0(new rrn0(this, 10)));
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MsgPin);
        spanPressableTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(fur0 fur0Var, pk30 pk30Var) {
        this.s = pk30Var;
        boolean z = fur0Var.b;
        SpanPressableTextView spanPressableTextView = this.m;
        if (z) {
            spanPressableTextView.setTextColor(e3m.f(R.attr.vk_legacy_im_service_message_text_alternate, spanPressableTextView.getContext()));
            spanPressableTextView.setBackground(m33.a(R.drawable.bg_im_system_msg, spanPressableTextView.getContext()));
        } else {
            spanPressableTextView.setTextColor(e3m.f(R.attr.vk_legacy_im_service_message_text, spanPressableTextView.getContext()));
            spanPressableTextView.setBackground(null);
        }
        MsgPin msgPin = fur0Var.f;
        this.r = msgPin;
        this.o = msgPin.E.replace('\n', ' ');
        qtd0 qtd0Var = fur0Var.c;
        Peer peer = fur0Var.e;
        ucp ucpVar = ucp.a;
        UserId b = com.vk.dto.common.a.b(peer);
        spanPressableTextView.setText(ucp.i(this.n.m(qtd0Var, this.o, b, this.p, this.q)));
    }
}
