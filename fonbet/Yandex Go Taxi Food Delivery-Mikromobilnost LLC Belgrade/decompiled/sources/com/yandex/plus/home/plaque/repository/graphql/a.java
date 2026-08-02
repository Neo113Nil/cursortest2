package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.home.plaque.repository.api.PlaqueClientSupportedFeatures;
import com.yandex.plus.log.api.LogPriority;
import defpackage.aqc0;
import defpackage.b5d0;
import defpackage.b64;
import defpackage.bqc0;
import defpackage.bvf0;
import defpackage.c3j0;
import defpackage.cqc0;
import defpackage.eo2;
import defpackage.f3j0;
import defpackage.ffx;
import defpackage.hvu;
import defpackage.jse;
import defpackage.klc0;
import defpackage.l0k;
import defpackage.lj;
import defpackage.llc0;
import defpackage.lqc0;
import defpackage.n1k0;
import defpackage.n270;
import defpackage.ny61;
import defpackage.o1k0;
import defpackage.pax0;
import defpackage.pgz;
import defpackage.plc0;
import defpackage.qje;
import defpackage.qo2;
import defpackage.rlc0;
import defpackage.rog;
import defpackage.scc;
import defpackage.ssc0;
import defpackage.t5o;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uoc0;
import defpackage.vo2;
import defpackage.y5e;
import defpackage.yf70;
import defpackage.zcx;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a implements lqc0 {
    public final qo2 a;
    public final com.yandex.plus.core.graphql.target.a b;
    public final ArrayList c;
    public final com.yandex.plus.home.plaque.plugin.internal.defaults.b d;
    public final rog e;
    public final rog f;
    public final tls g;
    public final int h;
    public final rog i;
    public final rog j;
    public final rog k;
    public final rog l;
    public final o1k0 m;
    public final pgz n;
    public final jse o;
    public final n0 p;
    public final r0 q;
    public final r0 r;
    public final rlc0 s;
    public final b t;

    public a(qo2 qo2Var, com.yandex.plus.core.graphql.target.a aVar, ArrayList arrayList, com.yandex.plus.plaquesdk.widget.a aVar2, b5d0 b5d0Var, com.yandex.plus.home.plaque.plugin.internal.defaults.b bVar, rog rogVar, rog rogVar2, tls tlsVar, int i, rog rogVar3, rog rogVar4, rog rogVar5, rog rogVar6, o1k0 o1k0Var, pgz pgzVar, tse tseVar, jse jseVar) {
        this.a = qo2Var;
        this.b = aVar;
        this.c = arrayList;
        this.d = bVar;
        this.e = rogVar;
        this.f = rogVar2;
        this.g = tlsVar;
        this.h = i;
        this.i = rogVar3;
        this.j = rogVar4;
        this.k = rogVar5;
        this.l = rogVar6;
        this.m = o1k0Var;
        this.n = pgzVar;
        this.o = jseVar;
        n0 c = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
        c.g(null);
        this.p = c;
        this.q = bvf0.c(kotlin.collections.b.f());
        this.r = bvf0.c(Boolean.FALSE);
        this.s = new rlc0();
        this.t = new b(aVar2, b5d0Var, jseVar, new l0k(), new ssc0(), pgzVar, tseVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(a aVar, ContinuationImpl continuationImpl) {
        GraphQLPlaqueRepository$createKey$1 graphQLPlaqueRepository$createKey$1;
        int i;
        Long l;
        boolean z;
        aVar.getClass();
        if (continuationImpl instanceof GraphQLPlaqueRepository$createKey$1) {
            graphQLPlaqueRepository$createKey$1 = (GraphQLPlaqueRepository$createKey$1) continuationImpl;
            int i2 = graphQLPlaqueRepository$createKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLPlaqueRepository$createKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLPlaqueRepository$createKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLPlaqueRepository$createKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Long id = ((lj) aVar.f.invoke()).getId();
                    boolean booleanValue = ((Boolean) aVar.e.invoke()).booleanValue();
                    tls tlsVar = aVar.g;
                    graphQLPlaqueRepository$createKey$1.L$0 = id;
                    graphQLPlaqueRepository$createKey$1.Z$0 = booleanValue;
                    graphQLPlaqueRepository$createKey$1.label = 1;
                    Object invoke = tlsVar.invoke(graphQLPlaqueRepository$createKey$1);
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
                    z = graphQLPlaqueRepository$createKey$1.Z$0;
                    l = (Long) graphQLPlaqueRepository$createKey$1.L$0;
                    kotlin.b.b(obj);
                }
                return new llc0(l, (String) obj, z);
            }
        }
        graphQLPlaqueRepository$createKey$1 = new GraphQLPlaqueRepository$createKey$1(aVar, continuationImpl);
        Object obj2 = graphQLPlaqueRepository$createKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLPlaqueRepository$createKey$1.label;
        if (i != 0) {
        }
        return new llc0(l, (String) obj2, z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|8|(1:(1:(13:12|13|14|15|16|(1:18)|19|(1:21)|22|(2:24|(3:26|(1:28)|29)(1:35))(1:36)|30|(1:32)|33)(2:45|46))(1:47))(1:70)|48|(1:50)|51|52|53|54|(11:57|15|16|(0)|19|(0)|22|(0)(0)|30|(0)|33)|56))|75|6|7|8|(0)(0)|48|(0)|51|52|53|54|(0)|56|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        r12 = r0;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bd, code lost:
    
        r12 = r0;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c8, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cf, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0079, code lost:
    
        if (r14 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(a aVar, String str, eo2 eo2Var, ContinuationImpl continuationImpl) {
        GraphQLPlaqueRepository$requestPerformAction$1 graphQLPlaqueRepository$requestPerformAction$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        LogPriority logPriority;
        eo2 eo2Var2;
        Throwable a;
        Object failure;
        LogPriority logPriority2;
        pgz pgzVar = aVar.n;
        try {
            if (continuationImpl instanceof GraphQLPlaqueRepository$requestPerformAction$1) {
                graphQLPlaqueRepository$requestPerformAction$1 = (GraphQLPlaqueRepository$requestPerformAction$1) continuationImpl;
                int i2 = graphQLPlaqueRepository$requestPerformAction$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    graphQLPlaqueRepository$requestPerformAction$1.label = i2 - Integer.MIN_VALUE;
                    GraphQLPlaqueRepository$requestPerformAction$1 graphQLPlaqueRepository$requestPerformAction$12 = graphQLPlaqueRepository$requestPerformAction$1;
                    obj = graphQLPlaqueRepository$requestPerformAction$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = graphQLPlaqueRepository$requestPerformAction$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.plus.core.graphql.target.a aVar2 = aVar.b;
                        graphQLPlaqueRepository$requestPerformAction$12.L$0 = str;
                        graphQLPlaqueRepository$requestPerformAction$12.L$1 = eo2Var;
                        graphQLPlaqueRepository$requestPerformAction$12.label = 1;
                        obj = com.yandex.plus.core.graphql.target.a.b(aVar2, null, null, null, graphQLPlaqueRepository$requestPerformAction$12, 12);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eo2Var2 = (eo2) graphQLPlaqueRepository$requestPerformAction$12.L$1;
                            try {
                                kotlin.b.b(obj);
                            } catch (TimeoutCancellationException e) {
                                TimeoutCancellationException timeoutCancellationException = e;
                                obj = new Result.Failure(timeoutCancellationException);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                logPriority2 = LogPriority.VERBOSE;
                                if (pgzVar.e(logPriority2)) {
                                }
                                return failure;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                obj = new Result.Failure(th2);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                logPriority2 = LogPriority.VERBOSE;
                                if (pgzVar.e(logPriority2)) {
                                }
                                return failure;
                            }
                            if (!(obj instanceof Result.Failure)) {
                                eo2.a(eo2Var2);
                            }
                            if (Result.a(obj) != null) {
                                ((n270) eo2Var2).b();
                            }
                            a = Result.a(obj);
                            if (a != null) {
                                t5o s = y5e.s((vo2) obj);
                                if (s != null) {
                                    LogPriority logPriority3 = LogPriority.ERROR;
                                    if (pgzVar.e(logPriority3)) {
                                        pgzVar.a(logPriority3, "GraphQLPlaqueRepository", "performAction mutation was failed! " + s);
                                    }
                                    failure = new Result.Failure(com.yandex.plus.core.graphql.internal.a.e(s));
                                } else {
                                    failure = zy11.a;
                                }
                            } else {
                                failure = new Result.Failure(a);
                            }
                            logPriority2 = LogPriority.VERBOSE;
                            if (pgzVar.e(logPriority2)) {
                                pgzVar.a(logPriority2, "GraphQLPlaqueRepository", "requestPerformAction() response=" + ((Object) Result.c(failure)));
                            }
                            return failure;
                        }
                        eo2Var = (eo2) graphQLPlaqueRepository$requestPerformAction$12.L$1;
                        str = (String) graphQLPlaqueRepository$requestPerformAction$12.L$0;
                        kotlin.b.b(obj);
                    }
                    pax0 pax0Var = (pax0) obj;
                    logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "GraphQLPlaqueRepository", "requestPerformAction() ".concat(qje.b0(pax0Var)));
                    }
                    n270 n270Var = (n270) eo2Var;
                    n270Var.c();
                    qo2 qo2Var = aVar.a;
                    uoc0 uoc0Var = new uoc0(pax0Var, str);
                    graphQLPlaqueRepository$requestPerformAction$12.L$0 = null;
                    graphQLPlaqueRepository$requestPerformAction$12.L$1 = n270Var;
                    graphQLPlaqueRepository$requestPerformAction$12.L$2 = null;
                    graphQLPlaqueRepository$requestPerformAction$12.L$3 = null;
                    graphQLPlaqueRepository$requestPerformAction$12.L$4 = null;
                    graphQLPlaqueRepository$requestPerformAction$12.L$5 = null;
                    graphQLPlaqueRepository$requestPerformAction$12.I$0 = 0;
                    graphQLPlaqueRepository$requestPerformAction$12.I$1 = 0;
                    graphQLPlaqueRepository$requestPerformAction$12.label = 2;
                    obj = com.yandex.plus.core.graphql.internal.a.a(qo2Var, uoc0Var, graphQLPlaqueRepository$requestPerformAction$12);
                    if (obj != coroutineSingletons) {
                        eo2Var2 = n270Var;
                        if (!(obj instanceof Result.Failure)) {
                        }
                        if (Result.a(obj) != null) {
                        }
                        a = Result.a(obj);
                        if (a != null) {
                        }
                        logPriority2 = LogPriority.VERBOSE;
                        if (pgzVar.e(logPriority2)) {
                        }
                        return failure;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            pax0 pax0Var2 = (pax0) obj;
            logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
            }
            n270 n270Var2 = (n270) eo2Var;
            n270Var2.c();
            qo2 qo2Var2 = aVar.a;
            uoc0 uoc0Var2 = new uoc0(pax0Var2, str);
            graphQLPlaqueRepository$requestPerformAction$12.L$0 = null;
            graphQLPlaqueRepository$requestPerformAction$12.L$1 = n270Var2;
            graphQLPlaqueRepository$requestPerformAction$12.L$2 = null;
            graphQLPlaqueRepository$requestPerformAction$12.L$3 = null;
            graphQLPlaqueRepository$requestPerformAction$12.L$4 = null;
            graphQLPlaqueRepository$requestPerformAction$12.L$5 = null;
            graphQLPlaqueRepository$requestPerformAction$12.I$0 = 0;
            graphQLPlaqueRepository$requestPerformAction$12.I$1 = 0;
            graphQLPlaqueRepository$requestPerformAction$12.label = 2;
            obj = com.yandex.plus.core.graphql.internal.a.a(qo2Var2, uoc0Var2, graphQLPlaqueRepository$requestPerformAction$12);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e2) {
            throw e2;
        }
        graphQLPlaqueRepository$requestPerformAction$1 = new GraphQLPlaqueRepository$requestPerformAction$1(aVar, continuationImpl);
        GraphQLPlaqueRepository$requestPerformAction$1 graphQLPlaqueRepository$requestPerformAction$122 = graphQLPlaqueRepository$requestPerformAction$1;
        obj = graphQLPlaqueRepository$requestPerformAction$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLPlaqueRepository$requestPerformAction$122.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|8|(1:(1:(12:12|13|14|15|16|(1:18)|19|(1:21)|22|(4:24|(1:26)|27|(2:31|(1:33)))(2:37|(1:39))|34|35)(2:48|49))(1:50))(1:65)|51|(1:53)|54|55|56|(10:59|15|16|(0)|19|(0)|22|(0)(0)|34|35)|58))|70|6|7|8|(0)(0)|51|(0)|54|55|56|(0)|58|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        r12 = r0;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
    
        r12 = r0;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x007d, code lost:
    
        if (r14 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(a aVar, String str, eo2 eo2Var, ContinuationImpl continuationImpl) {
        GraphQLPlaqueRepository$requestPlaqueClicked$1 graphQLPlaqueRepository$requestPlaqueClicked$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        LogPriority logPriority;
        eo2 eo2Var2;
        Throwable a;
        pgz pgzVar = aVar.n;
        try {
            if (continuationImpl instanceof GraphQLPlaqueRepository$requestPlaqueClicked$1) {
                graphQLPlaqueRepository$requestPlaqueClicked$1 = (GraphQLPlaqueRepository$requestPlaqueClicked$1) continuationImpl;
                int i2 = graphQLPlaqueRepository$requestPlaqueClicked$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    graphQLPlaqueRepository$requestPlaqueClicked$1.label = i2 - Integer.MIN_VALUE;
                    GraphQLPlaqueRepository$requestPlaqueClicked$1 graphQLPlaqueRepository$requestPlaqueClicked$12 = graphQLPlaqueRepository$requestPlaqueClicked$1;
                    obj = graphQLPlaqueRepository$requestPlaqueClicked$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = graphQLPlaqueRepository$requestPlaqueClicked$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.plus.core.graphql.target.a aVar2 = aVar.b;
                        graphQLPlaqueRepository$requestPlaqueClicked$12.L$0 = str;
                        graphQLPlaqueRepository$requestPlaqueClicked$12.L$1 = eo2Var;
                        graphQLPlaqueRepository$requestPlaqueClicked$12.label = 1;
                        obj = com.yandex.plus.core.graphql.target.a.b(aVar2, null, null, null, graphQLPlaqueRepository$requestPlaqueClicked$12, 12);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eo2Var2 = (eo2) graphQLPlaqueRepository$requestPlaqueClicked$12.L$1;
                            try {
                                kotlin.b.b(obj);
                            } catch (TimeoutCancellationException e) {
                                TimeoutCancellationException timeoutCancellationException = e;
                                obj = new Result.Failure(timeoutCancellationException);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return zy11.a;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                obj = new Result.Failure(th2);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return zy11.a;
                            }
                            if (!(obj instanceof Result.Failure)) {
                                eo2.a(eo2Var2);
                            }
                            if (Result.a(obj) != null) {
                                ((n270) eo2Var2).b();
                            }
                            a = Result.a(obj);
                            if (a != null) {
                                vo2 vo2Var = (vo2) obj;
                                LogPriority logPriority2 = LogPriority.VERBOSE;
                                if (pgzVar.e(logPriority2)) {
                                    pgzVar.a(logPriority2, "GraphQLPlaqueRepository", "requestPlaqueClicked() response=" + vo2Var);
                                }
                                List list = vo2Var.d;
                                if (list != null && !list.isEmpty()) {
                                    LogPriority logPriority3 = LogPriority.ERROR;
                                    if (pgzVar.e(logPriority3)) {
                                        pgzVar.a(logPriority3, "GraphQLPlaqueRepository", "plaqueClicked mutation was failed! " + vo2Var.d);
                                    }
                                }
                            } else {
                                LogPriority logPriority4 = LogPriority.ERROR;
                                if (pgzVar.e(logPriority4)) {
                                    pgzVar.b(logPriority4, "GraphQLPlaqueRepository", "error report plaqueClicked", a);
                                }
                            }
                            return zy11.a;
                        }
                        eo2Var = (eo2) graphQLPlaqueRepository$requestPlaqueClicked$12.L$1;
                        str = (String) graphQLPlaqueRepository$requestPlaqueClicked$12.L$0;
                        kotlin.b.b(obj);
                    }
                    pax0 pax0Var = (pax0) obj;
                    logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "GraphQLPlaqueRepository", "requestPlaqueClicked() " + qje.b0(pax0Var) + ", plaqueId=" + str);
                    }
                    c3j0 c3j0Var = new c3j0(pax0Var, str);
                    jse jseVar = aVar.o;
                    GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1 graphQLPlaqueRepository$requestPlaqueClicked$response$1$1 = new GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1(eo2Var, aVar, c3j0Var, null);
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$0 = null;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$1 = eo2Var;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$2 = null;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$3 = null;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$4 = null;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$5 = null;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.L$6 = null;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.I$0 = 0;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.I$1 = 0;
                    graphQLPlaqueRepository$requestPlaqueClicked$12.label = 2;
                    obj = tje.k0(jseVar, graphQLPlaqueRepository$requestPlaqueClicked$response$1$1, graphQLPlaqueRepository$requestPlaqueClicked$12);
                    if (obj != coroutineSingletons) {
                        eo2Var2 = eo2Var;
                        if (!(obj instanceof Result.Failure)) {
                        }
                        if (Result.a(obj) != null) {
                        }
                        a = Result.a(obj);
                        if (a != null) {
                        }
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            pax0 pax0Var2 = (pax0) obj;
            logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
            }
            c3j0 c3j0Var2 = new c3j0(pax0Var2, str);
            jse jseVar2 = aVar.o;
            GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1 graphQLPlaqueRepository$requestPlaqueClicked$response$1$12 = new GraphQLPlaqueRepository$requestPlaqueClicked$response$1$1(eo2Var, aVar, c3j0Var2, null);
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$0 = null;
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$1 = eo2Var;
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$2 = null;
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$3 = null;
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$4 = null;
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$5 = null;
            graphQLPlaqueRepository$requestPlaqueClicked$12.L$6 = null;
            graphQLPlaqueRepository$requestPlaqueClicked$12.I$0 = 0;
            graphQLPlaqueRepository$requestPlaqueClicked$12.I$1 = 0;
            graphQLPlaqueRepository$requestPlaqueClicked$12.label = 2;
            obj = tje.k0(jseVar2, graphQLPlaqueRepository$requestPlaqueClicked$response$1$12, graphQLPlaqueRepository$requestPlaqueClicked$12);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e2) {
            throw e2;
        }
        graphQLPlaqueRepository$requestPlaqueClicked$1 = new GraphQLPlaqueRepository$requestPlaqueClicked$1(aVar, continuationImpl);
        GraphQLPlaqueRepository$requestPlaqueClicked$1 graphQLPlaqueRepository$requestPlaqueClicked$122 = graphQLPlaqueRepository$requestPlaqueClicked$1;
        obj = graphQLPlaqueRepository$requestPlaqueClicked$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLPlaqueRepository$requestPlaqueClicked$122.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(7:12|13|14|(1:16)|17|(1:19)|(6:21|22|(2:27|28)|30|(1:34)|(2:36|37)(2:38|39))(1:43))(2:44|45))(1:46))(1:57)|47|(1:49)|50|(1:52)(2:55|56)))|68|6|7|8|(0)(0)|47|(0)|50|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0123, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0078, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
    
        r14 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        r14 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0134, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1 A[Catch: all -> 0x0048, TimeoutCancellationException -> 0x004c, CancellationException -> 0x0132, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0043, B:50:0x00a7, B:52:0x00d1, B:55:0x0124, B:56:0x012b), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124 A[Catch: all -> 0x0048, TimeoutCancellationException -> 0x004c, CancellationException -> 0x0132, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0043, B:50:0x00a7, B:52:0x00d1, B:55:0x0124, B:56:0x012b), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(a aVar, com.yandex.plus.home.benchmark.a aVar2, int i, int i2, ContinuationImpl continuationImpl) {
        GraphQLPlaqueRepository$requestPlaqueDefinitions$1 graphQLPlaqueRepository$requestPlaqueDefinitions$1;
        int i3;
        bqc0 bqc0Var;
        pgz pgzVar;
        LogPriority logPriority;
        Iterator it;
        int i4 = aVar.h;
        if (continuationImpl instanceof GraphQLPlaqueRepository$requestPlaqueDefinitions$1) {
            graphQLPlaqueRepository$requestPlaqueDefinitions$1 = (GraphQLPlaqueRepository$requestPlaqueDefinitions$1) continuationImpl;
            int i5 = graphQLPlaqueRepository$requestPlaqueDefinitions$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                graphQLPlaqueRepository$requestPlaqueDefinitions$1.label = i5 - Integer.MIN_VALUE;
                GraphQLPlaqueRepository$requestPlaqueDefinitions$1 graphQLPlaqueRepository$requestPlaqueDefinitions$12 = graphQLPlaqueRepository$requestPlaqueDefinitions$1;
                Object obj = graphQLPlaqueRepository$requestPlaqueDefinitions$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = graphQLPlaqueRepository$requestPlaqueDefinitions$12.label;
                klc0 klc0Var = null;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.core.graphql.target.a aVar3 = aVar.b;
                    graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$0 = aVar2;
                    graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$0 = i;
                    graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$1 = i2;
                    graphQLPlaqueRepository$requestPlaqueDefinitions$12.label = 1;
                    obj = com.yandex.plus.core.graphql.target.a.b(aVar3, null, null, null, graphQLPlaqueRepository$requestPlaqueDefinitions$12, 12);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar2 = (com.yandex.plus.home.benchmark.a) graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$0;
                        kotlin.b.b(obj);
                        boolean z = obj instanceof Result.Failure;
                        if (!z) {
                            aVar2.a();
                        }
                        if (Result.a(obj) != null) {
                            aVar2.b();
                        }
                        if (z) {
                            return obj;
                        }
                        try {
                            vo2 vo2Var = (vo2) obj;
                            List list = vo2Var.d;
                            if (list != null && !list.isEmpty()) {
                                throw new IllegalStateException(("Backend errors: " + vo2Var.d).toString());
                            }
                            aqc0 aqc0Var = (aqc0) vo2Var.c;
                            if (aqc0Var != null && (bqc0Var = aqc0Var.a) != null) {
                                klc0Var = bqc0Var.b;
                            }
                            if (klc0Var == null) {
                                throw new IllegalStateException("Plaques are absent");
                            }
                            aVar2.e();
                            aVar.s.getClass();
                            plc0 b = rlc0.b(klc0Var);
                            aVar2.d();
                            return b;
                        } catch (Throwable th) {
                            return new Result.Failure(th);
                        }
                    }
                    i2 = graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$1;
                    i = graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$0;
                    aVar2 = (com.yandex.plus.home.benchmark.a) graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$0;
                    kotlin.b.b(obj);
                }
                pax0 pax0Var = (pax0) obj;
                pgzVar = aVar.n;
                logPriority = LogPriority.DEBUG;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "GraphQLPlaqueRepository", "requestPlaqueConfiguration() " + qje.b0(pax0Var) + ", sizeHint=" + i4);
                }
                aVar2.c();
                yf70 c0 = qje.c0(scc.h(PlaqueClientSupportedFeatures.BACKEND_ACTION_PERFORM.getValue()));
                qo2 qo2Var = aVar.a;
                ArrayList arrayList = aVar.c;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                if (!it.hasNext()) {
                    b64.D(it.next());
                    throw null;
                }
                cqc0 cqc0Var = new cqc0(c0, qje.c0(arrayList2), qje.c0(new Integer(i4)), pax0Var);
                zcx zcxVar = aVar.m.a;
                n1k0 n1k0Var = new n1k0(i, i2);
                zcxVar.getClass();
                List singletonList = Collections.singletonList(new hvu("X-Plus-Retry-Context", zcxVar.c(n1k0Var, n1k0.Companion.serializer())));
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$0 = aVar2;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$1 = null;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$2 = null;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$3 = null;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$4 = null;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.L$5 = null;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$0 = i;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$1 = i2;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$2 = 0;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.I$3 = 0;
                graphQLPlaqueRepository$requestPlaqueDefinitions$12.label = 2;
                obj = com.yandex.plus.core.graphql.internal.a.c(qo2Var, cqc0Var, singletonList, graphQLPlaqueRepository$requestPlaqueDefinitions$12);
            }
        }
        graphQLPlaqueRepository$requestPlaqueDefinitions$1 = new GraphQLPlaqueRepository$requestPlaqueDefinitions$1(aVar, continuationImpl);
        GraphQLPlaqueRepository$requestPlaqueDefinitions$1 graphQLPlaqueRepository$requestPlaqueDefinitions$122 = graphQLPlaqueRepository$requestPlaqueDefinitions$1;
        Object obj2 = graphQLPlaqueRepository$requestPlaqueDefinitions$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = graphQLPlaqueRepository$requestPlaqueDefinitions$122.label;
        klc0 klc0Var2 = null;
        if (i3 != 0) {
        }
        pax0 pax0Var2 = (pax0) obj2;
        pgzVar = aVar.n;
        logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
        }
        aVar2.c();
        yf70 c02 = qje.c0(scc.h(PlaqueClientSupportedFeatures.BACKEND_ACTION_PERFORM.getValue()));
        qo2 qo2Var2 = aVar.a;
        ArrayList arrayList3 = aVar.c;
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
        it = arrayList3.iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|8|(1:(1:(12:12|13|14|15|16|(1:18)|19|(1:21)|22|(4:24|(1:26)|27|(2:31|(1:33)))(2:37|(1:39))|34|35)(2:48|49))(1:50))(1:73)|51|(1:53)|54|55|57|58|(10:61|15|16|(0)|19|(0)|22|(0)(0)|34|35)|60))|78|6|7|8|(0)(0)|51|(0)|54|55|57|58|(0)|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        r12 = r0;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e6, code lost:
    
        r12 = r0;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f8, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0084, code lost:
    
        if (r15 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(a aVar, String str, String str2, eo2 eo2Var, ContinuationImpl continuationImpl) {
        GraphQLPlaqueRepository$requestPlaqueSeen$1 graphQLPlaqueRepository$requestPlaqueSeen$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        LogPriority logPriority;
        eo2 eo2Var2;
        Throwable a;
        pgz pgzVar = aVar.n;
        try {
            if (continuationImpl instanceof GraphQLPlaqueRepository$requestPlaqueSeen$1) {
                graphQLPlaqueRepository$requestPlaqueSeen$1 = (GraphQLPlaqueRepository$requestPlaqueSeen$1) continuationImpl;
                int i2 = graphQLPlaqueRepository$requestPlaqueSeen$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    graphQLPlaqueRepository$requestPlaqueSeen$1.label = i2 - Integer.MIN_VALUE;
                    GraphQLPlaqueRepository$requestPlaqueSeen$1 graphQLPlaqueRepository$requestPlaqueSeen$12 = graphQLPlaqueRepository$requestPlaqueSeen$1;
                    obj = graphQLPlaqueRepository$requestPlaqueSeen$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = graphQLPlaqueRepository$requestPlaqueSeen$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.plus.core.graphql.target.a aVar2 = aVar.b;
                        graphQLPlaqueRepository$requestPlaqueSeen$12.L$0 = str;
                        graphQLPlaqueRepository$requestPlaqueSeen$12.L$1 = str2;
                        graphQLPlaqueRepository$requestPlaqueSeen$12.L$2 = eo2Var;
                        graphQLPlaqueRepository$requestPlaqueSeen$12.label = 1;
                        obj = com.yandex.plus.core.graphql.target.a.b(aVar2, null, null, null, graphQLPlaqueRepository$requestPlaqueSeen$12, 12);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eo2Var2 = (eo2) graphQLPlaqueRepository$requestPlaqueSeen$12.L$2;
                            try {
                                kotlin.b.b(obj);
                            } catch (TimeoutCancellationException e) {
                                TimeoutCancellationException timeoutCancellationException = e;
                                obj = new Result.Failure(timeoutCancellationException);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return zy11.a;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                obj = new Result.Failure(th2);
                                if (!(obj instanceof Result.Failure)) {
                                }
                                if (Result.a(obj) != null) {
                                }
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return zy11.a;
                            }
                            if (!(obj instanceof Result.Failure)) {
                                eo2.a(eo2Var2);
                            }
                            if (Result.a(obj) != null) {
                                ((n270) eo2Var2).b();
                            }
                            a = Result.a(obj);
                            if (a != null) {
                                vo2 vo2Var = (vo2) obj;
                                LogPriority logPriority2 = LogPriority.VERBOSE;
                                if (pgzVar.e(logPriority2)) {
                                    pgzVar.a(logPriority2, "GraphQLPlaqueRepository", "requestPlaqueSeen() response=" + vo2Var);
                                }
                                List list = vo2Var.d;
                                if (list != null && !list.isEmpty()) {
                                    LogPriority logPriority3 = LogPriority.ERROR;
                                    if (pgzVar.e(logPriority3)) {
                                        pgzVar.a(logPriority3, "GraphQLPlaqueRepository", "plaqueSeen mutation was failed! " + vo2Var.d);
                                    }
                                }
                            } else {
                                LogPriority logPriority4 = LogPriority.ERROR;
                                if (pgzVar.e(logPriority4)) {
                                    pgzVar.b(logPriority4, "GraphQLPlaqueRepository", "error report plaqueSeen", a);
                                }
                            }
                            return zy11.a;
                        }
                        eo2Var = (eo2) graphQLPlaqueRepository$requestPlaqueSeen$12.L$2;
                        str2 = (String) graphQLPlaqueRepository$requestPlaqueSeen$12.L$1;
                        str = (String) graphQLPlaqueRepository$requestPlaqueSeen$12.L$0;
                        kotlin.b.b(obj);
                    }
                    pax0 pax0Var = (pax0) obj;
                    logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "GraphQLPlaqueRepository", "requestPlaqueSeen() " + qje.b0(pax0Var) + ", plaqueId=" + str + ", seenContext=" + str2);
                    }
                    n270 n270Var = (n270) eo2Var;
                    n270Var.c();
                    qo2 qo2Var = aVar.a;
                    f3j0 f3j0Var = new f3j0(pax0Var, str, qje.c0(str2));
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$0 = null;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$1 = null;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$2 = n270Var;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$3 = null;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$4 = null;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$5 = null;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.L$6 = null;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.I$0 = 0;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.I$1 = 0;
                    graphQLPlaqueRepository$requestPlaqueSeen$12.label = 2;
                    obj = com.yandex.plus.core.graphql.internal.a.a(qo2Var, f3j0Var, graphQLPlaqueRepository$requestPlaqueSeen$12);
                    if (obj != coroutineSingletons) {
                        eo2Var2 = n270Var;
                        if (!(obj instanceof Result.Failure)) {
                        }
                        if (Result.a(obj) != null) {
                        }
                        a = Result.a(obj);
                        if (a != null) {
                        }
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            pax0 pax0Var2 = (pax0) obj;
            logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
            }
            n270 n270Var2 = (n270) eo2Var;
            n270Var2.c();
            qo2 qo2Var2 = aVar.a;
            f3j0 f3j0Var2 = new f3j0(pax0Var2, str, qje.c0(str2));
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$0 = null;
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$1 = null;
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$2 = n270Var2;
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$3 = null;
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$4 = null;
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$5 = null;
            graphQLPlaqueRepository$requestPlaqueSeen$12.L$6 = null;
            graphQLPlaqueRepository$requestPlaqueSeen$12.I$0 = 0;
            graphQLPlaqueRepository$requestPlaqueSeen$12.I$1 = 0;
            graphQLPlaqueRepository$requestPlaqueSeen$12.label = 2;
            obj = com.yandex.plus.core.graphql.internal.a.a(qo2Var2, f3j0Var2, graphQLPlaqueRepository$requestPlaqueSeen$12);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e2) {
            throw e2;
        }
        graphQLPlaqueRepository$requestPlaqueSeen$1 = new GraphQLPlaqueRepository$requestPlaqueSeen$1(aVar, continuationImpl);
        GraphQLPlaqueRepository$requestPlaqueSeen$1 graphQLPlaqueRepository$requestPlaqueSeen$122 = graphQLPlaqueRepository$requestPlaqueSeen$1;
        obj = graphQLPlaqueRepository$requestPlaqueSeen$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLPlaqueRepository$requestPlaqueSeen$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.lqc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GraphQLPlaqueRepository$performAction$1 graphQLPlaqueRepository$performAction$1;
        int i;
        if (continuationImpl instanceof GraphQLPlaqueRepository$performAction$1) {
            graphQLPlaqueRepository$performAction$1 = (GraphQLPlaqueRepository$performAction$1) continuationImpl;
            int i2 = graphQLPlaqueRepository$performAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLPlaqueRepository$performAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLPlaqueRepository$performAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLPlaqueRepository$performAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GraphQLPlaqueRepository$performAction$2 graphQLPlaqueRepository$performAction$2 = new GraphQLPlaqueRepository$performAction$2(this, str, null);
                    graphQLPlaqueRepository$performAction$1.L$0 = null;
                    graphQLPlaqueRepository$performAction$1.label = 1;
                    obj = tje.k0(this.o, graphQLPlaqueRepository$performAction$2, graphQLPlaqueRepository$performAction$1);
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
                return ((Result) obj).getValue();
            }
        }
        graphQLPlaqueRepository$performAction$1 = new GraphQLPlaqueRepository$performAction$1(this, continuationImpl);
        Object obj2 = graphQLPlaqueRepository$performAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLPlaqueRepository$performAction$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // defpackage.lqc0
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(this.o, new GraphQLPlaqueRepository$reportPlaqueSeen$2(this, str, str2, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    @Override // defpackage.lqc0
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(this.o, new GraphQLPlaqueRepository$reportPlaqueClicked$2(this, str, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    @Override // defpackage.lqc0
    public final Object d(int i, int i2, ContinuationImpl continuationImpl) {
        return tje.k0(this.o, new GraphQLPlaqueRepository$updatePlaqueConfiguration$2(this, i, i2, null), continuationImpl);
    }

    @Override // defpackage.lqc0
    public final tpr e() {
        return e.F(e.I(e.n(this.p, this.q, this.r, GraphQLPlaqueRepository$plaqueConfigFlow$3.a), new GraphQLPlaqueRepository$plaqueConfigFlow$4(this, null)), this.o);
    }

    @Override // defpackage.lqc0
    public final Object f(Map map, ContinuationImpl continuationImpl) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.n;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "GraphQLPlaqueRepository", "updateTemplates(" + map + ')');
        }
        this.q.l(map);
        return zy11.a;
    }
}
