package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.hjl0;

/* compiled from: StorefrontScreen.kt */
@b6l(c = "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreenKt$showSnackBarIfNeed$1$1", f = "StorefrontScreen.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class vml0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CharSequence $message;
    final /* synthetic */ izs<hjl0, s3q0> $onAction;
    final /* synthetic */ dlv0 $snackBarHostState;
    final /* synthetic */ a7k0 $snackState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vml0(a7k0 a7k0Var, dlv0 dlv0Var, CharSequence charSequence, izs<? super hjl0, s3q0> izsVar, spj<? super vml0> spjVar) {
        super(2, spjVar);
        this.$snackState = a7k0Var;
        this.$snackBarHostState = dlv0Var;
        this.$message = charSequence;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vml0(this.$snackState, this.$snackBarHostState, this.$message, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vml0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$snackState != null) {
                dlv0 dlv0Var = this.$snackBarHostState;
                CharSequence charSequence = this.$message;
                String obj2 = charSequence != null ? charSequence.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                this.label = 1;
                if (dlv0.d(dlv0Var, obj2, null, this, 30) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onAction.invoke(hjl0.f.b);
        return s3q0.a;
    }
}
