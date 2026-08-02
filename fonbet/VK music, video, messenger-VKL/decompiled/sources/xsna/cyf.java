package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgSpamChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class cyf implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public cyf(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyf)) {
            return false;
        }
        cyf cyfVar = (cyf) obj;
        return epx.f(this.a, cyfVar.a) && this.b == cyfVar.b && this.c == cyfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgSpamChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", isSpam=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
