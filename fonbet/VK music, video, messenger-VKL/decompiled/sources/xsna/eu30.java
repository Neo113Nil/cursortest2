package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;

/* compiled from: MsgPartUnsupportedHolder.kt */
/* loaded from: classes2.dex */
public final class eu30 extends hr30<Attach, fu30> {
    public MsgPartIconTwoRowView d;
    public pk30 e;
    public fu30 f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_unsupported);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            eu30 eu30Var = eu30.this;
            pk30 pk30Var = eu30Var.e;
            fu30 fu30Var = eu30Var.f;
            Msg msg = fu30Var != null ? fu30Var.f : null;
            Attach attach = fu30Var != null ? fu30Var.h : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, fu30Var != null ? fu30Var.g : null);
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
            eu30 eu30Var = eu30.this;
            pk30 pk30Var = eu30Var.e;
            fu30 fu30Var = eu30Var.f;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = fu30Var != null ? fu30Var.f : null;
            Attach attach = fu30Var != null ? fu30Var.h : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, fu30Var != null ? fu30Var.g : null);
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
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        msgPartIconTwoRowView.setIconTintColor(bubbleColors.r);
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.d;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        msgPartIconTwoRowView2.setTimeTextColor(bubbleColors.h);
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.d;
        if (msgPartIconTwoRowView3 == null) {
            msgPartIconTwoRowView3 = null;
        }
        msgPartIconTwoRowView3.setTitleTextColor(bubbleColors.d);
        MsgPartIconTwoRowView msgPartIconTwoRowView4 = this.d;
        (msgPartIconTwoRowView4 != null ? msgPartIconTwoRowView4 : null).setSubtitleTextColor(bubbleColors.i);
    }

    @Override // xsna.hr30
    public final void p(fu30 fu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        fu30 fu30Var2 = fu30Var;
        this.e = pk30Var;
        this.f = fu30Var2;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        msgPartIconTwoRowView.setSubtitleText("");
        jr30 jr30Var = fu30Var2.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.d;
        hr30.m(jr30Var, msgPartIconTwoRowView2 != null ? msgPartIconTwoRowView2 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.g;
        this.d = (MsgPartIconTwoRowView) v5tVar.c(layoutInflater, viewGroup);
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
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            return null;
        }
        return msgPartIconTwoRowView;
    }

    @Override // xsna.hr30
    public final void r() {
        this.e = null;
        this.f = null;
    }
}
