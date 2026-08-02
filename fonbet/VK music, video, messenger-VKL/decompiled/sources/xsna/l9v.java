package xsna;

import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.vk.dto.music.MusicTrack;

/* compiled from: HlsMusicTrackPlaylistFactory.kt */
/* loaded from: classes3.dex */
public final class l9v implements HlsPlaylistTracker.a {
    public final MusicTrack b;

    public l9v(MusicTrack musicTrack) {
        this.b = musicTrack;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.a
    public final HlsPlaylistTracker a(qfl qflVar, androidx.media3.exoplayer.upstream.b bVar, p9v p9vVar) {
        return new sfl(this.b, qflVar, bVar, p9vVar);
    }
}
