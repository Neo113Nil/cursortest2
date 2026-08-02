package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;

/* compiled from: VideoBackgroundPlaybackInfo.kt */
/* loaded from: classes3.dex */
public final class u4s0 {
    public final VideoFile a;
    public final w4t0 b;
    public final VideoApplyNewVideoSourceType c;

    public u4s0(VideoFile videoFile, w4t0 w4t0Var, VideoApplyNewVideoSourceType videoApplyNewVideoSourceType) {
        this.a = videoFile;
        this.b = w4t0Var;
        this.c = videoApplyNewVideoSourceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4s0)) {
            return false;
        }
        u4s0 u4s0Var = (u4s0) obj;
        return epx.f(this.a, u4s0Var.a) && epx.f(this.b, u4s0Var.b) && this.c == u4s0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w4t0 w4t0Var = this.b;
        int hashCode2 = (hashCode + (w4t0Var == null ? 0 : w4t0Var.hashCode())) * 31;
        VideoApplyNewVideoSourceType videoApplyNewVideoSourceType = this.c;
        return hashCode2 + (videoApplyNewVideoSourceType != null ? videoApplyNewVideoSourceType.hashCode() : 0);
    }

    public final String toString() {
        return "VideoBackgroundPlaybackInfo(video=" + this.a + ", playlist=" + this.b + ", sourceType=" + this.c + ')';
    }
}
