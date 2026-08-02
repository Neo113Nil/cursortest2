package xsna;

import androidx.compose.foundation.MutatePriority;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ScrollableState.kt */
/* loaded from: classes11.dex */
public final class bml implements khh0 {
    public final izs<Float, Float> a;
    public final b b = new b();
    public final ni50 c = new ni50();
    public final wh50<Boolean> d;
    public final wh50<Boolean> e;
    public final wh50<Boolean> f;

    /* compiled from: ScrollableState.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wzs<ggh0, spj<? super s3q0>, Object> $block;
        final /* synthetic */ MutatePriority $scrollPriority;
        int label;

        /* compiled from: ScrollableState.kt */
        @b6l(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {211}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.bml$a$a, reason: collision with other inner class name */
        public static final class C2615a extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
            final /* synthetic */ wzs<ggh0, spj<? super s3q0>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ bml this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2615a(bml bmlVar, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super C2615a> spjVar) {
                super(2, spjVar);
                this.this$0 = bmlVar;
                this.$block = wzsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C2615a c2615a = new C2615a(this.this$0, this.$block, spjVar);
                c2615a.L$0 = obj;
                return c2615a;
            }

            @Override // xsna.wzs
            public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
                return ((C2615a) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.a.a(obj);
                        ggh0 ggh0Var = (ggh0) this.L$0;
                        ((zak0) this.this$0.d).setValue(Boolean.TRUE);
                        wzs<ggh0, spj<? super s3q0>, Object> wzsVar = this.$block;
                        this.label = 1;
                        if (wzsVar.invoke(ggh0Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    ((zak0) this.this$0.d).setValue(Boolean.FALSE);
                    return s3q0.a;
                } catch (Throwable th) {
                    ((zak0) this.this$0.d).setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$scrollPriority = mutatePriority;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return bml.this.new a(this.$scrollPriority, this.$block, spjVar);
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
                bml bmlVar = bml.this;
                ni50 ni50Var = bmlVar.c;
                b bVar = bmlVar.b;
                MutatePriority mutatePriority = this.$scrollPriority;
                C2615a c2615a = new C2615a(bmlVar, this.$block, null);
                this.label = 1;
                if (ni50Var.c(bVar, mutatePriority, c2615a, this) == coroutineSingletons) {
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

    /* compiled from: ScrollableState.kt */
    public static final class b implements ggh0 {
        public b() {
        }

        @Override // xsna.ggh0
        public final float f(float f) {
            if (Float.isNaN(f)) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            bml bmlVar = bml.this;
            float floatValue = bmlVar.a.invoke(Float.valueOf(f)).floatValue();
            ((zak0) bmlVar.e).setValue(Boolean.valueOf(floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            ((zak0) bmlVar.f).setValue(Boolean.valueOf(floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            return floatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bml(izs<? super Float, Float> izsVar) {
        this.a = izsVar;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.k.b(bool);
        this.e = androidx.compose.runtime.k.b(bool);
        this.f = androidx.compose.runtime.k.b(bool);
    }

    @Override // xsna.khh0
    public final boolean a() {
        return ((Boolean) ((zak0) this.d).getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final Object b(MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(mutatePriority, wzsVar, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.a.invoke(Float.valueOf(f)).floatValue();
    }
}
