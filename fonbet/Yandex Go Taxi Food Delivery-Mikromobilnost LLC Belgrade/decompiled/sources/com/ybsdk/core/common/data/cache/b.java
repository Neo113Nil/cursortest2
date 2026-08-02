package com.ybsdk.core.common.data.cache;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.data.network.dto.cache.CacheableResponseDto;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDto;
import com.ybsdk.core.common.data.network.dto.cache.MvLayoutInfoDto;
import com.ybsdk.core.common.domain.entities.cache.ExpireableEntity$Behaviour;
import com.ybsdk.core.common.utils.preferences.LazySharedPreferences;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.rconfig.configs.ResponseCacheConfigExperiment;
import defpackage.aog;
import defpackage.aso;
import defpackage.awa0;
import defpackage.bvf0;
import defpackage.dpp0;
import defpackage.dsg;
import defpackage.e3n;
import defpackage.e5z0;
import defpackage.f8z0;
import defpackage.fcy0;
import defpackage.fse;
import defpackage.g050;
import defpackage.g3r;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.i5z0;
import defpackage.if8;
import defpackage.jl40;
import defpackage.jqp0;
import defpackage.l8x;
import defpackage.lb7;
import defpackage.lrp0;
import defpackage.mlg;
import defpackage.nbp0;
import defpackage.nv00;
import defpackage.ny61;
import defpackage.odf0;
import defpackage.p9g0;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s630;
import defpackage.s8j0;
import defpackage.shg;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.tvj0;
import defpackage.u8j0;
import defpackage.uvj0;
import defpackage.uza;
import defpackage.uzn;
import defpackage.vr;
import defpackage.vvj0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wvj0;
import defpackage.x4c;
import defpackage.xga1;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class b {
    public final nbp0 a;
    public final if8 b;
    public final LinkedHashMap c;
    public final AppAnalyticsReporter d;
    public final dpp0 e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final m h;
    public final r0 i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final ConcurrentHashMap l;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(nbp0 nbp0Var, if8 if8Var, LinkedHashMap linkedHashMap, AppAnalyticsReporter appAnalyticsReporter, dpp0 dpp0Var, vr vrVar, m mVar) {
        Object failure;
        Throwable a;
        boolean z;
        boolean l;
        boolean z2;
        this.a = nbp0Var;
        this.b = if8Var;
        this.c = linkedHashMap;
        this.d = appAnalyticsReporter;
        this.e = dpp0Var;
        this.h = ((ResponseCacheConfigExperiment) if8Var.a.d(tvj0.a).getData()).getEnabled() ? mVar : null;
        this.i = bvf0.c(kotlin.collections.b.f());
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
        Context context = vrVar.a;
        try {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            String language = locale != null ? locale.getLanguage() : null;
            LazySharedPreferences lazySharedPreferences = (LazySharedPreferences) new lb7(context, 7).c;
            z = lazySharedPreferences.getBoolean("crash_detected", false);
            l = jl40.l(lazySharedPreferences.getString("locale", null), language);
            Locale locale2 = context.getResources().getConfiguration().getLocales().get(0);
            String language2 = locale2 != null ? locale2.getLanguage() : null;
            SharedPreferences.Editor edit = lazySharedPreferences.edit();
            edit.putString("locale", language2);
            edit.apply();
            SharedPreferences.Editor edit2 = lazySharedPreferences.edit();
            edit2.putBoolean("crash_detected", false);
            edit2.commit();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!z && l) {
            z2 = false;
            failure = Boolean.valueOf(z2);
            a = Result.a(failure);
            if (a != null) {
                x4c.g("Failed to check environment changes. Response cache will be dropped", a, null, null, 12);
                failure = Boolean.TRUE;
            }
            if (((Boolean) failure).booleanValue()) {
                return;
            }
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("ResponseCache");
            e5z0Var.a("Changes in environment detected. Drop cache", new Object[0]);
            this.d.m0.a.a("tech.insta_cache.environment_changed", null);
            g();
            return;
        }
        z2 = true;
        failure = Boolean.valueOf(z2);
        a = Result.a(failure);
        if (a != null) {
        }
        if (((Boolean) failure).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, ContinuationImpl continuationImpl) {
        ResponseCache$drop$1 responseCache$drop$1;
        int i;
        Map j;
        r0 r0Var = bVar.i;
        ConcurrentHashMap concurrentHashMap = bVar.l;
        m mVar = bVar.h;
        if (continuationImpl instanceof ResponseCache$drop$1) {
            responseCache$drop$1 = (ResponseCache$drop$1) continuationImpl;
            int i2 = responseCache$drop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseCache$drop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = responseCache$drop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseCache$drop$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e5z0 e5z0Var = i5z0.a;
                    e5z0Var.m("ResponseCache");
                    e5z0Var.a("Drop cache for " + str, new Object[0]);
                    bVar.d.m0.a.a("tech.insta_cache.drop", g8e.w(1, "name", str));
                    pz40 pz40Var = (pz40) bVar.j.get(str);
                    if (pz40Var != null) {
                        ((r0) pz40Var).l(null);
                    }
                    if (mVar != null) {
                        mVar.b(str);
                    }
                    bVar.k.remove(str);
                    l8x l8xVar = (l8x) concurrentHashMap.get(str);
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                    concurrentHashMap.remove(str);
                    Map map = (Map) r0Var.getValue();
                    if (map.containsKey(str)) {
                        j = kotlin.collections.b.j(str, map);
                        responseCache$drop$1.L$0 = j;
                        responseCache$drop$1.label = 1;
                        r0Var.emit(j, responseCache$drop$1);
                        if (zy11Var == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = (Map) responseCache$drop$1.L$0;
                kotlin.b.b(obj);
                if (mVar != null) {
                    mVar.c(j);
                }
                return zy11Var;
            }
        }
        responseCache$drop$1 = new ResponseCache$drop$1(bVar, continuationImpl);
        Object obj2 = responseCache$drop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$drop$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (mVar != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, Map map, ContinuationImpl continuationImpl) {
        ResponseCache$putCommonData$1 responseCache$putCommonData$1;
        int i;
        Map map2;
        m mVar;
        r0 r0Var = bVar.i;
        if (continuationImpl instanceof ResponseCache$putCommonData$1) {
            responseCache$putCommonData$1 = (ResponseCache$putCommonData$1) continuationImpl;
            int i2 = responseCache$putCommonData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseCache$putCommonData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = responseCache$putCommonData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseCache$putCommonData$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e5z0 e5z0Var = i5z0.a;
                    e5z0Var.m("ResponseCache");
                    e5z0Var.a("Update common data", new Object[0]);
                    long currentTimeMillis = System.currentTimeMillis();
                    Map map3 = (Map) r0Var.getValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map3.entrySet()) {
                        if (((StoredDataEntry) entry.getValue()).getLifeExpectancyMs() > currentTimeMillis) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key = entry2.getKey();
                        DataEntryDto dataEntryDto = (DataEntryDto) entry2.getValue();
                        linkedHashMap2.put(key, new StoredDataEntry(dataEntryDto.getTtl(), currentTimeMillis, dataEntryDto.getType(), dataEntryDto.getValue(), false));
                    }
                    LinkedHashMap n = kotlin.collections.b.n(linkedHashMap, linkedHashMap2);
                    responseCache$putCommonData$1.L$0 = n;
                    responseCache$putCommonData$1.label = 1;
                    r0Var.emit(n, responseCache$putCommonData$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map2 = n;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) responseCache$putCommonData$1.L$0;
                    kotlin.b.b(obj);
                }
                mVar = bVar.h;
                if (mVar != null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry3 : map2.entrySet()) {
                        if (((StoredDataEntry) entry3.getValue()).getTtl() > 0) {
                            linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    mVar.c(linkedHashMap3);
                }
                return zy11Var;
            }
        }
        responseCache$putCommonData$1 = new ResponseCache$putCommonData$1(bVar, continuationImpl);
        Object obj2 = responseCache$putCommonData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$putCommonData$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        mVar = bVar.h;
        if (mVar != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, vvj0 vvj0Var, MvLayoutInfoDto mvLayoutInfoDto, ContinuationImpl continuationImpl) {
        ResponseCache$putLayoutInfo$1 responseCache$putLayoutInfo$1;
        int i;
        StoredLayoutInfo storedLayoutInfo;
        StoredLayoutInfo storedLayoutInfo2;
        Object failure;
        vvj0 vvj0Var2 = vvj0Var;
        MvLayoutInfoDto mvLayoutInfoDto2 = mvLayoutInfoDto;
        m mVar = bVar.h;
        lrp0 lrp0Var = lrp0.z;
        ConcurrentHashMap concurrentHashMap = bVar.j;
        if (continuationImpl instanceof ResponseCache$putLayoutInfo$1) {
            responseCache$putLayoutInfo$1 = (ResponseCache$putLayoutInfo$1) continuationImpl;
            int i2 = responseCache$putLayoutInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseCache$putLayoutInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = responseCache$putLayoutInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseCache$putLayoutInfo$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 pz40Var = (pz40) concurrentHashMap.get(vvj0Var2.b);
                    storedLayoutInfo = pz40Var != null ? (StoredLayoutInfo) ((r0) pz40Var).getValue() : null;
                    if (mvLayoutInfoDto2 == null && storedLayoutInfo == null) {
                        x4c.g("Can't update cache. Missing new layout_info", null, null, Collections.singletonList(lrp0Var), 6);
                        return zy11Var;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (mvLayoutInfoDto2 == null) {
                        if (storedLayoutInfo != null) {
                            storedLayoutInfo2 = storedLayoutInfo;
                        }
                        return zy11Var;
                    }
                    storedLayoutInfo2 = new StoredLayoutInfo(mvLayoutInfoDto2.getTtl(), currentTimeMillis, mvLayoutInfoDto2.getHash(), false, mvLayoutInfoDto2.getVersion(), mvLayoutInfoDto2.getInfo());
                    StoredLayoutInfo copy$default = StoredLayoutInfo.copy$default(storedLayoutInfo2, 0L, currentTimeMillis, null, false, 0, null, 53, null);
                    String str = vvj0Var2.b;
                    Object obj2 = concurrentHashMap.get(str);
                    if (obj2 == null) {
                        r0 e = bVar.e(vvj0Var2, copy$default);
                        Object putIfAbsent = concurrentHashMap.putIfAbsent(str, e);
                        obj2 = putIfAbsent == null ? e : putIfAbsent;
                    }
                    responseCache$putLayoutInfo$1.L$0 = vvj0Var2;
                    responseCache$putLayoutInfo$1.L$1 = mvLayoutInfoDto2;
                    responseCache$putLayoutInfo$1.L$2 = storedLayoutInfo;
                    responseCache$putLayoutInfo$1.L$3 = storedLayoutInfo2;
                    responseCache$putLayoutInfo$1.label = 1;
                    ((r0) ((pz40) obj2)).emit(copy$default, responseCache$putLayoutInfo$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    StoredLayoutInfo storedLayoutInfo3 = (StoredLayoutInfo) responseCache$putLayoutInfo$1.L$3;
                    StoredLayoutInfo storedLayoutInfo4 = (StoredLayoutInfo) responseCache$putLayoutInfo$1.L$2;
                    MvLayoutInfoDto mvLayoutInfoDto3 = (MvLayoutInfoDto) responseCache$putLayoutInfo$1.L$1;
                    vvj0 vvj0Var3 = (vvj0) responseCache$putLayoutInfo$1.L$0;
                    kotlin.b.b(obj);
                    storedLayoutInfo2 = storedLayoutInfo3;
                    storedLayoutInfo = storedLayoutInfo4;
                    mvLayoutInfoDto2 = mvLayoutInfoDto3;
                    vvj0Var2 = vvj0Var3;
                }
                if (jl40.l(mvLayoutInfoDto2 == null ? mvLayoutInfoDto2.getHash() : null, storedLayoutInfo == null ? storedLayoutInfo.getHash() : null)) {
                    bVar.d.m0.a.a("tech.insta_cache.save_response.same_hash_as_saved", g8e.w(1, "name", vvj0Var2.b));
                }
                if (mvLayoutInfoDto2 == null && mvLayoutInfoDto2.getTtl() == 0) {
                    e5z0 e5z0Var = i5z0.a;
                    e5z0Var.m("ResponseCache");
                    e5z0Var.a("Drop disk cache. TTL is zero", new Object[0]);
                    if (mVar != null) {
                        mVar.b(vvj0Var2.b);
                        return zy11Var;
                    }
                } else {
                    e5z0 e5z0Var2 = i5z0.a;
                    e5z0Var2.m("ResponseCache");
                    e5z0Var2.a("Write to disk cache", new Object[0]);
                    if (mVar != null) {
                        String str2 = vvj0Var2.a;
                        String str3 = vvj0Var2.b;
                        try {
                            File file = new File((File) mVar.g, str3);
                            file.createNewFile();
                            byte[] bytes = ((mlg) ((wvj0) ((LinkedHashMap) mVar.b).get(str2))).b.toJson(storedLayoutInfo2.getInfo()).getBytes(uza.a);
                            long a = s630.a();
                            uzn a2 = ((uvj0) mVar.c).a(bytes);
                            ((awa0) mVar.d).a(e3n.e(f8z0.a(a)), "Insta.Security.Encrypt");
                            g3r.f(file, a2.b);
                            String json2 = ((JsonAdapter) ((i3y) mVar.j).getValue()).toJson(storedLayoutInfo2);
                            String str4 = a2.a + "\n" + json2 + "\n" + str2;
                            File file2 = new File((File) mVar.h, str3.concat("_meta"));
                            file2.createNewFile();
                            g3r.g(file2, str4);
                            failure = zy11Var;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        Throwable a3 = Result.a(failure);
                        if (a3 != null) {
                            x4c.g("Failed to save new value into persistent storage", a3, null, Collections.singletonList(lrp0Var), 4);
                        }
                    }
                }
                return zy11Var;
            }
        }
        responseCache$putLayoutInfo$1 = new ResponseCache$putLayoutInfo$1(bVar, continuationImpl);
        Object obj3 = responseCache$putLayoutInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$putLayoutInfo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (jl40.l(mvLayoutInfoDto2 == null ? mvLayoutInfoDto2.getHash() : null, storedLayoutInfo == null ? storedLayoutInfo.getHash() : null)) {
        }
        if (mvLayoutInfoDto2 == null) {
        }
        e5z0 e5z0Var22 = i5z0.a;
        e5z0Var22.m("ResponseCache");
        e5z0Var22.a("Write to disk cache", new Object[0]);
        if (mVar != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(vvj0 vvj0Var) {
        boolean z;
        List list;
        ArrayList arrayList;
        boolean z2;
        u8j0 u8j0Var;
        pz40 pz40Var = (pz40) this.j.get(vvj0Var.b);
        StoredLayoutInfo storedLayoutInfo = pz40Var != null ? (StoredLayoutInfo) ((r0) pz40Var).getValue() : null;
        wvj0 wvj0Var = (wvj0) this.c.get(vvj0Var.a);
        shg s = wvj0Var != null ? ((mlg) wvj0Var).a.s() : null;
        if (s != null) {
            Boolean valueOf = storedLayoutInfo != null ? Boolean.valueOf(storedLayoutInfo.getLifeExpectancyMs() > System.currentTimeMillis() && storedLayoutInfo.getVersion() == s.b) : null;
            if (valueOf != null) {
                z = valueOf.booleanValue();
                pz40 pz40Var2 = (pz40) this.k.get(vvj0Var.b);
                nv00 nv00Var = (pz40Var2 != null || (u8j0Var = (u8j0) ((r0) pz40Var2).getValue()) == null) ? null : (nv00) u8j0Var.a();
                list = nv00Var != null ? nv00Var.b : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((aso) obj).d == ExpireableEntity$Behaviour.REQUIRED) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aso asoVar = (aso) it.next();
                        asoVar.getClass();
                        if (System.currentTimeMillis() > xga1.d(asoVar)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                return (z || z2) ? false : true;
            }
        }
        z = false;
        pz40 pz40Var22 = (pz40) this.k.get(vvj0Var.b);
        if (pz40Var22 != null) {
        }
        if (nv00Var != null) {
        }
        if (list == null) {
        }
        arrayList = new ArrayList();
        while (r10.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        z2 = false;
        if (z) {
        }
    }

    public final r0 e(vvj0 vvj0Var, StoredLayoutInfo storedLayoutInfo) {
        r0 c = bvf0.c(storedLayoutInfo);
        this.l.put(vvj0Var.b, c.a(e.p(new m0(c, this.i, new ResponseCache$createResponseStorageFlow$mappedResponseUpdateJob$1(this, vvj0Var, null)), 32L), this.a.b, new p9g0(2, this, vvj0Var)));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, String str, String str2, wls wlsVar, ContinuationImpl continuationImpl) {
        ResponseCache$doOrReport$1 responseCache$doOrReport$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str3;
        String str4;
        kotlinx.coroutines.sync.a aVar;
        wls wlsVar2;
        Object obj2;
        String str5;
        g050 g050Var;
        Object k0;
        String str6;
        String str7;
        Throwable a;
        try {
            if (continuationImpl instanceof ResponseCache$doOrReport$1) {
                responseCache$doOrReport$1 = (ResponseCache$doOrReport$1) continuationImpl;
                int i2 = responseCache$doOrReport$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    responseCache$doOrReport$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = responseCache$doOrReport$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = responseCache$doOrReport$1.label;
                    String str8 = null;
                    if (i != 0) {
                        kotlin.b.b(obj3);
                        try {
                            aVar = this.f;
                            responseCache$doOrReport$1.L$0 = str;
                            responseCache$doOrReport$1.L$1 = str2;
                            wlsVar2 = wlsVar;
                            responseCache$doOrReport$1.L$2 = wlsVar2;
                            responseCache$doOrReport$1.L$3 = obj;
                            responseCache$doOrReport$1.L$4 = aVar;
                            responseCache$doOrReport$1.label = 1;
                            if (aVar.a(responseCache$doOrReport$1) != coroutineSingletons) {
                                obj2 = obj;
                                str5 = str;
                                str4 = str2;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            str3 = str;
                            str4 = str2;
                            obj3 = new Result.Failure(th);
                            str5 = str3;
                            str7 = str4;
                            a = Result.a(obj3);
                            if (a != null) {
                            }
                            return obj3;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) responseCache$doOrReport$1.L$2;
                        ?? r4 = responseCache$doOrReport$1.L$1;
                        String str9 = (String) responseCache$doOrReport$1.L$0;
                        try {
                            kotlin.b.b(obj3);
                            str5 = str9;
                            str6 = r4;
                            try {
                                g050Var.d(null);
                                str7 = str6;
                            } catch (Throwable th2) {
                                th = th2;
                                str4 = str6;
                                str3 = str5;
                                obj3 = new Result.Failure(th);
                                str5 = str3;
                                str7 = str4;
                                a = Result.a(obj3);
                                if (a != null) {
                                }
                                return obj3;
                            }
                            a = Result.a(obj3);
                            if (a != null) {
                                List singletonList = Collections.singletonList(lrp0.z);
                                boolean isEmpty = singletonList.isEmpty();
                                if (!isEmpty) {
                                    if (isEmpty) {
                                        w511.b();
                                        return null;
                                    }
                                    str8 = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
                                }
                                trp0 trp0Var = trp0.a;
                                trp0.e(new jqp0(a, str5, str7, str8));
                            }
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = str9;
                            str4 = r4;
                            try {
                                g050Var.d(null);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                                str3 = str5;
                                obj3 = new Result.Failure(th);
                                str5 = str3;
                                str7 = str4;
                                a = Result.a(obj3);
                                if (a != null) {
                                }
                                return obj3;
                            }
                        }
                    }
                    ?? r42 = (g050) responseCache$doOrReport$1.L$4;
                    Object obj4 = responseCache$doOrReport$1.L$3;
                    wlsVar2 = (wls) responseCache$doOrReport$1.L$2;
                    ?? r10 = responseCache$doOrReport$1.L$1;
                    str5 = (String) responseCache$doOrReport$1.L$0;
                    try {
                        kotlin.b.b(obj3);
                        obj2 = obj4;
                        str4 = r10;
                        aVar = r42;
                    } catch (Throwable th5) {
                        th = th5;
                        str4 = r10;
                        str3 = str5;
                        obj3 = new Result.Failure(th);
                        str5 = str3;
                        str7 = str4;
                        a = Result.a(obj3);
                        if (a != null) {
                        }
                        return obj3;
                    }
                    fse fseVar = this.a.b.a;
                    ResponseCache$doOrReport$2$1$1 responseCache$doOrReport$2$1$1 = new ResponseCache$doOrReport$2$1$1(wlsVar2, obj2, null);
                    responseCache$doOrReport$1.L$0 = str5;
                    responseCache$doOrReport$1.L$1 = str4;
                    responseCache$doOrReport$1.L$2 = aVar;
                    responseCache$doOrReport$1.L$3 = null;
                    responseCache$doOrReport$1.L$4 = null;
                    responseCache$doOrReport$1.label = 2;
                    k0 = tje.k0(fseVar, responseCache$doOrReport$2$1$1, responseCache$doOrReport$1);
                    if (k0 != coroutineSingletons) {
                        g050Var = aVar;
                        str6 = str4;
                        obj3 = k0;
                        g050Var.d(null);
                        str7 = str6;
                        a = Result.a(obj3);
                        if (a != null) {
                        }
                        return obj3;
                    }
                    return coroutineSingletons;
                }
            }
            fse fseVar2 = this.a.b.a;
            ResponseCache$doOrReport$2$1$1 responseCache$doOrReport$2$1$12 = new ResponseCache$doOrReport$2$1$1(wlsVar2, obj2, null);
            responseCache$doOrReport$1.L$0 = str5;
            responseCache$doOrReport$1.L$1 = str4;
            responseCache$doOrReport$1.L$2 = aVar;
            responseCache$doOrReport$1.L$3 = null;
            responseCache$doOrReport$1.L$4 = null;
            responseCache$doOrReport$1.label = 2;
            k0 = tje.k0(fseVar2, responseCache$doOrReport$2$1$12, responseCache$doOrReport$1);
            if (k0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th6) {
            th = th6;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        responseCache$doOrReport$1 = new ResponseCache$doOrReport$1(this, continuationImpl);
        Object obj32 = responseCache$doOrReport$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$doOrReport$1.label;
        String str82 = null;
        if (i != 0) {
        }
    }

    public final void g() {
        this.d.m0.a.a("tech.insta_cache.drop_all", null);
        tje.N(this.a.b, null, null, new ResponseCache$dropAll$1(this, null), 3);
    }

    public final void h(String str) {
        fcy0 fcy0Var = this.d.m0;
        fcy0Var.a.a("tech.insta_cache.drop", g8e.w(1, "name", str));
        tje.N(this.a.b, null, null, new ResponseCache$dropFor$1(this, str, null), 3);
    }

    public final void i() {
        this.d.m0.a.a("tech.insta_cache.drop_session", null);
        tje.N(this.a.b, null, null, new ResponseCache$dropSession$1(this, null), 3);
    }

    public final String j(vvj0 vvj0Var) {
        pz40 pz40Var;
        StoredLayoutInfo storedLayoutInfo;
        String hash;
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("ResponseCache");
        e5z0Var.a("Get hash", new Object[0]);
        if (!((ResponseCacheConfigExperiment) this.b.a.d(tvj0.a).getData()).getEnabled() || (pz40Var = (pz40) this.j.get(vvj0Var.b)) == null || (storedLayoutInfo = (StoredLayoutInfo) ((r0) pz40Var).getValue()) == null || (hash = storedLayoutInfo.getHash()) == null || !d(vvj0Var)) {
            return null;
        }
        return hash;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final LinkedHashMap k(Map map) {
        Object obj;
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            StoredDataEntry storedDataEntry = (StoredDataEntry) entry.getValue();
            if (!storedDataEntry.getStale() || storedDataEntry.getLifeExpectancyMs() > currentTimeMillis) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            StoredDataEntry storedDataEntry2 = (StoredDataEntry) entry2.getValue();
            String type = storedDataEntry2.getType();
            switch (type.hashCode()) {
                case -1808118735:
                    if (type.equals("String")) {
                        value = storedDataEntry2.getValue();
                        obj = value;
                        break;
                    }
                    x4c.g("Failed to parse common_data type", null, storedDataEntry2.getType(), Collections.singletonList(lrp0.z), 2);
                    obj = null;
                    break;
                case 73679:
                    if (type.equals("Int")) {
                        value = Integer.valueOf(Integer.parseInt(storedDataEntry2.getValue()));
                        obj = value;
                        break;
                    }
                    x4c.g("Failed to parse common_data type", null, storedDataEntry2.getType(), Collections.singletonList(lrp0.z), 2);
                    obj = null;
                    break;
                case 2374300:
                    if (type.equals("Long")) {
                        value = Long.valueOf(Long.parseLong(storedDataEntry2.getValue()));
                        obj = value;
                        break;
                    }
                    x4c.g("Failed to parse common_data type", null, storedDataEntry2.getType(), Collections.singletonList(lrp0.z), 2);
                    obj = null;
                    break;
                case 67973692:
                    if (type.equals("Float")) {
                        value = Float.valueOf(Float.parseFloat(storedDataEntry2.getValue()));
                        obj = value;
                        break;
                    }
                    x4c.g("Failed to parse common_data type", null, storedDataEntry2.getType(), Collections.singletonList(lrp0.z), 2);
                    obj = null;
                    break;
                case 2052876273:
                    if (type.equals("Double")) {
                        value = Double.valueOf(Double.parseDouble(storedDataEntry2.getValue()));
                        obj = value;
                        break;
                    }
                    x4c.g("Failed to parse common_data type", null, storedDataEntry2.getType(), Collections.singletonList(lrp0.z), 2);
                    obj = null;
                    break;
                default:
                    x4c.g("Failed to parse common_data type", null, storedDataEntry2.getType(), Collections.singletonList(lrp0.z), 2);
                    obj = null;
                    break;
            }
            if (obj != null) {
                linkedHashMap.put(str, new aog(storedDataEntry2.getTtl(), storedDataEntry2.getReceivedAt(), obj, storedDataEntry2.getStale()));
            }
        }
        return linkedHashMap;
    }

    public final u8j0 l(u8j0 u8j0Var, vvj0 vvj0Var) {
        u8j0 t8j0Var;
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((nv00) r8j0Var.a).a, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return null;
            }
            t8j0Var = new t8j0();
        }
        return t8j0Var instanceof r8j0 ? r8j0.d((r8j0) t8j0Var, null, false, d(vvj0Var), 11) : t8j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(vvj0 vvj0Var, CacheableResponseDto cacheableResponseDto, ContinuationImpl continuationImpl) {
        ResponseCache$put$1 responseCache$put$1;
        int i;
        Object f;
        String message;
        fcy0 fcy0Var = this.d.m0;
        if (continuationImpl instanceof ResponseCache$put$1) {
            responseCache$put$1 = (ResponseCache$put$1) continuationImpl;
            int i2 = responseCache$put$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseCache$put$1.label = i2 - Integer.MIN_VALUE;
                ResponseCache$put$1 responseCache$put$12 = responseCache$put$1;
                Object obj = responseCache$put$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseCache$put$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fcy0Var.a.a("tech.insta_cache.save_response.initiated", g8e.w(1, "name", vvj0Var.b));
                    wls responseCache$put$2 = new ResponseCache$put$2(vvj0Var, cacheableResponseDto, null);
                    responseCache$put$12.L$0 = vvj0Var;
                    responseCache$put$12.label = 1;
                    f = f(this, "Failed to cache response", null, responseCache$put$2, responseCache$put$12);
                    if (f == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vvj0Var = (vvj0) responseCache$put$12.L$0;
                    kotlin.b.b(obj);
                    f = ((Result) obj).getValue();
                }
                String str = vvj0Var.b;
                Throwable a = Result.a(f);
                message = a != null ? a.getMessage() : null;
                LinkedHashMap w = g8e.w(2, "name", str);
                if (message != null) {
                    w.put("error", message);
                }
                fcy0Var.a.a("tech.insta_cache.save_response.finish", w);
                return f;
            }
        }
        responseCache$put$1 = new ResponseCache$put$1(this, continuationImpl);
        ResponseCache$put$1 responseCache$put$122 = responseCache$put$1;
        Object obj3 = responseCache$put$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$put$122.label;
        if (i != 0) {
        }
        String str2 = vvj0Var.b;
        Throwable a2 = Result.a(f);
        if (a2 != null) {
        }
        LinkedHashMap w2 = g8e.w(2, "name", str2);
        if (message != null) {
        }
        fcy0Var.a.a("tech.insta_cache.save_response.finish", w2);
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, DataEntryDto dataEntryDto, ContinuationImpl continuationImpl) {
        ResponseCache$updateCommonDataEntry$1 responseCache$updateCommonDataEntry$1;
        int i;
        if (continuationImpl instanceof ResponseCache$updateCommonDataEntry$1) {
            responseCache$updateCommonDataEntry$1 = (ResponseCache$updateCommonDataEntry$1) continuationImpl;
            int i2 = responseCache$updateCommonDataEntry$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                responseCache$updateCommonDataEntry$1.label = i2 - Integer.MIN_VALUE;
                ResponseCache$updateCommonDataEntry$1 responseCache$updateCommonDataEntry$12 = responseCache$updateCommonDataEntry$1;
                Object obj = responseCache$updateCommonDataEntry$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseCache$updateCommonDataEntry$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls responseCache$updateCommonDataEntry$2 = new ResponseCache$updateCommonDataEntry$2(str, dataEntryDto, null);
                responseCache$updateCommonDataEntry$12.label = 1;
                Object f = f(this, "Failed to update common data entry", str, responseCache$updateCommonDataEntry$2, responseCache$updateCommonDataEntry$12);
                return f == obj2 ? obj2 : f;
            }
        }
        responseCache$updateCommonDataEntry$1 = new ResponseCache$updateCommonDataEntry$1(this, continuationImpl);
        ResponseCache$updateCommonDataEntry$1 responseCache$updateCommonDataEntry$122 = responseCache$updateCommonDataEntry$1;
        Object obj3 = responseCache$updateCommonDataEntry$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseCache$updateCommonDataEntry$122.label;
        if (i == 0) {
        }
    }

    public final void o() {
        if (!((ResponseCacheConfigExperiment) this.b.a.d(tvj0.a).getData()).getEnabled() || this.h == null) {
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("ResponseCache");
            e5z0Var.a("Warm up skipped. Config disabled", new Object[0]);
        } else if (!this.g.compareAndSet(false, true)) {
            e5z0 e5z0Var2 = i5z0.a;
            e5z0Var2.m("ResponseCache");
            e5z0Var2.a("Warm up skipped. Already warm", new Object[0]);
        } else {
            e5z0 e5z0Var3 = i5z0.a;
            e5z0Var3.m("ResponseCache");
            e5z0Var3.a("Warm up start", new Object[0]);
            this.d.m0.a.a("tech.insta_cache.warm_up.initiated", null);
            tje.N(this.a.b, null, null, new ResponseCache$warmUp$1(this, null), 3).w(new odf0(22, this));
        }
    }
}
