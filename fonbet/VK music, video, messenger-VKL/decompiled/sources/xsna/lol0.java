package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wml0;

/* compiled from: StorefrontServicesScreen.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesScreenKt$showSnackBarIfNeed$1$1", f = "StorefrontServicesScreen.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class lol0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CharSequence $message;
    final /* synthetic */ izs<wml0, s3q0> $onAction;
    final /* synthetic */ dlv0 $snackBarHostState;
    final /* synthetic */ z6k0 $snackState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lol0(dlv0 dlv0Var, CharSequence charSequence, izs izsVar, spj spjVar) {
        super(2, spjVar);
        this.$snackBarHostState = dlv0Var;
        this.$message = charSequence;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lol0(this.$snackBarHostState, this.$message, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lol0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(wml0.f.b);
        }
        return s3q0.a;
    }
}
