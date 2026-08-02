package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: Snippet.kt */
/* loaded from: classes3.dex */
public final class nbk0 {
    public final long a;
    public final MusicTrack b;
    public final MusicTrack c;
    public final boolean d;

    public nbk0(long j, MusicTrack musicTrack, MusicTrack musicTrack2, boolean z) {
        this.a = j;
        this.b = musicTrack;
        this.c = musicTrack2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbk0)) {
            return false;
        }
        nbk0 nbk0Var = (nbk0) obj;
        nbk0Var.getClass();
        return this.a == nbk0Var.a && this.b.equals(nbk0Var.b) && epx.f(this.c, nbk0Var.c) && this.d == nbk0Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + bh10.a(Long.hashCode(0L) * 31, 31, this.a)) * 31;
        MusicTrack musicTrack = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Snippet(startFromMs=0, stopAtMs=");
        sb.append(this.a);
        sb.append(", snippetTrack=");
        sb.append(this.b);
        sb.append(", addedFullTrack=");
        sb.append(this.c);
        sb.append(", isRemoved=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
