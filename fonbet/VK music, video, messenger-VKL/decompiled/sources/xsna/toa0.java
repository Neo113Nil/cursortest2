package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TopAppBarScrollBehavior.kt */
/* loaded from: classes17.dex */
public final class toa0 implements v6p0 {
    public final x6p0 a;
    public final gzs<Boolean> b;
    public final a c = new a();

    /* compiled from: TopAppBarScrollBehavior.kt */
    public static final class a implements d160 {
        public a() {
        }

        @Override // xsna.d160
        public final long R0(int i, long j) {
            return 0L;
        }

        @Override // xsna.d160
        public final long W0(int i, long j, long j2) {
            toa0 toa0Var = toa0.this;
            x6p0 x6p0Var = toa0Var.a;
            if (!toa0Var.b.invoke().booleanValue()) {
                return 0L;
            }
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat((int) (j2 & 4294967295L)) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                x6p0Var.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return 0L;
            }
            x6p0Var.d(Float.intBitsToFloat(i2) + ((Number) ((zak0) x6p0Var.a).getValue()).floatValue());
            return 0L;
        }
    }

    public toa0(x6p0 x6p0Var, gzs<Boolean> gzsVar) {
        this.a = x6p0Var;
        this.b = gzsVar;
    }

    @Override // xsna.v6p0
    public final d160 a() {
        return this.c;
    }

    @Override // xsna.v6p0
    public final Object b(wd00 wd00Var) {
        return s3q0.a;
    }

    @Override // xsna.v6p0
    public final x6p0 getState() {
        return this.a;
    }
}
