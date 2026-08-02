package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LazyLayoutItemAnimation.kt */
/* loaded from: classes11.dex */
public final class wsy {
    public static final long s;
    public static final /* synthetic */ int t = 0;
    public final yvj a;
    public final kdu b;
    public final cty c;
    public phr<Float> d;
    public phr<h9x> e;
    public phr<Float> f;
    public boolean g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public long l;
    public long m;
    public mdu n;
    public final if2<h9x, tq2> o;
    public final if2<Float, sq2> p;
    public final wh50 q;
    public long r;

    /* compiled from: LazyLayoutItemAnimation.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wsy.this.new a(spjVar);
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
                if2<Float, sq2> if2Var = wsy.this.p;
                Float f = new Float(1.0f);
                this.label = 1;
                if (if2Var.e(f, this) == coroutineSingletons) {
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

    /* compiled from: LazyLayoutItemAnimation.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mdu $layer;
        final /* synthetic */ boolean $shouldResetValue;
        final /* synthetic */ phr<Float> $spec;
        int label;
        final /* synthetic */ wsy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, wsy wsyVar, phr<Float> phrVar, mdu mduVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$shouldResetValue = z;
            this.this$0 = wsyVar;
            this.$spec = phrVar;
            this.$layer = mduVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r11 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            b bVar;
            if2<Float, sq2> if2Var;
            Float f;
            phr<Float> phrVar;
            m9 m9Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
            }
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    try {
                        if (this.$shouldResetValue) {
                            if2<Float, sq2> if2Var2 = this.this$0.p;
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.label = 1;
                            if (if2Var2.e(f2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = this;
                        th = th;
                        wsy wsyVar = bVar.this$0;
                        int i2 = wsy.t;
                        wsyVar.e(false);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        bVar = this;
                        wsy wsyVar2 = bVar.this$0;
                        int i3 = wsy.t;
                        wsyVar2.e(false);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                }
                obj = if2.c(if2Var, f, phrVar, m9Var, bVar, 4);
            } catch (Throwable th4) {
                th = th4;
                th = th;
                wsy wsyVar3 = bVar.this$0;
                int i22 = wsy.t;
                wsyVar3.e(false);
                throw th;
            }
            if2Var = this.this$0.p;
            f = new Float(1.0f);
            phrVar = this.$spec;
            m9Var = new m9(21, this.$layer, this.this$0);
            this.label = 2;
            bVar = this;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE}, m = "invokeSuspend", v = 1)
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wsy.this.new c(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<h9x, tq2> if2Var = wsy.this.o;
                h9x h9xVar = new h9x(0L);
                this.label = 1;
                if (if2Var.e(h9xVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            wsy wsyVar = wsy.this;
            int i2 = wsy.t;
            wsyVar.h(0L);
            wsy.this.g(false);
            return s3q0.a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invokeSuspend", v = 1)
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public d(spj<? super d> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wsy.this.new d(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<h9x, tq2> if2Var = wsy.this.o;
                this.label = 1;
                if (if2Var.f(this) == coroutineSingletons) {
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

    /* compiled from: LazyLayoutItemAnimation.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "invokeSuspend", v = 1)
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public e(spj<? super e> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wsy.this.new e(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Float, sq2> if2Var = wsy.this.p;
                this.label = 1;
                if (if2Var.f(this) == coroutineSingletons) {
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

    /* compiled from: LazyLayoutItemAnimation.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend", v = 1)
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public f(spj<? super f> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wsy.this.new f(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Float, sq2> if2Var = wsy.this.p;
                this.label = 1;
                if (if2Var.f(this) == coroutineSingletons) {
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

    static {
        long j = Integer.MAX_VALUE;
        s = (j & 4294967295L) | (j << 32);
    }

    public wsy(yvj yvjVar, kdu kduVar, cty ctyVar) {
        this.a = yvjVar;
        this.b = kduVar;
        this.c = ctyVar;
        Boolean bool = Boolean.FALSE;
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = androidx.compose.runtime.k.b(bool);
        this.j = androidx.compose.runtime.k.b(bool);
        this.k = androidx.compose.runtime.k.b(bool);
        long j = s;
        this.l = j;
        this.m = 0L;
        Object obj = null;
        this.n = kduVar != null ? kduVar.a() : null;
        int i = 12;
        this.o = new if2<>(new h9x(0L), rte0.k, obj, i);
        this.p = new if2<>(Float.valueOf(1.0f), rte0.e, obj, i);
        this.q = androidx.compose.runtime.k.b(new h9x(0L));
        this.r = j;
    }

    public final void a() {
        mdu mduVar = this.n;
        phr<Float> phrVar = this.d;
        boolean booleanValue = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
        yvj yvjVar = this.a;
        if (booleanValue || phrVar == null || mduVar == null) {
            if (c()) {
                if (mduVar != null) {
                    mduVar.f(1.0f);
                }
                myc0.h(yvjVar, null, null, new a(null), 3);
                return;
            }
            return;
        }
        e(true);
        boolean c2 = c();
        boolean z = !c2;
        if (!c2) {
            mduVar.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        myc0.h(yvjVar, null, null, new b(z, this, phrVar, mduVar, null), 3);
    }

    public final void b() {
        if (((Boolean) ((zak0) this.h).getValue()).booleanValue()) {
            myc0.h(this.a, null, null, new c(null), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) ((zak0) this.j).getValue()).booleanValue();
    }

    public final void d() {
        kdu kduVar;
        boolean booleanValue = ((Boolean) ((zak0) this.h).getValue()).booleanValue();
        yvj yvjVar = this.a;
        if (booleanValue) {
            g(false);
            myc0.h(yvjVar, null, null, new d(null), 3);
        }
        if (((Boolean) ((zak0) this.i).getValue()).booleanValue()) {
            e(false);
            myc0.h(yvjVar, null, null, new e(null), 3);
        }
        if (c()) {
            f(false);
            myc0.h(yvjVar, null, null, new f(null), 3);
        }
        this.g = false;
        h(0L);
        this.l = s;
        mdu mduVar = this.n;
        if (mduVar != null && (kduVar = this.b) != null) {
            kduVar.b(mduVar);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void e(boolean z) {
        ((zak0) this.i).setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        ((zak0) this.j).setValue(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        ((zak0) this.h).setValue(Boolean.valueOf(z));
    }

    public final void h(long j) {
        ((zak0) this.q).setValue(new h9x(j));
    }
}
