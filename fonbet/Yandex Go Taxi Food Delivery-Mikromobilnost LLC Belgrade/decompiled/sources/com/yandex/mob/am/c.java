package com.yandex.mob.am;

import com.yandex.mob.d;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportLocation;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.v1;
import com.yandex.passport.internal.network.UrlOverride;
import com.yandex.passport.internal.network.p;
import com.yandex.passport.internal.properties.n;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.iq20;
import defpackage.lq20;
import defpackage.mdh;
import defpackage.nn90;
import defpackage.ny61;
import defpackage.ol20;
import defpackage.on90;
import defpackage.pr20;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vn90;
import defpackage.w610;
import defpackage.wn90;
import defpackage.xn90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public abstract class c {
    public static final Regex a = new Regex(".*_\\d+$");

    public static final Map a(Map map, Map map2) {
        Regex regex;
        Long l;
        String str;
        PassportUrlType passportUrlType;
        Set entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = entrySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            regex = a;
            if (!hasNext) {
                break;
            }
            w610 b = regex.b((String) ((Map.Entry) it.next()).getKey());
            if (b != null) {
                String group = b.a.group();
                str = evu0.h0('_', group, group);
            } else {
                str = null;
            }
            Pair pair = new Pair(str, b != null ? b.a.group() : null);
            String str2 = (String) pair.getFirst();
            String str3 = (String) pair.getSecond();
            if (str3 != null && (passportUrlType = (PassportUrlType) map2.get(str2)) != null) {
                linkedHashMap.put(str3, passportUrlType);
            }
        }
        Set<Map.Entry> entrySet2 = linkedHashMap.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : entrySet2) {
            String str4 = (String) entry.getKey();
            PassportUrlType passportUrlType2 = (PassportUrlType) entry.getValue();
            w610 b2 = regex.b(str4);
            if (b2 != null) {
                String group2 = b2.a.group();
                l = bvu0.m(10, evu0.e0('_', group2, group2));
            } else {
                l = null;
            }
            if (l != null) {
                long longValue = l.longValue();
                Long valueOf = Long.valueOf(longValue);
                if (linkedHashMap2.get(valueOf) == null) {
                    linkedHashMap2.put(valueOf, new LinkedHashMap());
                }
                Map map3 = (Map) linkedHashMap2.get(Long.valueOf(longValue));
                if (map3 != null) {
                }
            }
        }
        return kotlin.collections.b.t(linkedHashMap2);
    }

    public static final Map b(nn90 nn90Var) {
        ol20 ol20Var = ((on90) nn90Var).b;
        Pair pair = new Pair(ol20Var != null ? ol20Var.a : null, PassportUrlType.WEBAM);
        ol20 ol20Var2 = ((on90) nn90Var).a;
        return kotlin.collections.b.i(pair, new Pair(ol20Var2 != null ? ol20Var2.a : null, PassportUrlType.BACKEND), new Pair(null, PassportUrlType.FRONTEND), new Pair(null, PassportUrlType.SOCIAL), new Pair(null, PassportUrlType.APP_LINK));
    }

    public static final void c(o2 o2Var, Map map, Map map2, KPassportEnvironment kPassportEnvironment, xn90 xn90Var) {
        pr20 pr20Var;
        lq20 lq20Var;
        for (Map.Entry entry : map.entrySet()) {
            PassportUrlType passportUrlType = (PassportUrlType) map2.get(entry.getKey());
            if (passportUrlType != null) {
                iq20 iq20Var = (iq20) entry.getValue();
                String str = null;
                String str2 = (iq20Var == null || (pr20Var = iq20Var.a) == null || (lq20Var = pr20Var.a) == null) ? null : lq20Var.c;
                if (str2 != null) {
                    ((vn90) xn90Var).getClass();
                    if (wn90.a[passportUrlType.ordinal()] == 1) {
                        str2 = str2.concat("/am");
                    }
                    if (kPassportEnvironment == null) {
                        UrlOverride.a aVar = (UrlOverride.a) o2Var;
                        aVar.getClass();
                        if (evu0.J(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            if (!evu0.y(str2, "://", false)) {
                                str2 = "https://".concat(str2);
                            }
                            com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str2);
                            if (!com.yandex.passport.common.url.b.m(str2)) {
                                bVar = null;
                            }
                            if (bVar != null) {
                                str = bVar.a;
                            }
                        }
                        if (str == null) {
                            Set keySet = aVar.a.keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : keySet) {
                                if (((Pair) obj).c() == passportUrlType) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                aVar.a.remove((Pair) it.next());
                            }
                        } else {
                            for (KPassportEnvironment kPassportEnvironment2 : KPassportEnvironment.values()) {
                                aVar.a.put(new Pair(passportUrlType, kPassportEnvironment2.getEnvironment()), str);
                            }
                        }
                    } else {
                        Pair pair = new Pair(passportUrlType, kPassportEnvironment);
                        UrlOverride.a aVar2 = (UrlOverride.a) o2Var;
                        aVar2.getClass();
                        if (evu0.J(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            if (!evu0.y(str2, "://", false)) {
                                str2 = "https://".concat(str2);
                            }
                            com.yandex.passport.common.url.b bVar2 = new com.yandex.passport.common.url.b(str2);
                            if (!com.yandex.passport.common.url.b.m(str2)) {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                str = bVar2.a;
                            }
                        }
                        if (str == null) {
                            PassportUrlType passportUrlType2 = (PassportUrlType) pair.c();
                            t0 t0Var = (t0) pair.f();
                            boolean z = t0Var instanceof KPassportEnvironment;
                            LinkedHashMap linkedHashMap = aVar2.a;
                            if (z) {
                            }
                        } else {
                            PassportUrlType passportUrlType3 = (PassportUrlType) pair.c();
                            t0 t0Var2 = (t0) pair.f();
                            boolean z2 = t0Var2 instanceof KPassportEnvironment;
                            LinkedHashMap linkedHashMap2 = aVar2.a;
                            if (z2) {
                                linkedHashMap2.put(new Pair(passportUrlType3, ((KPassportEnvironment) t0Var2).getEnvironment()), str);
                            } else {
                                linkedHashMap2.put(pair, str);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void d(com.yandex.mob.b bVar, on90 on90Var, xn90 xn90Var, v1 v1Var, String str) {
        Map b = b(on90Var);
        List M = kotlin.collections.a.M(b.keySet());
        ArrayList arrayList = new ArrayList(tcc.n(M, 10));
        Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(new ol20((String) it.next()));
        }
        ol20[] ol20VarArr = (ol20[]) arrayList.toArray(new ol20[0]);
        Map map = bVar.e(str, (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length)).b;
        if (!b.isEmpty()) {
            UrlOverride.a aVar = new UrlOverride.a();
            c(aVar, map, b, null, xn90Var);
            UrlOverride.Companion.getClass();
            ((n) v1Var).k = p.a(aVar);
        }
        Map a2 = a(map, b);
        if (a2.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(a2.size());
        for (Map.Entry entry : a2.entrySet()) {
            PassportLocation passportLocation = new PassportLocation(((Number) entry.getKey()).longValue());
            UrlOverride.a aVar2 = new UrlOverride.a();
            c(aVar2, map, (Map) entry.getValue(), null, xn90Var);
            UrlOverride.Companion.getClass();
            arrayList2.add(new Pair(passportLocation, p.a(aVar2)));
        }
        ((n) v1Var).l = kotlin.collections.b.s(arrayList2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(3:10|11|12)(2:14|15))(4:16|17|(1:19)|(1:21)(1:22))))|24|6|7|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(d dVar, on90 on90Var, com.yandex.passport.api.b bVar, xn90 xn90Var, String str, ContinuationImpl continuationImpl) {
        MobAmBindingKt$mobBindToPassportSafe$1 mobAmBindingKt$mobBindToPassportSafe$1;
        int i;
        if (continuationImpl instanceof MobAmBindingKt$mobBindToPassportSafe$1) {
            mobAmBindingKt$mobBindToPassportSafe$1 = (MobAmBindingKt$mobBindToPassportSafe$1) continuationImpl;
            int i2 = mobAmBindingKt$mobBindToPassportSafe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobAmBindingKt$mobBindToPassportSafe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobAmBindingKt$mobBindToPassportSafe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobAmBindingKt$mobBindToPassportSafe$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                mobAmBindingKt$mobBindToPassportSafe$1.L$0 = null;
                mobAmBindingKt$mobBindToPassportSafe$1.L$1 = null;
                mobAmBindingKt$mobBindToPassportSafe$1.L$2 = null;
                mobAmBindingKt$mobBindToPassportSafe$1.L$3 = null;
                mobAmBindingKt$mobBindToPassportSafe$1.L$4 = null;
                mobAmBindingKt$mobBindToPassportSafe$1.L$5 = null;
                mobAmBindingKt$mobBindToPassportSafe$1.label = 1;
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(mdh.b, new MobAmBindingKt$mobBindToPassport$2(on90Var, dVar, str, bVar, null, xn90Var, null), mobAmBindingKt$mobBindToPassportSafe$1);
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
                return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        mobAmBindingKt$mobBindToPassportSafe$1 = new MobAmBindingKt$mobBindToPassportSafe$1(continuationImpl);
        Object obj2 = mobAmBindingKt$mobBindToPassportSafe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobAmBindingKt$mobBindToPassportSafe$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
