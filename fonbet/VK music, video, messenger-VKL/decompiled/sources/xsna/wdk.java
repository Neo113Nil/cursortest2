package xsna;

import java.io.File;

/* compiled from: CronetCache.kt */
/* loaded from: classes.dex */
public abstract class wdk {

    /* compiled from: CronetCache.kt */
    public static final class a extends wdk {
        public final File a;
        public final long b = 10485760;

        public a(File file) {
            this.a = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Disk(path=" + this.a + ", size=" + this.b + ")";
        }
    }

    /* compiled from: CronetCache.kt */
    public static final class b extends wdk {
        public static final b a = new b();
    }

    /* compiled from: CronetCache.kt */
    /* loaded from: classes2.dex */
    public static final class c extends wdk {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        public final String toString() {
            return "InMemory(size=0)";
        }
    }
}
