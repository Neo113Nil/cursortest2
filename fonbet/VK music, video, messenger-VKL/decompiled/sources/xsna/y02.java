package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b12;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {283}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class y02 extends SuspendLambda implements yzs<cz1, sgo<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<pgo, spj<? super s3q0>, Object> $block;
    int label;
    final /* synthetic */ b12 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y02(b12 b12Var, wzs<? super pgo, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super y02> spjVar) {
        super(3, spjVar);
        this.this$0 = b12Var;
        this.$block = wzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(cz1 cz1Var, sgo<Object> sgoVar, spj<? super s3q0> spjVar) {
        return new y02(this.this$0, this.$block, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            b12.a aVar = this.this$0.a;
            wzs<pgo, spj<? super s3q0>, Object> wzsVar = this.$block;
            this.label = 1;
            if (wzsVar.invoke(aVar, this) == coroutineSingletons) {
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
