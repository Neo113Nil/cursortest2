package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vkontakte.android.R;

/* compiled from: MsgPartEventHolder.kt */
/* loaded from: classes2.dex */
public final class bq30 extends hr30<AttachEvent, cq30> {
    public MsgPartSnippetView d;
    public Context e;
    public pk30 f;
    public cq30 g;
    public final v5t h = new v5t(R.layout.vkim_msg_part_event);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            bq30 bq30Var = bq30.this;
            pk30 pk30Var = bq30Var.f;
            cq30 cq30Var = bq30Var.g;
            Msg msg = cq30Var != null ? cq30Var.j : null;
            Attach attach = cq30Var != null ? cq30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, cq30Var != null ? cq30Var.k : null);
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
            bq30 bq30Var = bq30.this;
            pk30 pk30Var = bq30Var.f;
            cq30 cq30Var = bq30Var.g;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = cq30Var != null ? cq30Var.j : null;
            Attach attach = cq30Var != null ? cq30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, cq30Var != null ? cq30Var.k : null);
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
    public final void p(cq30 cq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        cq30 cq30Var2 = cq30Var;
        this.g = cq30Var2;
        this.f = pk30Var;
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        ImageList imageList = cq30Var2.d;
        msgPartSnippetView.b.setLocalImage((Iterable<? extends fxj0>) null);
        msgPartSnippetView.b.setRemoteImage(imageList);
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        msgPartSnippetView2.j(1, cq30Var2.e);
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        long j = cq30Var2.f;
        msgPartSnippetView3.i(1, j > 0 ? pvo0.i(false, (int) (j / 1000), false, false) : null);
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            msgPartSnippetView4 = null;
        }
        msgPartSnippetView4.setCaptionText(cq30Var2.g);
        jr30 jr30Var = cq30Var2.b;
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        hr30.m(jr30Var, msgPartSnippetView5 != null ? msgPartSnippetView5 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.e = context;
        Resources resources = context.getResources();
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
            msgPartSnippetView = null;
        }
        int color = resources.getColor(R.color.vkim_msg_part_placeholder);
        Context context2 = this.e;
        if (context2 == null) {
            context2 = null;
        }
        msgPartSnippetView.setImagePlaceholder(new wng0(color, e3m.d(R.attr.im_msg_part_corner_radius_small, context2)));
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            return null;
        }
        return msgPartSnippetView2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.g = null;
    }
}
