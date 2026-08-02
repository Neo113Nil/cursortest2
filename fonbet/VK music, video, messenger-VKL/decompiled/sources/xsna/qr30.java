package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgPartLinkSmallHolder.kt */
/* loaded from: classes2.dex */
public final class qr30 extends hr30<AttachLink, rr30> {
    public Context d;
    public MsgPartIconTwoRowView e;
    public final Object f;
    public final Object g;
    public final v5t h;
    public final StringBuilder i;
    public pk30 j;
    public rr30 k;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            qr30 qr30Var = qr30.this;
            pk30 pk30Var = qr30Var.j;
            rr30 rr30Var = qr30Var.k;
            Msg msg = rr30Var != null ? rr30Var.h : null;
            Attach attach = rr30Var != null ? rr30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, rr30Var != null ? rr30Var.i : null);
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
            qr30 qr30Var = qr30.this;
            pk30 pk30Var = qr30Var.j;
            rr30 rr30Var = qr30Var.k;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = rr30Var != null ? rr30Var.h : null;
            Attach attach = rr30Var != null ? rr30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, rr30Var != null ? rr30Var.i : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public qr30() {
        x3i x3iVar = new x3i(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, x3iVar);
        this.g = msy.a(lazyThreadSafetyMode, new y3i(this, 28));
        this.h = new v5t(R.layout.vkim_msg_part_link_small);
        this.i = new StringBuilder();
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        hr30.j(msgPartIconTwoRowView, bubbleColors);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(rr30 rr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        rr30 rr30Var2 = rr30Var;
        this.j = pk30Var;
        this.k = rr30Var2;
        if (drm0.N(rr30Var2.e)) {
            boolean B = brm0.B(rr30Var2.d, "https://" + a0a.d + "/story", false);
            MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
            if (msgPartIconTwoRowView == null) {
                msgPartIconTwoRowView = null;
            }
            msgPartIconTwoRowView.setTitleText(B ? (String) this.g.getValue() : (String) this.f.getValue());
        } else {
            MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.e;
            if (msgPartIconTwoRowView2 == null) {
                msgPartIconTwoRowView2 = null;
            }
            ucp ucpVar = ucp.a;
            msgPartIconTwoRowView2.setTitleText(ucp.i(rr30Var2.e));
        }
        this.i.setLength(0);
        rwj0.a(rr30Var2.d, this.i);
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.e;
        if (msgPartIconTwoRowView3 == null) {
            msgPartIconTwoRowView3 = null;
        }
        msgPartIconTwoRowView3.setSubtitleText(this.i);
        jr30 jr30Var = rr30Var2.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView4 = this.e;
        hr30.m(jr30Var, msgPartIconTwoRowView4 != null ? msgPartIconTwoRowView4 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        v5t v5tVar = this.h;
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
        this.j = null;
        this.k = null;
    }
}
