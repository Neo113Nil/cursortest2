package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: LoadInitCmd.kt */
/* loaded from: classes2.dex */
public final class ppz extends le6<ipm> {
    public final long b;
    public final Object c;

    public ppz(long j, Object obj) {
        this.b = j;
        this.c = obj;
    }

    @Override // xsna.le6
    public final ipm e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        ipm ipmVar = (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(Peer.a.b(j), Source.CACHE, false, this.c, 16)));
        return ipmVar.a.j(Long.valueOf(j)) ? (ipm) w2wVar.J0(this, new uqm(new sqm(Peer.a.b(j), Source.ACTUAL, true, this.c, 16))).await() : ipmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppz)) {
            return false;
        }
        ppz ppzVar = (ppz) obj;
        return this.b == ppzVar.b && epx.f(this.c, ppzVar.c);
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
