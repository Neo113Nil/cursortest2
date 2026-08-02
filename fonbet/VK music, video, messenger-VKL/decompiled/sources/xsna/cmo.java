package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collections;
import xsna.gv30;

/* compiled from: DropChatForAllCmd.kt */
/* loaded from: classes2.dex */
public final class cmo extends le6<s3q0> {
    public final Peer b;
    public final Object c;

    public cmo(Peer peer, Object obj) {
        this.b = peer;
        this.c = obj;
        if (!peer.zb()) {
            throw new IllegalStateException(yq.b(peer, "DropChatForAllCmd available only for chat! Called for ").toString());
        }
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer Q0 = w2wVar.Q0();
        Peer peer = this.b;
        bz2.c(new bmo(peer, Q0), null);
        long j = peer.b;
        gv30.a aVar = new gv30.a();
        aVar.a = j;
        aVar.a();
        aVar.b();
        aVar.e = 1;
        aVar.d(Integer.MAX_VALUE);
        new zd20(new gv30(aVar), new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
        w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        w2wVar.e1(this, new r680(this, Collections.singleton(new b5w(j, ImItemType.DIALOG))));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmo)) {
            return false;
        }
        cmo cmoVar = (cmo) obj;
        return epx.f(this.b, cmoVar.b) && epx.f(this.c, cmoVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Object obj = this.c;
        return Boolean.hashCode(false) + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DropChatForAllCmd(peer=");
        sb.append(this.b);
        sb.append(", changerTag=");
        return tk5.c(sb, this.c, ", awaitNetwork=false)");
    }
}
