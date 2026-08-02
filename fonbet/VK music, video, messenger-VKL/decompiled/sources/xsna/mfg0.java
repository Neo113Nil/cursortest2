package xsna;

/* compiled from: RetryWhen.kt */
/* loaded from: classes5.dex */
public final class mfg0 {
    public static final nq a = new nq(21);

    /* compiled from: RetryWhen.kt */
    public static final class a {
        public final Throwable a;
        public final long b;

        public a(long j, Throwable th) {
            this.a = th;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorAndDuration(throwable=");
            sb.append(this.a);
            sb.append(", durationMs=");
            return vu5.a(')', this.b, sb);
        }
    }
}
