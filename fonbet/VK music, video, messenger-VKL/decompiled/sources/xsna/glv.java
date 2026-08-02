package xsna;

import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.hihealth.DataController;
import com.huawei.hms.hihealth.HuaweiHiHealth;
import com.huawei.hms.hihealth.data.DataType;
import com.huawei.hms.hihealth.data.SampleSet;
import com.vk.superapp.bridges.dto.analytics.HealthDataProvider;
import com.vk.superapp.bridges.dto.analytics.HealthSyncState;
import com.vk.superapp.vkhealth.permissions.api.HuaweiHealthAuthorizationError;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: HuaweiHealthDataSource.kt */
/* loaded from: classes11.dex */
public final class glv {
    public static Object a(DataController dataController, int i, int i2, flv flvVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(flvVar));
        lq9Var.o();
        Task<SampleSet> readDailySummation = dataController.readDailySummation(DataType.DT_CONTINUOUS_DISTANCE_DELTA, i, i2);
        readDailySummation.c(new nt8(lq9Var));
        readDailySummation.b(new f2b0(lq9Var));
        readDailySummation.a(new g280(lq9Var) { // from class: xsna.clv
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    public static Object b(DataController dataController, int i, int i2, flv flvVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(flvVar));
        lq9Var.o();
        Task<SampleSet> readDailySummation = dataController.readDailySummation(DataType.DT_CONTINUOUS_STEPS_DELTA, i, i2);
        readDailySummation.c(new dv3(lq9Var));
        readDailySummation.b(new dlv(lq9Var));
        readDailySummation.a(new g280(lq9Var) { // from class: xsna.elv
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(Context context, long j, long j2, VkStepsSyncReason vkStepsSyncReason, ContinuationImpl continuationImpl) {
        flv flvVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        DataController dataController;
        int parseInt;
        int parseInt2;
        VkStepsSyncReason vkStepsSyncReason2;
        long j3;
        VkStepsSyncReason vkStepsSyncReason3;
        Context context2;
        Context context3;
        long j4;
        VkStepsSyncReason vkStepsSyncReason4;
        Object a;
        SampleSet sampleSet;
        long j5;
        boolean z;
        if (continuationImpl instanceof flv) {
            flvVar = (flv) continuationImpl;
            int i2 = flvVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flvVar.label = i2 - Integer.MIN_VALUE;
                Object obj = flvVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flvVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    dataController = HuaweiHiHealth.getDataController(context);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
                    parseInt = Integer.parseInt(simpleDateFormat.format(new Date(j)));
                    parseInt2 = Integer.parseInt(simpleDateFormat.format(new Date(j2)));
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        flvVar.L$0 = context;
                        vkStepsSyncReason2 = vkStepsSyncReason;
                        try {
                            flvVar.L$1 = vkStepsSyncReason2;
                            flvVar.L$2 = dataController;
                            flvVar.I$0 = parseInt;
                            flvVar.I$1 = parseInt2;
                            flvVar.J$0 = currentTimeMillis;
                            flvVar.label = 1;
                            obj = b(dataController, parseInt, parseInt2, flvVar);
                            if (obj != coroutineSingletons) {
                                context3 = context;
                                j4 = currentTimeMillis;
                                vkStepsSyncReason4 = vkStepsSyncReason2;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            j3 = currentTimeMillis;
                            vkStepsSyncReason3 = vkStepsSyncReason2;
                            context2 = context;
                            xgx0.a.getClass();
                            xgx0.c("HuaweiHealthDataSource.readData() -> ", th);
                            amv0.a(context2, HealthSyncState.HEALTH_PROVIDER_ERROR, vkStepsSyncReason3, HealthDataProvider.HUAWEI_HEALTH, th.getMessage(), 0, j3);
                            z = th instanceof SecurityException;
                            if (!z) {
                            }
                            if (!z) {
                            }
                            if (z) {
                            }
                            throw new IllegalStateException(th.getMessage(), th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        vkStepsSyncReason2 = vkStepsSyncReason;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = flvVar.J$0;
                        sampleSet = (SampleSet) flvVar.L$2;
                        VkStepsSyncReason vkStepsSyncReason5 = (VkStepsSyncReason) flvVar.L$1;
                        Context context4 = (Context) flvVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            context3 = context4;
                            vkStepsSyncReason4 = vkStepsSyncReason5;
                            try {
                                return new Pair(sampleSet, (SampleSet) obj);
                            } catch (Throwable th3) {
                                th = th3;
                                j3 = j5;
                                vkStepsSyncReason3 = vkStepsSyncReason4;
                                context2 = context3;
                                xgx0.a.getClass();
                                xgx0.c("HuaweiHealthDataSource.readData() -> ", th);
                                amv0.a(context2, HealthSyncState.HEALTH_PROVIDER_ERROR, vkStepsSyncReason3, HealthDataProvider.HUAWEI_HEALTH, th.getMessage(), 0, j3);
                                z = th instanceof SecurityException;
                                if (!z && (epx.f(th.getMessage(), "50061") || epx.f(th.getMessage(), "50062"))) {
                                    return new Pair(null, null);
                                }
                                if (!z && epx.f(th.getMessage(), "8")) {
                                    return new Pair(null, null);
                                }
                                if (z || !epx.f(th.getMessage(), "50005")) {
                                    throw new IllegalStateException(th.getMessage(), th);
                                }
                                String message = th.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                throw new HuaweiHealthAuthorizationError(message);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context2 = context4;
                            j3 = j5;
                            vkStepsSyncReason3 = vkStepsSyncReason5;
                            xgx0.a.getClass();
                            xgx0.c("HuaweiHealthDataSource.readData() -> ", th);
                            amv0.a(context2, HealthSyncState.HEALTH_PROVIDER_ERROR, vkStepsSyncReason3, HealthDataProvider.HUAWEI_HEALTH, th.getMessage(), 0, j3);
                            z = th instanceof SecurityException;
                            if (!z) {
                            }
                            if (!z) {
                            }
                            if (z) {
                            }
                            throw new IllegalStateException(th.getMessage(), th);
                        }
                    }
                    j4 = flvVar.J$0;
                    parseInt2 = flvVar.I$1;
                    parseInt = flvVar.I$0;
                    dataController = (DataController) flvVar.L$2;
                    vkStepsSyncReason4 = (VkStepsSyncReason) flvVar.L$1;
                    context3 = (Context) flvVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        j3 = j4;
                        vkStepsSyncReason3 = vkStepsSyncReason4;
                        context2 = context3;
                        xgx0.a.getClass();
                        xgx0.c("HuaweiHealthDataSource.readData() -> ", th);
                        amv0.a(context2, HealthSyncState.HEALTH_PROVIDER_ERROR, vkStepsSyncReason3, HealthDataProvider.HUAWEI_HEALTH, th.getMessage(), 0, j3);
                        z = th instanceof SecurityException;
                        if (!z) {
                        }
                        if (!z) {
                        }
                        if (z) {
                        }
                        throw new IllegalStateException(th.getMessage(), th);
                    }
                }
                SampleSet sampleSet2 = (SampleSet) obj;
                flvVar.L$0 = context3;
                flvVar.L$1 = vkStepsSyncReason4;
                flvVar.L$2 = sampleSet2;
                flvVar.J$0 = j4;
                flvVar.label = 2;
                a = a(dataController, parseInt, parseInt2, flvVar);
                if (a != coroutineSingletons) {
                    sampleSet = sampleSet2;
                    obj = a;
                    j5 = j4;
                    return new Pair(sampleSet, (SampleSet) obj);
                }
                return coroutineSingletons;
            }
        }
        flvVar = new flv(this, continuationImpl);
        Object obj2 = flvVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flvVar.label;
        if (i != 0) {
        }
        SampleSet sampleSet22 = (SampleSet) obj2;
        flvVar.L$0 = context3;
        flvVar.L$1 = vkStepsSyncReason4;
        flvVar.L$2 = sampleSet22;
        flvVar.J$0 = j4;
        flvVar.label = 2;
        a = a(dataController, parseInt, parseInt2, flvVar);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
