package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StoryViewBestFriendsModal.kt */
@b6l(c = "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal$Builder$HandleCloseLogic$1$1", f = "StoryViewBestFriendsModal.kt", l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class blm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<s3q0> $onCloseComplete;
    final /* synthetic */ boolean $shouldClose;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blm0(boolean z, gzs<s3q0> gzsVar, spj<? super blm0> spjVar) {
        super(2, spjVar);
        this.$shouldClose = z;
        this.$onCloseComplete = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new blm0(this.$shouldClose, this.$onCloseComplete, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((blm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$shouldClose) {
                this.label = 1;
                if (qsl.b(200L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onCloseComplete.invoke();
        return s3q0.a;
    }
}
