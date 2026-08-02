package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.koh0;

/* compiled from: CommunityDetailsCollapsingState.kt */
/* loaded from: classes5.dex */
public final class c1h implements azl, a4g {
    public final /* synthetic */ azl b;
    public final koh0.a c;
    public final float l;
    public final wh50<q9x> d = androidx.compose.runtime.k.b(null);
    public final wh50<q9x> e = androidx.compose.runtime.k.b(null);
    public final wh50<q9x> f = androidx.compose.runtime.k.b(null);
    public final wh50<Integer> g = androidx.compose.runtime.k.b(0);
    public final wh50<q9x> h = androidx.compose.runtime.k.b(null);
    public final wh50<q9x> i = androidx.compose.runtime.k.b(null);
    public final wh50<ljo0> j = androidx.compose.runtime.k.b(null);
    public final wh50<Float> k = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final f1m m = bbk0.b(new jcg(this, 2));
    public final f1m n = bbk0.b(new b1h(this, 0));
    public final f1m o = bbk0.b(new ncg(this, 4));
    public final f1m p = bbk0.b(new hh1(this, 26));
    public final f1m q = bbk0.b(new ocg(this, 3));
    public final f1m r = bbk0.b(new ry0(this, 26));
    public final f1m s = bbk0.b(new ji0(this, 25));
    public final f1m t = bbk0.b(new g4g(this, 2));
    public final f1m u = bbk0.b(new z0h(this, 0));
    public final f1m v = bbk0.b(new drg(this, 1));
    public final f1m w = bbk0.b(new trf(this, 2));
    public final f1m x = bbk0.b(new a1h(this, 0));
    public final f1m y = bbk0.b(new dof(this, 6));

    public c1h(azl azlVar, koh0.a aVar) {
        this.b = azlVar;
        this.c = aVar;
        this.l = azlVar.I0(20);
    }

    public static /* synthetic */ float v(c1h c1hVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return c1hVar.q(f, f2, (i & 4) == 0);
    }

    @Override // xsna.azl
    public final long E(long j) {
        return this.b.E(j);
    }

    @Override // xsna.azl
    public final long I(int i) {
        return this.b.I(i);
    }

    @Override // xsna.azl
    public final float I0(float f) {
        return this.b.I0(f);
    }

    @Override // xsna.azl
    public final long J(float f) {
        return this.b.J(f);
    }

    @Override // xsna.azl
    public final float O0(long j) {
        return this.b.O0(j);
    }

    @Override // xsna.a4g
    public final Object c(boolean z, float f, b4g b4gVar) {
        Object c = nkn0.c(((Number) ((zak0) this.k).getValue()).floatValue(), z ? x() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, null, new o4e(this, 2), b4gVar, 8);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }

    @Override // xsna.a4g
    public final f1m e() {
        return this.o;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.b.getFontScale();
    }

    @Override // xsna.azl
    public final long i0(float f) {
        return this.b.i0(f);
    }

    @Override // xsna.azl
    public final float j1(int i) {
        return this.b.j1(i);
    }

    @Override // xsna.a4g
    public final float k() {
        return v(this, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 4);
    }

    @Override // xsna.azl
    public final float k1(float f) {
        return this.b.k1(f);
    }

    @Override // xsna.a4g
    public final float p(float f) {
        if (x() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float floatValue = ((Number) ((zak0) this.k).getValue()).floatValue();
        return y(f + floatValue) - floatValue;
    }

    @Override // xsna.azl
    public final long p1(long j) {
        return this.b.p1(j);
    }

    public final float q(float f, float f2, boolean z) {
        float f3 = f2 - f;
        float f4 = swe0.f(((Number) this.n.getValue()).floatValue() - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3) / f3;
        return z ? 1.0f - f4 : f4;
    }

    @Override // xsna.azl
    public final int r0(float f) {
        return this.b.r0(f);
    }

    @Override // xsna.azl
    public final float u0(long j) {
        return this.b.u0(j);
    }

    public final int w() {
        q9x q9xVar = (q9x) ((zak0) this.d).getValue();
        return ((q9xVar != null ? (int) (q9xVar.a & 4294967295L) : 0) - ((Number) ((zak0) this.g).getValue()).intValue()) - ((int) this.b.I0(20));
    }

    public final float x() {
        return ((Number) this.m.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float y(float f) {
        float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, x());
        ((zak0) this.k).setValue(Float.valueOf(f2));
        this.c.invoke(this.o.getValue(), Float.valueOf(x()));
        return f2;
    }
}
