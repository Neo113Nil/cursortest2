package xsna;

import com.vk.music.player.PlayerTrack;

/* compiled from: TracklistItem.kt */
/* loaded from: classes3.dex */
public final class xhp0 implements whp0 {
    public final PlayerTrack a;
    public final int b;

    public xhp0(PlayerTrack playerTrack) {
        this.a = playerTrack;
        this.b = playerTrack.b.Vb() ? 1 : playerTrack.b.Wb() ? 4 : playerTrack.b.Mb() ? 5 : playerTrack.b.Qb() ? 2 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhp0) && epx.f(this.a, ((xhp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.whp0
    public final int l() {
        return this.b;
    }

    public final String toString() {
        return "TracklistItemTrack(playerTrack=" + this.a + ')';
    }
}
