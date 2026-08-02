package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachMarket;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vk.superapp.ui.FixTextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgPartMarketSmallHolder.kt */
/* loaded from: classes2.dex */
public final class yr30 extends hr30<AttachMarket, zr30> {
    public static final int k = iah0.a(5);
    public Context d;
    public MsgPartIconTwoRowView e;
    public final Object f;
    public final Object g;
    public pk30 h;
    public zr30 i;
    public final v5t j;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            yr30 yr30Var = yr30.this;
            pk30 pk30Var = yr30Var.h;
            zr30 zr30Var = yr30Var.i;
            Msg msg = zr30Var != null ? zr30Var.i : null;
            Attach attach = zr30Var != null ? zr30Var.k : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, zr30Var != null ? zr30Var.j : null);
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
            yr30 yr30Var = yr30.this;
            pk30 pk30Var = yr30Var.h;
            zr30 zr30Var = yr30Var.i;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = zr30Var != null ? zr30Var.i : null;
            Attach attach = zr30Var != null ? zr30Var.k : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, zr30Var != null ? zr30Var.j : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public yr30() {
        z3i z3iVar = new z3i(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, z3iVar);
        this.g = msy.a(lazyThreadSafetyMode, new tju(this, 9));
        this.j = new v5t(R.layout.vkim_msg_part_market_small);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        hr30.j(msgPartIconTwoRowView, bubbleColors);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(zr30 zr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        s3q0 s3q0Var;
        zr30 zr30Var2 = zr30Var;
        this.h = pk30Var;
        this.i = zr30Var2;
        String str = zr30Var2.d;
        boolean N = drm0.N(str);
        ?? r6 = this.g;
        if (N) {
            MsgPartIconTwoRowView msgPartIconTwoRowView = this.e;
            if (msgPartIconTwoRowView == null) {
                msgPartIconTwoRowView = null;
            }
            msgPartIconTwoRowView.setTitleText((String) r6.getValue());
            MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.e;
            if (msgPartIconTwoRowView2 == null) {
                msgPartIconTwoRowView2 = null;
            }
            msgPartIconTwoRowView2.setSubtitleText((String) this.f.getValue());
        } else {
            MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.e;
            if (msgPartIconTwoRowView3 == null) {
                msgPartIconTwoRowView3 = null;
            }
            ucp ucpVar = ucp.a;
            msgPartIconTwoRowView3.setTitleText(ucp.i(str));
            MsgPartIconTwoRowView msgPartIconTwoRowView4 = this.e;
            if (msgPartIconTwoRowView4 == null) {
                msgPartIconTwoRowView4 = null;
            }
            msgPartIconTwoRowView4.setSubtitleText((String) r6.getValue());
        }
        Integer num = zr30Var2.e;
        Integer num2 = zr30Var2.f;
        if (num == null || num2 == null) {
            s3q0Var = null;
        } else {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            MsgPartIconTwoRowView msgPartIconTwoRowView5 = this.e;
            if (msgPartIconTwoRowView5 == null) {
                msgPartIconTwoRowView5 = null;
            }
            FixTextView fixTextView = msgPartIconTwoRowView5.d;
            his0.t(fixTextView, intValue2, intValue);
            fixTextView.setCompoundDrawablePadding(k);
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            MsgPartIconTwoRowView msgPartIconTwoRowView6 = this.e;
            if (msgPartIconTwoRowView6 == null) {
                msgPartIconTwoRowView6 = null;
            }
            msgPartIconTwoRowView6.d.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        jr30 jr30Var = zr30Var2.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView7 = this.e;
        if (msgPartIconTwoRowView7 == null) {
            msgPartIconTwoRowView7 = null;
        }
        hr30.m(jr30Var, msgPartIconTwoRowView7);
        Attach attach = zr30Var2.k;
        AttachMarket attachMarket = attach instanceof AttachMarket ? (AttachMarket) attach : null;
        if (attachMarket != null) {
            l24.a(attachMarket);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        v5t v5tVar = this.j;
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
        this.h = null;
        this.i = null;
    }
}
