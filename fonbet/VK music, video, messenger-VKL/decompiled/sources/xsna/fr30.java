package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vkontakte.android.R;

/* compiled from: MsgPartHighlightHolder.kt */
/* loaded from: classes2.dex */
public final class fr30 extends hr30<AttachHighlight, gr30> {
    public MsgPartSnippetView d;
    public gr30 e;
    public pk30 f;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            fr30 fr30Var = fr30.this;
            pk30 pk30Var = fr30Var.f;
            gr30 gr30Var = fr30Var.e;
            Msg msg = gr30Var != null ? gr30Var.i : null;
            Attach attach = gr30Var != null ? gr30Var.k : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, gr30Var != null ? gr30Var.j : null);
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
            fr30 fr30Var = fr30.this;
            pk30 pk30Var = fr30Var.f;
            gr30 gr30Var = fr30Var.e;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = gr30Var != null ? gr30Var.i : null;
            Attach attach = gr30Var != null ? gr30Var.k : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, gr30Var != null ? gr30Var.j : null);
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
    public final void p(gr30 gr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        gr30 gr30Var2 = gr30Var;
        this.f = pk30Var;
        this.e = gr30Var2;
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        Resources resources = msgPartSnippetView.getResources();
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        msgPartSnippetView2.setImageList(gr30Var2.e);
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        msgPartSnippetView3.j(1, gr30Var2.d);
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            msgPartSnippetView4 = null;
        }
        msgPartSnippetView4.setCaptionText(resources.getString(R.string.vkim_highligh_caption, gr30Var2.f));
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        if (msgPartSnippetView5 == null) {
            msgPartSnippetView5 = null;
        }
        msgPartSnippetView5.setButtonText(resources.getString(R.string.vkim_attach_story_button));
        jr30 jr30Var = gr30Var2.b;
        MsgPartSnippetView msgPartSnippetView6 = this.d;
        hr30.m(jr30Var, msgPartSnippetView6 != null ? msgPartSnippetView6 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.d = (MsgPartSnippetView) layoutInflater.inflate(R.layout.vkim_msg_part_link_large, viewGroup, false);
        wng0 wng0Var = new wng0(context.getColor(R.color.vkim_msg_part_placeholder), e3m.d(R.attr.im_msg_part_corner_radius_small, layoutInflater.getContext()));
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        msgPartSnippetView.setImagePlaceholder(wng0Var);
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        jjc.g(msgPartSnippetView2, new a());
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        msgPartSnippetView3.setOnLongClickListener(new b());
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            return null;
        }
        return msgPartSnippetView4;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.e = null;
    }
}
