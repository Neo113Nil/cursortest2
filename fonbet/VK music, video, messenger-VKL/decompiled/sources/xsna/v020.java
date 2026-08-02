package xsna;

import one.video.player.OneVideoPlayer;
import one.video.view.compose.models.RenderType;

/* compiled from: PlayerSurface.kt */
/* loaded from: classes7.dex */
public final class v020 {
    public final OneVideoPlayer a;
    public final RenderType b;

    public v020(OneVideoPlayer oneVideoPlayer, RenderType renderType) {
        this.a = oneVideoPlayer;
        this.b = renderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v020)) {
            return false;
        }
        v020 v020Var = (v020) obj;
        return epx.f(this.a, v020Var.a) && this.b == v020Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediaViewViewState(player=" + this.a + ", renderType=" + this.b + ", zOrder=SurfaceZOrder(zOrder=0))";
    }
}
