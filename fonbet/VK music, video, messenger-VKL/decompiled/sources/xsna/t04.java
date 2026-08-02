package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AtomicJob.kt */
@b6l(c = "com.vk.geo.impl.util.atomic.AtomicJobKt$cancelAndRelaunch$1$1", f = "AtomicJob.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t04 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $launchBlock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t04(wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super t04> spjVar) {
        super(2, spjVar);
        this.$launchBlock = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        t04 t04Var = new t04(this.$launchBlock, spjVar);
        t04Var.L$0 = obj;
        return t04Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((t04) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wzs<yvj, spj<? super s3q0>, Object> wzsVar = this.$launchBlock;
            this.L$0 = null;
            this.label = 1;
            if (wzsVar.invoke(yvjVar, this) == coroutineSingletons) {
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
