package xsna;

import com.vk.fullscreenvideo.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FullscreenBottomControls.kt */
@b6l(c = "com.vk.fullscreenvideo.bottom.FullscreenBottomControlsKt$SimilarBlock$2$1", f = "FullscreenBottomControls.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class pxs extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<com.vk.fullscreenvideo.a, s3q0> $onClickAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pxs(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar, spj<? super pxs> spjVar) {
        super(2, spjVar);
        this.$onClickAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pxs(this.$onClickAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pxs) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onClickAction.invoke(a.g.a);
        return s3q0.a;
    }
}
