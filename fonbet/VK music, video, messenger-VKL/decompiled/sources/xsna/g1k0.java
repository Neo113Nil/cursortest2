package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class g1k0 implements gho {
    public gzs<s3q0> a;
    public final bwf<Float> b;
    public final kg50 c;
    public izs<? super Float, s3q0> d;
    public final boolean e;
    public final float[] f;
    public final rg50 g;
    public final rg50 h;
    public boolean i;
    public final rg50 j;
    public final rg50 k;
    public final Orientation l;
    public final wh50 m;
    public final g880 n;
    public final kg50 o;
    public final kg50 p;
    public final f1k0 q;
    public final ni50 r;

    public g1k0() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object d = zvj.d(new e1k0(this, mutatePriority, wzsVar, null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }

    public final void b(float f) {
        float max;
        float min;
        if (this.l == Orientation.Vertical) {
            float intValue = ((wak0) this.h).getIntValue();
            wak0 wak0Var = (wak0) this.k;
            max = Math.max(intValue - (wak0Var.getIntValue() / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            min = Math.min(wak0Var.getIntValue() / 2.0f, max);
        } else {
            float intValue2 = ((wak0) this.g).getIntValue();
            wak0 wak0Var2 = (wak0) this.j;
            max = Math.max(intValue2 - (wak0Var2.getIntValue() / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            min = Math.min(wak0Var2.getIntValue() / 2.0f, max);
        }
        vak0 vak0Var = (vak0) this.o;
        float floatValue = vak0Var.getFloatValue() + f;
        kg50 kg50Var = this.p;
        vak0Var.g(((vak0) kg50Var).getFloatValue() + floatValue);
        ((vak0) kg50Var).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float d = x0k0.d(vak0Var.getFloatValue(), min, max, this.f);
        bwf<Float> bwfVar = this.b;
        float f2 = max - min;
        float z = q6x.z(bwfVar.getStart().floatValue(), bwfVar.c().floatValue(), swe0.f(f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (d - min) / f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        if (z == c()) {
            return;
        }
        izs<? super Float, s3q0> izsVar = this.d;
        if (izsVar != null) {
            izsVar.invoke(Float.valueOf(z));
        } else {
            d(z);
        }
    }

    public final float c() {
        return ((vak0) this.c).getFloatValue();
    }

    public final void d(float f) {
        if (this.e) {
            bwf<Float> bwfVar = this.b;
            f = x0k0.d(swe0.f(f, bwfVar.getStart().floatValue(), bwfVar.c().floatValue()), bwfVar.getStart().floatValue(), bwfVar.c().floatValue(), this.f);
        }
        ((vak0) this.c).g(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g1k0(float f, gzs gzsVar, bwf bwfVar) {
        this.a = gzsVar;
        this.b = bwfVar;
        this.c = androidx.compose.runtime.d.a(f);
        this.e = true;
        float f2 = x0k0.a;
        this.f = new float[0];
        this.g = androidx.compose.runtime.i.a(0);
        this.h = androidx.compose.runtime.i.a(0);
        this.j = androidx.compose.runtime.i.a(0);
        this.k = androidx.compose.runtime.i.a(0);
        this.l = Orientation.Horizontal;
        this.m = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.n = new g880(this, 23);
        float floatValue = ((Number) bwfVar.getStart()).floatValue();
        float floatValue2 = ((Number) bwfVar.c()).floatValue() - floatValue;
        this.o = androidx.compose.runtime.d.a(q6x.z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, swe0.f(floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (f - floatValue) / floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
        this.p = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.q = new f1k0(this);
        this.r = new ni50();
    }
}
