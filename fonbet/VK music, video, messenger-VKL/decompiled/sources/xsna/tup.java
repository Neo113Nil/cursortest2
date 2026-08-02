package xsna;

import java.io.Serializable;

/* compiled from: Equivalence.java */
/* loaded from: classes13.dex */
public abstract class tup<T> {

    /* compiled from: Equivalence.java */
    public static final class a extends tup<Object> implements Serializable {
        public static final a b = new a();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return b;
        }

        @Override // xsna.tup
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // xsna.tup
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    public static final class b extends tup<Object> implements Serializable {
        public static final b b = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return b;
        }

        @Override // xsna.tup
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // xsna.tup
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public abstract boolean a(T t, T t2);

    public abstract int b(T t);

    public final boolean c(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a(t, t2);
    }
}
