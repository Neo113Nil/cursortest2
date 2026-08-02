package xsna;

/* compiled from: MsgShowReporter.kt */
/* loaded from: classes.dex */
public interface uz30 {

    /* compiled from: MsgShowReporter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final long b;
        public final long c;

        public a(String str, long j, long j2) {
            this.a = str;
            this.b = j;
            this.c = j2;
        }

        public final long a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewTime(trackCode=");
            sb.append(this.a);
            sb.append(", startTimeMs=");
            sb.append(this.b);
            sb.append(", endTimeMs=");
            return vu5.a(')', this.c, sb);
        }
    }

    void a(long j);

    void b(a aVar);
}
