package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: LoadInitCmd.kt */
/* loaded from: classes2.dex */
public final class qpz extends le6<wpp<Long, Dialog>> {
    public final long b;
    public final Object c;

    public qpz(long j, Object obj) {
        this.b = j;
        this.c = obj;
    }

    @Override // xsna.le6
    public final wpp<Long, Dialog> e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        wpp<Long, Dialog> wppVar = (wpp) w2wVar.J0(this, new tqm(new sqm(Peer.a.b(j), Source.CACHE, false, this.c, 16))).await();
        return wppVar.j(Long.valueOf(j)) ? (wpp) w2wVar.J0(this, new tqm(new sqm(Peer.a.b(j), Source.ACTUAL, true, this.c, 16))).await() : wppVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpz)) {
            return false;
        }
        qpz qpzVar = (qpz) obj;
        return this.b == qpzVar.b && epx.f(this.c, qpzVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("LoadInitCmd(dialogId="));
    }
}
