package xsna;

import xsna.z3s0;

/* compiled from: SeekBarLayoutController.kt */
/* loaded from: classes2.dex */
public interface j3i0 {

    /* compiled from: SeekBarLayoutController.kt */
    public interface a {
    }

    /* compiled from: SeekBarLayoutController.kt */
    public static final class b {
        public final long a;
        public final long b;
        public final long c;
        public final owo0 d;
        public final sox e;

        public b() {
            this(0L, 0L, 0L, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            owo0 owo0Var = this.d;
            int hashCode = (a + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31;
            sox soxVar = this.e;
            return hashCode + (soxVar != null ? soxVar.hashCode() : 0);
        }

        public final String toString() {
            return "State(position=" + this.a + ", bufferedPosition=" + this.b + ", duration=" + this.c + ", timelineImages=" + this.d + ", intervals=" + this.e + ')';
        }

        public b(long j, long j2, long j3, owo0 owo0Var, sox soxVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = owo0Var;
            this.e = soxVar;
        }
    }

    a a();

    z3s0.a b();

    void c(gh5 gh5Var);

    void d(b bVar);

    boolean e();

    b getState();

    void setVisible(boolean z);
}
