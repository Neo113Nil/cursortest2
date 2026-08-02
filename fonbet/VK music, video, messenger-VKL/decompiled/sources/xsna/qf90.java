package xsna;

/* compiled from: FollowersListState.kt */
/* loaded from: classes15.dex */
public abstract class qf90 {

    /* compiled from: FollowersListState.kt */
    public static final class a extends qf90 {
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

    /* compiled from: FollowersListState.kt */
    public static final class b extends qf90 {
        public static final b a = new b();
    }

    /* compiled from: FollowersListState.kt */
    public static final class c extends qf90 {
        public static final c a = new c();
    }
}
