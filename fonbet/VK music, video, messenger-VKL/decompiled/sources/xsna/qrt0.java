package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.jrt0;

/* compiled from: VideoViewerInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.presentation.feature.store.VideoViewerInlineActor$handleSeek$1", f = "VideoViewerInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class qrt0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ jrt0.f $action;
    int label;
    final /* synthetic */ urt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrt0(urt0 urt0Var, jrt0.f fVar, spj<? super qrt0> spjVar) {
        super(1, spjVar);
        this.this$0 = urt0Var;
        this.$action = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new qrt0(this.this$0, this.$action, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((qrt0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        rdi.y(this.this$0, new qzl0(this.$action, 14));
        return s3q0.a;
    }
}
