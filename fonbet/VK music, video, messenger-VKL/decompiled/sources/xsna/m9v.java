package xsna;

import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.upstream.c;
import com.vk.dto.music.MusicTrack;

/* compiled from: HlsMusicTrackPlaylistParserFactory.kt */
/* loaded from: classes3.dex */
public final class m9v implements p9v {
    public final jc50 a;
    public final Cache b;
    public final MusicTrack c;

    public m9v(jc50 jc50Var, Cache cache, MusicTrack musicTrack) {
        this.a = jc50Var;
        this.b = cache;
        this.c = musicTrack;
    }

    @Override // xsna.p9v
    public final c.a<o9v> a() {
        return new tb50(this.a, this.c, this.b, new HlsPlaylistParser());
    }

    @Override // xsna.p9v
    public final c.a b(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.b bVar) {
        return new tb50(this.a, this.c, this.b, new HlsPlaylistParser(cVar, bVar));
    }
}
