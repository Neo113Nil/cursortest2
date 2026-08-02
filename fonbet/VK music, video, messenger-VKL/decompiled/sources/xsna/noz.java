package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: LoadAllByActualCmd.kt */
/* loaded from: classes2.dex */
public final class noz extends xl6<wpp<Long, Dialog>> {
    public final long b;
    public final Object c;

    public noz(long j, Object obj) {
        this.b = j;
        this.c = obj;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialogs-load-from-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return (wpp) w2wVar.b1(this, new tqm(new sqm(Peer.a.b(this.b), Source.ACTUAL, true, this.c, 16)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noz)) {
            return false;
        }
        noz nozVar = (noz) obj;
        return this.b == nozVar.b && epx.f(this.c, nozVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("DialogBar.LoadAllByActualCmd(dialogId="));
    }
}
