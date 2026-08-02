package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalPageScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.ModalPageScreenContent$Content$hideComposeModalPage$1$1$1", f = "ModalPageScreenContent.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class m030 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ fdj0 $composeModalPageState;
    final /* synthetic */ wh50<Boolean> $showComposeModalPage$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m030(fdj0 fdj0Var, wh50<Boolean> wh50Var, spj<? super m030> spjVar) {
        super(2, spjVar);
        this.$composeModalPageState = fdj0Var;
        this.$showComposeModalPage$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new m030(this.$composeModalPageState, this.$showComposeModalPage$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((m030) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fdj0 fdj0Var = this.$composeModalPageState;
            this.label = 1;
            if (fdj0Var.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$showComposeModalPage$delegate.setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
