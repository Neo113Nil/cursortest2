package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.MsgSendSource;
import xsna.pq8;

/* compiled from: MsgPartKeyboardHolder.kt */
/* loaded from: classes2.dex */
public final class kr30 extends hr30<Attach, lr30> {
    public final q0w0 d;
    public h38 e;
    public pk30 f;
    public lr30 g;

    /* compiled from: MsgPartKeyboardHolder.kt */
    public static final class a implements b38 {
        public a() {
        }

        @Override // xsna.b38
        public final void a(BotButton botButton, int i) {
            kr30 kr30Var = kr30.this;
            pk30 pk30Var = kr30Var.f;
            lr30 lr30Var = kr30Var.g;
            Long valueOf = lr30Var != null ? Long.valueOf(lr30Var.d) : null;
            lr30 lr30Var2 = kr30Var.g;
            Integer valueOf2 = lr30Var2 != null ? Integer.valueOf(lr30Var2.e) : null;
            if (pk30Var == null || valueOf == null || valueOf2 == null) {
                return;
            }
            int intValue = valueOf2.intValue();
            long longValue = valueOf.longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            pk30Var.a(new MsgSendSource.a(botButton, new pq8.c(intValue, i, Peer.a.b(longValue))));
        }
    }

    public kr30(q0w0 q0w0Var) {
        this.d = q0w0Var;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        h38 h38Var = this.e;
        if (h38Var == null) {
            h38Var = null;
        }
        int i = bubbleColors.b;
        a38 a38Var = h38Var.h;
        if (a38Var == null) {
            h38Var.i = Integer.valueOf(i);
        } else {
            a38Var.d = i;
            a38Var.notifyDataSetChanged();
        }
    }

    @Override // xsna.hr30
    public final void p(lr30 lr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        lr30 lr30Var2 = lr30Var;
        this.f = pk30Var;
        this.g = lr30Var2;
        BotKeyboard botKeyboard = lr30Var2.c;
        if (botKeyboard != null) {
            h38 h38Var = this.e;
            if (h38Var == null) {
                h38Var = null;
            }
            h38Var.c(botKeyboard);
        }
        h38 h38Var2 = this.e;
        if (h38Var2 == null) {
            h38Var2 = null;
        }
        boolean z = lr30Var2.b;
        a38 a38Var = h38Var2.h;
        a38 a38Var2 = a38Var != null ? a38Var : null;
        if (a38Var2.g != z) {
            a38Var2.g = z;
            a38Var2.notifyDataSetChanged();
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q0w0 q0w0Var = this.d;
        LayoutInflater p = q0w0Var.d.p();
        h38 h38Var = new h38(p, q0w0Var.d.o());
        a aVar = new a();
        h38Var.e = aVar;
        if (h38Var.f != null) {
            a38 a38Var = h38Var.h;
            if (a38Var == null) {
                a38Var = null;
            }
            a38Var.f = aVar;
            a38Var.notifyDataSetChanged();
        }
        h38Var.b();
        this.e = h38Var;
        p.getContext();
        h38 h38Var2 = this.e;
        return (h38Var2 != null ? h38Var2 : null).f;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.g = null;
    }
}
