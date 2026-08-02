package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LikeButton.kt */
@b6l(c = "com.vk.fullscreenvideo.icons.LikeButtonKt$LikeButton$2$1", f = "LikeButton.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class j6z extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $isFirstComposition$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6z(wh50<Boolean> wh50Var, spj<? super j6z> spjVar) {
        super(2, spjVar);
        this.$isFirstComposition$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j6z(this.$isFirstComposition$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j6z) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$isFirstComposition$delegate.setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
