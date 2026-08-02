package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SwipeableV2.kt */
@b6l(c = "com.vk.core.compose.utils.swipable.SwipeableV2Kt$swipeableV2$1", f = "SwipeableV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class umn0 extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ ymn0<Object> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: SwipeableV2.kt */
    @b6l(c = "com.vk.core.compose.utils.swipable.SwipeableV2Kt$swipeableV2$1$1", f = "SwipeableV2.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ ymn0<Object> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ymn0<Object> ymn0Var, float f, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = ymn0Var;
            this.$velocity = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, this.$velocity, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ymn0<Object> ymn0Var = this.$state;
                float f = this.$velocity;
                this.label = 1;
                Object value = ((zak0) ymn0Var.e).getValue();
                Object b = ymn0Var.b(ymn0Var.d(), f, value);
                if (ymn0Var.b.invoke(b).booleanValue()) {
                    a = ymn0Var.a(b, f, this);
                    if (a != obj2) {
                        a = s3q0.a;
                    }
                } else {
                    a = ymn0Var.a(value, f, this);
                    if (a != obj2) {
                        a = s3q0.a;
                    }
                }
                if (a == obj2) {
                    return obj2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umn0(ymn0<Object> ymn0Var, spj<? super umn0> spjVar) {
        super(3, spjVar);
        this.$state = ymn0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        float floatValue = f.floatValue();
        umn0 umn0Var = new umn0(this.$state, spjVar);
        umn0Var.L$0 = yvjVar;
        umn0Var.F$0 = floatValue;
        return umn0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h((yvj) this.L$0, null, null, new a(this.$state, this.F$0, null), 3);
        return s3q0.a;
    }
}
