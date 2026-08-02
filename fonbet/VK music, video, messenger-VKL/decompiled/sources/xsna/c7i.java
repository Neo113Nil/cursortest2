package xsna;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
/* loaded from: classes13.dex */
public abstract class c7i {
    public static final a a = new a();
    public static final b b = new b(-1);
    public static final b c = new b(1);

    /* compiled from: ComparisonChain.java */
    public class a extends c7i {
        public static c7i g(int i) {
            return i < 0 ? c7i.b : i > 0 ? c7i.c : c7i.a;
        }

        @Override // xsna.c7i
        public final c7i a(int i, int i2) {
            return g(Integer.compare(i, i2));
        }

        @Override // xsna.c7i
        public final c7i b(long j, long j2) {
            return g(Long.compare(j, j2));
        }

        @Override // xsna.c7i
        public final <T> c7i c(T t, T t2, Comparator<T> comparator) {
            return g(comparator.compare(t, t2));
        }

        @Override // xsna.c7i
        public final c7i d(boolean z, boolean z2) {
            return g(Boolean.compare(z, z2));
        }

        @Override // xsna.c7i
        public final c7i e(boolean z, boolean z2) {
            return g(Boolean.compare(z2, z));
        }

        @Override // xsna.c7i
        public final int f() {
            return 0;
        }
    }

    public abstract c7i a(int i, int i2);

    public abstract c7i b(long j, long j2);

    public abstract <T> c7i c(T t, T t2, Comparator<T> comparator);

    public abstract c7i d(boolean z, boolean z2);

    public abstract c7i e(boolean z, boolean z2);

    public abstract int f();

    /* compiled from: ComparisonChain.java */
    public static final class b extends c7i {
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // xsna.c7i
        public final int f() {
            return this.d;
        }

        @Override // xsna.c7i
        public final c7i a(int i, int i2) {
            return this;
        }

        @Override // xsna.c7i
        public final c7i b(long j, long j2) {
            return this;
        }

        @Override // xsna.c7i
        public final c7i d(boolean z, boolean z2) {
            return this;
        }

        @Override // xsna.c7i
        public final c7i e(boolean z, boolean z2) {
            return this;
        }

        @Override // xsna.c7i
        public final <T> c7i c(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}
