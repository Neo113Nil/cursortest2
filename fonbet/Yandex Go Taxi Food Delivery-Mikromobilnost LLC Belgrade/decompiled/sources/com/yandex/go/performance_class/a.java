package com.yandex.go.performance_class;

import android.app.ActivityManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;
import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.dah;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lbj;
import defpackage.nbj;
import defpackage.ny61;
import defpackage.obj;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.tt2;
import defpackage.x4e;
import defpackage.yaj;
import defpackage.ybj;
import defpackage.yhp;
import defpackage.zaj;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a implements nbj {
    public final yhp a;
    public final obj b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final r0 f;
    public final r0 g;
    public final hbp0 h;
    public final kotlinx.coroutines.sync.a i;
    public final kotlinx.coroutines.sync.a j;
    public pzt0 k;

    /* JADX WARN: Multi-variable type inference failed */
    public a(yhp yhpVar, obj objVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, tt2 tt2Var) {
        this.a = yhpVar;
        this.b = objVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        String str = null;
        Object[] objArr = 0;
        String l = objVar.b().l("static_performance_class", null);
        String str2 = "unknown";
        this.f = bvf0.c(new lbj(l == null ? "unknown" : l));
        r0 c = bvf0.c(new lbj(str2));
        this.g = c;
        this.h = new hbp0(new DevicePerformanceClassRepositoryImpl$scope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), str, objArr == true ? 1 : 0, 6);
        this.i = gtq0.a();
        this.j = gtq0.a();
        ((lbj) c.getValue()).getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0061, code lost:
    
        if (r15.a(r1) == r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #0 {all -> 0x00a6, blocks: (B:15:0x00df, B:30:0x0065, B:32:0x0074, B:35:0x007a, B:37:0x0090, B:41:0x009d, B:47:0x00b0, B:49:0x00b6, B:53:0x00c0), top: B:29:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #0 {all -> 0x00a6, blocks: (B:15:0x00df, B:30:0x0065, B:32:0x0074, B:35:0x007a, B:37:0x0090, B:41:0x009d, B:47:0x00b0, B:49:0x00b6, B:53:0x00c0), top: B:29:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.yandex.go.performance_class.a] */
    /* JADX WARN: Type inference failed for: r14v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r14v15, types: [g050] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, DevicePerformanceClassExperiment devicePerformanceClassExperiment, ContinuationImpl continuationImpl) {
        DevicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1 devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1;
        int i;
        int i2;
        kotlinx.coroutines.sync.a aVar2;
        DevicePerformanceClassExperiment.StaticThresholds staticThresholds;
        Integer num;
        DevicePerformanceClassExperiment devicePerformanceClassExperiment2;
        ?? r14;
        ybj ybjVar;
        ybj a;
        obj objVar = aVar.b;
        try {
            if (continuationImpl instanceof DevicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1) {
                devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1 = (DevicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1) continuationImpl;
                int i3 = devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.label = i3 - Integer.MIN_VALUE;
                    ?? r15 = devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.label;
                    i2 = 1;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        b.b(r15);
                        aVar2 = aVar.i;
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$0 = devicePerformanceClassExperiment;
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$1 = aVar2;
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r14 = (g050) devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$1;
                            devicePerformanceClassExperiment2 = (DevicePerformanceClassExperiment) devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$0;
                            try {
                                b.b(r15);
                                r14 = r14;
                                ybjVar = r15;
                                objVar.c(ybjVar);
                                ybj ybjVar2 = ybjVar;
                                aVar2 = r14;
                                devicePerformanceClassExperiment = devicePerformanceClassExperiment2;
                                a = ybjVar2;
                                String a2 = ((dah) aVar.d.get()).a(a, devicePerformanceClassExperiment.d, devicePerformanceClassExperiment.e, devicePerformanceClassExperiment.h);
                                objVar.b().r("static_performance_class", a2);
                                Integer num2 = devicePerformanceClassExperiment.c;
                                num2.getClass();
                                objVar.b.setValue(objVar, obj.d[0], num2);
                                r0 r0Var = aVar.f;
                                lbj lbjVar = new lbj(a2);
                                r0Var.getClass();
                                r0Var.m(null, lbjVar);
                                aVar.e(a);
                                hst hstVar = jst.e;
                                aVar2.d(null);
                                return zy11Var;
                            } catch (Throwable th) {
                                th = th;
                                r14.d(null);
                                throw th;
                            }
                        }
                        ?? r142 = (g050) devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$1;
                        DevicePerformanceClassExperiment devicePerformanceClassExperiment3 = (DevicePerformanceClassExperiment) devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$0;
                        b.b(r15);
                        aVar2 = r142;
                        devicePerformanceClassExperiment = devicePerformanceClassExperiment3;
                    }
                    staticThresholds = devicePerformanceClassExperiment.d;
                    DevicePerformanceClassExperiment.StaticThresholds.Companion.getClass();
                    if (!jl40.l(staticThresholds, DevicePerformanceClassExperiment.StaticThresholds.c) && (num = devicePerformanceClassExperiment.c) != null) {
                        if (num.intValue() == ((Number) objVar.b.getValue(objVar, obj.d[0])).intValue()) {
                            String l = objVar.b().l("static_performance_class", null);
                            if (l == null) {
                                l = "unknown";
                            }
                            if (!l.equals("unknown")) {
                                i2 = 0;
                            }
                        }
                        if (i2 != 0) {
                            aVar2.d(null);
                            return zy11Var;
                        }
                        if (objVar.a() != null) {
                            a = objVar.a();
                            if (a == null) {
                                aVar2.d(null);
                                return zy11Var;
                            }
                            String a22 = ((dah) aVar.d.get()).a(a, devicePerformanceClassExperiment.d, devicePerformanceClassExperiment.e, devicePerformanceClassExperiment.h);
                            objVar.b().r("static_performance_class", a22);
                            Integer num22 = devicePerformanceClassExperiment.c;
                            num22.getClass();
                            objVar.b.setValue(objVar, obj.d[0], num22);
                            r0 r0Var2 = aVar.f;
                            lbj lbjVar2 = new lbj(a22);
                            r0Var2.getClass();
                            r0Var2.m(null, lbjVar2);
                            aVar.e(a);
                            hst hstVar2 = jst.e;
                            aVar2.d(null);
                            return zy11Var;
                        }
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$0 = devicePerformanceClassExperiment;
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.L$1 = aVar2;
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.I$0 = i2;
                        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.label = 2;
                        ?? c = aVar.c(devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1);
                        if (c != coroutineSingletons) {
                            devicePerformanceClassExperiment2 = devicePerformanceClassExperiment;
                            r14 = aVar2;
                            ybjVar = c;
                            objVar.c(ybjVar);
                            ybj ybjVar22 = ybjVar;
                            aVar2 = r14;
                            devicePerformanceClassExperiment = devicePerformanceClassExperiment2;
                            a = ybjVar22;
                            String a222 = ((dah) aVar.d.get()).a(a, devicePerformanceClassExperiment.d, devicePerformanceClassExperiment.e, devicePerformanceClassExperiment.h);
                            objVar.b().r("static_performance_class", a222);
                            Integer num222 = devicePerformanceClassExperiment.c;
                            num222.getClass();
                            objVar.b.setValue(objVar, obj.d[0], num222);
                            r0 r0Var22 = aVar.f;
                            lbj lbjVar22 = new lbj(a222);
                            r0Var22.getClass();
                            r0Var22.m(null, lbjVar22);
                            aVar.e(a);
                            hst hstVar22 = jst.e;
                            aVar2.d(null);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                    aVar2.d(null);
                    return zy11Var;
                }
            }
            staticThresholds = devicePerformanceClassExperiment.d;
            DevicePerformanceClassExperiment.StaticThresholds.Companion.getClass();
            if (!jl40.l(staticThresholds, DevicePerformanceClassExperiment.StaticThresholds.c)) {
                if (num.intValue() == ((Number) objVar.b.getValue(objVar, obj.d[0])).intValue()) {
                }
                if (i2 != 0) {
                }
            }
            aVar2.d(null);
            return zy11Var;
        } catch (Throwable th2) {
            th = th2;
            r14 = aVar2;
            r14.d(null);
            throw th;
        }
        devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1 = new DevicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1(aVar, continuationImpl);
        ?? r152 = devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = devicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1.label;
        i2 = 1;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, DevicePerformanceClassExperiment devicePerformanceClassExperiment, ContinuationImpl continuationImpl) {
        DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1 devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1;
        int i;
        Integer num;
        DevicePerformanceClassExperiment devicePerformanceClassExperiment2;
        long j;
        aVar.getClass();
        if (continuationImpl instanceof DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1) {
            devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1 = (DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1) continuationImpl;
            int i2 = devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    pzt0 pzt0Var = aVar.k;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    aVar.k = null;
                    DevicePerformanceClassExperiment.DynamicThresholds dynamicThresholds = devicePerformanceClassExperiment.f;
                    DevicePerformanceClassExperiment.DynamicThresholds.Companion.getClass();
                    if (!jl40.l(dynamicThresholds, DevicePerformanceClassExperiment.DynamicThresholds.c) && (num = devicePerformanceClassExperiment.g) != null) {
                        long intValue = num.intValue() * 1000;
                        DevicePerformanceClassExperiment.DynamicThresholds dynamicThresholds2 = devicePerformanceClassExperiment.f;
                        devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.L$0 = devicePerformanceClassExperiment;
                        devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.J$0 = intValue;
                        devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.label = 1;
                        if (aVar.f(dynamicThresholds2, devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1) == obj2) {
                            return obj2;
                        }
                        devicePerformanceClassExperiment2 = devicePerformanceClassExperiment;
                        j = intValue;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.J$0;
                DevicePerformanceClassExperiment devicePerformanceClassExperiment3 = (DevicePerformanceClassExperiment) devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.L$0;
                b.b(obj);
                j = j2;
                devicePerformanceClassExperiment2 = devicePerformanceClassExperiment3;
                aVar.k = hbp0.e(aVar.h, null, null, new DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2(aVar, j, devicePerformanceClassExperiment2, null), 3);
                return zy11Var;
            }
        }
        devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1 = new DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1(aVar, continuationImpl);
        Object obj3 = devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = devicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        aVar.k = hbp0.e(aVar.h, null, null, new DevicePerformanceClassRepositoryImpl$monitorDynamicPerformanceClass$2(aVar, j, devicePerformanceClassExperiment2, null), 3);
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        DevicePerformanceClassRepositoryImpl$getDeviceSpecs$1 devicePerformanceClassRepositoryImpl$getDeviceSpecs$1;
        int i;
        int i2;
        int i3;
        if (continuationImpl instanceof DevicePerformanceClassRepositoryImpl$getDeviceSpecs$1) {
            devicePerformanceClassRepositoryImpl$getDeviceSpecs$1 = (DevicePerformanceClassRepositoryImpl$getDeviceSpecs$1) continuationImpl;
            int i4 = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.label = i4 - Integer.MIN_VALUE;
                Object obj = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.label;
                h3y h3yVar = this.c;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.go.performance_class.device_info.a aVar = (com.yandex.go.performance_class.device_info.a) h3yVar.get();
                    aVar.getClass();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) aVar.a.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    int i5 = (int) (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                    ((com.yandex.go.performance_class.device_info.a) h3yVar.get()).getClass();
                    int availableProcessors = Runtime.getRuntime().availableProcessors();
                    com.yandex.go.performance_class.device_info.a aVar2 = (com.yandex.go.performance_class.device_info.a) h3yVar.get();
                    devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.I$0 = i5;
                    devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.I$1 = availableProcessors;
                    devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.label = 1;
                    Object a = aVar2.a(devicePerformanceClassRepositoryImpl$getDeviceSpecs$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i5;
                    obj = a;
                    i3 = availableProcessors;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.I$1;
                    i2 = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.I$0;
                    b.b(obj);
                }
                int intValue = ((Number) obj).intValue();
                ((com.yandex.go.performance_class.device_info.a) h3yVar.get()).getClass();
                return new ybj(i2, i3, intValue, oyr.q(Build.BRAND, "/", Build.PRODUCT, "/", Build.DEVICE));
            }
        }
        devicePerformanceClassRepositoryImpl$getDeviceSpecs$1 = new DevicePerformanceClassRepositoryImpl$getDeviceSpecs$1(this, continuationImpl);
        Object obj2 = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = devicePerformanceClassRepositoryImpl$getDeviceSpecs$1.label;
        h3y h3yVar2 = this.c;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        ((com.yandex.go.performance_class.device_info.a) h3yVar2.get()).getClass();
        return new ybj(i2, i3, intValue2, oyr.q(Build.BRAND, "/", Build.PRODUCT, "/", Build.DEVICE));
    }

    public final String d() {
        return ((lbj) this.f.getValue()).a;
    }

    public final void e(ybj ybjVar) {
        zaj zajVar = (zaj) this.e.get();
        int i = ybjVar.a;
        int i2 = ybjVar.b;
        int i3 = ybjVar.c;
        yaj yajVar = zajVar.a;
        yajVar.getClass();
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, "ram_total", i2, "cpu_count");
        yajVar.a.a("DeviceInfo.Telemetry.Sent", hashMap, 1, x4e.n(i3, hashMap, "cpu_max_frequency"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(DevicePerformanceClassExperiment.DynamicThresholds dynamicThresholds, ContinuationImpl continuationImpl) {
        DevicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1 devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        String str;
        h3y h3yVar = this.c;
        if (continuationImpl instanceof DevicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1) {
            devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1 = (DevicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1) continuationImpl;
            int i2 = devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.label;
                if (i != 0) {
                    b.b(obj);
                    devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.L$0 = dynamicThresholds;
                    aVar = this.j;
                    devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.L$1 = aVar;
                    devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.label = 1;
                    if (aVar.a(devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r12 = (g050) devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.L$1;
                    DevicePerformanceClassExperiment.DynamicThresholds dynamicThresholds2 = (DevicePerformanceClassExperiment.DynamicThresholds) devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.L$0;
                    b.b(obj);
                    aVar = r12;
                    dynamicThresholds = dynamicThresholds2;
                }
                zy11 zy11Var = zy11.a;
                if (dynamicThresholds != null) {
                    return zy11Var;
                }
                try {
                    DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold = dynamicThresholds.a;
                    com.yandex.go.performance_class.device_info.a aVar2 = (com.yandex.go.performance_class.device_info.a) h3yVar.get();
                    aVar2.getClass();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) aVar2.a.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    double d = memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    int memoryClass = ((ActivityManager) ((com.yandex.go.performance_class.device_info.a) h3yVar.get()).a.getSystemService("activity")).getMemoryClass();
                    ((dah) this.d.get()).getClass();
                    DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold2 = dynamicThresholds.b;
                    DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold.Companion.getClass();
                    DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold dynamicThreshold3 = DevicePerformanceClassExperiment.DynamicThresholds.DynamicThreshold.c;
                    if (!jl40.l(dynamicThreshold, dynamicThreshold3) && !jl40.l(dynamicThreshold2, dynamicThreshold3)) {
                        if (d > dynamicThreshold.a && memoryClass > dynamicThreshold.b) {
                            if (d > dynamicThreshold2.a && memoryClass > dynamicThreshold2.b) {
                                str = Constants.HIGH;
                                obj objVar = this.b;
                                objVar.c.setValue(objVar, obj.d[1], Long.valueOf(System.currentTimeMillis()));
                                r0 r0Var = this.g;
                                lbj lbjVar = new lbj(str);
                                r0Var.getClass();
                                r0Var.m(null, lbjVar);
                                hst hstVar = jst.e;
                                return zy11Var;
                            }
                            str = "medium";
                            obj objVar2 = this.b;
                            objVar2.c.setValue(objVar2, obj.d[1], Long.valueOf(System.currentTimeMillis()));
                            r0 r0Var2 = this.g;
                            lbj lbjVar2 = new lbj(str);
                            r0Var2.getClass();
                            r0Var2.m(null, lbjVar2);
                            hst hstVar2 = jst.e;
                            return zy11Var;
                        }
                        str = Constants.LOW;
                        obj objVar22 = this.b;
                        objVar22.c.setValue(objVar22, obj.d[1], Long.valueOf(System.currentTimeMillis()));
                        r0 r0Var22 = this.g;
                        lbj lbjVar22 = new lbj(str);
                        r0Var22.getClass();
                        r0Var22.m(null, lbjVar22);
                        hst hstVar22 = jst.e;
                        return zy11Var;
                    }
                    str = "unknown";
                    obj objVar222 = this.b;
                    objVar222.c.setValue(objVar222, obj.d[1], Long.valueOf(System.currentTimeMillis()));
                    r0 r0Var222 = this.g;
                    lbj lbjVar222 = new lbj(str);
                    r0Var222.getClass();
                    r0Var222.m(null, lbjVar222);
                    hst hstVar222 = jst.e;
                    return zy11Var;
                } finally {
                    aVar.d(null);
                }
            }
        }
        devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1 = new DevicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1(this, continuationImpl);
        Object obj2 = devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = devicePerformanceClassRepositoryImpl$updateDynamicPerformanceClass$1.label;
        if (i != 0) {
        }
        zy11 zy11Var2 = zy11.a;
        if (dynamicThresholds != null) {
        }
    }
}
