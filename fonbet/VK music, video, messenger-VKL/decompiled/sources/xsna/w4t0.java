package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import java.util.List;

/* compiled from: VideoPlaylistInfo.kt */
/* loaded from: classes3.dex */
public final class w4t0 {
    public final int a;
    public final long b;
    public final List<VideoSeason> c;
    public final VideoRelatedVideosLoopMode d;
    public final VideoRelatedVideosOrder e;
    public final VideoFile f;
    public final VideoFile g;

    public w4t0(int i, long j, List<VideoSeason> list, VideoRelatedVideosLoopMode videoRelatedVideosLoopMode, VideoRelatedVideosOrder videoRelatedVideosOrder, VideoFile videoFile, VideoFile videoFile2) {
        this.a = i;
        this.b = j;
        this.c = list;
        this.d = videoRelatedVideosLoopMode;
        this.e = videoRelatedVideosOrder;
        this.f = videoFile;
        this.g = videoFile2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4t0)) {
            return false;
        }
        w4t0 w4t0Var = (w4t0) obj;
        return this.a == w4t0Var.a && this.b == w4t0Var.b && epx.f(this.c, w4t0Var.c) && this.d == w4t0Var.d && epx.f(this.e, w4t0Var.e) && epx.f(this.f, w4t0Var.f) && epx.f(this.g, w4t0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + fw3.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        VideoFile videoFile = this.f;
        int hashCode2 = (hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31;
        VideoFile videoFile2 = this.g;
        return hashCode2 + (videoFile2 != null ? videoFile2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlaylistInfo(playlistId=");
        sb.append(this.a);
        sb.append(", playlistOwnerId=");
        sb.append(this.b);
        sb.append(", seasons=");
        sb.append(this.c);
        sb.append(", loopMode=");
        sb.append(this.d);
        sb.append(", order=");
        sb.append(this.e);
        sb.append(", orderedFirstVideo=");
        sb.append(this.f);
        sb.append(", orderedLastVideo=");
        return lq.a(sb, this.g, ')');
    }
}
