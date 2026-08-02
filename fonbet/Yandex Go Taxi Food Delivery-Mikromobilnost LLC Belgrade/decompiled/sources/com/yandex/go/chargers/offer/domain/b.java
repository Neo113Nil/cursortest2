package com.yandex.go.chargers.offer.domain;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferTabDto;
import com.yandex.go.chargers.offer.experiments.ChargersOfferComposeExperiment;
import defpackage.em9;
import defpackage.f8a;
import defpackage.fl3;
import defpackage.fp9;
import defpackage.g6a;
import defpackage.hfa0;
import defpackage.i8a;
import defpackage.iwa;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k6a;
import defpackage.k9a;
import defpackage.mth;
import defpackage.n9a;
import defpackage.ny61;
import defpackage.o9a;
import defpackage.ow9;
import defpackage.pwy0;
import defpackage.r9a;
import defpackage.rpa;
import defpackage.s6a;
import defpackage.s8o;
import defpackage.tpr;
import defpackage.tsa;
import defpackage.x8a;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public final em9 a;
    public final com.yandex.go.chargers.surge.domain.a b;
    public final pwy0 c;
    public final iwa d;
    public final com.yandex.go.chargers.offer.data.mappers.b e;
    public final k9a f;
    public final com.yandex.go.chargers.offer.data.b g;
    public final com.yandex.go.chargers.offer.data.a h;
    public final com.yandex.go.chargers.domain.a i;
    public final o9a j;
    public final f8a k;
    public final g6a l;
    public final r9a m;
    public final com.yandex.go.chargers.offer.data.mappers.a n;
    public final rpa o;
    public final com.yandex.go.chargers.payments.data.a p;
    public final i8a q;

    public b(em9 em9Var, com.yandex.go.chargers.surge.domain.a aVar, pwy0 pwy0Var, iwa iwaVar, com.yandex.go.chargers.offer.data.mappers.b bVar, k9a k9aVar, com.yandex.go.chargers.offer.data.b bVar2, com.yandex.go.chargers.offer.data.a aVar2, com.yandex.go.chargers.domain.a aVar3, o9a o9aVar, f8a f8aVar, g6a g6aVar, r9a r9aVar, com.yandex.go.chargers.offer.data.mappers.a aVar4, rpa rpaVar, com.yandex.go.chargers.payments.data.a aVar5, i8a i8aVar) {
        this.a = em9Var;
        this.b = aVar;
        this.c = pwy0Var;
        this.d = iwaVar;
        this.e = bVar;
        this.f = k9aVar;
        this.g = bVar2;
        this.h = aVar2;
        this.i = aVar3;
        this.j = o9aVar;
        this.k = f8aVar;
        this.l = g6aVar;
        this.m = r9aVar;
        this.n = aVar4;
        this.o = rpaVar;
        this.p = aVar5;
        this.q = i8aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, tsa tsaVar, fp9 fp9Var, ContinuationImpl continuationImpl) {
        ChargersCreateOfferInteractor$getChargersOffer$1 chargersCreateOfferInteractor$getChargersOffer$1;
        int i;
        hfa0 hfa0Var;
        n9a n9aVar;
        x8a x8aVar;
        bVar.getClass();
        if (continuationImpl instanceof ChargersCreateOfferInteractor$getChargersOffer$1) {
            chargersCreateOfferInteractor$getChargersOffer$1 = (ChargersCreateOfferInteractor$getChargersOffer$1) continuationImpl;
            int i2 = chargersCreateOfferInteractor$getChargersOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCreateOfferInteractor$getChargersOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersCreateOfferInteractor$getChargersOffer$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCreateOfferInteractor$getChargersOffer$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hfa0 hfa0Var2 = fp9Var.a instanceof fl3 ? fp9Var.b : hfa0.c;
                    n9a n9aVar2 = (n9a) bVar.j.a.getValue();
                    chargersCreateOfferInteractor$getChargersOffer$1.L$0 = null;
                    chargersCreateOfferInteractor$getChargersOffer$1.L$1 = fp9Var;
                    chargersCreateOfferInteractor$getChargersOffer$1.L$2 = hfa0Var2;
                    chargersCreateOfferInteractor$getChargersOffer$1.L$3 = n9aVar2;
                    chargersCreateOfferInteractor$getChargersOffer$1.label = 1;
                    Object b = bVar.b(tsaVar, hfa0Var2, n9aVar2, chargersCreateOfferInteractor$getChargersOffer$1);
                    if (b == obj2) {
                        return obj2;
                    }
                    hfa0Var = hfa0Var2;
                    n9aVar = n9aVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n9a n9aVar3 = (n9a) chargersCreateOfferInteractor$getChargersOffer$1.L$3;
                    hfa0 hfa0Var3 = (hfa0) chargersCreateOfferInteractor$getChargersOffer$1.L$2;
                    fp9 fp9Var2 = (fp9) chargersCreateOfferInteractor$getChargersOffer$1.L$1;
                    kotlin.b.b(obj);
                    n9aVar = n9aVar3;
                    hfa0Var = hfa0Var3;
                    fp9Var = fp9Var2;
                }
                x8aVar = (x8a) obj;
                if (x8aVar != null) {
                    return null;
                }
                ChargersOfferResponseDto chargersOfferResponseDto = x8aVar.a;
                String str2 = x8aVar.b;
                boolean z = x8aVar.c;
                k9a k9aVar = bVar.f;
                List list = chargersOfferResponseDto.t;
                if (!z) {
                    list = null;
                }
                if (list == null) {
                    list = EmptyList.a;
                }
                r0 r0Var = k9aVar.a;
                String str3 = (String) r0Var.getValue();
                if (str3 != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((ChargersOfferTabDto) it.next()).a, str3)) {
                                break;
                            }
                        }
                    }
                    str3 = null;
                    if (str3 != null) {
                        str = str3;
                        r0Var.l(str);
                        return new s6a(fp9Var.a, hfa0Var, n9aVar, chargersOfferResponseDto, str2, z);
                    }
                }
                ChargersOfferTabDto chargersOfferTabDto = (ChargersOfferTabDto) kotlin.collections.a.R(list);
                if (chargersOfferTabDto != null) {
                    str = chargersOfferTabDto.a;
                }
                r0Var.l(str);
                return new s6a(fp9Var.a, hfa0Var, n9aVar, chargersOfferResponseDto, str2, z);
            }
        }
        chargersCreateOfferInteractor$getChargersOffer$1 = new ChargersCreateOfferInteractor$getChargersOffer$1(bVar, continuationImpl);
        Object obj3 = chargersCreateOfferInteractor$getChargersOffer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCreateOfferInteractor$getChargersOffer$1.label;
        String str4 = null;
        if (i != 0) {
        }
        x8aVar = (x8a) obj3;
        if (x8aVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020d A[Catch: all -> 0x0062, CancellationException -> 0x0065, TryCatch #3 {CancellationException -> 0x0065, all -> 0x0062, blocks: (B:17:0x005d, B:19:0x0237, B:32:0x009a, B:34:0x01ed, B:37:0x01f5, B:38:0x0209, B:40:0x020d, B:46:0x00cc, B:48:0x01c4, B:52:0x00ee, B:54:0x0187, B:56:0x0197, B:62:0x0109, B:64:0x015e, B:66:0x0162, B:72:0x0118), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197 A[Catch: all -> 0x0062, CancellationException -> 0x0065, TryCatch #3 {CancellationException -> 0x0065, all -> 0x0062, blocks: (B:17:0x005d, B:19:0x0237, B:32:0x009a, B:34:0x01ed, B:37:0x01f5, B:38:0x0209, B:40:0x020d, B:46:0x00cc, B:48:0x01c4, B:52:0x00ee, B:54:0x0187, B:56:0x0197, B:62:0x0109, B:64:0x015e, B:66:0x0162, B:72:0x0118), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162 A[Catch: all -> 0x0062, CancellationException -> 0x0065, TryCatch #3 {CancellationException -> 0x0065, all -> 0x0062, blocks: (B:17:0x005d, B:19:0x0237, B:32:0x009a, B:34:0x01ed, B:37:0x01f5, B:38:0x0209, B:40:0x020d, B:46:0x00cc, B:48:0x01c4, B:52:0x00ee, B:54:0x0187, B:56:0x0197, B:62:0x0109, B:64:0x015e, B:66:0x0162, B:72:0x0118), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tsa tsaVar, hfa0 hfa0Var, n9a n9aVar, ContinuationImpl continuationImpl) {
        ChargersCreateOfferInteractor$getOrCreateOffer$1 chargersCreateOfferInteractor$getOrCreateOffer$1;
        int i;
        f8a f8aVar;
        Object obj;
        Object b;
        tsa tsaVar2;
        hfa0 hfa0Var2;
        n9a n9aVar2;
        ow9 ow9Var;
        boolean z;
        x8a x8aVar;
        boolean z2;
        ChargersCreateOfferInteractor$getOrCreateOffer$1 chargersCreateOfferInteractor$getOrCreateOffer$12;
        boolean z3;
        Object a;
        tsa tsaVar3;
        ow9 ow9Var2;
        hfa0 hfa0Var3;
        n9a n9aVar3;
        x8a x8aVar2;
        ChargersOfferResponseDto chargersOfferResponseDto;
        String str;
        ChargersOfferResponseDto.Notification notification;
        ow9 ow9Var3;
        tsa tsaVar4;
        n9a n9aVar4;
        hfa0 hfa0Var4;
        Object obj2;
        Object obj3;
        boolean z4;
        ow9 ow9Var4;
        hfa0 hfa0Var5;
        String str2;
        ChargersOfferResponseDto chargersOfferResponseDto2;
        n9a n9aVar5;
        tsa tsaVar5;
        x8a x8aVar3;
        g6a g6aVar;
        Object obj4;
        try {
            if (continuationImpl instanceof ChargersCreateOfferInteractor$getOrCreateOffer$1) {
                chargersCreateOfferInteractor$getOrCreateOffer$1 = (ChargersCreateOfferInteractor$getOrCreateOffer$1) continuationImpl;
                int i2 = chargersCreateOfferInteractor$getOrCreateOffer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersCreateOfferInteractor$getOrCreateOffer$1.label = i2 - Integer.MIN_VALUE;
                    ChargersCreateOfferInteractor$getOrCreateOffer$1 chargersCreateOfferInteractor$getOrCreateOffer$13 = chargersCreateOfferInteractor$getOrCreateOffer$1;
                    Object obj5 = chargersCreateOfferInteractor$getOrCreateOffer$13.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersCreateOfferInteractor$getOrCreateOffer$13.label;
                    rpa rpaVar = this.o;
                    f8aVar = this.k;
                    if (i != 0) {
                        kotlin.b.b(obj5);
                        ow9 ow9Var5 = (ow9) e.d(rpaVar.y).a.getValue();
                        boolean z5 = ((ChargersOfferComposeExperiment) this.h.f.b.b()).b;
                        f8aVar.a(true);
                        com.yandex.go.chargers.offer.data.b bVar = this.g;
                        chargersCreateOfferInteractor$getOrCreateOffer$13.L$0 = tsaVar;
                        chargersCreateOfferInteractor$getOrCreateOffer$13.L$1 = hfa0Var;
                        chargersCreateOfferInteractor$getOrCreateOffer$13.L$2 = n9aVar;
                        chargersCreateOfferInteractor$getOrCreateOffer$13.L$3 = ow9Var5;
                        chargersCreateOfferInteractor$getOrCreateOffer$13.Z$0 = false;
                        chargersCreateOfferInteractor$getOrCreateOffer$13.label = 1;
                        obj = null;
                        b = bVar.b(tsaVar, hfa0Var, n9aVar, ow9Var5, chargersCreateOfferInteractor$getOrCreateOffer$13);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        tsaVar2 = tsaVar;
                        hfa0Var2 = hfa0Var;
                        n9aVar2 = n9aVar;
                        ow9Var = ow9Var5;
                        z = false;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                boolean z6 = chargersCreateOfferInteractor$getOrCreateOffer$13.Z$0;
                                ow9Var2 = (ow9) chargersCreateOfferInteractor$getOrCreateOffer$13.L$3;
                                n9aVar3 = (n9a) chargersCreateOfferInteractor$getOrCreateOffer$13.L$2;
                                hfa0Var3 = (hfa0) chargersCreateOfferInteractor$getOrCreateOffer$13.L$1;
                                tsaVar3 = (tsa) chargersCreateOfferInteractor$getOrCreateOffer$13.L$0;
                                kotlin.b.b(obj5);
                                chargersCreateOfferInteractor$getOrCreateOffer$12 = chargersCreateOfferInteractor$getOrCreateOffer$13;
                                z3 = z6;
                                a = obj5;
                                obj = null;
                                x8aVar2 = (x8a) a;
                                chargersOfferResponseDto = x8aVar2.a;
                                str = x8aVar2.b;
                                rpaVar.Jg(chargersOfferResponseDto.s);
                                notification = chargersOfferResponseDto.q;
                                if (notification != null) {
                                    tsa tsaVar6 = tsaVar3;
                                    ow9Var3 = ow9Var2;
                                    tsaVar4 = tsaVar6;
                                    hfa0 hfa0Var6 = hfa0Var3;
                                    n9aVar4 = n9aVar3;
                                    hfa0Var4 = hfa0Var6;
                                    obj2 = a;
                                    if (!x8aVar2.c) {
                                    }
                                    x8aVar = (x8a) obj2;
                                    z2 = false;
                                    f8aVar.a(z2);
                                    return x8aVar;
                                }
                                com.yandex.go.chargers.offer.data.mappers.a aVar = this.n;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$0 = tsaVar3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$1 = hfa0Var3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$2 = n9aVar3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$3 = ow9Var2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$4 = obj;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$5 = a;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$6 = x8aVar2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$7 = chargersOfferResponseDto;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$8 = str;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$9 = obj;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.Z$0 = z3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.label = 3;
                                obj5 = aVar.a(notification, chargersCreateOfferInteractor$getOrCreateOffer$12);
                                if (obj5 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                boolean z7 = z3;
                                obj3 = a;
                                z4 = z7;
                                ow9Var4 = ow9Var2;
                                hfa0Var5 = hfa0Var3;
                                str2 = str;
                                chargersOfferResponseDto2 = chargersOfferResponseDto;
                                n9aVar5 = n9aVar3;
                                tsaVar5 = tsaVar3;
                                x8aVar3 = x8aVar2;
                                g6aVar = this.l;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$0 = tsaVar5;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$1 = hfa0Var5;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$2 = n9aVar5;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$3 = ow9Var4;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$4 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$5 = obj3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$6 = x8aVar3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$7 = chargersOfferResponseDto2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$8 = str2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$9 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$10 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.Z$0 = z4;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.label = 4;
                                if (g6aVar.a.emit((k6a) obj5, chargersCreateOfferInteractor$getOrCreateOffer$12) == coroutineSingletons) {
                                }
                                this.a.f(str2 == null ? "" : str2);
                                chargersOfferResponseDto = chargersOfferResponseDto2;
                                x8aVar2 = x8aVar3;
                                obj2 = obj3;
                                ow9Var3 = ow9Var4;
                                n9aVar4 = n9aVar5;
                                z3 = z4;
                                str = str2;
                                tsaVar4 = tsaVar5;
                                hfa0Var4 = hfa0Var5;
                                if (!x8aVar2.c) {
                                }
                                x8aVar = (x8a) obj2;
                                z2 = false;
                                f8aVar.a(z2);
                                return x8aVar;
                            }
                            if (i == 3) {
                                z4 = chargersCreateOfferInteractor$getOrCreateOffer$13.Z$0;
                                str2 = (String) chargersCreateOfferInteractor$getOrCreateOffer$13.L$8;
                                ChargersOfferResponseDto chargersOfferResponseDto3 = (ChargersOfferResponseDto) chargersCreateOfferInteractor$getOrCreateOffer$13.L$7;
                                x8a x8aVar4 = (x8a) chargersCreateOfferInteractor$getOrCreateOffer$13.L$6;
                                Object obj6 = chargersCreateOfferInteractor$getOrCreateOffer$13.L$5;
                                ow9 ow9Var6 = (ow9) chargersCreateOfferInteractor$getOrCreateOffer$13.L$3;
                                n9a n9aVar6 = (n9a) chargersCreateOfferInteractor$getOrCreateOffer$13.L$2;
                                hfa0Var5 = (hfa0) chargersCreateOfferInteractor$getOrCreateOffer$13.L$1;
                                tsa tsaVar7 = (tsa) chargersCreateOfferInteractor$getOrCreateOffer$13.L$0;
                                kotlin.b.b(obj5);
                                n9aVar5 = n9aVar6;
                                ow9Var4 = ow9Var6;
                                chargersCreateOfferInteractor$getOrCreateOffer$12 = chargersCreateOfferInteractor$getOrCreateOffer$13;
                                obj3 = obj6;
                                x8aVar3 = x8aVar4;
                                chargersOfferResponseDto2 = chargersOfferResponseDto3;
                                tsaVar5 = tsaVar7;
                                g6aVar = this.l;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$0 = tsaVar5;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$1 = hfa0Var5;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$2 = n9aVar5;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$3 = ow9Var4;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$4 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$5 = obj3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$6 = x8aVar3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$7 = chargersOfferResponseDto2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$8 = str2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$9 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$10 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.Z$0 = z4;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.label = 4;
                                if (g6aVar.a.emit((k6a) obj5, chargersCreateOfferInteractor$getOrCreateOffer$12) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                this.a.f(str2 == null ? "" : str2);
                                chargersOfferResponseDto = chargersOfferResponseDto2;
                                x8aVar2 = x8aVar3;
                                obj2 = obj3;
                                ow9Var3 = ow9Var4;
                                n9aVar4 = n9aVar5;
                                z3 = z4;
                                str = str2;
                                tsaVar4 = tsaVar5;
                                hfa0Var4 = hfa0Var5;
                                if (!x8aVar2.c) {
                                }
                                x8aVar = (x8a) obj2;
                                z2 = false;
                                f8aVar.a(z2);
                                return x8aVar;
                            }
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj4 = chargersCreateOfferInteractor$getOrCreateOffer$13.L$5;
                                try {
                                    kotlin.b.b(obj5);
                                    obj2 = obj4;
                                    x8aVar = (x8a) obj2;
                                    z2 = false;
                                    f8aVar.a(z2);
                                    return x8aVar;
                                } catch (Throwable th) {
                                    f8aVar.a(false);
                                    throw th;
                                }
                            }
                            z4 = chargersCreateOfferInteractor$getOrCreateOffer$13.Z$0;
                            str2 = (String) chargersCreateOfferInteractor$getOrCreateOffer$13.L$8;
                            chargersOfferResponseDto2 = (ChargersOfferResponseDto) chargersCreateOfferInteractor$getOrCreateOffer$13.L$7;
                            x8aVar3 = (x8a) chargersCreateOfferInteractor$getOrCreateOffer$13.L$6;
                            Object obj7 = chargersCreateOfferInteractor$getOrCreateOffer$13.L$5;
                            ow9Var4 = (ow9) chargersCreateOfferInteractor$getOrCreateOffer$13.L$3;
                            n9aVar5 = (n9a) chargersCreateOfferInteractor$getOrCreateOffer$13.L$2;
                            hfa0Var5 = (hfa0) chargersCreateOfferInteractor$getOrCreateOffer$13.L$1;
                            tsaVar5 = (tsa) chargersCreateOfferInteractor$getOrCreateOffer$13.L$0;
                            kotlin.b.b(obj5);
                            chargersCreateOfferInteractor$getOrCreateOffer$12 = chargersCreateOfferInteractor$getOrCreateOffer$13;
                            obj3 = obj7;
                            this.a.f(str2 == null ? "" : str2);
                            chargersOfferResponseDto = chargersOfferResponseDto2;
                            x8aVar2 = x8aVar3;
                            obj2 = obj3;
                            ow9Var3 = ow9Var4;
                            n9aVar4 = n9aVar5;
                            z3 = z4;
                            str = str2;
                            tsaVar4 = tsaVar5;
                            hfa0Var4 = hfa0Var5;
                            if (!x8aVar2.c) {
                                com.yandex.go.chargers.offer.data.b bVar2 = this.g;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$0 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$1 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$2 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$3 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$4 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$5 = obj2;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$6 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$7 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$8 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$9 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.L$10 = null;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.Z$0 = z3;
                                chargersCreateOfferInteractor$getOrCreateOffer$12.label = 5;
                                if (bVar2.c(tsaVar4, hfa0Var4, n9aVar4, ow9Var3, chargersOfferResponseDto, str, chargersCreateOfferInteractor$getOrCreateOffer$12) != coroutineSingletons) {
                                    obj4 = obj2;
                                    obj2 = obj4;
                                }
                                return coroutineSingletons;
                            }
                            x8aVar = (x8a) obj2;
                            z2 = false;
                            f8aVar.a(z2);
                            return x8aVar;
                        }
                        boolean z8 = chargersCreateOfferInteractor$getOrCreateOffer$13.Z$0;
                        ow9 ow9Var7 = (ow9) chargersCreateOfferInteractor$getOrCreateOffer$13.L$3;
                        n9a n9aVar7 = (n9a) chargersCreateOfferInteractor$getOrCreateOffer$13.L$2;
                        hfa0 hfa0Var7 = (hfa0) chargersCreateOfferInteractor$getOrCreateOffer$13.L$1;
                        tsa tsaVar8 = (tsa) chargersCreateOfferInteractor$getOrCreateOffer$13.L$0;
                        kotlin.b.b(obj5);
                        n9aVar2 = n9aVar7;
                        hfa0Var2 = hfa0Var7;
                        ow9Var = ow9Var7;
                        tsaVar2 = tsaVar8;
                        z = z8;
                        b = obj5;
                        obj = null;
                    }
                    x8aVar = (x8a) b;
                    if (x8aVar == null) {
                        z2 = false;
                        f8aVar.a(z2);
                        return x8aVar;
                    }
                    com.yandex.go.chargers.offer.data.a aVar2 = this.h;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.L$0 = tsaVar2;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.L$1 = hfa0Var2;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.L$2 = n9aVar2;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.L$3 = ow9Var;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.L$4 = obj;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.Z$0 = z;
                    chargersCreateOfferInteractor$getOrCreateOffer$13.label = 2;
                    chargersCreateOfferInteractor$getOrCreateOffer$12 = chargersCreateOfferInteractor$getOrCreateOffer$13;
                    z3 = z;
                    ow9 ow9Var8 = ow9Var;
                    a = aVar2.a(tsaVar2, hfa0Var2, n9aVar2, ow9Var8, z3, chargersCreateOfferInteractor$getOrCreateOffer$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tsaVar3 = tsaVar2;
                    ow9Var2 = ow9Var8;
                    n9a n9aVar8 = n9aVar2;
                    hfa0Var3 = hfa0Var2;
                    n9aVar3 = n9aVar8;
                    x8aVar2 = (x8a) a;
                    chargersOfferResponseDto = x8aVar2.a;
                    str = x8aVar2.b;
                    rpaVar.Jg(chargersOfferResponseDto.s);
                    notification = chargersOfferResponseDto.q;
                    if (notification != null) {
                    }
                }
            }
            if (i != 0) {
            }
            x8aVar = (x8a) b;
            if (x8aVar == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            if (!s8o.z(th2)) {
                throw th2;
            }
            f8aVar.a(false);
            return null;
        }
        chargersCreateOfferInteractor$getOrCreateOffer$1 = new ChargersCreateOfferInteractor$getOrCreateOffer$1(this, continuationImpl);
        ChargersCreateOfferInteractor$getOrCreateOffer$1 chargersCreateOfferInteractor$getOrCreateOffer$132 = chargersCreateOfferInteractor$getOrCreateOffer$1;
        Object obj52 = chargersCreateOfferInteractor$getOrCreateOffer$132.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCreateOfferInteractor$getOrCreateOffer$132.label;
        rpa rpaVar2 = this.o;
        f8aVar = this.k;
    }

    public final o c(tsa tsaVar) {
        tpr a = this.c.a();
        jqr c = this.i.c();
        com.yandex.go.chargers.payments.data.a aVar = this.p;
        int i = 3;
        return new o(new a(new tpr[]{a, new mth(new jqr(e.I(e.n(c, new jqr(aVar.e(), new ChargersCreateOfferInteractor$observeOffer$1(this, null), i), com.yandex.go.coroutines.b.d(new jqr(this.m.a, new ChargersCreateOfferInteractor$observeOffer$2(this, null), i), new ChargersCreateOfferInteractor$observeOffer$$inlined$start$1(zy11.a, null)), ChargersCreateOfferInteractor$observeOffer$3.a), new ChargersCreateOfferInteractor$observeOffer$4(tsaVar, this, null)), new ChargersCreateOfferInteractor$observeOffer$5(this, null), i), 6), aVar.e(), this.j.a, this.f.a, this.k.b, this.q.b}, this, tsaVar), new ChargersCreateOfferInteractor$loadOffer$2(this, null));
    }
}
