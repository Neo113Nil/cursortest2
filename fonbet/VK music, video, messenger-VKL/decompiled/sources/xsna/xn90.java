package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: PastBroadcastsContent.kt */
/* loaded from: classes7.dex */
public final class xn90 {
    public final List<VideoFile> a;

    /* JADX WARN: Multi-variable type inference failed */
    public xn90(List<? extends VideoFile> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn90) && epx.f(this.a, ((xn90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PastBroadcastsContent(videos="), this.a);
    }
}
