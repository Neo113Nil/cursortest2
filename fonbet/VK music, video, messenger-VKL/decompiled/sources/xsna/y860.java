package xsna;

import java.util.ArrayList;

/* compiled from: NewSuggestsResponse.kt */
/* loaded from: classes5.dex */
public final class y860 {
    public final boolean a;
    public final ArrayList b;

    public y860(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y860)) {
            return false;
        }
        y860 y860Var = (y860) obj;
        return this.a == y860Var.a && this.b.equals(y860Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewSuggestsResponse(hasNext=");
        sb.append(this.a);
        sb.append(", list=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
