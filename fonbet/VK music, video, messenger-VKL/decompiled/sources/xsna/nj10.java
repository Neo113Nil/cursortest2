package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.core.domain.usecase.GetInitializedHostPackagesUseCase;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$initiateMastersElections$2;
import com.vk.push.pushsdk.masterhost.MasterSelectionService;
import com.vk.push.pushsdk.masterhost.ipc.MasterHostIPCResult;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterHostElectionsInteractor.kt */
/* loaded from: classes5.dex */
public final class nj10 {
    public final Context a;
    public final bk10 b;
    public final AnalyticsSender c;
    public final AnalyticsTimingsStore d;
    public final MasterHostApi e;
    public final ConcurrentHashMap<AppInfo, ak10> f;
    public final lec g;
    public final wp9 h;
    public final yiz i;
    public final e060 j;
    public final ok10 k;
    public final smy<Result<AppInfo>> l;
    public final GetInitializedHostPackagesUseCase m;
    public final GetCallingAppInfoUseCase n;
    public final Logger o;

    public nj10(Logger logger, Context context, bk10 bk10Var, AnalyticsSender analyticsSender, AnalyticsTimingsStore analyticsTimingsStore, MasterHostApi masterHostApi, ConcurrentHashMap<AppInfo, ak10> concurrentHashMap, lec lecVar, wp9 wp9Var, yiz yizVar, e060 e060Var, ok10 ok10Var, smy<Result<AppInfo>> smyVar, GetInitializedHostPackagesUseCase getInitializedHostPackagesUseCase, GetCallingAppInfoUseCase getCallingAppInfoUseCase) {
        this.a = context;
        this.b = bk10Var;
        this.c = analyticsSender;
        this.d = analyticsTimingsStore;
        this.e = masterHostApi;
        this.f = concurrentHashMap;
        this.g = lecVar;
        this.h = wp9Var;
        this.i = yizVar;
        this.j = e060Var;
        this.k = ok10Var;
        this.l = smyVar;
        this.m = getInitializedHostPackagesUseCase;
        this.n = getCallingAppInfoUseCase;
        this.o = logger.createLogger("MasterHostElectionsInteractor");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(nj10 nj10Var, CallingAppIds callingAppIds, ContinuationImpl continuationImpl) {
        dj10 dj10Var;
        int i;
        nj10Var.getClass();
        if (continuationImpl instanceof dj10) {
            dj10Var = (dj10) continuationImpl;
            int i2 = dj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dj10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = dj10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dj10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bdn bdnVar = bdn.a;
                    wgl wglVar = wgl.c;
                    ej10 ej10Var = new ej10(callingAppIds, null, nj10Var);
                    dj10Var.label = 1;
                    obj = myc0.k(wglVar, ej10Var, dj10Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        dj10Var = new dj10(nj10Var, continuationImpl);
        Object obj2 = dj10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dj10Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        cj10 cj10Var;
        int i;
        Object m105getHostListgIAlus;
        if (continuationImpl instanceof cj10) {
            cj10Var = (cj10) continuationImpl;
            int i2 = cj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cj10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = cj10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cj10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cj10Var.label = 1;
                    m105getHostListgIAlus = this.e.m105getHostListgIAlus(list, cj10Var);
                    if (m105getHostListgIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    m105getHostListgIAlus = ((Result) obj).d();
                }
                if (!(m105getHostListgIAlus instanceof Result.Failure)) {
                    return m105getHostListgIAlus;
                }
                try {
                    return (AppInfo) j5g.Y((List) m105getHostListgIAlus);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        cj10Var = new cj10(this, continuationImpl);
        Object obj2 = cj10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cj10Var.label;
        if (i != 0) {
        }
        if (!(m105getHostListgIAlus instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CallingAppIds callingAppIds, ContinuationImpl continuationImpl) {
        fj10 fj10Var;
        int i;
        if (continuationImpl instanceof fj10) {
            fj10Var = (fj10) continuationImpl;
            int i2 = fj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fj10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = fj10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fj10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bdn bdnVar = bdn.a;
                    wgl wglVar = wgl.c;
                    MasterHostElectionsInteractor$initiateMastersElections$2 masterHostElectionsInteractor$initiateMastersElections$2 = new MasterHostElectionsInteractor$initiateMastersElections$2(callingAppIds, null, this);
                    fj10Var.label = 1;
                    obj = myc0.k(wglVar, masterHostElectionsInteractor$initiateMastersElections$2, fj10Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        fj10Var = new fj10(this, continuationImpl);
        Object obj2 = fj10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fj10Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        hj10 hj10Var;
        int i;
        if (continuationImpl instanceof hj10) {
            hj10Var = (hj10) continuationImpl;
            int i2 = hj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hj10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = hj10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hj10Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                String applicationSignature = PackageExtenstionsKt.getApplicationSignature(this.a, str);
                Logger logger = this.o;
                if (applicationSignature == null || drm0.N(applicationSignature)) {
                    Logger.DefaultImpls.info$default(logger, zr.a("Host ", str, " not exists, no need to notify him"), null, 2, null);
                    return MasterHostIPCResult.OLD_MASTER_NOTIFIED;
                }
                AppInfo appInfo = new AppInfo(str, applicationSignature);
                ak10 ak10Var = new ak10(this.a, appInfo, this.o, 10000L, new jj10(this, appInfo));
                ak10 putIfAbsent = this.f.putIfAbsent(appInfo, ak10Var);
                if (putIfAbsent != null) {
                    ak10Var = putIfAbsent;
                }
                Logger.DefaultImpls.info$default(logger, zr.a("Notify ", str, " about new master"), null, 2, null);
                hj10Var.label = 1;
                Object p = ak10Var.p(str2, hj10Var);
                return p == coroutineSingletons ? coroutineSingletons : p;
            }
        }
        hj10Var = new hj10(this, continuationImpl);
        Object obj2 = hj10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hj10Var.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        kj10 kj10Var;
        int i;
        Object b;
        nj10 nj10Var;
        Logger logger;
        AppInfo appInfo;
        AppInfo appInfo2;
        Object obj;
        nj10 nj10Var2;
        Throwable a;
        try {
            if (continuationImpl instanceof kj10) {
                kj10Var = (kj10) continuationImpl;
                int i2 = kj10Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kj10Var.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = kj10Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = kj10Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        List<String> invoke = this.m.invoke();
                        this.d.storeTiming("host_get_arbiter");
                        kj10Var.L$0 = this;
                        kj10Var.label = 1;
                        b = b(invoke, kj10Var);
                        if (b != coroutineSingletons) {
                            nj10Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            appInfo2 = (AppInfo) kj10Var.L$1;
                            nj10Var2 = (nj10) kj10Var.L$0;
                            kotlin.a.a(obj2);
                            obj = ((Result) obj2).d();
                            nj10Var2.c.send(new rhi0(appInfo2.getPackageName(), obj, nj10Var2.d.getTimePassed("send_elections_request")));
                            return Boolean.valueOf(!(obj instanceof Result.Failure));
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        appInfo2 = (AppInfo) kj10Var.L$1;
                        nj10Var2 = (nj10) kj10Var.L$0;
                        kotlin.a.a(obj2);
                        obj = ((Result) obj2).d();
                        a = Result.a(obj);
                        if (a != null) {
                            nj10Var2.o.error("IPC sendRequestToInitiateElections failed", a);
                        }
                        if (!(obj instanceof Result.Failure)) {
                            obj = s3q0.a;
                        }
                        nj10Var2.c.send(new rhi0(appInfo2.getPackageName(), obj, nj10Var2.d.getTimePassed("send_elections_request")));
                        return Boolean.valueOf(!(obj instanceof Result.Failure));
                    }
                    nj10Var = (nj10) kj10Var.L$0;
                    kotlin.a.a(obj2);
                    b = ((Result) obj2).d();
                    AnalyticsSender analyticsSender = nj10Var.c;
                    logger = nj10Var.o;
                    AnalyticsTimingsStore analyticsTimingsStore = nj10Var.d;
                    analyticsSender.send(new opt(analyticsTimingsStore.getTimePassed("host_get_arbiter"), b));
                    kotlin.a.a(b);
                    appInfo = (AppInfo) b;
                    Logger.DefaultImpls.info$default(logger, "Send request to master elections", null, 2, null);
                    analyticsTimingsStore.storeTiming("send_elections_request");
                    if (epx.f(appInfo.getPackageName(), nj10Var.a.getPackageName())) {
                        ak10 ak10Var = new ak10(nj10Var.a, appInfo, nj10Var.o, 0L, new jj10(nj10Var, appInfo));
                        ak10 putIfAbsent = nj10Var.f.putIfAbsent(appInfo, ak10Var);
                        if (putIfAbsent != null) {
                            ak10Var = putIfAbsent;
                        }
                        kj10Var.L$0 = nj10Var;
                        kj10Var.L$1 = appInfo;
                        kj10Var.label = 3;
                        Object q = ak10Var.q(kj10Var);
                        if (q != coroutineSingletons) {
                            appInfo2 = appInfo;
                            obj = q;
                            nj10Var2 = nj10Var;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            if (!(obj instanceof Result.Failure)) {
                            }
                            nj10Var2.c.send(new rhi0(appInfo2.getPackageName(), obj, nj10Var2.d.getTimePassed("send_elections_request")));
                            return Boolean.valueOf(!(obj instanceof Result.Failure));
                        }
                    } else {
                        kj10Var.L$0 = nj10Var;
                        kj10Var.L$1 = appInfo;
                        kj10Var.label = 2;
                        Object g = nj10Var.g(kj10Var);
                        if (g != coroutineSingletons) {
                            appInfo2 = appInfo;
                            obj = g;
                            nj10Var2 = nj10Var;
                            nj10Var2.c.send(new rhi0(appInfo2.getPackageName(), obj, nj10Var2.d.getTimePassed("send_elections_request")));
                            return Boolean.valueOf(!(obj instanceof Result.Failure));
                        }
                    }
                    return coroutineSingletons;
                }
            }
            kotlin.a.a(b);
            appInfo = (AppInfo) b;
            Logger.DefaultImpls.info$default(logger, "Send request to master elections", null, 2, null);
            analyticsTimingsStore.storeTiming("send_elections_request");
            if (epx.f(appInfo.getPackageName(), nj10Var.a.getPackageName())) {
            }
            return coroutineSingletons;
        } catch (Exception e) {
            logger.error("Unable to getArbiter", e);
            return Boolean.FALSE;
        }
        kj10Var = new kj10(this, continuationImpl);
        Object obj22 = kj10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kj10Var.label;
        if (i != 0) {
        }
        AnalyticsSender analyticsSender2 = nj10Var.c;
        logger = nj10Var.o;
        AnalyticsTimingsStore analyticsTimingsStore2 = nj10Var.d;
        analyticsSender2.send(new opt(analyticsTimingsStore2.getTimePassed("host_get_arbiter"), b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v4, types: [xsna.izs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, fzs fzsVar, ContinuationImpl continuationImpl) {
        lj10 lj10Var;
        int i;
        Object b;
        nj10 nj10Var;
        fzs fzsVar2;
        Object g;
        if (continuationImpl instanceof lj10) {
            lj10Var = (lj10) continuationImpl;
            int i2 = lj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lj10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = lj10Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lj10Var.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lj10Var.L$0 = this;
                    lj10Var.L$1 = fzsVar;
                    lj10Var.label = 1;
                    b = this.j.b(str, lj10Var);
                    if (b != coroutineSingletons) {
                        nj10Var = this;
                        fzsVar2 = fzsVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    g = ((Result) obj).d();
                    z = true ^ (g instanceof Result.Failure);
                    return Boolean.valueOf(z);
                }
                ?? r7 = (izs) lj10Var.L$1;
                nj10Var = (nj10) lj10Var.L$0;
                kotlin.a.a(obj);
                b = ((Result) obj).d();
                fzsVar2 = r7;
                if (Result.a(b) == null) {
                    Boolean bool = Boolean.FALSE;
                    fzsVar2.invoke(bool);
                    return bool;
                }
                Boolean bool2 = (Boolean) b;
                boolean booleanValue = bool2.booleanValue();
                fzsVar2.invoke(bool2);
                if (booleanValue) {
                    lj10Var.L$0 = null;
                    lj10Var.L$1 = null;
                    lj10Var.label = 2;
                    g = nj10Var.g(lj10Var);
                }
                return Boolean.valueOf(z);
            }
        }
        lj10Var = new lj10(this, continuationImpl);
        Object obj2 = lj10Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lj10Var.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (Result.a(b) == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        mj10 mj10Var;
        int i;
        Object c;
        if (continuationImpl instanceof mj10) {
            mj10Var = (mj10) continuationImpl;
            int i2 = mj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mj10Var.label = i2 - Integer.MIN_VALUE;
                Object obj = mj10Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mj10Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger logger = this.o;
                    Logger.DefaultImpls.info$default(logger, "tryToStartElectionService", null, 2, null);
                    Context context = this.a;
                    try {
                        context.startService(new Intent(context, (Class<?>) MasterSelectionService.class));
                        return s3q0.a;
                    } catch (IllegalStateException e) {
                        logger.error("Unable to start master selection service", e);
                        mj10Var.label = 1;
                        c = c(null, mj10Var);
                        if (c == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    c = ((Result) obj).d();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                return s3q0.a;
            }
        }
        mj10Var = new mj10(this, continuationImpl);
        Object obj3 = mj10Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mj10Var.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
