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
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VhMsgChatCreate.kt */
/* loaded from: classes2.dex */
public final class xsr0 extends osr0<ysr0> {
    public static final /* synthetic */ int u = 0;
    public final Object m;
    public final TextView n;
    public final qz30 o;
    public final List<Object> p;
    public final List<Object> q;
    public final ucp r;
    public Peer s;
    public pk30 t;

    /* compiled from: VhMsgChatCreate.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            xsr0 xsr0Var = xsr0.this;
            Peer peer = xsr0Var.s;
            if (peer == null || (pk30Var = xsr0Var.t) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public xsr0(View view) {
        super(view);
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new ia90(11));
        this.m = a2;
        TextView textView = (TextView) view.findViewById(R.id.text);
        if (((Boolean) a2.getValue()).booleanValue()) {
            textView.setTextAppearance(R.style.VkUiTypography_ParagraphNormal);
            int f = e3m.f(R.attr.vk_ui_text_subhead, textView.getContext());
            textView.setTextColor(f);
            textView.setLinkTextColor(f);
        }
        this.n = textView;
        this.o = new qz30(view.getContext());
        this.r = ucp.a;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ChatCreate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.p = e43.l(new StyleSpan(1), new a());
        this.q = Collections.singletonList(new StyleSpan(1));
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(ysr0 ysr0Var, pk30 pk30Var) {
        this.t = pk30Var;
        boolean z = ysr0Var.b;
        TextView textView = this.n;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.s = ysr0Var.d;
        String str = ysr0Var.f;
        boolean z2 = ysr0Var.e;
        Spannable e = this.o.e(ysr0Var.c, str, this.p, this.q, z2);
        this.r.getClass();
        textView.setText(ucp.i(e));
    }
}
