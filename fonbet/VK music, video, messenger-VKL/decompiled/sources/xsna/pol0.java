package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorefrontServicesTopBar.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$StorefrontServicesTopBar$11$1", f = "StorefrontServicesTopBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class pol0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vvr $focusManager;
    final /* synthetic */ wh50<Boolean> $isFocused$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pol0(vvr vvrVar, wh50<Boolean> wh50Var, spj<? super pol0> spjVar) {
        super(2, spjVar);
        this.$focusManager = vvrVar;
        this.$isFocused$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pol0(this.$focusManager, this.$isFocused$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pol0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!this.$isFocused$delegate.getValue().booleanValue()) {
            this.$focusManager.y(false);
        }
        return s3q0.a;
    }
}
