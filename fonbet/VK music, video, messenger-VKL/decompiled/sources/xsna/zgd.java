package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: ClipsAudioState.kt */
/* loaded from: classes16.dex */
public final class zgd implements km50 {
    public final MusicTrack b;
    public final int c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public zgd(MusicTrack musicTrack, int i, float f, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.b = musicTrack;
        this.c = i;
        this.d = f;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public static zgd a(zgd zgdVar, MusicTrack musicTrack, int i, float f, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5) {
        if ((i5 & 1) != 0) {
            musicTrack = zgdVar.b;
        }
        MusicTrack musicTrack2 = musicTrack;
        if ((i5 & 2) != 0) {
            i = zgdVar.c;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            f = zgdVar.d;
        }
        float f2 = f;
        if ((i5 & 8) != 0) {
            i2 = zgdVar.e;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = zgdVar.f;
        }
        int i8 = i3;
        int i9 = (i5 & 32) != 0 ? zgdVar.g : i4;
        boolean z4 = (i5 & 64) != 0 ? zgdVar.h : z;
        boolean z5 = (i5 & 128) != 0 ? zgdVar.i : z2;
        boolean z6 = (i5 & 256) != 0 ? zgdVar.j : z3;
        zgdVar.getClass();
        return new zgd(musicTrack2, i6, f2, i7, i8, i9, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgd)) {
            return false;
        }
        zgd zgdVar = (zgd) obj;
        return epx.f(this.b, zgdVar.b) && this.c == zgdVar.c && Float.compare(this.d, zgdVar.d) == 0 && this.e == zgdVar.e && this.f == zgdVar.f && this.g == zgdVar.g && this.h == zgdVar.h && this.i == zgdVar.i && this.j == zgdVar.j;
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.b;
        return Boolean.hashCode(this.j) + qoy.b(qoy.b(shy.a(this.g, shy.a(this.f, shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, (musicTrack == null ? 0 : musicTrack.hashCode()) * 31, 31), 31), 31), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAudioState(track=");
        sb.append(this.b);
        sb.append(", trackPosition=");
        sb.append(this.c);
        sb.append(", trackDuration=");
        sb.append(this.d);
        sb.append(", startMs=");
        sb.append(this.e);
        sb.append(", endMs=");
        sb.append(this.f);
        sb.append(", recommendedTimeMs=");
        sb.append(this.g);
        sb.append(", isFromVideo=");
        sb.append(this.h);
        sb.append(", isVideoPaused=");
        sb.append(this.i);
        sb.append(", isBoundsUserUpdated=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
