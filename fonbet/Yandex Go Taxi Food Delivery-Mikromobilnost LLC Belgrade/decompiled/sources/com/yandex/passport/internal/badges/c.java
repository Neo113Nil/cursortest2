package com.yandex.passport.internal.badges;

import android.content.Context;
import com.yandex.passport.data.network.a3;
import com.yandex.passport.data.network.core.m;
import com.yandex.passport.data.network.d3;
import com.yandex.passport.data.network.r2;
import com.yandex.passport.data.network.u2;
import com.yandex.passport.internal.report.c2;
import com.yandex.passport.internal.report.reporters.l;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.zcx;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;

/* loaded from: classes8.dex */
public final class c extends com.yandex.passport.common.domain.d {
    public final Context b;
    public final b c;

    public c(com.yandex.passport.common.coroutine.a aVar, Context context, b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = context;
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0053, code lost:
    
        if (r10 == r1) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(c cVar, ContinuationImpl continuationImpl) {
        GetAllowedBadgesUseCase$run$1 getAllowedBadgesUseCase$run$1;
        int i;
        String str;
        Object obj;
        a aVar;
        ?? r9;
        if (continuationImpl instanceof GetAllowedBadgesUseCase$run$1) {
            getAllowedBadgesUseCase$run$1 = (GetAllowedBadgesUseCase$run$1) continuationImpl;
            int i2 = getAllowedBadgesUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getAllowedBadgesUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getAllowedBadgesUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getAllowedBadgesUseCase$run$1.label;
                EmptyList emptyList = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b bVar = cVar.c;
                    getAllowedBadgesUseCase$run$1.L$0 = cVar;
                    getAllowedBadgesUseCase$run$1.label = 1;
                    obj2 = tje.k0(((com.yandex.passport.common.coroutine.b) bVar.a).d, new BadgesStorage$getCachedBadgesConfig$2(bVar, null), getAllowedBadgesUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return emptyList;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) getAllowedBadgesUseCase$run$1.L$0;
                    kotlin.b.b(obj2);
                }
                str = (String) obj2;
                if (str != null) {
                    try {
                        zcx zcxVar = m.a;
                        zcxVar.getClass();
                        a3 a3Var = (a3) zcxVar.b(a3.Companion.serializer(), str);
                        Iterator it = a3Var.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            r2 r2Var = (r2) obj;
                            if (jl40.l(r2Var.b, ConstantDeviceInfo.APP_PLATFORM) && jl40.l(r2Var.a, cVar.b.getPackageName())) {
                                break;
                            }
                        }
                        r2 r2Var2 = (r2) obj;
                        if (r2Var2 != null && (r9 = r2Var2.c) != 0) {
                            emptyList = r9;
                        }
                        List list = a3Var.a;
                        int d = gw00.d(tcc.n(list, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (Object obj3 : list) {
                            linkedHashMap.put(((u2) obj3).a, obj3);
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = emptyList.iterator();
                        while (it2.hasNext()) {
                            u2 u2Var = (u2) linkedHashMap.get((String) it2.next());
                            if (u2Var != null) {
                                HashMap hashMap = u2Var.c;
                                String str2 = u2Var.a;
                                HashMap hashMap2 = u2Var.b;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(hashMap.size()));
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    linkedHashMap2.put(entry.getKey(), ((d3) entry.getValue()).a);
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(hashMap.size()));
                                for (Map.Entry entry2 : hashMap.entrySet()) {
                                    linkedHashMap3.put(entry2.getKey(), ((d3) entry2.getValue()).b);
                                }
                                aVar = new a(str2, hashMap2, linkedHashMap2, linkedHashMap3);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        }
                        return arrayList;
                    } catch (SerializationException unused) {
                        b bVar2 = cVar.c;
                        getAllowedBadgesUseCase$run$1.L$0 = null;
                        getAllowedBadgesUseCase$run$1.label = 2;
                        l lVar = bVar2.c;
                        lVar.getClass();
                        lVar.h(c2.w);
                        Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) bVar2.a).d, new BadgesStorage$notifyBadgesConfigCorrupted$2(bVar2, null), getAllowedBadgesUseCase$run$1);
                        if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            k0 = zy11.a;
                        }
                        if (k0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return emptyList;
            }
        }
        getAllowedBadgesUseCase$run$1 = new GetAllowedBadgesUseCase$run$1(cVar, continuationImpl);
        Object obj22 = getAllowedBadgesUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getAllowedBadgesUseCase$run$1.label;
        EmptyList emptyList2 = EmptyList.a;
        if (i != 0) {
        }
        str = (String) obj22;
        if (str != null) {
        }
        return emptyList2;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (ContinuationImpl) continuation);
    }
}
