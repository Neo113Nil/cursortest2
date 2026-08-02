package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.ImEngineException;

/* compiled from: DialogsAvatarChangeCmd.kt */
/* loaded from: classes2.dex */
public final class ymm extends le6<Boolean> {
    public final Peer b;
    public final String c;
    public final Object d;

    public ymm(Peer peer, String str, Object obj) {
        this.b = peer;
        this.c = str;
        this.d = obj;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer peer = this.b;
        boolean zb = peer.zb();
        long j = peer.b;
        if (!zb) {
            throw new ImEngineException(qlb0.a(j, "Specified dialogId=", " is not a chat"));
        }
        bz2.c(new qzb(peer, this.c, w2wVar.Q0()), "ChatsChangeAvatarApiCmd");
        w2wVar.J0(this, new tqm(new sqm(this.b, Source.NETWORK, false, this.d, 16))).await();
        w2wVar.S0().v(j, this.d);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymm)) {
            return false;
        }
        ymm ymmVar = (ymm) obj;
        return epx.f(this.b, ymmVar.b) && epx.f(this.c, ymmVar.c) && epx.f(this.d, ymmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, false);
        Object obj = this.d;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsAvatarUpdateCmd(peer=");
        sb.append(this.b);
        sb.append(", filePath='");
        sb.append(this.c);
        sb.append("', awaitNetwork=false, changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
