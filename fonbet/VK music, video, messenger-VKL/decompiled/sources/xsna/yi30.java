package xsna;

import com.vk.dto.common.Peer;

/* compiled from: MsgForTranslate.kt */
/* loaded from: classes6.dex */
public final class yi30 {
    public final Peer a;
    public final int b;
    public final String c;

    public yi30(int i, Peer peer, String str) {
        this.a = peer;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi30)) {
            return false;
        }
        yi30 yi30Var = (yi30) obj;
        return epx.f(this.a, yi30Var.a) && this.b == yi30Var.b && epx.f(this.c, yi30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgForTranslate(peerDialog=");
        sb.append(this.a);
        sb.append(", cnvMsgId=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
