package xsna;

import java.util.ArrayList;

/* compiled from: ImItemListViewState.kt */
/* loaded from: classes2.dex */
public final class q7w implements lm50 {
    public final ArrayList b;

    public q7w(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7w) && this.b.equals(((q7w) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ImItemListViewState(items="), this.b);
    }
}
