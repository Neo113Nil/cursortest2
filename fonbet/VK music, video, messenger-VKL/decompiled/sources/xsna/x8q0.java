package xsna;

import java.util.ArrayList;

/* compiled from: UpdatePastCallsListPatch.kt */
/* loaded from: classes7.dex */
public final class x8q0 implements b59 {
    public final ArrayList b;

    public x8q0(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8q0) && this.b.equals(((x8q0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("UpdatePastCallsListPatch(calls="), this.b);
    }
}
