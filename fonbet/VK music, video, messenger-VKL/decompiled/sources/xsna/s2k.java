package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.chs;

/* compiled from: CoverImage.kt */
@b6l(c = "com.vk.video.ui.upload.impl.common.presentation.compose.coverimage.CoverImageKt$CoverFrescoImage$1$1", f = "CoverImage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class s2k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ chs $curState;
    final /* synthetic */ gzs<s3q0> $onLoadError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2k(chs chsVar, gzs<s3q0> gzsVar, spj<? super s2k> spjVar) {
        super(2, spjVar);
        this.$curState = chsVar;
        this.$onLoadError = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new s2k(this.$curState, this.$onLoadError, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s2k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$curState instanceof chs.b) {
            this.$onLoadError.invoke();
        }
        return s3q0.a;
    }
}
