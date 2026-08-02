package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: SnippetEntity.kt */
/* loaded from: classes3.dex */
public final class wbk0 implements jx4 {
    public static final wbk0 e = new wbk0(0, new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0, 0, false, 0, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null));
    public final long b;
    public final MusicTrack c;
    public MusicTrack d;

    public wbk0(long j, MusicTrack musicTrack) {
        this.b = j;
        this.c = musicTrack;
        musicTrack.Fb();
    }

    @Override // xsna.jx4
    public final long a() {
        return this.b;
    }

    @Override // xsna.jx4
    public final long b() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbk0)) {
            return false;
        }
        wbk0 wbk0Var = (wbk0) obj;
        wbk0Var.getClass();
        return this.b == wbk0Var.b && this.c.equals(wbk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bh10.a(Long.hashCode(0L) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetEntity(startFromMs=0, stopAtMs=");
        sb.append(this.b);
        sb.append(", musicTrack=");
        return rq.c(sb, this.c, ')');
    }
}
