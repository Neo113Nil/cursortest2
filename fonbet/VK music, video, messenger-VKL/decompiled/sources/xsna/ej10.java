package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.masterhost.ipc.HostAppInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$initMastersElectionsAndGetMaster$2", f = "MasterHostElectionsInteractor.kt", l = {151, 187, PsExtractor.AUDIO_STREAM, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ej10 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends AppInfo>>, Object> {
    final /* synthetic */ CallingAppIds $callingAppIds;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej10(CallingAppIds callingAppIds, spj spjVar, nj10 nj10Var) {
        super(2, spjVar);
        this.this$0 = nj10Var;
        this.$callingAppIds = callingAppIds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ej10(this.$callingAppIds, spjVar, this.this$0);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends AppInfo>> spjVar) {
        return ((ej10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0244, code lost:
    
        if (r12 == r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0247, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0277, code lost:
    
        if (r12 == r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0210, code lost:
    
        if (r3.d(r7, r11) != r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        if (r12 != r0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177 A[LOOP:0: B:41:0x0171->B:43:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, com.vk.push.common.AppInfo, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> invoke;
        Object m105getHostListgIAlus;
        CallingAppIds callingAppIds;
        AppInfo appInfo;
        List list;
        Iterator it;
        Object m106getMastergIAlus;
        List list2;
        AppInfo appInfo2;
        String str;
        String packageName;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (this.label) {
                case 0:
                    kotlin.a.a(obj);
                    invoke = this.this$0.m.invoke();
                    MasterHostApi masterHostApi = this.this$0.e;
                    this.L$0 = invoke;
                    this.label = 1;
                    m105getHostListgIAlus = masterHostApi.m105getHostListgIAlus(invoke, this);
                    if (m105getHostListgIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kotlin.a.a(m105getHostListgIAlus);
                    List list3 = (List) m105getHostListgIAlus;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    callingAppIds = this.$callingAppIds;
                    if (callingAppIds != null) {
                        Object m97invokeIoAF18A = this.this$0.n.m97invokeIoAF18A(callingAppIds);
                        nj10 nj10Var = this.this$0;
                        if (!(m97invokeIoAF18A instanceof Result.Failure)) {
                            try {
                                ?? r7 = (AppInfo) m97invokeIoAF18A;
                                yiz yizVar = nj10Var.i;
                                if (!list3.contains(r7)) {
                                    throw new IllegalStateException("Caller app isn't a valid host");
                                }
                                ref$ObjectRef.element = r7;
                                m97invokeIoAF18A = s3q0.a;
                            } catch (Throwable th) {
                                m97invokeIoAF18A = new Result.Failure(th);
                            }
                        }
                        Throwable a = Result.a(m97invokeIoAF18A);
                        if (a != null) {
                            return new Result(new Result.Failure(a));
                        }
                    }
                    AnalyticsSender analyticsSender = this.this$0.c;
                    appInfo = (AppInfo) ref$ObjectRef.element;
                    if (appInfo != null || (r6 = appInfo.getPackageName()) == null) {
                        String packageName2 = this.this$0.a.getPackageName();
                    }
                    analyticsSender.send(new frt(packageName2));
                    nj10 nj10Var2 = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        AppInfo appInfo3 = (AppInfo) obj2;
                        if (invoke.contains(appInfo3.getPackageName()) && !epx.f(appInfo3.getPackageName(), nj10Var2.a.getPackageName())) {
                            arrayList.add(obj2);
                        }
                    }
                    HostAppInfo.b bVar = HostAppInfo.Companion;
                    String packageName3 = this.this$0.a.getPackageName();
                    boolean isIgnoringBatteryOptimizations$default = PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(this.this$0.a, null, 1, null);
                    bVar.getClass();
                    HostAppInfo a2 = HostAppInfo.b.a(packageName3, isIgnoringBatteryOptimizations$default);
                    nj10 nj10Var3 = this.this$0;
                    this.L$0 = arrayList;
                    this.label = 2;
                    nj10Var3.getClass();
                    bdn bdnVar = bdn.a;
                    obj = myc0.k(wgl.c, new bj10(arrayList, a2, nj10Var3, null), this);
                    if (obj != coroutineSingletons) {
                        list = arrayList;
                        List list4 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((HostAppInfo) it.next()).getHostAppInfoValue());
                        }
                        this.this$0.d.storeTiming("arbiter_get_master");
                        MasterHostApi masterHostApi2 = this.this$0.e;
                        this.L$0 = list;
                        this.label = 3;
                        m106getMastergIAlus = masterHostApi2.m106getMastergIAlus(arrayList2, this);
                        break;
                    }
                    return coroutineSingletons;
                case 1:
                    invoke = (List) this.L$0;
                    kotlin.a.a(obj);
                    m105getHostListgIAlus = ((Result) obj).d();
                    kotlin.a.a(m105getHostListgIAlus);
                    List list32 = (List) m105getHostListgIAlus;
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    callingAppIds = this.$callingAppIds;
                    if (callingAppIds != null) {
                    }
                    AnalyticsSender analyticsSender2 = this.this$0.c;
                    appInfo = (AppInfo) ref$ObjectRef2.element;
                    if (appInfo != null) {
                        break;
                    }
                    String packageName22 = this.this$0.a.getPackageName();
                    analyticsSender2.send(new frt(packageName22));
                    nj10 nj10Var22 = this.this$0;
                    ArrayList arrayList3 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    HostAppInfo.b bVar2 = HostAppInfo.Companion;
                    String packageName32 = this.this$0.a.getPackageName();
                    boolean isIgnoringBatteryOptimizations$default2 = PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(this.this$0.a, null, 1, null);
                    bVar2.getClass();
                    HostAppInfo a22 = HostAppInfo.b.a(packageName32, isIgnoringBatteryOptimizations$default2);
                    nj10 nj10Var32 = this.this$0;
                    this.L$0 = arrayList3;
                    this.label = 2;
                    nj10Var32.getClass();
                    bdn bdnVar2 = bdn.a;
                    obj = myc0.k(wgl.c, new bj10(arrayList3, a22, nj10Var32, null), this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                case 2:
                    list = (List) this.L$0;
                    kotlin.a.a(obj);
                    List list42 = (List) obj;
                    ArrayList arrayList22 = new ArrayList(c5g.u(list42, 10));
                    it = list42.iterator();
                    while (it.hasNext()) {
                    }
                    this.this$0.d.storeTiming("arbiter_get_master");
                    MasterHostApi masterHostApi22 = this.this$0.e;
                    this.L$0 = list;
                    this.label = 3;
                    m106getMastergIAlus = masterHostApi22.m106getMastergIAlus(arrayList22, this);
                    break;
                case 3:
                    list = (List) this.L$0;
                    kotlin.a.a(obj);
                    m106getMastergIAlus = ((Result) obj).d();
                    nj10 nj10Var4 = this.this$0;
                    nj10Var4.c.send(new ost(nj10Var4.d.getTimePassed("arbiter_get_master"), m106getMastergIAlus));
                    try {
                        kotlin.a.a(m106getMastergIAlus);
                        AppInfo appInfo4 = (AppInfo) m106getMastergIAlus;
                        bk10 bk10Var = this.this$0.b;
                        this.L$0 = list;
                        this.L$1 = appInfo4;
                        this.label = 4;
                        Object a3 = bk10Var.a(this);
                        if (a3 != coroutineSingletons) {
                            list2 = list;
                            appInfo2 = appInfo4;
                            obj = a3;
                            str = (String) obj;
                            packageName = appInfo2.getPackageName();
                            Logger.DefaultImpls.info$default(this.this$0.o, y57.a("Old master package = ", str, ", new master package = ", packageName), null, 2, null);
                            Logger.DefaultImpls.info$default(this.this$0.o, "Arbiter saved master: " + appInfo2.getPackageName(), null, 2, null);
                            bk10 bk10Var2 = this.this$0.b;
                            String packageName4 = appInfo2.getPackageName();
                            this.L$0 = list2;
                            this.L$1 = appInfo2;
                            this.L$2 = str;
                            this.L$3 = packageName;
                            this.label = 5;
                            break;
                        }
                        return coroutineSingletons;
                    } catch (Exception e) {
                        this.this$0.o.error("Unable to getMaster", e);
                        return new Result(new Result.Failure(e));
                    }
                case 4:
                    appInfo2 = (AppInfo) this.L$1;
                    List list5 = (List) this.L$0;
                    kotlin.a.a(obj);
                    list2 = list5;
                    str = (String) obj;
                    packageName = appInfo2.getPackageName();
                    Logger.DefaultImpls.info$default(this.this$0.o, y57.a("Old master package = ", str, ", new master package = ", packageName), null, 2, null);
                    Logger.DefaultImpls.info$default(this.this$0.o, "Arbiter saved master: " + appInfo2.getPackageName(), null, 2, null);
                    bk10 bk10Var22 = this.this$0.b;
                    String packageName42 = appInfo2.getPackageName();
                    this.L$0 = list2;
                    this.L$1 = appInfo2;
                    this.L$2 = str;
                    this.L$3 = packageName;
                    this.label = 5;
                    break;
                case 5:
                    String str2 = (String) this.L$3;
                    str = (String) this.L$2;
                    AppInfo appInfo5 = (AppInfo) this.L$1;
                    list2 = (List) this.L$0;
                    kotlin.a.a(obj);
                    packageName = str2;
                    appInfo2 = appInfo5;
                    if (!epx.f(str, packageName)) {
                        if (str != null) {
                            Logger.DefaultImpls.info$default(this.this$0.o, "Old master not null, need notify him", null, 2, null);
                            nj10 nj10Var5 = this.this$0;
                            this.L$0 = appInfo2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 6;
                            nj10Var5.getClass();
                            Object c = whn0.c(new ij10(nj10Var5, str, packageName, null), this);
                            if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                c = s3q0.a;
                                break;
                            }
                        } else {
                            Logger.DefaultImpls.info$default(this.this$0.o, "Old master is unknown. All hosts will be notified about new master", null, 2, null);
                            nj10 nj10Var6 = this.this$0;
                            this.L$0 = appInfo2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 7;
                            nj10Var6.getClass();
                            bdn bdnVar3 = bdn.a;
                            Object k = myc0.k(wgl.c, new gj10(list2, nj10Var6, packageName, null), this);
                            if (k != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                k = s3q0.a;
                                break;
                            }
                        }
                        appInfo2 = r0;
                    }
                    nj10 nj10Var7 = this.this$0;
                    ok10 ok10Var = nj10Var7.k;
                    ok10.a(nj10Var7.a);
                    return new Result(appInfo2);
                case 6:
                case 7:
                    AppInfo appInfo6 = (AppInfo) this.L$0;
                    kotlin.a.a(obj);
                    appInfo2 = appInfo6;
                    nj10 nj10Var72 = this.this$0;
                    ok10 ok10Var2 = nj10Var72.k;
                    ok10.a(nj10Var72.a);
                    return new Result(appInfo2);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e2) {
            this.this$0.o.error("Unable to getHostList", e2);
            return new Result(new Result.Failure(e2));
        }
    }
}
