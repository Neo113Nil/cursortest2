package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicOfflineExt.kt */
/* loaded from: classes3.dex */
public final class kq40 {
    public static final MusicTrack a(MusicTrack musicTrack) {
        return MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.NotLoaded.b, false, false, null, null, null, -1, 1048571);
    }

    public static final MusicTrack b(MusicTrack musicTrack) {
        return MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, DownloadingState.PendingDownload.b, false, false, null, null, null, -1, 1048571);
    }
}
