package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgInvalidateLpEvent.kt */
/* loaded from: classes2.dex */
public final class sxf implements e900 {
    public final Peer a;
    public final int b;

    public sxf(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxf)) {
            return false;
        }
        sxf sxfVar = (sxf) obj;
        return epx.f(this.a, sxfVar.a) && this.b == sxfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgInvalidateLpEvent(dialogPeer=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        return vu5.b(sb, this.b, ')');
    }
}
