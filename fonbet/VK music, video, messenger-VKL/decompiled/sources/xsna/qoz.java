package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: LoadAllByCacheCmd.kt */
/* loaded from: classes2.dex */
public final class qoz extends le6<ipm> {
    public final long b;
    public final Object c;

    public qoz(long j, Object obj) {
        this.b = j;
        this.c = obj;
    }

    @Override // xsna.le6
    public final ipm e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(Peer.a.b(this.b), Source.CACHE, false, this.c, 16)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoz)) {
            return false;
        }
        qoz qozVar = (qoz) obj;
        return this.b == qozVar.b && epx.f(this.c, qozVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("LoadAllByCacheCmd(dialogId="));
    }
}
