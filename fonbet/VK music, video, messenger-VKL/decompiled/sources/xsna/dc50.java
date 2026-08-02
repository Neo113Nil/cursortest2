package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackInfo.kt */
/* loaded from: classes16.dex */
public final class dc50 {
    public final MusicTrack a;
    public final int b;
    public final int c;
    public final int d;

    public dc50(MusicTrack musicTrack, int i, int i2, int i3) {
        this.a = musicTrack;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc50)) {
            return false;
        }
        dc50 dc50Var = (dc50) obj;
        return epx.f(this.a, dc50Var.a) && this.b == dc50Var.b && this.c == dc50Var.c && this.d == dc50Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackInfo(musicTrack=");
        sb.append(this.a);
        sb.append(", startMs=");
        sb.append(this.b);
        sb.append(", finishMs=");
        sb.append(this.c);
        sb.append(", delayMs=");
        return vu5.b(sb, this.d, ')');
    }
}
