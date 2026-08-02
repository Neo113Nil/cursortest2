package xsna;

import java.util.ArrayList;

/* compiled from: DeleteResult.kt */
/* loaded from: classes6.dex */
public final class evl {
    public final ArrayList a;
    public final ArrayList b;

    public evl(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evl)) {
            return false;
        }
        evl evlVar = (evl) obj;
        return this.a.equals(evlVar.a) && this.b.equals(evlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteResult(deleted=");
        sb.append(this.a);
        sb.append(", notFound=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
