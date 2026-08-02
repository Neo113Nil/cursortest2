package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import xsna.g1l;

/* compiled from: VhDate.kt */
/* loaded from: classes2.dex */
public final class wqr0 extends osr0<xqr0> implements g1l.a {
    public static final /* synthetic */ int q = 0;
    public final TextView m;
    public final ci30 n;
    public final StringBuffer o;
    public g1l p;

    public wqr0(View view) {
        super(view);
        this.m = (TextView) view.findViewById(R.id.text);
        this.n = new ci30(view.getContext());
        this.o = new StringBuffer();
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.Date);
    }

    @Override // xsna.g1l.a
    public final void Q5(boolean z) {
        awt0.u(this.m, z);
    }

    @Override // xsna.osr0
    public final /* bridge */ /* synthetic */ void V5(Object obj, pk30 pk30Var) {
        a6((xqr0) obj);
    }

    @Override // xsna.osr0
    public final void W5() {
        g1l g1lVar = this.p;
        if (g1lVar != null) {
            g1lVar.b(this.itemView);
        }
        this.p = null;
    }

    public final void a6(xqr0 xqr0Var) {
        boolean z = xqr0Var.b;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        g1l g1lVar = xqr0Var.f;
        if (g1lVar != null) {
            this.p = g1lVar;
            g1lVar.a(this.itemView, this);
        }
        StringBuffer stringBuffer = this.o;
        stringBuffer.setLength(0);
        this.n.b(xqr0Var.d, stringBuffer);
        textView.setText(stringBuffer);
        Q5(true);
    }
}
