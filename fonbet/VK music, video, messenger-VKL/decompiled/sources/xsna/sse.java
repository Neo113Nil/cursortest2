package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsPlaylistsFolderNamingContent.kt */
@b6l(c = "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingContentKt$ClipsPlaylistsFolderNamingContent$2$1", f = "ClipsPlaylistsFolderNamingContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class sse extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rwr $focusRequester;
    final /* synthetic */ boolean $textAvailable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sse(boolean z, rwr rwrVar, spj<? super sse> spjVar) {
        super(2, spjVar);
        this.$textAvailable = z;
        this.$focusRequester = rwrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sse(this.$textAvailable, this.$focusRequester, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sse) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$textAvailable) {
            rwr.b(this.$focusRequester);
        }
        return s3q0.a;
    }
}
