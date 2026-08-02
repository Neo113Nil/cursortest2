package xsna;

/* compiled from: FriendsCleanupState.kt */
/* loaded from: classes15.dex */
public abstract class pf90 {

    /* compiled from: FriendsCleanupState.kt */
    public static final class a extends pf90 {
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
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: FriendsCleanupState.kt */
    public static final class b extends pf90 {
        public static final b a = new b();
    }

    /* compiled from: FriendsCleanupState.kt */
    public static final class c extends pf90 {
        public static final c a = new c();
    }
}
