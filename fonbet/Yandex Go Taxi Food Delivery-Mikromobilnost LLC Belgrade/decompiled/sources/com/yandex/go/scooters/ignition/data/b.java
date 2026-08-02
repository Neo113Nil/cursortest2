package com.yandex.go.scooters.ignition.data;

import android.os.SystemClock;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.brn0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.ton0;
import defpackage.uon0;
import defpackage.von0;
import defpackage.won0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public static final int e = 8;
    public final brn0 a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public b(brn0 brn0Var) {
        this.a = brn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #1 {all -> 0x007a, blocks: (B:25:0x005d, B:27:0x006a), top: B:24:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$addBeacons$1 scootersIgnitionBeaconsRepository$addBeacons$1;
        int i;
        List list;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        ArrayList arrayList2 = this.c;
        try {
            if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$addBeacons$1) {
                scootersIgnitionBeaconsRepository$addBeacons$1 = (ScootersIgnitionBeaconsRepository$addBeacons$1) continuationImpl;
                int i2 = scootersIgnitionBeaconsRepository$addBeacons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersIgnitionBeaconsRepository$addBeacons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersIgnitionBeaconsRepository$addBeacons$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersIgnitionBeaconsRepository$addBeacons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersIgnitionBeaconsRepository$addBeacons$1.L$0 = arrayList;
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersIgnitionBeaconsRepository$addBeacons$1.L$1 = aVar;
                        scootersIgnitionBeaconsRepository$addBeacons$1.label = 1;
                        if (aVar.a(scootersIgnitionBeaconsRepository$addBeacons$1) != obj2) {
                            list = arrayList;
                            g050Var = aVar;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) scootersIgnitionBeaconsRepository$addBeacons$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var = g050Var2;
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) scootersIgnitionBeaconsRepository$addBeacons$1.L$1;
                    list = (List) scootersIgnitionBeaconsRepository$addBeacons$1.L$0;
                    kotlin.b.b(obj);
                    arrayList2.addAll(list);
                    if (arrayList2.size() > 8192) {
                        scootersIgnitionBeaconsRepository$addBeacons$1.L$0 = null;
                        scootersIgnitionBeaconsRepository$addBeacons$1.L$1 = g050Var;
                        scootersIgnitionBeaconsRepository$addBeacons$1.label = 2;
                        if (g(scootersIgnitionBeaconsRepository$addBeacons$1) != obj2) {
                            g050Var2 = g050Var;
                            g050Var = g050Var2;
                        }
                        return obj2;
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            arrayList2.addAll(list);
            if (arrayList2.size() > 8192) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        scootersIgnitionBeaconsRepository$addBeacons$1 = new ScootersIgnitionBeaconsRepository$addBeacons$1(this, continuationImpl);
        Object obj3 = scootersIgnitionBeaconsRepository$addBeacons$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$addBeacons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x0089, LOOP:0: B:26:0x0074->B:28:0x007a, LOOP_END, TryCatch #1 {all -> 0x0089, blocks: (B:25:0x005f, B:26:0x0074, B:28:0x007a, B:30:0x008e, B:32:0x0099), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {all -> 0x0089, blocks: (B:25:0x005f, B:26:0x0074, B:28:0x007a, B:30:0x008e, B:32:0x0099), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$addIgnoredBeacons$1 scootersIgnitionBeaconsRepository$addIgnoredBeacons$1;
        int i;
        List list;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        Iterator it;
        ArrayList arrayList2 = this.d;
        try {
            if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$addIgnoredBeacons$1) {
                scootersIgnitionBeaconsRepository$addIgnoredBeacons$1 = (ScootersIgnitionBeaconsRepository$addIgnoredBeacons$1) continuationImpl;
                int i2 = scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$0 = arrayList;
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$1 = aVar;
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.label = 1;
                        if (aVar.a(scootersIgnitionBeaconsRepository$addIgnoredBeacons$1) != obj2) {
                            list = arrayList;
                            g050Var = aVar;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var = g050Var2;
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$1;
                    list = (List) scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$0;
                    kotlin.b.b(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    List list2 = list;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new uon0((ton0) it.next(), elapsedRealtime));
                    }
                    arrayList2.addAll(arrayList3);
                    if (arrayList2.size() > 8192) {
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$0 = null;
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.L$1 = g050Var;
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.J$0 = elapsedRealtime;
                        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.label = 2;
                        if (g(scootersIgnitionBeaconsRepository$addIgnoredBeacons$1) != obj2) {
                            g050Var2 = g050Var;
                            g050Var = g050Var2;
                        }
                        return obj2;
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            List list22 = list;
            ArrayList arrayList32 = new ArrayList(tcc.n(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            arrayList2.addAll(arrayList32);
            if (arrayList2.size() > 8192) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        scootersIgnitionBeaconsRepository$addIgnoredBeacons$1 = new ScootersIgnitionBeaconsRepository$addIgnoredBeacons$1(this, continuationImpl);
        Object obj3 = scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$addIgnoredBeacons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$clear$1 scootersIgnitionBeaconsRepository$clear$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$clear$1) {
                scootersIgnitionBeaconsRepository$clear$1 = (ScootersIgnitionBeaconsRepository$clear$1) continuationImpl;
                int i2 = scootersIgnitionBeaconsRepository$clear$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersIgnitionBeaconsRepository$clear$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersIgnitionBeaconsRepository$clear$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersIgnitionBeaconsRepository$clear$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersIgnitionBeaconsRepository$clear$1.L$0 = aVar;
                        scootersIgnitionBeaconsRepository$clear$1.label = 1;
                        if (aVar.a(scootersIgnitionBeaconsRepository$clear$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersIgnitionBeaconsRepository$clear$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.c.clear();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.c.clear();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        scootersIgnitionBeaconsRepository$clear$1 = new ScootersIgnitionBeaconsRepository$clear$1(this, continuationImpl);
        Object obj2 = scootersIgnitionBeaconsRepository$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$clear$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x0068, LOOP:0: B:12:0x0054->B:14:0x005a, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x0043, B:12:0x0054, B:14:0x005a), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1 scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1;
        int i;
        g050 g050Var;
        Iterator it;
        try {
            if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1) {
                scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1 = (ScootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1) continuationImpl;
                int i2 = scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.L$0 = aVar;
                        scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.label = 1;
                        if (aVar.a(scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.L$0;
                        kotlin.b.b(obj);
                    }
                    ArrayList arrayList = this.d;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((uon0) it.next()).a());
                    }
                    return arrayList2;
                }
            }
            ArrayList arrayList3 = this.d;
            ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
            return arrayList22;
        } finally {
            g050Var.d(null);
        }
        scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1 = new ScootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1(this, continuationImpl);
        Object obj2 = scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$dumpIgnoredBeacons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$dumpReceivedBeacons$1 scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$dumpReceivedBeacons$1) {
                scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1 = (ScootersIgnitionBeaconsRepository$dumpReceivedBeacons$1) continuationImpl;
                int i2 = scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.L$0 = aVar;
                        scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.label = 1;
                        if (aVar.a(scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return kotlin.collections.a.J0(this.c);
                }
            }
            return kotlin.collections.a.J0(this.c);
        } finally {
            g050Var.d(null);
        }
        scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1 = new ScootersIgnitionBeaconsRepository$dumpReceivedBeacons$1(this, continuationImpl);
        Object obj2 = scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$dumpReceivedBeacons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r7.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.go.scooters.ignition.data.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$getValidBeacons$1 scootersIgnitionBeaconsRepository$getValidBeacons$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$getValidBeacons$1) {
                scootersIgnitionBeaconsRepository$getValidBeacons$1 = (ScootersIgnitionBeaconsRepository$getValidBeacons$1) continuationImpl;
                int i2 = scootersIgnitionBeaconsRepository$getValidBeacons$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersIgnitionBeaconsRepository$getValidBeacons$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersIgnitionBeaconsRepository$getValidBeacons$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersIgnitionBeaconsRepository$getValidBeacons$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.b;
                        scootersIgnitionBeaconsRepository$getValidBeacons$1.L$0 = aVar;
                        scootersIgnitionBeaconsRepository$getValidBeacons$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) scootersIgnitionBeaconsRepository$getValidBeacons$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                List J0 = kotlin.collections.a.J0(this.c);
                                g050Var.d(null);
                                return J0;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) scootersIgnitionBeaconsRepository$getValidBeacons$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    scootersIgnitionBeaconsRepository$getValidBeacons$1.L$0 = aVar;
                    scootersIgnitionBeaconsRepository$getValidBeacons$1.label = 2;
                    if (g(scootersIgnitionBeaconsRepository$getValidBeacons$1) != coroutineSingletons) {
                        g050Var = aVar;
                        List J02 = kotlin.collections.a.J0(this.c);
                        g050Var.d(null);
                        return J02;
                    }
                    return coroutineSingletons;
                }
            }
            scootersIgnitionBeaconsRepository$getValidBeacons$1.L$0 = aVar;
            scootersIgnitionBeaconsRepository$getValidBeacons$1.label = 2;
            if (g(scootersIgnitionBeaconsRepository$getValidBeacons$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        scootersIgnitionBeaconsRepository$getValidBeacons$1 = new ScootersIgnitionBeaconsRepository$getValidBeacons$1(this, continuationImpl);
        Object obj2 = scootersIgnitionBeaconsRepository$getValidBeacons$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$getValidBeacons$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersIgnitionBeaconsRepository$updateBeacons$1 scootersIgnitionBeaconsRepository$updateBeacons$1;
        int i;
        Iterator it;
        Iterator it2;
        Iterator it3;
        if (continuationImpl instanceof ScootersIgnitionBeaconsRepository$updateBeacons$1) {
            scootersIgnitionBeaconsRepository$updateBeacons$1 = (ScootersIgnitionBeaconsRepository$updateBeacons$1) continuationImpl;
            int i2 = scootersIgnitionBeaconsRepository$updateBeacons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionBeaconsRepository$updateBeacons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionBeaconsRepository$updateBeacons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionBeaconsRepository$updateBeacons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionBeaconsRepository$updateBeacons$1.label = 1;
                    obj = this.a.a.b(scootersIgnitionBeaconsRepository$updateBeacons$1);
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
                ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) obj;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - scootersIgnitionExperiment.h;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.d;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((uon0) next).b() >= j) {
                        arrayList.add(next);
                    }
                }
                List I = kotlin.collections.a.I(kotlin.collections.a.x0(arrayList, new von0()));
                arrayList2.clear();
                arrayList2.addAll(I);
                long j2 = elapsedRealtime - scootersIgnitionExperiment.f;
                int i3 = scootersIgnitionExperiment.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.c;
                it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    ton0 ton0Var = (ton0) next2;
                    if (ton0Var.c() >= j2 && ton0Var.d() >= i3) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    ton0 ton0Var2 = (ton0) next3;
                    List list = I;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (jl40.l(((uon0) it4.next()).a(), ton0Var2)) {
                                break;
                            }
                        }
                    }
                    arrayList5.add(next3);
                }
                List I2 = kotlin.collections.a.I(kotlin.collections.a.x0(arrayList5, new won0()));
                arrayList4.clear();
                arrayList4.addAll(I2);
                return zy11.a;
            }
        }
        scootersIgnitionBeaconsRepository$updateBeacons$1 = new ScootersIgnitionBeaconsRepository$updateBeacons$1(this, continuationImpl);
        Object obj2 = scootersIgnitionBeaconsRepository$updateBeacons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionBeaconsRepository$updateBeacons$1.label;
        if (i != 0) {
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment2 = (ScootersIgnitionExperiment) obj2;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime2 - scootersIgnitionExperiment2.h;
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList22 = this.d;
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        List I3 = kotlin.collections.a.I(kotlin.collections.a.x0(arrayList6, new von0()));
        arrayList22.clear();
        arrayList22.addAll(I3);
        long j22 = elapsedRealtime2 - scootersIgnitionExperiment2.f;
        int i32 = scootersIgnitionExperiment2.e;
        ArrayList arrayList32 = new ArrayList();
        ArrayList arrayList42 = this.c;
        it2 = arrayList42.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList();
        it3 = arrayList32.iterator();
        while (it3.hasNext()) {
        }
        List I22 = kotlin.collections.a.I(kotlin.collections.a.x0(arrayList52, new won0()));
        arrayList42.clear();
        arrayList42.addAll(I22);
        return zy11.a;
    }
}
