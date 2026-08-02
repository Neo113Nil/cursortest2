package xsna;

import java.util.List;

/* compiled from: AboutVideoCounterVkUiDelegate.kt */
/* loaded from: classes2.dex */
public final class vxj {
    public final List<axj> a;

    public vxj(List<axj> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxj) && epx.f(this.a, ((vxj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CounterState(counters="), this.a);
    }
}
