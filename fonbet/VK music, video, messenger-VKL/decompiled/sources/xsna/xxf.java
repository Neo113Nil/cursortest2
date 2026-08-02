package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgReadOutgoingChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class xxf implements e900 {
    public final Peer a;
    public final int b;

    public xxf(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxf)) {
            return false;
        }
        xxf xxfVar = (xxf) obj;
        return epx.f(this.a, xxfVar.a) && this.b == xxfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgReadOutgoingChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", tillMsgCnvId=");
        return vu5.b(sb, this.b, ')');
    }
}
