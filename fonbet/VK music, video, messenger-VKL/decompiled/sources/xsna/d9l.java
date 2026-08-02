package xsna;

import java.util.ArrayList;

/* compiled from: DeduplicationResult.kt */
/* loaded from: classes17.dex */
public final class d9l<Item> {
    public final ArrayList a;
    public final ArrayList b;

    public d9l(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9l)) {
            return false;
        }
        d9l d9lVar = (d9l) obj;
        return this.a.equals(d9lVar.a) && this.b.equals(d9lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeduplicationResult(itemsDeduplicated=");
        sb.append(this.a);
        sb.append(", itemsDuplicates=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
