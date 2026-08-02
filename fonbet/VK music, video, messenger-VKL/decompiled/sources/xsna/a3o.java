package xsna;

import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DonutSubscriptionDbCache.kt */
/* loaded from: classes.dex */
public final class a3o {
    public final yxm0 a;
    public final hy6 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public a3o(yxm0 yxm0Var, hy6 hy6Var) {
        this.a = yxm0Var;
        this.b = hy6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        w2o w2oVar;
        int i;
        if (continuationImpl instanceof w2o) {
            w2oVar = (w2o) continuationImpl;
            int i2 = w2oVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2oVar.label = i2 - Integer.MIN_VALUE;
                Object obj = w2oVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w2oVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w2oVar.label = 1;
                    if (this.a.b(w2oVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.c.clear();
                return s3q0.a;
            }
        }
        w2oVar = new w2o(this, continuationImpl);
        Object obj2 = w2oVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w2oVar.label;
        if (i != 0) {
        }
        this.c.clear();
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(UserId userId, ContinuationImpl continuationImpl) {
        x2o x2oVar;
        int i;
        if (continuationImpl instanceof x2o) {
            x2oVar = (x2o) continuationImpl;
            int i2 = x2oVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2oVar.label = i2 - Integer.MIN_VALUE;
                Object obj = x2oVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = x2oVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ConcurrentHashMap concurrentHashMap = this.c;
                    if (!concurrentHashMap.isEmpty()) {
                        return concurrentHashMap.get(userId);
                    }
                    x2oVar.L$0 = userId;
                    x2oVar.label = 1;
                    obj = c(x2oVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userId = (UserId) x2oVar.L$0;
                    kotlin.a.a(obj);
                }
                for (Object obj3 : (Iterable) obj) {
                    if (epx.f(((CachedSubscription) obj3).b(), userId)) {
                        return obj3;
                    }
                }
                return null;
            }
        }
        x2oVar = new x2o(this, continuationImpl);
        Object obj4 = x2oVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = x2oVar.label;
        if (i != 0) {
        }
        while (r6.hasNext()) {
        }
        return null;
    }

    public final Object c(ContinuationImpl continuationImpl) {
        return myc0.k(hqu0.b(), new y2o(this, null), continuationImpl);
    }
}
