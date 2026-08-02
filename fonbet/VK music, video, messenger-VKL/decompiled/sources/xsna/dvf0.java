package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.api_commands.messages.MsgHistoryApiLoadMode;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.ut90;
import xsna.we20;

/* compiled from: RemoteDialogMsgHistoryDataSource.kt */
/* loaded from: classes2.dex */
public final class dvf0 implements rvf0 {
    public final w2w a;
    public final boolean b;

    public dvf0(w2w w2wVar, boolean z) {
        this.a = w2wVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rvf0
    public final zt90 a(Peer peer, MsgHistoryApiLoadMode msgHistoryApiLoadMode, int i, int i2) {
        w2w w2wVar = this.a;
        we20.c cVar = (we20.c) fo50.v(new we20(peer, w2wVar.Q0(), msgHistoryApiLoadMode, i, i2, this.b), w2wVar, "MessagesGetHistoryApiCmd", 2);
        Peer peer2 = peer;
        List<Msg> list = cVar.a;
        if (peer2.Ab(Peer.Type.CONTACT)) {
            List<Msg> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Msg) it.next()).c != peer2.b) {
                        long j = peer2.d;
                        Peer peer3 = (Peer) ((it80) w2wVar.L0(this, new gim(j, this))).a;
                        if (peer3 != null) {
                            peer2 = peer3;
                        } else {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.w, new Object[]{qlb0.a(j, "Attempt to map contact ", " to userId failed")});
                            }
                        }
                    }
                }
            }
        }
        return new zt90(new ut90.b(peer2), cVar.a, new ProfilesSimpleInfo(), cVar.b, cVar.c, i);
    }
}
