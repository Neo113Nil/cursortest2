package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TogglesDiff.kt */
/* loaded from: classes6.dex */
public final class n1p0 {
    public final ArrayList a;

    public n1p0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List<String> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1p0) && this.a.equals(((n1p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("TogglesDiff(updatedToggles="), this.a);
    }
}
