package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Wrapper.android.kt */
@b6l(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$2$2$1", f = "Wrapper.android.kt", l = {128}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class pzx0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ rzx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzx0(rzx0 rzx0Var, spj<? super pzx0> spjVar) {
        super(2, spjVar);
        this.this$0 = rzx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pzx0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pzx0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            p52 p52Var = this.this$0.b;
            this.label = 1;
            Object a = p52Var.B.a(this);
            if (a != coroutineSingletons) {
                a = s3q0.a;
            }
            if (a == coroutineSingletons) {
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
