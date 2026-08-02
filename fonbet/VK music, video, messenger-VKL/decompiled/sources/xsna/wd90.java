package xsna;

/* compiled from: PaginationDotsMode.kt */
/* loaded from: classes17.dex */
public interface wd90 {

    /* compiled from: PaginationDotsMode.kt */
    public static final class a implements wd90 {
        public static final a a = new a();
    }

    /* compiled from: PaginationDotsMode.kt */
    public static final class b implements wd90 {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("Progress(progress="));
        }
    }
}
