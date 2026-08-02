package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl;
import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DonutSubscriptionManagerImpl.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$onVideoDownloadStarted$1", f = "DonutSubscriptionManagerImpl.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class d3o extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $owner;
    Object L$0;
    int label;
    final /* synthetic */ DonutSubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3o(DonutSubscriptionManagerImpl donutSubscriptionManagerImpl, UserId userId, spj<? super d3o> spjVar) {
        super(2, spjVar);
        this.this$0 = donutSubscriptionManagerImpl;
        this.$owner = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d3o(this.this$0, this.$owner, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d3o) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl.a(r5, r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a3o a3oVar = this.this$0.a;
            UserId userId = this.$owner;
            this.label = 1;
            obj = a3oVar.b(userId, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        if (((CachedSubscription) obj) == null) {
            DonutSubscriptionManagerImpl donutSubscriptionManagerImpl = this.this$0;
            UserId userId2 = this.$owner;
            this.L$0 = null;
            this.label = 2;
        }
        return s3q0.a;
    }
}
