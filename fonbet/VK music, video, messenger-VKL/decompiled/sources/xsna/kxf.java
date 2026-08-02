package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgDeleteTillLpEvent.kt */
/* loaded from: classes2.dex */
public final class kxf implements e900 {
    public final Peer a;
    public final int b;
    public final boolean c;

    public kxf(int i, Peer peer, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxf)) {
            return false;
        }
        kxf kxfVar = (kxf) obj;
        return epx.f(this.a, kxfVar.a) && this.b == kxfVar.b && this.c == kxfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgDeleteTillLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", tillMsgCnvId=");
        sb.append(this.b);
        sb.append(", afterLeaveChat=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
