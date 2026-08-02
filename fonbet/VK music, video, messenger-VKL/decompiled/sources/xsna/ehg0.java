package xsna;

/* compiled from: ReviewFriendsAction.kt */
/* loaded from: classes18.dex */
public abstract class ehg0 implements kj50 {

    /* compiled from: ReviewFriendsAction.kt */
    public static final class a extends ehg0 {
        public static final a b = new a();
    }

    /* compiled from: ReviewFriendsAction.kt */
    public static final class b extends ehg0 {
        public static final b b = new b();
    }

    /* compiled from: ReviewFriendsAction.kt */
    public static final class c extends ehg0 {
        public static final c b = new c();
    }

    /* compiled from: ReviewFriendsAction.kt */
    public static final class d extends ehg0 {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnListItemTap(userId="));
        }
    }

    /* compiled from: ReviewFriendsAction.kt */
    public static final class e extends ehg0 {
        public static final e b = new e();
    }

    /* compiled from: ReviewFriendsAction.kt */
    public static final class f extends ehg0 {
        public static final f b = new f();
    }
}
