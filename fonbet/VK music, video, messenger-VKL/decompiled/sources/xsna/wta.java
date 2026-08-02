package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.groups.AdminLevel;

/* compiled from: ChannelAdminLevelChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class wta implements e900 {
    public final Peer a;
    public final AdminLevel b;
    public final boolean c;

    public wta(Peer peer, AdminLevel adminLevel, boolean z) {
        this.a = peer;
        this.b = adminLevel;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wta)) {
            return false;
        }
        wta wtaVar = (wta) obj;
        return epx.f(this.a, wtaVar.a) && this.b == wtaVar.b && this.c == wtaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelAdminLevelChangeLpEvent(peer=");
        sb.append(this.a);
        sb.append(", adminLevel=");
        sb.append(this.b);
        sb.append(", canPost=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
