package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: ClipsAudioTrackMeta.kt */
/* loaded from: classes16.dex */
public final class ahd {
    public final MusicTrack a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ahd(MusicTrack musicTrack, int i, int i2, int i3, boolean z, boolean z2) {
        this.a = musicTrack;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahd)) {
            return false;
        }
        ahd ahdVar = (ahd) obj;
        return epx.f(this.a, ahdVar.a) && this.b == ahdVar.b && this.c == ahdVar.c && this.d == ahdVar.d && this.e == ahdVar.e && this.f == ahdVar.f;
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.a;
        return Boolean.hashCode(this.f) + qoy.b(shy.a(this.d, shy.a(this.c, shy.a(this.b, (musicTrack == null ? 0 : musicTrack.hashCode()) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAudioTrackMeta(track=");
        sb.append(this.a);
        sb.append(", startMs=");
        sb.append(this.b);
        sb.append(", endMs=");
        sb.append(this.c);
        sb.append(", recommendedTimeMs=");
        sb.append(this.d);
        sb.append(", isFromVideo=");
        sb.append(this.e);
        sb.append(", isBoundsUserUpdated=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
