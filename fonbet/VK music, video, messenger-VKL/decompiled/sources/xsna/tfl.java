package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.upstream.c;

/* compiled from: DefaultHlsPlaylistParserFactory.java */
/* loaded from: classes12.dex */
public final class tfl implements p9v {
    @Override // xsna.p9v
    public final c.a<o9v> a() {
        return new HlsPlaylistParser();
    }

    @Override // xsna.p9v
    public final c.a<o9v> b(androidx.media3.exoplayer.hls.playlist.c cVar, @Nullable androidx.media3.exoplayer.hls.playlist.b bVar) {
        return new HlsPlaylistParser(cVar, bVar);
    }
}
