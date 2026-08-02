package xsna;

import com.vk.dto.common.Source;

/* compiled from: MessageHistoryLoaderImpl.kt */
/* loaded from: classes13.dex */
public final class jpz {
    public final gj30 a;
    public final Source b;

    public jpz(gj30 gj30Var, Source source) {
        this.a = gj30Var;
        this.b = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpz)) {
            return false;
        }
        jpz jpzVar = (jpz) obj;
        return epx.f(this.a, jpzVar.a) && this.b == jpzVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadHistoryResult(historyChunk=" + this.a + ", source=" + this.b + ')';
    }
}
