package xsna;

import one.video.player.OneVideoPlayer;

/* compiled from: SmartCropPlayerViewState.kt */
/* loaded from: classes7.dex */
public final class y4k0 {
    public final OneVideoPlayer a;

    public y4k0(OneVideoPlayer oneVideoPlayer) {
        this.a = oneVideoPlayer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4k0) && epx.f(this.a, ((y4k0) obj).a);
    }

    public final int hashCode() {
        OneVideoPlayer oneVideoPlayer = this.a;
        if (oneVideoPlayer == null) {
            return 0;
        }
        return oneVideoPlayer.hashCode();
    }

    public final String toString() {
        return "SmartCropPlayerViewState(player=" + this.a + ')';
    }
}
