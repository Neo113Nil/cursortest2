package xsna;

/* compiled from: ContentScale.kt */
/* loaded from: classes11.dex */
public interface wkj {

    /* compiled from: ContentScale.kt */
    public static final class a {
        public static final C3940a a = new C3940a();
        public static final e b = new e();
        public static final c c = new c();
        public static final d d = new d();
        public static final f e = new f();
        public static final enr f = new enr();
        public static final b g = new b();

        /* compiled from: ContentScale.kt */
        /* renamed from: xsna.wkj$a$a, reason: collision with other inner class name */
        public static final class C3940a implements wkj {
            @Override // xsna.wkj
            public final long a(long j, long j2) {
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = m4h0.a;
                return floatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class b implements wkj {
            @Override // xsna.wkj
            public final long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i = m4h0.a;
                return floatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class c implements wkj {
            @Override // xsna.wkj
            public final long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                int i = m4h0.a;
                return floatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class d implements wkj {
            @Override // xsna.wkj
            public final long a(long j, long j2) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                int i = m4h0.a;
                return floatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class e implements wkj {
            @Override // xsna.wkj
            public final long a(long j, long j2) {
                float k = l370.k(j, j2);
                long floatToRawIntBits = (Float.floatToRawIntBits(k) << 32) | (4294967295L & Float.floatToRawIntBits(k));
                int i = m4h0.a;
                return floatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        public static final class f implements wkj {
            @Override // xsna.wkj
            public final long a(long j, long j2) {
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i = m4h0.a;
                    return floatToRawIntBits;
                }
                float k = l370.k(j, j2);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(k) << 32) | (Float.floatToRawIntBits(k) & 4294967295L);
                int i2 = m4h0.a;
                return floatToRawIntBits2;
            }
        }
    }

    long a(long j, long j2);
}
