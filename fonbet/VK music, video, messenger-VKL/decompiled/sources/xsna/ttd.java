package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftSyncCoordinatorImpl.kt */
@b6l(c = "com.vk.camera.clips.drafts.sync.impl.ClipsDraftSyncCoordinatorImpl$addToDrafts$1", f = "ClipsDraftSyncCoordinatorImpl.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class ttd extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<Boolean, s3q0> $callback;
    final /* synthetic */ ClipsDraftVk $draft;
    int label;
    final /* synthetic */ ytd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ttd(ytd ytdVar, ClipsDraftVk clipsDraftVk, izs<? super Boolean, s3q0> izsVar, spj<? super ttd> spjVar) {
        super(2, spjVar);
        this.this$0 = ytdVar;
        this.$draft = clipsDraftVk;
        this.$callback = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ttd(this.this$0, this.$draft, this.$callback, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ttd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ytd ytdVar = this.this$0;
            ClipsDraftVk clipsDraftVk = this.$draft;
            this.label = 1;
            obj = ytd.e(ytdVar, clipsDraftVk, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.$callback.invoke(bool);
        return s3q0.a;
    }
}
