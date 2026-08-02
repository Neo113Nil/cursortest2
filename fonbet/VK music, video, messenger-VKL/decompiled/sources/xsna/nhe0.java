package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.common.messaging.NotificationParams;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.push.OnDeleteMessagesResult;
import com.vk.push.core.push.SendPushesResult;
import com.vk.push.core.utils.MessageIdUtilsKt;
import com.vk.push.pushsdk.client.ipc.AppNotInstalledException;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonToken;
import xsna.dje0;
import xsna.dwl;
import xsna.eje0;

/* compiled from: PushDeliveryComponent.kt */
/* loaded from: classes5.dex */
public final class nhe0 extends rc6 {
    public final vie0 f;
    public final fje0 g;
    public final ske0 h;
    public final don0 i;
    public final sul j;
    public final CrashReporterRepository k;
    public final AnalyticsSender l;
    public final AnalyticsTimingsStore m;
    public final u8x0 n;
    public final Logger o;
    public final ConcurrentHashMap<String, eyx> p;
    public final ConcurrentHashMap<String, eyx> q;
    public volatile yok0 r;

    /* compiled from: PushDeliveryComponent.kt */
    @b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$stopDeliverToClientAndDeleteIt$1", f = "PushDeliveryComponent.kt", l = {JsonToken.BEGIN_ARRAY}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$packageName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return nhe0.this.new a(this.$packageName, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sul sulVar = nhe0.this.j;
                String str = this.$packageName;
                this.label = 1;
                if (sulVar.a(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            nhe0.this.a(this.$packageName);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhe0(vie0 vie0Var, g790 g790Var, fje0 fje0Var, ske0 ske0Var, don0 don0Var, Logger logger, sul sulVar, CrashReporterRepository crashReporterRepository, AnalyticsSender analyticsSender, AnalyticsTimingsStore analyticsTimingsStore, u8x0 u8x0Var) {
        super(g790Var, wgl.c);
        bdn bdnVar = bdn.a;
        this.f = vie0Var;
        this.g = fje0Var;
        this.h = ske0Var;
        this.i = don0Var;
        this.j = sulVar;
        this.k = crashReporterRepository;
        this.l = analyticsSender;
        this.m = analyticsTimingsStore;
        this.n = u8x0Var;
        this.o = logger.createLogger("PushDelivery");
        this.p = new ConcurrentHashMap<>();
        this.q = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (r12 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(nhe0 nhe0Var, AppInfo appInfo, List list, ContinuationImpl continuationImpl) {
        fhe0 fhe0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        fje0 fje0Var;
        nhe0 nhe0Var2;
        AppInfo appInfo2;
        Object c;
        nhe0Var.getClass();
        if (continuationImpl instanceof fhe0) {
            fhe0Var = (fhe0) continuationImpl;
            int i2 = fhe0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fhe0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = fhe0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fhe0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(nhe0Var.o, "Has " + list.size() + " expired by ttl messages to delete", null, 2, null);
                    dje0 dje0Var = (dje0) j5g.a0(list);
                    if (dje0Var == null) {
                        return s3q0.a;
                    }
                    long j = dje0Var.b;
                    ske0 ske0Var = nhe0Var.h;
                    fhe0Var.L$0 = nhe0Var;
                    fhe0Var.L$1 = appInfo;
                    fhe0Var.L$2 = list;
                    fhe0Var.label = 1;
                    obj = ske0Var.o(j, fhe0Var);
                } else if (i == 1) {
                    list = (List) fhe0Var.L$2;
                    appInfo = (AppInfo) fhe0Var.L$1;
                    nhe0Var = (nhe0) fhe0Var.L$0;
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        appInfo2 = (AppInfo) fhe0Var.L$1;
                        nhe0Var2 = (nhe0) fhe0Var.L$0;
                        kotlin.a.a(obj);
                        c = ((Result) obj).d();
                        if (c instanceof Result.Failure) {
                            c = null;
                        }
                        if (c == OnDeleteMessagesResult.OK) {
                            Logger.DefaultImpls.info$default(nhe0Var2.o, "On delete messages delivered to " + appInfo2.getPackageName(), null, 2, null);
                        } else {
                            Logger.DefaultImpls.error$default(nhe0Var2.o, "Failed to deliver on delete messages to " + appInfo2.getPackageName(), null, 2, null);
                        }
                        return s3q0.a;
                    }
                    String str2 = (String) fhe0Var.L$3;
                    List list2 = (List) fhe0Var.L$2;
                    AppInfo appInfo3 = (AppInfo) fhe0Var.L$1;
                    nhe0 nhe0Var3 = (nhe0) fhe0Var.L$0;
                    kotlin.a.a(obj);
                    str = str2;
                    appInfo2 = appInfo3;
                    list = list2;
                    nhe0Var2 = nhe0Var3;
                    nhe0Var2.l.send(new zul(appInfo2.getPackageName(), list, str));
                    vie0 vie0Var = nhe0Var2.f;
                    fhe0Var.L$0 = nhe0Var2;
                    fhe0Var.L$1 = appInfo2;
                    fhe0Var.L$2 = null;
                    fhe0Var.L$3 = null;
                    fhe0Var.label = 3;
                    c = vie0Var.c(appInfo2, fhe0Var);
                }
                str = (String) obj;
                if (str == null) {
                    str = "";
                }
                fje0Var = nhe0Var.g;
                fhe0Var.L$0 = nhe0Var;
                fhe0Var.L$1 = appInfo;
                fhe0Var.L$2 = list;
                fhe0Var.L$3 = str;
                fhe0Var.label = 2;
                if (fje0Var.c(list, fhe0Var) != coroutineSingletons) {
                    AppInfo appInfo4 = appInfo;
                    nhe0Var2 = nhe0Var;
                    appInfo2 = appInfo4;
                    nhe0Var2.l.send(new zul(appInfo2.getPackageName(), list, str));
                    vie0 vie0Var2 = nhe0Var2.f;
                    fhe0Var.L$0 = nhe0Var2;
                    fhe0Var.L$1 = appInfo2;
                    fhe0Var.L$2 = null;
                    fhe0Var.L$3 = null;
                    fhe0Var.label = 3;
                    c = vie0Var2.c(appInfo2, fhe0Var);
                }
                return coroutineSingletons;
            }
        }
        fhe0Var = new fhe0(nhe0Var, continuationImpl);
        Object obj2 = fhe0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fhe0Var.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        fje0Var = nhe0Var.g;
        fhe0Var.L$0 = nhe0Var;
        fhe0Var.L$1 = appInfo;
        fhe0Var.L$2 = list;
        fhe0Var.L$3 = str;
        fhe0Var.label = 2;
        if (fje0Var.c(list, fhe0Var) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0161, code lost:
    
        if (r1.d(r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0144, code lost:
    
        if (r1.e(r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00cd, code lost:
    
        if (r1.a(r2) == r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x035f A[LOOP:1: B:55:0x0359->B:57:0x035f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae A[LOOP:3: B:72:0x01a8->B:74:0x01ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(nhe0 nhe0Var, AppInfo appInfo, List list, ContinuationImpl continuationImpl) {
        jhe0 jhe0Var;
        AppInfo appInfo2;
        List list2;
        nhe0 nhe0Var2;
        List list3;
        Object a2;
        nhe0 nhe0Var3;
        List list4;
        Object obj;
        AppInfo appInfo3;
        List list5;
        Object obj2;
        List list6;
        nhe0 nhe0Var4;
        Object obj3;
        Iterator<ewl> it;
        nhe0 nhe0Var5 = nhe0Var;
        nhe0Var5.getClass();
        if (continuationImpl instanceof jhe0) {
            jhe0Var = (jhe0) continuationImpl;
            int i = jhe0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jhe0Var.label = i - Integer.MIN_VALUE;
                Object obj4 = jhe0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (jhe0Var.label) {
                    case 0:
                        kotlin.a.a(obj4);
                        u8x0 u8x0Var = nhe0Var5.n;
                        jhe0Var.L$0 = nhe0Var5;
                        appInfo2 = appInfo;
                        jhe0Var.L$1 = appInfo2;
                        list2 = list;
                        jhe0Var.L$2 = list2;
                        jhe0Var.label = 1;
                        break;
                    case 1:
                        List list7 = (List) jhe0Var.L$2;
                        appInfo2 = (AppInfo) jhe0Var.L$1;
                        nhe0 nhe0Var6 = (nhe0) jhe0Var.L$0;
                        kotlin.a.a(obj4);
                        list2 = list7;
                        nhe0Var5 = nhe0Var6;
                        Logger.DefaultImpls.info$default(nhe0Var5.o, "Send " + list2.size() + " messages to " + appInfo2.getPackageName(), null, 2, null);
                        nhe0Var5.m.storeTiming("push_to_client_send");
                        jhe0Var.L$0 = nhe0Var5;
                        jhe0Var.L$1 = appInfo2;
                        jhe0Var.L$2 = list2;
                        jhe0Var.label = 2;
                        obj4 = nhe0Var5.d(list2, jhe0Var);
                        if (obj4 != coroutineSingletons) {
                            List list8 = list2;
                            nhe0Var2 = nhe0Var5;
                            list3 = list8;
                            List list9 = (List) obj4;
                            vie0 vie0Var = nhe0Var2.f;
                            jhe0Var.L$0 = nhe0Var2;
                            jhe0Var.L$1 = appInfo2;
                            jhe0Var.L$2 = list3;
                            jhe0Var.L$3 = list9;
                            jhe0Var.label = 3;
                            a2 = vie0Var.a(appInfo2, list9, jhe0Var);
                            if (a2 != coroutineSingletons) {
                                nhe0Var3 = nhe0Var2;
                                list4 = list3;
                                obj = a2;
                                appInfo3 = appInfo2;
                                list5 = list9;
                                if (!(obj instanceof Result.Failure)) {
                                    u8x0 u8x0Var2 = nhe0Var3.n;
                                    jhe0Var.L$0 = nhe0Var3;
                                    jhe0Var.L$1 = appInfo3;
                                    jhe0Var.L$2 = list4;
                                    jhe0Var.L$3 = list5;
                                    jhe0Var.L$4 = obj;
                                    jhe0Var.label = 4;
                                    break;
                                }
                                if (Result.a(obj) != null) {
                                    u8x0 u8x0Var3 = nhe0Var3.n;
                                    jhe0Var.L$0 = nhe0Var3;
                                    jhe0Var.L$1 = appInfo3;
                                    jhe0Var.L$2 = list4;
                                    jhe0Var.L$3 = list5;
                                    jhe0Var.L$4 = obj;
                                    jhe0Var.label = 5;
                                    break;
                                }
                                obj2 = obj;
                                String packageName = appInfo3.getPackageName();
                                AnalyticsTimingsStore analyticsTimingsStore = nhe0Var3.m;
                                Logger logger = nhe0Var3.o;
                                long timePassed = analyticsTimingsStore.getTimePassed("push_to_client_send");
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj5 : list5) {
                                    String receivedBy = ((RemoteMessage) obj5).getReceivedBy();
                                    Object obj6 = linkedHashMap.get(receivedBy);
                                    if (obj6 == null) {
                                        obj6 = s5a.a(receivedBy, linkedHashMap);
                                    }
                                    ((List) obj6).add(obj5);
                                }
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    nhe0Var3.l.send(new oke0(timePassed, obj2, packageName, (String) entry.getKey(), (List) entry.getValue()));
                                }
                                if ((!(obj2 instanceof Result.Failure) ? null : obj2) == SendPushesResult.OK) {
                                    if (Result.a(obj2) instanceof HostIsNotMasterException) {
                                        Logger.DefaultImpls.error$default(logger, "Failed to deliver messages to " + appInfo3.getPackageName() + ", this host is not a master", null, 2, null);
                                        nhe0Var3.f(appInfo3.getPackageName());
                                    } else if (Result.a(obj2) instanceof SdkIsNotInitializedException) {
                                        Logger.DefaultImpls.error$default(logger, "Failed to deliver messages to " + appInfo3.getPackageName() + ", client is not initialized", null, 2, null);
                                    } else if (Result.a(obj2) instanceof AppNotInstalledException) {
                                        Logger.DefaultImpls.error$default(logger, "Failed to deliver messages to uninstalled " + appInfo3.getPackageName(), null, 2, null);
                                        nhe0Var3.f(appInfo3.getPackageName());
                                    } else {
                                        Throwable a3 = Result.a(obj2);
                                        if (a3 != null) {
                                            nhe0Var3.k.nonFatalReport(new IllegalStateException("failed delivery to " + appInfo3.getPackageName(), a3), IssueKey.FAILED_TO_DELIVER_PUSH);
                                        }
                                    }
                                    List<dje0> list10 = list4;
                                    ArrayList arrayList = new ArrayList(c5g.u(list10, 10));
                                    while (r1.hasNext()) {
                                    }
                                    dwl.a aVar = new dwl.a(arrayList);
                                    it = nhe0Var3.d.iterator();
                                    while (it.hasNext()) {
                                    }
                                    return obj2;
                                }
                                Logger.DefaultImpls.info$default(logger, "Delivered all messages to " + appInfo3.getPackageName(), null, 2, null);
                                fje0 fje0Var = nhe0Var3.g;
                                jhe0Var.L$0 = nhe0Var3;
                                jhe0Var.L$1 = list4;
                                jhe0Var.L$2 = obj2;
                                jhe0Var.L$3 = null;
                                jhe0Var.L$4 = null;
                                jhe0Var.label = 6;
                                if (fje0Var.c(list4, jhe0Var) != coroutineSingletons) {
                                    list6 = list4;
                                    nhe0Var4 = nhe0Var3;
                                    obj3 = obj2;
                                    obj2 = obj3;
                                    nhe0Var3 = nhe0Var4;
                                    list4 = list6;
                                    List<dje0> list102 = list4;
                                    ArrayList arrayList2 = new ArrayList(c5g.u(list102, 10));
                                    for (dje0 dje0Var : list102) {
                                        long j = dje0Var.c;
                                        String str = dje0Var.d;
                                        MessagePriority messagePriority = dje0Var.e;
                                        Integer num = dje0Var.f;
                                        int i2 = dje0Var.g;
                                        Long l = dje0Var.h;
                                        long longValue = l != null ? l.longValue() : 0L;
                                        String str2 = dje0Var.i;
                                        byte[] bArr = dje0Var.j;
                                        String obj7 = bArr != null ? bArr.toString() : null;
                                        dje0.a aVar2 = dje0Var.k;
                                        arrayList2.add(new eje0(j, str, messagePriority, num, i2, longValue, str2, obj7, new eje0.a(aVar2 != null ? aVar2.a : null, aVar2 != null ? aVar2.b : null, aVar2 != null ? aVar2.c : null, aVar2 != null ? aVar2.d : null, aVar2 != null ? aVar2.e : null, aVar2 != null ? aVar2.f : null, aVar2 != null ? aVar2.g : null, aVar2 != null ? aVar2.h : null), dje0Var.l));
                                    }
                                    dwl.a aVar3 = new dwl.a(arrayList2);
                                    it = nhe0Var3.d.iterator();
                                    while (it.hasNext()) {
                                        it.next().a(aVar3);
                                    }
                                    return obj2;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        list3 = (List) jhe0Var.L$2;
                        appInfo2 = (AppInfo) jhe0Var.L$1;
                        nhe0Var2 = (nhe0) jhe0Var.L$0;
                        kotlin.a.a(obj4);
                        List list92 = (List) obj4;
                        vie0 vie0Var2 = nhe0Var2.f;
                        jhe0Var.L$0 = nhe0Var2;
                        jhe0Var.L$1 = appInfo2;
                        jhe0Var.L$2 = list3;
                        jhe0Var.L$3 = list92;
                        jhe0Var.label = 3;
                        a2 = vie0Var2.a(appInfo2, list92, jhe0Var);
                        if (a2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        List list11 = (List) jhe0Var.L$3;
                        List list12 = (List) jhe0Var.L$2;
                        AppInfo appInfo4 = (AppInfo) jhe0Var.L$1;
                        nhe0 nhe0Var7 = (nhe0) jhe0Var.L$0;
                        kotlin.a.a(obj4);
                        nhe0Var3 = nhe0Var7;
                        appInfo3 = appInfo4;
                        list4 = list12;
                        list5 = list11;
                        obj = ((Result) obj4).d();
                        if (!(obj instanceof Result.Failure)) {
                        }
                        if (Result.a(obj) != null) {
                        }
                        obj2 = obj;
                        String packageName2 = appInfo3.getPackageName();
                        AnalyticsTimingsStore analyticsTimingsStore2 = nhe0Var3.m;
                        Logger logger2 = nhe0Var3.o;
                        long timePassed2 = analyticsTimingsStore2.getTimePassed("push_to_client_send");
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        while (r4.hasNext()) {
                        }
                        while (r0.hasNext()) {
                        }
                        if ((!(obj2 instanceof Result.Failure) ? null : obj2) == SendPushesResult.OK) {
                        }
                        break;
                    case 4:
                        obj = jhe0Var.L$4;
                        list5 = (List) jhe0Var.L$3;
                        list4 = (List) jhe0Var.L$2;
                        appInfo3 = (AppInfo) jhe0Var.L$1;
                        nhe0Var3 = (nhe0) jhe0Var.L$0;
                        kotlin.a.a(obj4);
                        if (Result.a(obj) != null) {
                        }
                        obj2 = obj;
                        String packageName22 = appInfo3.getPackageName();
                        AnalyticsTimingsStore analyticsTimingsStore22 = nhe0Var3.m;
                        Logger logger22 = nhe0Var3.o;
                        long timePassed22 = analyticsTimingsStore22.getTimePassed("push_to_client_send");
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                        while (r4.hasNext()) {
                        }
                        while (r0.hasNext()) {
                        }
                        if ((!(obj2 instanceof Result.Failure) ? null : obj2) == SendPushesResult.OK) {
                        }
                        break;
                    case 5:
                        obj = jhe0Var.L$4;
                        list5 = (List) jhe0Var.L$3;
                        list4 = (List) jhe0Var.L$2;
                        appInfo3 = (AppInfo) jhe0Var.L$1;
                        nhe0Var3 = (nhe0) jhe0Var.L$0;
                        kotlin.a.a(obj4);
                        obj2 = obj;
                        String packageName222 = appInfo3.getPackageName();
                        AnalyticsTimingsStore analyticsTimingsStore222 = nhe0Var3.m;
                        Logger logger222 = nhe0Var3.o;
                        long timePassed222 = analyticsTimingsStore222.getTimePassed("push_to_client_send");
                        LinkedHashMap linkedHashMap222 = new LinkedHashMap();
                        while (r4.hasNext()) {
                        }
                        while (r0.hasNext()) {
                        }
                        if ((!(obj2 instanceof Result.Failure) ? null : obj2) == SendPushesResult.OK) {
                        }
                        break;
                    case 6:
                        obj3 = jhe0Var.L$2;
                        list6 = (List) jhe0Var.L$1;
                        nhe0Var4 = (nhe0) jhe0Var.L$0;
                        kotlin.a.a(obj4);
                        obj2 = obj3;
                        nhe0Var3 = nhe0Var4;
                        list4 = list6;
                        List<dje0> list1022 = list4;
                        ArrayList arrayList22 = new ArrayList(c5g.u(list1022, 10));
                        while (r1.hasNext()) {
                        }
                        dwl.a aVar32 = new dwl.a(arrayList22);
                        it = nhe0Var3.d.iterator();
                        while (it.hasNext()) {
                        }
                        return obj2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        jhe0Var = new jhe0(nhe0Var5, continuationImpl);
        Object obj42 = jhe0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (jhe0Var.label) {
        }
    }

    @Override // xsna.rc6
    public final void a(String str) {
        this.c.remove(str);
        eyx remove = this.p.remove(str);
        if (remove != null) {
            remove.b(null);
        }
        eyx remove2 = this.q.remove(str);
        if (remove2 != null) {
            remove2.b(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00b6 -> B:10:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00cf -> B:14:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        hhe0 hhe0Var;
        nhe0 nhe0Var;
        int i;
        Map map;
        nhe0 nhe0Var2;
        Iterator it;
        Collection collection;
        Map<String, String> map2;
        String name;
        ClickActionType clickActionType;
        if (continuationImpl instanceof hhe0) {
            hhe0Var = (hhe0) continuationImpl;
            int i2 = hhe0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hhe0Var.label = i2 - Integer.MIN_VALUE;
                nhe0Var = this;
                Object obj = hhe0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hhe0Var.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.a.a(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    map = linkedHashMap;
                    nhe0Var2 = nhe0Var;
                    it = list2.iterator();
                    collection = arrayList;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = hhe0Var.J$0;
                    collection = (Collection) hhe0Var.L$7;
                    Long l = (Long) hhe0Var.L$6;
                    map = (Map) hhe0Var.L$5;
                    dje0 dje0Var = (dje0) hhe0Var.L$4;
                    it = (Iterator) hhe0Var.L$3;
                    Collection collection2 = (Collection) hhe0Var.L$2;
                    Map map3 = (Map) hhe0Var.L$1;
                    nhe0Var2 = (nhe0) hhe0Var.L$0;
                    kotlin.a.a(obj);
                    String str = (String) obj;
                    if (str == null) {
                        str = "";
                    }
                    Pair pair = new Pair(l, str);
                    map.put(pair.i(), pair.j());
                    map = map3;
                    String str2 = (String) map.get(new Long(j));
                    if (str2 == null) {
                        str2 = "";
                    }
                    byte[] bArr = dje0Var.j;
                    NotificationParams.Builder builder = new NotificationParams.Builder();
                    dje0.a aVar = dje0Var.k;
                    NotificationParams build = builder.setTitle(aVar != null ? aVar.a : null).setBody(aVar != null ? aVar.b : null).setImageUrl(aVar != null ? aVar.c : null).setIcon(aVar != null ? aVar.d : null).setColor(aVar != null ? aVar.e : null).setClickAction(aVar != null ? aVar.g : null).setChannelId(aVar != null ? aVar.f : null).build();
                    Map map4 = map;
                    hhe0 hhe0Var2 = hhe0Var;
                    RemoteMessage.Builder messageId = new RemoteMessage.Builder().setMessageId(MessageIdUtilsKt.formMessageId(dje0Var.b, dje0Var.c));
                    if (bArr == null) {
                        map2 = jgp.b;
                    } else {
                        JSONObject jSONObject = new JSONObject(new String(bArr, emb.b));
                        HashMap hashMap = new HashMap(jSONObject.length());
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject.get(next).toString());
                            jSONObject = jSONObject;
                        }
                        map2 = hashMap;
                    }
                    RemoteMessage.Builder token = messageId.setData(map2).setRawData(bArr).setPriority(dje0Var.e.h()).setFrom(dje0Var.i).setTtl(dje0Var.f).setCollapseKey(dje0Var.d).setNotificationParams(build).setClickActionType((aVar != null || (clickActionType = aVar.h) == null) ? null : clickActionType.name()).setPushMessageServerReceivedAt(dje0Var.l).setToken(str2);
                    ReceivedBy receivedBy = dje0Var.n;
                    collection.add(token.setReceivedBy((receivedBy != null || (name = receivedBy.name()) == null) ? null : name.toLowerCase(Locale.ROOT)).build());
                    map = map4;
                    collection = collection2;
                    hhe0Var = hhe0Var2;
                    i3 = 1;
                    if (!it.hasNext()) {
                        dje0Var = (dje0) it.next();
                        j = dje0Var.b;
                        if (map.containsKey(new Long(j))) {
                            collection2 = collection;
                            String str22 = (String) map.get(new Long(j));
                            if (str22 == null) {
                            }
                            byte[] bArr2 = dje0Var.j;
                            NotificationParams.Builder builder2 = new NotificationParams.Builder();
                            dje0.a aVar2 = dje0Var.k;
                            NotificationParams build2 = builder2.setTitle(aVar2 != null ? aVar2.a : null).setBody(aVar2 != null ? aVar2.b : null).setImageUrl(aVar2 != null ? aVar2.c : null).setIcon(aVar2 != null ? aVar2.d : null).setColor(aVar2 != null ? aVar2.e : null).setClickAction(aVar2 != null ? aVar2.g : null).setChannelId(aVar2 != null ? aVar2.f : null).build();
                            Map map42 = map;
                            hhe0 hhe0Var22 = hhe0Var;
                            RemoteMessage.Builder messageId2 = new RemoteMessage.Builder().setMessageId(MessageIdUtilsKt.formMessageId(dje0Var.b, dje0Var.c));
                            if (bArr2 == null) {
                            }
                            RemoteMessage.Builder token2 = messageId2.setData(map2).setRawData(bArr2).setPriority(dje0Var.e.h()).setFrom(dje0Var.i).setTtl(dje0Var.f).setCollapseKey(dje0Var.d).setNotificationParams(build2).setClickActionType((aVar2 != null || (clickActionType = aVar2.h) == null) ? null : clickActionType.name()).setPushMessageServerReceivedAt(dje0Var.l).setToken(str22);
                            ReceivedBy receivedBy2 = dje0Var.n;
                            collection.add(token2.setReceivedBy((receivedBy2 != null || (name = receivedBy2.name()) == null) ? null : name.toLowerCase(Locale.ROOT)).build());
                            map = map42;
                            collection = collection2;
                            hhe0Var = hhe0Var22;
                            i3 = 1;
                            if (!it.hasNext()) {
                            }
                        } else {
                            l = new Long(j);
                            ske0 ske0Var = nhe0Var2.h;
                            long j2 = dje0Var.b;
                            hhe0Var.L$0 = nhe0Var2;
                            hhe0Var.L$1 = map;
                            hhe0Var.L$2 = collection;
                            hhe0Var.L$3 = it;
                            hhe0Var.L$4 = dje0Var;
                            hhe0Var.L$5 = map;
                            hhe0Var.L$6 = l;
                            hhe0Var.L$7 = collection;
                            hhe0Var.J$0 = j;
                            hhe0Var.label = i3;
                            obj = ske0Var.o(j2, hhe0Var);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            collection2 = collection;
                            map3 = map;
                            String str3 = (String) obj;
                            if (str3 == null) {
                            }
                            Pair pair2 = new Pair(l, str3);
                            map.put(pair2.i(), pair2.j());
                            map = map3;
                            String str222 = (String) map.get(new Long(j));
                            if (str222 == null) {
                            }
                            byte[] bArr22 = dje0Var.j;
                            NotificationParams.Builder builder22 = new NotificationParams.Builder();
                            dje0.a aVar22 = dje0Var.k;
                            NotificationParams build22 = builder22.setTitle(aVar22 != null ? aVar22.a : null).setBody(aVar22 != null ? aVar22.b : null).setImageUrl(aVar22 != null ? aVar22.c : null).setIcon(aVar22 != null ? aVar22.d : null).setColor(aVar22 != null ? aVar22.e : null).setClickAction(aVar22 != null ? aVar22.g : null).setChannelId(aVar22 != null ? aVar22.f : null).build();
                            Map map422 = map;
                            hhe0 hhe0Var222 = hhe0Var;
                            RemoteMessage.Builder messageId22 = new RemoteMessage.Builder().setMessageId(MessageIdUtilsKt.formMessageId(dje0Var.b, dje0Var.c));
                            if (bArr22 == null) {
                            }
                            RemoteMessage.Builder token22 = messageId22.setData(map2).setRawData(bArr22).setPriority(dje0Var.e.h()).setFrom(dje0Var.i).setTtl(dje0Var.f).setCollapseKey(dje0Var.d).setNotificationParams(build22).setClickActionType((aVar22 != null || (clickActionType = aVar22.h) == null) ? null : clickActionType.name()).setPushMessageServerReceivedAt(dje0Var.l).setToken(str222);
                            ReceivedBy receivedBy22 = dje0Var.n;
                            collection.add(token22.setReceivedBy((receivedBy22 != null || (name = receivedBy22.name()) == null) ? null : name.toLowerCase(Locale.ROOT)).build());
                            map = map422;
                            collection = collection2;
                            hhe0Var = hhe0Var222;
                            i3 = 1;
                            if (!it.hasNext()) {
                                return (List) collection;
                            }
                        }
                    }
                }
            }
        }
        nhe0Var = this;
        hhe0Var = new hhe0(nhe0Var, continuationImpl);
        Object obj2 = hhe0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hhe0Var.label;
        int i32 = 1;
        if (i != 0) {
        }
    }

    public final void e() {
        Logger.DefaultImpls.info$default(this.o, "stop deliver", null, 2, null);
        iyx.d(this.b.b);
        this.c.clear();
        this.p.clear();
        this.q.clear();
    }

    public final void f(String str) {
        myc0.h(this.b, null, null, new a(str, null), 3);
    }
}
