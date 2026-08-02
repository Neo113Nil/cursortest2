package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.lze;

/* compiled from: ClipPlayer.kt */
@b6l(c = "com.vk.clips.upload.vk.impl.preview.compose.ClipPlayerKt$subscribeToPlaybackProgress$1", f = "ClipPlayer.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class m9d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<lze, s3q0> $onAction;
    final /* synthetic */ cv10 $playbackController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m9d(izs<? super lze, s3q0> izsVar, cv10 cv10Var, spj<? super m9d> spjVar) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$playbackController = cv10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new m9d(this.$onAction, this.$playbackController, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((m9d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        do {
            this.$onAction.invoke(new lze.i(this.$playbackController.a().getCurrentPosition()));
            this.label = 1;
        } while (qsl.b(40L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
