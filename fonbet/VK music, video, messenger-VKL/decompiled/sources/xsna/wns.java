package xsna;

/* compiled from: FriendsCleanupState.kt */
/* loaded from: classes15.dex */
public interface wns extends km50 {

    /* compiled from: FriendsCleanupState.kt */
    public static final class a implements wns {
        public final rms b;
        public final otf0 c;
        public final pf90 d;

        public a(rms rmsVar, otf0 otf0Var, pf90 pf90Var) {
            this.b = rmsVar;
            this.c = otf0Var;
            this.d = pf90Var;
        }

        public static a a(a aVar, rms rmsVar, otf0 otf0Var, pf90 pf90Var, int i) {
            if ((i & 1) != 0) {
                rmsVar = aVar.b;
            }
            if ((i & 2) != 0) {
                otf0Var = aVar.c;
            }
            if ((i & 4) != 0) {
                pf90Var = aVar.d;
            }
            aVar.getClass();
            return new a(rmsVar, otf0Var, pf90Var);
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

    /* compiled from: FriendsCleanupState.kt */
    public static final class b implements wns {
        public static final b b = new b();
    }

    /* compiled from: FriendsCleanupState.kt */
    public static final class c implements wns {
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

    /* compiled from: FriendsCleanupState.kt */
    public static final class d implements wns {
        public static final d b = new d();
    }
}
