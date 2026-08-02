package xsna;

/* compiled from: CacheResult.kt */
/* loaded from: classes6.dex */
public interface ox8<T> {

    /* compiled from: CacheResult.kt */
    public static final class a implements ox8 {
        public final ow8 a;
        public final Throwable b;

        public a(ow8 ow8Var, Throwable th) {
            this.a = ow8Var;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(error=");
            sb.append(this.a);
            sb.append(", cause=");
            return oq.c(sb, this.b, ')');
        }
    }

    /* compiled from: CacheResult.kt */
    public static final class b<T> implements ox8<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("Hit(value="), this.a, ')');
        }
    }

    /* compiled from: CacheResult.kt */
    public static final class c implements ox8 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 295676431;
        }

        public final String toString() {
            return "Miss";
        }
    }
}
