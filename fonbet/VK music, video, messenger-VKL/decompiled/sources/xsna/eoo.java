package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.time.DurationUnit;
import xsna.u300;
import xsna.zno;

/* compiled from: Duration.kt */
/* loaded from: classes11.dex */
public final class eoo {

    /* compiled from: Duration.kt */
    /* loaded from: classes8.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : swe0.i(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if (-4611686018427387903L < j2 && j2 < 4611686018427387903L) {
            return j;
        }
        if ((j2 ^ j) >= 0) {
            return j;
        }
        return 9223372036854759646L;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        zno.c.getClass();
        int i = doo.a;
        return j2;
    }

    public static final long c(long j) {
        zno.a aVar = zno.c;
        long j2 = j << 1;
        int i = doo.a;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ca, code lost:
    
        if (r8 == r25.length()) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
    
        if (r25.charAt(r8) != 'S') goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d4, code lost:
    
        r2 = (r13 * 1000000000) + r14;
        r4 = r10;
        r13 = kotlin.time.DurationUnit.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e8, code lost:
    
        switch(xsna.eoo.a.$EnumSwitchMapping$0[r13.ordinal()]) {
            case 1: goto L137;
            case 2: goto L136;
            case 3: goto L135;
            case 4: goto L134;
            case 5: goto L133;
            case 6: goto L132;
            case 7: goto L131;
            default: goto L211;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0203, code lost:
    
        r13 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022c, code lost:
    
        r13 = xsna.an10.c(r2 * r13) * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0209, code lost:
    
        r13 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020f, code lost:
    
        r13 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0215, code lost:
    
        r13 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x021b, code lost:
    
        r13 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0221, code lost:
    
        r13 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0227, code lost:
    
        r13 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0202, code lost:
    
        throw new java.lang.IllegalStateException(("Unknown unit: " + r13).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0117, code lost:
    
        throw new java.lang.IllegalArgumentException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0101, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        if (r8 >= r25.length()) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        r4 = r25.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
    
        if ('0' > r4) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r4 >= ':') goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if (r8 == r25.length()) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
    
        if (r3 == '+') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        if (r3 == '-') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
    
        if (r8 == (r21 + r3)) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        r18 = r7.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169 A[LOOP:5: B:77:0x0167->B:78:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6 A[LOOP:7: B:90:0x01a4->B:91:0x01a6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long d(String str) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        int i8;
        int min;
        int i9;
        int i10;
        int i11;
        char charAt;
        char charAt2;
        int i12;
        int i13;
        long j2;
        long j3;
        long j4;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        char charAt3 = str.charAt(0);
        char c = '-';
        char c2 = '+';
        if (charAt3 != '+') {
            i2 = charAt3 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException("");
        }
        int i14 = i2 + 1;
        if (i14 == str.length()) {
            throw new IllegalArgumentException("");
        }
        boolean z2 = false;
        DurationUnit durationUnit = null;
        long j5 = 0;
        long j6 = 0;
        while (i14 < str.length()) {
            char charAt4 = str.charAt(i14);
            if (charAt4 != 'T') {
                u300 u300Var = u300.e;
                u300 a2 = u300.a.a();
                z = a2.b;
                if (z) {
                    char charAt5 = str.charAt(i14);
                    if (charAt5 == c2) {
                        i3 = i14 + 1;
                        i4 = 1;
                        while (i3 < str.length()) {
                            i3++;
                        }
                        j = 0;
                        while (true) {
                            if (i3 < str.length()) {
                            }
                            j = (j << 3) + (j << 1) + i13;
                            i3++;
                            i = i6;
                            i14 = i5;
                        }
                        i6 = i;
                        if (i3 != str.length()) {
                        }
                        throw new IllegalArgumentException("");
                    }
                    if (charAt5 == c) {
                        i3 = i14 + 1;
                        i4 = -1;
                        while (i3 < str.length() && str.charAt(i3) == '0') {
                            i3++;
                        }
                        j = 0;
                        while (true) {
                            if (i3 < str.length()) {
                                char charAt6 = str.charAt(i3);
                                i5 = i14;
                                if ('0' <= charAt6 && charAt6 < ':') {
                                    i13 = charAt6 - '0';
                                    j2 = a2.c;
                                    if (j <= j2) {
                                        j3 = a2.c;
                                        if (j == j3) {
                                            i6 = i;
                                            long j7 = i13;
                                            j4 = a2.d;
                                            if (j7 > j4) {
                                            }
                                        } else {
                                            i6 = i;
                                        }
                                        j = (j << 3) + (j << 1) + i13;
                                        i3++;
                                        i = i6;
                                        i14 = i5;
                                    } else {
                                        i6 = i;
                                    }
                                }
                            } else {
                                i5 = i14;
                            }
                        }
                        i6 = i;
                        if (i3 != str.length()) {
                            if (i3 == i5 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                            }
                            long j8 = j;
                            if (str.charAt(i3) == '.') {
                                int i15 = i3 + 1;
                                int min2 = Math.min(i3 + 7, str.length());
                                int i16 = 0;
                                for (int i17 = i15; i17 < min2; i17++) {
                                    char charAt7 = str.charAt(i17);
                                    if ('0' <= charAt7 && charAt7 < ':') {
                                        i16 = (charAt7 - '0') + (i16 << 3) + (i16 << 1);
                                    }
                                    for (i8 = 0; i8 < 6 - (i17 - i15); i8++) {
                                        i16 = (i16 << 1) + (i16 << 3);
                                    }
                                    min = Math.min(i17 + 9, str.length());
                                    i9 = i17;
                                    i10 = 0;
                                    while (true) {
                                        i7 = i6;
                                        if (i9 >= min) {
                                            charAt2 = str.charAt(i9);
                                            i12 = min;
                                            if ('0' <= charAt2 && charAt2 < ':') {
                                                i10 = (charAt2 - '0') + (i10 << 3) + (i10 << 1);
                                                i9++;
                                                i6 = i7;
                                                min = i12;
                                            }
                                        }
                                    }
                                    for (i11 = 0; i11 < 9 - (i9 - i17); i11++) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    i3 = i9;
                                    while (i3 < str.length() && '0' <= (charAt = str.charAt(i3)) && charAt < ':') {
                                        i3++;
                                    }
                                    throw new IllegalArgumentException("");
                                }
                                while (i8 < 6 - (i17 - i15)) {
                                }
                                min = Math.min(i17 + 9, str.length());
                                i9 = i17;
                                i10 = 0;
                                while (true) {
                                    i7 = i6;
                                    if (i9 >= min) {
                                    }
                                    i10 = (charAt2 - '0') + (i10 << 3) + (i10 << 1);
                                    i9++;
                                    i6 = i7;
                                    min = i12;
                                }
                                while (i11 < 9 - (i9 - i17)) {
                                }
                                i3 = i9;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                throw new IllegalArgumentException("");
                            }
                            i7 = i6;
                            char charAt8 = str.charAt(i3);
                            DurationUnit durationUnit2 = charAt8 != 'D' ? charAt8 != 'H' ? charAt8 != 'M' ? charAt8 != 'S' ? null : DurationUnit.SECONDS : DurationUnit.MINUTES : DurationUnit.HOURS : DurationUnit.DAYS;
                            if (durationUnit2 == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (durationUnit != null && durationUnit.compareTo(durationUnit2) <= 0) {
                                throw new IllegalArgumentException("Unexpected order of duration components");
                            }
                            if (durationUnit2 == DurationUnit.DAYS) {
                                if (z2) {
                                    throw new IllegalArgumentException("");
                                }
                                j5 = koo.u(j8, durationUnit2) * i4;
                            } else {
                                if (!z2) {
                                    throw new IllegalArgumentException("");
                                }
                                long a3 = a(j5, koo.u(j8, durationUnit2) * i4);
                                if (a3 == 9223372036854759646L) {
                                    throw new IllegalArgumentException("");
                                }
                                j5 = a3;
                            }
                            DurationUnit durationUnit3 = durationUnit2;
                            i14 = i3 + 1;
                            durationUnit = durationUnit3;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                        throw new IllegalArgumentException("");
                    }
                }
                i3 = i14;
                i4 = 1;
                while (i3 < str.length()) {
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                    }
                    j = (j << 3) + (j << 1) + i13;
                    i3++;
                    i = i6;
                    i14 = i5;
                }
                i6 = i;
                if (i3 != str.length()) {
                }
                throw new IllegalArgumentException("");
            }
            if (z2 || (i14 = i14 + 1) == str.length()) {
                throw new IllegalArgumentException("");
            }
            z2 = true;
        }
        int i18 = i;
        long i19 = zno.i(f(j5, DurationUnit.MILLISECONDS), f(j6, DurationUnit.NANOSECONDS));
        return (i18 == 0 || zno.d(i19, zno.f)) ? i19 : zno.n(i19);
    }

    public static final long e(int i, DurationUnit durationUnit) {
        if (durationUnit.compareTo(DurationUnit.SECONDS) > 0) {
            return f(i, durationUnit);
        }
        return c(DurationUnit.NANOSECONDS.h().convert(i, durationUnit.h()));
    }

    public static final long f(long j, DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long convert = durationUnit.h().convert(4611686018426999999L, durationUnit2.h());
        if ((-convert) <= j && j <= convert) {
            return c(durationUnit2.h().convert(j, durationUnit.h()));
        }
        DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit3) < 0) {
            return b(swe0.i(durationUnit3.h().convert(j, durationUnit.h()), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j);
        if (j < C.TIME_UNSET) {
            j = -9223372036854775807L;
        }
        return b(koo.u(Math.abs(j), durationUnit) * signum);
    }
}
