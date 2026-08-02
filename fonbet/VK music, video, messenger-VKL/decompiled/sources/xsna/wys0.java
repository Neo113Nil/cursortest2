package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.api.ExtendedDownloadState;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoOfflineExtendedItem.kt */
/* loaded from: classes2.dex */
public final class wys0 {
    public final VideoFileOld a;
    public final DownloadInfo b;
    public final ExtendedDownloadState c;

    public wys0(VideoFileOld videoFileOld, DownloadInfo downloadInfo, ExtendedDownloadState extendedDownloadState) {
        this.a = videoFileOld;
        this.b = downloadInfo;
        this.c = extendedDownloadState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wys0)) {
            return false;
        }
        wys0 wys0Var = (wys0) obj;
        return this.a.equals(wys0Var.a) && epx.f(this.b, wys0Var.b) && this.c == wys0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoOfflineExtendedItem(videoFile=" + this.a + ", info=" + this.b + ", extendedDownloadState=" + this.c + ')';
    }
}
