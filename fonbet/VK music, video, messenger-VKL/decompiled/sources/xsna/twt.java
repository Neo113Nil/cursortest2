package xsna;

import android.content.Context;
import com.vk.superapp.vksteps.domain.GoogleServicesDataSource;
import com.vk.superapp.vksteps.utils.enums.VkStepsSyncDurationStrategy;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsForSyncUseCase.kt */
/* loaded from: classes11.dex */
public final class twt {
    public final umv0 a;

    /* compiled from: GetVkStepsForSyncUseCase.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleServicesDataSource.values().length];
            try {
                iArr[GoogleServicesDataSource.HEALTH_CONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleServicesDataSource.GOOGLE_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public twt(umv0 umv0Var) {
        this.a = umv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(e9q0 e9q0Var, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, GoogleServicesDataSource googleServicesDataSource, ContinuationImpl continuationImpl) {
        uwt uwtVar;
        int i;
        List list;
        if (continuationImpl instanceof uwt) {
            uwtVar = (uwt) continuationImpl;
            int i2 = uwtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uwtVar.label = i2 - Integer.MIN_VALUE;
                uwt uwtVar2 = uwtVar;
                Object obj = uwtVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uwtVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    int i3 = a.$EnumSwitchMapping$0[googleServicesDataSource.ordinal()];
                    umv0 umv0Var = this.a;
                    if (i3 == 1) {
                        Context a2 = e9q0Var.a();
                        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy = VkStepsSyncDurationStrategy.ONE_MINUTE;
                        uwtVar2.label = 1;
                        obj = umv0Var.b(a2, zonedDateTime, zonedDateTime2, vkStepsSyncDurationStrategy, uwtVar2);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Context a3 = e9q0Var.a();
                        VkStepsSyncDurationStrategy vkStepsSyncDurationStrategy2 = VkStepsSyncDurationStrategy.TEN_MINUTES;
                        uwtVar2.label = 2;
                        obj = umv0Var.a(a3, zonedDateTime, zonedDateTime2, vkStepsSyncDurationStrategy2, uwtVar2);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    list = (List) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    list = (List) obj;
                }
                int i4 = u0l0.b;
                ArrayList b = u0l0.b(list, ChronoUnit.DAYS);
                xgx0 xgx0Var = xgx0.a;
                StringBuilder sb = new StringBuilder("GetVkStepsForSyncUseCase.execute() -> steps: ");
                sb.append(list);
                sb.append(", groupedSteps: ");
                sb.append(b);
                sb.append(", \"thread: ");
                mft0.a(sb, xgx0Var);
                return b;
            }
        }
        uwtVar = new uwt(this, continuationImpl);
        uwt uwtVar22 = uwtVar;
        Object obj2 = uwtVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uwtVar22.label;
        if (i != 0) {
        }
        int i42 = u0l0.b;
        ArrayList b2 = u0l0.b(list, ChronoUnit.DAYS);
        xgx0 xgx0Var2 = xgx0.a;
        StringBuilder sb2 = new StringBuilder("GetVkStepsForSyncUseCase.execute() -> steps: ");
        sb2.append(list);
        sb2.append(", groupedSteps: ");
        sb2.append(b2);
        sb2.append(", \"thread: ");
        mft0.a(sb2, xgx0Var2);
        return b2;
    }
}
