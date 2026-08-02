package xsna;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public final class tyx {
    public static final con0 a = new con0("COMPLETING_ALREADY");
    public static final con0 b = new con0("COMPLETING_WAITING_CHILDREN");
    public static final con0 c = new con0("COMPLETING_RETRY");
    public static final con0 d = new con0("TOO_LATE_TO_CANCEL");
    public static final con0 e = new con0("SEALED");
    public static final nep f = new nep(false);
    public static final nep g = new nep(true);
    public static final con0 h = new con0("NULL");
    public static final con0 i = new con0("UNINITIALIZED");
    public static final con0 j = new con0("DONE");
    public static final tyx k = new tyx();
    public static bpn0 l;

    public static final w1e a() {
        bpn0 bpn0Var = l;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (w1e) bpn0Var.getValue();
    }

    public static final int b(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final long c(long j2, long j3, long j4) {
        if (j4 > 0) {
            if (j2 < j3) {
                long j5 = j3 % j4;
                if (j5 < 0) {
                    j5 += j4;
                }
                long j6 = j2 % j4;
                if (j6 < 0) {
                    j6 += j4;
                }
                long j7 = (j5 - j6) % j4;
                if (j7 < 0) {
                    j7 += j4;
                }
                return j3 - j7;
            }
        } else {
            if (j4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j2 > j3) {
                long j8 = -j4;
                long j9 = j2 % j8;
                if (j9 < 0) {
                    j9 += j8;
                }
                long j10 = j3 % j8;
                if (j10 < 0) {
                    j10 += j8;
                }
                long j11 = (j9 - j10) % j8;
                if (j11 < 0) {
                    j11 += j8;
                }
                return j3 + j11;
            }
        }
        return j3;
    }

    public static final Object d(Object obj) {
        atw atwVar;
        ctw ctwVar = obj instanceof ctw ? (ctw) obj : null;
        return (ctwVar == null || (atwVar = ctwVar.a) == null) ? obj : atwVar;
    }
}
