package xsna;

import android.content.Context;
import com.vk.api.generated.vkStart.dto.VkStartGetStatsActivityTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartGetStatsAggregationTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartStatsListItemDto;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkworkout.widget.api.VkWorkoutSmallWidgetUiState;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkWorkoutWidgetStatsUseCase.kt */
/* loaded from: classes11.dex */
public final class bxt {
    public final ayu0 a;
    public final c3w0 b;

    public bxt(ayu0 ayu0Var, c3w0 c3w0Var) {
        this.a = ayu0Var;
        this.b = c3w0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004a, code lost:
    
        if (b(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        zwt zwtVar;
        int i;
        if (continuationImpl instanceof zwt) {
            zwtVar = (zwt) continuationImpl;
            int i2 = zwtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zwtVar.label = i2 - Integer.MIN_VALUE;
                Object obj = zwtVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zwtVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zwtVar.L$0 = null;
                    zwtVar.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        List list = (List) obj;
                        Iterator it = list.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            Integer d = ((VkStartStatsListItemDto) it.next()).d();
                            i3 += d != null ? d.intValue() : 0;
                        }
                        Iterator it2 = list.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            Integer e = ((VkStartStatsListItemDto) it2.next()).e();
                            i4 += e != null ? e.intValue() : 0;
                        }
                        return new VkWorkoutSmallWidgetUiState(i3, i4, i4 == 0 ? VkWorkoutSmallWidgetUiState.State.UNKNOWN : VkWorkoutSmallWidgetUiState.State.COMMON);
                    }
                    kotlin.a.a(obj);
                }
                long currentTimeMillis = System.currentTimeMillis();
                qvo0 qvo0Var = qvo0.a;
                qvo0Var.getClass();
                List l = e43.l(qvo0.j(qvo0Var, qvo0.f(currentTimeMillis)), qvo0.j(qvo0Var, qvo0.c(currentTimeMillis)));
                xgx0.a.getClass();
                xgx0.a("GetVkWorkoutWidgetStatsUseCase.getTimeRange() ->\nresult: " + l);
                VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto = VkStartGetStatsAggregationTypeDto.DAY;
                VkStartGetStatsActivityTypeDto vkStartGetStatsActivityTypeDto = VkStartGetStatsActivityTypeDto.RUNNING;
                zwtVar.L$0 = null;
                zwtVar.label = 2;
                obj = this.b.b(l, vkStartGetStatsAggregationTypeDto, vkStartGetStatsActivityTypeDto, zwtVar);
            }
        }
        zwtVar = new zwt(this, continuationImpl);
        Object obj3 = zwtVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zwtVar.label;
        if (i != 0) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        qvo0 qvo0Var2 = qvo0.a;
        qvo0Var2.getClass();
        List l2 = e43.l(qvo0.j(qvo0Var2, qvo0.f(currentTimeMillis2)), qvo0.j(qvo0Var2, qvo0.c(currentTimeMillis2)));
        xgx0.a.getClass();
        xgx0.a("GetVkWorkoutWidgetStatsUseCase.getTimeRange() ->\nresult: " + l2);
        VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto2 = VkStartGetStatsAggregationTypeDto.DAY;
        VkStartGetStatsActivityTypeDto vkStartGetStatsActivityTypeDto2 = VkStartGetStatsActivityTypeDto.RUNNING;
        zwtVar.L$0 = null;
        zwtVar.label = 2;
        obj3 = this.b.b(l2, vkStartGetStatsAggregationTypeDto2, vkStartGetStatsActivityTypeDto2, zwtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, ContinuationImpl continuationImpl) {
        axt axtVar;
        int i;
        boolean z;
        iyu0 iyu0Var;
        if (continuationImpl instanceof axt) {
            axtVar = (axt) continuationImpl;
            int i2 = axtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                axtVar.label = i2 - Integer.MIN_VALUE;
                Object obj = axtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = axtVar.label;
                z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    RequestedMiniApp requestedMiniApp = RequestedMiniApp.VK_WORKOUT;
                    axtVar.L$0 = null;
                    axtVar.label = 1;
                    obj = byu0.b(this.a, context, requestedMiniApp, axtVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                iyu0Var = (iyu0) obj;
                if (!jyu0.f(iyu0Var) && !jyu0.e(iyu0Var)) {
                    z = false;
                }
                xgx0.a.getClass();
                xgx0.a("GetVkWorkoutWidgetStatsUseCase.validatePermissions ->\nhasPermissions: " + z);
                if (z) {
                    throw new IllegalAccessException("Permissions are required");
                }
                return s3q0.a;
            }
        }
        axtVar = new axt(this, continuationImpl);
        Object obj2 = axtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = axtVar.label;
        z = true;
        if (i != 0) {
        }
        iyu0Var = (iyu0) obj2;
        if (!jyu0.f(iyu0Var)) {
            z = false;
        }
        xgx0.a.getClass();
        xgx0.a("GetVkWorkoutWidgetStatsUseCase.validatePermissions ->\nhasPermissions: " + z);
        if (z) {
        }
    }
}
