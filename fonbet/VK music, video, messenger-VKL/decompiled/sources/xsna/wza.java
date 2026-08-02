package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelHiddenInAllFolderLpEvent.kt */
/* loaded from: classes2.dex */
public final class wza implements e900 {
    public final Peer a;
    public final boolean b;

    public wza(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wza)) {
            return false;
        }
        wza wzaVar = (wza) obj;
        return epx.f(this.a, wzaVar.a) && this.b == wzaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelHiddenInAllFolderLpEvent(channel=");
        sb.append(this.a);
        sb.append(", isHidden=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
