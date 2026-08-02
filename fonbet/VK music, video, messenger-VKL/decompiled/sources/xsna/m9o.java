package xsna;

import com.vk.dto.common.VideoFile;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoDownloadButton.kt */
/* loaded from: classes16.dex */
public final class m9o {
    public final String a;
    public final DownloadInfo b;
    public final VideoFile c;

    public m9o() {
        this(null, null, null);
    }

    public static m9o a(m9o m9oVar, String str, DownloadInfo downloadInfo, VideoFile videoFile, int i) {
        if ((i & 1) != 0) {
            str = m9oVar.a;
        }
        if ((i & 2) != 0) {
            downloadInfo = m9oVar.b;
        }
        if ((i & 4) != 0) {
            videoFile = m9oVar.c;
        }
        m9oVar.getClass();
        return new m9o(str, downloadInfo, videoFile);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9o)) {
            return false;
        }
        m9o m9oVar = (m9o) obj;
        return epx.f(this.a, m9oVar.a) && epx.f(this.b, m9oVar.b) && epx.f(this.c, m9oVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DownloadInfo downloadInfo = this.b;
        int hashCode2 = (hashCode + (downloadInfo == null ? 0 : downloadInfo.hashCode())) * 31;
        VideoFile videoFile = this.c;
        return hashCode2 + (videoFile != null ? videoFile.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadProgress(downloadUniqueKey=");
        sb.append(this.a);
        sb.append(", downloadInfo=");
        sb.append(this.b);
        sb.append(", videoFile=");
        return lq.a(sb, this.c, ')');
    }

    public m9o(String str, DownloadInfo downloadInfo, VideoFile videoFile) {
        this.a = str;
        this.b = downloadInfo;
        this.c = videoFile;
    }
}
