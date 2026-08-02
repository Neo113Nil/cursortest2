package xsna;

import com.vk.dto.common.DownloadingState;
import kotlin.NoWhenBranchMatchedException;
import xsna.bi40;

/* compiled from: MusicDownloadState.kt */
/* loaded from: classes3.dex */
public final class di40 {
    public static final bi40 a(DownloadingState downloadingState) {
        if (downloadingState.equals(DownloadingState.Corrupted.b) || downloadingState.equals(DownloadingState.PartlyDownloaded.b) || downloadingState.equals(DownloadingState.Downloaded.b)) {
            return bi40.a.a;
        }
        if (downloadingState instanceof DownloadingState.Downloading) {
            return new bi40.b(((DownloadingState.Downloading) downloadingState).b);
        }
        if (downloadingState.equals(DownloadingState.NotLoaded.b)) {
            return bi40.c.a;
        }
        if (downloadingState.equals(DownloadingState.PendingDownload.b)) {
            return bi40.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
