package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class k430 {
    public static final ArrayDeque b = new ArrayDeque(0);
    public Object a;

    public static k430 a(Object obj) {
        k430 k430Var;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            k430Var = (k430) arrayDeque.poll();
        }
        if (k430Var == null) {
            k430Var = new k430();
        }
        k430Var.a = obj;
        return k430Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k430) && this.a.equals(((k430) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
