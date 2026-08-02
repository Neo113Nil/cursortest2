package xsna;

import java.util.ArrayList;

/* compiled from: MenuV3Data.kt */
/* loaded from: classes6.dex */
public final class o820 {
    public final ArrayList a;

    public o820(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o820) && this.a.equals(((o820) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("MenuV3Data(items="), this.a);
    }
}
