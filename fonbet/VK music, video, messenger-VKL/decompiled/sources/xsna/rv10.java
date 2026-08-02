package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;

/* compiled from: MediaResult.kt */
/* loaded from: classes3.dex */
public final class rv10 {
    public final List<MediaStoreEntry> a;
    public final List<MediaStoreEntry> b;

    /* JADX WARN: Multi-variable type inference failed */
    public rv10(List<? extends MediaStoreEntry> list, List<? extends MediaStoreEntry> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv10)) {
            return false;
        }
        rv10 rv10Var = (rv10) obj;
        return epx.f(this.a, rv10Var.a) && epx.f(this.b, rv10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaResult(medias=");
        sb.append(this.a);
        sb.append(", filteredMedias=");
        return ms9.a(')', sb, this.b);
    }
}
