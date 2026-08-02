package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachRoom;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.kt30;

/* compiled from: MsgPartRoomHolder.kt */
/* loaded from: classes2.dex */
public final class jt30 extends hr30<AttachRoom, kt30> {
    public MsgPartSnippetView d;
    public pk30 e;
    public kt30 f;
    public kt30.a g;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new ee4(25));
    public final v5t i = new v5t(R.layout.vkim_msg_part_link_large);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            jt30 jt30Var = jt30.this;
            pk30 pk30Var = jt30Var.e;
            kt30 kt30Var = jt30Var.f;
            Msg msg = kt30Var != null ? kt30Var.h : null;
            Attach attach = kt30Var != null ? kt30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, kt30Var != null ? kt30Var.i : null);
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
            jt30 jt30Var = jt30.this;
            pk30 pk30Var = jt30Var.e;
            kt30 kt30Var = jt30Var.f;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = kt30Var != null ? kt30Var.h : null;
            Attach attach = kt30Var != null ? kt30Var.j : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, kt30Var != null ? kt30Var.i : null);
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

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(kt30 kt30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        kt30 kt30Var2 = kt30Var;
        this.e = pk30Var;
        this.f = kt30Var2;
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        String str = kt30Var2.c;
        if (str == null) {
            str = "";
        }
        msgPartSnippetView.j(1, str);
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        String str2 = kt30Var2.d;
        msgPartSnippetView2.i(2, str2 != null ? str2 : "");
        kt30.a aVar = kt30Var2.f;
        if (!aVar.equals(this.g)) {
            this.g = aVar;
            MsgPartSnippetView msgPartSnippetView3 = this.d;
            if (msgPartSnippetView3 == null) {
                msgPartSnippetView3 = null;
            }
            msgPartSnippetView3.b.n(null, null);
            MsgPartSnippetView msgPartSnippetView4 = this.d;
            if (msgPartSnippetView4 == null) {
                msgPartSnippetView4 = null;
            }
            msgPartSnippetView4.setImagePlaceholder(null);
            if (aVar instanceof kt30.a.C3205a) {
                MsgPartSnippetView msgPartSnippetView5 = this.d;
                if (msgPartSnippetView5 == null) {
                    msgPartSnippetView5 = null;
                }
                msgPartSnippetView5.setImageList(((kt30.a.C3205a) aVar).a);
            } else {
                if (!(aVar instanceof kt30.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                MsgPartSnippetView msgPartSnippetView6 = this.d;
                if (msgPartSnippetView6 == null) {
                    msgPartSnippetView6 = null;
                }
                msgPartSnippetView6.setImagePlaceholder(new LayerDrawable(new Drawable[]{new dpg0(new ColorDrawable(((kt30.a.b) aVar).a), ((Number) this.h.getValue()).floatValue()), dhr0.t.a(R.drawable.vk_icon_rooms_pattern)}));
            }
        }
        jr30 jr30Var = kt30Var2.g;
        MsgPartSnippetView msgPartSnippetView7 = this.d;
        hr30.m(jr30Var, msgPartSnippetView7 != null ? msgPartSnippetView7 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.i;
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
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
