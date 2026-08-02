package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;

/* compiled from: MsgPartWallPostReplyHolder.kt */
/* loaded from: classes2.dex */
public final class uu30 extends hr30<AttachWallReply, vu30> {
    public Context d;
    public MsgPartIconTwoRowView e;
    public final v5t f = new v5t(R.layout.vkim_msg_part_wall_post_reply);
    public final bpn0 g = new bpn0(new mxj(this, 29));
    public final bpn0 h = new bpn0(new gbj(this, 28));
    public pk30 i;
    public vu30 j;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            uu30 uu30Var = uu30.this;
            pk30 pk30Var = uu30Var.i;
            vu30 vu30Var = uu30Var.j;
            Msg msg = vu30Var != null ? vu30Var.g : null;
            Attach attach = vu30Var != null ? vu30Var.i : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, vu30Var != null ? vu30Var.h : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            uu30 uu30Var = uu30.this;
            pk30 pk30Var = uu30Var.i;
            vu30 vu30Var = uu30Var.j;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = vu30Var != null ? vu30Var.g : null;
            Attach attach = vu30Var != null ? vu30Var.i : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, vu30Var != null ? vu30Var.h : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        hr30.j(msgPartIconTwoRowView, bubbleColors);
    }

    @Override // xsna.hr30
    public final void p(vu30 vu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        vu30 vu30Var2 = vu30Var;
        this.j = vu30Var2;
        this.i = pk30Var;
        String str = vu30Var2.c;
        boolean isEmpty = TextUtils.isEmpty(str);
        bpn0 bpn0Var = this.g;
        if (isEmpty) {
            MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
            if (msgPartIconTwoRowView == null) {
                msgPartIconTwoRowView = null;
            }
            msgPartIconTwoRowView.setTitleText((String) bpn0Var.getValue());
            MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.e;
            if (msgPartIconTwoRowView2 == null) {
                msgPartIconTwoRowView2 = null;
            }
            msgPartIconTwoRowView2.setSubtitleText((String) this.h.getValue());
        } else {
            CharSequence q = ine0.q(str);
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(q);
            MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.e;
            if (msgPartIconTwoRowView3 == null) {
                msgPartIconTwoRowView3 = null;
            }
            msgPartIconTwoRowView3.setTitleText(i);
            MsgPartIconTwoRowView msgPartIconTwoRowView4 = this.e;
            if (msgPartIconTwoRowView4 == null) {
                msgPartIconTwoRowView4 = null;
            }
            msgPartIconTwoRowView4.setSubtitleText((String) bpn0Var.getValue());
        }
        jr30 jr30Var = vu30Var2.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView5 = this.e;
        hr30.m(jr30Var, msgPartIconTwoRowView5 != null ? msgPartIconTwoRowView5 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        v5t v5tVar = this.f;
        MsgPartIconTwoRowView msgPartIconTwoRowView = (MsgPartIconTwoRowView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        (view2 != null ? view2 : null).setOnLongClickListener(new b());
        this.e = msgPartIconTwoRowView;
        return msgPartIconTwoRowView;
    }

    @Override // xsna.hr30
    public final void r() {
        this.i = null;
        this.j = null;
    }
}
