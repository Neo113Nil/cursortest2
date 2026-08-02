package xsna;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public interface pdg0<T> {

    /* compiled from: Result.kt */
    public static final class a implements pdg0 {
        public final C3506a a;

        /* compiled from: Result.kt */
        /* renamed from: xsna.pdg0$a$a, reason: collision with other inner class name */
        public static final class C3506a {
            public final String a;
            public final Throwable b;

            public C3506a(String str, Throwable th) {
                this.a = str;
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3506a)) {
                    return false;
                }
                C3506a c3506a = (C3506a) obj;
                return epx.f(this.a, c3506a.a) && epx.f(this.b, c3506a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(reason=");
                sb.append(this.a);
                sb.append(", error=");
                return oq.c(sb, this.b, ')');
            }
        }

        public a(C3506a c3506a) {
            this.a = c3506a;
        }

        public final C3506a a() {
            return this.a;
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
            return "Failure(errorWithCause=" + this.a + ')';
        }
    }

    /* compiled from: Result.kt */
    public static final class b<T> implements pdg0<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return k73.c(new StringBuilder("Success(value="), this.a, ')');
        }
    }
}
