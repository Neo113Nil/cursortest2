package xsna;

/* compiled from: BirthdaysListState.kt */
/* loaded from: classes15.dex */
public interface db7 extends km50 {

    /* compiled from: BirthdaysListState.kt */
    public static final class a implements db7 {
        public final la7 b;
        public final ntf0 c;
        public final of90 d;

        public a(la7 la7Var, ntf0 ntf0Var, of90 of90Var) {
            this.b = la7Var;
            this.c = ntf0Var;
            this.d = of90Var;
        }

        public static a a(a aVar, la7 la7Var, ntf0 ntf0Var, of90 of90Var, int i) {
            if ((i & 1) != 0) {
                la7Var = aVar.b;
            }
            if ((i & 2) != 0) {
                ntf0Var = aVar.c;
            }
            if ((i & 4) != 0) {
                of90Var = aVar.d;
            }
            aVar.getClass();
            return new a(la7Var, ntf0Var, of90Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Content(content=" + this.b + ", reloadState=" + this.c + ", pagingState=" + this.d + ')';
        }
    }

    /* compiled from: BirthdaysListState.kt */
    public static final class b implements db7 {
        public static final b b = new b();
    }

    /* compiled from: BirthdaysListState.kt */
    public static final class c implements db7 {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: BirthdaysListState.kt */
    public static final class d implements db7 {
        public static final d b = new d();
    }
}
