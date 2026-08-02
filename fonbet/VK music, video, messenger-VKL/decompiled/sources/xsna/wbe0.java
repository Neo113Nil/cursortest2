package xsna;

import android.net.Uri;
import com.vk.media.MediaUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishFileStorageImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.file.PublishFileStorageImpl$getMediaConfig$2", f = "PublishFileStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class wbe0 extends SuspendLambda implements wzs<yvj, spj<? super MediaUtils.f>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ zbe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbe0(zbe0 zbe0Var, Uri uri, spj<? super wbe0> spjVar) {
        super(2, spjVar);
        this.this$0 = zbe0Var;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wbe0(this.this$0, this.$uri, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super MediaUtils.f> spjVar) {
        return ((wbe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return MediaUtils.a.c(this.this$0.a, this.$uri, false);
    }
}
