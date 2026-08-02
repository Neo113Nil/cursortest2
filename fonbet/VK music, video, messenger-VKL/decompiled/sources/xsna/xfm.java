package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogIsNewStateChangedLpEvent.kt */
/* loaded from: classes2.dex */
public final class xfm implements e900 {
    public final Peer a;
    public final boolean b;

    public xfm(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfm)) {
            return false;
        }
        xfm xfmVar = (xfm) obj;
        return epx.f(this.a, xfmVar.a) && this.b == xfmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogIsNewStateChangedLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", isNew=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
