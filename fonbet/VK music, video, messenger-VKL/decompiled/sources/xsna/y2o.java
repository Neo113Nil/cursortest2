package xsna;

import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DonutSubscriptionDbCache.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.cache.DonutSubscriptionDbCache$getAll$2", f = "DonutSubscriptionDbCache.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class y2o extends SuspendLambda implements wzs<yvj, spj<? super List<? extends CachedSubscription>>, Object> {
    int label;
    final /* synthetic */ a3o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2o(a3o a3oVar, spj<? super y2o> spjVar) {
        super(2, spjVar);
        this.this$0 = a3oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y2o(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends CachedSubscription>> spjVar) {
        return ((y2o) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a3o a3oVar = this.this$0;
            yxm0 yxm0Var = a3oVar.a;
            UserId userId = (UserId) a3oVar.b.invoke();
            this.label = 1;
            obj = yxm0Var.c(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Iterable<py8> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (py8 py8Var : iterable) {
            UserId userId2 = py8Var.b;
            Iterator<E> it = CachedSubscription.Status.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (epx.f(((CachedSubscription.Status) obj2).i(), py8Var.c)) {
                    break;
                }
            }
            CachedSubscription.Status status = (CachedSubscription.Status) obj2;
            if (status == null) {
                status = CachedSubscription.Status.ACTIVE;
            }
            arrayList.add(new CachedSubscription(userId2, status, py8Var.d, py8Var.e));
        }
        ConcurrentHashMap concurrentHashMap = this.this$0.c;
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((CachedSubscription) next).a, next);
        }
        concurrentHashMap.putAll(linkedHashMap);
        return arrayList;
    }
}
