package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dbe0;

/* compiled from: Snackbar.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.snackbar.SnackbarKt$Snackbar$1$1", f = "Snackbar.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class n8k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<dbe0.m, s3q0> $onAction;
    final /* synthetic */ dlv0 $snackbarHostState;
    final /* synthetic */ f9k0 $vs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n8k0(f9k0 f9k0Var, dlv0 dlv0Var, izs<? super dbe0.m, s3q0> izsVar, spj<? super n8k0> spjVar) {
        super(2, spjVar);
        this.$vs = f9k0Var;
        this.$snackbarHostState = dlv0Var;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n8k0(this.$vs, this.$snackbarHostState, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n8k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$vs == null) {
                this.$snackbarHostState.a();
                return s3q0.a;
            }
            dlv0 dlv0Var = this.$snackbarHostState;
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
        this.$onAction.invoke(dbe0.m.b);
        return s3q0.a;
    }
}
