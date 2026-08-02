package xsna;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.upstream.c;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackHlsParser.kt */
/* loaded from: classes3.dex */
public final class tb50 implements c.a<o9v> {
    public final jc50 a;
    public final MusicTrack b;
    public final Cache c;
    public final c.a<o9v> d;

    public tb50(jc50 jc50Var, MusicTrack musicTrack, Cache cache, c.a<o9v> aVar) {
        this.a = jc50Var;
        this.b = musicTrack;
        this.c = cache;
        this.d = aVar;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    public final Object a(Uri uri, bvk bvkVar) {
        String a;
        MusicTrack musicTrack = this.b;
        String concat = musicTrack.Fb().concat("/music_manifest.m3u8");
        o9v o9vVar = (o9v) this.d.a(uri, bvkVar);
        if (epx.f(this.c.getContentMetadata(concat), adl.c) || (a = this.a.a(musicTrack)) == null || epx.f(o9vVar.a, a)) {
            return o9vVar;
        }
        String str = a.toString();
        if (o9vVar instanceof androidx.media3.exoplayer.hls.playlist.b) {
            androidx.media3.exoplayer.hls.playlist.b bVar = (androidx.media3.exoplayer.hls.playlist.b) o9vVar;
            return new androidx.media3.exoplayer.hls.playlist.b(bVar.d, str, o9vVar.b, bVar.e, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, bVar.m, bVar.n, o9vVar.c, bVar.o, bVar.p, bVar.q, bVar.r, bVar.s, bVar.v, bVar.t, bVar.w);
        }
        if (o9vVar instanceof androidx.media3.exoplayer.hls.playlist.c) {
            androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) o9vVar;
            return new androidx.media3.exoplayer.hls.playlist.c(str, o9vVar.b, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, o9vVar.c, cVar.l, cVar.m);
        }
        throw new IllegalStateException("Unimplemented playlist type " + o9vVar + '!');
    }
}
