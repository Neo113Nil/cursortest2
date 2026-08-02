package com.yandex.plus.experiments.impl.providers;

import com.yandex.plus.log.api.LogPriority;
import defpackage.bvf0;
import defpackage.fro;
import defpackage.fsn;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.j5d0;
import defpackage.jse;
import defpackage.k2d0;
import defpackage.k5d0;
import defpackage.l2d0;
import defpackage.l5d0;
import defpackage.mth;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.q1d0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.zhf;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final ike a;
    public final jse b;
    public final zhf c;
    public final fro d;
    public final l2d0 e;
    public final com.yandex.plus.experiments.api.cache.a f;
    public final com.yandex.plus.experiments.api.cooldown.a g;
    public final pgz h;
    public final i3y i = kotlin.a.a(new fsn(10, this));
    public final kotlinx.coroutines.sync.a j = gtq0.a();
    public final r0 k = bvf0.c(null);
    public qoh l;

    public a(ike ikeVar, jse jseVar, zhf zhfVar, fro froVar, l2d0 l2d0Var, com.yandex.plus.experiments.api.cache.a aVar, com.yandex.plus.experiments.api.cooldown.a aVar2, pgz pgzVar) {
        this.a = ikeVar;
        this.b = jseVar;
        this.c = zhfVar;
        this.d = froVar;
        this.e = l2d0Var;
        this.f = aVar;
        this.g = aVar2;
        this.h = pgzVar;
        tje.N(ikeVar, jseVar, null, new ExperimentsRepository$1(this, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r8 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r8 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ExperimentsRepository$getFallbackExperimentsResult$1 experimentsRepository$getFallbackExperimentsResult$1;
        int i;
        q1d0 q1d0Var;
        com.yandex.plus.experiments.api.cache.a aVar2 = aVar.f;
        if (continuationImpl instanceof ExperimentsRepository$getFallbackExperimentsResult$1) {
            experimentsRepository$getFallbackExperimentsResult$1 = (ExperimentsRepository$getFallbackExperimentsResult$1) continuationImpl;
            int i2 = experimentsRepository$getFallbackExperimentsResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentsRepository$getFallbackExperimentsResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentsRepository$getFallbackExperimentsResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsRepository$getFallbackExperimentsResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    experimentsRepository$getFallbackExperimentsResult$1.label = 1;
                    obj = aVar2.c(experimentsRepository$getFallbackExperimentsResult$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        q1d0Var = (q1d0) obj;
                        Object a = aVar.d.a(q1d0Var);
                        r0 r0Var = aVar.k;
                        j5d0 j5d0Var = new j5d0(a instanceof Result.Failure ? null : a);
                        r0Var.getClass();
                        r0Var.m(null, j5d0Var);
                        return a;
                    }
                    kotlin.b.b(obj);
                }
                q1d0Var = (q1d0) obj;
                if (q1d0Var == null) {
                    experimentsRepository$getFallbackExperimentsResult$1.label = 2;
                    obj = com.yandex.plus.experiments.api.cache.a.b(aVar2, experimentsRepository$getFallbackExperimentsResult$1);
                }
                Object a2 = aVar.d.a(q1d0Var);
                r0 r0Var2 = aVar.k;
                j5d0 j5d0Var2 = new j5d0(a2 instanceof Result.Failure ? null : a2);
                r0Var2.getClass();
                r0Var2.m(null, j5d0Var2);
                return a2;
            }
        }
        experimentsRepository$getFallbackExperimentsResult$1 = new ExperimentsRepository$getFallbackExperimentsResult$1(aVar, continuationImpl);
        Object obj2 = experimentsRepository$getFallbackExperimentsResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsRepository$getFallbackExperimentsResult$1.label;
        if (i != 0) {
        }
        q1d0Var = (q1d0) obj2;
        if (q1d0Var == null) {
        }
        Object a22 = aVar.d.a(q1d0Var);
        r0 r0Var22 = aVar.k;
        j5d0 j5d0Var22 = new j5d0(a22 instanceof Result.Failure ? null : a22);
        r0Var22.getClass();
        r0Var22.m(null, j5d0Var22);
        return a22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r15 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        ExperimentsRepository$getRemoteExperiments$1 experimentsRepository$getRemoteExperiments$1;
        int i;
        Object a;
        k2d0 k2d0Var;
        k2d0 k2d0Var2;
        pgz pgzVar;
        LogPriority logPriority;
        r0 r0Var = aVar.k;
        if (continuationImpl instanceof ExperimentsRepository$getRemoteExperiments$1) {
            experimentsRepository$getRemoteExperiments$1 = (ExperimentsRepository$getRemoteExperiments$1) continuationImpl;
            int i2 = experimentsRepository$getRemoteExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentsRepository$getRemoteExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentsRepository$getRemoteExperiments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsRepository$getRemoteExperiments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0Var.getClass();
                    r0Var.m(null, k5d0.a);
                    l2d0 l2d0Var = aVar.e;
                    experimentsRepository$getRemoteExperiments$1.label = 1;
                    a = l2d0Var.a(experimentsRepository$getRemoteExperiments$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k2d0Var2 = (k2d0) experimentsRepository$getRemoteExperiments$1.L$0;
                        kotlin.b.b(obj);
                        j5d0 j5d0Var = new j5d0(k2d0Var2);
                        r0Var.getClass();
                        r0Var.m(null, j5d0Var);
                        pgzVar = aVar.h;
                        logPriority = LogPriority.INFO;
                        if (pgzVar.e(logPriority)) {
                            pgzVar.a(logPriority, "ExperimentsRepository", "Updated experiments from remote server: " + k2d0Var2);
                        }
                        return k2d0Var2;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                k2d0Var = (k2d0) a;
                if (k2d0Var != null) {
                    return null;
                }
                long a2 = aVar.c.a();
                aVar.d.getClass();
                q1d0 q1d0Var = new q1d0(k2d0Var.a, k2d0Var.b, k2d0Var.c, k2d0Var.d, a2);
                com.yandex.plus.experiments.api.cache.a aVar2 = aVar.f;
                experimentsRepository$getRemoteExperiments$1.L$0 = k2d0Var;
                experimentsRepository$getRemoteExperiments$1.L$1 = null;
                experimentsRepository$getRemoteExperiments$1.I$0 = 0;
                experimentsRepository$getRemoteExperiments$1.J$0 = a2;
                experimentsRepository$getRemoteExperiments$1.label = 2;
                if (aVar2.e(q1d0Var, experimentsRepository$getRemoteExperiments$1) != coroutineSingletons) {
                    k2d0Var2 = k2d0Var;
                    j5d0 j5d0Var2 = new j5d0(k2d0Var2);
                    r0Var.getClass();
                    r0Var.m(null, j5d0Var2);
                    pgzVar = aVar.h;
                    logPriority = LogPriority.INFO;
                    if (pgzVar.e(logPriority)) {
                    }
                    return k2d0Var2;
                }
                return coroutineSingletons;
            }
        }
        experimentsRepository$getRemoteExperiments$1 = new ExperimentsRepository$getRemoteExperiments$1(aVar, continuationImpl);
        Object obj2 = experimentsRepository$getRemoteExperiments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsRepository$getRemoteExperiments$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        k2d0Var = (k2d0) a;
        if (k2d0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, ContinuationImpl continuationImpl) {
        ExperimentsRepository$release$1 experimentsRepository$release$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ExperimentsRepository$release$1) {
            experimentsRepository$release$1 = (ExperimentsRepository$release$1) continuationImpl;
            int i2 = experimentsRepository$release$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentsRepository$release$1.label = i2 - Integer.MIN_VALUE;
                Object obj = experimentsRepository$release$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsRepository$release$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qoh qohVar = aVar.l;
                    if (qohVar != null) {
                        experimentsRepository$release$1.label = 1;
                        if (kotlinx.coroutines.a.f(qohVar, experimentsRepository$release$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                aVar.l = null;
                aVar.k.l(null);
                return zy11.a;
            }
        }
        experimentsRepository$release$1 = new ExperimentsRepository$release$1(aVar, continuationImpl);
        Object obj2 = experimentsRepository$release$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsRepository$release$1.label;
        if (i != 0) {
        }
        aVar.l = null;
        aVar.k.l(null);
        return zy11.a;
    }

    public final Object d(Continuation continuation) {
        Object u0 = tje.N(this.a, this.b, null, new ExperimentsRepository$clearCache$2(this, null), 2).u0(continuation);
        return u0 == CoroutineSingletons.COROUTINE_SUSPENDED ? u0 : zy11.a;
    }

    public final Object e(long j, SuspendLambda suspendLambda) {
        Object u0 = tje.N(this.a, this.b, null, new ExperimentsRepository$clearCacheAndStorage$2(this, j, null), 2).u0(suspendLambda);
        return u0 == CoroutineSingletons.COROUTINE_SUSPENDED ? u0 : zy11.a;
    }

    public final tpr f() {
        ExperimentsRepository$getFlow$1 experimentsRepository$getFlow$1 = new ExperimentsRepository$getFlow$1(this, null);
        ike ikeVar = this.a;
        jse jseVar = this.b;
        tje.N(ikeVar, jseVar, null, experimentsRepository$getFlow$1, 2);
        return e.F(e.t(new mth(this.k, 6)), jseVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ExperimentsRepository$getOrUpdate$1 experimentsRepository$getOrUpdate$1;
        int i;
        try {
            if (continuationImpl instanceof ExperimentsRepository$getOrUpdate$1) {
                experimentsRepository$getOrUpdate$1 = (ExperimentsRepository$getOrUpdate$1) continuationImpl;
                int i2 = experimentsRepository$getOrUpdate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    experimentsRepository$getOrUpdate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = experimentsRepository$getOrUpdate$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = experimentsRepository$getOrUpdate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        experimentsRepository$getOrUpdate$1.label = 1;
                        obj = i(experimentsRepository$getOrUpdate$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                    }
                    noh nohVar = (noh) obj;
                    experimentsRepository$getOrUpdate$1.L$0 = null;
                    experimentsRepository$getOrUpdate$1.L$1 = null;
                    experimentsRepository$getOrUpdate$1.L$2 = null;
                    experimentsRepository$getOrUpdate$1.L$3 = null;
                    experimentsRepository$getOrUpdate$1.I$0 = 0;
                    experimentsRepository$getOrUpdate$1.I$1 = 0;
                    experimentsRepository$getOrUpdate$1.label = 2;
                    Object k = nohVar.k(experimentsRepository$getOrUpdate$1);
                    return k != obj2 ? obj2 : k;
                }
            }
            if (i != 0) {
            }
            noh nohVar2 = (noh) obj;
            experimentsRepository$getOrUpdate$1.L$0 = null;
            experimentsRepository$getOrUpdate$1.L$1 = null;
            experimentsRepository$getOrUpdate$1.L$2 = null;
            experimentsRepository$getOrUpdate$1.L$3 = null;
            experimentsRepository$getOrUpdate$1.I$0 = 0;
            experimentsRepository$getOrUpdate$1.I$1 = 0;
            experimentsRepository$getOrUpdate$1.label = 2;
            Object k2 = nohVar2.k(experimentsRepository$getOrUpdate$1);
            if (k2 != obj2) {
            }
        } catch (TimeoutCancellationException e) {
            return new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        experimentsRepository$getOrUpdate$1 = new ExperimentsRepository$getOrUpdate$1(this, continuationImpl);
        Object obj3 = experimentsRepository$getOrUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsRepository$getOrUpdate$1.label;
    }

    public final Object h() {
        tje.N(this.a, this.b, null, new ExperimentsRepository$getOrUpdateAsync$1(this, null), 2);
        l5d0 l5d0Var = (l5d0) this.k.getValue();
        k2d0 k2d0Var = l5d0Var != null ? (k2d0) l5d0Var.getValue() : null;
        return k2d0Var != null ? k2d0Var : new Result.Failure(new IllegalStateException("No experiments"));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x0046, B:13:0x004a, B:22:0x0057), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        ExperimentsRepository$getOrUpdateExperimentsDeferred$1 experimentsRepository$getOrUpdateExperimentsDeferred$1;
        int i;
        g050 g050Var;
        qoh qohVar;
        try {
            if (continuationImpl instanceof ExperimentsRepository$getOrUpdateExperimentsDeferred$1) {
                experimentsRepository$getOrUpdateExperimentsDeferred$1 = (ExperimentsRepository$getOrUpdateExperimentsDeferred$1) continuationImpl;
                int i2 = experimentsRepository$getOrUpdateExperimentsDeferred$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    experimentsRepository$getOrUpdateExperimentsDeferred$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = experimentsRepository$getOrUpdateExperimentsDeferred$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = experimentsRepository$getOrUpdateExperimentsDeferred$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.j;
                        experimentsRepository$getOrUpdateExperimentsDeferred$1.L$0 = aVar;
                        experimentsRepository$getOrUpdateExperimentsDeferred$1.I$0 = 0;
                        experimentsRepository$getOrUpdateExperimentsDeferred$1.label = 1;
                        if (aVar.a(experimentsRepository$getOrUpdateExperimentsDeferred$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) experimentsRepository$getOrUpdateExperimentsDeferred$1.L$0;
                        kotlin.b.b(obj);
                    }
                    qohVar = this.l;
                    if (qohVar != null) {
                        if (!qohVar.isActive()) {
                            qohVar = null;
                        }
                        if (qohVar != null) {
                            return qohVar;
                        }
                    }
                    qohVar = tje.h(this.a, this.b, null, new ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2(this, null), 2);
                    this.l = qohVar;
                    return qohVar;
                }
            }
            qohVar = this.l;
            if (qohVar != null) {
            }
            qohVar = tje.h(this.a, this.b, null, new ExperimentsRepository$getOrUpdateExperimentsDeferred$2$2(this, null), 2);
            this.l = qohVar;
            return qohVar;
        } finally {
            g050Var.d(null);
        }
        experimentsRepository$getOrUpdateExperimentsDeferred$1 = new ExperimentsRepository$getOrUpdateExperimentsDeferred$1(this, continuationImpl);
        Object obj2 = experimentsRepository$getOrUpdateExperimentsDeferred$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsRepository$getOrUpdateExperimentsDeferred$1.label;
        if (i != 0) {
        }
    }
}
