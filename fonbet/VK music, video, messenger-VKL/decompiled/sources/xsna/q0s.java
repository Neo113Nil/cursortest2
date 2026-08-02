package xsna;

import java.util.ArrayList;

/* compiled from: FoldersCountersLpEvent.kt */
/* loaded from: classes2.dex */
public final class q0s implements e900 {
    public final ArrayList a;

    public q0s(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0s) && this.a.equals(((q0s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("FoldersCountersLpEvent(counters="), this.a);
    }
}
