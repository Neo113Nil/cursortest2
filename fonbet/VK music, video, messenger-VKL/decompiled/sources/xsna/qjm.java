package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogSetBitFlagsLpEvent.kt */
/* loaded from: classes2.dex */
public final class qjm implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public qjm(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjm)) {
            return false;
        }
        qjm qjmVar = (qjm) obj;
        return epx.f(this.a, qjmVar.a) && this.b == qjmVar.b && this.c == qjmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogSetBitFlagsLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", isSet=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
