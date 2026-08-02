package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;

/* compiled from: VideoApplyNewVideoInfo.kt */
/* loaded from: classes3.dex */
public final class a2s0 {
    public final VideoFile a;
    public final VideoApplyNewVideoSourceType b;

    public a2s0(VideoFile videoFile, VideoApplyNewVideoSourceType videoApplyNewVideoSourceType) {
        this.a = videoFile;
        this.b = videoApplyNewVideoSourceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2s0)) {
            return false;
        }
        a2s0 a2s0Var = (a2s0) obj;
        return epx.f(this.a, a2s0Var.a) && this.b == a2s0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoApplyNewVideoInfo(videoFile=" + this.a + ", sourceType=" + this.b + ')';
    }
}
