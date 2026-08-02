package xsna;

import com.vk.api.generated.healthCommon.dto.HealthCommonClientConfigDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonClientConfigVkstartWidgetDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartWidgetSyncBackgroundConfigDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkstartWidgetSyncConfigDto;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FetchVkWorkoutWidgetSyncConfigUseCase.kt */
/* loaded from: classes11.dex */
public final class w6r {
    public final c3w0 a;
    public final i3w0 b;

    public w6r(c3w0 c3w0Var, i3w0 i3w0Var) {
        this.a = c3w0Var;
        this.b = i3w0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        v6r v6rVar;
        int i;
        HealthCommonClientConfigVkstartWidgetDto f;
        HealthCommonVkstartWidgetSyncConfigDto d;
        HealthCommonVkstartWidgetSyncBackgroundConfigDto d2;
        if (continuationImpl instanceof v6r) {
            v6rVar = (v6r) continuationImpl;
            int i2 = v6rVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v6rVar.label = i2 - Integer.MIN_VALUE;
                Object obj = v6rVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v6rVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    v6rVar.label = 1;
                    obj = this.a.a(v6rVar);
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
                HealthCommonClientConfigDto healthCommonClientConfigDto = (HealthCommonClientConfigDto) obj;
                xgx0.a.getClass();
                xgx0.a("VkWorkoutWidgetFetchSyncConfigUseCase.execute() ->\nresponse: " + healthCommonClientConfigDto);
                f = healthCommonClientConfigDto.f();
                if (f != null || (d = f.d()) == null || (d2 = d.d()) == null) {
                    return s3q0.a;
                }
                boolean e = d2.e();
                List<String> d3 = d2.d();
                if (d3 == null) {
                    d3 = EmptyList.b;
                }
                v6rVar.L$0 = null;
                v6rVar.L$1 = null;
                v6rVar.label = 2;
                Object k = myc0.k(hqu0.b(), new h3w0(this.b, e, d3, null), v6rVar);
                if (k != coroutineSingletons) {
                    k = s3q0.a;
                }
            }
        }
        v6rVar = new v6r(this, continuationImpl);
        Object obj2 = v6rVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v6rVar.label;
        if (i != 0) {
        }
        HealthCommonClientConfigDto healthCommonClientConfigDto2 = (HealthCommonClientConfigDto) obj2;
        xgx0.a.getClass();
        xgx0.a("VkWorkoutWidgetFetchSyncConfigUseCase.execute() ->\nresponse: " + healthCommonClientConfigDto2);
        f = healthCommonClientConfigDto2.f();
        if (f != null) {
        }
        return s3q0.a;
    }
}
