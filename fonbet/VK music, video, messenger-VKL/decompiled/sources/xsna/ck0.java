package xsna;

/* compiled from: AdaptingIntegerArray.java */
/* loaded from: classes8.dex */
public final class ck0 {
    public byte[] a;
    public short[] b;
    public int[] c;
    public long[] d;
    public a e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdaptingIntegerArray.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BYTE;
        public static final a INT;
        public static final a LONG;
        public static final a SHORT;

        static {
            a aVar = new a("BYTE", 0);
            BYTE = aVar;
            a aVar2 = new a("SHORT", 1);
            SHORT = aVar2;
            a aVar3 = new a("INT", 2);
            INT = aVar3;
            a aVar4 = new a("LONG", 3);
            LONG = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final void a(int i, long j) {
        int ordinal = this.e.ordinal();
        int i2 = 0;
        if (ordinal == 0) {
            byte[] bArr = this.a;
            long j2 = bArr[i] + j;
            if (j2 <= 127) {
                bArr[i] = (byte) j2;
                return;
            }
            short[] sArr = new short[bArr.length];
            while (true) {
                if (i2 >= this.a.length) {
                    this.e = a.SHORT;
                    this.b = sArr;
                    this.a = null;
                    a(i, j);
                    return;
                }
                sArr[i2] = r3[i2];
                i2++;
            }
        } else if (ordinal == 1) {
            short[] sArr2 = this.b;
            long j3 = sArr2[i] + j;
            if (j3 <= 32767) {
                sArr2[i] = (short) j3;
                return;
            }
            int[] iArr = new int[sArr2.length];
            while (true) {
                short[] sArr3 = this.b;
                if (i2 >= sArr3.length) {
                    this.e = a.INT;
                    this.c = iArr;
                    this.b = null;
                    a(i, j);
                    return;
                }
                iArr[i2] = sArr3[i2];
                i2++;
            }
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                long[] jArr = this.d;
                jArr[i] = jArr[i] + j;
                return;
            }
            int[] iArr2 = this.c;
            long j4 = iArr2[i] + j;
            if (j4 <= 2147483647L) {
                iArr2[i] = (int) j4;
                return;
            }
            long[] jArr2 = new long[iArr2.length];
            while (true) {
                if (i2 >= this.c.length) {
                    this.e = a.LONG;
                    this.d = jArr2;
                    this.c = null;
                    a(i, j);
                    return;
                }
                jArr2[i2] = r3[i2];
                i2++;
            }
        }
    }

    public final int b() {
        int ordinal = this.e.ordinal();
        if (ordinal == 0) {
            return this.a.length;
        }
        if (ordinal == 1) {
            return this.b.length;
        }
        if (ordinal == 2) {
            return this.c.length;
        }
        if (ordinal != 3) {
            return 0;
        }
        return this.d.length;
    }
}
