package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: VideoMusicMixDo.kt */
/* loaded from: classes6.dex */
public final class mxs0 {
    public final List<VideoFile> a;

    /* JADX WARN: Multi-variable type inference failed */
    public mxs0(List<? extends VideoFile> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxs0) && epx.f(this.a, ((mxs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoMusicMixDo(videos="), this.a);
    }
}
