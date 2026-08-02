package xsna;

/* compiled from: FrameProvider.kt */
/* loaded from: classes8.dex */
public interface xfs {

    /* compiled from: FrameProvider.kt */
    public static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder a = eq0.a(this.b, "FrameInfo(timestamp=", ", frameNumber=", this.a);
            a.append(")");
            return a.toString();
        }
    }

    a a(long j);

    boolean init();

    a v(int i);
}
