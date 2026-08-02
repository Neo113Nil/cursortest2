package com.yandex.go.xiva.domain;

import com.yandex.go.xiva.domain.model.XivaConnectionState;
import com.yandex.go.xiva.experiments.XivaEnabledExperiment;
import defpackage.ce51;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.ny61;
import defpackage.p2y0;
import defpackage.pzt0;
import defpackage.re51;
import defpackage.s85;
import defpackage.tje;
import defpackage.tse;
import defpackage.uo91;
import defpackage.v1g0;
import defpackage.xww0;
import defpackage.yd51;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class f {
    public final tse a;
    public final g b;
    public final yd51 c;
    public final p2y0 d;
    public final h3y e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public pzt0 g;
    public pzt0 h;

    public f(tse tseVar, g gVar, yd51 yd51Var, p2y0 p2y0Var, h3y h3yVar) {
        this.a = tseVar;
        this.b = gVar;
        this.c = yd51Var;
        this.d = p2y0Var;
        this.e = h3yVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(9:10|11|12|(1:14)|(3:33|31|32)|16|(2:18|(2:21|(2:23|(1:25)(6:27|12|(0)|(0)|16|(0)))(2:28|29))(5:20|(0)|(0)|16|(0)))|31|32)(2:34|35))(3:36|37|(5:42|16|(0)|31|32)(3:41|31|32))))|47|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        defpackage.jst.e.h("Xiva", "Failed to handle push", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac A[Catch: all -> 0x00bd, CancellationException -> 0x00ca, TryCatch #2 {CancellationException -> 0x00ca, all -> 0x00bd, blocks: (B:11:0x0037, B:12:0x00a0, B:14:0x00ac, B:16:0x0062, B:18:0x0068, B:20:0x0072, B:21:0x007e, B:23:0x0082, B:28:0x00b7, B:29:0x00bc, B:37:0x0044, B:39:0x0050, B:42:0x005b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: all -> 0x00bd, CancellationException -> 0x00ca, TryCatch #2 {CancellationException -> 0x00ca, all -> 0x00bd, blocks: (B:11:0x0037, B:12:0x00a0, B:14:0x00ac, B:16:0x0062, B:18:0x0068, B:20:0x0072, B:21:0x007e, B:23:0x0082, B:28:0x00b7, B:29:0x00bc, B:37:0x0044, B:39:0x0050, B:42:0x005b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:13:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009c -> B:12:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ce51 ce51Var, Continuation continuation) {
        TaxiXivaPushNotificationInteractorImpl$handleXivaPush$1 taxiXivaPushNotificationInteractorImpl$handleXivaPush$1;
        int i;
        Iterator it;
        ce51 ce51Var2;
        fVar.getClass();
        if (continuation instanceof TaxiXivaPushNotificationInteractorImpl$handleXivaPush$1) {
            taxiXivaPushNotificationInteractorImpl$handleXivaPush$1 = (TaxiXivaPushNotificationInteractorImpl$handleXivaPush$1) continuation;
            int i2 = taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Iterable iterable = (Iterable) fVar.e.get();
                    if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                        return zy11.a;
                    }
                    it = iterable.iterator();
                    ce51Var2 = ce51Var;
                    if (it.hasNext()) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s85 s85Var = (s85) taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$4;
                it = (Iterator) taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$2;
                ce51 ce51Var3 = (ce51) taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$0;
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                s85 s85Var2 = s85Var;
                ce51Var2 = ce51Var3;
                boolean a = booleanValue;
                if (a) {
                    hst hstVar = jst.e;
                    Objects.toString(s85Var2);
                    hstVar.getClass();
                }
                if (a) {
                    return zy11.a;
                }
                if (it.hasNext()) {
                    s85Var2 = (s85) it.next();
                    if (s85Var2 instanceof v1g0) {
                        a = ((v1g0) s85Var2).a(ce51Var2.a());
                        if (a) {
                        }
                        if (a) {
                        }
                        if (it.hasNext()) {
                        }
                    } else {
                        if (!(s85Var2 instanceof xww0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Map a2 = ce51Var2.a();
                        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$0 = ce51Var2;
                        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$1 = null;
                        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$2 = it;
                        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$3 = null;
                        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.L$4 = s85Var2;
                        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.label = 1;
                        Object b = ((xww0) s85Var2).b(a2, taxiXivaPushNotificationInteractorImpl$handleXivaPush$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ce51Var3 = ce51Var2;
                        s85Var = s85Var2;
                        obj = b;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        s85 s85Var22 = s85Var;
                        ce51Var2 = ce51Var3;
                        boolean a3 = booleanValue2;
                        if (a3) {
                        }
                        if (a3) {
                        }
                        if (it.hasNext()) {
                        }
                    }
                }
                return zy11.a;
            }
        }
        taxiXivaPushNotificationInteractorImpl$handleXivaPush$1 = new TaxiXivaPushNotificationInteractorImpl$handleXivaPush$1(fVar, continuation);
        Object obj2 = taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiXivaPushNotificationInteractorImpl$handleXivaPush$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, boolean z, Continuation continuation) {
        TaxiXivaPushNotificationInteractorImpl$updateXivaConnection$1 taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1;
        int i;
        zy11 zy11Var;
        fVar.getClass();
        if (continuation instanceof TaxiXivaPushNotificationInteractorImpl$updateXivaConnection$1) {
            taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1 = (TaxiXivaPushNotificationInteractorImpl$updateXivaConnection$1) continuation;
            int i2 = taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean c = uo91.c((XivaConnectionState) fVar.b.h.getValue());
                    jst.e.getClass();
                    if ((z && !c) || (!z && c)) {
                        return zy11Var;
                    }
                    yd51 yd51Var = fVar.c;
                    taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.Z$0 = z;
                    taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.Z$1 = c;
                    taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.label = 1;
                    obj = yd51Var.a.b(taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.Z$0;
                    kotlin.b.b(obj);
                }
                boolean z2 = ((XivaEnabledExperiment) obj).b;
                jst.e.getClass();
                if (z || !z2) {
                    fVar.c();
                    return zy11Var;
                }
                pzt0 pzt0Var = fVar.g;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                fVar.g = tje.N(fVar.a, null, null, new TaxiXivaPushNotificationInteractorImpl$connectAndListenXiva$1(fVar, null), 3);
                return zy11Var;
            }
        }
        taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1 = new TaxiXivaPushNotificationInteractorImpl$updateXivaConnection$1(fVar, continuation);
        Object obj2 = taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiXivaPushNotificationInteractorImpl$updateXivaConnection$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        boolean z22 = ((XivaEnabledExperiment) obj2).b;
        jst.e.getClass();
        if (z) {
        }
        fVar.c();
        return zy11Var;
    }

    public final void c() {
        g gVar = this.b;
        if (uo91.c((XivaConnectionState) gVar.h.getValue())) {
            return;
        }
        if (gVar.f == null) {
            jst.e.d("Xiva", "Web socket is already disconnected. Check connection state");
        } else {
            jst.e.o("Xiva", "Disconnecting");
            re51 re51Var = gVar.f;
            if (re51Var != null) {
                re51Var.i();
            }
        }
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = null;
    }

    public final void d() {
        tje.N(this.a, null, null, new TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1(this, null), 3);
    }

    public final void e() {
        tje.N(this.a, null, null, new TaxiXivaPushNotificationInteractorImpl$stopListeningForTaxiOrderState$1(this, null), 3);
    }
}
