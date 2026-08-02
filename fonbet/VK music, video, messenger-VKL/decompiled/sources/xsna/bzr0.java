package xsna;

import com.vk.api.generated.video.dto.VideoGetUserInfoResponseDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoAdFreeSubscriptionRepositoryImpl.kt */
@b6l(c = "com.vk.libvideo.adfree.impl.data.VideoAdFreeSubscriptionRepositoryImpl$getSubscriptionState$2$userInfo$1", f = "VideoAdFreeSubscriptionRepositoryImpl.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class bzr0 extends SuspendLambda implements wzs<yvj, spj<? super VideoGetUserInfoResponseDto>, Object> {
    int label;
    final /* synthetic */ czr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzr0(czr0 czr0Var, spj<? super bzr0> spjVar) {
        super(2, spjVar);
        this.this$0 = czr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bzr0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super VideoGetUserInfoResponseDto> spjVar) {
        return ((bzr0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        this.this$0.a.getClass();
        iz2 A = yfb.A(new tfx("video.getUserInfo", new x6t0(2), new hun0(4)));
        this.label = 1;
        Object p = evj.p(A, this);
        return p == coroutineSingletons ? coroutineSingletons : p;
    }
}
