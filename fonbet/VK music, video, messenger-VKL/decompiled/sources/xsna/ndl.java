package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.odl;

/* compiled from: Draggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {1088}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ndl extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<pgo, spj<? super s3q0>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ odl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ndl(odl odlVar, MutatePriority mutatePriority, wzs<? super pgo, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super ndl> spjVar) {
        super(2, spjVar);
        this.this$0 = odlVar;
        this.$dragPriority = mutatePriority;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ndl(this.this$0, this.$dragPriority, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ndl) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            odl odlVar = this.this$0;
            ni50 ni50Var = odlVar.c;
            odl.a aVar = odlVar.b;
            MutatePriority mutatePriority = this.$dragPriority;
            wzs<pgo, spj<? super s3q0>, Object> wzsVar = this.$block;
            this.label = 1;
            if (ni50Var.c(aVar, mutatePriority, wzsVar, this) == coroutineSingletons) {
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
