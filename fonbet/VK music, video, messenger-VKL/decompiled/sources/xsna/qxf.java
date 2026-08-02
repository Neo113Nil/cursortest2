package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgImportantChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class qxf implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public qxf(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxf)) {
            return false;
        }
        qxf qxfVar = (qxf) obj;
        return epx.f(this.a, qxfVar.a) && this.b == qxfVar.b && this.c == qxfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgImportantChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", isImportant=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
