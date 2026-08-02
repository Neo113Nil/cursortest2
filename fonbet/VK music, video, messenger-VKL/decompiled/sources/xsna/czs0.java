package xsna;

import com.vk.dto.common.VideoFileOld;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoOfflineItem.kt */
/* loaded from: classes2.dex */
public final class czs0 {
    public final VideoFileOld a;
    public final DownloadInfo b;

    public czs0(VideoFileOld videoFileOld, DownloadInfo downloadInfo) {
        this.a = videoFileOld;
        this.b = downloadInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czs0)) {
            return false;
        }
        czs0 czs0Var = (czs0) obj;
        return this.a.equals(czs0Var.a) && epx.f(this.b, czs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoOfflineItem(videoFile=" + this.a + ", info=" + this.b + ')';
    }
}
