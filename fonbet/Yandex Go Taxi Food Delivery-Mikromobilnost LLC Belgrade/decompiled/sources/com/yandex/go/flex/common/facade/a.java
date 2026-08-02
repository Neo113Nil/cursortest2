package com.yandex.go.flex.common.facade;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.bx00;
import defpackage.cne0;
import defpackage.e2t;
import defpackage.evu0;
import defpackage.ezj;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.j5z;
import defpackage.jst;
import defpackage.kb20;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.rs2;
import defpackage.ru00;
import defpackage.sxq0;
import defpackage.u6r;
import defpackage.v6r;
import defpackage.vaj;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class a implements ru00 {
    public final Context a;
    public final rs2 b;
    public final vaj c;
    public final e2t d;
    public final po21 e;
    public final kb20 f;
    public final j5z g;
    public final ru.yandex.taxi.am.token.a h;
    public final List i;

    public a(Context context, rs2 rs2Var, vaj vajVar, e2t e2tVar, po21 po21Var, kb20 kb20Var, j5z j5zVar, ru.yandex.taxi.am.token.a aVar) {
        this.a = context;
        this.b = rs2Var;
        this.c = vajVar;
        this.d = e2tVar;
        this.e = po21Var;
        this.f = kb20Var;
        this.g = j5zVar;
        this.h = aVar;
        this.i = Collections.singletonList(new ezj(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Map map, ContinuationImpl continuationImpl) {
        DefaultBDUIHeadersProvider$applyAuthorization$1 defaultBDUIHeadersProvider$applyAuthorization$1;
        int i;
        Object d;
        String str;
        if (continuationImpl instanceof DefaultBDUIHeadersProvider$applyAuthorization$1) {
            defaultBDUIHeadersProvider$applyAuthorization$1 = (DefaultBDUIHeadersProvider$applyAuthorization$1) continuationImpl;
            int i2 = defaultBDUIHeadersProvider$applyAuthorization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultBDUIHeadersProvider$applyAuthorization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultBDUIHeadersProvider$applyAuthorization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultBDUIHeadersProvider$applyAuthorization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    defaultBDUIHeadersProvider$applyAuthorization$1.L$0 = map;
                    defaultBDUIHeadersProvider$applyAuthorization$1.label = 1;
                    d = this.h.d(false, defaultBDUIHeadersProvider$applyAuthorization$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) defaultBDUIHeadersProvider$applyAuthorization$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                str = (String) (d instanceof Result.Failure ? null : d);
                if (str != null && !evu0.J(str)) {
                    map.put("Authorization", "Bearer ".concat(str));
                    map.put("X-Oauth-Token", str);
                }
                return map;
            }
        }
        defaultBDUIHeadersProvider$applyAuthorization$1 = new DefaultBDUIHeadersProvider$applyAuthorization$1(this, continuationImpl);
        Object obj2 = defaultBDUIHeadersProvider$applyAuthorization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultBDUIHeadersProvider$applyAuthorization$1.label;
        if (i != 0) {
        }
        str = (String) (d instanceof Result.Failure ? null : d);
        if (str != null) {
            map.put("Authorization", "Bearer ".concat(str));
            map.put("X-Oauth-Token", str);
        }
        return map;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|(1:14)|(1:16)|17))|28|6|7|(0)(0)|12|(0)|(0)|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        defpackage.jst.e.k(r5, "Error while fetching location");
        r7 = null;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MapBuilder mapBuilder, ContinuationImpl continuationImpl) {
        DefaultBDUIHeadersProvider$applyLocation$1 defaultBDUIHeadersProvider$applyLocation$1;
        int i;
        String str;
        mo21 mo21Var;
        if (continuationImpl instanceof DefaultBDUIHeadersProvider$applyLocation$1) {
            defaultBDUIHeadersProvider$applyLocation$1 = (DefaultBDUIHeadersProvider$applyLocation$1) continuationImpl;
            int i2 = defaultBDUIHeadersProvider$applyLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultBDUIHeadersProvider$applyLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultBDUIHeadersProvider$applyLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultBDUIHeadersProvider$applyLocation$1.label;
                str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = this.e;
                    defaultBDUIHeadersProvider$applyLocation$1.L$0 = mapBuilder;
                    defaultBDUIHeadersProvider$applyLocation$1.label = 1;
                    obj = ((e) po21Var).f(defaultBDUIHeadersProvider$applyLocation$1);
                    mapBuilder = mapBuilder;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r6 = (Map) defaultBDUIHeadersProvider$applyLocation$1.L$0;
                    kotlin.b.b(obj);
                    mapBuilder = r6;
                }
                mo21Var = (mo21) obj;
                MapBuilder mapBuilder2 = mapBuilder;
                if (mo21Var != null) {
                    str = mo21Var.a + ";" + mo21Var.b;
                }
                if (str != null) {
                    mapBuilder2.put("x-location", str);
                }
                return mapBuilder2;
            }
        }
        defaultBDUIHeadersProvider$applyLocation$1 = new DefaultBDUIHeadersProvider$applyLocation$1(this, continuationImpl);
        Object obj2 = defaultBDUIHeadersProvider$applyLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultBDUIHeadersProvider$applyLocation$1.label;
        str = null;
        if (i != 0) {
        }
        mo21Var = (mo21) obj2;
        MapBuilder mapBuilder22 = mapBuilder;
        if (mo21Var != null) {
        }
        if (str != null) {
        }
        return mapBuilder22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
    
        if (a(r0, r1) != r2) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x017a -> B:12:0x017b). Please report as a decompilation issue!!! */
    @Override // defpackage.ru00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getHeaders(Continuation continuation) {
        DefaultBDUIHeadersProvider$getHeaders$1 defaultBDUIHeadersProvider$getHeaders$1;
        int i;
        Object obj;
        Map map;
        Map map2;
        String str;
        String l;
        String valueOf;
        v6r v6rVar;
        u6r u6rVar;
        sxq0 sxq0Var;
        bx00 bx00Var;
        Iterator it;
        Map map3;
        Map map4;
        Context context = this.a;
        if (continuation instanceof DefaultBDUIHeadersProvider$getHeaders$1) {
            defaultBDUIHeadersProvider$getHeaders$1 = (DefaultBDUIHeadersProvider$getHeaders$1) continuation;
            int i2 = defaultBDUIHeadersProvider$getHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultBDUIHeadersProvider$getHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = defaultBDUIHeadersProvider$getHeaders$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultBDUIHeadersProvider$getHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    MapBuilder mapBuilder = new MapBuilder();
                    try {
                        obj = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext()).getId();
                    } catch (Exception e) {
                        jst.e.k(e, "Error while fetching gaid");
                        obj = null;
                    }
                    if (obj != null) {
                        mapBuilder.put("x-adv-gaid", obj);
                    }
                    Object displayName = TimeZone.getDefault().getDisplayName(false, 0);
                    if (displayName != null) {
                        mapBuilder.put("x-tz", displayName);
                    }
                    Object valueOf2 = String.valueOf(DateFormat.is24HourFormat(context));
                    if (valueOf2 != null) {
                        mapBuilder.put("x-date-format-is-24-hour-format", valueOf2);
                    }
                    defaultBDUIHeadersProvider$getHeaders$1.L$0 = mapBuilder;
                    defaultBDUIHeadersProvider$getHeaders$1.L$1 = mapBuilder;
                    defaultBDUIHeadersProvider$getHeaders$1.label = 1;
                    if (b(mapBuilder, defaultBDUIHeadersProvider$getHeaders$1) != obj3) {
                        map = mapBuilder;
                        map2 = map;
                    }
                    return obj3;
                }
                if (i == 1) {
                    map = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$1;
                    map2 = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$0;
                    kotlin.b.b(obj2);
                } else if (i == 2) {
                    map = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$1;
                    map2 = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$0;
                    kotlin.b.b(obj2);
                    map.put("themeable", "2");
                    String b = this.g.b();
                    if (b != null) {
                        map.put("Localization", b);
                    }
                    Map map5 = map;
                    it = this.i.iterator();
                    map3 = map5;
                    map4 = map2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map3 = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$6;
                    it = (Iterator) defaultBDUIHeadersProvider$getHeaders$1.L$3;
                    Map map6 = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$1;
                    map4 = (Map) defaultBDUIHeadersProvider$getHeaders$1.L$0;
                    kotlin.b.b(obj2);
                    map3.putAll((Map) obj2);
                    map3 = map6;
                    if (it.hasNext()) {
                        ezj ezjVar = (ezj) it.next();
                        defaultBDUIHeadersProvider$getHeaders$1.L$0 = map4;
                        defaultBDUIHeadersProvider$getHeaders$1.L$1 = map3;
                        defaultBDUIHeadersProvider$getHeaders$1.L$2 = null;
                        defaultBDUIHeadersProvider$getHeaders$1.L$3 = it;
                        defaultBDUIHeadersProvider$getHeaders$1.L$4 = null;
                        defaultBDUIHeadersProvider$getHeaders$1.L$5 = null;
                        defaultBDUIHeadersProvider$getHeaders$1.L$6 = map3;
                        defaultBDUIHeadersProvider$getHeaders$1.label = 3;
                        obj2 = ezjVar.getHeaders(defaultBDUIHeadersProvider$getHeaders$1);
                        if (obj2 != obj3) {
                            map6 = map3;
                            map3.putAll((Map) obj2);
                            map3 = map6;
                            if (it.hasNext()) {
                                return ((MapBuilder) map4).j();
                            }
                        }
                        return obj3;
                    }
                }
                g2t a = ((f2t) this.d).a();
                str = (a != null || (v6rVar = a.a) == null || (u6rVar = v6rVar.a) == null || (sxq0Var = u6rVar.d) == null || (bx00Var = sxq0Var.c) == null) ? null : bx00Var.a;
                if (str != null) {
                    map.put("x-region-id", str);
                }
                map.put("x-platform", "ANDROID");
                l = ((cne0) ((h) this.c).b).l(MetaDataField.DEVICE_ID_FIELD, null);
                if (l == null) {
                    l = "";
                }
                map.put("x-device-id", l);
                valueOf = String.valueOf(Build.VERSION.SDK_INT);
                if (valueOf != null) {
                    map.put("x-os-version", valueOf);
                }
                String a2 = this.f.a();
                map.put("x-device-uuid", a2 != null ? a2 : "");
                this.b.getClass();
                map.put("x-app-version", "5.89.0");
                defaultBDUIHeadersProvider$getHeaders$1.L$0 = map2;
                defaultBDUIHeadersProvider$getHeaders$1.L$1 = map;
                defaultBDUIHeadersProvider$getHeaders$1.label = 2;
            }
        }
        defaultBDUIHeadersProvider$getHeaders$1 = new DefaultBDUIHeadersProvider$getHeaders$1(this, (ContinuationImpl) continuation);
        Object obj22 = defaultBDUIHeadersProvider$getHeaders$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultBDUIHeadersProvider$getHeaders$1.label;
        if (i != 0) {
        }
        g2t a3 = ((f2t) this.d).a();
        if (a3 != null) {
        }
        if (str != null) {
        }
        map.put("x-platform", "ANDROID");
        l = ((cne0) ((h) this.c).b).l(MetaDataField.DEVICE_ID_FIELD, null);
        if (l == null) {
        }
        map.put("x-device-id", l);
        valueOf = String.valueOf(Build.VERSION.SDK_INT);
        if (valueOf != null) {
        }
        String a22 = this.f.a();
        map.put("x-device-uuid", a22 != null ? a22 : "");
        this.b.getClass();
        map.put("x-app-version", "5.89.0");
        defaultBDUIHeadersProvider$getHeaders$1.L$0 = map2;
        defaultBDUIHeadersProvider$getHeaders$1.L$1 = map;
        defaultBDUIHeadersProvider$getHeaders$1.label = 2;
    }
}
