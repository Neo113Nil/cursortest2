package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;

/* compiled from: VideoDownloadParams.kt */
/* loaded from: classes2.dex */
public final class ths0 {
    public final VideoFile a;
    public final VideoScreenMode b;
    public final boolean c;

    public ths0(VideoFile videoFile, VideoScreenMode videoScreenMode, boolean z) {
        this.a = videoFile;
        this.b = videoScreenMode;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    public final VideoScreenMode b() {
        return this.b;
    }

    public final VideoFile c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ths0)) {
            return false;
        }
        ths0 ths0Var = (ths0) obj;
        return epx.f(this.a, ths0Var.a) && this.b == ths0Var.b && this.c == ths0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        VideoScreenMode videoScreenMode = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (videoScreenMode == null ? 0 : videoScreenMode.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDownloadParams(video=");
        sb.append(this.a);
        sb.append(", screenMode=");
        sb.append(this.b);
        sb.append(", autostart=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
