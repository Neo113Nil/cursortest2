package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartTextView;
import com.vkontakte.android.R;

/* compiled from: MsgPartEmptyHolder.kt */
/* loaded from: classes2.dex */
public final class zp30 extends hr30<Attach, aq30> {
    public MsgPartTextView d;
    public pk30 e;
    public aq30 f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_empty);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            zp30 zp30Var = zp30.this;
            pk30 pk30Var = zp30Var.e;
            aq30 aq30Var = zp30Var.f;
            Integer valueOf = aq30Var != null ? Integer.valueOf(aq30Var.d) : null;
            if (pk30Var == null || valueOf == null) {
                return;
            }
            pk30Var.g(valueOf.intValue());
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            zp30 zp30Var = zp30.this;
            pk30 pk30Var = zp30Var.e;
            aq30 aq30Var = zp30Var.f;
            Boolean bool = null;
            Integer valueOf = aq30Var != null ? Integer.valueOf(aq30Var.d) : null;
            if (pk30Var != null && valueOf != null) {
                pk30Var.b0(valueOf.intValue());
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
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setTextColor(bubbleColors.i);
        MsgPartTextView msgPartTextView2 = this.d;
        (msgPartTextView2 != null ? msgPartTextView2 : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(aq30 aq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        aq30 aq30Var2 = aq30Var;
        this.e = pk30Var;
        this.f = aq30Var2;
        jr30 jr30Var = aq30Var2.b;
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        hr30.m(jr30Var, msgPartTextView);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.g;
        this.d = (MsgPartTextView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new a());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new b());
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            return null;
        }
        return msgPartTextView;
    }

    @Override // xsna.hr30
    public final void r() {
        this.e = null;
        this.f = null;
    }
}
