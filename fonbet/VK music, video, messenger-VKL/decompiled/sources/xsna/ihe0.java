package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.push.InvalidateTokenResult;
import com.vk.push.pushsdk.client.ipc.AppNotInstalledException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushDeliveryComponent.kt */
/* loaded from: classes5.dex */
public final class ihe0<T> implements lsr {
    public final /* synthetic */ nhe0 b;
    public final /* synthetic */ AppInfo c;

    /* compiled from: PushDeliveryComponent.kt */
    @b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$sendInvalidateToClient$2", f = "PushDeliveryComponent.kt", l = {267, 280, 281}, m = "emit")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ihe0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ihe0<? super T> ihe0Var, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = ihe0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public ihe0(nhe0 nhe0Var, AppInfo appInfo) {
        this.b = nhe0Var;
        this.c = appInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
    
        if (r1.a(r4, r2) != r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // xsna.lsr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(pke0 pke0Var, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        pke0 pke0Var2;
        Object d;
        ihe0<T> ihe0Var;
        Object obj;
        ihe0<T> ihe0Var2;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    nhe0 nhe0Var = this.b;
                    Logger logger = nhe0Var.o;
                    StringBuilder sb = new StringBuilder("Send on invalidate token to ");
                    AppInfo appInfo = this.c;
                    sb.append(appInfo.getPackageName());
                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                    nhe0Var.m.storeTiming("send_invalidate_info");
                    vie0 vie0Var = nhe0Var.f;
                    aVar.L$0 = this;
                    pke0Var2 = pke0Var;
                    aVar.L$1 = pke0Var2;
                    aVar.label = 1;
                    d = vie0Var.d(appInfo, aVar);
                    if (d != coroutineSingletons) {
                        ihe0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    pke0Var2 = (pke0) aVar.L$1;
                    ihe0Var = (ihe0) aVar.L$0;
                    kotlin.a.a(obj2);
                    d = ((Result) obj2).d();
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    }
                    pke0Var2 = (pke0) aVar.L$1;
                    ihe0Var2 = (ihe0) aVar.L$0;
                    kotlin.a.a(obj2);
                    don0 don0Var = ihe0Var2.b.i;
                    String str = pke0Var2.b;
                    aVar.L$0 = null;
                    aVar.L$1 = null;
                    aVar.label = 3;
                }
                obj = d;
                nhe0 nhe0Var2 = ihe0Var.b;
                AppInfo appInfo2 = ihe0Var.c;
                AnalyticsSender analyticsSender = nhe0Var2.l;
                String packageName = appInfo2.getPackageName();
                String str2 = pke0Var2.b;
                AnalyticsTimingsStore analyticsTimingsStore = nhe0Var2.m;
                Logger logger2 = nhe0Var2.o;
                analyticsSender.send(new shi0(analyticsTimingsStore.getTimePassed("send_invalidate_info"), obj, str2, packageName));
                if ((!(obj instanceof Result.Failure) ? null : obj) != InvalidateTokenResult.OK) {
                    Logger.DefaultImpls.info$default(logger2, "On token invalidated delivered to " + appInfo2.getPackageName(), null, 2, null);
                    ske0 ske0Var = nhe0Var2.h;
                    aVar.L$0 = ihe0Var;
                    aVar.L$1 = pke0Var2;
                    aVar.label = 2;
                    if (ske0Var.i(pke0Var2, aVar) != coroutineSingletons) {
                        ihe0Var2 = ihe0Var;
                        don0 don0Var2 = ihe0Var2.b.i;
                        String str3 = pke0Var2.b;
                        aVar.L$0 = null;
                        aVar.L$1 = null;
                        aVar.label = 3;
                    }
                    return coroutineSingletons;
                }
                if (Result.a(obj) instanceof HostIsNotMasterException) {
                    Logger.DefaultImpls.error$default(logger2, "Failed to deliver messages to " + appInfo2.getPackageName() + ", this host is not a master", null, 2, null);
                    nhe0Var2.f(appInfo2.getPackageName());
                } else if (Result.a(obj) instanceof AppNotInstalledException) {
                    Logger.DefaultImpls.error$default(logger2, "Failed to deliver invalidate token to uninstalled " + appInfo2.getPackageName(), null, 2, null);
                    nhe0Var2.f(appInfo2.getPackageName());
                } else {
                    Logger.DefaultImpls.error$default(logger2, "Failed to deliver invalidate token to " + appInfo2.getPackageName(), null, 2, null);
                }
                return s3q0.a;
            }
        }
        aVar = new a(this, spjVar);
        Object obj22 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        obj = d;
        nhe0 nhe0Var22 = ihe0Var.b;
        AppInfo appInfo22 = ihe0Var.c;
        AnalyticsSender analyticsSender2 = nhe0Var22.l;
        String packageName2 = appInfo22.getPackageName();
        String str22 = pke0Var2.b;
        AnalyticsTimingsStore analyticsTimingsStore2 = nhe0Var22.m;
        Logger logger22 = nhe0Var22.o;
        analyticsSender2.send(new shi0(analyticsTimingsStore2.getTimePassed("send_invalidate_info"), obj, str22, packageName2));
        if ((!(obj instanceof Result.Failure) ? null : obj) != InvalidateTokenResult.OK) {
        }
    }
}
