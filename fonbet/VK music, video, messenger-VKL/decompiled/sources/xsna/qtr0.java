package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ipo0;

/* compiled from: VhMsgChatStyleUpdate.kt */
/* loaded from: classes2.dex */
public final class qtr0 extends osr0<rtr0> implements ipo0.a {
    public static final /* synthetic */ int v = 0;
    public final TextView m;
    public final qz30 n;
    public Peer o;
    public pk30 p;
    public final List<Object> q;
    public final List<Object> r;
    public final List<Object> s;
    public rtr0 t;
    public ipo0 u;

    /* compiled from: VhMsgChatStyleUpdate.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            qtr0 qtr0Var = qtr0.this;
            if (qtr0Var.o == null || (pk30Var = qtr0Var.p) == null) {
                return;
            }
            pk30Var.t();
        }
    }

    /* compiled from: VhMsgChatStyleUpdate.kt */
    public static final class b extends u120 {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            qtr0 qtr0Var = qtr0.this;
            if (qtr0Var.o == null || (pk30Var = qtr0Var.p) == null) {
                return;
            }
            pk30Var.y();
        }
    }

    /* compiled from: VhMsgChatStyleUpdate.kt */
    public static final class c extends u120 {
        public c() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            qtr0 qtr0Var = qtr0.this;
            Peer peer = qtr0Var.o;
            if (peer == null || (pk30Var = qtr0Var.p) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public qtr0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        this.n = new qz30(view.getContext());
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ChatStyleUpdate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.q = e43.l(new StyleSpan(1), new c());
        this.r = e43.l(new StyleSpan(1), new a());
        this.s = e43.l(new StyleSpan(1), new b());
    }

    @Override // xsna.ipo0.a
    public final void C5() {
        g6();
    }

    @Override // xsna.ipo0.a
    public final void U3() {
        g6();
    }

    @Override // xsna.osr0
    public final void W5() {
        ipo0 ipo0Var = this.u;
        if (ipo0Var != null) {
            ipo0Var.c(this);
        }
        this.u = null;
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(rtr0 rtr0Var, pk30 pk30Var) {
        this.t = rtr0Var;
        this.p = pk30Var;
        ipo0 ipo0Var = rtr0Var.h;
        if (ipo0Var != null) {
            ipo0Var.b(this);
            this.u = ipo0Var;
        }
        boolean z = rtr0Var.c;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.o = rtr0Var.e;
        if (this.u != null) {
            g6();
        } else {
            b6(rtr0Var.d, rtr0Var, null, false);
        }
    }

    public final void b6(qtd0 qtd0Var, rtr0 rtr0Var, String str, boolean z) {
        boolean z2 = rtr0Var != null ? rtr0Var.b : false;
        boolean z3 = rtr0Var != null ? rtr0Var.g : false;
        String str2 = "";
        if (z3) {
            if (z2 && z) {
                str2 = this.itemView.getContext().getString(R.string.vkim_msg_chat_style_change_btn);
            } else if (z2 && !z) {
                str2 = this.itemView.getContext().getString(R.string.vkim_msg_chat_style_enable_btn);
            }
        }
        String str3 = str2;
        List<Object> list = z ? this.r : this.s;
        List list2 = z3 ? this.q : EmptyList.b;
        if (!z3) {
            list = EmptyList.b;
        }
        this.m.setText(this.n.k(qtd0Var, list2, str, str3, list));
    }

    public final void g6() {
        String str;
        ipo0 ipo0Var = this.u;
        if (ipo0Var != null) {
            rtr0 rtr0Var = this.t;
            str = ipo0Var.d(rtr0Var != null ? rtr0Var.f : null);
        } else {
            str = null;
        }
        ipo0 ipo0Var2 = this.u;
        boolean z = false;
        if (ipo0Var2 != null && ipo0Var2.a()) {
            z = true;
        }
        boolean z2 = !z;
        rtr0 rtr0Var2 = this.t;
        b6(rtr0Var2 != null ? rtr0Var2.d : null, rtr0Var2, str, z2);
    }
}
