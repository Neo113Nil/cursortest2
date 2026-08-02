package com.yandex.mob.domain;

import defpackage.csz;
import defpackage.dp20;
import defpackage.go20;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pm20;
import defpackage.qm20;
import defpackage.unr0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes8.dex */
public final class m {
    public final qm20 a;
    public final n b;
    public final com.yandex.go.proxyprovision.mob.a c;
    public final com.yandex.mob.datastore.d d;
    public final i3y e = kotlin.a.a(new csz(5, this));

    public m(qm20 qm20Var, n nVar, com.yandex.go.proxyprovision.mob.a aVar, com.yandex.mob.datastore.d dVar) {
        this.a = qm20Var;
        this.b = nVar;
        this.c = aVar;
        this.d = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(go20 go20Var, Map map, ContinuationImpl continuationImpl) {
        MobHeadersComposer$composeHeaders$1 mobHeadersComposer$composeHeaders$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        dp20 dp20Var;
        String str;
        String str2;
        Map map2;
        String str3;
        String str4;
        Object a;
        go20 go20Var2;
        String str5;
        String str6;
        Map map3;
        Map map4;
        String str7;
        String str8;
        Map map5;
        if (continuationImpl instanceof MobHeadersComposer$composeHeaders$1) {
            mobHeadersComposer$composeHeaders$1 = (MobHeadersComposer$composeHeaders$1) continuationImpl;
            int i2 = mobHeadersComposer$composeHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobHeadersComposer$composeHeaders$1.label = i2 - Integer.MIN_VALUE;
                obj = mobHeadersComposer$composeHeaders$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobHeadersComposer$composeHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobHeadersComposer$composeHeaders$1.L$0 = go20Var;
                    mobHeadersComposer$composeHeaders$1.L$1 = map;
                    mobHeadersComposer$composeHeaders$1.label = 1;
                    obj = this.d.k(mobHeadersComposer$composeHeaders$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            map5 = (Map) mobHeadersComposer$composeHeaders$1.L$9;
                            str6 = (String) mobHeadersComposer$composeHeaders$1.L$8;
                            map3 = (Map) mobHeadersComposer$composeHeaders$1.L$7;
                            map4 = (Map) mobHeadersComposer$composeHeaders$1.L$6;
                            str8 = (String) mobHeadersComposer$composeHeaders$1.L$5;
                            str7 = (String) mobHeadersComposer$composeHeaders$1.L$4;
                            str5 = (String) mobHeadersComposer$composeHeaders$1.L$3;
                            map2 = (Map) mobHeadersComposer$composeHeaders$1.L$1;
                            go20Var2 = (go20) mobHeadersComposer$composeHeaders$1.L$0;
                            kotlin.b.b(obj);
                            map5.put(str6, obj);
                            map3.put("X-AppMetrica-DeviceId", str5);
                            map3.put("X-AppMetrica-UUID", str7);
                            if (str8 != null) {
                            }
                            map3.putAll(map2);
                            map3.putAll(go20Var2.a);
                            return new go20(((MapBuilder) map4).j());
                        }
                        String str9 = (String) mobHeadersComposer$composeHeaders$1.L$4;
                        str3 = (String) mobHeadersComposer$composeHeaders$1.L$3;
                        Map map6 = (Map) mobHeadersComposer$composeHeaders$1.L$1;
                        go20 go20Var3 = (go20) mobHeadersComposer$composeHeaders$1.L$0;
                        kotlin.b.b(obj);
                        str = str9;
                        go20Var = go20Var3;
                        map2 = map6;
                        String str10 = (String) obj;
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.put(ExtFunctionsKt.HEADER_USER_AGENT, c());
                        mobHeadersComposer$composeHeaders$1.L$0 = go20Var;
                        mobHeadersComposer$composeHeaders$1.L$1 = map2;
                        mobHeadersComposer$composeHeaders$1.L$2 = null;
                        mobHeadersComposer$composeHeaders$1.L$3 = str3;
                        mobHeadersComposer$composeHeaders$1.L$4 = str;
                        mobHeadersComposer$composeHeaders$1.L$5 = str10;
                        mobHeadersComposer$composeHeaders$1.L$6 = mapBuilder;
                        mobHeadersComposer$composeHeaders$1.L$7 = mapBuilder;
                        mobHeadersComposer$composeHeaders$1.L$8 = "X-Mob-Id";
                        mobHeadersComposer$composeHeaders$1.L$9 = mapBuilder;
                        mobHeadersComposer$composeHeaders$1.I$0 = 0;
                        mobHeadersComposer$composeHeaders$1.label = 3;
                        a = this.b.a(mobHeadersComposer$composeHeaders$1);
                        if (a != coroutineSingletons) {
                            go20Var2 = go20Var;
                            str5 = str3;
                            str6 = "X-Mob-Id";
                            map3 = mapBuilder;
                            map4 = map3;
                            str7 = str;
                            str8 = str10;
                            obj = a;
                            map5 = map4;
                            map5.put(str6, obj);
                            map3.put("X-AppMetrica-DeviceId", str5);
                            map3.put("X-AppMetrica-UUID", str7);
                            if (str8 != null) {
                            }
                            map3.putAll(map2);
                            map3.putAll(go20Var2.a);
                            return new go20(((MapBuilder) map4).j());
                        }
                        return coroutineSingletons;
                    }
                    map = (Map) mobHeadersComposer$composeHeaders$1.L$1;
                    go20Var = (go20) mobHeadersComposer$composeHeaders$1.L$0;
                    kotlin.b.b(obj);
                }
                dp20Var = (dp20) obj;
                str = StringUtils.UNDEFINED;
                if (dp20Var != null || (str2 = dp20Var.a) == null) {
                    str2 = StringUtils.UNDEFINED;
                }
                if (dp20Var != null && (str4 = dp20Var.b) != null) {
                    str = str4;
                }
                mobHeadersComposer$composeHeaders$1.L$0 = go20Var;
                mobHeadersComposer$composeHeaders$1.L$1 = map;
                mobHeadersComposer$composeHeaders$1.L$2 = null;
                mobHeadersComposer$composeHeaders$1.L$3 = str2;
                mobHeadersComposer$composeHeaders$1.L$4 = str;
                mobHeadersComposer$composeHeaders$1.label = 2;
                obj = this.c.a(mobHeadersComposer$composeHeaders$1);
                if (obj != coroutineSingletons) {
                    map2 = map;
                    str3 = str2;
                    String str102 = (String) obj;
                    MapBuilder mapBuilder2 = new MapBuilder();
                    mapBuilder2.put(ExtFunctionsKt.HEADER_USER_AGENT, c());
                    mobHeadersComposer$composeHeaders$1.L$0 = go20Var;
                    mobHeadersComposer$composeHeaders$1.L$1 = map2;
                    mobHeadersComposer$composeHeaders$1.L$2 = null;
                    mobHeadersComposer$composeHeaders$1.L$3 = str3;
                    mobHeadersComposer$composeHeaders$1.L$4 = str;
                    mobHeadersComposer$composeHeaders$1.L$5 = str102;
                    mobHeadersComposer$composeHeaders$1.L$6 = mapBuilder2;
                    mobHeadersComposer$composeHeaders$1.L$7 = mapBuilder2;
                    mobHeadersComposer$composeHeaders$1.L$8 = "X-Mob-Id";
                    mobHeadersComposer$composeHeaders$1.L$9 = mapBuilder2;
                    mobHeadersComposer$composeHeaders$1.I$0 = 0;
                    mobHeadersComposer$composeHeaders$1.label = 3;
                    a = this.b.a(mobHeadersComposer$composeHeaders$1);
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mobHeadersComposer$composeHeaders$1 = new MobHeadersComposer$composeHeaders$1(this, continuationImpl);
        obj = mobHeadersComposer$composeHeaders$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobHeadersComposer$composeHeaders$1.label;
        if (i != 0) {
        }
        dp20Var = (dp20) obj;
        str = StringUtils.UNDEFINED;
        if (dp20Var != null) {
        }
        str2 = StringUtils.UNDEFINED;
        if (dp20Var != null) {
            str = str4;
        }
        mobHeadersComposer$composeHeaders$1.L$0 = go20Var;
        mobHeadersComposer$composeHeaders$1.L$1 = map;
        mobHeadersComposer$composeHeaders$1.L$2 = null;
        mobHeadersComposer$composeHeaders$1.L$3 = str2;
        mobHeadersComposer$composeHeaders$1.L$4 = str;
        mobHeadersComposer$composeHeaders$1.label = 2;
        obj = this.c.a(mobHeadersComposer$composeHeaders$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MobHeadersComposer$pingHeaders$1 mobHeadersComposer$pingHeaders$1;
        int i;
        String str;
        if (continuationImpl instanceof MobHeadersComposer$pingHeaders$1) {
            mobHeadersComposer$pingHeaders$1 = (MobHeadersComposer$pingHeaders$1) continuationImpl;
            int i2 = mobHeadersComposer$pingHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobHeadersComposer$pingHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobHeadersComposer$pingHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobHeadersComposer$pingHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobHeadersComposer$pingHeaders$1.label = 1;
                    obj = this.c.a(mobHeadersComposer$pingHeaders$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                str = (String) obj;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put(ExtFunctionsKt.HEADER_USER_AGENT, c());
                if (str != null) {
                    mapBuilder.put("X-Yandex-Jws", str);
                }
                return new go20(mapBuilder.j());
            }
        }
        mobHeadersComposer$pingHeaders$1 = new MobHeadersComposer$pingHeaders$1(this, continuationImpl);
        Object obj2 = mobHeadersComposer$pingHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobHeadersComposer$pingHeaders$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put(ExtFunctionsKt.HEADER_USER_AGENT, c());
        if (str != null) {
        }
        return new go20(mapBuilder2.j());
    }

    public final String c() {
        pm20 pm20Var = (pm20) this.e.getValue();
        String str = pm20Var.a;
        String str2 = pm20Var.b;
        String str3 = pm20Var.c;
        return unr0.r(oyr.w(str, "/", str2, Extension.DOT_CHAR, str3), Extension.O_BRAKE_SPACE, pm20Var.d, ") mob/0.32.0");
    }
}
