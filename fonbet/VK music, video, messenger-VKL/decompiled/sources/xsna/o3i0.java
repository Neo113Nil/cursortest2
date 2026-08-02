package xsna;

import androidx.annotation.Nullable;

/* compiled from: SeekParameters.java */
/* loaded from: classes12.dex */
public final class o3i0 {
    public static final o3i0 c;
    public static final o3i0 d;
    public final long a;
    public final long b;

    static {
        o3i0 o3i0Var = new o3i0(0L, 0L);
        new o3i0(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new o3i0(Long.MAX_VALUE, 0L);
        new o3i0(0L, Long.MAX_VALUE);
        d = o3i0Var;
    }

    public o3i0(long j, long j2) {
        fxc0.p(j >= 0);
        fxc0.p(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = y2r0.a;
        long j6 = j - j4;
        boolean z = false;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long a = y2r0.a(j, j5);
        boolean z2 = j7 <= j2 && j2 <= a;
        if (j7 <= j3 && j3 <= a) {
            z = true;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j3 : j7;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o3i0.class == obj.getClass()) {
            o3i0 o3i0Var = (o3i0) obj;
            if (this.a == o3i0Var.a && this.b == o3i0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
