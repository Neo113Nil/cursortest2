package xsna;

/* compiled from: FriendsCleanupPatch.kt */
/* loaded from: classes15.dex */
public interface jns extends xl50 {

    /* compiled from: FriendsCleanupPatch.kt */
    public static final class a implements jns {
        public static final a b = new a();
    }

    /* compiled from: FriendsCleanupPatch.kt */
    public interface b extends jns {

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class a implements b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: FriendsCleanupPatch.kt */
        /* renamed from: xsna.jns$b$b, reason: collision with other inner class name */
        public static final class C3132b implements b {
            public final rms b;

            public C3132b(rms rmsVar) {
                this.b = rmsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3132b) && epx.f(this.b, ((C3132b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Result(content=" + this.b + ')';
            }
        }

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class c implements b {
            public static final c b = new c();
        }
    }

    /* compiled from: FriendsCleanupPatch.kt */
    public interface c extends jns {

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class a implements c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class b implements c {
            public final hns b;

            public b(hns hnsVar) {
                this.b = hnsVar;
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
                return "Result(page=" + this.b + ')';
            }
        }

        /* compiled from: FriendsCleanupPatch.kt */
        /* renamed from: xsna.jns$c$c, reason: collision with other inner class name */
        public static final class C3133c implements c {
            public static final C3133c b = new C3133c();
        }
    }

    /* compiled from: FriendsCleanupPatch.kt */
    public interface d extends jns {

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class a implements d {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class b implements d {
            public final rms b;

            public b(rms rmsVar) {
                this.b = rmsVar;
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
                return "Result(content=" + this.b + ')';
            }
        }

        /* compiled from: FriendsCleanupPatch.kt */
        public static final class c implements d {
            public static final c b = new c();
        }
    }
}
