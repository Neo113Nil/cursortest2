package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.pushsdk.ipc.ForegroundPushService;
import com.vk.push.pushsdk.ipc.PushService;
import com.vk.push.pushsdk.masterhost.MasterSelectionService;
import com.vk.push.pushsdk.masterhost.ipc.MasterHostIPCResult;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.zi10;

/* compiled from: MasterSelectionComponentImpl.kt */
/* loaded from: classes5.dex */
public final class nk10 implements gk10 {
    public final yvj a;
    public final PackagesRepository b;
    public final nj10 c;
    public final dqk0 d;
    public final rj01 e;
    public final kpt f;
    public final GetCallingAppInfoUseCase g;
    public final bk10 h;
    public final nhe0 i;
    public final ip9 j;
    public final jn4 k;
    public final sic l;
    public final dqz0 m;
    public final sap n;
    public final AnalyticsSender o;
    public final Logger p;

    public nk10(hpj hpjVar, PackagesRepository packagesRepository, nj10 nj10Var, dqk0 dqk0Var, rj01 rj01Var, kpt kptVar, GetCallingAppInfoUseCase getCallingAppInfoUseCase, yiz yizVar, bk10 bk10Var, nhe0 nhe0Var, ip9 ip9Var, jn4 jn4Var, sic sicVar, dqz0 dqz0Var, sap sapVar, AnalyticsSender analyticsSender, Logger logger) {
        this.a = hpjVar;
        this.b = packagesRepository;
        this.c = nj10Var;
        this.d = dqk0Var;
        this.e = rj01Var;
        this.f = kptVar;
        this.g = getCallingAppInfoUseCase;
        this.h = bk10Var;
        this.i = nhe0Var;
        this.j = ip9Var;
        this.k = jn4Var;
        this.l = sicVar;
        this.m = dqz0Var;
        this.n = sapVar;
        this.o = analyticsSender;
        this.p = logger.createLogger(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x011a, code lost:
    
        if (r13.d(r12, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
    
        if (r13.a(r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5 A[LOOP:0: B:25:0x00df->B:27:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(nk10 nk10Var, String str, ContinuationImpl continuationImpl) {
        jk10 jk10Var;
        Object obj;
        int i;
        nk10 nk10Var2;
        String str2;
        nk10 nk10Var3;
        nk10Var.getClass();
        if (continuationImpl instanceof jk10) {
            jk10Var = (jk10) continuationImpl;
            int i2 = jk10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jk10Var.label = i2 - Integer.MIN_VALUE;
                obj = jk10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jk10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bk10 bk10Var = nk10Var.h;
                    jk10Var.L$0 = nk10Var;
                    jk10Var.L$1 = str;
                    jk10Var.label = 1;
                    obj = bk10Var.b(jk10Var);
                } else if (i == 1) {
                    str = (String) jk10Var.L$1;
                    nk10Var = (nk10) jk10Var.L$0;
                    kotlin.a.a(obj);
                } else if (i == 2) {
                    str2 = (String) jk10Var.L$1;
                    nk10Var2 = (nk10) jk10Var.L$0;
                    kotlin.a.a(obj);
                    for (xje0 xje0Var : (List) obj) {
                        nk10Var2.o.send(new zhc(xje0Var.a, xje0Var.c, str2));
                    }
                    sic sicVar = nk10Var2.l;
                    jk10Var.L$0 = nk10Var2;
                    jk10Var.L$1 = str2;
                    jk10Var.label = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nk10Var3 = (nk10) jk10Var.L$0;
                        kotlin.a.a(obj);
                        Logger.DefaultImpls.info$default(nk10Var3.p, "old master notified successfully", null, 2, null);
                        return AidlResult.Companion.success(MasterHostIPCResult.OLD_MASTER_NOTIFIED);
                    }
                    str2 = (String) jk10Var.L$1;
                    nk10Var2 = (nk10) jk10Var.L$0;
                    kotlin.a.a(obj);
                    nk10 nk10Var4 = nk10Var2;
                    String str3 = str2;
                    nk10Var3 = nk10Var4;
                    nk10Var3.i.e();
                    bk10 bk10Var2 = nk10Var3.h;
                    jk10Var.L$0 = nk10Var3;
                    jk10Var.L$1 = null;
                    jk10Var.label = 4;
                }
                if (((Boolean) obj).booleanValue()) {
                    Logger.DefaultImpls.info$default(nk10Var.p, "Host is not master. It's been notified successfully", null, 2, null);
                    return AidlResult.Companion.success(MasterHostIPCResult.HOST_NOTIFIED_ABOUT_NEW_MASTER);
                }
                nk10Var.j.a();
                Context context = (Context) nk10Var.k.b;
                context.stopService(new Intent(context, (Class<?>) PushService.class));
                context.stopService(new Intent(context, (Class<?>) ForegroundPushService.class));
                ((ezx0) nk10Var.e.b).a("VKPNS_InitiateMasterElectionsWorker");
                dqz0 dqz0Var = nk10Var.m;
                jk10Var.L$0 = nk10Var;
                jk10Var.L$1 = str;
                jk10Var.label = 2;
                obj = ((fje0) dqz0Var.b).f(0, jk10Var);
                if (obj != coroutineSingletons) {
                    String str4 = str;
                    nk10Var2 = nk10Var;
                    str2 = str4;
                    while (r13.hasNext()) {
                    }
                    sic sicVar2 = nk10Var2.l;
                    jk10Var.L$0 = nk10Var2;
                    jk10Var.L$1 = str2;
                    jk10Var.label = 3;
                }
                return coroutineSingletons;
            }
        }
        jk10Var = new jk10(nk10Var, continuationImpl);
        obj = jk10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jk10Var.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // xsna.gk10
    public final void a(CallingAppIds callingAppIds, String str, zi10.c cVar) {
        if (str == null) {
            return;
        }
        myc0.h(this.a, null, null, new kk10(this, str, cVar, callingAppIds, null), 3);
    }

    @Override // xsna.gk10
    public final void b(zi10.a aVar) {
        myc0.h(this.a, null, null, new hk10(this, aVar, null), 3);
    }

    @Override // xsna.gk10
    public final void c(CallingAppIds callingAppIds, zi10.b bVar) {
        myc0.h(this.a, null, null, new ik10(this, callingAppIds, bVar, null), 3);
    }

    @Override // xsna.gk10
    public final void d(CallingAppIds callingAppIds, zi10.d dVar) {
        myc0.h(this.a, null, null, new lk10(this, callingAppIds, dVar, null), 3);
    }

    @Override // xsna.gk10
    public final void e(MasterSelectionService.c.a aVar) {
        myc0.h(this.a, null, null, new mk10(this, aVar, null), 3);
    }

    public final void g(boolean z, boolean z2) {
        Logger.DefaultImpls.info$default(this.p, zhy0.a("scheduleRetryWork initiate master elections successful = ", z), null, 2, null);
        if (z) {
            ((ezx0) this.e.b).a("VKPNS_InitiateMasterElectionsWorker");
        } else {
            this.d.a(z2);
        }
    }
}
