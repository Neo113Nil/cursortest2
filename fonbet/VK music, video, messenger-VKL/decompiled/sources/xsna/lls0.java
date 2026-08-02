package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: AuthorHeaderLiveCoverMedia.kt */
/* loaded from: classes5.dex */
public final class lls0 {
    public final VideoFile a;

    public lls0(VideoFile videoFile) {
        this.a = videoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lls0) && epx.f(this.a, ((lls0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lq.a(new StringBuilder("VideoFilePlaybackSource(file="), this.a, ')');
    }
}
