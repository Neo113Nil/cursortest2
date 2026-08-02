package xsna;

/* compiled from: AddToFriendsState.kt */
/* loaded from: classes7.dex */
public abstract class go0 {

    /* compiled from: AddToFriendsState.kt */
    public static final class a extends go0 {
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

    /* compiled from: AddToFriendsState.kt */
    public static final class b extends go0 {
        public static final b a = new b();
    }

    /* compiled from: AddToFriendsState.kt */
    public static final class c extends go0 {
        public static final c a = new c();
    }

    /* compiled from: AddToFriendsState.kt */
    public static final class d extends go0 {
        public static final d a = new d();
    }
}
