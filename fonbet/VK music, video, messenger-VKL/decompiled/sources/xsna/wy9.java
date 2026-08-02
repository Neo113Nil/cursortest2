package xsna;

import java.util.ArrayList;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class wy9 {
    public final ArrayList a;
    public final int b;

    public wy9(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy9)) {
            return false;
        }
        wy9 wy9Var = (wy9) obj;
        return this.a.equals(wy9Var.a) && this.b == wy9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartsResult(carts=");
        sb.append(this.a);
        sb.append(", ignoredCarts=");
        return vu5.b(sb, this.b, ')');
    }
}
