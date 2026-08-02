package com.yandex.go.scooters.offers.v2.data;

import defpackage.e4o0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hbn0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ArrayList a = new ArrayList();
    public final kotlinx.coroutines.sync.a b = gtq0.a();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x004a, B:12:0x004e, B:14:0x0054, B:18:0x0067, B:24:0x006d, B:26:0x007b, B:27:0x007f), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x004a, B:12:0x004e, B:14:0x0054, B:18:0x0067, B:24:0x006d, B:26:0x007b, B:27:0x007f), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SortedSet sortedSet, ContinuationImpl continuationImpl) {
        ScootersOffersCacheRepository$get$1 scootersOffersCacheRepository$get$1;
        int i;
        g050 g050Var;
        Collection collection;
        Iterator it;
        Object obj;
        e4o0 e4o0Var;
        hbn0 hbn0Var;
        ArrayList arrayList = this.a;
        try {
            if (continuationImpl instanceof ScootersOffersCacheRepository$get$1) {
                scootersOffersCacheRepository$get$1 = (ScootersOffersCacheRepository$get$1) continuationImpl;
                int i2 = scootersOffersCacheRepository$get$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOffersCacheRepository$get$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = scootersOffersCacheRepository$get$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOffersCacheRepository$get$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        scootersOffersCacheRepository$get$1.L$0 = sortedSet;
                        g050Var = this.b;
                        scootersOffersCacheRepository$get$1.L$1 = g050Var;
                        scootersOffersCacheRepository$get$1.label = 1;
                        collection = sortedSet;
                        if (g050Var.a(scootersOffersCacheRepository$get$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersOffersCacheRepository$get$1.L$1;
                        Collection collection2 = (Set) scootersOffersCacheRepository$get$1.L$0;
                        kotlin.b.b(obj2);
                        collection = collection2;
                    }
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((e4o0) obj).a, collection)) {
                            break;
                        }
                    }
                    e4o0Var = (e4o0) obj;
                    if (e4o0Var != null) {
                        if (System.currentTimeMillis() - e4o0Var.c <= 180000) {
                            hbn0Var = e4o0Var.b;
                            return hbn0Var;
                        }
                        arrayList.remove(e4o0Var);
                    }
                    hbn0Var = null;
                    return hbn0Var;
                }
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            e4o0Var = (e4o0) obj;
            if (e4o0Var != null) {
            }
            hbn0Var = null;
            return hbn0Var;
        } finally {
            g050Var.d(null);
        }
        scootersOffersCacheRepository$get$1 = new ScootersOffersCacheRepository$get$1(this, continuationImpl);
        Object obj22 = scootersOffersCacheRepository$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOffersCacheRepository$get$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersOffersCacheRepository$invalidate$1 scootersOffersCacheRepository$invalidate$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersOffersCacheRepository$invalidate$1) {
                scootersOffersCacheRepository$invalidate$1 = (ScootersOffersCacheRepository$invalidate$1) continuationImpl;
                int i2 = scootersOffersCacheRepository$invalidate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOffersCacheRepository$invalidate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersOffersCacheRepository$invalidate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOffersCacheRepository$invalidate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersOffersCacheRepository$invalidate$1.L$0 = aVar;
                        scootersOffersCacheRepository$invalidate$1.label = 1;
                        if (aVar.a(scootersOffersCacheRepository$invalidate$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersOffersCacheRepository$invalidate$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.a.clear();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.a.clear();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        scootersOffersCacheRepository$invalidate$1 = new ScootersOffersCacheRepository$invalidate$1(this, continuationImpl);
        Object obj2 = scootersOffersCacheRepository$invalidate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOffersCacheRepository$invalidate$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SortedSet sortedSet, hbn0 hbn0Var, ContinuationImpl continuationImpl) {
        ScootersOffersCacheRepository$put$1 scootersOffersCacheRepository$put$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ScootersOffersCacheRepository$put$1) {
                scootersOffersCacheRepository$put$1 = (ScootersOffersCacheRepository$put$1) continuationImpl;
                int i2 = scootersOffersCacheRepository$put$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOffersCacheRepository$put$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersOffersCacheRepository$put$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOffersCacheRepository$put$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersOffersCacheRepository$put$1.L$0 = sortedSet;
                        scootersOffersCacheRepository$put$1.L$1 = hbn0Var;
                        aVar = this.b;
                        scootersOffersCacheRepository$put$1.L$2 = aVar;
                        scootersOffersCacheRepository$put$1.label = 1;
                        if (aVar.a(scootersOffersCacheRepository$put$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) scootersOffersCacheRepository$put$1.L$2;
                        hbn0Var = (hbn0) scootersOffersCacheRepository$put$1.L$1;
                        ?? r0 = (Set) scootersOffersCacheRepository$put$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        sortedSet = r0;
                    }
                    this.a.add(new e4o0(sortedSet, hbn0Var, System.currentTimeMillis()));
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.a.add(new e4o0(sortedSet, hbn0Var, System.currentTimeMillis()));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        scootersOffersCacheRepository$put$1 = new ScootersOffersCacheRepository$put$1(this, continuationImpl);
        Object obj2 = scootersOffersCacheRepository$put$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOffersCacheRepository$put$1.label;
        if (i != 0) {
        }
    }
}
