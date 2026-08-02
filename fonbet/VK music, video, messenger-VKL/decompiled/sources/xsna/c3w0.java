package xsna;

import com.vk.api.generated.vkStart.dto.VkStartGetStatsActivityTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartGetStatsAggregationTypeDto;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkWorkoutWidgetRepository.kt */
/* loaded from: classes11.dex */
public final class c3w0 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        y2w0 y2w0Var;
        int i;
        if (continuationImpl instanceof y2w0) {
            y2w0Var = (y2w0) continuationImpl;
            int i2 = y2w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = y2w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = y2w0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                ovj b = hqu0.b();
                z2w0 z2w0Var = new z2w0();
                y2w0Var.label = 1;
                Object k = myc0.k(b, z2w0Var, y2w0Var);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        y2w0Var = new y2w0(this, continuationImpl);
        Object obj2 = y2w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = y2w0Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto, VkStartGetStatsActivityTypeDto vkStartGetStatsActivityTypeDto, ContinuationImpl continuationImpl) {
        a3w0 a3w0Var;
        int i;
        if (continuationImpl instanceof a3w0) {
            a3w0Var = (a3w0) continuationImpl;
            int i2 = a3w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a3w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = a3w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a3w0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                ovj b = hqu0.b();
                b3w0 b3w0Var = new b3w0(list, vkStartGetStatsAggregationTypeDto, vkStartGetStatsActivityTypeDto, null);
                a3w0Var.L$0 = null;
                a3w0Var.L$1 = null;
                a3w0Var.L$2 = null;
                a3w0Var.label = 1;
                Object k = myc0.k(b, b3w0Var, a3w0Var);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        a3w0Var = new a3w0(this, continuationImpl);
        Object obj2 = a3w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a3w0Var.label;
        if (i == 0) {
        }
    }
}
