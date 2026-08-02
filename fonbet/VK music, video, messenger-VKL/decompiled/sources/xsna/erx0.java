package xsna;

import java.util.List;

/* compiled from: WindowLayoutInfo.kt */
/* loaded from: classes12.dex */
public final class erx0 {
    public final List<pen> a;

    /* JADX WARN: Multi-variable type inference failed */
    public erx0(List<? extends pen> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !erx0.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(this.a, ((erx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j5g.g0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, 56);
    }
}
