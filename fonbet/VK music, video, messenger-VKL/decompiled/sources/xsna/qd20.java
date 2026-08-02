package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ImEngineException;
import xsna.ij20;
import xsna.nd20;

/* compiled from: MessagesCreateGroupChatApiCmd.kt */
/* loaded from: classes2.dex */
public final class qd20 extends nx2<nd20.b> {
    public final String b;
    public final Peer c;
    public final Integer d;

    public qd20(Peer peer, Integer num, String str) {
        this.b = str;
        this.c = peer;
        this.d = num;
    }

    @Override // xsna.nx2
    public final nd20.b f(l7r0 l7r0Var) {
        Peer peer = this.c;
        peer.getClass();
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new ImEngineException(efz.b(peer.b, " is not a group", new StringBuilder("Specified dialogId=")));
        }
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "groups.addChat";
        aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        aVar.b("title", this.b);
        Integer num = this.d;
        if (num != null) {
            aVar.f.put("donut_level_id", num.toString());
            aVar.j("is_donut", true);
        }
        aVar.i = false;
        return (nd20.b) l7r0Var.d(new ij20(aVar), pd20.b);
    }
}
