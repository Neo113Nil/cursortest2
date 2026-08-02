package defpackage;

import java.util.Vector;

/* loaded from: classes4.dex */
public final class ms61 implements Comparable {
    public Vector a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ms61 ms61Var = (ms61) obj;
        ms61Var.getClass();
        Vector vector = this.a;
        int size = vector.size();
        Vector vector2 = ms61Var.a;
        int size2 = vector2.size();
        int i = size <= size2 ? size : size2;
        for (int i2 = 0; i2 < i; i2++) {
            Comparable comparable = (Comparable) vector.get(i2);
            Comparable comparable2 = (Comparable) vector2.get(i2);
            if (comparable == null) {
                return Integer.MIN_VALUE;
            }
            if (comparable2 == null) {
                return Integer.MAX_VALUE;
            }
            try {
                int compareTo = comparable.compareTo(comparable2);
                if (compareTo != 0) {
                    return compareTo;
                }
            } catch (ClassCastException unused) {
                String valueOf = String.valueOf(comparable);
                String valueOf2 = String.valueOf(comparable2);
                System.out.getClass();
                return valueOf.compareTo(valueOf2);
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        Vector vector = this.a;
        if (obj == null || !(obj instanceof ms61)) {
            return false;
        }
        Vector vector2 = ((ms61) obj).a;
        int size = vector.size();
        if (size != vector2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            Comparable comparable = (Comparable) vector.get(i);
            Comparable comparable2 = (Comparable) vector2.get(i);
            if (comparable == null && comparable2 == null) {
                return true;
            }
            if (comparable == null && comparable2 != null) {
                return false;
            }
            if (comparable != null && comparable2 == null) {
                return false;
            }
            boolean equals = comparable.equals(comparable2);
            if (!equals) {
                return equals;
            }
        }
        return true;
    }
}
