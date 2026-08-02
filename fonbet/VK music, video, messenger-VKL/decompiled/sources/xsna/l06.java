package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import io.jsonwebtoken.JwtParser;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: EqualizerSlider.kt */
/* loaded from: classes3.dex */
public final class l06 implements gho {
    public final short a;
    public final short b;
    public final izs<Short, s3q0> c;
    public final gzs<s3q0> d;
    public final int g;
    public final kg50 l;
    public final sa0 m;
    public final a n;
    public final ni50 o;
    public final wh50 e = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final wh50 f = androidx.compose.runtime.k.b((short) 0);
    public final kg50 h = androidx.compose.runtime.d.a(1.0f);
    public final rg50 i = androidx.compose.runtime.i.a(0);
    public final rg50 j = androidx.compose.runtime.i.a(0);
    public final kg50 k = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* compiled from: EqualizerSlider.kt */
    public static final class a implements pgo {
        public a() {
        }

        @Override // xsna.pgo
        public final void a(float f) {
            l06.this.b(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l06(short s, short s2, izs<? super Short, s3q0> izsVar, gzs<s3q0> gzsVar) {
        this.a = s;
        this.b = s2;
        this.c = izsVar;
        this.d = gzsVar;
        this.g = Math.abs((int) s2) + Math.abs((int) s);
        float f = s;
        float f2 = s2 - f;
        this.l = androidx.compose.runtime.d.a(q6x.z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, swe0.f(f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f) / f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
        this.m = new sa0(this, 9);
        this.n = new a();
        this.o = new ni50();
    }

    @Override // xsna.gho
    public final Object a(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object d = zvj.d(new k06(this, mutatePriority, wzsVar, null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }

    public final void b(float f) {
        vak0 vak0Var = (vak0) this.l;
        float floatValue = vak0Var.getFloatValue() - f;
        kg50 kg50Var = this.k;
        vak0Var.g(floatValue - ((vak0) kg50Var).getFloatValue());
        ((vak0) kg50Var).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        d((short) q6x.z(this.a, this.b, swe0.f((((wak0) this.i).getIntValue() - (((wak0) this.j).getIntValue() / 2)) - (r1.getIntValue() / 2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (vak0Var.getFloatValue() - r1) / r0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
        this.c.invoke(Short.valueOf(((Number) ((zak0) this.f).getValue()).shortValue()));
    }

    public final boolean c() {
        return ((Boolean) ((zak0) this.e).getValue()).booleanValue();
    }

    public final void d(short s) {
        short s2 = this.a;
        short s3 = this.b;
        if (s2 > s3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + JwtParser.SEPARATOR_CHAR);
        }
        if (s < s2) {
            s = s2;
        } else if (s > s3) {
            s = s3;
        }
        ((zak0) this.f).setValue(Short.valueOf(s));
    }
}
