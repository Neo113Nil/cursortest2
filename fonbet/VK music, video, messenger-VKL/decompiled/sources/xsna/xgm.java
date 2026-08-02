package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMarkedAsUnreadChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class xgm implements e900 {
    public final Peer a;
    public final boolean b;

    public xgm(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgm)) {
            return false;
        }
        xgm xgmVar = (xgm) obj;
        return this.a.equals(xgmVar.a) && this.b == xgmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMarkedAsUnreadChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", markedAsUnread=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
