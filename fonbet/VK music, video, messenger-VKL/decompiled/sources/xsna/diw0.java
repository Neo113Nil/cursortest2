package xsna;

import com.vk.dto.common.Peer;

/* compiled from: VoipCallServiceNavigationEvent.kt */
/* loaded from: classes7.dex */
public final class diw0 implements x49 {
    public final Peer.Member a;

    public diw0(Peer.Member member) {
        this.a = member;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof diw0) && this.a.equals(((diw0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return "ShareLink(peer=" + this.a + ')';
    }
}
