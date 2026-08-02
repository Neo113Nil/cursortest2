package xsna;

import java.util.ArrayList;

/* compiled from: FoldersReorderLpEvent.kt */
/* loaded from: classes2.dex */
public final class z1s implements e900 {
    public final ArrayList a;

    public z1s(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1s) && this.a.equals(((z1s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("FoldersReorderLpEvent(order="), this.a);
    }
}
