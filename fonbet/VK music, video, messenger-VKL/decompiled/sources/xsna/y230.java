package xsna;

import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes12.dex */
public final class y230<A, B> {
    public final x230 a = new x230(500);

    /* compiled from: ModelCache.java */
    public static final class a<A> {
        public static final ArrayDeque b;
        public A a;

        static {
            char[] cArr = s2r0.a;
            b = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = b;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.a = obj;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
