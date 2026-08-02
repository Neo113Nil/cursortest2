package com.yandex.go.scooters.ignition.analytics;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.go.scooters.ignition.analytics.a;
import com.yandex.go.scooters.ignition.data.j;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.bg5;
import defpackage.brn0;
import defpackage.bvf0;
import defpackage.hit;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.ky2;
import defpackage.lx4;
import defpackage.mdh;
import defpackage.mh;
import defpackage.nd3;
import defpackage.nsn0;
import defpackage.ny61;
import defpackage.q82;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vkn0;
import defpackage.w3j0;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final PowerManager b;
    public final tt2 c;
    public final ky2 d;
    public final lx4 e;
    public final bg5 f;
    public final hit g;
    public final brn0 h;
    public final j i;
    public final i3y j;
    public final i3y k;

    public a(Context context, PowerManager powerManager, tt2 tt2Var, ky2 ky2Var, lx4 lx4Var, bg5 bg5Var, hit hitVar, brn0 brn0Var, j jVar) {
        this.a = context;
        this.b = powerManager;
        this.c = tt2Var;
        this.d = ky2Var;
        this.e = lx4Var;
        this.f = bg5Var;
        this.g = hitVar;
        this.h = brn0Var;
        this.i = jVar;
        final int i = 0;
        this.j = kotlin.a.a(new sls(this) { // from class: msn0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        return (ActivityManager) aVar.a.getSystemService("activity");
                    default:
                        return (KeyguardManager) aVar.a.getSystemService("keyguard");
                }
            }
        });
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: msn0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        return (ActivityManager) aVar.a.getSystemService("activity");
                    default:
                        return (KeyguardManager) aVar.a.getSystemService("keyguard");
                }
            }
        });
    }

    public static /* synthetic */ Object e(a aVar, String str, tls tlsVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 4) != 0) {
            tlsVar = new vkn0(13);
        }
        return aVar.d(str, null, tlsVar, continuationImpl);
    }

    public final ActivityManager a() {
        return (ActivityManager) this.j.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (defpackage.jl40.l(r6, "response") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (defpackage.jl40.l(r7, java.lang.Boolean.FALSE) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (defpackage.jl40.l(r7, java.lang.Boolean.FALSE) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (defpackage.jl40.l(r6, "scan") == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Boolean bool, ContinuationImpl continuationImpl) {
        ScootersIgnitionTechnicalAnalytics$isEnabled$1 scootersIgnitionTechnicalAnalytics$isEnabled$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ScootersIgnitionTechnicalAnalytics$isEnabled$1) {
            scootersIgnitionTechnicalAnalytics$isEnabled$1 = (ScootersIgnitionTechnicalAnalytics$isEnabled$1) continuationImpl;
            int i2 = scootersIgnitionTechnicalAnalytics$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionTechnicalAnalytics$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionTechnicalAnalytics$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionTechnicalAnalytics$isEnabled$1.label;
                boolean z2 = true;
                if (i != 0) {
                    b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ScootersIgnitionTechnicalAnalytics$isEnabled$experiment$1 scootersIgnitionTechnicalAnalytics$isEnabled$experiment$1 = new ScootersIgnitionTechnicalAnalytics$isEnabled$experiment$1(this, null);
                    scootersIgnitionTechnicalAnalytics$isEnabled$1.L$0 = str;
                    scootersIgnitionTechnicalAnalytics$isEnabled$1.L$1 = bool;
                    scootersIgnitionTechnicalAnalytics$isEnabled$1.label = 1;
                    obj = tje.k0(mdhVar, scootersIgnitionTechnicalAnalytics$isEnabled$experiment$1, scootersIgnitionTechnicalAnalytics$isEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bool = (Boolean) scootersIgnitionTechnicalAnalytics$isEnabled$1.L$1;
                    str = (String) scootersIgnitionTechnicalAnalytics$isEnabled$1.L$0;
                    b.b(obj);
                }
                ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) obj;
                z = scootersIgnitionExperiment.b;
                boolean z3 = scootersIgnitionExperiment.m;
                if ((z || !z3) && !(z3 && jl40.l(str, "disable"))) {
                    return Boolean.FALSE;
                }
                switch (nsn0.a[scootersIgnitionExperiment.n.ordinal()]) {
                    case 1:
                        return Boolean.valueOf(z2);
                    case 2:
                        break;
                    case 3:
                        if (jl40.l(str, "scan")) {
                            break;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        if (!jl40.l(str, "request")) {
                            if (!jl40.l(str, "response")) {
                                if (jl40.l(str, "scan")) {
                                    break;
                                }
                                return Boolean.valueOf(z2);
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    case 5:
                        if (!jl40.l(str, "scan")) {
                            if (!jl40.l(str, "request")) {
                                break;
                            }
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    case 6:
                        z2 = false;
                        return Boolean.valueOf(z2);
                    default:
                        w511.b();
                        return null;
                }
            }
        }
        scootersIgnitionTechnicalAnalytics$isEnabled$1 = new ScootersIgnitionTechnicalAnalytics$isEnabled$1(this, continuationImpl);
        Object obj2 = scootersIgnitionTechnicalAnalytics$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionTechnicalAnalytics$isEnabled$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment2 = (ScootersIgnitionExperiment) obj2;
        z = scootersIgnitionExperiment2.b;
        boolean z32 = scootersIgnitionExperiment2.m;
        if (z) {
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(i iVar, String str, ContinuationImpl continuationImpl) {
        ScootersIgnitionTechnicalAnalytics$putCommon$1 scootersIgnitionTechnicalAnalytics$putCommon$1;
        int i;
        String str2;
        nd3 nd3Var;
        if (continuationImpl instanceof ScootersIgnitionTechnicalAnalytics$putCommon$1) {
            scootersIgnitionTechnicalAnalytics$putCommon$1 = (ScootersIgnitionTechnicalAnalytics$putCommon$1) continuationImpl;
            int i2 = scootersIgnitionTechnicalAnalytics$putCommon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionTechnicalAnalytics$putCommon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionTechnicalAnalytics$putCommon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionTechnicalAnalytics$putCommon$1.label;
                if (i != 0) {
                    b.b(obj);
                    iVar.c(SystemClock.elapsedRealtime(), "current_time_ms");
                    scootersIgnitionTechnicalAnalytics$putCommon$1.L$0 = null;
                    scootersIgnitionTechnicalAnalytics$putCommon$1.L$1 = str;
                    scootersIgnitionTechnicalAnalytics$putCommon$1.L$2 = iVar;
                    scootersIgnitionTechnicalAnalytics$putCommon$1.L$3 = "ignition_user_session_uuid";
                    scootersIgnitionTechnicalAnalytics$putCommon$1.label = 1;
                    Object a = this.i.a(scootersIgnitionTechnicalAnalytics$putCommon$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    str2 = "ignition_user_session_uuid";
                    nd3Var = iVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) scootersIgnitionTechnicalAnalytics$putCommon$1.L$3;
                    nd3 nd3Var2 = (w3j0) scootersIgnitionTechnicalAnalytics$putCommon$1.L$2;
                    str = (String) scootersIgnitionTechnicalAnalytics$putCommon$1.L$1;
                    b.b(obj);
                    nd3Var = nd3Var2;
                }
                nd3Var.a.put(str2, (String) obj);
                nd3Var.a.put(CRLReasonCodeExtension.REASON, str);
                return nd3Var;
            }
        }
        scootersIgnitionTechnicalAnalytics$putCommon$1 = new ScootersIgnitionTechnicalAnalytics$putCommon$1(this, continuationImpl);
        Object obj2 = scootersIgnitionTechnicalAnalytics$putCommon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionTechnicalAnalytics$putCommon$1.label;
        if (i != 0) {
        }
        nd3Var.a.put(str2, (String) obj2);
        nd3Var.a.put(CRLReasonCodeExtension.REASON, str);
        return nd3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0081, code lost:
    
        if (r6 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Boolean bool, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersIgnitionTechnicalAnalytics$reportEvent$1 scootersIgnitionTechnicalAnalytics$reportEvent$1;
        int i;
        tls tlsVar2;
        Object b;
        a aVar;
        Object obj;
        tls tlsVar3;
        a aVar2;
        a aVar3;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj2;
        int i2;
        String str2;
        boolean isExemptFromLowPowerStandby;
        boolean isDeviceLightIdleMode;
        boolean isLowPowerStandbyEnabled;
        List historicalProcessExitReasons;
        int reason;
        String processName;
        List historicalProcessStartReasons;
        int reason2;
        String processName2;
        a aVar4 = this;
        String str3 = str;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ScootersIgnitionTechnicalAnalytics$reportEvent$1) {
            scootersIgnitionTechnicalAnalytics$reportEvent$1 = (ScootersIgnitionTechnicalAnalytics$reportEvent$1) continuationImpl;
            int i3 = scootersIgnitionTechnicalAnalytics$reportEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionTechnicalAnalytics$reportEvent$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = scootersIgnitionTechnicalAnalytics$reportEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionTechnicalAnalytics$reportEvent$1.label;
                if (i != 0) {
                    b.b(obj3);
                    scootersIgnitionTechnicalAnalytics$reportEvent$1.L$0 = str3;
                    scootersIgnitionTechnicalAnalytics$reportEvent$1.L$1 = null;
                    tlsVar2 = tlsVar;
                    scootersIgnitionTechnicalAnalytics$reportEvent$1.L$2 = tlsVar2;
                    scootersIgnitionTechnicalAnalytics$reportEvent$1.label = 1;
                    b = aVar4.b(str3, bool, scootersIgnitionTechnicalAnalytics$reportEvent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a aVar5 = (a) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$6;
                        aVar2 = (a) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$5;
                        aVar = (a) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$4;
                        a aVar6 = (a) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$3;
                        tlsVar3 = (tls) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$2;
                        b.b(obj3);
                        obj = obj3;
                        aVar3 = aVar5;
                        aVar4 = aVar6;
                        w3j0 w3j0Var = (w3j0) obj;
                        aVar3.getClass();
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.put("is_activity_foreground", Boolean.valueOf(aVar3.d.a));
                        mapBuilder.put("has_activity", Boolean.valueOf(bvf0.D(aVar3.g.a)));
                        mapBuilder.put("process_used_ram_kb", Long.valueOf(Debug.getPss()));
                        runningAppProcesses = aVar3.a().getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(((ActivityManager.RunningAppProcessInfo) it.next()).pid));
                            }
                            int i4 = 0;
                            for (Debug.MemoryInfo memoryInfo : aVar3.a().getProcessMemoryInfo(kotlin.collections.a.I0(arrayList))) {
                                i4 = memoryInfo.getTotalPss() + i4;
                            }
                            mapBuilder.put("app_processes_used_ram_kb", Integer.valueOf(i4));
                        }
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        int i5 = runningAppProcessInfo.importance;
                        String str4 = Constants.KEY_SERVICE;
                        String str5 = "unknown";
                        mapBuilder.put("importance", i5 == 100 ? i5 != 125 ? i5 != 200 ? i5 != 230 ? i5 != 300 ? i5 != 325 ? i5 != 350 ? i5 != 400 ? i5 != 1000 ? "unknown" : "gone" : "cached" : "cant_save_state" : "top_sleeping" : Constants.KEY_SERVICE : "perceptible" : "visible" : "foreground_service" : "foreground");
                        if (jx81.g()) {
                            obj2 = null;
                        } else {
                            String packageName = aVar3.a.getPackageName();
                            historicalProcessStartReasons = aVar3.a().getHistoricalProcessStartReasons(0);
                            obj2 = null;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : historicalProcessStartReasons) {
                                processName2 = q82.c(obj4).getProcessName();
                                if (jl40.l(processName2, packageName)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                reason2 = q82.c(it2.next()).getReason();
                                arrayList3.add(Integer.valueOf(reason2));
                            }
                            Integer num = (Integer) kotlin.collections.a.R(arrayList3);
                            if (num != null) {
                                switch (num.intValue()) {
                                    case 0:
                                        str4 = "alarm";
                                        break;
                                    case 1:
                                        str4 = "backup";
                                        break;
                                    case 2:
                                        str4 = "boot_complete";
                                        break;
                                    case 3:
                                        str4 = "broadcast";
                                        break;
                                    case 4:
                                        str4 = com.adjust.sdk.Constants.CONTENT_PROVIDER;
                                        break;
                                    case 5:
                                        str4 = "job";
                                        break;
                                    case 6:
                                        str4 = "launcher";
                                        break;
                                    case 7:
                                        str4 = "launcher_recents";
                                        break;
                                    case 8:
                                        str4 = "other";
                                        break;
                                    case 9:
                                        str4 = com.adjust.sdk.Constants.PUSH;
                                        break;
                                    case 10:
                                        break;
                                    case 11:
                                        str4 = "start_activity";
                                        break;
                                    default:
                                        str4 = "unknown";
                                        break;
                                }
                                mapBuilder.put("application_start_reason", str4);
                            }
                        }
                        if (jx81.d()) {
                            String packageName2 = aVar3.a.getPackageName();
                            historicalProcessExitReasons = aVar3.a().getHistoricalProcessExitReasons(packageName2, 0, 0);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : historicalProcessExitReasons) {
                                processName = mh.g(obj5).getProcessName();
                                if (jl40.l(processName, packageName2)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                reason = mh.g(it3.next()).getReason();
                                arrayList5.add(Integer.valueOf(reason));
                            }
                            Integer num2 = (Integer) kotlin.collections.a.R(arrayList5);
                            if (num2 != null) {
                                switch (num2.intValue()) {
                                    case 1:
                                        str5 = "exit_self";
                                        break;
                                    case 2:
                                        str5 = "signaled";
                                        break;
                                    case 3:
                                        str5 = "low_memory";
                                        break;
                                    case 4:
                                        str5 = "crash";
                                        break;
                                    case 5:
                                        str5 = "crash_native";
                                        break;
                                    case 6:
                                        str5 = "anr";
                                        break;
                                    case 7:
                                        str5 = "initialization_failure";
                                        break;
                                    case 8:
                                        str5 = "permission_change";
                                        break;
                                    case 9:
                                        str5 = "excessive_resource_usage";
                                        break;
                                    case 10:
                                        str5 = "user_requested";
                                        break;
                                    case 11:
                                        str5 = "user_stopped";
                                        break;
                                    case 12:
                                        str5 = "dependency_died";
                                        break;
                                    case 13:
                                        str5 = "other";
                                        break;
                                    case 14:
                                        str5 = "freezer";
                                        break;
                                    case 15:
                                        str5 = "package_state_change";
                                        break;
                                    case 16:
                                        str5 = "package_updated";
                                        break;
                                }
                                mapBuilder.put("application_exit_reason", str5);
                            }
                        }
                        w3j0Var.a.put("app_state", mapBuilder.j());
                        aVar2.getClass();
                        MapBuilder mapBuilder2 = new MapBuilder();
                        mapBuilder2.put("is_lock_screen_showing", Boolean.valueOf(((KeyguardManager) aVar2.k.getValue()).isKeyguardLocked()));
                        mapBuilder2.put("is_screen_on", Boolean.valueOf(aVar2.b.isInteractive()));
                        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                        aVar2.a().getMemoryInfo(memoryInfo2);
                        mapBuilder2.put("total_ram_kb", Integer.valueOf((int) (memoryInfo2.totalMem / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)));
                        mapBuilder2.put("used_ram_kb", Integer.valueOf((int) ((memoryInfo2.totalMem - memoryInfo2.availMem) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)));
                        mapBuilder2.put("is_low_ram", Boolean.valueOf(memoryInfo2.lowMemory));
                        w3j0Var.a.put("device_state", mapBuilder2.j());
                        bg5 bg5Var = aVar.f;
                        Pair pair = new Pair("level", Integer.valueOf(bg5Var.b()));
                        i2 = nsn0.b[bg5Var.c().ordinal()];
                        if (i2 != 1) {
                            str2 = "charging";
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return obj2;
                            }
                            str2 = "unplugged";
                        }
                        w3j0Var.a.put("battery_info", kotlin.collections.b.i(pair, new Pair(ClidProvider.STATE, str2), new Pair("is_low_power_mode", Boolean.valueOf(aVar.b.isPowerSaveMode()))));
                        aVar4.getClass();
                        MapBuilder mapBuilder3 = new MapBuilder();
                        mapBuilder3.put("is_background_restricted", Boolean.valueOf(aVar4.a().isBackgroundRestricted()));
                        PowerManager powerManager = aVar4.b;
                        mapBuilder3.put("is_idle_mode", Boolean.valueOf(powerManager.isDeviceIdleMode()));
                        mapBuilder3.put("is_ignoring_battery_optimizations", Boolean.valueOf(powerManager.isIgnoringBatteryOptimizations(aVar4.a.getApplicationContext().getPackageName())));
                        if (jx81.f()) {
                            isDeviceLightIdleMode = powerManager.isDeviceLightIdleMode();
                            mapBuilder3.put("is_light_idle_mode", Boolean.valueOf(isDeviceLightIdleMode));
                            isLowPowerStandbyEnabled = powerManager.isLowPowerStandbyEnabled();
                            mapBuilder3.put("is_low_power_standby_enabled", Boolean.valueOf(isLowPowerStandbyEnabled));
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            isExemptFromLowPowerStandby = powerManager.isExemptFromLowPowerStandby();
                            mapBuilder3.put("is_exempt_from_low_power_standby", Boolean.valueOf(isExemptFromLowPowerStandby));
                        }
                        w3j0Var.a.put("optimizations_info", mapBuilder3.j());
                        tlsVar3.invoke(w3j0Var);
                        w3j0Var.m();
                        return zy11Var;
                    }
                    tls tlsVar4 = (tls) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$2;
                    String str6 = (String) scootersIgnitionTechnicalAnalytics$reportEvent$1.L$0;
                    b.b(obj3);
                    tlsVar2 = tlsVar4;
                    str3 = str6;
                    b = obj3;
                }
                if (((Boolean) b).booleanValue()) {
                    return zy11Var;
                }
                i d = ((ru.yandex.taxi.analytics.j) aVar4.e).d("Perf.Scooters.Ignition.TechnicalReport");
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$0 = null;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$1 = null;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$2 = tlsVar2;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$3 = aVar4;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$4 = aVar4;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$5 = aVar4;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.L$6 = aVar4;
                scootersIgnitionTechnicalAnalytics$reportEvent$1.label = 2;
                Object c = aVar4.c(d, str3, scootersIgnitionTechnicalAnalytics$reportEvent$1);
                if (c != coroutineSingletons) {
                    aVar = aVar4;
                    obj = c;
                    tlsVar3 = tlsVar2;
                    aVar2 = aVar;
                    aVar3 = aVar2;
                    w3j0 w3j0Var2 = (w3j0) obj;
                    aVar3.getClass();
                    MapBuilder mapBuilder4 = new MapBuilder();
                    mapBuilder4.put("is_activity_foreground", Boolean.valueOf(aVar3.d.a));
                    mapBuilder4.put("has_activity", Boolean.valueOf(bvf0.D(aVar3.g.a)));
                    mapBuilder4.put("process_used_ram_kb", Long.valueOf(Debug.getPss()));
                    runningAppProcesses = aVar3.a().getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo2);
                    int i52 = runningAppProcessInfo2.importance;
                    String str42 = Constants.KEY_SERVICE;
                    String str52 = "unknown";
                    mapBuilder4.put("importance", i52 == 100 ? i52 != 125 ? i52 != 200 ? i52 != 230 ? i52 != 300 ? i52 != 325 ? i52 != 350 ? i52 != 400 ? i52 != 1000 ? "unknown" : "gone" : "cached" : "cant_save_state" : "top_sleeping" : Constants.KEY_SERVICE : "perceptible" : "visible" : "foreground_service" : "foreground");
                    if (jx81.g()) {
                    }
                    if (jx81.d()) {
                    }
                    w3j0Var2.a.put("app_state", mapBuilder4.j());
                    aVar2.getClass();
                    MapBuilder mapBuilder22 = new MapBuilder();
                    mapBuilder22.put("is_lock_screen_showing", Boolean.valueOf(((KeyguardManager) aVar2.k.getValue()).isKeyguardLocked()));
                    mapBuilder22.put("is_screen_on", Boolean.valueOf(aVar2.b.isInteractive()));
                    ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
                    aVar2.a().getMemoryInfo(memoryInfo22);
                    mapBuilder22.put("total_ram_kb", Integer.valueOf((int) (memoryInfo22.totalMem / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)));
                    mapBuilder22.put("used_ram_kb", Integer.valueOf((int) ((memoryInfo22.totalMem - memoryInfo22.availMem) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)));
                    mapBuilder22.put("is_low_ram", Boolean.valueOf(memoryInfo22.lowMemory));
                    w3j0Var2.a.put("device_state", mapBuilder22.j());
                    bg5 bg5Var2 = aVar.f;
                    Pair pair2 = new Pair("level", Integer.valueOf(bg5Var2.b()));
                    i2 = nsn0.b[bg5Var2.c().ordinal()];
                    if (i2 != 1) {
                    }
                    w3j0Var2.a.put("battery_info", kotlin.collections.b.i(pair2, new Pair(ClidProvider.STATE, str2), new Pair("is_low_power_mode", Boolean.valueOf(aVar.b.isPowerSaveMode()))));
                    aVar4.getClass();
                    MapBuilder mapBuilder32 = new MapBuilder();
                    mapBuilder32.put("is_background_restricted", Boolean.valueOf(aVar4.a().isBackgroundRestricted()));
                    PowerManager powerManager2 = aVar4.b;
                    mapBuilder32.put("is_idle_mode", Boolean.valueOf(powerManager2.isDeviceIdleMode()));
                    mapBuilder32.put("is_ignoring_battery_optimizations", Boolean.valueOf(powerManager2.isIgnoringBatteryOptimizations(aVar4.a.getApplicationContext().getPackageName())));
                    if (jx81.f()) {
                    }
                    if (Build.VERSION.SDK_INT >= 34) {
                    }
                    w3j0Var2.a.put("optimizations_info", mapBuilder32.j());
                    tlsVar3.invoke(w3j0Var2);
                    w3j0Var2.m();
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        scootersIgnitionTechnicalAnalytics$reportEvent$1 = new ScootersIgnitionTechnicalAnalytics$reportEvent$1(aVar4, continuationImpl);
        Object obj32 = scootersIgnitionTechnicalAnalytics$reportEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionTechnicalAnalytics$reportEvent$1.label;
        if (i != 0) {
        }
        if (((Boolean) b).booleanValue()) {
        }
    }
}
