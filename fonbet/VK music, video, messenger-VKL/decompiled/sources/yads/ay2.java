package yads;

/* loaded from: classes10.dex */
public final class ay2 {
    public static final ay2 c;
    public final long a;
    public final long b;

    static {
        ay2 ay2Var = new ay2(0L, 0L);
        new ay2(Long.MAX_VALUE, Long.MAX_VALUE);
        new ay2(Long.MAX_VALUE, 0L);
        new ay2(0L, Long.MAX_VALUE);
        c = ay2Var;
    }

    public ay2(long j, long j2) {
        ni.a(j >= 0);
        ni.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        int i = mc3.a;
        long j5 = j - j4;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = this.b;
        long j7 = j + j6;
        if (((j6 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j5 <= j2 && j2 <= j7;
        if (j5 <= j3 && j3 <= j7) {
            z = true;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j3 : j5;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ay2.class == obj.getClass()) {
            ay2 ay2Var = (ay2) obj;
            if (this.a == ay2Var.a && this.b == ay2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
