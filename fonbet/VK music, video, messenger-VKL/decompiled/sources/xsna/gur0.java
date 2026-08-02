package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgScreenshot.kt */
/* loaded from: classes2.dex */
public final class gur0 extends osr0<hur0> {
    public static final /* synthetic */ int r = 0;
    public final TextView m;
    public final qz30 n;
    public final List<Object> o;
    public Peer p;
    public pk30 q;

    /* compiled from: VhMsgScreenshot.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            gur0 gur0Var = gur0.this;
            Peer peer = gur0Var.p;
            if (peer == null || (pk30Var = gur0Var.q) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public gur0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        this.n = new qz30(view.getContext());
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.MsgScreenshot);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.o = e43.l(new StyleSpan(1), new a());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(hur0 hur0Var, pk30 pk30Var) {
        this.q = pk30Var;
        boolean z = hur0Var.b;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.p = hur0Var.d;
        boolean z2 = hur0Var.e;
        textView.setText(this.n.n(hur0Var.c, this.o, z2));
    }
}
