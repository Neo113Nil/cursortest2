package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachCurator;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vkontakte.android.R;

/* compiled from: MsgPartCuratorHolder.kt */
/* loaded from: classes2.dex */
public final class kp30 extends hr30<AttachCurator, lp30> {
    public MsgPartSnippetView d;
    public ucp e;
    public pk30 f;
    public lp30 g;
    public final v5t h = new v5t(R.layout.vkim_msg_part_curator);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            kp30 kp30Var = kp30.this;
            pk30 pk30Var = kp30Var.f;
            lp30 lp30Var = kp30Var.g;
            Msg msg = lp30Var != null ? lp30Var.h : null;
            Attach attach = lp30Var != null ? lp30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, lp30Var != null ? lp30Var.i : null);
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
            kp30 kp30Var = kp30.this;
            pk30 pk30Var = kp30Var.f;
            lp30 lp30Var = kp30Var.g;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = lp30Var != null ? lp30Var.h : null;
            Attach attach = lp30Var != null ? lp30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, lp30Var != null ? lp30Var.i : null);
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
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        hr30.k(msgPartSnippetView, bubbleColors);
    }

    @Override // xsna.hr30
    public final void p(lp30 lp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        lp30 lp30Var2 = lp30Var;
        this.f = pk30Var;
        this.g = lp30Var2;
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        ucp ucpVar = this.e;
        if (ucpVar == null) {
            ucpVar = null;
        }
        String str = lp30Var2.d;
        ucpVar.getClass();
        msgPartSnippetView.j(1, ucp.i(str));
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        msgPartSnippetView2.setImageList(lp30Var2.e);
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        MsgPartSnippetView msgPartSnippetView4 = msgPartSnippetView3 == null ? null : msgPartSnippetView3;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        msgPartSnippetView4.i(1, msgPartSnippetView3.getContext().getString(R.string.vkim_msg_list_curator_desc));
        jr30 jr30Var = lp30Var2.b;
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        hr30.m(jr30Var, msgPartSnippetView5 != null ? msgPartSnippetView5 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = ucp.a;
        v5t v5tVar = this.h;
        this.d = (MsgPartSnippetView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new b());
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            return null;
        }
        return msgPartSnippetView;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.g = null;
    }
}
