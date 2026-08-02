package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.plaque.plugin.internal.defaults.c;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;
import defpackage.ay50;
import defpackage.b5d0;
import defpackage.bvf0;
import defpackage.cp50;
import defpackage.ffx;
import defpackage.fp50;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h260;
import defpackage.hkc0;
import defpackage.hw50;
import defpackage.i4z;
import defpackage.iv50;
import defpackage.jse;
import defpackage.l160;
import defpackage.lj;
import defpackage.lqc0;
import defpackage.lzs;
import defpackage.m6d0;
import defpackage.ny61;
import defpackage.o060;
import defpackage.o1k0;
import defpackage.pgz;
import defpackage.r060;
import defpackage.r160;
import defpackage.rhc0;
import defpackage.sog;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b implements lqc0 {
    public final CrossPlaqueControllerApi a;
    public final c b;
    public final m6d0 c;
    public final lzs d;
    public final sog e;
    public final tls f;
    public final sog g;
    public final tls h;
    public final sog i;
    public final sog j;
    public final sog k;
    public final o1k0 l;
    public final pgz m;
    public final jse n;
    public final r0 o = bvf0.c(kotlin.collections.b.f());
    public final n0 p;
    public final r0 q;
    public final r0 r;
    public final a s;
    public final kotlinx.coroutines.sync.a t;

    public b(CrossPlaqueControllerApi crossPlaqueControllerApi, c cVar, m6d0 m6d0Var, lzs lzsVar, com.yandex.plus.plaquesdk.widget.a aVar, b5d0 b5d0Var, sog sogVar, tls tlsVar, sog sogVar2, tls tlsVar2, sog sogVar3, sog sogVar4, sog sogVar5, o1k0 o1k0Var, pgz pgzVar, tse tseVar, jse jseVar) {
        this.a = crossPlaqueControllerApi;
        this.b = cVar;
        this.c = m6d0Var;
        this.d = lzsVar;
        this.e = sogVar;
        this.f = tlsVar;
        this.g = sogVar2;
        this.h = tlsVar2;
        this.i = sogVar3;
        this.j = sogVar4;
        this.k = sogVar5;
        this.l = o1k0Var;
        this.m = pgzVar;
        this.n = jseVar;
        n0 c = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
        c.g(null);
        this.p = c;
        this.q = bvf0.c(Boolean.FALSE);
        this.r = bvf0.c(null);
        this.s = new a(aVar, b5d0Var, tseVar, jseVar);
        this.t = gtq0.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027e A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #9 {all -> 0x0296, blocks: (B:127:0x0251, B:132:0x027e), top: B:126:0x0251 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0386 A[Catch: all -> 0x0355, TryCatch #8 {all -> 0x0355, blocks: (B:36:0x0381, B:39:0x0386, B:46:0x038c, B:50:0x034e), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x038c A[Catch: all -> 0x0355, TRY_LEAVE, TryCatch #8 {all -> 0x0355, blocks: (B:36:0x0381, B:39:0x0386, B:46:0x038c, B:50:0x034e), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031c  */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v61, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(b bVar, ay50 ay50Var, boolean z, Map map, com.yandex.plus.home.benchmark.a aVar, Continuation continuation) {
        RestPlaqueRepository$constructPlaqueConfig$1 restPlaqueRepository$constructPlaqueConfig$1;
        ?? r2;
        Object obj;
        ay50 ay50Var2;
        boolean z2;
        Object obj2;
        Map map2;
        com.yandex.plus.home.benchmark.a aVar2;
        i4z i4zVar;
        c cVar;
        String str;
        Object obj3;
        boolean z3;
        boolean z4;
        i4z i4zVar2;
        Object obj4;
        int i;
        hkc0 hkc0Var;
        hkc0 hkc0Var2;
        Object obj5;
        int i2;
        ay50 ay50Var3;
        i4z i4zVar3;
        Map map3;
        hkc0 hkc0Var3;
        g050 g050Var;
        int i3;
        boolean z5;
        int i4;
        g050 g050Var2;
        Object obj6;
        Object n;
        i4z i4zVar4;
        Map map4;
        hkc0 hkc0Var4;
        Object obj7;
        Map map5;
        i4z i4zVar5;
        int i5;
        LogPriority logPriority;
        String str2;
        c cVar2;
        Object c;
        Map map6;
        g050 g050Var3;
        int i6;
        i4z i4zVar6;
        boolean z6;
        int i7;
        Object obj8;
        b bVar2;
        List list;
        g050 g050Var4;
        b bVar3;
        boolean z7;
        Map map7;
        g050 g050Var5;
        o060 o060Var;
        Object j;
        hkc0 hkc0Var5;
        c cVar3 = bVar.b;
        g050 g050Var6 = bVar.t;
        pgz pgzVar = bVar.m;
        try {
            try {
                if (continuation instanceof RestPlaqueRepository$constructPlaqueConfig$1) {
                    restPlaqueRepository$constructPlaqueConfig$1 = (RestPlaqueRepository$constructPlaqueConfig$1) continuation;
                    int i8 = restPlaqueRepository$constructPlaqueConfig$1.label;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        restPlaqueRepository$constructPlaqueConfig$1.label = i8 - Integer.MIN_VALUE;
                        RestPlaqueRepository$constructPlaqueConfig$1 restPlaqueRepository$constructPlaqueConfig$12 = restPlaqueRepository$constructPlaqueConfig$1;
                        Object obj9 = restPlaqueRepository$constructPlaqueConfig$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        r2 = restPlaqueRepository$constructPlaqueConfig$12.label;
                        switch (r2) {
                            case 0:
                                kotlin.b.b(obj9);
                                restPlaqueRepository$constructPlaqueConfig$12.L$0 = ay50Var;
                                restPlaqueRepository$constructPlaqueConfig$12.L$1 = map;
                                restPlaqueRepository$constructPlaqueConfig$12.L$2 = aVar;
                                restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z;
                                restPlaqueRepository$constructPlaqueConfig$12.label = 1;
                                Object h = bVar.h(restPlaqueRepository$constructPlaqueConfig$12);
                                if (h != coroutineSingletons) {
                                    ay50Var2 = ay50Var;
                                    z2 = z;
                                    obj2 = h;
                                    map2 = map;
                                    aVar2 = aVar;
                                    i4zVar = (i4z) obj2;
                                    if (ay50Var2 == null) {
                                        LogPriority logPriority2 = LogPriority.DEBUG;
                                        if (pgzVar.e(logPriority2)) {
                                            pgzVar.a(logPriority2, "RestPlaqueRepository", "try construct network config");
                                        }
                                        List list2 = ay50Var2.b;
                                        o060 o060Var2 = ay50Var2.a;
                                        List list3 = ay50Var2.e;
                                        PlaqueModel$Type plaqueModel$Type = PlaqueModel$Type.DEFAULT;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$0 = ay50Var2;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$1 = map2;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$4 = null;
                                        restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z2;
                                        restPlaqueRepository$constructPlaqueConfig$12.I$0 = 0;
                                        restPlaqueRepository$constructPlaqueConfig$12.label = 2;
                                        Object j2 = bVar.j(list2, o060Var2, list3, map2, aVar2, plaqueModel$Type, restPlaqueRepository$constructPlaqueConfig$12);
                                        if (j2 != coroutineSingletons) {
                                            z4 = z2;
                                            i4zVar2 = i4zVar;
                                            obj4 = j2;
                                            i = 0;
                                            hkc0Var = (hkc0) obj4;
                                            if (hkc0Var == null) {
                                                restPlaqueRepository$constructPlaqueConfig$12.L$0 = ay50Var2;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$1 = map2;
                                                obj5 = null;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar2;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$4 = null;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$5 = hkc0Var;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$6 = null;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$7 = g050Var6;
                                                restPlaqueRepository$constructPlaqueConfig$12.L$8 = null;
                                                restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z4;
                                                restPlaqueRepository$constructPlaqueConfig$12.I$0 = i;
                                                restPlaqueRepository$constructPlaqueConfig$12.I$1 = 0;
                                                restPlaqueRepository$constructPlaqueConfig$12.I$2 = 0;
                                                restPlaqueRepository$constructPlaqueConfig$12.label = 3;
                                                if (g050Var6.a(restPlaqueRepository$constructPlaqueConfig$12) != coroutineSingletons) {
                                                    i2 = i;
                                                    cVar = cVar3;
                                                    str = "RestPlaqueRepository";
                                                    ay50Var3 = ay50Var2;
                                                    i4zVar3 = i4zVar2;
                                                    map3 = map2;
                                                    hkc0Var3 = hkc0Var;
                                                    g050Var = g050Var6;
                                                    i3 = 0;
                                                    z5 = z4;
                                                    i4 = 0;
                                                    try {
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$0 = obj5;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$1 = map3;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$2 = obj5;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar3;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$4 = obj5;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$5 = hkc0Var3;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$6 = obj5;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$7 = g050Var;
                                                        restPlaqueRepository$constructPlaqueConfig$12.L$8 = obj5;
                                                        restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z5;
                                                        restPlaqueRepository$constructPlaqueConfig$12.I$0 = i2;
                                                        restPlaqueRepository$constructPlaqueConfig$12.I$1 = i3;
                                                        restPlaqueRepository$constructPlaqueConfig$12.I$2 = i4;
                                                        restPlaqueRepository$constructPlaqueConfig$12.I$3 = 0;
                                                        restPlaqueRepository$constructPlaqueConfig$12.label = 4;
                                                        n = bvf0.n(new RestPlaqueRepository$cacheNetworkDefinition$2(i4zVar3, ay50Var3, bVar, null), restPlaqueRepository$constructPlaqueConfig$12);
                                                        if (n == coroutineSingletons) {
                                                            n = zy11.a;
                                                        }
                                                        if (n != coroutineSingletons) {
                                                            g050Var2 = g050Var;
                                                            z4 = z5;
                                                            i4zVar4 = i4zVar3;
                                                            map4 = map3;
                                                            hkc0Var4 = hkc0Var3;
                                                            obj7 = null;
                                                            g050Var2.d(obj7);
                                                            hkc0Var2 = hkc0Var4;
                                                            map2 = map4;
                                                            obj3 = obj7;
                                                            i4zVar = i4zVar4;
                                                            if (hkc0Var2 != null) {
                                                                return hkc0Var2;
                                                            }
                                                            z3 = z4;
                                                            map5 = map2;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$0 = obj3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$1 = map5;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$2 = obj3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$4 = g050Var6;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$5 = obj3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$6 = obj3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$7 = obj3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.L$8 = obj3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z3;
                                                            restPlaqueRepository$constructPlaqueConfig$12.I$0 = 0;
                                                            restPlaqueRepository$constructPlaqueConfig$12.label = 5;
                                                            if (g050Var6.a(restPlaqueRepository$constructPlaqueConfig$12) != coroutineSingletons) {
                                                                i4zVar5 = i4zVar;
                                                                i5 = 0;
                                                                try {
                                                                    logPriority = LogPriority.DEBUG;
                                                                    if (pgzVar.e(logPriority)) {
                                                                        str2 = str;
                                                                    } else {
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder("try construct cached config, showPrefetch=");
                                                                            sb.append(!z3);
                                                                            str2 = str;
                                                                            pgzVar.a(logPriority, str2, sb.toString());
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            r2 = g050Var6;
                                                                            obj = null;
                                                                            r2.d(obj);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    obj = null;
                                                                }
                                                                try {
                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$1 = map5;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar5;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$4 = g050Var6;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$5 = bVar;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z3;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.I$0 = i5;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.I$1 = 0;
                                                                    restPlaqueRepository$constructPlaqueConfig$12.label = 6;
                                                                    cVar2 = cVar;
                                                                    c = cVar2.c(i4zVar5, restPlaqueRepository$constructPlaqueConfig$12);
                                                                    if (c != coroutineSingletons) {
                                                                        map6 = map5;
                                                                        g050Var3 = g050Var6;
                                                                        i6 = 0;
                                                                        i4zVar6 = i4zVar5;
                                                                        z6 = z3;
                                                                        i7 = i5;
                                                                        obj8 = c;
                                                                        bVar2 = bVar;
                                                                        try {
                                                                            List list4 = (List) obj8;
                                                                            if (z6) {
                                                                                try {
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$1 = map6;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$3 = null;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$4 = g050Var3;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$5 = list4;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$6 = bVar2;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z6;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.I$0 = i7;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.I$1 = i6;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.label = 8;
                                                                                    obj9 = cVar2.b(i4zVar6, restPlaqueRepository$constructPlaqueConfig$12);
                                                                                    if (obj9 != coroutineSingletons) {
                                                                                        boolean z8 = z6;
                                                                                        list = list4;
                                                                                        g050Var4 = g050Var3;
                                                                                        bVar3 = bVar2;
                                                                                        z7 = z8;
                                                                                        map7 = map6;
                                                                                        o060Var = (o060) obj9;
                                                                                        r2 = g050Var4;
                                                                                        int i9 = i6;
                                                                                        o060 o060Var3 = o060Var;
                                                                                        List list5 = list;
                                                                                        PlaqueModel$Type plaqueModel$Type2 = !z7 ? PlaqueModel$Type.FALLBACK : PlaqueModel$Type.PREFETCH;
                                                                                        obj = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$1 = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$3 = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$4 = r2;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$5 = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.L$6 = null;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z7;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.I$0 = i7;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.I$1 = i9;
                                                                                        restPlaqueRepository$constructPlaqueConfig$12.label = 9;
                                                                                        j = bVar3.j(list5, o060Var3, null, map7, null, plaqueModel$Type2, restPlaqueRepository$constructPlaqueConfig$12);
                                                                                        if (j != coroutineSingletons) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    obj = null;
                                                                                    r2 = g050Var3;
                                                                                    r2.d(obj);
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$1 = map6;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$3 = null;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$4 = g050Var3;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$5 = list4;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.L$6 = bVar2;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z6;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.I$0 = i7;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.I$1 = i6;
                                                                                    restPlaqueRepository$constructPlaqueConfig$12.label = 7;
                                                                                    obj9 = cVar2.a(i4zVar6, restPlaqueRepository$constructPlaqueConfig$12);
                                                                                    if (obj9 != coroutineSingletons) {
                                                                                        boolean z9 = z6;
                                                                                        list = list4;
                                                                                        g050Var5 = g050Var3;
                                                                                        bVar3 = bVar2;
                                                                                        z7 = z9;
                                                                                        map7 = map6;
                                                                                        o060Var = (o060) obj9;
                                                                                        r2 = g050Var5;
                                                                                        int i92 = i6;
                                                                                        o060 o060Var32 = o060Var;
                                                                                        List list52 = list;
                                                                                        PlaqueModel$Type plaqueModel$Type22 = !z7 ? PlaqueModel$Type.FALLBACK : PlaqueModel$Type.PREFETCH;
                                                                                        obj = null;
                                                                                        try {
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$1 = null;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$3 = null;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$4 = r2;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$5 = null;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.L$6 = null;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z7;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.I$0 = i7;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.I$1 = i92;
                                                                                            restPlaqueRepository$constructPlaqueConfig$12.label = 9;
                                                                                            j = bVar3.j(list52, o060Var32, null, map7, null, plaqueModel$Type22, restPlaqueRepository$constructPlaqueConfig$12);
                                                                                            if (j != coroutineSingletons) {
                                                                                                return coroutineSingletons;
                                                                                            }
                                                                                            obj9 = j;
                                                                                            r2 = r2;
                                                                                            hkc0Var5 = (hkc0) obj9;
                                                                                            r2.d(obj);
                                                                                            if (hkc0Var5 == null) {
                                                                                                return hkc0Var5;
                                                                                            }
                                                                                            LogPriority logPriority3 = LogPriority.DEBUG;
                                                                                            if (pgzVar.e(logPriority3)) {
                                                                                                pgzVar.a(logPriority3, str2, "fallback to empty config");
                                                                                            }
                                                                                            bVar.s.getClass();
                                                                                            return new hkc0(EmptyList.a, Collections.singletonList(rhc0.g));
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                            r2.d(obj);
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                    r2 = g050Var3;
                                                                                    obj = null;
                                                                                    r2.d(obj);
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            obj = null;
                                                                        }
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    obj = null;
                                                                    r2 = g050Var6;
                                                                    r2.d(obj);
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        g050Var2 = g050Var;
                                                        obj6 = null;
                                                        g050Var2.d(obj6);
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                cVar = cVar3;
                                                str = "RestPlaqueRepository";
                                                obj3 = null;
                                                i4zVar = i4zVar2;
                                                hkc0Var2 = null;
                                                if (hkc0Var2 != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        cVar = cVar3;
                                        str = "RestPlaqueRepository";
                                        obj3 = null;
                                        z3 = z2;
                                        map5 = map2;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$0 = obj3;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$1 = map5;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$2 = obj3;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$4 = g050Var6;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$5 = obj3;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$6 = obj3;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$7 = obj3;
                                        restPlaqueRepository$constructPlaqueConfig$12.L$8 = obj3;
                                        restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z3;
                                        restPlaqueRepository$constructPlaqueConfig$12.I$0 = 0;
                                        restPlaqueRepository$constructPlaqueConfig$12.label = 5;
                                        if (g050Var6.a(restPlaqueRepository$constructPlaqueConfig$12) != coroutineSingletons) {
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            case 1:
                                boolean z10 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                com.yandex.plus.home.benchmark.a aVar3 = (com.yandex.plus.home.benchmark.a) restPlaqueRepository$constructPlaqueConfig$12.L$2;
                                Map map8 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                ay50 ay50Var4 = (ay50) restPlaqueRepository$constructPlaqueConfig$12.L$0;
                                kotlin.b.b(obj9);
                                z2 = z10;
                                aVar2 = aVar3;
                                ay50Var2 = ay50Var4;
                                obj2 = obj9;
                                map2 = map8;
                                i4zVar = (i4z) obj2;
                                if (ay50Var2 == null) {
                                }
                                break;
                            case 2:
                                obj4 = obj9;
                                i = restPlaqueRepository$constructPlaqueConfig$12.I$0;
                                z4 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                i4zVar2 = (i4z) restPlaqueRepository$constructPlaqueConfig$12.L$3;
                                map2 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                ay50 ay50Var5 = (ay50) restPlaqueRepository$constructPlaqueConfig$12.L$0;
                                kotlin.b.b(obj4);
                                ay50Var2 = ay50Var5;
                                hkc0Var = (hkc0) obj4;
                                if (hkc0Var == null) {
                                }
                                break;
                            case 3:
                                i4 = restPlaqueRepository$constructPlaqueConfig$12.I$2;
                                i3 = restPlaqueRepository$constructPlaqueConfig$12.I$1;
                                int i10 = restPlaqueRepository$constructPlaqueConfig$12.I$0;
                                z5 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                g050 g050Var7 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$7;
                                hkc0Var3 = (hkc0) restPlaqueRepository$constructPlaqueConfig$12.L$5;
                                i4z i4zVar7 = (i4z) restPlaqueRepository$constructPlaqueConfig$12.L$3;
                                Map map9 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                ay50Var3 = (ay50) restPlaqueRepository$constructPlaqueConfig$12.L$0;
                                kotlin.b.b(obj9);
                                cVar = cVar3;
                                str = "RestPlaqueRepository";
                                i4zVar3 = i4zVar7;
                                map3 = map9;
                                i2 = i10;
                                g050Var = g050Var7;
                                obj5 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$0 = obj5;
                                restPlaqueRepository$constructPlaqueConfig$12.L$1 = map3;
                                restPlaqueRepository$constructPlaqueConfig$12.L$2 = obj5;
                                restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar3;
                                restPlaqueRepository$constructPlaqueConfig$12.L$4 = obj5;
                                restPlaqueRepository$constructPlaqueConfig$12.L$5 = hkc0Var3;
                                restPlaqueRepository$constructPlaqueConfig$12.L$6 = obj5;
                                restPlaqueRepository$constructPlaqueConfig$12.L$7 = g050Var;
                                restPlaqueRepository$constructPlaqueConfig$12.L$8 = obj5;
                                restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z5;
                                restPlaqueRepository$constructPlaqueConfig$12.I$0 = i2;
                                restPlaqueRepository$constructPlaqueConfig$12.I$1 = i3;
                                restPlaqueRepository$constructPlaqueConfig$12.I$2 = i4;
                                restPlaqueRepository$constructPlaqueConfig$12.I$3 = 0;
                                restPlaqueRepository$constructPlaqueConfig$12.label = 4;
                                n = bvf0.n(new RestPlaqueRepository$cacheNetworkDefinition$2(i4zVar3, ay50Var3, bVar, null), restPlaqueRepository$constructPlaqueConfig$12);
                                if (n == coroutineSingletons) {
                                }
                                if (n != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            case 4:
                                z4 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                g050Var2 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$7;
                                hkc0Var4 = (hkc0) restPlaqueRepository$constructPlaqueConfig$12.L$5;
                                i4zVar4 = (i4z) restPlaqueRepository$constructPlaqueConfig$12.L$3;
                                map4 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                try {
                                    kotlin.b.b(obj9);
                                    cVar = cVar3;
                                    str = "RestPlaqueRepository";
                                    obj7 = null;
                                    g050Var2.d(obj7);
                                    hkc0Var2 = hkc0Var4;
                                    map2 = map4;
                                    obj3 = obj7;
                                    i4zVar = i4zVar4;
                                    if (hkc0Var2 != null) {
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj6 = null;
                                    g050Var2.d(obj6);
                                    throw th;
                                }
                                break;
                            case 5:
                                i5 = restPlaqueRepository$constructPlaqueConfig$12.I$0;
                                z3 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                g050Var6 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$4;
                                i4z i4zVar8 = (i4z) restPlaqueRepository$constructPlaqueConfig$12.L$3;
                                map5 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                kotlin.b.b(obj9);
                                i4zVar5 = i4zVar8;
                                cVar = cVar3;
                                str = "RestPlaqueRepository";
                                logPriority = LogPriority.DEBUG;
                                if (pgzVar.e(logPriority)) {
                                }
                                restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$1 = map5;
                                restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$3 = i4zVar5;
                                restPlaqueRepository$constructPlaqueConfig$12.L$4 = g050Var6;
                                restPlaqueRepository$constructPlaqueConfig$12.L$5 = bVar;
                                restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z3;
                                restPlaqueRepository$constructPlaqueConfig$12.I$0 = i5;
                                restPlaqueRepository$constructPlaqueConfig$12.I$1 = 0;
                                restPlaqueRepository$constructPlaqueConfig$12.label = 6;
                                cVar2 = cVar;
                                c = cVar2.c(i4zVar5, restPlaqueRepository$constructPlaqueConfig$12);
                                if (c != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            case 6:
                                i6 = restPlaqueRepository$constructPlaqueConfig$12.I$1;
                                int i11 = restPlaqueRepository$constructPlaqueConfig$12.I$0;
                                boolean z11 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                bVar2 = (b) restPlaqueRepository$constructPlaqueConfig$12.L$5;
                                g050Var3 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$4;
                                i4z i4zVar9 = (i4z) restPlaqueRepository$constructPlaqueConfig$12.L$3;
                                Map map10 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                try {
                                    kotlin.b.b(obj9);
                                    map6 = map10;
                                    i4zVar6 = i4zVar9;
                                    z6 = z11;
                                    i7 = i11;
                                    obj8 = obj9;
                                    cVar2 = cVar3;
                                    str2 = "RestPlaqueRepository";
                                    List list42 = (List) obj8;
                                    if (z6) {
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th10) {
                                    th = th10;
                                    r2 = g050Var3;
                                    obj = null;
                                    r2.d(obj);
                                    throw th;
                                }
                            case 7:
                                int i12 = restPlaqueRepository$constructPlaqueConfig$12.I$1;
                                i7 = restPlaqueRepository$constructPlaqueConfig$12.I$0;
                                z7 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                bVar3 = (b) restPlaqueRepository$constructPlaqueConfig$12.L$6;
                                list = (List) restPlaqueRepository$constructPlaqueConfig$12.L$5;
                                g050 g050Var8 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$4;
                                map7 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                kotlin.b.b(obj9);
                                i6 = i12;
                                g050Var5 = g050Var8;
                                str2 = "RestPlaqueRepository";
                                o060Var = (o060) obj9;
                                r2 = g050Var5;
                                int i922 = i6;
                                o060 o060Var322 = o060Var;
                                List list522 = list;
                                PlaqueModel$Type plaqueModel$Type222 = !z7 ? PlaqueModel$Type.FALLBACK : PlaqueModel$Type.PREFETCH;
                                obj = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$1 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$3 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$4 = r2;
                                restPlaqueRepository$constructPlaqueConfig$12.L$5 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$6 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z7;
                                restPlaqueRepository$constructPlaqueConfig$12.I$0 = i7;
                                restPlaqueRepository$constructPlaqueConfig$12.I$1 = i922;
                                restPlaqueRepository$constructPlaqueConfig$12.label = 9;
                                j = bVar3.j(list522, o060Var322, null, map7, null, plaqueModel$Type222, restPlaqueRepository$constructPlaqueConfig$12);
                                if (j != coroutineSingletons) {
                                }
                                break;
                            case 8:
                                int i13 = restPlaqueRepository$constructPlaqueConfig$12.I$1;
                                i7 = restPlaqueRepository$constructPlaqueConfig$12.I$0;
                                z7 = restPlaqueRepository$constructPlaqueConfig$12.Z$0;
                                bVar3 = (b) restPlaqueRepository$constructPlaqueConfig$12.L$6;
                                list = (List) restPlaqueRepository$constructPlaqueConfig$12.L$5;
                                g050 g050Var9 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$4;
                                map7 = (Map) restPlaqueRepository$constructPlaqueConfig$12.L$1;
                                kotlin.b.b(obj9);
                                i6 = i13;
                                g050Var4 = g050Var9;
                                str2 = "RestPlaqueRepository";
                                o060Var = (o060) obj9;
                                r2 = g050Var4;
                                int i9222 = i6;
                                o060 o060Var3222 = o060Var;
                                List list5222 = list;
                                PlaqueModel$Type plaqueModel$Type2222 = !z7 ? PlaqueModel$Type.FALLBACK : PlaqueModel$Type.PREFETCH;
                                obj = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$0 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$1 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$2 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$3 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$4 = r2;
                                restPlaqueRepository$constructPlaqueConfig$12.L$5 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.L$6 = null;
                                restPlaqueRepository$constructPlaqueConfig$12.Z$0 = z7;
                                restPlaqueRepository$constructPlaqueConfig$12.I$0 = i7;
                                restPlaqueRepository$constructPlaqueConfig$12.I$1 = i9222;
                                restPlaqueRepository$constructPlaqueConfig$12.label = 9;
                                j = bVar3.j(list5222, o060Var3222, null, map7, null, plaqueModel$Type2222, restPlaqueRepository$constructPlaqueConfig$12);
                                if (j != coroutineSingletons) {
                                }
                                break;
                            case 9:
                                r2 = (g050) restPlaqueRepository$constructPlaqueConfig$12.L$4;
                                try {
                                    kotlin.b.b(obj9);
                                    str2 = "RestPlaqueRepository";
                                    obj = null;
                                    r2 = r2;
                                    hkc0Var5 = (hkc0) obj9;
                                    r2.d(obj);
                                    if (hkc0Var5 == null) {
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    obj = null;
                                    r2.d(obj);
                                    throw th;
                                }
                                break;
                            default:
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (r2) {
                }
            } catch (Throwable th12) {
                th = th12;
                r2 = cVar3;
            }
        } catch (Throwable th13) {
            th = th13;
        }
        restPlaqueRepository$constructPlaqueConfig$1 = new RestPlaqueRepository$constructPlaqueConfig$1(bVar, continuation);
        RestPlaqueRepository$constructPlaqueConfig$1 restPlaqueRepository$constructPlaqueConfig$122 = restPlaqueRepository$constructPlaqueConfig$1;
        Object obj92 = restPlaqueRepository$constructPlaqueConfig$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = restPlaqueRepository$constructPlaqueConfig$122.label;
    }

    public static final void i(HashSet hashSet, LinkedHashMap linkedHashMap, String str) {
        hashSet.add(str);
        h260 h260Var = (h260) linkedHashMap.get(str);
        if (h260Var instanceof cp50) {
            Iterator it = ((cp50) h260Var).e.iterator();
            while (it.hasNext()) {
                i(hashSet, linkedHashMap, (String) it.next());
            }
        } else if (h260Var instanceof hw50) {
            Iterator it2 = ((hw50) h260Var).e.iterator();
            while (it2.hasNext()) {
                i(hashSet, linkedHashMap, (String) it2.next());
            }
        } else {
            if ((h260Var instanceof fp50) || (h260Var instanceof iv50) || (h260Var instanceof r060) || (h260Var instanceof l160) || (h260Var instanceof r160) || h260Var == null) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.lqc0
    public final Object a(String str, ContinuationImpl continuationImpl) {
        return zy11.a;
    }

    @Override // defpackage.lqc0
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(this.n, new RestPlaqueRepository$reportPlaqueSeen$2(this, str, str2, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    @Override // defpackage.lqc0
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(this.n, new RestPlaqueRepository$reportPlaqueClicked$2(this, str, str2, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    @Override // defpackage.lqc0
    public final Object d(int i, int i2, ContinuationImpl continuationImpl) {
        return tje.k0(this.n, new RestPlaqueRepository$updatePlaqueConfiguration$2(this, i, i2, null), continuationImpl);
    }

    @Override // defpackage.lqc0
    public final tpr e() {
        return e.F(e.o(e.m(this.p, this.q, this.o, this.r, new RestPlaqueRepository$plaqueConfigFlow$1(5, this, b.class, "constructPlaqueConfig", "constructPlaqueConfig(Lcom/yandex/plus/home/datasource/openapi/models/NetworkPlaqueDefinitionsModel;ZLjava/util/Map;Lcom/yandex/plus/core/benchmark/DataFetchingBenchmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0))), this.n);
    }

    @Override // defpackage.lqc0
    public final Object f(Map map, ContinuationImpl continuationImpl) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.m;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "RestPlaqueRepository", "updateTemplates(templates=" + map + ')');
        }
        this.o.l(map);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        RestPlaqueRepository$createKey$1 restPlaqueRepository$createKey$1;
        int i;
        Long l;
        boolean z;
        if (continuationImpl instanceof RestPlaqueRepository$createKey$1) {
            restPlaqueRepository$createKey$1 = (RestPlaqueRepository$createKey$1) continuationImpl;
            int i2 = restPlaqueRepository$createKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restPlaqueRepository$createKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = restPlaqueRepository$createKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restPlaqueRepository$createKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Long id = ((lj) this.g.invoke()).getId();
                    boolean booleanValue = ((Boolean) this.e.invoke()).booleanValue();
                    restPlaqueRepository$createKey$1.L$0 = id;
                    restPlaqueRepository$createKey$1.Z$0 = booleanValue;
                    restPlaqueRepository$createKey$1.label = 1;
                    Object invoke = this.h.invoke(restPlaqueRepository$createKey$1);
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l = id;
                    obj = invoke;
                    z = booleanValue;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = restPlaqueRepository$createKey$1.Z$0;
                    l = (Long) restPlaqueRepository$createKey$1.L$0;
                    kotlin.b.b(obj);
                }
                return new i4z(l, (String) obj, z);
            }
        }
        restPlaqueRepository$createKey$1 = new RestPlaqueRepository$createKey$1(this, continuationImpl);
        Object obj2 = restPlaqueRepository$createKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restPlaqueRepository$createKey$1.label;
        if (i != 0) {
        }
        return new i4z(l, (String) obj2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(List list, o060 o060Var, List list2, Map map, com.yandex.plus.home.benchmark.a aVar, PlaqueModel$Type plaqueModel$Type, ContinuationImpl continuationImpl) {
        RestPlaqueRepository$tryConstructPlaqueConfig$1 restPlaqueRepository$tryConstructPlaqueConfig$1;
        int i;
        List list3;
        Object g;
        List list4;
        Map map2;
        com.yandex.plus.home.benchmark.a aVar2;
        rhc0 rhc0Var;
        List list5;
        List M;
        if (continuationImpl instanceof RestPlaqueRepository$tryConstructPlaqueConfig$1) {
            restPlaqueRepository$tryConstructPlaqueConfig$1 = (RestPlaqueRepository$tryConstructPlaqueConfig$1) continuationImpl;
            int i2 = restPlaqueRepository$tryConstructPlaqueConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restPlaqueRepository$tryConstructPlaqueConfig$1.label = i2 - Integer.MIN_VALUE;
                RestPlaqueRepository$tryConstructPlaqueConfig$1 restPlaqueRepository$tryConstructPlaqueConfig$12 = restPlaqueRepository$tryConstructPlaqueConfig$1;
                Object obj = restPlaqueRepository$tryConstructPlaqueConfig$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restPlaqueRepository$tryConstructPlaqueConfig$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list != null && o060Var != null) {
                        if (aVar != null) {
                            aVar.e();
                        }
                        restPlaqueRepository$tryConstructPlaqueConfig$12.L$0 = list;
                        restPlaqueRepository$tryConstructPlaqueConfig$12.L$1 = null;
                        list3 = list2;
                        restPlaqueRepository$tryConstructPlaqueConfig$12.L$2 = list3;
                        restPlaqueRepository$tryConstructPlaqueConfig$12.L$3 = map;
                        restPlaqueRepository$tryConstructPlaqueConfig$12.L$4 = aVar;
                        restPlaqueRepository$tryConstructPlaqueConfig$12.L$5 = null;
                        restPlaqueRepository$tryConstructPlaqueConfig$12.label = 1;
                        g = this.s.g(o060Var, list, map, plaqueModel$Type, restPlaqueRepository$tryConstructPlaqueConfig$12);
                        if (g != coroutineSingletons) {
                            list4 = list;
                            map2 = map;
                            aVar2 = aVar;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rhc0Var = (rhc0) restPlaqueRepository$tryConstructPlaqueConfig$12.L$6;
                    aVar2 = (com.yandex.plus.home.benchmark.a) restPlaqueRepository$tryConstructPlaqueConfig$12.L$4;
                    kotlin.b.b(obj);
                    list5 = (List) obj;
                    List singletonList = Collections.singletonList(rhc0Var);
                    M = list5 != null ? kotlin.collections.a.M(list5) : null;
                    if (M == null) {
                        M = EmptyList.a;
                    }
                    hkc0 hkc0Var = new hkc0(M, singletonList);
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                    return hkc0Var;
                }
                aVar2 = (com.yandex.plus.home.benchmark.a) restPlaqueRepository$tryConstructPlaqueConfig$12.L$4;
                map2 = (Map) restPlaqueRepository$tryConstructPlaqueConfig$12.L$3;
                List list6 = (List) restPlaqueRepository$tryConstructPlaqueConfig$12.L$2;
                list4 = (List) restPlaqueRepository$tryConstructPlaqueConfig$12.L$0;
                kotlin.b.b(obj);
                g = ((Result) obj).getValue();
                list3 = list6;
                if (!(g instanceof Result.Failure)) {
                    Throwable a = Result.a(g);
                    if (a != null) {
                        LogPriority logPriority = LogPriority.ERROR;
                        pgz pgzVar = this.m;
                        if (pgzVar.e(logPriority)) {
                            pgzVar.b(logPriority, "RestPlaqueRepository", "can't map default plaque", a);
                        }
                    }
                    return null;
                }
                rhc0 rhc0Var2 = (rhc0) g;
                if (list3 == null) {
                    rhc0Var = rhc0Var2;
                    list5 = null;
                    List singletonList2 = Collections.singletonList(rhc0Var);
                    if (list5 != null) {
                    }
                    if (M == null) {
                    }
                    hkc0 hkc0Var2 = new hkc0(M, singletonList2);
                    if (aVar2 != null) {
                    }
                    return hkc0Var2;
                }
                RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1 restPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1 = new RestPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1(list3, null, this, list4, map2);
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$0 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$1 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$2 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$3 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$4 = aVar2;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$5 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$6 = rhc0Var2;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$7 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.L$8 = null;
                restPlaqueRepository$tryConstructPlaqueConfig$12.I$0 = 0;
                restPlaqueRepository$tryConstructPlaqueConfig$12.I$1 = 0;
                restPlaqueRepository$tryConstructPlaqueConfig$12.label = 2;
                Object n = bvf0.n(restPlaqueRepository$tryConstructPlaqueConfig$lambda$13$$inlined$asyncMap$1, restPlaqueRepository$tryConstructPlaqueConfig$12);
                if (n != coroutineSingletons) {
                    obj = n;
                    rhc0Var = rhc0Var2;
                    list5 = (List) obj;
                    List singletonList22 = Collections.singletonList(rhc0Var);
                    if (list5 != null) {
                    }
                    if (M == null) {
                    }
                    hkc0 hkc0Var22 = new hkc0(M, singletonList22);
                    if (aVar2 != null) {
                    }
                    return hkc0Var22;
                }
                return coroutineSingletons;
            }
        }
        restPlaqueRepository$tryConstructPlaqueConfig$1 = new RestPlaqueRepository$tryConstructPlaqueConfig$1(this, continuationImpl);
        RestPlaqueRepository$tryConstructPlaqueConfig$1 restPlaqueRepository$tryConstructPlaqueConfig$122 = restPlaqueRepository$tryConstructPlaqueConfig$1;
        Object obj2 = restPlaqueRepository$tryConstructPlaqueConfig$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restPlaqueRepository$tryConstructPlaqueConfig$122.label;
        if (i != 0) {
        }
        if (!(g instanceof Result.Failure)) {
        }
    }
}
