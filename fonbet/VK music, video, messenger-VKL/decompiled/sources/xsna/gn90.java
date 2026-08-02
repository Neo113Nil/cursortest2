package xsna;

/* compiled from: PastAsrListState.kt */
/* loaded from: classes7.dex */
public abstract class gn90 implements km50 {

    /* compiled from: PastAsrListState.kt */
    public static final class a extends gn90 {
        public final zm90 b;
        public final a990<Integer> c;

        public a(zm90 zm90Var, a990<Integer> a990Var) {
            this.b = zm90Var;
            this.c = a990Var;
        }

        public static a a(a aVar, zm90 zm90Var, a990 a990Var, int i) {
            if ((i & 1) != 0) {
                zm90Var = aVar.b;
            }
            if ((i & 2) != 0) {
                a990Var = aVar.c;
            }
            aVar.getClass();
            return new a(zm90Var, a990Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.a.hashCode() * 31);
        }

        public final String toString() {
            return "Content(pastAsrList=" + this.b + ", page=" + this.c + ')';
        }
    }

    /* compiled from: PastAsrListState.kt */
    public static final class b extends gn90 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: PastAsrListState.kt */
    public static final class c extends gn90 {
        public static final c b = new c();
    }

    /* compiled from: PastAsrListState.kt */
    public static final class d extends gn90 {
        public static final d b = new d();
    }
}
