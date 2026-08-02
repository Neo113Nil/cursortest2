package xsna;

import androidx.media3.exoplayer.upstream.c;
import java.util.Collections;
import java.util.Set;
import one.video.exo.datasource.hls.parser.OneVideoHlsPlaylistParser;
import one.video.player.OneVideoPlayer;

/* compiled from: OneVideoHlsPlaylistParserFactory.kt */
/* loaded from: classes8.dex */
public final class gl80 implements p9v {
    public final fe60 a;
    public final OneVideoPlayer.b b;
    public final lj00 c;
    public final Set<w9v> d = Collections.singleton(new wd7());

    public gl80(fe60 fe60Var, one.video.player.i iVar, lj00 lj00Var) {
        this.a = fe60Var;
        this.b = iVar;
        this.c = lj00Var;
    }

    @Override // xsna.p9v
    public final c.a<o9v> a() {
        return new OneVideoHlsPlaylistParser(androidx.media3.exoplayer.hls.playlist.c.n, null, this.a, this.b, this.c, this.d);
    }

    @Override // xsna.p9v
    public final c.a<o9v> b(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.b bVar) {
        return new OneVideoHlsPlaylistParser(cVar, bVar, this.a, this.b, this.c, this.d);
    }
}
