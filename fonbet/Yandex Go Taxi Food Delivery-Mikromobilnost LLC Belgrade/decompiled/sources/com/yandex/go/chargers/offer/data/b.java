package com.yandex.go.chargers.offer.data;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.bvf0;
import defpackage.e3n;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hfa0;
import defpackage.kp50;
import defpackage.n9a;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ow9;
import defpackage.p7a;
import defpackage.q7a;
import defpackage.tje;
import defpackage.tsa;
import defpackage.tse;
import defpackage.x8a;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public static final long e;
    public final tse a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public final LinkedHashMap c = new LinkedHashMap();
    public final r0 d = bvf0.c(null);

    static {
        o430 o430Var = e3n.b;
        e = e3n.e(kp50.U(5, DurationUnit.MINUTES));
    }

    public b(tse tseVar) {
        this.a = tseVar;
    }

    public final void a() {
        tje.N(this.a, null, null, new ChargersOfferCacheRepository$clear$1(this, null), 3);
        this.d.l(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x005f, B:17:0x006e, B:19:0x007b, B:20:0x0081), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tsa tsaVar, hfa0 hfa0Var, n9a n9aVar, ow9 ow9Var, ContinuationImpl continuationImpl) {
        ChargersOfferCacheRepository$get$1 chargersOfferCacheRepository$get$1;
        int i;
        g050 g050Var;
        q7a q7aVar;
        x8a x8aVar;
        LinkedHashMap linkedHashMap = this.c;
        try {
            if (continuationImpl instanceof ChargersOfferCacheRepository$get$1) {
                chargersOfferCacheRepository$get$1 = (ChargersOfferCacheRepository$get$1) continuationImpl;
                int i2 = chargersOfferCacheRepository$get$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersOfferCacheRepository$get$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersOfferCacheRepository$get$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersOfferCacheRepository$get$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        chargersOfferCacheRepository$get$1.L$0 = tsaVar;
                        chargersOfferCacheRepository$get$1.L$1 = hfa0Var;
                        chargersOfferCacheRepository$get$1.L$2 = n9aVar;
                        chargersOfferCacheRepository$get$1.L$3 = ow9Var;
                        g050Var = this.b;
                        chargersOfferCacheRepository$get$1.L$4 = g050Var;
                        chargersOfferCacheRepository$get$1.label = 1;
                        if (g050Var.a(chargersOfferCacheRepository$get$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) chargersOfferCacheRepository$get$1.L$4;
                        ow9Var = (ow9) chargersOfferCacheRepository$get$1.L$3;
                        n9aVar = (n9a) chargersOfferCacheRepository$get$1.L$2;
                        hfa0Var = (hfa0) chargersOfferCacheRepository$get$1.L$1;
                        tsaVar = (tsa) chargersOfferCacheRepository$get$1.L$0;
                        kotlin.b.b(obj);
                    }
                    p7a p7aVar = new p7a(tsaVar, hfa0Var, n9aVar, ow9Var);
                    q7aVar = (q7a) linkedHashMap.get(p7aVar);
                    if (q7aVar != null) {
                        if (System.currentTimeMillis() - q7aVar.c <= e) {
                            x8aVar = new x8a(q7aVar.a, q7aVar.b, false);
                            return x8aVar;
                        }
                        linkedHashMap.remove(p7aVar);
                    }
                    x8aVar = null;
                    return x8aVar;
                }
            }
            p7a p7aVar2 = new p7a(tsaVar, hfa0Var, n9aVar, ow9Var);
            q7aVar = (q7a) linkedHashMap.get(p7aVar2);
            if (q7aVar != null) {
            }
            x8aVar = null;
            return x8aVar;
        } finally {
            g050Var.d(null);
        }
        chargersOfferCacheRepository$get$1 = new ChargersOfferCacheRepository$get$1(this, continuationImpl);
        Object obj2 = chargersOfferCacheRepository$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferCacheRepository$get$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tsa tsaVar, hfa0 hfa0Var, n9a n9aVar, ow9 ow9Var, ChargersOfferResponseDto chargersOfferResponseDto, String str, ContinuationImpl continuationImpl) {
        ChargersOfferCacheRepository$put$1 chargersOfferCacheRepository$put$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ChargersOfferCacheRepository$put$1) {
                chargersOfferCacheRepository$put$1 = (ChargersOfferCacheRepository$put$1) continuationImpl;
                int i2 = chargersOfferCacheRepository$put$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersOfferCacheRepository$put$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersOfferCacheRepository$put$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersOfferCacheRepository$put$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        chargersOfferCacheRepository$put$1.L$0 = tsaVar;
                        chargersOfferCacheRepository$put$1.L$1 = hfa0Var;
                        chargersOfferCacheRepository$put$1.L$2 = n9aVar;
                        chargersOfferCacheRepository$put$1.L$3 = ow9Var;
                        chargersOfferCacheRepository$put$1.L$4 = chargersOfferResponseDto;
                        chargersOfferCacheRepository$put$1.L$5 = str;
                        aVar = this.b;
                        chargersOfferCacheRepository$put$1.L$6 = aVar;
                        chargersOfferCacheRepository$put$1.label = 1;
                        if (aVar.a(chargersOfferCacheRepository$put$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) chargersOfferCacheRepository$put$1.L$6;
                        str = (String) chargersOfferCacheRepository$put$1.L$5;
                        chargersOfferResponseDto = (ChargersOfferResponseDto) chargersOfferCacheRepository$put$1.L$4;
                        ow9Var = (ow9) chargersOfferCacheRepository$put$1.L$3;
                        n9aVar = (n9a) chargersOfferCacheRepository$put$1.L$2;
                        hfa0Var = (hfa0) chargersOfferCacheRepository$put$1.L$1;
                        tsa tsaVar2 = (tsa) chargersOfferCacheRepository$put$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        tsaVar = tsaVar2;
                    }
                    this.c.put(new p7a(tsaVar, hfa0Var, n9aVar, ow9Var), new q7a(chargersOfferResponseDto, str, System.currentTimeMillis()));
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.c.put(new p7a(tsaVar, hfa0Var, n9aVar, ow9Var), new q7a(chargersOfferResponseDto, str, System.currentTimeMillis()));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        chargersOfferCacheRepository$put$1 = new ChargersOfferCacheRepository$put$1(this, continuationImpl);
        Object obj2 = chargersOfferCacheRepository$put$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferCacheRepository$put$1.label;
        if (i != 0) {
        }
    }
}
