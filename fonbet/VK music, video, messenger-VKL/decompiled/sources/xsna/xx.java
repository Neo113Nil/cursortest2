package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ActionButtonsEntryPointCell.kt */
@b6l(c = "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ActionButtonsEntryPointCellKt$getLeftContent$1$1$1", f = "ActionButtonsEntryPointCell.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class xx extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yc8 $bringIntoViewRequester;
    final /* synthetic */ etv0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(yc8 yc8Var, etv0 etv0Var, spj<? super xx> spjVar) {
        super(2, spjVar);
        this.$bringIntoViewRequester = yc8Var;
        this.$state = etv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xx(this.$bringIntoViewRequester, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xx) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yc8 yc8Var = this.$bringIntoViewRequester;
            this.label = 1;
            if (yc8Var.a(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$state.setVisible(true);
        return s3q0.a;
    }
}
