package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgDeleteChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class ixf implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public ixf(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixf)) {
            return false;
        }
        ixf ixfVar = (ixf) obj;
        return epx.f(this.a, ixfVar.a) && this.b == ixfVar.b && this.c == ixfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgDeleteChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", isDeleted=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
