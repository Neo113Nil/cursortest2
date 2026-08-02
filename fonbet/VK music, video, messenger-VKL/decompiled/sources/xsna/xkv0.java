package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkSnackbarHost.kt */
@b6l(c = "com.vk.core.compose.snackbar.VkSnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1", f = "VkSnackbarHost.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class xkv0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ l7k0 $data;
    final /* synthetic */ riq<l7k0> $state;
    final /* synthetic */ bi50<Boolean> $visibilityState;
    int label;

    /* compiled from: VkSnackbarHost.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ l7k0 b;
        public final /* synthetic */ riq<l7k0> c;

        public a(l7k0 l7k0Var, riq<l7k0> riqVar) {
            this.b = l7k0Var;
            this.c = riqVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            ((Boolean) obj).getClass();
            riq<l7k0> riqVar = this.c;
            Object obj2 = riqVar.a;
            l7k0 l7k0Var = this.b;
            if (!epx.f(l7k0Var, obj2)) {
                g5g.D(riqVar.b, true, new b8e0(l7k0Var, 27));
                vef0 vef0Var = riqVar.c;
                if (vef0Var != null) {
                    vef0Var.invalidate();
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkv0(bi50<Boolean> bi50Var, l7k0 l7k0Var, riq<l7k0> riqVar, spj<? super xkv0> spjVar) {
        super(2, spjVar);
        this.$visibilityState = bi50Var;
        this.$data = l7k0Var;
        this.$state = riqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xkv0(this.$visibilityState, this.$data, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xkv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new pyr0(this.$visibilityState, 16));
            a aVar = new a(this.$data, this.$state);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
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
