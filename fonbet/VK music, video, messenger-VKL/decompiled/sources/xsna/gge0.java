package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalPullToRefresh.kt */
/* loaded from: classes17.dex */
public final class gge0 extends ytl implements nvi, d160 {
    public boolean r;
    public gzs<s3q0> s;
    public boolean t;
    public kge0 u;
    public float v;
    public final k160 w;
    public final kg50 x;
    public final kg50 y;

    /* compiled from: InternalPullToRefresh.kt */
    @b6l(c = "com.vk.core.compose.component.internal.PullToRefreshModifierNode$onAttach$1", f = "InternalPullToRefresh.kt", l = {262, 264}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return gge0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r5.c(1.0f, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            if (r5.c(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                gge0 gge0Var = gge0.this;
                if (gge0Var.r) {
                    kge0 kge0Var = gge0Var.u;
                    this.label = 1;
                } else {
                    kge0 kge0Var2 = gge0Var.u;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: InternalPullToRefresh.kt */
    @b6l(c = "com.vk.core.compose.component.internal.PullToRefreshModifierNode$onPostScroll$1", f = "InternalPullToRefresh.kt", l = {295}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return gge0.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                gge0 gge0Var = gge0.this;
                kge0 kge0Var = gge0Var.u;
                float floatValue = ((vak0) gge0Var.x).getFloatValue() / gge0.this.o2();
                this.label = 1;
                if (kge0Var.c(floatValue, this) == coroutineSingletons) {
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

    /* compiled from: InternalPullToRefresh.kt */
    @b6l(c = "com.vk.core.compose.component.internal.PullToRefreshModifierNode", f = "InternalPullToRefresh.kt", l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "onPreFling-QWom1Mo")
    public static final class c extends ContinuationImpl {
        float F$0;
        int label;
        /* synthetic */ Object result;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return gge0.this.M(0L, this);
        }
    }

    public gge0() {
        throw null;
    }

    public gge0(boolean z, gzs gzsVar, boolean z2, kge0 kge0Var, float f) {
        this.r = z;
        this.s = gzsVar;
        this.t = z2;
        this.u = kge0Var;
        this.v = f;
        this.w = new k160(this, null);
        this.x = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.y = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, spj<? super jmr0> spjVar) {
        c cVar;
        int i;
        float f;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    float c2 = jmr0.c(j);
                    cVar.F$0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    cVar.label = 1;
                    obj = p2(c2, cVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    f = 0.0f;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = cVar.F$0;
                    kotlin.a.a(obj);
                }
                return new jmr0(m200.b(f, ((Number) obj).floatValue()));
            }
        }
        cVar = new c((ContinuationImpl) spjVar);
        Object obj3 = cVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        return new jmr0(m200.b(f, ((Number) obj3).floatValue()));
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        if (!this.u.b() && this.t && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return n2(j);
        }
        return 0L;
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (this.u.b() || !this.t || i != 1) {
            return 0L;
        }
        long n2 = n2(j2);
        myc0.h(W1(), null, null, new b(null), 3);
        return n2;
    }

    @Override // xsna.q630.c
    public final void a2() {
        i2(this.w);
        myc0.h(W1(), null, null, new a(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l2(ContinuationImpl continuationImpl) {
        ege0 ege0Var;
        int i;
        if (continuationImpl instanceof ege0) {
            ege0Var = (ege0) continuationImpl;
            int i2 = ege0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ege0Var.label = i2 - Integer.MIN_VALUE;
                ege0 ege0Var2 = ege0Var;
                Object obj = ege0Var2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ege0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    kge0 kge0Var = this.u;
                    ege0Var2.label = 1;
                    Object c2 = if2.c(kge0Var.a, new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, null, ege0Var2, 14);
                    if (c2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        c2 = s3q0.a;
                    }
                    if (c2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ((vak0) this.y).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ((vak0) this.x).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        }
        ege0Var = new ege0(this, continuationImpl);
        ege0 ege0Var22 = ege0Var;
        Object obj3 = ege0Var22.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ege0Var22.label;
        if (i != 0) {
        }
        ((vak0) this.y).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ((vak0) this.x).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2(ContinuationImpl continuationImpl) {
        fge0 fge0Var;
        int i;
        if (continuationImpl instanceof fge0) {
            fge0Var = (fge0) continuationImpl;
            int i2 = fge0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fge0Var.label = i2 - Integer.MIN_VALUE;
                fge0 fge0Var2 = fge0Var;
                Object obj = fge0Var2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fge0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    kge0 kge0Var = this.u;
                    fge0Var2.label = 1;
                    Object c2 = if2.c(kge0Var.a, new Float(1.0f), null, null, fge0Var2, 14);
                    if (c2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        c2 = s3q0.a;
                    }
                    if (c2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ((vak0) this.y).g(o2());
                ((vak0) this.x).g(o2());
                return s3q0.a;
            }
        }
        fge0Var = new fge0(this, continuationImpl);
        fge0 fge0Var22 = fge0Var;
        Object obj3 = fge0Var22.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fge0Var22.label;
        if (i != 0) {
        }
        ((vak0) this.y).g(o2());
        ((vak0) this.x).g(o2());
        return s3q0.a;
    }

    public final long n2(long j) {
        float floatValue;
        float o2;
        if (this.r) {
            floatValue = 0.0f;
        } else {
            kg50 kg50Var = this.y;
            vak0 vak0Var = (vak0) kg50Var;
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + vak0Var.getFloatValue();
            if (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                intBitsToFloat = 0.0f;
            }
            floatValue = intBitsToFloat - vak0Var.getFloatValue();
            ((vak0) kg50Var).g(intBitsToFloat);
            if (((vak0) kg50Var).getFloatValue() * 0.5f <= o2()) {
                o2 = ((vak0) kg50Var).getFloatValue() * 0.5f;
            } else {
                float f = swe0.f(Math.abs((((vak0) kg50Var).getFloatValue() * 0.5f) / o2()) - 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f);
                o2 = o2() + (o2() * (f - (((float) Math.pow(f, 2)) / 4)));
            }
            ((vak0) this.x).g(o2);
        }
        return (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }

    public final int o2() {
        return ((azl) ovi.a(this, uvi.h)).r0(this.v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (m2(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (l2(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p2(float f, ContinuationImpl continuationImpl) {
        hge0 hge0Var;
        int i;
        kg50 kg50Var;
        if (continuationImpl instanceof hge0) {
            hge0Var = (hge0) continuationImpl;
            int i2 = hge0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hge0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = hge0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hge0Var.label;
                kg50Var = this.y;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (this.r) {
                        return new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (((vak0) kg50Var).getFloatValue() * 0.5f > o2()) {
                        hge0Var.F$0 = f;
                        hge0Var.label = 1;
                    } else {
                        hge0Var.F$0 = f;
                        hge0Var.label = 2;
                    }
                    return obj2;
                }
                if (i == 1) {
                    f = hge0Var.F$0;
                    kotlin.a.a(obj);
                    this.s.invoke();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = hge0Var.F$0;
                    kotlin.a.a(obj);
                }
                if (((vak0) kg50Var).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 0.0f;
                }
                ((vak0) kg50Var).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return new Float(f);
            }
        }
        hge0Var = new hge0(this, continuationImpl);
        Object obj3 = hge0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hge0Var.label;
        kg50Var = this.y;
        if (i != 0) {
        }
        if (((vak0) kg50Var).getFloatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        f = 0.0f;
        ((vak0) kg50Var).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return new Float(f);
    }
}
