package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsPlaylistsFolderNamingContent.kt */
@b6l(c = "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingContentKt$InputTextField$5$1", f = "ClipsPlaylistsFolderNamingContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class use extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ qc8 $inputRelocator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public use(qc8 qc8Var, spj<? super use> spjVar) {
        super(2, spjVar);
        this.$inputRelocator = qc8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new use(this.$inputRelocator, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((use) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$inputRelocator.a();
        return s3q0.a;
    }
}
