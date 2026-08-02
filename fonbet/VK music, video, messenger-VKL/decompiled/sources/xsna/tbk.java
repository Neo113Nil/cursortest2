package xsna;

import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cck;

/* compiled from: CreationOnBoardingTasksScreen.kt */
@b6l(c = "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.CreationOnBoardingTasksScreenKt$LinkCopySnackbar$2$1", f = "CreationOnBoardingTasksScreen.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class tbk extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<cck, s3q0> $onAction;
    final /* synthetic */ SnackBar $snackBar;
    final /* synthetic */ dlv0 $snackbarState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tbk(SnackBar snackBar, dlv0 dlv0Var, izs<? super cck, s3q0> izsVar, spj<? super tbk> spjVar) {
        super(2, spjVar);
        this.$snackBar = snackBar;
        this.$snackbarState = dlv0Var;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tbk(this.$snackBar, this.$snackbarState, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tbk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$snackBar == null) {
                this.$snackbarState.a();
                return s3q0.a;
            }
            dlv0 dlv0Var = this.$snackbarState;
            this.label = 1;
            if (dlv0.d(dlv0Var, "", null, this, 30) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$onAction.invoke(cck.f.b);
        return s3q0.a;
    }
}
