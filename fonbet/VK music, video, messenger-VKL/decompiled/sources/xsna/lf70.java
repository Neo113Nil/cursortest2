package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.vzi0;

/* compiled from: NotificationSettingView.kt */
@b6l(c = "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView$ContentSurface$3$1", f = "NotificationSettingView.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class lf70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<izs<vzi0, s3q0>> $rememberedOnSideEffect$delegate;
    final /* synthetic */ mtk0<vzi0> $settingChangeSpinnerState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lf70(mtk0<? extends vzi0> mtk0Var, mtk0<? extends izs<? super vzi0, s3q0>> mtk0Var2, spj<? super lf70> spjVar) {
        super(2, spjVar);
        this.$settingChangeSpinnerState$delegate = mtk0Var;
        this.$rememberedOnSideEffect$delegate = mtk0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lf70(this.$settingChangeSpinnerState$delegate, this.$rememberedOnSideEffect$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lf70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$settingChangeSpinnerState$delegate.getValue().a()) {
                this.label = 1;
                if (qsl.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$rememberedOnSideEffect$delegate.getValue().invoke(vzi0.b.a);
        return s3q0.a;
    }
}
