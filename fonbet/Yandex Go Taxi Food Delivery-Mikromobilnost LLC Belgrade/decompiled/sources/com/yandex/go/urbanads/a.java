package com.yandex.go.urbanads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.bpt;
import defpackage.evu0;
import defpackage.fn21;
import defpackage.jf21;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.w9w0;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class a implements jf21 {
    public final Context a;
    public final ru.yandex.taxi.am.token.a b;
    public final fn21 c;
    public final bpt d;
    public final w9w0 e;
    public final po21 f;
    public final com.yandex.go.route.interactor.b g;

    public a(Context context, ru.yandex.taxi.am.token.a aVar, fn21 fn21Var, bpt bptVar, w9w0 w9w0Var, po21 po21Var, com.yandex.go.route.interactor.b bVar) {
        this.a = context;
        this.b = aVar;
        this.c = fn21Var;
        this.d = bptVar;
        this.e = w9w0Var;
        this.f = po21Var;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, ContinuationImpl continuationImpl) {
        UrbanAdsExtraHeadersProviderImpl$applyAuthorization$1 urbanAdsExtraHeadersProviderImpl$applyAuthorization$1;
        int i;
        Object d;
        String str;
        if (continuationImpl instanceof UrbanAdsExtraHeadersProviderImpl$applyAuthorization$1) {
            urbanAdsExtraHeadersProviderImpl$applyAuthorization$1 = (UrbanAdsExtraHeadersProviderImpl$applyAuthorization$1) continuationImpl;
            int i2 = urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.L$0 = map;
                    urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.label = 1;
                    d = this.b.d(false, urbanAdsExtraHeadersProviderImpl$applyAuthorization$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                str = (String) (d instanceof Result.Failure ? null : d);
                if (str != null && !evu0.J(str)) {
                    map.put("Authorization", "Bearer ".concat(str));
                }
                return zy11.a;
            }
        }
        urbanAdsExtraHeadersProviderImpl$applyAuthorization$1 = new UrbanAdsExtraHeadersProviderImpl$applyAuthorization$1(this, continuationImpl);
        Object obj2 = urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = urbanAdsExtraHeadersProviderImpl$applyAuthorization$1.label;
        if (i != 0) {
        }
        str = (String) (d instanceof Result.Failure ? null : d);
        if (str != null) {
            map.put("Authorization", "Bearer ".concat(str));
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MapBuilder mapBuilder, ContinuationImpl continuationImpl) {
        UrbanAdsExtraHeadersProviderImpl$applyLocation$1 urbanAdsExtraHeadersProviderImpl$applyLocation$1;
        int i;
        MapBuilder mapBuilder2;
        zzs d;
        if (continuationImpl instanceof UrbanAdsExtraHeadersProviderImpl$applyLocation$1) {
            urbanAdsExtraHeadersProviderImpl$applyLocation$1 = (UrbanAdsExtraHeadersProviderImpl$applyLocation$1) continuationImpl;
            int i2 = urbanAdsExtraHeadersProviderImpl$applyLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urbanAdsExtraHeadersProviderImpl$applyLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = urbanAdsExtraHeadersProviderImpl$applyLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = urbanAdsExtraHeadersProviderImpl$applyLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    urbanAdsExtraHeadersProviderImpl$applyLocation$1.L$0 = mapBuilder;
                    urbanAdsExtraHeadersProviderImpl$applyLocation$1.label = 1;
                    obj = ((e) this.f).g(urbanAdsExtraHeadersProviderImpl$applyLocation$1);
                    mapBuilder2 = mapBuilder;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r6 = (Map) urbanAdsExtraHeadersProviderImpl$applyLocation$1.L$0;
                    kotlin.b.b(obj);
                    mapBuilder2 = r6;
                }
                mo21 mo21Var = (mo21) obj;
                d = this.g.d();
                if (d != null) {
                }
                return zy11.a;
            }
        }
        urbanAdsExtraHeadersProviderImpl$applyLocation$1 = new UrbanAdsExtraHeadersProviderImpl$applyLocation$1(this, continuationImpl);
        Object obj2 = urbanAdsExtraHeadersProviderImpl$applyLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = urbanAdsExtraHeadersProviderImpl$applyLocation$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        d = this.g.d();
        if (d != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.urbanads.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        UrbanAdsExtraHeadersProviderImpl$getHeaders$1 urbanAdsExtraHeadersProviderImpl$getHeaders$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Map map;
        MapBuilder mapBuilder;
        String str2;
        Map map2;
        Map map3;
        String Hg;
        String str3;
        String str4;
        if (continuationImpl instanceof UrbanAdsExtraHeadersProviderImpl$getHeaders$1) {
            urbanAdsExtraHeadersProviderImpl$getHeaders$1 = (UrbanAdsExtraHeadersProviderImpl$getHeaders$1) continuationImpl;
            int i2 = urbanAdsExtraHeadersProviderImpl$getHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urbanAdsExtraHeadersProviderImpl$getHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = urbanAdsExtraHeadersProviderImpl$getHeaders$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = urbanAdsExtraHeadersProviderImpl$getHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        str = AdvertisingIdClient.getAdvertisingIdInfo(this.a.getApplicationContext()).getId();
                    } catch (Exception e) {
                        jst.e.k(e, "Error while fetching Advertising ID");
                        str = null;
                    }
                    MapBuilder mapBuilder2 = new MapBuilder();
                    urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$0 = str;
                    urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$1 = mapBuilder2;
                    urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$2 = mapBuilder2;
                    urbanAdsExtraHeadersProviderImpl$getHeaders$1.label = 1;
                    if (b(mapBuilder2, urbanAdsExtraHeadersProviderImpl$getHeaders$1) != coroutineSingletons) {
                        map = mapBuilder2;
                        mapBuilder = mapBuilder2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$2;
                    map3 = (Map) urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$1;
                    str2 = (String) urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$0;
                    kotlin.b.b(obj);
                    Hg = ((h) this.c).Hg();
                    if (Hg != null && !evu0.J(Hg)) {
                        map2.put("X-YaTaxi-UserId", Hg);
                    }
                    str3 = this.d.a().c;
                    if (!evu0.J(str3)) {
                        map2.put("X-Mob-ID", str3);
                    }
                    String a = this.e.a();
                    str4 = a != null ? a : null;
                    if (str4 != null && !evu0.J(str4)) {
                        map2.put("X-Ya-Go-Superapp-Session", str4);
                    }
                    if (str2 != null && !evu0.J(str2)) {
                        map2.put("x-adv-gaid", str2);
                    }
                    return ((MapBuilder) map3).j();
                }
                ?? r2 = (Map) urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$2;
                map = (Map) urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$1;
                String str5 = (String) urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$0;
                kotlin.b.b(obj);
                str = str5;
                mapBuilder = r2;
                urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$0 = str;
                urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$1 = map;
                urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$2 = mapBuilder;
                urbanAdsExtraHeadersProviderImpl$getHeaders$1.label = 2;
                if (a(mapBuilder, urbanAdsExtraHeadersProviderImpl$getHeaders$1) != coroutineSingletons) {
                    str2 = str;
                    map2 = mapBuilder;
                    map3 = map;
                    Hg = ((h) this.c).Hg();
                    if (Hg != null) {
                        map2.put("X-YaTaxi-UserId", Hg);
                    }
                    str3 = this.d.a().c;
                    if (!evu0.J(str3)) {
                    }
                    String a2 = this.e.a();
                    if (a2 != null) {
                    }
                    if (str4 != null) {
                        map2.put("X-Ya-Go-Superapp-Session", str4);
                    }
                    if (str2 != null) {
                        map2.put("x-adv-gaid", str2);
                    }
                    return ((MapBuilder) map3).j();
                }
                return coroutineSingletons;
            }
        }
        urbanAdsExtraHeadersProviderImpl$getHeaders$1 = new UrbanAdsExtraHeadersProviderImpl$getHeaders$1(this, continuationImpl);
        Object obj2 = urbanAdsExtraHeadersProviderImpl$getHeaders$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = urbanAdsExtraHeadersProviderImpl$getHeaders$1.label;
        if (i != 0) {
        }
        urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$0 = str;
        urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$1 = map;
        urbanAdsExtraHeadersProviderImpl$getHeaders$1.L$2 = mapBuilder;
        urbanAdsExtraHeadersProviderImpl$getHeaders$1.label = 2;
        if (a(mapBuilder, urbanAdsExtraHeadersProviderImpl$getHeaders$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
