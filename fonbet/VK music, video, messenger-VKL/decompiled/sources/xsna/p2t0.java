package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoPickerItemWrapper.kt */
/* loaded from: classes4.dex */
public final class p2t0 {
    public final VideoFile a;

    public p2t0(VideoFile videoFile) {
        this.a = videoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2t0) && epx.f(this.a, ((p2t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lq.a(new StringBuilder("VideoPickerItemWrapper(videoFile="), this.a, ')');
    }
}
