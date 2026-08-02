package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.List;

/* compiled from: ClipFeedInitialData.kt */
/* loaded from: classes17.dex */
public final class kwc {
    public final List<SdkVideoFile> a;
    public final PaginationKey b;
    public final int c;

    public kwc(List list, PaginationKey paginationKey, int i) {
        this.a = list;
        this.b = paginationKey;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwc)) {
            return false;
        }
        kwc kwcVar = (kwc) obj;
        return epx.f(this.a, kwcVar.a) && epx.f(this.b, kwcVar.b) && this.c == kwcVar.c;
    }

    public final int hashCode() {
        return shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipFeedInitialData(videos=");
        sb.append(this.a);
        sb.append(", paginationKey=");
        sb.append(this.b);
        sb.append(", fromPosition=");
        return h5s.c(this.c, ", cacheInfo=null)", sb);
    }
}
