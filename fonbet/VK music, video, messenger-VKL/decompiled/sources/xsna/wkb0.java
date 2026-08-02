package xsna;

import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import org.json.JSONObject;

/* compiled from: PodcastWithEpisodesMetaView.kt */
/* loaded from: classes3.dex */
public final class wkb0 {
    public final ugb0 a;
    public final int b;
    public final long c;

    public wkb0(ugb0 ugb0Var, int i, long j) {
        this.a = ugb0Var;
        this.b = i;
        this.c = j;
    }

    public final OfflinePodcast a() {
        ugb0 ugb0Var = this.a;
        return new OfflinePodcast(Podcast.a(new Podcast(new JSONObject(ugb0Var.n)), ugb0Var.k, 7167), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkb0)) {
            return false;
        }
        wkb0 wkb0Var = (wkb0) obj;
        return epx.f(this.a, wkb0Var.a) && this.b == wkb0Var.b && this.c == wkb0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastWithEpisodesMetaView(podcast=");
        sb.append(this.a);
        sb.append(", episodesCount=");
        sb.append(this.b);
        sb.append(", episodesDuration=");
        return vu5.a(')', this.c, sb);
    }
}
