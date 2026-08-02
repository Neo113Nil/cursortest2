package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: LoadAllByCacheCmd.kt */
/* loaded from: classes2.dex */
public final class roz extends le6<wpp<Long, Dialog>> {
    public final long b;
    public final Object c;

    public roz(long j, Object obj) {
        this.b = j;
        this.c = obj;
    }

    @Override // xsna.le6
    public final wpp<Long, Dialog> e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (wpp) w2wVar.b1(this, new tqm(new sqm(Peer.a.b(this.b), Source.CACHE, false, this.c, 16)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roz)) {
            return false;
        }
        roz rozVar = (roz) obj;
        return this.b == rozVar.b && epx.f(this.c, rozVar.c);
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
