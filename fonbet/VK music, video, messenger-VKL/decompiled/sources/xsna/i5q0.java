package xsna;

import java.util.ArrayList;

/* compiled from: UnreadReactionsLpEvent.kt */
/* loaded from: classes2.dex */
public final class i5q0 implements e900 {
    public final long a;
    public final ArrayList b;

    public i5q0(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5q0)) {
            return false;
        }
        i5q0 i5q0Var = (i5q0) obj;
        return this.a == i5q0Var.a && this.b.equals(i5q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnreadReactionsLpEvent(dialogId=");
        sb.append(this.a);
        sb.append(", cmIds=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
