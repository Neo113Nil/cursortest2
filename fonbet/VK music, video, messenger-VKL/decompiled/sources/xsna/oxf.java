package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgHiddenChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class oxf implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public oxf(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxf)) {
            return false;
        }
        oxf oxfVar = (oxf) obj;
        return epx.f(this.a, oxfVar.a) && this.b == oxfVar.b && this.c == oxfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgHiddenChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", isHidden=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
