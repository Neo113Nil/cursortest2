package xsna;

import java.util.List;

/* compiled from: ChatHeaderInfoMenuState.kt */
/* loaded from: classes16.dex */
public final class lrb {
    public final List<srb> a;

    public lrb(List<srb> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrb) && epx.f(this.a, ((lrb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ChatHeaderInfoMenuState(items="), this.a);
    }
}
