package xsna;

/* compiled from: FollowersListState.kt */
/* loaded from: classes15.dex */
public abstract class t3s implements km50 {

    /* compiled from: FollowersListState.kt */
    public static final class a extends t3s {
        public final g3s b;
        public final ptf0 c;
        public final qf90 d;

        public a(g3s g3sVar, ptf0 ptf0Var, qf90 qf90Var) {
            this.b = g3sVar;
            this.c = ptf0Var;
            this.d = qf90Var;
        }

        public static a a(a aVar, g3s g3sVar, ptf0 ptf0Var, qf90 qf90Var, int i) {
            if ((i & 1) != 0) {
                g3sVar = aVar.b;
            }
            if ((i & 2) != 0) {
                ptf0Var = aVar.c;
            }
            if ((i & 4) != 0) {
                qf90Var = aVar.d;
            }
            aVar.getClass();
            return new a(g3sVar, ptf0Var, qf90Var);
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

    /* compiled from: FollowersListState.kt */
    public static final class b extends t3s {
        public static final b b = new b();
    }

    /* compiled from: FollowersListState.kt */
    public static final class c extends t3s {
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

    /* compiled from: FollowersListState.kt */
    public static final class d extends t3s {
        public static final d b = new d();
    }
}
