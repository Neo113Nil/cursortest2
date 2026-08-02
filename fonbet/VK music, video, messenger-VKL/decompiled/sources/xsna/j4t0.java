package xsna;

import com.vk.libvideo.design.view.overlay.VideoOverlayView;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class j4t0 {
    public final wya0 a;
    public final fgn b;
    public final g3k c;
    public final VideoOverlayView.c d;
    public final com.vk.libvideo.api.ad.a e;
    public final rzj0 f;
    public final czn g;

    public j4t0(wya0 wya0Var, fgn fgnVar, g3k g3kVar, VideoOverlayView.c cVar, com.vk.libvideo.api.ad.a aVar, rzj0 rzj0Var, czn cznVar) {
        this.a = wya0Var;
        this.b = fgnVar;
        this.c = g3kVar;
        this.d = cVar;
        this.e = aVar;
        this.f = rzj0Var;
        this.g = cznVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4t0)) {
            return false;
        }
        j4t0 j4t0Var = (j4t0) obj;
        return epx.f(this.a, j4t0Var.a) && epx.f(this.b, j4t0Var.b) && epx.f(this.c, j4t0Var.c) && epx.f(this.d, j4t0Var.d) && epx.f(this.e, j4t0Var.e) && epx.f(this.f, j4t0Var.f) && epx.f(this.g, j4t0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        VideoOverlayView.c cVar = this.d;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        com.vk.libvideo.api.ad.a aVar = this.e;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        rzj0 rzj0Var = this.f;
        int hashCode4 = (hashCode3 + (rzj0Var == null ? 0 : rzj0Var.hashCode())) * 31;
        czn cznVar = this.g;
        return hashCode4 + (cznVar != null ? cznVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoPlayerState(playback=" + this.a + ", display=" + this.b + ", cover=" + this.c + ", overlay=" + this.d + ", adData=" + this.e + ", skippableState=" + this.f + ", donutChipState=" + this.g + ')';
    }
}
