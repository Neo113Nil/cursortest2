package xsna;

import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DonutSubscriptionDbCache.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.cache.DonutSubscriptionDbCache$put$2", f = "DonutSubscriptionDbCache.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class z2o extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $owner;
    final /* synthetic */ CachedSubscription $subscription;
    int label;
    final /* synthetic */ a3o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2o(a3o a3oVar, UserId userId, CachedSubscription cachedSubscription, spj<? super z2o> spjVar) {
        super(2, spjVar);
        this.this$0 = a3oVar;
        this.$owner = userId;
        this.$subscription = cachedSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new z2o(this.this$0, this.$owner, this.$subscription, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((z2o) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.c.put(this.$owner, this.$subscription);
            a3o a3oVar = this.this$0;
            yxm0 yxm0Var = a3oVar.a;
            CachedSubscription cachedSubscription = this.$subscription;
            py8 py8Var = new py8((UserId) a3oVar.b.invoke(), cachedSubscription.a, cachedSubscription.b.i(), cachedSubscription.c, cachedSubscription.d);
            this.label = 1;
            if (yxm0Var.a(py8Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
