package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.internal.entities.ChatNamespaces;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.imz;
import defpackage.kse;
import defpackage.naz0;
import defpackage.ny61;
import defpackage.rmi0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.v9s;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e {
    public final kse a;
    public final naz0 b;
    public final b c;
    public final a d;
    public final rmi0 e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final kotlinx.coroutines.sync.a g = gtq0.a();
    public final ArrayList h = new ArrayList();
    public final HashSet i = new HashSet();
    public final HashSet j = new HashSet();

    public e(kse kseVar, naz0 naz0Var, b bVar, a aVar, rmi0 rmi0Var) {
        this.a = kseVar;
        this.b = naz0Var;
        this.c = bVar;
        this.d = aVar;
        this.e = rmi0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r15v10, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, fse fseVar, String str, long j, long j2, ContinuationImpl continuationImpl) {
        ReducedMessageRefresher$doRequestForward$1 reducedMessageRefresher$doRequestForward$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        fse fseVar2;
        g050 g050Var;
        tpr F;
        d dVar;
        eVar.getClass();
        try {
            try {
                try {
                    if (continuationImpl instanceof ReducedMessageRefresher$doRequestForward$1) {
                        reducedMessageRefresher$doRequestForward$1 = (ReducedMessageRefresher$doRequestForward$1) continuationImpl;
                        int i2 = reducedMessageRefresher$doRequestForward$1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            reducedMessageRefresher$doRequestForward$1.label = i2 - Integer.MIN_VALUE;
                            Object obj = reducedMessageRefresher$doRequestForward$1.result;
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = reducedMessageRefresher$doRequestForward$1.label;
                            zy11 zy11Var = zy11.a;
                            if (i != 0) {
                                kotlin.b.b(obj);
                                v9s v9sVar = new v9s(j, j2, str);
                                if (eVar.j.contains(v9sVar)) {
                                    return zy11Var;
                                }
                                eVar.d.b.add(v9sVar);
                                kotlinx.coroutines.sync.a aVar2 = eVar.g;
                                reducedMessageRefresher$doRequestForward$1.L$0 = eVar;
                                reducedMessageRefresher$doRequestForward$1.L$1 = fseVar;
                                reducedMessageRefresher$doRequestForward$1.L$2 = aVar2;
                                reducedMessageRefresher$doRequestForward$1.label = 1;
                                if (aVar2.a(reducedMessageRefresher$doRequestForward$1) != coroutineSingletons) {
                                    aVar = aVar2;
                                    fseVar2 = fseVar;
                                }
                                return coroutineSingletons;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050Var = (g050) reducedMessageRefresher$doRequestForward$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    g050Var.d(null);
                                    return zy11Var;
                                } catch (Throwable th) {
                                    th = th;
                                    g050Var.d(null);
                                    throw th;
                                }
                            }
                            ?? r15 = (g050) reducedMessageRefresher$doRequestForward$1.L$2;
                            fse fseVar3 = (fse) reducedMessageRefresher$doRequestForward$1.L$1;
                            e eVar2 = (e) reducedMessageRefresher$doRequestForward$1.L$0;
                            kotlin.b.b(obj);
                            fseVar2 = fseVar3;
                            aVar = r15;
                            eVar = eVar2;
                            a aVar3 = eVar.d;
                            aVar3.getClass();
                            F = kotlinx.coroutines.flow.e.F(new rol0(new AbstractReducedLoadScheduler$messages$1(aVar3, null)), eVar.a.c);
                            dVar = new d(fseVar2, eVar, 0);
                            reducedMessageRefresher$doRequestForward$1.L$0 = aVar;
                            reducedMessageRefresher$doRequestForward$1.L$1 = null;
                            reducedMessageRefresher$doRequestForward$1.L$2 = null;
                            reducedMessageRefresher$doRequestForward$1.label = 2;
                            if (F.collect(dVar, reducedMessageRefresher$doRequestForward$1) != coroutineSingletons) {
                                g050Var = aVar;
                                g050Var.d(null);
                                return zy11Var;
                            }
                            return coroutineSingletons;
                        }
                    }
                    F = kotlinx.coroutines.flow.e.F(new rol0(new AbstractReducedLoadScheduler$messages$1(aVar3, null)), eVar.a.c);
                    dVar = new d(fseVar2, eVar, 0);
                    reducedMessageRefresher$doRequestForward$1.L$0 = aVar;
                    reducedMessageRefresher$doRequestForward$1.L$1 = null;
                    reducedMessageRefresher$doRequestForward$1.L$2 = null;
                    reducedMessageRefresher$doRequestForward$1.label = 2;
                    if (F.collect(dVar, reducedMessageRefresher$doRequestForward$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var = aVar;
                    g050Var.d(null);
                    throw th;
                }
                aVar3.getClass();
            } catch (Throwable th3) {
                th = th3;
            }
            a aVar32 = eVar.d;
        } catch (Throwable th4) {
            th = th4;
        }
        reducedMessageRefresher$doRequestForward$1 = new ReducedMessageRefresher$doRequestForward$1(eVar, continuationImpl);
        Object obj2 = reducedMessageRefresher$doRequestForward$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reducedMessageRefresher$doRequestForward$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r14v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, fse fseVar, long j, ContinuationImpl continuationImpl) {
        ReducedMessageRefresher$doRequestMessage$1 reducedMessageRefresher$doRequestMessage$1;
        ReducedMessageRefresher$doRequestMessage$1 reducedMessageRefresher$doRequestMessage$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        fse fseVar2;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        tpr F;
        d dVar;
        eVar.getClass();
        try {
            if (continuationImpl instanceof ReducedMessageRefresher$doRequestMessage$1) {
                reducedMessageRefresher$doRequestMessage$1 = (ReducedMessageRefresher$doRequestMessage$1) continuationImpl;
                int i2 = reducedMessageRefresher$doRequestMessage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    reducedMessageRefresher$doRequestMessage$1.label = i2 - Integer.MIN_VALUE;
                    reducedMessageRefresher$doRequestMessage$12 = reducedMessageRefresher$doRequestMessage$1;
                    Object obj = reducedMessageRefresher$doRequestMessage$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = reducedMessageRefresher$doRequestMessage$12.label;
                    int i3 = 1;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (!ChatNamespaces.b(eVar.b.a.b) || eVar.i.contains(new Long(j))) {
                            return zy11Var;
                        }
                        b bVar = eVar.c;
                        if (bVar.b.isEmpty()) {
                            bVar.b = new imz(j, j, false);
                        } else {
                            imz imzVar = bVar.b;
                            if (j > imzVar.b) {
                                imzVar = new imz(bVar.b.a, j, false);
                            } else if (j < imzVar.a) {
                                imzVar = new imz(j, bVar.b.b, false);
                            }
                            bVar.b = imzVar;
                        }
                        kotlinx.coroutines.sync.a aVar2 = eVar.f;
                        reducedMessageRefresher$doRequestMessage$12.L$0 = eVar;
                        reducedMessageRefresher$doRequestMessage$12.L$1 = fseVar;
                        reducedMessageRefresher$doRequestMessage$12.L$2 = aVar2;
                        reducedMessageRefresher$doRequestMessage$12.label = 1;
                        if (aVar2.a(reducedMessageRefresher$doRequestMessage$12) != coroutineSingletons) {
                            fseVar2 = fseVar;
                            aVar = aVar2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) reducedMessageRefresher$doRequestMessage$12.L$0;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11Var;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    ?? r14 = (g050) reducedMessageRefresher$doRequestMessage$12.L$2;
                    fse fseVar3 = (fse) reducedMessageRefresher$doRequestMessage$12.L$1;
                    e eVar2 = (e) reducedMessageRefresher$doRequestMessage$12.L$0;
                    kotlin.b.b(obj);
                    fseVar2 = fseVar3;
                    aVar = r14;
                    eVar = eVar2;
                    b bVar2 = eVar.c;
                    bVar2.getClass();
                    F = kotlinx.coroutines.flow.e.F(new rol0(new AbstractReducedLoadScheduler$messages$1(bVar2, null)), eVar.a.c);
                    dVar = new d(fseVar2, eVar, i3);
                    reducedMessageRefresher$doRequestMessage$12.L$0 = aVar;
                    reducedMessageRefresher$doRequestMessage$12.L$1 = null;
                    reducedMessageRefresher$doRequestMessage$12.L$2 = null;
                    reducedMessageRefresher$doRequestMessage$12.label = 2;
                    if (F.collect(dVar, reducedMessageRefresher$doRequestMessage$12) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            b bVar22 = eVar.c;
            bVar22.getClass();
            F = kotlinx.coroutines.flow.e.F(new rol0(new AbstractReducedLoadScheduler$messages$1(bVar22, null)), eVar.a.c);
            dVar = new d(fseVar2, eVar, i3);
            reducedMessageRefresher$doRequestMessage$12.L$0 = aVar;
            reducedMessageRefresher$doRequestMessage$12.L$1 = null;
            reducedMessageRefresher$doRequestMessage$12.L$2 = null;
            reducedMessageRefresher$doRequestMessage$12.label = 2;
            if (F.collect(dVar, reducedMessageRefresher$doRequestMessage$12) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        reducedMessageRefresher$doRequestMessage$1 = new ReducedMessageRefresher$doRequestMessage$1(eVar, continuationImpl);
        reducedMessageRefresher$doRequestMessage$12 = reducedMessageRefresher$doRequestMessage$1;
        Object obj2 = reducedMessageRefresher$doRequestMessage$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reducedMessageRefresher$doRequestMessage$12.label;
        int i32 = 1;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    public final Object c(String str, long j, long j2, Continuation continuation) {
        return bvf0.n(new ReducedMessageRefresher$requestForward$2(this, str, j, j2, null), continuation);
    }

    public final Object d(long j, Continuation continuation) {
        return bvf0.n(new ReducedMessageRefresher$requestMessage$2(this, j, null), continuation);
    }
}
