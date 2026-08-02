package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartTextView;
import com.vkontakte.android.R;
import xsna.abi0;

/* compiled from: MsgPartFwdWallPostTextHolder.kt */
/* loaded from: classes2.dex */
public final class uq30 extends hr30<AttachWall, vq30> implements abi0.a {
    public TextView d;
    public MsgPartTextView e;
    public Integer f;
    public pk30 g;
    public abi0 i;
    public final v5t h = new v5t(R.layout.vkim_msg_part_fwd_wall_post_text);
    public final tcn j = new tcn(this, 23);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            uq30 uq30Var = uq30.this;
            pk30 pk30Var = uq30Var.g;
            Integer num = uq30Var.f;
            if (pk30Var == null || num == null) {
                return;
            }
            pk30Var.g(num.intValue());
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            Boolean bool;
            uq30 uq30Var = uq30.this;
            pk30 pk30Var = uq30Var.g;
            Integer num = uq30Var.f;
            if (pk30Var == null || num == null) {
                bool = null;
            } else {
                pk30Var.b0(num.intValue());
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.abi0.a
    public final void h(boolean z) {
        boolean z2;
        Integer num = this.f;
        if (num != null) {
            int intValue = num.intValue();
            abi0 abi0Var = this.i;
            Boolean valueOf = abi0Var != null ? Boolean.valueOf(abi0Var.d(Integer.valueOf(intValue))) : null;
            if (valueOf != null) {
                z2 = valueOf.booleanValue();
                s(z, z2);
            }
        }
        z2 = false;
        s(z, z2);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.e;
        MsgPartTextView msgPartTextView = this.e;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setTextColor(bubbleColors.g);
        MsgPartTextView msgPartTextView2 = this.e;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setLinkTextColor(i);
        TextView textView = this.d;
        (textView != null ? textView : null).setTextColor(i);
    }

    @Override // xsna.hr30
    public final void p(vq30 vq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        abi0 abi0Var;
        vq30 vq30Var2 = vq30Var;
        CharSequence charSequence = vq30Var2.e;
        CharSequence charSequence2 = vq30Var2.d;
        this.g = pk30Var;
        int i = vq30Var2.c;
        this.f = Integer.valueOf(i);
        abi0 abi0Var2 = vq30Var2.f;
        if (abi0Var2 != null) {
            abi0Var2.a(this);
            abi0Var = abi0Var2;
        } else {
            abi0Var = null;
        }
        this.i = abi0Var;
        MsgPartTextView msgPartTextView = this.e;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        awt0.v(msgPartTextView, charSequence2.length() > 0);
        msgPartTextView.setText(charSequence2);
        msgPartTextView.setOnSpanClickListener(ub80Var);
        msgPartTextView.setOnSpanLongPressListener(vb80Var);
        s(abi0Var2 != null ? abi0Var2.b() : false, abi0Var2 != null ? abi0Var2.d(Integer.valueOf(i)) : false);
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        awt0.v(textView, !(charSequence == null || charSequence.length() == 0));
        TextView textView2 = this.d;
        (textView2 != null ? textView2 : null).setText(charSequence);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        v5t v5tVar = this.h;
        LinearLayout linearLayout = (LinearLayout) v5tVar.c(layoutInflater, viewGroup);
        MsgPartTextView msgPartTextView = (MsgPartTextView) linearLayout.findViewById(R.id.post_text);
        this.e = msgPartTextView;
        msgPartTextView.setMaxLines(2);
        this.d = (TextView) linearLayout.findViewById(R.id.post_attach_desc);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new a());
        View view2 = (View) v5tVar.c;
        (view2 != null ? view2 : null).setOnLongClickListener(new b());
        return linearLayout;
    }

    @Override // xsna.hr30
    public final void r() {
        this.g = null;
        abi0 abi0Var = this.i;
        if (abi0Var != null) {
            abi0Var.c(this);
        }
        this.i = null;
    }

    public final void s(boolean z, boolean z2) {
        MsgPartTextView msgPartTextView = this.e;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setSpanClicksEnabled(!z);
        MsgPartTextView msgPartTextView2 = this.e;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setTextSelectionEnabled(z);
        MsgPartTextView msgPartTextView3 = this.e;
        if (msgPartTextView3 == null) {
            msgPartTextView3 = null;
        }
        final tcn tcnVar = z2 ? null : this.j;
        msgPartTextView3.setOnLongClickListener(tcnVar != null ? new View.OnLongClickListener() { // from class: xsna.tq30
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                tcn.this.invoke(view);
                return Boolean.TRUE.booleanValue();
            }
        } : null);
    }
}
