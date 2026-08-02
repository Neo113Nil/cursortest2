package xsna;

/* compiled from: VideoPageUiState.kt */
/* loaded from: classes5.dex */
public final class r1t0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final p1t0 h;

    public r1t0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, p1t0 p1t0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = p1t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1t0)) {
            return false;
        }
        r1t0 r1t0Var = (r1t0) obj;
        return this.a == r1t0Var.a && this.b == r1t0Var.b && this.c == r1t0Var.c && this.d == r1t0Var.d && this.e == r1t0Var.e && this.f == r1t0Var.f && this.g == r1t0Var.g && epx.f(this.h, r1t0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "VideoPageUiState(systemAllowsAutoPlay=" + this.a + ", isPlaybackRequested=" + this.b + ", effectiveCanPlay=" + this.c + ", isPictureSlotVisibleInWindow=" + this.d + ", showPreviewFrame=" + this.e + ", showVideoSurface=" + this.f + ", shouldRenderVideo=" + this.g + ", overlay=" + this.h + ')';
    }
}
