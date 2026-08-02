package com.yandex.mob.reporting;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.datastore.d;
import com.yandex.mob.domain.ValidateConfigUseCase$InvalidCause;
import com.yandex.mob.domain.l;
import com.yandex.mob.model.MobNotificationType;
import com.yandex.mob.model.MobRemoteNotificationCommand;
import com.yandex.mob.network.MobNetworkErrorType;
import defpackage.csz;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.hm20;
import defpackage.i3y;
import defpackage.jn20;
import defpackage.lq20;
import defpackage.mq20;
import defpackage.ny61;
import defpackage.pm20;
import defpackage.pr20;
import defpackage.qm20;
import defpackage.rv10;
import defpackage.tcc;
import defpackage.vng;
import defpackage.zm20;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes8.dex */
public final class a {
    public final l a;
    public final qm20 b;
    public final d c;
    public final i3y d = kotlin.a.b(LazyThreadSafetyMode.SYNCHRONIZED, new csz(4, this));

    public a(l lVar, qm20 qm20Var, d dVar) {
        this.a = lVar;
        this.b = qm20Var;
        this.c = dVar;
    }

    public static Pair t(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pr20 pr20Var = (pr20) it.next();
            zm20 i = vng.i(pr20Var.a);
            String str = i.a;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new LinkedHashMap();
                linkedHashMap.put(str, obj);
            }
            ((Map) obj).put(i.b, b.i(new Pair("proxyId", pr20Var.a.b), new Pair("availability", pr20Var.b ? "ip" : URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)));
        }
        return new Pair("selectedProxies", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName, MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        MobEventsConstructor$availabilityCheckStart$1 mobEventsConstructor$availabilityCheckStart$1;
        int i;
        MobTrigger mobTrigger2;
        String str;
        MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName2;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$availabilityCheckStart$1) {
            mobEventsConstructor$availabilityCheckStart$1 = (MobEventsConstructor$availabilityCheckStart$1) continuationImpl;
            int i3 = mobEventsConstructor$availabilityCheckStart$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$availabilityCheckStart$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$availabilityCheckStart$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$availabilityCheckStart$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$availabilityCheckStart$1.L$0 = mobAvailabilityCheckStrategyName;
                    mobEventsConstructor$availabilityCheckStart$1.L$1 = mobTrigger;
                    mobEventsConstructor$availabilityCheckStart$1.L$2 = pairArr2;
                    mobEventsConstructor$availabilityCheckStart$1.L$3 = "AvailabilityCheck.Start";
                    mobEventsConstructor$availabilityCheckStart$1.L$4 = pairArr2;
                    mobEventsConstructor$availabilityCheckStart$1.I$0 = 0;
                    mobEventsConstructor$availabilityCheckStart$1.label = 1;
                    Object c = c(mobEventsConstructor$availabilityCheckStart$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobTrigger2 = mobTrigger;
                    str = "AvailabilityCheck.Start";
                    mobAvailabilityCheckStrategyName2 = mobAvailabilityCheckStrategyName;
                    Pair[] pairArr3 = pairArr2;
                    pairArr = pairArr3;
                    obj = c;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$availabilityCheckStart$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$availabilityCheckStart$1.L$4;
                    str = (String) mobEventsConstructor$availabilityCheckStart$1.L$3;
                    pairArr = (Pair[]) mobEventsConstructor$availabilityCheckStart$1.L$2;
                    mobTrigger2 = (MobTrigger) mobEventsConstructor$availabilityCheckStart$1.L$1;
                    mobAvailabilityCheckStrategyName2 = (MobAvailabilityCheckStrategyName) mobEventsConstructor$availabilityCheckStart$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("strategy", mobAvailabilityCheckStrategyName2.getValue());
                pairArr[2] = new Pair("triggeredBy", mobTrigger2.getValue());
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$availabilityCheckStart$1 = new MobEventsConstructor$availabilityCheckStart$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$availabilityCheckStart$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$availabilityCheckStart$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("strategy", mobAvailabilityCheckStrategyName2.getValue());
        pairArr[2] = new Pair("triggeredBy", mobTrigger2.getValue());
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.mob.reporting.a] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(mq20 mq20Var, MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName, ContinuationImpl continuationImpl) {
        MobEventsConstructor$availabilityReport$1 mobEventsConstructor$availabilityReport$1;
        int i;
        MapBuilder mapBuilder;
        mq20 mq20Var2;
        lq20 lq20Var;
        Map map;
        String str;
        String str2;
        MobNetworkErrorType mobNetworkErrorType;
        String value;
        if (continuationImpl instanceof MobEventsConstructor$availabilityReport$1) {
            mobEventsConstructor$availabilityReport$1 = (MobEventsConstructor$availabilityReport$1) continuationImpl;
            int i2 = mobEventsConstructor$availabilityReport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$availabilityReport$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$availabilityReport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$availabilityReport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lq20 lq20Var2 = mq20Var.a;
                    mapBuilder = new MapBuilder();
                    mobEventsConstructor$availabilityReport$1.L$0 = mq20Var;
                    mobEventsConstructor$availabilityReport$1.L$1 = mobAvailabilityCheckStrategyName;
                    mobEventsConstructor$availabilityReport$1.L$2 = lq20Var2;
                    mobEventsConstructor$availabilityReport$1.L$3 = mapBuilder;
                    mobEventsConstructor$availabilityReport$1.L$4 = mapBuilder;
                    mobEventsConstructor$availabilityReport$1.L$5 = "AvailabilityCheck.Result";
                    mobEventsConstructor$availabilityReport$1.I$0 = 0;
                    mobEventsConstructor$availabilityReport$1.label = 1;
                    Serializable c = c(mobEventsConstructor$availabilityReport$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mq20Var2 = mq20Var;
                    lq20Var = lq20Var2;
                    map = mapBuilder;
                    obj = c;
                    str = "AvailabilityCheck.Result";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mobEventsConstructor$availabilityReport$1.L$5;
                    map = (Map) mobEventsConstructor$availabilityReport$1.L$4;
                    ?? r9 = (Map) mobEventsConstructor$availabilityReport$1.L$3;
                    lq20Var = (lq20) mobEventsConstructor$availabilityReport$1.L$2;
                    MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName2 = (MobAvailabilityCheckStrategyName) mobEventsConstructor$availabilityReport$1.L$1;
                    mq20Var2 = (mq20) mobEventsConstructor$availabilityReport$1.L$0;
                    kotlin.b.b(obj);
                    mapBuilder = r9;
                    mobAvailabilityCheckStrategyName = mobAvailabilityCheckStrategyName2;
                }
                Pair pair = (Pair) obj;
                map.put((String) pair.getFirst(), pair.getSecond());
                if ((lq20Var.g != null ? !evu0.J(r10) : false) || mq20Var2.b.a) {
                    hm20 hm20Var = mq20Var2.b;
                    boolean z = hm20Var.a;
                    str2 = (hm20Var.b || !z) ? !z ? "available_by_host" : "unavailable_by_host" : "available_by_ip";
                } else {
                    str2 = "unavailable_by_ip";
                }
                map.put("availability", str2);
                map.put("proxyId", lq20Var.b);
                map.put("apiName", vng.i(lq20Var).b);
                map.put("contour", vng.i(lq20Var).a);
                map.put("strategy", mobAvailabilityCheckStrategyName.getValue());
                mobNetworkErrorType = mq20Var2.b.c;
                if (mobNetworkErrorType != null && (value = mobNetworkErrorType.getValue()) != null) {
                    map.put("errorType", value);
                }
                return new Pair(str, mapBuilder.j());
            }
        }
        mobEventsConstructor$availabilityReport$1 = new MobEventsConstructor$availabilityReport$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$availabilityReport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$availabilityReport$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        map.put((String) pair2.getFirst(), pair2.getSecond());
        if (lq20Var.g != null ? !evu0.J(r10) : false) {
        }
        hm20 hm20Var2 = mq20Var2.b;
        boolean z2 = hm20Var2.a;
        if (hm20Var2.b) {
        }
        map.put("availability", str2);
        map.put("proxyId", lq20Var.b);
        map.put("apiName", vng.i(lq20Var).b);
        map.put("contour", vng.i(lq20Var).a);
        map.put("strategy", mobAvailabilityCheckStrategyName.getValue());
        mobNetworkErrorType = mq20Var2.b.c;
        if (mobNetworkErrorType != null) {
            map.put("errorType", value);
        }
        return new Pair(str, mapBuilder.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        MobEventsConstructor$commonParams$1 mobEventsConstructor$commonParams$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Pair[] pairArr;
        String str;
        int i2;
        String str2;
        Pair[] pairArr2;
        String str3;
        Pair[] pairArr3;
        String str4;
        String str5;
        Pair[] pairArr4;
        Pair[] pairArr5;
        if (continuationImpl instanceof MobEventsConstructor$commonParams$1) {
            mobEventsConstructor$commonParams$1 = (MobEventsConstructor$commonParams$1) continuationImpl;
            int i3 = mobEventsConstructor$commonParams$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$commonParams$1.label = i3 - Integer.MIN_VALUE;
                obj = mobEventsConstructor$commonParams$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$commonParams$1.label;
                d dVar = this.c;
                int i4 = 3;
                int i5 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pairArr = new Pair[5];
                    mobEventsConstructor$commonParams$1.L$0 = pairArr;
                    mobEventsConstructor$commonParams$1.L$1 = "CommonParams";
                    mobEventsConstructor$commonParams$1.L$2 = pairArr;
                    str = "configId";
                    mobEventsConstructor$commonParams$1.L$3 = "configId";
                    i2 = 0;
                    mobEventsConstructor$commonParams$1.I$0 = 0;
                    mobEventsConstructor$commonParams$1.label = 1;
                    obj = this.a.e(mobEventsConstructor$commonParams$1);
                    if (obj != coroutineSingletons) {
                        str2 = "CommonParams";
                        pairArr2 = pairArr;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = mobEventsConstructor$commonParams$1.I$0;
                        str5 = (String) mobEventsConstructor$commonParams$1.L$3;
                        pairArr5 = (Pair[]) mobEventsConstructor$commonParams$1.L$2;
                        str4 = (String) mobEventsConstructor$commonParams$1.L$1;
                        pairArr4 = (Pair[]) mobEventsConstructor$commonParams$1.L$0;
                        kotlin.b.b(obj);
                        pairArr5[i4] = new Pair(str5, obj);
                        pairArr4[4] = new Pair("mobVersion", "0.32.0");
                        return new Pair(str4, b.i(pairArr4));
                    }
                    i5 = mobEventsConstructor$commonParams$1.I$0;
                    str3 = (String) mobEventsConstructor$commonParams$1.L$3;
                    Pair[] pairArr6 = (Pair[]) mobEventsConstructor$commonParams$1.L$2;
                    String str6 = (String) mobEventsConstructor$commonParams$1.L$1;
                    pairArr3 = (Pair[]) mobEventsConstructor$commonParams$1.L$0;
                    kotlin.b.b(obj);
                    pairArr = pairArr6;
                    str4 = str6;
                    pairArr[i5] = new Pair(str3, obj);
                    mobEventsConstructor$commonParams$1.L$0 = pairArr3;
                    mobEventsConstructor$commonParams$1.L$1 = str4;
                    mobEventsConstructor$commonParams$1.L$2 = pairArr3;
                    str5 = "country";
                    mobEventsConstructor$commonParams$1.L$3 = "country";
                    mobEventsConstructor$commonParams$1.I$0 = 3;
                    mobEventsConstructor$commonParams$1.label = 3;
                    obj = dVar.d(mobEventsConstructor$commonParams$1);
                    if (obj != coroutineSingletons) {
                        pairArr4 = pairArr3;
                        pairArr5 = pairArr4;
                        pairArr5[i4] = new Pair(str5, obj);
                        pairArr4[4] = new Pair("mobVersion", "0.32.0");
                        return new Pair(str4, b.i(pairArr4));
                    }
                    return coroutineSingletons;
                }
                i2 = mobEventsConstructor$commonParams$1.I$0;
                str = (String) mobEventsConstructor$commonParams$1.L$3;
                Pair[] pairArr7 = (Pair[]) mobEventsConstructor$commonParams$1.L$2;
                String str7 = (String) mobEventsConstructor$commonParams$1.L$1;
                Pair[] pairArr8 = (Pair[]) mobEventsConstructor$commonParams$1.L$0;
                kotlin.b.b(obj);
                pairArr2 = pairArr7;
                pairArr = pairArr8;
                str2 = str7;
                pairArr2[i2] = new Pair(str, obj);
                pairArr[1] = new Pair("appId", ((pm20) this.d.getValue()).a);
                mobEventsConstructor$commonParams$1.L$0 = pairArr;
                mobEventsConstructor$commonParams$1.L$1 = str2;
                mobEventsConstructor$commonParams$1.L$2 = pairArr;
                str3 = "mobId";
                mobEventsConstructor$commonParams$1.L$3 = "mobId";
                mobEventsConstructor$commonParams$1.I$0 = 2;
                mobEventsConstructor$commonParams$1.label = 2;
                obj = dVar.l(mobEventsConstructor$commonParams$1);
                if (obj != coroutineSingletons) {
                    pairArr3 = pairArr;
                    str4 = str2;
                    pairArr[i5] = new Pair(str3, obj);
                    mobEventsConstructor$commonParams$1.L$0 = pairArr3;
                    mobEventsConstructor$commonParams$1.L$1 = str4;
                    mobEventsConstructor$commonParams$1.L$2 = pairArr3;
                    str5 = "country";
                    mobEventsConstructor$commonParams$1.L$3 = "country";
                    mobEventsConstructor$commonParams$1.I$0 = 3;
                    mobEventsConstructor$commonParams$1.label = 3;
                    obj = dVar.d(mobEventsConstructor$commonParams$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mobEventsConstructor$commonParams$1 = new MobEventsConstructor$commonParams$1(this, continuationImpl);
        obj = mobEventsConstructor$commonParams$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$commonParams$1.label;
        d dVar2 = this.c;
        int i42 = 3;
        int i52 = 2;
        if (i != 0) {
        }
        pairArr2[i2] = new Pair(str, obj);
        pairArr[1] = new Pair("appId", ((pm20) this.d.getValue()).a);
        mobEventsConstructor$commonParams$1.L$0 = pairArr;
        mobEventsConstructor$commonParams$1.L$1 = str2;
        mobEventsConstructor$commonParams$1.L$2 = pairArr;
        str3 = "mobId";
        mobEventsConstructor$commonParams$1.L$3 = "mobId";
        mobEventsConstructor$commonParams$1.I$0 = 2;
        mobEventsConstructor$commonParams$1.label = 2;
        obj = dVar2.l(mobEventsConstructor$commonParams$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        MobEventsConstructor$configRequest$1 mobEventsConstructor$configRequest$1;
        int i;
        MobTrigger mobTrigger2;
        String str;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$configRequest$1) {
            mobEventsConstructor$configRequest$1 = (MobEventsConstructor$configRequest$1) continuationImpl;
            int i3 = mobEventsConstructor$configRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$configRequest$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$configRequest$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$configRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[2];
                    mobEventsConstructor$configRequest$1.L$0 = mobTrigger;
                    mobEventsConstructor$configRequest$1.L$1 = pairArr2;
                    mobEventsConstructor$configRequest$1.L$2 = "Config.Request";
                    mobEventsConstructor$configRequest$1.L$3 = pairArr2;
                    mobEventsConstructor$configRequest$1.I$0 = 0;
                    mobEventsConstructor$configRequest$1.label = 1;
                    Object c = c(mobEventsConstructor$configRequest$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobTrigger2 = mobTrigger;
                    Pair[] pairArr3 = pairArr2;
                    str = "Config.Request";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$configRequest$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$configRequest$1.L$3;
                    str = (String) mobEventsConstructor$configRequest$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$configRequest$1.L$1;
                    mobTrigger2 = (MobTrigger) mobEventsConstructor$configRequest$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$configRequest$1 = new MobEventsConstructor$configRequest$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$configRequest$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$configRequest$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, String str2, ContinuationImpl continuationImpl) {
        MobEventsConstructor$geocodeFailure$1 mobEventsConstructor$geocodeFailure$1;
        int i;
        String str3;
        String str4;
        String str5;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$geocodeFailure$1) {
            mobEventsConstructor$geocodeFailure$1 = (MobEventsConstructor$geocodeFailure$1) continuationImpl;
            int i3 = mobEventsConstructor$geocodeFailure$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$geocodeFailure$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$geocodeFailure$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$geocodeFailure$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$geocodeFailure$1.L$0 = str;
                    mobEventsConstructor$geocodeFailure$1.L$1 = str2;
                    mobEventsConstructor$geocodeFailure$1.L$2 = pairArr2;
                    mobEventsConstructor$geocodeFailure$1.L$3 = "Geocode.Failure";
                    mobEventsConstructor$geocodeFailure$1.L$4 = pairArr2;
                    mobEventsConstructor$geocodeFailure$1.I$0 = 0;
                    mobEventsConstructor$geocodeFailure$1.label = 1;
                    Object c = c(mobEventsConstructor$geocodeFailure$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    str3 = str2;
                    str4 = "Geocode.Failure";
                    str5 = str;
                    Pair[] pairArr3 = pairArr2;
                    pairArr = pairArr3;
                    obj = c;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$geocodeFailure$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$geocodeFailure$1.L$4;
                    str4 = (String) mobEventsConstructor$geocodeFailure$1.L$3;
                    pairArr = (Pair[]) mobEventsConstructor$geocodeFailure$1.L$2;
                    str3 = (String) mobEventsConstructor$geocodeFailure$1.L$1;
                    str5 = (String) mobEventsConstructor$geocodeFailure$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("errorDescription", str5);
                pairArr[2] = new Pair("errorDomain", str3);
                return new Pair(str4, b.i(pairArr));
            }
        }
        mobEventsConstructor$geocodeFailure$1 = new MobEventsConstructor$geocodeFailure$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$geocodeFailure$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$geocodeFailure$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("errorDescription", str5);
        pairArr[2] = new Pair("errorDomain", str3);
        return new Pair(str4, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(jn20 jn20Var, ContinuationImpl continuationImpl) {
        MobEventsConstructor$geocodeResponse$1 mobEventsConstructor$geocodeResponse$1;
        int i;
        jn20 jn20Var2;
        Map map;
        Map map2;
        String str;
        if (continuationImpl instanceof MobEventsConstructor$geocodeResponse$1) {
            mobEventsConstructor$geocodeResponse$1 = (MobEventsConstructor$geocodeResponse$1) continuationImpl;
            int i2 = mobEventsConstructor$geocodeResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$geocodeResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$geocodeResponse$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$geocodeResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MapBuilder mapBuilder = new MapBuilder();
                    mobEventsConstructor$geocodeResponse$1.L$0 = jn20Var;
                    mobEventsConstructor$geocodeResponse$1.L$1 = mapBuilder;
                    mobEventsConstructor$geocodeResponse$1.L$2 = mapBuilder;
                    mobEventsConstructor$geocodeResponse$1.L$3 = "Geocode.Response";
                    mobEventsConstructor$geocodeResponse$1.I$0 = 0;
                    mobEventsConstructor$geocodeResponse$1.label = 1;
                    Serializable c = c(mobEventsConstructor$geocodeResponse$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    jn20Var2 = jn20Var;
                    map = mapBuilder;
                    map2 = map;
                    obj = c;
                    str = "Geocode.Response";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mobEventsConstructor$geocodeResponse$1.L$3;
                    map = (Map) mobEventsConstructor$geocodeResponse$1.L$2;
                    map2 = (Map) mobEventsConstructor$geocodeResponse$1.L$1;
                    jn20Var2 = (jn20) mobEventsConstructor$geocodeResponse$1.L$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                map.put((String) pair.getFirst(), pair.getSecond());
                map.put("newCountry", jn20Var2.a);
                map.put("lat", new Double(jn20Var2.b.doubleValue()));
                map.put("lon", new Double(jn20Var2.c.doubleValue()));
                return new Pair(str, ((MapBuilder) map2).j());
            }
        }
        mobEventsConstructor$geocodeResponse$1 = new MobEventsConstructor$geocodeResponse$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$geocodeResponse$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$geocodeResponse$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        map.put((String) pair2.getFirst(), pair2.getSecond());
        map.put("newCountry", jn20Var2.a);
        map.put("lat", new Double(jn20Var2.b.doubleValue()));
        map.put("lon", new Double(jn20Var2.c.doubleValue()));
        return new Pair(str, ((MapBuilder) map2).j());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ContinuationImpl continuationImpl) {
        MobEventsConstructor$mobIdGenerated$1 mobEventsConstructor$mobIdGenerated$1;
        int i;
        String str;
        if (continuationImpl instanceof MobEventsConstructor$mobIdGenerated$1) {
            mobEventsConstructor$mobIdGenerated$1 = (MobEventsConstructor$mobIdGenerated$1) continuationImpl;
            int i2 = mobEventsConstructor$mobIdGenerated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$mobIdGenerated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$mobIdGenerated$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$mobIdGenerated$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobEventsConstructor$mobIdGenerated$1.L$0 = "MOBIdentifierGenerated";
                    mobEventsConstructor$mobIdGenerated$1.label = 1;
                    Serializable c = c(mobEventsConstructor$mobIdGenerated$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    obj = c;
                    str = "MOBIdentifierGenerated";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mobEventsConstructor$mobIdGenerated$1.L$0;
                    kotlin.b.b(obj);
                }
                return new Pair(str, gw00.e((Pair) obj));
            }
        }
        mobEventsConstructor$mobIdGenerated$1 = new MobEventsConstructor$mobIdGenerated$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$mobIdGenerated$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$mobIdGenerated$1.label;
        if (i != 0) {
        }
        return new Pair(str, gw00.e((Pair) obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, MobTrigger mobTrigger, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        MobEventsConstructor$networkDiagnosticsReport$1 mobEventsConstructor$networkDiagnosticsReport$1;
        int i;
        MobTrigger mobTrigger2;
        String str7;
        String str8;
        String str9;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$networkDiagnosticsReport$1) {
            mobEventsConstructor$networkDiagnosticsReport$1 = (MobEventsConstructor$networkDiagnosticsReport$1) continuationImpl;
            int i3 = mobEventsConstructor$networkDiagnosticsReport$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$networkDiagnosticsReport$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$networkDiagnosticsReport$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$networkDiagnosticsReport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$networkDiagnosticsReport$1.L$0 = str;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$1 = mobTrigger;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$2 = str2;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$3 = str3;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$4 = str4;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$5 = str5;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$6 = str6;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$7 = pairArr2;
                    mobEventsConstructor$networkDiagnosticsReport$1.L$8 = "NetworkDiagnostics.Report";
                    mobEventsConstructor$networkDiagnosticsReport$1.L$9 = pairArr2;
                    mobEventsConstructor$networkDiagnosticsReport$1.I$0 = 0;
                    mobEventsConstructor$networkDiagnosticsReport$1.label = 1;
                    Object c = c(mobEventsConstructor$networkDiagnosticsReport$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobTrigger2 = mobTrigger;
                    str7 = "NetworkDiagnostics.Report";
                    str8 = str;
                    str9 = str2;
                    Pair[] pairArr3 = pairArr2;
                    pairArr = pairArr3;
                    obj = c;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$networkDiagnosticsReport$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$networkDiagnosticsReport$1.L$9;
                    str7 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$8;
                    pairArr = (Pair[]) mobEventsConstructor$networkDiagnosticsReport$1.L$7;
                    str6 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$6;
                    str5 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$5;
                    str4 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$4;
                    str3 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$3;
                    str9 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$2;
                    mobTrigger2 = (MobTrigger) mobEventsConstructor$networkDiagnosticsReport$1.L$1;
                    str8 = (String) mobEventsConstructor$networkDiagnosticsReport$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str8);
                mapBuilder.put("traceRoute", str9);
                mapBuilder.put("ping", str3);
                mapBuilder.put("proxyId", str4);
                if (str5 != null) {
                }
                if (str6 != null) {
                    mapBuilder.put("contour", str6);
                }
                pairArr[2] = new Pair("networkDiagnostics", Collections.singletonList(mapBuilder.j()));
                return new Pair(str7, b.i(pairArr));
            }
        }
        mobEventsConstructor$networkDiagnosticsReport$1 = new MobEventsConstructor$networkDiagnosticsReport$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$networkDiagnosticsReport$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$networkDiagnosticsReport$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str8);
        mapBuilder2.put("traceRoute", str9);
        mapBuilder2.put("ping", str3);
        mapBuilder2.put("proxyId", str4);
        if (str5 != null) {
        }
        if (str6 != null) {
        }
        pairArr[2] = new Pair("networkDiagnostics", Collections.singletonList(mapBuilder2.j()));
        return new Pair(str7, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        MobEventsConstructor$networkDiagnosticsStart$1 mobEventsConstructor$networkDiagnosticsStart$1;
        int i;
        MobTrigger mobTrigger2;
        String str;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$networkDiagnosticsStart$1) {
            mobEventsConstructor$networkDiagnosticsStart$1 = (MobEventsConstructor$networkDiagnosticsStart$1) continuationImpl;
            int i3 = mobEventsConstructor$networkDiagnosticsStart$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$networkDiagnosticsStart$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$networkDiagnosticsStart$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$networkDiagnosticsStart$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[2];
                    mobEventsConstructor$networkDiagnosticsStart$1.L$0 = mobTrigger;
                    mobEventsConstructor$networkDiagnosticsStart$1.L$1 = pairArr2;
                    mobEventsConstructor$networkDiagnosticsStart$1.L$2 = "NetworkDiagnostics.Start";
                    mobEventsConstructor$networkDiagnosticsStart$1.L$3 = pairArr2;
                    mobEventsConstructor$networkDiagnosticsStart$1.I$0 = 0;
                    mobEventsConstructor$networkDiagnosticsStart$1.label = 1;
                    Object c = c(mobEventsConstructor$networkDiagnosticsStart$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobTrigger2 = mobTrigger;
                    Pair[] pairArr3 = pairArr2;
                    str = "NetworkDiagnostics.Start";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$networkDiagnosticsStart$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$networkDiagnosticsStart$1.L$3;
                    str = (String) mobEventsConstructor$networkDiagnosticsStart$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$networkDiagnosticsStart$1.L$1;
                    mobTrigger2 = (MobTrigger) mobEventsConstructor$networkDiagnosticsStart$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$networkDiagnosticsStart$1 = new MobEventsConstructor$networkDiagnosticsStart$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$networkDiagnosticsStart$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$networkDiagnosticsStart$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(List list, int i, ContinuationImpl continuationImpl) {
        MobEventsConstructor$notificationsCacheTrim$1 mobEventsConstructor$notificationsCacheTrim$1;
        int i2;
        List list2;
        String str;
        Pair[] pairArr;
        int i3;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$notificationsCacheTrim$1) {
            mobEventsConstructor$notificationsCacheTrim$1 = (MobEventsConstructor$notificationsCacheTrim$1) continuationImpl;
            int i4 = mobEventsConstructor$notificationsCacheTrim$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$notificationsCacheTrim$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$notificationsCacheTrim$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = mobEventsConstructor$notificationsCacheTrim$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$notificationsCacheTrim$1.L$0 = list;
                    mobEventsConstructor$notificationsCacheTrim$1.L$1 = pairArr2;
                    mobEventsConstructor$notificationsCacheTrim$1.L$2 = "Notifications.CacheTrim";
                    mobEventsConstructor$notificationsCacheTrim$1.L$3 = pairArr2;
                    mobEventsConstructor$notificationsCacheTrim$1.I$0 = i;
                    mobEventsConstructor$notificationsCacheTrim$1.I$1 = 0;
                    mobEventsConstructor$notificationsCacheTrim$1.label = 1;
                    Object c = c(mobEventsConstructor$notificationsCacheTrim$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    list2 = list;
                    Pair[] pairArr3 = pairArr2;
                    str = "Notifications.CacheTrim";
                    obj = c;
                    pairArr = pairArr3;
                    i3 = 0;
                    objArr = pairArr3;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = mobEventsConstructor$notificationsCacheTrim$1.I$1;
                    i = mobEventsConstructor$notificationsCacheTrim$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$notificationsCacheTrim$1.L$3;
                    str = (String) mobEventsConstructor$notificationsCacheTrim$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$notificationsCacheTrim$1.L$1;
                    list2 = (List) mobEventsConstructor$notificationsCacheTrim$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i3] = obj;
                pairArr[1] = new Pair(CRLReasonCodeExtension.REASON, kotlin.collections.a.X(list2, "|", null, null, new rv10(15), 30));
                pairArr[2] = new Pair("removedCount", new Integer(i));
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$notificationsCacheTrim$1 = new MobEventsConstructor$notificationsCacheTrim$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$notificationsCacheTrim$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = mobEventsConstructor$notificationsCacheTrim$1.label;
        if (i2 != 0) {
        }
        objArr[i3] = obj2;
        pairArr[1] = new Pair(CRLReasonCodeExtension.REASON, kotlin.collections.a.X(list2, "|", null, null, new rv10(15), 30));
        pairArr[2] = new Pair("removedCount", new Integer(i));
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(String str, MobNotificationType mobNotificationType, ContinuationImpl continuationImpl) {
        MobEventsConstructor$notificationsHandle$1 mobEventsConstructor$notificationsHandle$1;
        int i;
        MobNotificationType mobNotificationType2;
        String str2;
        String str3;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$notificationsHandle$1) {
            mobEventsConstructor$notificationsHandle$1 = (MobEventsConstructor$notificationsHandle$1) continuationImpl;
            int i3 = mobEventsConstructor$notificationsHandle$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$notificationsHandle$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$notificationsHandle$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$notificationsHandle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$notificationsHandle$1.L$0 = str;
                    mobEventsConstructor$notificationsHandle$1.L$1 = mobNotificationType;
                    mobEventsConstructor$notificationsHandle$1.L$2 = pairArr2;
                    mobEventsConstructor$notificationsHandle$1.L$3 = "Notifications.Handle";
                    mobEventsConstructor$notificationsHandle$1.L$4 = pairArr2;
                    mobEventsConstructor$notificationsHandle$1.I$0 = 0;
                    mobEventsConstructor$notificationsHandle$1.label = 1;
                    Object c = c(mobEventsConstructor$notificationsHandle$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobNotificationType2 = mobNotificationType;
                    str2 = "Notifications.Handle";
                    str3 = str;
                    Pair[] pairArr3 = pairArr2;
                    pairArr = pairArr3;
                    obj = c;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$notificationsHandle$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$notificationsHandle$1.L$4;
                    str2 = (String) mobEventsConstructor$notificationsHandle$1.L$3;
                    pairArr = (Pair[]) mobEventsConstructor$notificationsHandle$1.L$2;
                    mobNotificationType2 = (MobNotificationType) mobEventsConstructor$notificationsHandle$1.L$1;
                    str3 = (String) mobEventsConstructor$notificationsHandle$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("notificationId", str3);
                pairArr[2] = new Pair("notificationType", mobNotificationType2.getType());
                return new Pair(str2, b.i(pairArr));
            }
        }
        mobEventsConstructor$notificationsHandle$1 = new MobEventsConstructor$notificationsHandle$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$notificationsHandle$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$notificationsHandle$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("notificationId", str3);
        pairArr[2] = new Pair("notificationType", mobNotificationType2.getType());
        return new Pair(str2, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable l(MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        MobEventsConstructor$notificationsRequest$1 mobEventsConstructor$notificationsRequest$1;
        int i;
        MobTrigger mobTrigger2;
        String str;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$notificationsRequest$1) {
            mobEventsConstructor$notificationsRequest$1 = (MobEventsConstructor$notificationsRequest$1) continuationImpl;
            int i3 = mobEventsConstructor$notificationsRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$notificationsRequest$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$notificationsRequest$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$notificationsRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[2];
                    mobEventsConstructor$notificationsRequest$1.L$0 = mobTrigger;
                    mobEventsConstructor$notificationsRequest$1.L$1 = pairArr2;
                    mobEventsConstructor$notificationsRequest$1.L$2 = "Notifications.Request";
                    mobEventsConstructor$notificationsRequest$1.L$3 = pairArr2;
                    mobEventsConstructor$notificationsRequest$1.I$0 = 0;
                    mobEventsConstructor$notificationsRequest$1.label = 1;
                    Object c = c(mobEventsConstructor$notificationsRequest$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobTrigger2 = mobTrigger;
                    Pair[] pairArr3 = pairArr2;
                    str = "Notifications.Request";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$notificationsRequest$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$notificationsRequest$1.L$3;
                    str = (String) mobEventsConstructor$notificationsRequest$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$notificationsRequest$1.L$1;
                    mobTrigger2 = (MobTrigger) mobEventsConstructor$notificationsRequest$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$notificationsRequest$1 = new MobEventsConstructor$notificationsRequest$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$notificationsRequest$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$notificationsRequest$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("triggeredBy", mobTrigger2.getValue());
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m(lq20 lq20Var, ContinuationImpl continuationImpl) {
        MobEventsConstructor$provisionAppendProxy$1 mobEventsConstructor$provisionAppendProxy$1;
        int i;
        zm20 i2;
        lq20 lq20Var2;
        String str;
        Pair[] pairArr;
        int i3;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$provisionAppendProxy$1) {
            mobEventsConstructor$provisionAppendProxy$1 = (MobEventsConstructor$provisionAppendProxy$1) continuationImpl;
            int i4 = mobEventsConstructor$provisionAppendProxy$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$provisionAppendProxy$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$provisionAppendProxy$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$provisionAppendProxy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = vng.i(lq20Var);
                    Pair[] pairArr2 = new Pair[4];
                    mobEventsConstructor$provisionAppendProxy$1.L$0 = lq20Var;
                    mobEventsConstructor$provisionAppendProxy$1.L$1 = i2;
                    mobEventsConstructor$provisionAppendProxy$1.L$2 = pairArr2;
                    mobEventsConstructor$provisionAppendProxy$1.L$3 = "Provision.AppendProxy";
                    mobEventsConstructor$provisionAppendProxy$1.L$4 = pairArr2;
                    mobEventsConstructor$provisionAppendProxy$1.I$0 = 0;
                    mobEventsConstructor$provisionAppendProxy$1.label = 1;
                    Object c = c(mobEventsConstructor$provisionAppendProxy$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    lq20Var2 = lq20Var;
                    Pair[] pairArr3 = pairArr2;
                    str = "Provision.AppendProxy";
                    obj = c;
                    pairArr = pairArr3;
                    i3 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = mobEventsConstructor$provisionAppendProxy$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$provisionAppendProxy$1.L$4;
                    str = (String) mobEventsConstructor$provisionAppendProxy$1.L$3;
                    pairArr = (Pair[]) mobEventsConstructor$provisionAppendProxy$1.L$2;
                    i2 = (zm20) mobEventsConstructor$provisionAppendProxy$1.L$1;
                    lq20Var2 = (lq20) mobEventsConstructor$provisionAppendProxy$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i3] = obj;
                pairArr[1] = new Pair("apiName", i2.b);
                pairArr[2] = new Pair("contour", i2.a);
                pairArr[3] = new Pair("proxyId", lq20Var2.b);
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$provisionAppendProxy$1 = new MobEventsConstructor$provisionAppendProxy$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$provisionAppendProxy$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$provisionAppendProxy$1.label;
        if (i != 0) {
        }
        objArr[i3] = obj2;
        pairArr[1] = new Pair("apiName", i2.b);
        pairArr[2] = new Pair("contour", i2.a);
        pairArr[3] = new Pair("proxyId", lq20Var2.b);
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable n(List list, ContinuationImpl continuationImpl) {
        MobEventsConstructor$provisionInitial$1 mobEventsConstructor$provisionInitial$1;
        int i;
        List list2;
        String str;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$provisionInitial$1) {
            mobEventsConstructor$provisionInitial$1 = (MobEventsConstructor$provisionInitial$1) continuationImpl;
            int i3 = mobEventsConstructor$provisionInitial$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$provisionInitial$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$provisionInitial$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$provisionInitial$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[2];
                    mobEventsConstructor$provisionInitial$1.L$0 = list;
                    mobEventsConstructor$provisionInitial$1.L$1 = pairArr2;
                    mobEventsConstructor$provisionInitial$1.L$2 = "Provision.Initial";
                    mobEventsConstructor$provisionInitial$1.L$3 = pairArr2;
                    mobEventsConstructor$provisionInitial$1.I$0 = 0;
                    mobEventsConstructor$provisionInitial$1.label = 1;
                    Object c = c(mobEventsConstructor$provisionInitial$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    list2 = list;
                    Pair[] pairArr3 = pairArr2;
                    str = "Provision.Initial";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$provisionInitial$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$provisionInitial$1.L$3;
                    str = (String) mobEventsConstructor$provisionInitial$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$provisionInitial$1.L$1;
                    list2 = (List) mobEventsConstructor$provisionInitial$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = t(list2);
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$provisionInitial$1 = new MobEventsConstructor$provisionInitial$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$provisionInitial$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$provisionInitial$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = t(list2);
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o(String str, List list, ContinuationImpl continuationImpl) {
        MobEventsConstructor$provisionUpdateConfig$1 mobEventsConstructor$provisionUpdateConfig$1;
        int i;
        List list2;
        String str2;
        String str3;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$provisionUpdateConfig$1) {
            mobEventsConstructor$provisionUpdateConfig$1 = (MobEventsConstructor$provisionUpdateConfig$1) continuationImpl;
            int i3 = mobEventsConstructor$provisionUpdateConfig$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$provisionUpdateConfig$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$provisionUpdateConfig$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$provisionUpdateConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$provisionUpdateConfig$1.L$0 = str;
                    mobEventsConstructor$provisionUpdateConfig$1.L$1 = list;
                    mobEventsConstructor$provisionUpdateConfig$1.L$2 = pairArr2;
                    mobEventsConstructor$provisionUpdateConfig$1.L$3 = "Provision.UpdateConfig";
                    mobEventsConstructor$provisionUpdateConfig$1.L$4 = pairArr2;
                    mobEventsConstructor$provisionUpdateConfig$1.I$0 = 0;
                    mobEventsConstructor$provisionUpdateConfig$1.label = 1;
                    Object c = c(mobEventsConstructor$provisionUpdateConfig$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    list2 = list;
                    str2 = "Provision.UpdateConfig";
                    str3 = str;
                    Pair[] pairArr3 = pairArr2;
                    pairArr = pairArr3;
                    obj = c;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$provisionUpdateConfig$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$provisionUpdateConfig$1.L$4;
                    str2 = (String) mobEventsConstructor$provisionUpdateConfig$1.L$3;
                    pairArr = (Pair[]) mobEventsConstructor$provisionUpdateConfig$1.L$2;
                    list2 = (List) mobEventsConstructor$provisionUpdateConfig$1.L$1;
                    str3 = (String) mobEventsConstructor$provisionUpdateConfig$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("oldConfigId", str3);
                pairArr[2] = t(list2);
                return new Pair(str2, b.i(pairArr));
            }
        }
        mobEventsConstructor$provisionUpdateConfig$1 = new MobEventsConstructor$provisionUpdateConfig$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$provisionUpdateConfig$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$provisionUpdateConfig$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("oldConfigId", str3);
        pairArr[2] = t(list2);
        return new Pair(str2, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[LOOP:0: B:11:0x0091->B:13:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable p(String str, List list, ContinuationImpl continuationImpl) {
        MobEventsConstructor$provisionUpdateConfigFailure$1 mobEventsConstructor$provisionUpdateConfigFailure$1;
        int i;
        List list2;
        String str2;
        String str3;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$provisionUpdateConfigFailure$1) {
            mobEventsConstructor$provisionUpdateConfigFailure$1 = (MobEventsConstructor$provisionUpdateConfigFailure$1) continuationImpl;
            int i3 = mobEventsConstructor$provisionUpdateConfigFailure$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$provisionUpdateConfigFailure$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$provisionUpdateConfigFailure$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$provisionUpdateConfigFailure$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$provisionUpdateConfigFailure$1.L$0 = str;
                    list2 = list;
                    mobEventsConstructor$provisionUpdateConfigFailure$1.L$1 = list2;
                    mobEventsConstructor$provisionUpdateConfigFailure$1.L$2 = pairArr2;
                    mobEventsConstructor$provisionUpdateConfigFailure$1.L$3 = "Provision.UpdateConfig.Failure";
                    mobEventsConstructor$provisionUpdateConfigFailure$1.L$4 = pairArr2;
                    mobEventsConstructor$provisionUpdateConfigFailure$1.I$0 = 0;
                    mobEventsConstructor$provisionUpdateConfigFailure$1.label = 1;
                    Object c = c(mobEventsConstructor$provisionUpdateConfigFailure$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    Pair[] pairArr3 = pairArr2;
                    str2 = str;
                    str3 = "Provision.UpdateConfig.Failure";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$provisionUpdateConfigFailure$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$provisionUpdateConfigFailure$1.L$4;
                    str3 = (String) mobEventsConstructor$provisionUpdateConfigFailure$1.L$3;
                    Pair[] pairArr4 = (Pair[]) mobEventsConstructor$provisionUpdateConfigFailure$1.L$2;
                    List list3 = (List) mobEventsConstructor$provisionUpdateConfigFailure$1.L$1;
                    str2 = (String) mobEventsConstructor$provisionUpdateConfigFailure$1.L$0;
                    kotlin.b.b(obj);
                    pairArr = pairArr4;
                    list2 = list3;
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("configId", str2);
                List<Pair> list4 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                for (Pair pair : list4) {
                    lq20 lq20Var = (lq20) pair.getFirst();
                    ValidateConfigUseCase$InvalidCause validateConfigUseCase$InvalidCause = (ValidateConfigUseCase$InvalidCause) pair.getSecond();
                    zm20 i4 = vng.i(lq20Var);
                    arrayList.add(b.i(new Pair("apiName", i4.b), new Pair("contour", i4.a), new Pair("cause", validateConfigUseCase$InvalidCause.toString()), new Pair("proxyId", lq20Var.b), new Pair(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, lq20Var.d), new Pair("baseUrl", lq20Var.c), new Pair("ip", lq20Var.e), new Pair("hostIp", lq20Var.g), new Pair("baseUrlIp", lq20Var.f)));
                }
                pairArr[2] = new Pair("brokenProxies", arrayList);
                return new Pair(str3, b.i(pairArr));
            }
        }
        mobEventsConstructor$provisionUpdateConfigFailure$1 = new MobEventsConstructor$provisionUpdateConfigFailure$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$provisionUpdateConfigFailure$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$provisionUpdateConfigFailure$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("configId", str2);
        List<Pair> list42 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list42, 10));
        while (r1.hasNext()) {
        }
        pairArr[2] = new Pair("brokenProxies", arrayList2);
        return new Pair(str3, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable q(String str, ContinuationImpl continuationImpl) {
        MobEventsConstructor$provisionUpdateConfigParsingFailure$1 mobEventsConstructor$provisionUpdateConfigParsingFailure$1;
        int i;
        String str2;
        String str3;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$provisionUpdateConfigParsingFailure$1) {
            mobEventsConstructor$provisionUpdateConfigParsingFailure$1 = (MobEventsConstructor$provisionUpdateConfigParsingFailure$1) continuationImpl;
            int i3 = mobEventsConstructor$provisionUpdateConfigParsingFailure$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$provisionUpdateConfigParsingFailure$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$provisionUpdateConfigParsingFailure$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$provisionUpdateConfigParsingFailure$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[2];
                    mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$0 = str;
                    mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$1 = pairArr2;
                    mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$2 = "Provision.UpdateConfig.ParsingFailure";
                    mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$3 = pairArr2;
                    mobEventsConstructor$provisionUpdateConfigParsingFailure$1.I$0 = 0;
                    mobEventsConstructor$provisionUpdateConfigParsingFailure$1.label = 1;
                    Object c = c(mobEventsConstructor$provisionUpdateConfigParsingFailure$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    str2 = str;
                    Pair[] pairArr3 = pairArr2;
                    str3 = "Provision.UpdateConfig.ParsingFailure";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$provisionUpdateConfigParsingFailure$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$3;
                    str3 = (String) mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$1;
                    str2 = (String) mobEventsConstructor$provisionUpdateConfigParsingFailure$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
                return new Pair(str3, b.i(pairArr));
            }
        }
        mobEventsConstructor$provisionUpdateConfigParsingFailure$1 = new MobEventsConstructor$provisionUpdateConfigParsingFailure$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$provisionUpdateConfigParsingFailure$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$provisionUpdateConfigParsingFailure$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        return new Pair(str3, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable r(MobTrigger mobTrigger, List list, ContinuationImpl continuationImpl) {
        MobEventsConstructor$provisionUpdateSelection$1 mobEventsConstructor$provisionUpdateSelection$1;
        int i;
        List list2;
        Pair[] pairArr;
        String str;
        MobTrigger mobTrigger2;
        Object[] objArr;
        int i2;
        if (continuationImpl instanceof MobEventsConstructor$provisionUpdateSelection$1) {
            mobEventsConstructor$provisionUpdateSelection$1 = (MobEventsConstructor$provisionUpdateSelection$1) continuationImpl;
            int i3 = mobEventsConstructor$provisionUpdateSelection$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$provisionUpdateSelection$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$provisionUpdateSelection$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$provisionUpdateSelection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[3];
                    mobEventsConstructor$provisionUpdateSelection$1.L$0 = list;
                    mobEventsConstructor$provisionUpdateSelection$1.L$1 = mobTrigger;
                    mobEventsConstructor$provisionUpdateSelection$1.L$2 = pairArr2;
                    mobEventsConstructor$provisionUpdateSelection$1.L$3 = "Provision.UpdateSelection";
                    mobEventsConstructor$provisionUpdateSelection$1.L$4 = pairArr2;
                    mobEventsConstructor$provisionUpdateSelection$1.I$0 = 0;
                    mobEventsConstructor$provisionUpdateSelection$1.label = 1;
                    Object c = c(mobEventsConstructor$provisionUpdateSelection$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    list2 = list;
                    pairArr = pairArr2;
                    str = "Provision.UpdateSelection";
                    obj = c;
                    mobTrigger2 = mobTrigger;
                    objArr = pairArr;
                    i2 = 0;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$provisionUpdateSelection$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$provisionUpdateSelection$1.L$4;
                    str = (String) mobEventsConstructor$provisionUpdateSelection$1.L$3;
                    pairArr = (Pair[]) mobEventsConstructor$provisionUpdateSelection$1.L$2;
                    mobTrigger2 = (MobTrigger) mobEventsConstructor$provisionUpdateSelection$1.L$1;
                    list2 = (List) mobEventsConstructor$provisionUpdateSelection$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = t(list2);
                pairArr[2] = new Pair("triggeredBy", mobTrigger2.getValue());
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$provisionUpdateSelection$1 = new MobEventsConstructor$provisionUpdateSelection$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$provisionUpdateSelection$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$provisionUpdateSelection$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = t(list2);
        pairArr[2] = new Pair("triggeredBy", mobTrigger2.getValue());
        return new Pair(str, b.i(pairArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable s(MobRemoteNotificationCommand mobRemoteNotificationCommand, ContinuationImpl continuationImpl) {
        MobEventsConstructor$remoteNotificationsReceive$1 mobEventsConstructor$remoteNotificationsReceive$1;
        int i;
        MobRemoteNotificationCommand mobRemoteNotificationCommand2;
        String str;
        Pair[] pairArr;
        int i2;
        Object[] objArr;
        if (continuationImpl instanceof MobEventsConstructor$remoteNotificationsReceive$1) {
            mobEventsConstructor$remoteNotificationsReceive$1 = (MobEventsConstructor$remoteNotificationsReceive$1) continuationImpl;
            int i3 = mobEventsConstructor$remoteNotificationsReceive$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobEventsConstructor$remoteNotificationsReceive$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mobEventsConstructor$remoteNotificationsReceive$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobEventsConstructor$remoteNotificationsReceive$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pair[] pairArr2 = new Pair[2];
                    mobEventsConstructor$remoteNotificationsReceive$1.L$0 = mobRemoteNotificationCommand;
                    mobEventsConstructor$remoteNotificationsReceive$1.L$1 = pairArr2;
                    mobEventsConstructor$remoteNotificationsReceive$1.L$2 = "RemoteNotifications.Receive";
                    mobEventsConstructor$remoteNotificationsReceive$1.L$3 = pairArr2;
                    mobEventsConstructor$remoteNotificationsReceive$1.I$0 = 0;
                    mobEventsConstructor$remoteNotificationsReceive$1.label = 1;
                    Object c = c(mobEventsConstructor$remoteNotificationsReceive$1);
                    if (c == serializable) {
                        return serializable;
                    }
                    mobRemoteNotificationCommand2 = mobRemoteNotificationCommand;
                    Pair[] pairArr3 = pairArr2;
                    str = "RemoteNotifications.Receive";
                    obj = c;
                    pairArr = pairArr3;
                    i2 = 0;
                    objArr = pairArr3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mobEventsConstructor$remoteNotificationsReceive$1.I$0;
                    Object[] objArr2 = (Pair[]) mobEventsConstructor$remoteNotificationsReceive$1.L$3;
                    str = (String) mobEventsConstructor$remoteNotificationsReceive$1.L$2;
                    pairArr = (Pair[]) mobEventsConstructor$remoteNotificationsReceive$1.L$1;
                    mobRemoteNotificationCommand2 = (MobRemoteNotificationCommand) mobEventsConstructor$remoteNotificationsReceive$1.L$0;
                    kotlin.b.b(obj);
                    objArr = objArr2;
                }
                objArr[i2] = obj;
                pairArr[1] = new Pair("notificationType", mobRemoteNotificationCommand2.getValue());
                return new Pair(str, b.i(pairArr));
            }
        }
        mobEventsConstructor$remoteNotificationsReceive$1 = new MobEventsConstructor$remoteNotificationsReceive$1(this, continuationImpl);
        Object obj2 = mobEventsConstructor$remoteNotificationsReceive$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobEventsConstructor$remoteNotificationsReceive$1.label;
        if (i != 0) {
        }
        objArr[i2] = obj2;
        pairArr[1] = new Pair("notificationType", mobRemoteNotificationCommand2.getValue());
        return new Pair(str, b.i(pairArr));
    }
}
