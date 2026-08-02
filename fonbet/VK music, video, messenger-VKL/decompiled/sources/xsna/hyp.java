package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: EventConsumer.kt */
/* loaded from: classes2.dex */
public final class hyp implements io.reactivex.rxjava3.functions.f<sxp> {
    public final long b;
    public final ChatFragment c;

    public hyp(long j, ChatFragment chatFragment) {
        this.b = j;
        this.c = chatFragment;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        String str;
        sxp sxpVar2 = sxpVar;
        boolean z = sxpVar2 instanceof r480;
        long j = this.b;
        ChatFragment chatFragment = this.c;
        if (z) {
            Dialog dialog = (Dialog) ((r480) sxpVar2).c.c.get(Long.valueOf(j));
            if (dialog != null) {
                DialogExt dialogExt = chatFragment.V;
                chatFragment.Do(new DialogExt(dialog, (dialogExt != null ? dialogExt : null).b));
                return;
            }
            return;
        }
        if (sxpVar2 instanceof OnCacheInvalidateEvent) {
            chatFragment.Jo(Source.CACHE);
            return;
        }
        if (sxpVar2 instanceof i980) {
            if (((i980) sxpVar2).d == j) {
                chatFragment.Jo(Source.NETWORK);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof pc80) {
            if (((pc80) sxpVar2).b == j) {
                chatFragment.Jo(Source.NETWORK);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof f280) {
            f280 f280Var = (f280) sxpVar2;
            if (f280Var.b == j) {
                k28 k28Var = chatFragment.a1;
                (k28Var != null ? k28Var : null).X0(f280Var);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof e280) {
            Throwable th = ((e280) sxpVar2).b;
            k28 k28Var2 = chatFragment.a1;
            (k28Var2 != null ? k28Var2 : null).getClass();
            zk70.e(th);
            return;
        }
        if (!(sxpVar2 instanceof h480)) {
            if ((sxpVar2 instanceof m980) && ((m980) sxpVar2).c == j) {
                cvk.t();
                return;
            }
            return;
        }
        h480 h480Var = (h480) sxpVar2;
        if (h480Var.b == j) {
            Peer peer = h480Var.c;
            qtd0 Bb = h480Var.d.Bb(peer);
            if (Bb == null || (str = Bb.name()) == null) {
                str = "";
            }
            edw edwVar = edw.a;
            edw.e(chatFragment.requireContext(), str, new com.vk.movika.sdk.base.logic.interactor.c(6, chatFragment, peer));
        }
    }
}
