package xsna;

import java.util.concurrent.atomic.AtomicLong;
import xsna.gi;
import xsna.npm0;

/* compiled from: WeakConcurrentMap.java */
/* loaded from: classes8.dex */
public class ldx0<K, V> extends gi<K, V, b<K>> {

    /* compiled from: WeakConcurrentMap.java */
    public class a extends ThreadLocal<b<?>> {
        @Override // java.lang.ThreadLocal
        public final b<?> initialValue() {
            return new b<>();
        }
    }

    /* compiled from: WeakConcurrentMap.java */
    public static final class b<K> {
        public npm0.c a;
        public int b;

        public final boolean equals(Object obj) {
            return obj instanceof b ? ((b) obj).a == this.a : ((gi.c) obj).get() == this.a;
        }

        public final int hashCode() {
            return this.b;
        }
    }

    static {
        new a();
        new AtomicLong();
    }
}
