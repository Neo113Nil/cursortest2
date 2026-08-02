package xsna;

/* compiled from: OfflinePlaybackErrorsEvasionConfig.kt */
/* loaded from: classes11.dex */
public final class uu70 {
    public static final a b = new a();
    public final b a;

    /* compiled from: OfflinePlaybackErrorsEvasionConfig.kt */
    public static final class a {
    }

    /* compiled from: OfflinePlaybackErrorsEvasionConfig.kt */
    /* loaded from: classes6.dex */
    public interface b {

        /* compiled from: OfflinePlaybackErrorsEvasionConfig.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -200299448;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: OfflinePlaybackErrorsEvasionConfig.kt */
        /* renamed from: xsna.uu70$b$b, reason: collision with other inner class name */
        public static final class C3834b implements b {
            public final int a;
            public final long b;

            public C3834b(int i, long j) {
                this.a = i;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3834b)) {
                    return false;
                }
                C3834b c3834b = (C3834b) obj;
                return this.a == c3834b.a && this.b == c3834b.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SkipDuration(maxRetryCount=");
                sb.append(this.a);
                sb.append(", skipDurationMs=");
                return vu5.a(')', this.b, sb);
            }
        }
    }

    public uu70(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu70) && epx.f(this.a, ((uu70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OfflinePlaybackErrorsEvasionConfig(evasionStrategy=" + this.a + ')';
    }
}
