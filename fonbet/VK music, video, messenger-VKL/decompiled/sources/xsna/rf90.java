package xsna;

/* compiled from: FriendsAndFollowersTabState.kt */
/* loaded from: classes15.dex */
public abstract class rf90 {

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class a extends rf90 {
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

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class b extends rf90 {
        public static final b a = new b();
    }

    /* compiled from: FriendsAndFollowersTabState.kt */
    public static final class c extends rf90 {
        public static final c a = new c();
    }
}
