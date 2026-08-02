package xsna;

import java.util.List;

/* compiled from: AttachedClipsViewState.kt */
/* loaded from: classes7.dex */
public final class b64 {
    public final List a;

    public b64(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b64) && epx.f(this.a, ((b64) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jr.a(')', new StringBuilder("AttachedClipsViewState(attachedClips="), this.a);
    }
}
