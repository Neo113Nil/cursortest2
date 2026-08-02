package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsPlaylistsInteractor.kt */
/* loaded from: classes16.dex */
public interface due {
    void a(ClipsPlaylist clipsPlaylist, VideoFile videoFile);

    void b(ClipsPlaylist clipsPlaylist, VideoFile videoFile);

    io.reactivex.rxjava3.core.x c(int i, UserId userId);

    io.reactivex.rxjava3.core.x d(int i, UserId userId, boolean z);

    int e(UserId userId);

    io.reactivex.rxjava3.core.x<ClipsPlaylist> f(ClipsPlaylist clipsPlaylist, List<? extends VideoFile> list);

    io.reactivex.rxjava3.core.x<ClipsPlaylist> g(ClipsPlaylist clipsPlaylist, List<? extends VideoFile> list);
}
