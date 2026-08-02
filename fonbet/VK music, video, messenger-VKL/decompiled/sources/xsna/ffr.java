package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.upstream.c;
import java.util.List;

/* compiled from: FilteringHlsPlaylistParserFactory.java */
/* loaded from: classes12.dex */
public final class ffr implements p9v {
    public final p9v a;
    public final List<StreamKey> b;

    public ffr(p9v p9vVar, List<StreamKey> list) {
        this.a = p9vVar;
        this.b = list;
    }

    @Override // xsna.p9v
    public final c.a<o9v> a() {
        return new gfr(this.a.a(), this.b);
    }

    @Override // xsna.p9v
    public final c.a<o9v> b(androidx.media3.exoplayer.hls.playlist.c cVar, @Nullable androidx.media3.exoplayer.hls.playlist.b bVar) {
        return new gfr(this.a.b(cVar, bVar), this.b);
    }
}
