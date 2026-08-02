package xsna;

import xsna.sht0;

/* compiled from: SourceGetterForPosition.kt */
/* loaded from: classes17.dex */
public interface px8<T extends sht0> {

    /* compiled from: SourceGetterForPosition.kt */
    public static final class a implements px8 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -632292828;
        }

        public final String toString() {
            return "NoSource";
        }
    }

    /* compiled from: SourceGetterForPosition.kt */
    public static final class b implements px8 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1624895071;
        }

        public final String toString() {
            return "OutOfBound";
        }
    }

    /* compiled from: SourceGetterForPosition.kt */
    public static final class c<T extends sht0> implements px8<T> {
        public final T a;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Source(videoSource=" + this.a + ')';
        }
    }
}
