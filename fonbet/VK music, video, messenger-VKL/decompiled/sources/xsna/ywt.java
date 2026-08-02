package xsna;

import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.superapp.vksteps.utils.enums.VkStepsUpdateStrategy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsUpdateStrategyUseCase.kt */
/* loaded from: classes11.dex */
public final class ywt {
    public final xmv0 a;

    public ywt(xmv0 xmv0Var) {
        this.a = xmv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(e9q0 e9q0Var, ContinuationImpl continuationImpl) {
        xwt xwtVar;
        int i;
        long d;
        long longValue;
        e9q0 e9q0Var2;
        Object c;
        long j;
        boolean z;
        if (continuationImpl instanceof xwt) {
            xwtVar = (xwt) continuationImpl;
            int i2 = xwtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xwtVar.label = i2 - Integer.MIN_VALUE;
                Object obj = xwtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xwtVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qvo0.a.getClass();
                    d = qvo0.d();
                    Long g = e9q0Var.g();
                    longValue = g != null ? g.longValue() : d;
                    Long b = e9q0Var.b();
                    long longValue2 = b != null ? b.longValue() : System.currentTimeMillis();
                    e9q0Var2 = e9q0Var;
                    xwtVar.L$0 = e9q0Var2;
                    xwtVar.J$0 = d;
                    xwtVar.J$1 = longValue;
                    xwtVar.J$2 = longValue2;
                    xwtVar.label = 1;
                    c = this.a.c(xwtVar);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = longValue2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = xwtVar.J$2;
                    longValue = xwtVar.J$1;
                    d = xwtVar.J$0;
                    e9q0 e9q0Var3 = (e9q0) xwtVar.L$0;
                    kotlin.a.a(obj);
                    c = obj;
                    e9q0Var2 = e9q0Var3;
                }
                boolean booleanValue = ((Boolean) c).booleanValue();
                xgx0 xgx0Var = xgx0.a;
                StringBuilder sb = new StringBuilder("GetVkStepsUpdateStrategyUseCase.execute() -> stepsSyncReason: ");
                sb.append(e9q0Var2.h());
                sb.append(", fromTime: ");
                qvo0 qvo0Var = qvo0.a;
                sb.append(qvo0.k(qvo0Var, longValue));
                sb.append(", toTime: ");
                sb.append(qvo0.k(qvo0Var, j));
                sb.append(", isCacheEmpty: ");
                sb.append(booleanValue);
                String sb2 = sb.toString();
                xgx0Var.getClass();
                xgx0.a(sb2);
                z = (e9q0Var2.g() == null && e9q0Var2.b() != null) || e9q0Var2.h() == VkStepsSyncReason.BRIDGE_EVENT;
                xgx0.a("GetVkStepsUpdateStrategyUseCase isNeedToStartSyncFromEvents -> result: " + z + ", payload: " + e9q0Var2 + "thread: " + Thread.currentThread().getName());
                if (!z) {
                    return VkStepsUpdateStrategy.SYNC_FROM_EVENTS;
                }
                boolean z2 = booleanValue && longValue == d && e9q0Var2.b() == null;
                xgx0.a("GetVkStepsUpdateStrategyUseCase isNeedToStartMonthlySync -> result: " + z2 + ", fromTime: " + qvo0.k(qvo0Var, longValue) + ", monthAgoTime: " + qvo0.k(qvo0Var, d) + ", isCacheEmpty: " + booleanValue + ", payload: " + e9q0Var2 + "thread: " + Thread.currentThread().getName());
                if (z2) {
                    return VkStepsUpdateStrategy.MONTHLY_SYNC;
                }
                boolean z3 = !booleanValue && longValue == d && e9q0Var2.b() == null;
                xgx0.a("GetVkStepsUpdateStrategyUseCase isNeedToStartPartialMonthlySync -> result: " + z3 + ", fromTime: " + qvo0.k(qvo0Var, longValue) + ", monthAgoTime: " + qvo0.k(qvo0Var, d) + ", isCacheEmpty: " + booleanValue + ", payload: " + e9q0Var2 + "thread: " + Thread.currentThread().getName());
                return z3 ? VkStepsUpdateStrategy.PARTIAL_MONTHLY_SYNC : VkStepsUpdateStrategy.UNDEFINED;
            }
        }
        xwtVar = new xwt(this, continuationImpl);
        Object obj2 = xwtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xwtVar.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) c).booleanValue();
        xgx0 xgx0Var2 = xgx0.a;
        StringBuilder sb3 = new StringBuilder("GetVkStepsUpdateStrategyUseCase.execute() -> stepsSyncReason: ");
        sb3.append(e9q0Var2.h());
        sb3.append(", fromTime: ");
        qvo0 qvo0Var2 = qvo0.a;
        sb3.append(qvo0.k(qvo0Var2, longValue));
        sb3.append(", toTime: ");
        sb3.append(qvo0.k(qvo0Var2, j));
        sb3.append(", isCacheEmpty: ");
        sb3.append(booleanValue2);
        String sb22 = sb3.toString();
        xgx0Var2.getClass();
        xgx0.a(sb22);
        if (e9q0Var2.g() == null) {
        }
        xgx0.a("GetVkStepsUpdateStrategyUseCase isNeedToStartSyncFromEvents -> result: " + z + ", payload: " + e9q0Var2 + "thread: " + Thread.currentThread().getName());
        if (!z) {
        }
    }
}
