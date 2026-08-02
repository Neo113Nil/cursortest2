package com.yandex.passport.internal.autologin;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.core.accounts.t;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.report.reporters.AutoLoginReporter$Companion$AutoLoginPriorityType;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes8.dex */
public final class k extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.badges.c c;
    public final com.yandex.passport.internal.badges.f d;
    public final com.yandex.passport.internal.config.b e;
    public final com.yandex.passport.common.common.a f;
    public final com.yandex.passport.internal.flags.j g;
    public final t h;
    public final com.yandex.passport.internal.report.reporters.j i;

    public k(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.badges.c cVar, com.yandex.passport.internal.badges.f fVar, com.yandex.passport.internal.config.b bVar, com.yandex.passport.common.common.a aVar2, com.yandex.passport.internal.flags.j jVar, t tVar, com.yandex.passport.internal.report.reporters.j jVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
        this.c = cVar;
        this.d = fVar;
        this.e = bVar;
        this.f = aVar2;
        this.g = jVar;
        this.h = tVar;
        this.i = jVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static List c(List list, List list2, Map map) {
        ?? r5;
        if (list2.isEmpty()) {
            return list;
        }
        List<c> list3 = list;
        int d = gw00.d(tcc.n(list3, 10));
        if (d < 16) {
            d = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (c cVar : list3) {
            List list4 = (List) map.get(cVar.b());
            if (list4 != null) {
                List list5 = list4;
                r5 = new ArrayList(tcc.n(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    r5.add(((com.yandex.passport.internal.badges.a) it.next()).a);
                }
            } else {
                r5 = EmptySet.a;
            }
            Uid b = cVar.b();
            int size = list2.size();
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list2.get(i);
                zArr[i] = r5.contains((String) pair.getFirst()) == ((Boolean) pair.getSecond()).booleanValue();
            }
            Pair pair2 = new Pair(b, zArr);
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        return kotlin.collections.a.x0(list3, new Comparator() { // from class: com.yandex.passport.internal.autologin.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                c cVar2 = (c) obj2;
                try {
                    boolean[] zArr2 = (boolean[]) kotlin.collections.b.g(((c) obj).a, linkedHashMap2);
                    boolean[] zArr3 = (boolean[]) kotlin.collections.b.g(cVar2.a, linkedHashMap2);
                    int length = zArr2.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolean z = zArr2[i2];
                        if (z != zArr3[i2]) {
                            return z ? -1 : 1;
                        }
                    }
                } catch (Exception e) {
                    com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Comparator error for ordered accounts", e);
                    }
                }
                return 0;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0157 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0194 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab A[Catch: Exception -> 0x005a, LOOP:0: B:48:0x00a5->B:50:0x00ab, LOOP_END, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:12:0x0055, B:13:0x0182, B:14:0x0151, B:16:0x0157, B:21:0x0194, B:23:0x01a8, B:28:0x01be, B:29:0x01db, B:31:0x01eb, B:34:0x01f2, B:35:0x01f6, B:37:0x01c1, B:39:0x01d7, B:40:0x01b0, B:45:0x006b, B:47:0x0088, B:48:0x00a5, B:50:0x00ab, B:52:0x00ba, B:54:0x00c8, B:55:0x00d0, B:57:0x00d9, B:58:0x00df, B:60:0x00e7, B:61:0x00f2, B:63:0x00f8, B:65:0x0106, B:66:0x010c, B:68:0x0112, B:74:0x0118, B:76:0x011e, B:78:0x0134, B:81:0x0141, B:85:0x0074), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x017e -> B:13:0x0182). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(k kVar, i iVar, ContinuationImpl continuationImpl) {
        GetOrderedAccountsForAutoLoginUseCase$run$1 getOrderedAccountsForAutoLoginUseCase$run$1;
        int i;
        List list;
        i iVar2;
        Iterator it;
        String e;
        ArrayList m0;
        Iterator it2;
        k kVar2;
        List list2;
        com.yandex.passport.internal.b bVar;
        Map map;
        List list3;
        Ref$BooleanRef ref$BooleanRef;
        i iVar3;
        List list4;
        List x0;
        List list5;
        k kVar3 = kVar;
        try {
            if (continuationImpl instanceof GetOrderedAccountsForAutoLoginUseCase$run$1) {
                getOrderedAccountsForAutoLoginUseCase$run$1 = (GetOrderedAccountsForAutoLoginUseCase$run$1) continuationImpl;
                int i2 = getOrderedAccountsForAutoLoginUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getOrderedAccountsForAutoLoginUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = getOrderedAccountsForAutoLoginUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getOrderedAccountsForAutoLoginUseCase$run$1.label;
                    list = EmptyList.a;
                    String str = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.internal.badges.c cVar = kVar3.c;
                        zy11 zy11Var = zy11.a;
                        getOrderedAccountsForAutoLoginUseCase$run$1.L$0 = kVar3;
                        iVar2 = iVar;
                        getOrderedAccountsForAutoLoginUseCase$run$1.L$1 = iVar2;
                        getOrderedAccountsForAutoLoginUseCase$run$1.label = 1;
                        obj = cVar.a(zy11Var, getOrderedAccountsForAutoLoginUseCase$run$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i == 1) {
                        i iVar4 = (i) getOrderedAccountsForAutoLoginUseCase$run$1.L$1;
                        k kVar4 = (k) getOrderedAccountsForAutoLoginUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        iVar2 = iVar4;
                        kVar3 = kVar4;
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Uid uid = (Uid) getOrderedAccountsForAutoLoginUseCase$run$1.L$9;
                        map = (Map) getOrderedAccountsForAutoLoginUseCase$run$1.L$8;
                        it2 = (Iterator) getOrderedAccountsForAutoLoginUseCase$run$1.L$7;
                        Map map2 = (Map) getOrderedAccountsForAutoLoginUseCase$run$1.L$6;
                        list3 = (List) getOrderedAccountsForAutoLoginUseCase$run$1.L$5;
                        ref$BooleanRef = (Ref$BooleanRef) getOrderedAccountsForAutoLoginUseCase$run$1.L$4;
                        bVar = (com.yandex.passport.internal.b) getOrderedAccountsForAutoLoginUseCase$run$1.L$3;
                        list2 = (List) getOrderedAccountsForAutoLoginUseCase$run$1.L$2;
                        iVar3 = (i) getOrderedAccountsForAutoLoginUseCase$run$1.L$1;
                        kVar2 = (k) getOrderedAccountsForAutoLoginUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        Pair pair = new Pair(uid, obj);
                        map.put(pair.c(), pair.f());
                        map = map2;
                        if (it2.hasNext()) {
                            c cVar2 = (c) it2.next();
                            Uid b = cVar2.b();
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$0 = kVar2;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$1 = iVar3;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$2 = list2;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$3 = bVar;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$4 = ref$BooleanRef;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$5 = list3;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$6 = map;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$7 = it2;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$8 = map;
                            getOrderedAccountsForAutoLoginUseCase$run$1.L$9 = b;
                            getOrderedAccountsForAutoLoginUseCase$run$1.label = 2;
                            Object e2 = kVar2.e(list2, bVar, cVar2, getOrderedAccountsForAutoLoginUseCase$run$1);
                            if (e2 != coroutineSingletons) {
                                obj = e2;
                                uid = b;
                                map2 = map;
                                Pair pair2 = new Pair(uid, obj);
                                map.put(pair2.c(), pair2.f());
                                map = map2;
                                if (it2.hasNext()) {
                                    AutoLoginReporter$Companion$AutoLoginPriorityType autoLoginReporter$Companion$AutoLoginPriorityType = AutoLoginReporter$Companion$AutoLoginPriorityType.DEFAULT;
                                    com.yandex.passport.internal.flags.j jVar = kVar2.g;
                                    com.yandex.passport.internal.config.b bVar2 = kVar2.e;
                                    if (((Boolean) jVar.b(q.E)).booleanValue()) {
                                        String str2 = iVar3.c;
                                        Environment environment = iVar3.b;
                                        list4 = str2 == null ? null : (List) bVar2.a("autologin_client_id_parameters", environment).get(str2);
                                        if (list4 != null) {
                                            autoLoginReporter$Companion$AutoLoginPriorityType = AutoLoginReporter$Companion$AutoLoginPriorityType.BY_CLIENT_ID;
                                        } else {
                                            list4 = (List) bVar2.a("autologin_app_parameters", environment).get(((com.yandex.passport.internal.common.e) kVar2.f).a());
                                            if (list4 != null) {
                                                autoLoginReporter$Companion$AutoLoginPriorityType = AutoLoginReporter$Companion$AutoLoginPriorityType.BY_APP_ID;
                                            }
                                        }
                                        x0 = kotlin.collections.a.x0(list3, new j(map));
                                        list5 = list4;
                                        if (list5 != null && !list5.isEmpty()) {
                                            x0 = c(x0, list4, map);
                                        }
                                        kVar2.i.k(x0, ((Boolean) kVar2.g.b(q.F)).booleanValue(), autoLoginReporter$Companion$AutoLoginPriorityType, ref$BooleanRef.element);
                                        return x0;
                                    }
                                    list4 = null;
                                    x0 = kotlin.collections.a.x0(list3, new j(map));
                                    list5 = list4;
                                    if (list5 != null) {
                                        x0 = c(x0, list4, map);
                                    }
                                    kVar2.i.k(x0, ((Boolean) kVar2.g.b(q.F)).booleanValue(), autoLoginReporter$Companion$AutoLoginPriorityType, ref$BooleanRef.element);
                                    return x0;
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    List list6 = (List) obj;
                    com.yandex.passport.internal.core.accounts.d dVar = kVar3.b;
                    com.yandex.passport.internal.flags.j jVar2 = kVar3.g;
                    com.yandex.passport.internal.b a = dVar.a();
                    List list7 = iVar2.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new a((ModernAccount) it.next()));
                    }
                    List d = !((Boolean) jVar2.b(q.F)).booleanValue() ? kVar3.d(a, iVar2.a) : list;
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    String str3 = iVar2.d;
                    e = str3 == null ? com.yandex.passport.internal.utils.b.e(str3) : null;
                    m0 = kotlin.collections.a.m0(d, arrayList);
                    if (e != null) {
                        ref$BooleanRef2.element = true;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = m0.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            String a2 = ((c) next).a();
                            if (a2 != null) {
                                str = com.yandex.passport.internal.utils.b.e(a2);
                            }
                            if (jl40.l(str, e)) {
                                arrayList2.add(next);
                            }
                            str = null;
                        }
                        m0 = arrayList2;
                    }
                    if (!m0.isEmpty()) {
                        kVar3.i.k(list, ((Boolean) jVar2.b(q.F)).booleanValue(), AutoLoginReporter$Companion$AutoLoginPriorityType.NULL, ref$BooleanRef2.element);
                        return list;
                    }
                    int d2 = gw00.d(tcc.n(m0, 10));
                    if (d2 < 16) {
                        d2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                    it2 = m0.iterator();
                    kVar2 = kVar3;
                    list2 = list6;
                    bVar = a;
                    map = linkedHashMap;
                    list3 = m0;
                    ref$BooleanRef = ref$BooleanRef2;
                    iVar3 = iVar2;
                    if (it2.hasNext()) {
                    }
                }
            }
            if (i != 0) {
            }
            List list62 = (List) obj;
            com.yandex.passport.internal.core.accounts.d dVar2 = kVar3.b;
            com.yandex.passport.internal.flags.j jVar22 = kVar3.g;
            com.yandex.passport.internal.b a3 = dVar2.a();
            List list72 = iVar2.a;
            ArrayList arrayList3 = new ArrayList(tcc.n(list72, 10));
            it = list72.iterator();
            while (it.hasNext()) {
            }
            if (!((Boolean) jVar22.b(q.F)).booleanValue()) {
            }
            Ref$BooleanRef ref$BooleanRef22 = new Ref$BooleanRef();
            String str32 = iVar2.d;
            if (str32 == null) {
            }
            m0 = kotlin.collections.a.m0(d, arrayList3);
            if (e != null) {
            }
            if (!m0.isEmpty()) {
            }
        } catch (Exception e3) {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error ordering accounts for auto-login", e3);
            }
            return list;
        }
        getOrderedAccountsForAutoLoginUseCase$run$1 = new GetOrderedAccountsForAutoLoginUseCase$run$1(kVar3, continuationImpl);
        Object obj2 = getOrderedAccountsForAutoLoginUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getOrderedAccountsForAutoLoginUseCase$run$1.label;
        list = EmptyList.a;
        String str4 = null;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return f(this, (i) obj, (ContinuationImpl) continuation);
    }

    public final ArrayList d(com.yandex.passport.internal.b bVar, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ModernAccount) it.next()).getUid());
        }
        Set M0 = kotlin.collections.a.M0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (com.yandex.passport.internal.entities.k kVar : kotlin.collections.a.J0(this.h.a(bVar).values())) {
            if (M0.add(kVar.d())) {
                arrayList2.add(new b(kVar));
            }
        }
        return arrayList2;
    }

    public final Object e(List list, com.yandex.passport.internal.b bVar, c cVar, Continuation continuation) {
        AccountRow a;
        String str;
        if (cVar instanceof a) {
            return (list.isEmpty() || (a = bVar.a(((a) cVar).c().getAccount())) == null || (str = a.userInfoBody) == null) ? EmptyList.a : this.d.a(new com.yandex.passport.internal.badges.e(str, list), continuation);
        }
        if (cVar instanceof b) {
            return a0.u(list, ((b) cVar).c().b());
        }
        w511.b();
        return null;
    }
}
