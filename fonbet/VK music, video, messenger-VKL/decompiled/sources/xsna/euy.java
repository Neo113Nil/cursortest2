package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dak0;

/* compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
/* loaded from: classes11.dex */
public final class euy {
    public yok0 a;
    public kq2<Float, sq2> b;

    /* compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return euy.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                kq2<Float, sq2> kq2Var = euy.this.b;
                Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new Float(0.5f), 1);
                this.label = 1;
                if (nkn0.f(kq2Var, f, c, true, null, this, 8) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public euy() {
        jtp0 jtp0Var = rte0.e;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b = new kq2<>(jtp0Var, valueOf, (wq2) jtp0Var.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final boolean a() {
        return !(((Number) ((zak0) this.b.c).getValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void b() {
        yok0 yok0Var = this.a;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.b = new kq2<>(rte0.e, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, 60);
    }

    public final void c(float f, azl azlVar, yvj yvjVar) {
        if (f <= azlVar.I0(fuy.a)) {
            return;
        }
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e = a2 != null ? a2.e() : null;
        dak0 b = dak0.a.b(a2);
        try {
            float floatValue = ((Number) ((zak0) this.b.c).getValue()).floatValue();
            yok0 yok0Var = this.a;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            kq2<Float, sq2> kq2Var = this.b;
            if (kq2Var.g) {
                this.b = s1v.c(kq2Var, floatValue - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
            } else {
                this.b = new kq2<>(rte0.e, Float.valueOf(-f), null, 60);
            }
            this.a = myc0.h(yvjVar, null, null, new a(null), 3);
            s3q0 s3q0Var = s3q0.a;
            dak0.a.d(a2, b, e);
        } catch (Throwable th) {
            dak0.a.d(a2, b, e);
            throw th;
        }
    }
}
