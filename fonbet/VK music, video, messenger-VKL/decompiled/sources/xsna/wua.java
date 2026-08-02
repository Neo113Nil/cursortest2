package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelCanPostDonutChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class wua implements e900 {
    public final Peer a;
    public final boolean b;

    public wua(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wua)) {
            return false;
        }
        wua wuaVar = (wua) obj;
        return epx.f(this.a, wuaVar.a) && this.b == wuaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCanPostDonutChangeLpEvent(channel=");
        sb.append(this.a);
        sb.append(", canPostDonut=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
