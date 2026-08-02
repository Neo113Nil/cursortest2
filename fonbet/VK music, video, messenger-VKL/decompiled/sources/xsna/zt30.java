package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.hints.HintId;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.ui.views.msg.MsgPartTextView;
import com.vk.im.ui.views.span.SpanPressableTextView;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.abi0;
import xsna.e3m;

/* compiled from: MsgPartTextHolder.kt */
/* loaded from: classes2.dex */
public final class zt30 extends hr30<Attach, au30> implements abi0.a {
    public MsgPartTextView d;
    public pk30 e;
    public au30 f;
    public abi0 h;
    public final v5t g = new v5t(R.layout.vkim_msg_part_text);
    public final u6k i = new u6k(this, 23);
    public final pa j = new pa(this, 27);
    public final a k = new a();
    public final b l = new b();

    /* compiled from: MsgPartTextHolder.kt */
    public static final class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            zt30 zt30Var = zt30.this;
            au30 au30Var = zt30Var.f;
            if (au30Var == null) {
                return false;
            }
            wvw wvwVar = au30Var.d;
            boolean m = wvwVar.b().m(HintId.IM_TEXT_SELECTION);
            MsgPartTextView msgPartTextView = zt30Var.d;
            if (msgPartTextView == null) {
                msgPartTextView = null;
            }
            CharSequence text = msgPartTextView.getText();
            int i = 0;
            for (int i2 = 0; i2 < text.length(); i2++) {
                if (text.charAt(i2) == ' ') {
                    i++;
                }
            }
            boolean z = i > 1;
            if (m && z) {
                l7v b = wvwVar.b();
                MsgPartTextView msgPartTextView2 = zt30Var.d;
                b.q(msgPartTextView2 != null ? msgPartTextView2 : null, HintId.IM_TEXT_SELECTION);
                return true;
            }
            au30 au30Var2 = zt30Var.f;
            if (au30Var2 != null) {
                int i3 = au30Var2.h;
                pk30 pk30Var = zt30Var.e;
                if (pk30Var != null) {
                    pk30Var.b0(i3);
                }
            }
            return true;
        }
    }

    /* compiled from: MsgPartTextHolder.kt */
    public static final class b implements SpanPressableTextView.c {
        public b() {
        }

        @Override // com.vk.im.ui.views.span.SpanPressableTextView.c
        public final void a() {
            CnvMsgId cnvMsgId;
            eew eewVar;
            au30 au30Var = zt30.this.f;
            if (au30Var == null || (cnvMsgId = au30Var.i) == null || (eewVar = au30Var.c) == null || eewVar.c == null) {
                return;
            }
            HashSet<CnvMsgId> hashSet = slo0.b;
            if (hashSet.contains(cnvMsgId)) {
                return;
            }
            hashSet.add(cnvMsgId);
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            com.vk.movika.sdk.base.model.n.c(h5s.b("vkm_msg_text_selection"), thp0.c, bVar);
        }
    }

    @Override // xsna.abi0.a
    public final void h(boolean z) {
        boolean z2;
        au30 au30Var = this.f;
        if (au30Var != null) {
            int i = au30Var.h;
            abi0 abi0Var = this.h;
            Boolean valueOf = abi0Var != null ? Boolean.valueOf(abi0Var.d(Integer.valueOf(i))) : null;
            if (valueOf != null) {
                z2 = valueOf.booleanValue();
                t(z, z2);
            }
        }
        z2 = false;
        t(z, z2);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        au30 au30Var = this.f;
        if (au30Var == null || !au30Var.f) {
            MsgPartTextView msgPartTextView = this.d;
            if (msgPartTextView == null) {
                msgPartTextView = null;
            }
            msgPartTextView.setTimeBgColor(0);
            MsgPartTextView msgPartTextView2 = this.d;
            if (msgPartTextView2 == null) {
                msgPartTextView2 = null;
            }
            msgPartTextView2.setTimeTextColor(bubbleColors.h);
        } else {
            MsgPartTextView msgPartTextView3 = this.d;
            MsgPartTextView msgPartTextView4 = msgPartTextView3 == null ? null : msgPartTextView3;
            if (msgPartTextView3 == null) {
                msgPartTextView3 = null;
            }
            Context context = msgPartTextView3.getContext();
            e3m.a aVar = e3m.a;
            msgPartTextView4.setTimeBgColor(context.getColor(R.color.vk_black_alpha35));
            MsgPartTextView msgPartTextView5 = this.d;
            if (msgPartTextView5 == null) {
                msgPartTextView5 = null;
            }
            msgPartTextView5.setTimeTextColor(l8g.f(1.0f, -1));
        }
        MsgPartTextView msgPartTextView6 = this.d;
        if (msgPartTextView6 == null) {
            msgPartTextView6 = null;
        }
        msgPartTextView6.setLinkTextColor(bubbleColors.e);
        MsgPartTextView msgPartTextView7 = this.d;
        (msgPartTextView7 != null ? msgPartTextView7 : null).setTextColor(bubbleColors.g);
    }

    @Override // xsna.hr30
    public final void p(au30 au30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        abi0 abi0Var;
        au30 au30Var2 = au30Var;
        CharSequence charSequence = au30Var2.e;
        int i = au30Var2.h;
        this.e = pk30Var;
        this.f = au30Var2;
        abi0 abi0Var2 = au30Var2.l;
        if (abi0Var2 != null) {
            abi0Var2.a(this);
            abi0Var = abi0Var2;
        } else {
            abi0Var = null;
        }
        this.h = abi0Var;
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setOnSpanClickListener(new ro9(2, this, ub80Var));
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setOnSpanLongPressListener(vb80Var);
        MsgPartTextView msgPartTextView3 = this.d;
        if (msgPartTextView3 == null) {
            msgPartTextView3 = null;
        }
        msgPartTextView3.setText(charSequence);
        t(abi0Var2 != null ? abi0Var2.b() : false, abi0Var2 != null ? abi0Var2.d(Integer.valueOf(i)) : false);
        s(charSequence, au30Var2.f, abi0Var2 != null ? abi0Var2.d(Integer.valueOf(i)) : false);
        jr30 jr30Var = au30Var2.b;
        MsgPartTextView msgPartTextView4 = this.d;
        hr30.m(jr30Var, msgPartTextView4 != null ? msgPartTextView4 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MsgPartTextView msgPartTextView = (MsgPartTextView) this.g.c(layoutInflater, viewGroup);
        this.d = msgPartTextView;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setOnClickListener(new bg0(this.i, 8));
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setOnLongClickListener(this.k);
        MsgPartTextView msgPartTextView3 = this.d;
        if (msgPartTextView3 == null) {
            msgPartTextView3 = null;
        }
        msgPartTextView3.setOnDoubleTapListener(this.j);
        MsgPartTextView msgPartTextView4 = this.d;
        if (msgPartTextView4 == null) {
            msgPartTextView4 = null;
        }
        msgPartTextView4.setOnTextSelectionListener(this.l);
        MsgPartTextView msgPartTextView5 = this.d;
        if (msgPartTextView5 == null) {
            return null;
        }
        return msgPartTextView5;
    }

    @Override // xsna.hr30
    public final void r() {
        this.e = null;
        this.f = null;
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setOnSpanClickListener(null);
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setOnSpanLongPressListener(null);
        abi0 abi0Var = this.h;
        if (abi0Var != null) {
            abi0Var.c(this);
        }
        this.h = null;
    }

    public final void s(CharSequence charSequence, boolean z, boolean z2) {
        fk30 fk30Var;
        if (z && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            if (z2) {
                MsgPartTextView msgPartTextView = this.d;
                if (msgPartTextView == null) {
                    msgPartTextView = null;
                }
                fk30Var = new fk30(msgPartTextView.getContext());
            } else {
                fk30Var = null;
            }
            for (Object obj : spannable.getSpans(0, spannable.length(), wdp.class)) {
                wdp wdpVar = (wdp) obj;
                if (fk30Var != null) {
                    Drawable.ConstantState constantState = wdpVar.g.getConstantState();
                    Drawable newDrawable = constantState != null ? constantState.newDrawable() : null;
                    if (newDrawable != null) {
                        wdpVar.g = newDrawable;
                        wdpVar.b();
                        newDrawable.setColorFilter(fk30Var);
                    }
                } else {
                    wdpVar.g.setColorFilter(null);
                }
            }
        }
    }

    public final void t(boolean z, boolean z2) {
        MsgPartTextView msgPartTextView = this.d;
        if (msgPartTextView == null) {
            msgPartTextView = null;
        }
        msgPartTextView.setSpanClicksEnabled(!z);
        MsgPartTextView msgPartTextView2 = this.d;
        if (msgPartTextView2 == null) {
            msgPartTextView2 = null;
        }
        msgPartTextView2.setTextSelectionEnabled(z2);
        MsgPartTextView msgPartTextView3 = this.d;
        if (msgPartTextView3 == null) {
            msgPartTextView3 = null;
        }
        msgPartTextView3.setOnLongClickListener(z2 ? null : this.k);
        au30 au30Var = this.f;
        if (au30Var != null) {
            s(au30Var.e, au30Var.f, z2);
        }
    }
}
