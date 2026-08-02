package xsna;

import com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl;
import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import com.vk.dto.common.id.UserId;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DonutSubscriptionManagerImpl.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$canShowDonutVideo$1", f = "DonutSubscriptionManagerImpl.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class c3o extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    final /* synthetic */ UserId $owner;
    int label;
    final /* synthetic */ DonutSubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3o(DonutSubscriptionManagerImpl donutSubscriptionManagerImpl, UserId userId, spj<? super c3o> spjVar) {
        super(2, spjVar);
        this.this$0 = donutSubscriptionManagerImpl;
        this.$owner = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c3o(this.this$0, this.$owner, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((c3o) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a3o a3oVar = this.this$0.a;
            UserId userId = this.$owner;
            this.label = 1;
            obj = a3oVar.b(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        CachedSubscription cachedSubscription = (CachedSubscription) obj;
        if (cachedSubscription == null) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(cachedSubscription.c > qni0.b() - 259200);
    }
}
