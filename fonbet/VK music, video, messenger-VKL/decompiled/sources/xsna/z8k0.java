package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import xsna.q7k0;

/* compiled from: SnackbarScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.SnackbarScreenContent$Content$1$1$1$1", f = "SnackbarScreenContent.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class z8k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ dlv0 $snackbarHostState;
    int label;
    final /* synthetic */ a9k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8k0(dlv0 dlv0Var, a9k0 a9k0Var, spj<? super z8k0> spjVar) {
        super(2, spjVar);
        this.$snackbarHostState = dlv0Var;
        this.this$0 = a9k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new z8k0(this.$snackbarHostState, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((z8k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dlv0 dlv0Var = this.$snackbarHostState;
            StringBuilder sb = new StringBuilder("message");
            Random.b.getClass();
            sb.append(Random.c.j());
            String sb2 = sb.toString();
            q7k0 bVar = ((Boolean) ((zak0) this.this$0.i).getValue()).booleanValue() ? q7k0.a.a : new q7k0.b(4000L);
            this.label = 1;
            if (dlv0.d(dlv0Var, sb2, bVar, this, 28) == coroutineSingletons) {
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
