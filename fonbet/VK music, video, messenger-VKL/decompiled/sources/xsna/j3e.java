package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;

/* compiled from: ClipsFavoriteFolderContentResponse.kt */
/* loaded from: classes16.dex */
public final class j3e {
    public final List<VideoFile> a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public j3e(List<? extends VideoFile> list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3e)) {
            return false;
        }
        j3e j3eVar = (j3e) obj;
        return epx.f(this.a, j3eVar.a) && epx.f(this.b, j3eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFavoriteFolderContentResponse(videoFiles=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.b, ')');
    }
}
