package xsna;

/* compiled from: OptionalEntityState.kt */
/* loaded from: classes7.dex */
public abstract class nt80<T> {

    /* compiled from: OptionalEntityState.kt */
    public static final class a extends nt80 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: OptionalEntityState.kt */
    public static final class b extends nt80 {
        public static final b a = new b();
    }

    /* compiled from: OptionalEntityState.kt */
    public static final class c<T> extends nt80<T> {
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
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("Info(value="), this.a, ')');
        }
    }

    /* compiled from: OptionalEntityState.kt */
    public static final class d extends nt80 {
        public static final d a = new d();
    }

    public final T a() {
        c cVar = this instanceof c ? (c) this : null;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }
}
