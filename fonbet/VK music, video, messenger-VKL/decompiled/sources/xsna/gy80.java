package xsna;

import java.util.ArrayList;

/* compiled from: OrdersResponse.kt */
/* loaded from: classes18.dex */
public final class gy80 {
    public final int a;
    public final ArrayList b;

    public gy80(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy80)) {
            return false;
        }
        gy80 gy80Var = (gy80) obj;
        return this.a == gy80Var.a && this.b.equals(gy80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersResponse(count=");
        sb.append(this.a);
        sb.append(", orders=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
