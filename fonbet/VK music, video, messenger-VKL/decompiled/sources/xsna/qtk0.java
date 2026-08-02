package xsna;

/* compiled from: StateData.kt */
/* loaded from: classes6.dex */
public interface qtk0<T> {

    /* compiled from: StateData.kt */
    public static final class a<T> implements qtk0<T> {
        public final T a;

        public a(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("Loaded(body="), this.a, ')');
        }
    }

    /* compiled from: StateData.kt */
    public static final class b<T> implements qtk0<T> {
    }
}
