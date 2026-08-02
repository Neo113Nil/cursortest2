package xsna;

import com.vk.dto.common.Peer;

/* compiled from: GroupCanSendToMePending.kt */
/* loaded from: classes2.dex */
public final class yiu {
    public final Peer a;
    public final boolean b;
    public final boolean c;

    public yiu(Peer peer, boolean z, boolean z2) {
        this.a = peer;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiu)) {
            return false;
        }
        yiu yiuVar = (yiu) obj;
        return epx.f(this.a, yiuVar.a) && this.b == yiuVar.b && this.c == yiuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCanSendToMePending(peer=");
        sb.append(this.a);
        sb.append(", canSendMsgToMe=");
        sb.append(this.b);
        sb.append(", canSendNotifyToMe=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
