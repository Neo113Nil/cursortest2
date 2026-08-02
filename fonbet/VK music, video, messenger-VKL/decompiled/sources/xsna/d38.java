package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.kz30;
import xsna.pq8;

/* compiled from: BotKeyboardComponent.kt */
/* loaded from: classes2.dex */
public final class d38 extends j8i {
    public final a1w i;
    public final q0w0 j;
    public final kkm k;
    public h38 l;
    public io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();
    public kz30.e n;
    public long o;
    public Dialog p;

    /* compiled from: BotKeyboardComponent.kt */
    public static final class a implements b38 {
        public a() {
        }

        @Override // xsna.b38
        public final void a(BotButton botButton, int i) {
            d38 d38Var = d38.this;
            kz30.e eVar = d38Var.n;
            if (eVar != null) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                kz30.this.T(new MsgSendSource.a(botButton, new pq8.b(i, Peer.a.b(d38Var.o))));
            }
        }
    }

    public d38(a1w a1wVar, q0w0 q0w0Var, long j, kkm kkmVar) {
        this.i = a1wVar;
        this.j = q0w0Var;
        this.k = kkmVar;
        this.o = j;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        BotKeyboard botKeyboard;
        q0w0 q0w0Var = this.j;
        h38 h38Var = new h38(q0w0Var.d.p(), q0w0Var.d.o());
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
        Dialog dialog = this.p;
        if (dialog == null || (botKeyboard = dialog.V2()) == null) {
            botKeyboard = com.vk.im.engine.models.conversations.a.a;
        }
        h38Var.c(botKeyboard);
        int f = this.k.f(R.attr.vk_legacy_accent);
        a38 a38Var2 = h38Var.h;
        if (a38Var2 != null) {
            a38Var2.d = f;
            a38Var2.notifyDataSetChanged();
        } else {
            h38Var.i = Integer.valueOf(f);
        }
        h38Var.b();
        this.l = h38Var;
        return h38Var.f;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.l = null;
        this.m.dispose();
    }

    public final void X0(Dialog dialog) {
        BotKeyboard V2;
        ArrayList arrayList;
        if (epx.f(this.p, dialog)) {
            return;
        }
        if (!dialog.Gb() || (V2 = dialog.V2()) == null || (arrayList = V2.g) == null || !(!arrayList.isEmpty())) {
            h38 h38Var = this.l;
            if (h38Var != null) {
                h38Var.c(com.vk.im.engine.models.conversations.a.a);
                return;
            }
            return;
        }
        h38 h38Var2 = this.l;
        if (h38Var2 != null) {
            BotKeyboard V22 = dialog.V2();
            if (V22 == null) {
                V22 = com.vk.im.engine.models.conversations.a.a;
            }
            h38Var2.c(V22);
        }
    }
}
