package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartTextView;
import com.vkontakte.android.R;
import xsna.abi0;

/* compiled from: MsgPartWallPostTextHolder.kt */
/* loaded from: classes2.dex */
public final class xu30 extends hr30<AttachWall, yu30> implements abi0.a {
    public MsgPartTextView d;
    public pk30 e;
    public yu30 f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_wall_post_text);
    public final eiz h = new eiz(this, 11);
    public abi0 i;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            xu30 xu30Var = xu30.this;
            pk30 pk30Var = xu30Var.e;
            yu30 yu30Var = xu30Var.f;
            Integer valueOf = yu30Var != null ? Integer.valueOf(yu30Var.c) : null;
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
            xu30 xu30Var = xu30.this;
            pk30 pk30Var = xu30Var.e;
            yu30 yu30Var = xu30Var.f;
            Boolean bool = null;
            Integer valueOf = yu30Var != null ? Integer.valueOf(yu30Var.c) : null;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // xsna.abi0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z) {
        boolean z2;
        MsgPartTextView msgPartTextView;
        yu30 yu30Var = this.f;
        if (yu30Var != null) {
            int i = yu30Var.c;
            abi0 abi0Var = this.i;
            Boolean valueOf = abi0Var != null ? Boolean.valueOf(abi0Var.d(Integer.valueOf(i))) : null;
            if (valueOf != null) {
                z2 = valueOf.booleanValue();
                msgPartTextView = this.d;
                if (msgPartTextView == null) {
                    msgPartTextView = null;
                }
                msgPartTextView.setSpanClicksEnabled(!z);
                MsgPartTextView msgPartTextView2 = this.d;
                (msgPartTextView2 != null ? msgPartTextView2 : null).setTextSelectionEnabled(z2);
            }
        }
        z2 = false;
        msgPartTextView = this.d;
        if (msgPartTextView == null) {
        }
        msgPartTextView.setSpanClicksEnabled(!z);
        MsgPartTextView msgPartTextView22 = this.d;
        (msgPartTextView22 != null ? msgPartTextView22 : null).setTextSelectionEnabled(z2);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setTextColor(bubbleColors.g);
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setLinkTextColor(bubbleColors.e);
        MsgPartTextView msgPartTextView3 = this.d;
        (msgPartTextView3 != null ? msgPartTextView3 : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(yu30 yu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        abi0 abi0Var;
        yu30 yu30Var2 = yu30Var;
        this.e = pk30Var;
        this.f = yu30Var2;
        abi0 abi0Var2 = yu30Var2.e;
        int i = yu30Var2.c;
        abi0 abi0Var3 = yu30Var2.e;
        if (abi0Var2 != null) {
            abi0Var2.a(this);
            abi0Var = abi0Var2;
        } else {
            abi0Var = null;
        }
        this.i = abi0Var;
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setOnSpanClickListener(ub80Var);
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setOnSpanLongPressListener(vb80Var);
        MsgPartTextView msgPartTextView3 = this.d;
        if (msgPartTextView3 == null) {
            msgPartTextView3 = null;
        }
        msgPartTextView3.setText(yu30Var2.b);
        boolean b2 = abi0Var2 != null ? abi0Var2.b() : false;
        boolean d = abi0Var3 != null ? abi0Var3.d(Integer.valueOf(i)) : false;
        MsgPartTextView msgPartTextView4 = this.d;
        if (msgPartTextView4 == null) {
            msgPartTextView4 = null;
        }
        msgPartTextView4.setSpanClicksEnabled(!b2);
        MsgPartTextView msgPartTextView5 = this.d;
        if (msgPartTextView5 == null) {
            msgPartTextView5 = null;
        }
        msgPartTextView5.setTextSelectionEnabled(d);
        MsgPartTextView msgPartTextView6 = this.d;
        if (msgPartTextView6 == null) {
            msgPartTextView6 = null;
        }
        final eiz eizVar = abi0Var3 != null ? abi0Var3.d(Integer.valueOf(i)) : false ? null : this.h;
        msgPartTextView6.setOnLongClickListener(eizVar != null ? new View.OnLongClickListener() { // from class: xsna.wu30
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                eiz.this.invoke(view);
                return Boolean.TRUE.booleanValue();
            }
        } : null);
        jr30 jr30Var = yu30Var2.f;
        MsgPartTextView msgPartTextView7 = this.d;
        hr30.m(jr30Var, msgPartTextView7 != null ? msgPartTextView7 : null);
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
        abi0 abi0Var = this.i;
        if (abi0Var != null) {
            abi0Var.c(this);
        }
        this.i = null;
    }
}
