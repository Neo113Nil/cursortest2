package xsna;

import android.app.ActivityManager;
import android.app.Service;
import android.os.Process;
import android.os.SystemClock;
import com.vk.push.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.coi0;

/* compiled from: CheckServiceAliveUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.CheckServiceAliveUseCase$invoke$1", f = "CheckServiceAliveUseCase.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class w0c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $checkDelay;
    long J$0;
    int label;
    final /* synthetic */ x0c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0c(long j, x0c x0cVar, spj<? super w0c> spjVar) {
        super(2, spjVar);
        this.$checkDelay = j;
        this.this$0 = x0cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new w0c(this.$checkDelay, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((w0c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:7:0x0034, B:9:0x0045, B:10:0x0050, B:12:0x0056, B:15:0x0065, B:20:0x0069, B:21:0x006d, B:23:0x0073, B:27:0x008c, B:29:0x0090), top: B:6:0x0034 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0028 -> B:5:0x002b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        long j;
        coi0.a aVar;
        List<ActivityManager.RunningServiceInfo> runningServices;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            currentTimeMillis = System.currentTimeMillis();
            j = this.$checkDelay;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
            }
            coi0 coi0Var = this.this$0.a;
            aVar = coi0Var.d;
            Class<? extends Service> cls = coi0Var.b;
            runningServices = ((ActivityManager) coi0Var.c.getValue()).getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null) {
            }
            if (aVar.a) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentTimeMillis = this.J$0;
            kotlin.a.a(obj);
            coi0 coi0Var2 = this.this$0.a;
            aVar = coi0Var2.d;
            Class<? extends Service> cls2 = coi0Var2.b;
            runningServices = ((ActivityManager) coi0Var2.c.getValue()).getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : runningServices) {
                    if (((ActivityManager.RunningServiceInfo) obj3).pid == Process.myPid()) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((ActivityManager.RunningServiceInfo) obj2).service.getClassName(), cls2.getName())) {
                        break;
                    }
                }
                ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) obj2;
                if (runningServiceInfo != null) {
                    aVar = new coi0.a(SystemClock.elapsedRealtime() - runningServiceInfo.activeSince, cls2.getSimpleName(), true);
                }
            }
            if (aVar.a) {
                Logger.DefaultImpls.info$default(this.this$0.c, i5s.a(new StringBuilder("Service "), aVar.c, " is active"), null, 2, null);
                w80 w80Var = this.this$0.b;
                myc0.h(w80Var.e, null, null, new y80(w80Var, System.currentTimeMillis() - currentTimeMillis, aVar.b, null), 3);
                currentTimeMillis = System.currentTimeMillis();
                j = this.$checkDelay;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                if (qsl.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coi0 coi0Var22 = this.this$0.a;
                aVar = coi0Var22.d;
                Class<? extends Service> cls22 = coi0Var22.b;
                runningServices = ((ActivityManager) coi0Var22.c.getValue()).getRunningServices(Integer.MAX_VALUE);
                if (runningServices != null) {
                }
                if (aVar.a) {
                    Logger.DefaultImpls.info$default(this.this$0.c, "Service is inactive", null, 2, null);
                    return s3q0.a;
                }
            }
        }
    }
}
