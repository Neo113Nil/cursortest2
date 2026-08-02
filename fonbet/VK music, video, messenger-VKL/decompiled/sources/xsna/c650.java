package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicSnippetParams.kt */
/* loaded from: classes3.dex */
public final class c650 {
    public final MusicTrack a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public c650(MusicTrack musicTrack, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.a = musicTrack;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c650)) {
            return false;
        }
        c650 c650Var = (c650) obj;
        return epx.f(this.a, c650Var.a) && epx.f(this.b, c650Var.b) && this.c.equals(c650Var.c) && this.d.equals(c650Var.d) && this.e.equals(c650Var.e) && this.f.equals(c650Var.f) && this.g.equals(c650Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicSnippetParams(musicTrack=");
        sb.append(this.a);
        sb.append(", playlistTrackCode=");
        sb.append(this.b);
        sb.append(", playlistId=null, playlistOwnerId=null, progressPos=");
        sb.append(this.c);
        sb.append(", playlistPos=");
        sb.append(this.d);
        sb.append(", volume=");
        sb.append(this.e);
        sb.append(", timelinePosition=");
        sb.append(this.f);
        sb.append(", playbackDuration=");
        return uqi.b(sb, this.g, ')');
    }
}
