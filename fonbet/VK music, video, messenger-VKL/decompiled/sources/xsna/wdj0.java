package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ShimmerModifier.kt */
/* loaded from: classes17.dex */
public final class wdj0 {

    /* compiled from: ShimmerModifier.kt */
    @b6l(c = "com.vk.core.compose.shimmer.ShimmerModifierKt$shimmer$2$1$1", f = "ShimmerModifier.kt", l = {26}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kdj0 $area;
        final /* synthetic */ jdj0 $shimmer;
        int label;

        /* compiled from: ShimmerModifier.kt */
        /* renamed from: xsna.wdj0$a$a, reason: collision with other inner class name */
        public static final class C3928a<T> implements lsr {
            public final /* synthetic */ kdj0 b;

            public C3928a(kdj0 kdj0Var) {
                this.b = kdj0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                zhf0 zhf0Var = (zhf0) obj;
                kdj0 kdj0Var = this.b;
                if (!epx.f(kdj0Var.c, zhf0Var)) {
                    kdj0Var.c = zhf0Var;
                    kdj0Var.a();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jdj0 jdj0Var, kdj0 kdj0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$shimmer = jdj0Var;
            this.$area = kdj0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$shimmer, this.$area, spjVar);
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
                utk0 utk0Var = this.$shimmer.c;
                C3928a c3928a = new C3928a(this.$area);
                this.label = 1;
                if (utk0Var.collect(c3928a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final q630 a(q630 q630Var, jdj0 jdj0Var) {
        return qri.a(q630Var, a5x.a, new lg0(jdj0Var, 2));
    }
}
