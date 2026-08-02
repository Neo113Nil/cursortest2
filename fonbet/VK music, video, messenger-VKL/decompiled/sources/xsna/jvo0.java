package xsna;

import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: TimeSource.kt */
/* loaded from: classes8.dex */
public final class jvo0 implements kvo0 {
    public static final jvo0 a = new jvo0();

    /* compiled from: TimeSource.kt */
    @vby
    public static final class a implements u6i {
        public final long b;

        public /* synthetic */ a(long j) {
            this.b = j;
        }

        public static long b(long j) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? zno.n(t500.a(j)) : t500.c(k830.b(), j, DurationUnit.NANOSECONDS);
        }

        public static final long c(long j, long j2) {
            int i = k830.b;
            DurationUnit durationUnit = DurationUnit.NANOSECONDS;
            if (((j2 - 1) | 1) != Long.MAX_VALUE) {
                return (1 | (j - 1)) == Long.MAX_VALUE ? t500.a(j) : t500.c(j, j2, durationUnit);
            }
            if (j != j2) {
                return zno.n(t500.a(j2));
            }
            zno.a aVar = zno.c;
            return 0L;
        }

        @Override // xsna.uto0
        public final long a() {
            return b(this.b);
        }

        @Override // java.lang.Comparable
        public final int compareTo(u6i u6iVar) {
            u6i u6iVar2 = u6iVar;
            boolean z = u6iVar2 instanceof a;
            long j = this.b;
            if (z) {
                return zno.c(c(j, ((a) u6iVar2).b), 0L);
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + u6iVar2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.b == ((a) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return q9k.d("ValueTimeMark(reading=", this.b, ')');
        }
    }

    @Override // xsna.kvo0
    public final a a() {
        return new a(k830.b());
    }

    public final String toString() {
        int i = k830.b;
        return "TimeSource(System.nanoTime())";
    }
}
