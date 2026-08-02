package com.ybsdk.feature.divkit.api.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.a6w;
import defpackage.dsg;
import defpackage.jqp0;
import defpackage.kgx;
import defpackage.mdh;
import defpackage.mqp0;
import defpackage.ny61;
import defpackage.orp0;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.rr51;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.trp0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xls0;
import defpackage.ye0;
import defpackage.zy11;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes3.dex */
public final class a implements xls0 {
    public static final /* synthetic */ kgx[] j;
    public final Context a;
    public final AppAnalyticsReporter b;
    public final JsonAdapter c;
    public final JsonAdapter d;
    public final JsonAdapter e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public final a6w h;
    public final a6w i;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("lastUpdateTimeMs", 0, "getLastUpdateTimeMs()J", a.class);
        qoi0.a.getClass();
        j = new kgx[]{mutablePropertyReference1Impl};
    }

    public a(Context context, AppAnalyticsReporter appAnalyticsReporter, SharedPreferences sharedPreferences, Moshi moshi) {
        this.a = context;
        this.b = appAnalyticsReporter;
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, LocalSkeleton.class);
        this.c = moshi.adapter(DivDataDto.class);
        this.d = moshi.adapter(newParameterizedType);
        this.e = moshi.adapter(SkeletonAliases.class);
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new a6w(1, sharedPreferences, "prefs_last_update_uid");
        this.i = new a6w(1, sharedPreferences, "prefs_last_update_time_ms");
    }

    public static final File a(a aVar, String str) {
        aVar.getClass();
        return new File(aVar.a.getDir("skeletons", 0), oyr.p("skeleton_", str, ".json"));
    }

    public static void j(String str, Object obj, Exception exc) {
        String X;
        List singletonList = Collections.singletonList(orp0.b);
        boolean isEmpty = singletonList.isEmpty();
        if (isEmpty) {
            X = null;
        } else {
            if (isEmpty) {
                w511.b();
                return;
            }
            X = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
        }
        if (exc == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new mqp0(str, X, obj));
        } else {
            trp0 trp0Var2 = trp0.a;
            trp0.e(new jqp0(exc, str, obj, X));
        }
    }

    public static /* synthetic */ Object l(a aVar, String str, Object obj, tls tlsVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return aVar.k(str, obj, null, tlsVar, continuationImpl);
    }

    public final Object b(SkeletonAliases skeletonAliases, ContinuationImpl continuationImpl) {
        Object l = l(this, "Can't create or update skeleton aliases", skeletonAliases, new SkeletonStorageImpl$createOrUpdateAliases$2(this, skeletonAliases, null), continuationImpl, 4);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    public final Object c(ArrayList arrayList, Continuation continuation) {
        Object l = l(this, "Can't create or update skeletons meta", arrayList, new SkeletonStorageImpl$createOrUpdateSkeletonsMeta$2(this, arrayList, null), (ContinuationImpl) continuation, 4);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        SkeletonStorageImpl$deleteSkeleton$1 skeletonStorageImpl$deleteSkeleton$1;
        int i;
        if (continuationImpl instanceof SkeletonStorageImpl$deleteSkeleton$1) {
            skeletonStorageImpl$deleteSkeleton$1 = (SkeletonStorageImpl$deleteSkeleton$1) continuationImpl;
            int i2 = skeletonStorageImpl$deleteSkeleton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonStorageImpl$deleteSkeleton$1.label = i2 - Integer.MIN_VALUE;
                SkeletonStorageImpl$deleteSkeleton$1 skeletonStorageImpl$deleteSkeleton$12 = skeletonStorageImpl$deleteSkeleton$1;
                Object obj = skeletonStorageImpl$deleteSkeleton$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonStorageImpl$deleteSkeleton$12.label;
                if (i != 0) {
                    b.b(obj);
                    RawSkeletonId m431boximpl = RawSkeletonId.m431boximpl(str);
                    SkeletonStorageImpl$deleteSkeleton$2 skeletonStorageImpl$deleteSkeleton$2 = new SkeletonStorageImpl$deleteSkeleton$2(this, str, null);
                    skeletonStorageImpl$deleteSkeleton$12.label = 1;
                    obj = l(this, "Can't delete skeleton with id", m431boximpl, skeletonStorageImpl$deleteSkeleton$2, skeletonStorageImpl$deleteSkeleton$12, 4);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        skeletonStorageImpl$deleteSkeleton$1 = new SkeletonStorageImpl$deleteSkeleton$1(this, continuationImpl);
        SkeletonStorageImpl$deleteSkeleton$1 skeletonStorageImpl$deleteSkeleton$122 = skeletonStorageImpl$deleteSkeleton$1;
        Object obj2 = skeletonStorageImpl$deleteSkeleton$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonStorageImpl$deleteSkeleton$122.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    public final Object e(ContinuationImpl continuationImpl) {
        return l(this, "Can't get skeleton aliases hash", null, new SkeletonStorageImpl$getAliases$2(this, null), continuationImpl, 6);
    }

    public final Long f() {
        Long a = this.h.a();
        if (a.longValue() != 0) {
            return a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ye0 ye0Var, ContinuationImpl continuationImpl) {
        SkeletonStorageImpl$getSkeleton$1 skeletonStorageImpl$getSkeleton$1;
        int i;
        RawSkeletonId rawSkeletonId;
        ConcurrentMap concurrentMap;
        rr51 rr51Var;
        if (continuationImpl instanceof SkeletonStorageImpl$getSkeleton$1) {
            skeletonStorageImpl$getSkeleton$1 = (SkeletonStorageImpl$getSkeleton$1) continuationImpl;
            int i2 = skeletonStorageImpl$getSkeleton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonStorageImpl$getSkeleton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = skeletonStorageImpl$getSkeleton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonStorageImpl$getSkeleton$1.label;
                if (i != 0) {
                    b.b(obj);
                    RawSkeletonId rawSkeletonId2 = (RawSkeletonId) this.g.get(ye0Var.a);
                    String m439unboximpl = rawSkeletonId2 != null ? rawSkeletonId2.m439unboximpl() : null;
                    if (m439unboximpl == null) {
                        m439unboximpl = RawSkeletonId.m432constructorimpl(ye0Var.a);
                    }
                    RawSkeletonId m431boximpl = RawSkeletonId.m431boximpl(m439unboximpl);
                    ConcurrentHashMap concurrentHashMap = this.f;
                    Object obj2 = concurrentHashMap.get(m431boximpl);
                    if (obj2 != null) {
                        return obj2;
                    }
                    skeletonStorageImpl$getSkeleton$1.L$0 = concurrentHashMap;
                    skeletonStorageImpl$getSkeleton$1.L$1 = m431boximpl;
                    skeletonStorageImpl$getSkeleton$1.label = 1;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new SkeletonStorageImpl$loadSkeleton$2(this, m439unboximpl, null), skeletonStorageImpl$getSkeleton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rawSkeletonId = m431boximpl;
                    concurrentMap = concurrentHashMap;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rawSkeletonId = (RawSkeletonId) skeletonStorageImpl$getSkeleton$1.L$1;
                    concurrentMap = (ConcurrentMap) skeletonStorageImpl$getSkeleton$1.L$0;
                    b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                    return null;
                }
                Object putIfAbsent = concurrentMap.putIfAbsent(rawSkeletonId, rr51Var);
                return putIfAbsent == null ? rr51Var : putIfAbsent;
            }
        }
        skeletonStorageImpl$getSkeleton$1 = new SkeletonStorageImpl$getSkeleton$1(this, continuationImpl);
        Object obj3 = skeletonStorageImpl$getSkeleton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonStorageImpl$getSkeleton$1.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj3;
        if (rr51Var != null) {
        }
    }

    public final Object h(Continuation continuation) {
        return l(this, "Can't get skeletons meta", null, new SkeletonStorageImpl$getSkeletonsMeta$2(this, null), (ContinuationImpl) continuation, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ContinuationImpl continuationImpl) {
        SkeletonStorageImpl$isSkeletonInLocalStorage$1 skeletonStorageImpl$isSkeletonInLocalStorage$1;
        int i;
        if (continuationImpl instanceof SkeletonStorageImpl$isSkeletonInLocalStorage$1) {
            skeletonStorageImpl$isSkeletonInLocalStorage$1 = (SkeletonStorageImpl$isSkeletonInLocalStorage$1) continuationImpl;
            int i2 = skeletonStorageImpl$isSkeletonInLocalStorage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonStorageImpl$isSkeletonInLocalStorage$1.label = i2 - Integer.MIN_VALUE;
                SkeletonStorageImpl$isSkeletonInLocalStorage$1 skeletonStorageImpl$isSkeletonInLocalStorage$12 = skeletonStorageImpl$isSkeletonInLocalStorage$1;
                Object obj = skeletonStorageImpl$isSkeletonInLocalStorage$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonStorageImpl$isSkeletonInLocalStorage$12.label;
                if (i != 0) {
                    b.b(obj);
                    RawSkeletonId m431boximpl = RawSkeletonId.m431boximpl(str);
                    SkeletonStorageImpl$isSkeletonInLocalStorage$2 skeletonStorageImpl$isSkeletonInLocalStorage$2 = new SkeletonStorageImpl$isSkeletonInLocalStorage$2(this, str, null);
                    skeletonStorageImpl$isSkeletonInLocalStorage$12.label = 1;
                    obj = l(this, "Can't find skeleton with id in local storage", m431boximpl, skeletonStorageImpl$isSkeletonInLocalStorage$2, skeletonStorageImpl$isSkeletonInLocalStorage$12, 4);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        skeletonStorageImpl$isSkeletonInLocalStorage$1 = new SkeletonStorageImpl$isSkeletonInLocalStorage$1(this, continuationImpl);
        SkeletonStorageImpl$isSkeletonInLocalStorage$1 skeletonStorageImpl$isSkeletonInLocalStorage$122 = skeletonStorageImpl$isSkeletonInLocalStorage$1;
        Object obj2 = skeletonStorageImpl$isSkeletonInLocalStorage$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonStorageImpl$isSkeletonInLocalStorage$122.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(2:11|12)(2:14|15))(3:16|17|18))(3:19|20|(1:23)(1:22))))|29|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        j(r6, r7, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r8 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r8.invoke(r0) == r10) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, Object obj, tls tlsVar, tls tlsVar2, ContinuationImpl continuationImpl) {
        SkeletonStorageImpl$safeCallOrReport$1 skeletonStorageImpl$safeCallOrReport$1;
        int i;
        if (continuationImpl instanceof SkeletonStorageImpl$safeCallOrReport$1) {
            skeletonStorageImpl$safeCallOrReport$1 = (SkeletonStorageImpl$safeCallOrReport$1) continuationImpl;
            int i2 = skeletonStorageImpl$safeCallOrReport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skeletonStorageImpl$safeCallOrReport$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = skeletonStorageImpl$safeCallOrReport$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = skeletonStorageImpl$safeCallOrReport$1.label;
                if (i != 0) {
                    b.b(obj2);
                    skeletonStorageImpl$safeCallOrReport$1.L$0 = str;
                    skeletonStorageImpl$safeCallOrReport$1.L$1 = obj;
                    skeletonStorageImpl$safeCallOrReport$1.L$2 = tlsVar;
                    skeletonStorageImpl$safeCallOrReport$1.label = 1;
                    Object invoke = tlsVar2.invoke(skeletonStorageImpl$safeCallOrReport$1);
                    return invoke == obj3 ? obj3 : invoke;
                }
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj2);
                        return null;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj4 = skeletonStorageImpl$safeCallOrReport$1.L$1;
                b.b(obj2);
                return obj2;
            }
        }
        skeletonStorageImpl$safeCallOrReport$1 = new SkeletonStorageImpl$safeCallOrReport$1(this, continuationImpl);
        Object obj22 = skeletonStorageImpl$safeCallOrReport$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = skeletonStorageImpl$safeCallOrReport$1.label;
        if (i != 0) {
        }
    }

    public final void m(Long l) {
        this.h.c(l);
    }

    public final Object n(String str, DivDataDto divDataDto, Continuation continuation) {
        return k("Can't update skeleton with id", RawSkeletonId.m431boximpl(str), new SkeletonStorageImpl$updateSkeleton$2(this, str, null), new SkeletonStorageImpl$updateSkeleton$3(this, str, divDataDto, null), (ContinuationImpl) continuation);
    }
}
