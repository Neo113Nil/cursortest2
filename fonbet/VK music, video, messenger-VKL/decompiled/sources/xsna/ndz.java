package xsna;

import java.util.ArrayList;

/* compiled from: AnnotatedUrlCreator.kt */
/* loaded from: classes5.dex */
public final class ndz {
    public final ArrayList a;

    public ndz(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndz) && this.a.equals(((ndz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("LinkedText(entities="), this.a);
    }
}
