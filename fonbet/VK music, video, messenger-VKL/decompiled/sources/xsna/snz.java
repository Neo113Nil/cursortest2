package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: LiveVideosData.kt */
/* loaded from: classes5.dex */
public final class snz {
    public final List<VideoFile> a;

    /* JADX WARN: Multi-variable type inference failed */
    public snz(List<? extends VideoFile> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snz) && epx.f(this.a, ((snz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("LiveVideosData(videos="), this.a);
    }

    public snz() {
        this(EmptyList.b);
    }
}
