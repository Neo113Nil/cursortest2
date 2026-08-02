package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelDonatChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class vxa implements e900 {
    public final Peer a;
    public final boolean b;

    public vxa(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxa)) {
            return false;
        }
        vxa vxaVar = (vxa) obj;
        return epx.f(this.a, vxaVar.a) && this.b == vxaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelDonatChangeLpEvent(channel=");
        sb.append(this.a);
        sb.append(", isDon=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
