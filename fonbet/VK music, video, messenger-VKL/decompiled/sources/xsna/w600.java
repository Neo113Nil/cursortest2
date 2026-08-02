package xsna;

import androidx.compose.foundation.MutatePriority;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: LottieAnimatable.kt */
/* loaded from: classes12.dex */
public final class w600 implements s600 {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final f1m i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final f1m n;
    public final ni50 o;

    /* compiled from: LottieAnimatable.kt */
    public static final class a extends Lambda implements gzs<Float> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Float invoke() {
            i700 G = w600.this.G();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (G != null) {
                if (w600.this.z() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    h700 o = w600.this.o();
                    if (o != null) {
                        f = o.b(G);
                    }
                } else {
                    h700 o2 = w600.this.o();
                    f = o2 != null ? o2.a(G) : 1.0f;
                }
            }
            return Float.valueOf(f);
        }
    }

    /* compiled from: LottieAnimatable.kt */
    public static final class b extends Lambda implements gzs<Float> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final Float invoke() {
            return Float.valueOf((w600.this.k() && w600.this.M() % 2 == 0) ? -w600.this.z() : w600.this.z());
        }
    }

    /* compiled from: LottieAnimatable.kt */
    public static final class c extends Lambda implements gzs<Boolean> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(w600.this.M() == w600.this.D() && w600.this.getProgress() == w600.this.j());
        }
    }

    public w600() {
        Boolean bool = Boolean.FALSE;
        this.b = androidx.compose.runtime.k.b(bool);
        this.c = androidx.compose.runtime.k.b(1);
        this.d = androidx.compose.runtime.k.b(1);
        this.e = androidx.compose.runtime.k.b(bool);
        this.f = androidx.compose.runtime.k.b(null);
        this.g = androidx.compose.runtime.k.b(Float.valueOf(1.0f));
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = bbk0.b(new b());
        this.j = androidx.compose.runtime.k.b(null);
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.k = androidx.compose.runtime.k.b(valueOf);
        this.l = androidx.compose.runtime.k.b(valueOf);
        this.m = androidx.compose.runtime.k.b(Long.MIN_VALUE);
        this.n = bbk0.b(new a());
        bbk0.b(new c());
        this.o = new ni50();
    }

    public static final boolean c(w600 w600Var, int i, long j) {
        i700 G = w600Var.G();
        wh50 wh50Var = w600Var.k;
        f1m f1mVar = w600Var.i;
        wh50 wh50Var2 = w600Var.m;
        if (G == null) {
            return true;
        }
        long longValue = ((Number) ((zak0) wh50Var2).getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((zak0) wh50Var2).getValue()).longValue();
        ((zak0) wh50Var2).setValue(Long.valueOf(j));
        h700 o = w600Var.o();
        float b2 = o != null ? o.b(G) : 0.0f;
        h700 o2 = w600Var.o();
        float a2 = o2 != null ? o2.a(G) : 1.0f;
        float floatValue = ((Number) f1mVar.getValue()).floatValue() * ((longValue / 1000000) / G.b());
        float floatValue2 = ((Number) f1mVar.getValue()).floatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? b2 - (((Number) ((zak0) wh50Var).getValue()).floatValue() + floatValue) : (((Number) ((zak0) wh50Var).getValue()).floatValue() + floatValue) - a2;
        if (b2 == a2) {
            w600Var.n(b2);
            return false;
        }
        if (floatValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            w600Var.n(swe0.f(((Number) ((zak0) wh50Var).getValue()).floatValue(), b2, a2) + floatValue);
            return true;
        }
        float f = a2 - b2;
        int i2 = (int) (floatValue2 / f);
        int i3 = i2 + 1;
        if (w600Var.M() + i3 > i) {
            w600Var.n(w600Var.j());
            w600Var.m(i);
            return false;
        }
        w600Var.m(w600Var.M() + i3);
        float f2 = floatValue2 - (i2 * f);
        w600Var.n(((Number) f1mVar.getValue()).floatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? a2 - f2 : b2 + f2);
        return true;
    }

    public static final void h(w600 w600Var, boolean z) {
        ((zak0) w600Var.b).setValue(Boolean.valueOf(z));
    }

    @Override // xsna.c700
    public final int D() {
        return ((Number) ((zak0) this.d).getValue()).intValue();
    }

    @Override // xsna.c700
    public final i700 G() {
        return (i700) ((zak0) this.j).getValue();
    }

    @Override // xsna.c700
    public final int M() {
        return ((Number) ((zak0) this.c).getValue()).intValue();
    }

    @Override // xsna.s600
    public final Object a(i700 i700Var, float f, int i, boolean z, SuspendLambda suspendLambda) {
        Object b2 = this.o.b(MutatePriority.Default, new x600(this, i700Var, f, i, z, null), suspendLambda);
        return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : s3q0.a;
    }

    @Override // xsna.c700
    public final float getProgress() {
        return ((Number) ((zak0) this.l).getValue()).floatValue();
    }

    @Override // xsna.mtk0
    public final Float getValue() {
        return Float.valueOf(getProgress());
    }

    public final float j() {
        return ((Number) this.n.getValue()).floatValue();
    }

    @Override // xsna.c700
    public final boolean k() {
        return ((Boolean) ((zak0) this.e).getValue()).booleanValue();
    }

    @Override // xsna.s600
    public final Object l(i700 i700Var, int i, int i2, boolean z, float f, h700 h700Var, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, SuspendLambda suspendLambda) {
        Object b2 = this.o.b(MutatePriority.Default, new t600(this, i, i2, z, f, h700Var, i700Var, f2, z3, z2, lottieCancellationBehavior, null), suspendLambda);
        return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : s3q0.a;
    }

    public final void m(int i) {
        ((zak0) this.c).setValue(Integer.valueOf(i));
    }

    public final void n(float f) {
        i700 G;
        ((zak0) this.k).setValue(Float.valueOf(f));
        if (((Boolean) ((zak0) this.h).getValue()).booleanValue() && (G = G()) != null) {
            f -= f % (1 / G.n);
        }
        ((zak0) this.l).setValue(Float.valueOf(f));
    }

    @Override // xsna.c700
    public final h700 o() {
        return (h700) ((zak0) this.f).getValue();
    }

    @Override // xsna.c700
    public final float z() {
        return ((Number) ((zak0) this.g).getValue()).floatValue();
    }
}
