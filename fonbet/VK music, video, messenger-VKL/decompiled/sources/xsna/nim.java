package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogPinnedMsgAttachLpEvent.kt */
/* loaded from: classes2.dex */
public final class nim implements e900 {
    public final Peer a;
    public final int b;

    public nim(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nim)) {
            return false;
        }
        nim nimVar = (nim) obj;
        return epx.f(this.a, nimVar.a) && this.b == nimVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogPinnedMsgAttachLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", cnvMsgId=");
        return vu5.b(sb, this.b, ')');
    }
}
