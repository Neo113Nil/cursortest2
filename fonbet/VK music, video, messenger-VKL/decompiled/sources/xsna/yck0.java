package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: SnippetTrackItem.kt */
/* loaded from: classes3.dex */
public final class yck0 implements hfz {
    public final String b;
    public final MusicTrack c;
    public final boolean d;
    public final MusicTrack e;

    public yck0(String str, MusicTrack musicTrack, boolean z, MusicTrack musicTrack2) {
        this.b = str;
        this.c = musicTrack;
        this.d = z;
        this.e = musicTrack2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yck0)) {
            return false;
        }
        yck0 yck0Var = (yck0) obj;
        return epx.f(this.b, yck0Var.b) && epx.f(this.c, yck0Var.c) && this.d == yck0Var.d && epx.f(this.e, yck0Var.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int b = qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        MusicTrack musicTrack = this.e;
        return b + (musicTrack == null ? 0 : musicTrack.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetTrackItem(sectionId=");
        sb.append(this.b);
        sb.append(", snippetTrack=");
        sb.append(this.c);
        sb.append(", isRemoved=");
        sb.append(this.d);
        sb.append(", addedFullTrack=");
        return rq.c(sb, this.e, ')');
    }
}
