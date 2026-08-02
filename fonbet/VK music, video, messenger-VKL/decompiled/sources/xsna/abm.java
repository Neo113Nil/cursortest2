package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotKeyboard;
import java.util.LinkedHashMap;

/* compiled from: DialogBotKeyboardUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class abm extends e500 {
    public final w2w c;
    public final Peer d;

    public abm(w2w w2wVar, Peer peer) {
        super("DialogBotKeyboardUpdateLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        p4g.a(Long.valueOf(this.d.b), f400Var.c, !c400Var.d.containsKey(Long.valueOf(r0.b)));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        long j = peer.b;
        final long j2 = peer.b;
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) linkedHashMap.get(Long.valueOf(j));
        final BotKeyboard botKeyboard = aVar != null ? aVar.s : null;
        w2w w2wVar = this.c;
        final hpm c = sn.c(w2wVar);
        c.b.b().h(new izs() { // from class: xsna.vom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                hpm hpmVar = hpm.this;
                long j3 = j2;
                hpmVar.l0(j3, botKeyboard);
                hpmVar.m0(j3, true);
                return s3q0.a;
            }
        });
        w2wVar.S0().V(j2);
    }
}
