package xsna;

import android.content.Context;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPlayerDependenciesProvider.kt */
/* loaded from: classes7.dex */
public interface aw40 {
    com.vk.music.offline.api.domain.download.b I();

    androidx.media3.datasource.d a(MusicTrack musicTrack);

    p9v b(MusicTrack musicTrack);

    HlsPlaylistTracker.a c(MusicTrack musicTrack);

    void d(MusicTrack musicTrack, oya0 oya0Var);

    npl e(Context context);

    ts4 f();

    com.vk.music.audioeffect.a f0();

    boolean g();
}
