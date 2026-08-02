package xsna;

/* compiled from: LongPollSync.kt */
/* loaded from: classes2.dex */
public abstract class v400 {

    /* compiled from: LongPollSync.kt */
    public static final class a extends v400 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ChannelsLongPollSync(ts="));
        }
    }

    /* compiled from: LongPollSync.kt */
    public static final class b extends v400 {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesLongPollSync(pts=");
            sb.append(this.a);
            sb.append(", ts=");
            return vu5.a(')', this.b, sb);
        }
    }
}
