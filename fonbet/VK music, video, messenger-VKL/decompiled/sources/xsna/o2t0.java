package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoPickerItemWrapper.kt */
/* loaded from: classes5.dex */
public final class o2t0 {
    public final VideoFile a;

    public o2t0(VideoFile videoFile) {
        this.a = videoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2t0) && epx.f(this.a, ((o2t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lq.a(new StringBuilder("VideoPickerItemWrapper(videoFile="), this.a, ')');
    }
}
