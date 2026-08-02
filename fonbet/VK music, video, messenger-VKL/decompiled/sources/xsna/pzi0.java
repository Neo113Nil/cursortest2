package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SettingAdvanced.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.settingadvanced.SettingAdvancedKt$Chevron$1$1", f = "SettingAdvanced.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class pzi0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ etv0 $tooltipState;
    final /* synthetic */ szi0 $vs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzi0(etv0 etv0Var, szi0 szi0Var, spj<? super pzi0> spjVar) {
        super(2, spjVar);
        this.$tooltipState = etv0Var;
        this.$vs = szi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pzi0(this.$tooltipState, this.$vs, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pzi0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$tooltipState.setVisible(this.$vs.b);
        return s3q0.a;
    }
}
