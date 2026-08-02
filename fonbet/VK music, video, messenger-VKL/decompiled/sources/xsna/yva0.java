package xsna;

import android.graphics.Rect;
import android.util.Size;
import one.video.pip.config.data.PlaybackStatus;

/* compiled from: PlaybackConfig.kt */
/* loaded from: classes8.dex */
public final class yva0 {
    public final Size a;
    public final PlaybackStatus b;
    public final boolean c;
    public final boolean d;
    public final Rect e;
    public final boolean f;
    public final boolean g;

    public yva0(Size size, PlaybackStatus playbackStatus, boolean z, boolean z2, Rect rect, boolean z3, boolean z4) {
        this.a = size;
        this.b = playbackStatus;
        this.c = z;
        this.d = z2;
        this.e = rect;
        this.f = z3;
        this.g = z4;
    }

    public static yva0 a(yva0 yva0Var, Size size, boolean z, int i) {
        if ((i & 1) != 0) {
            size = yva0Var.a;
        }
        Size size2 = size;
        PlaybackStatus playbackStatus = yva0Var.b;
        boolean z2 = yva0Var.c;
        boolean z3 = yva0Var.d;
        Rect rect = yva0Var.e;
        boolean z4 = yva0Var.f;
        if ((i & 64) != 0) {
            z = yva0Var.g;
        }
        return new yva0(size2, playbackStatus, z2, z3, rect, z4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yva0)) {
            return false;
        }
        yva0 yva0Var = (yva0) obj;
        return epx.f(this.a, yva0Var.a) && this.b == yva0Var.b && this.c == yva0Var.c && this.d == yva0Var.d && epx.f(this.e, yva0Var.e) && this.f == yva0Var.f && this.g == yva0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackConfig(videoSize=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", isSeekAvailable=");
        gsi0.c(sb, this.c, ", isPauseAvailable=", this.d, ", sourceRectHint=");
        sb.append(this.e);
        sb.append(", isAdActive=");
        sb.append(this.f);
        sb.append(", isSkippableAd=");
        return n23.b(sb, this.g, ")");
    }
}
