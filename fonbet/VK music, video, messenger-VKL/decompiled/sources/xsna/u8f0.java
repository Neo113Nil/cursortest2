package xsna;

/* compiled from: RecalculationReason.kt */
/* loaded from: classes6.dex */
public interface u8f0 {

    /* compiled from: RecalculationReason.kt */
    public static final class a implements u8f0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
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
            return vu5.a(')', this.a, new StringBuilder("FrameRendered(frameTimestampMs="));
        }
    }

    /* compiled from: RecalculationReason.kt */
    public static final class b implements u8f0 {
        public final iht0 a;
        public final boolean b;
        public final jht0 c;
        public final jht0 d;

        public b(iht0 iht0Var, boolean z, jht0 jht0Var, jht0 jht0Var2) {
            this.a = iht0Var;
            this.b = z;
            this.c = jht0Var;
            this.d = jht0Var2;
        }

        public final boolean a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            jht0 jht0Var = this.c;
            int hashCode = (b + (jht0Var == null ? 0 : jht0Var.hashCode())) * 31;
            jht0 jht0Var2 = this.d;
            return hashCode + (jht0Var2 != null ? jht0Var2.hashCode() : 0);
        }

        public final String toString() {
            return "VideoSlotChanged(slot=" + this.a + ", isCurrentFocus=" + this.b + ", oldInfo=" + this.c + ", newInfo=" + this.d + ')';
        }
    }
}
