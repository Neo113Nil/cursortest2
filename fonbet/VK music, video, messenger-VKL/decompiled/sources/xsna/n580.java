package xsna;

import java.util.ArrayList;

/* compiled from: DialogsListLoaderUpdate.kt */
/* loaded from: classes18.dex */
public final class n580 implements zsm {
    public final ArrayList a;

    public n580(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n580) && this.a.equals(((n580) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("OnDialogsRemoved(ids="), this.a);
    }
}
