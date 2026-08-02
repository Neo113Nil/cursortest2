package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dbe0;

/* compiled from: Loaded.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.LoadedKt$Loaded$1$1", f = "Loaded.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class arz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isAdvancedItemCompletelyVisible;
    final /* synthetic */ izs<dbe0, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arz(spj spjVar, izs izsVar, boolean z) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$isAdvancedItemCompletelyVisible = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new arz(spjVar, this.$onAction, this.$isAdvancedItemCompletelyVisible);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((arz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onAction.invoke(new dbe0.a.c(this.$isAdvancedItemCompletelyVisible));
        return s3q0.a;
    }
}
