package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.api_commands.messages.MsgHistoryApiLoadMode;
import xsna.q2b;
import xsna.ut90;

/* compiled from: RemoteChannelMsgHistoryDataSource.kt */
/* loaded from: classes2.dex */
public final class quf0 implements rvf0 {
    public final w2w a;
    public final String b;
    public final boolean c;

    public quf0(w2w w2wVar, String str, boolean z) {
        this.a = w2wVar;
        this.b = str;
        this.c = z;
    }

    @Override // xsna.rvf0
    public final zt90 a(Peer peer, MsgHistoryApiLoadMode msgHistoryApiLoadMode, int i, int i2) {
        q2b.c cVar = (q2b.c) fo50.v(new q2b(peer, msgHistoryApiLoadMode, i2, i, this.b, this.c), this.a, "ChannelMessagesGetHistoryApiCmd", 2);
        return new zt90(new ut90.a(peer), cVar.a, cVar.b, cVar.c, cVar.d, i);
    }
}
