package xsna;

import android.os.Bundle;
import com.vk.push.common.Logger;
import com.vk.push.core.work.WorkModel;
import com.vk.push.pushsdk.VkpnsPushConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SchedulePeriodicWorkersInteractor.kt */
/* loaded from: classes5.dex */
public final class w5h0 {
    public final ezx0 a;
    public final y6i b;
    public final Logger c;

    /* compiled from: SchedulePeriodicWorkersInteractor.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkpnsPushConfig.BackgroundWorkMode.values().length];
            try {
                iArr[VkpnsPushConfig.BackgroundWorkMode.SERVICE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkpnsPushConfig.BackgroundWorkMode.SERVICE_WITH_PERIODIC_WORKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SchedulePeriodicWorkersInteractor.kt */
    @b6l(c = "com.vk.push.pushsdk.domain.interactor.SchedulePeriodicWorkersInteractor", f = "SchedulePeriodicWorkersInteractor.kt", l = {41}, m = "invoke")
    public static final class b extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return w5h0.this.a(null, false, this);
        }
    }

    public w5h0(ezx0 ezx0Var, y6i y6iVar, Logger logger) {
        this.a = ezx0Var;
        this.b = y6iVar;
        this.c = logger.createLogger(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(VkpnsPushConfig.BackgroundWorkMode backgroundWorkMode, boolean z, spj<? super s3q0> spjVar) {
        b bVar;
        int i;
        w5h0 w5h0Var;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    WorkModel.KeepExistingWork keepExistingWork = WorkModel.KeepExistingWork.YES;
                    this.a.b(new WorkModel("VKPNS_StopDeliverToUninstalledWork", keepExistingWork, null));
                    this.a.b(new WorkModel("VKPNS_PushTokensHealthCheckWork", keepExistingWork, null));
                    Logger logger = this.c;
                    StringBuilder sb = new StringBuilder("Launching SDK in ");
                    VkpnsPushConfig vkpnsPushConfig = qxi.b;
                    if (vkpnsPushConfig == null) {
                        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                    }
                    sb.append(vkpnsPushConfig.f);
                    sb.append(" mode");
                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                    int i3 = a.$EnumSwitchMapping$0[backgroundWorkMode.ordinal()];
                    if (i3 == 1) {
                        this.a.a("VKPNS_OneTimePushReceiveWorker");
                        return s3q0.a;
                    }
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y6i y6iVar = this.b;
                    bVar.L$0 = this;
                    bVar.Z$0 = z;
                    bVar.label = 1;
                    obj = ((ezx0) y6iVar.b).c.a(z, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    w5h0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = bVar.Z$0;
                    w5h0Var = (w5h0) bVar.L$0;
                    kotlin.a.a(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Logger.DefaultImpls.info$default(w5h0Var.c, zhy0.a("Enqueue OneTimePushReceiveWorker isNetworkConnectionCheckChanged = ", booleanValue), null, 2, null);
                WorkModel.KeepExistingWork keepExistingWorkModel = WorkModel.KeepExistingWork.Companion.toKeepExistingWorkModel(!booleanValue);
                Bundle bundle = new Bundle(1);
                bundle.putBoolean("use_google_connection_check", z);
                s3q0 s3q0Var = s3q0.a;
                w5h0Var.a.b(new WorkModel("VKPNS_OneTimePushReceiveWorker", keepExistingWorkModel, bundle));
                return s3q0.a;
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        Logger.DefaultImpls.info$default(w5h0Var.c, zhy0.a("Enqueue OneTimePushReceiveWorker isNetworkConnectionCheckChanged = ", booleanValue2), null, 2, null);
        WorkModel.KeepExistingWork keepExistingWorkModel2 = WorkModel.KeepExistingWork.Companion.toKeepExistingWorkModel(!booleanValue2);
        Bundle bundle2 = new Bundle(1);
        bundle2.putBoolean("use_google_connection_check", z);
        s3q0 s3q0Var2 = s3q0.a;
        w5h0Var.a.b(new WorkModel("VKPNS_OneTimePushReceiveWorker", keepExistingWorkModel2, bundle2));
        return s3q0.a;
    }
}
