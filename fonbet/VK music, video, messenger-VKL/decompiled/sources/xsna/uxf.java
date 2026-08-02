package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgIsListenedChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class uxf implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public uxf(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxf)) {
            return false;
        }
        uxf uxfVar = (uxf) obj;
        return epx.f(this.a, uxfVar.a) && this.b == uxfVar.b && this.c == uxfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgIsListenedChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", isListened=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
