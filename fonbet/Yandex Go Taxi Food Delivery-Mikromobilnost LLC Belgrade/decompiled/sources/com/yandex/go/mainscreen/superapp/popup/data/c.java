package com.yandex.go.mainscreen.superapp.popup.data;

import android.os.SystemClock;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.d;
import defpackage.a2t;
import defpackage.b2t;
import defpackage.b3w0;
import defpackage.c2t;
import defpackage.c3w0;
import defpackage.ceu0;
import defpackage.d3w0;
import defpackage.e3n;
import defpackage.f2t;
import defpackage.hay0;
import defpackage.i9p;
import defpackage.j9p;
import defpackage.jcw0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.k9p;
import defpackage.kp50;
import defpackage.lcw0;
import defpackage.mcw0;
import defpackage.ncw0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ocw0;
import defpackage.qcw0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tzv0;
import defpackage.ucw0;
import defpackage.uib1;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w1t;
import defpackage.y1t;
import defpackage.z1t;
import defpackage.zy11;
import defpackage.zzv0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.flow.j0;

/* loaded from: classes.dex */
public final class c {
    public final com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c a;
    public final zzv0 b;
    public final qcw0 c;
    public final hay0 d;
    public final ucw0 e;
    public final d f;
    public final tt2 g;

    public c(com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c cVar, zzv0 zzv0Var, qcw0 qcw0Var, hay0 hay0Var, ucw0 ucw0Var, d dVar, tt2 tt2Var) {
        this.a = cVar;
        this.b = zzv0Var;
        this.c = qcw0Var;
        this.d = hay0Var;
        this.e = ucw0Var;
        this.f = dVar;
        this.g = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r10 == r12) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r10 == r12) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ocw0 ocw0Var, Continuation continuation) {
        SuperAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1 superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1;
        Object obj;
        int i;
        boolean z;
        Object e;
        boolean z2;
        boolean z3;
        d dVar = cVar.f;
        if (continuation instanceof SuperAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1) {
            superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1 = (SuperAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1) continuation;
            int i2 = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label = i2 - Integer.MIN_VALUE;
                obj = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(ocw0Var, mcw0.a)) {
                        superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.L$0 = null;
                        superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label = 1;
                        obj = dVar.c(superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        boolean z4 = ((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c;
                        SuperAppFallbackBehaviourExperiment.State state = SuperAppFallbackBehaviourExperiment.State.FAILURE_WITH_TAXI;
                        superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.L$0 = null;
                        superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$0 = z4;
                        superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label = 3;
                        Object e2 = dVar.e(state, superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1);
                        if (e2 != coroutineSingletons) {
                            z = z4;
                            obj = e2;
                            boolean z5 = ((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c;
                            SuperAppFallbackBehaviourExperiment.State state2 = SuperAppFallbackBehaviourExperiment.State.RETRY_WITH_TAXI;
                            superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.L$0 = null;
                            superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$0 = z;
                            superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$1 = z5;
                            superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label = 4;
                            e = dVar.e(state2, superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1);
                            if (e != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$1;
                        z2 = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$0;
                        kotlin.b.b(obj);
                        uib1.c(new tzv0(z2, z3, ((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c));
                        return zy11Var;
                    }
                    z = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$0;
                    kotlin.b.b(obj);
                    boolean z52 = ((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c;
                    SuperAppFallbackBehaviourExperiment.State state22 = SuperAppFallbackBehaviourExperiment.State.RETRY_WITH_TAXI;
                    superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.L$0 = null;
                    superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$0 = z;
                    superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.Z$1 = z52;
                    superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label = 4;
                    e = dVar.e(state22, superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1);
                    if (e != coroutineSingletons) {
                        z2 = z;
                        z3 = z52;
                        obj = e;
                        uib1.c(new tzv0(z2, z3, ((SuperAppFallbackBehaviourExperiment.ElementBehaviour) obj).c));
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    SuperAppFallbackBehaviourExperiment.State state3 = SuperAppFallbackBehaviourExperiment.State.LOADING_WITH_TAXI;
                    superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.L$0 = null;
                    superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label = 2;
                    obj = dVar.e(state3, superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1);
                }
                return zy11Var;
            }
        }
        superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1 = new SuperAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1(cVar, continuation);
        obj = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenPopupRepository$reportSuperAppFallbackBehaviourExperiment$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0233, code lost:
    
        if (r1.emit(r3, r6) != r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x026e, code lost:
    
        if (r1.emit(r3, r6) != r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        if (r1.emit(r5, r6) == r7) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (r1.emit(r5, r6) == r7) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, vpr vprVar, b3w0 b3w0Var, ContinuationImpl continuationImpl) {
        SuperAppMainScreenPopupRepository$transformUiState$1 superAppMainScreenPopupRepository$transformUiState$1;
        int i;
        Long l;
        vpr vprVar2;
        Object a;
        ?? r8;
        int i2;
        ?? r82;
        long longValue;
        int i3;
        int i4;
        vpr vprVar3;
        vpr vprVar4 = vprVar;
        b3w0 b3w0Var2 = b3w0Var;
        a2t a2tVar = a2t.a;
        cVar.getClass();
        d3w0 d3w0Var = d3w0.a;
        if (continuationImpl instanceof SuperAppMainScreenPopupRepository$transformUiState$1) {
            superAppMainScreenPopupRepository$transformUiState$1 = (SuperAppMainScreenPopupRepository$transformUiState$1) continuationImpl;
            int i5 = superAppMainScreenPopupRepository$transformUiState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenPopupRepository$transformUiState$1.label = i5 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenPopupRepository$transformUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (superAppMainScreenPopupRepository$transformUiState$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        c3w0 c3w0Var = b3w0Var2.a;
                        if (c3w0Var != null) {
                            boolean z = !c3w0Var.c;
                            if (!(c3w0Var.a instanceof mcw0) || !jl40.l(c3w0Var.b, a2tVar)) {
                                c3w0 c3w0Var2 = b3w0Var2.a;
                                ocw0 ocw0Var = c3w0Var2.a;
                                if (!(ocw0Var instanceof lcw0)) {
                                    c2t c2tVar = c3w0Var2.b;
                                    if (!(c2tVar instanceof y1t)) {
                                        if (!(ocw0Var instanceof ncw0) && !jl40.l(c2tVar, z1t.a)) {
                                            c2t c2tVar2 = b3w0Var2.a.b;
                                            b2t b2tVar = b2t.a;
                                            if (!jl40.l(c2tVar2, b2tVar) || b3w0Var2.d || b3w0Var2.c) {
                                                if (!jl40.l(b3w0Var2.a.b, b2tVar) || (!b3w0Var2.c && !b3w0Var2.d)) {
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.I$0 = z ? 1 : 0;
                                                    superAppMainScreenPopupRepository$transformUiState$1.label = 9;
                                                    break;
                                                }
                                            }
                                        }
                                        Long l2 = b3w0Var2.b;
                                        if (l2 != null) {
                                            long longValue2 = l2.longValue();
                                            o430 o430Var = e3n.b;
                                            l = new Long((e3n.e(kp50.V(cVar.b.a.b, DurationUnit.SECONDS)) + longValue2) - SystemClock.elapsedRealtime());
                                        } else {
                                            l = null;
                                        }
                                        if (l != null) {
                                            if (b3w0Var2.d && l.longValue() > 0) {
                                                com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c cVar2 = cVar.a;
                                                k9p k9pVar = new k9p(z);
                                                superAppMainScreenPopupRepository$transformUiState$1.L$0 = vprVar4;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$2 = b3w0Var2;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$3 = vprVar4;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$4 = l;
                                                superAppMainScreenPopupRepository$transformUiState$1.I$0 = z ? 1 : 0;
                                                superAppMainScreenPopupRepository$transformUiState$1.label = 4;
                                                a = cVar2.a(k9pVar, superAppMainScreenPopupRepository$transformUiState$1);
                                                if (a != coroutineSingletons) {
                                                    vprVar2 = vprVar4;
                                                    r8 = z;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$0 = vprVar2;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$2 = b3w0Var2;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$3 = l;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$4 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.I$0 = r8;
                                                    superAppMainScreenPopupRepository$transformUiState$1.label = 5;
                                                    if (vprVar4.emit(a, superAppMainScreenPopupRepository$transformUiState$1) != coroutineSingletons) {
                                                        i2 = r8;
                                                        r82 = i2;
                                                        longValue = l.longValue();
                                                        superAppMainScreenPopupRepository$transformUiState$1.L$0 = vprVar2;
                                                        superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                                        superAppMainScreenPopupRepository$transformUiState$1.L$2 = b3w0Var2;
                                                        superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                                                        superAppMainScreenPopupRepository$transformUiState$1.I$0 = r82;
                                                        superAppMainScreenPopupRepository$transformUiState$1.label = 6;
                                                        if (kotlinx.coroutines.a.i(longValue, superAppMainScreenPopupRepository$transformUiState$1) != coroutineSingletons) {
                                                        }
                                                    }
                                                }
                                                return coroutineSingletons;
                                            }
                                            vprVar2 = vprVar4;
                                            r82 = z;
                                            longValue = l.longValue();
                                            superAppMainScreenPopupRepository$transformUiState$1.L$0 = vprVar2;
                                            superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                            superAppMainScreenPopupRepository$transformUiState$1.L$2 = b3w0Var2;
                                            superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                                            superAppMainScreenPopupRepository$transformUiState$1.I$0 = r82;
                                            superAppMainScreenPopupRepository$transformUiState$1.label = 6;
                                            if (kotlinx.coroutines.a.i(longValue, superAppMainScreenPopupRepository$transformUiState$1) != coroutineSingletons) {
                                                i3 = r82;
                                                com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c cVar3 = cVar.a;
                                                j9p j9pVar = new j9p(i3 != 0, jl40.l(b3w0Var2.a.b, a2tVar));
                                                superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$3 = vprVar2;
                                                superAppMainScreenPopupRepository$transformUiState$1.L$4 = null;
                                                superAppMainScreenPopupRepository$transformUiState$1.I$0 = i3;
                                                superAppMainScreenPopupRepository$transformUiState$1.label = 7;
                                                obj = cVar3.a(j9pVar, superAppMainScreenPopupRepository$transformUiState$1);
                                                if (obj != coroutineSingletons) {
                                                    i4 = i3;
                                                    vprVar3 = vprVar2;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.L$4 = null;
                                                    superAppMainScreenPopupRepository$transformUiState$1.I$0 = i4;
                                                    superAppMainScreenPopupRepository$transformUiState$1.label = 8;
                                                    break;
                                                }
                                            }
                                            return coroutineSingletons;
                                        }
                                        jst.e.a(20, "SuperAppMainScreenPopupRepository", null, "loading started but timestamp is null");
                                    }
                                }
                                com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c cVar4 = cVar.a;
                                i9p i9pVar = new i9p(z, (ocw0Var instanceof jcw0) || (c3w0Var2.b instanceof w1t));
                                superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                                superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                                superAppMainScreenPopupRepository$transformUiState$1.L$3 = vprVar4;
                                superAppMainScreenPopupRepository$transformUiState$1.I$0 = z ? 1 : 0;
                                superAppMainScreenPopupRepository$transformUiState$1.label = 2;
                                obj = cVar4.a(i9pVar, superAppMainScreenPopupRepository$transformUiState$1);
                                if (obj != coroutineSingletons) {
                                    i = z ? 1 : 0;
                                    superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                                    superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                                    superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                                    superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                                    superAppMainScreenPopupRepository$transformUiState$1.I$0 = i;
                                    superAppMainScreenPopupRepository$transformUiState$1.label = 3;
                                    break;
                                }
                                return coroutineSingletons;
                            }
                            superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                            superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                            superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                            superAppMainScreenPopupRepository$transformUiState$1.I$0 = z ? 1 : 0;
                            superAppMainScreenPopupRepository$transformUiState$1.label = 1;
                            break;
                        }
                        return zy11.a;
                    case 1:
                    case 3:
                    case 9:
                        kotlin.b.b(obj);
                        return zy11.a;
                    case 2:
                        i = superAppMainScreenPopupRepository$transformUiState$1.I$0;
                        vprVar4 = (vpr) superAppMainScreenPopupRepository$transformUiState$1.L$3;
                        kotlin.b.b(obj);
                        superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.I$0 = i;
                        superAppMainScreenPopupRepository$transformUiState$1.label = 3;
                        break;
                    case 4:
                        int i6 = superAppMainScreenPopupRepository$transformUiState$1.I$0;
                        Long l3 = (Long) superAppMainScreenPopupRepository$transformUiState$1.L$4;
                        vpr vprVar5 = (vpr) superAppMainScreenPopupRepository$transformUiState$1.L$3;
                        b3w0 b3w0Var3 = (b3w0) superAppMainScreenPopupRepository$transformUiState$1.L$2;
                        vprVar2 = (vpr) superAppMainScreenPopupRepository$transformUiState$1.L$0;
                        kotlin.b.b(obj);
                        r8 = i6;
                        vprVar4 = vprVar5;
                        a = obj;
                        l = l3;
                        b3w0Var2 = b3w0Var3;
                        superAppMainScreenPopupRepository$transformUiState$1.L$0 = vprVar2;
                        superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$2 = b3w0Var2;
                        superAppMainScreenPopupRepository$transformUiState$1.L$3 = l;
                        superAppMainScreenPopupRepository$transformUiState$1.L$4 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.I$0 = r8;
                        superAppMainScreenPopupRepository$transformUiState$1.label = 5;
                        if (vprVar4.emit(a, superAppMainScreenPopupRepository$transformUiState$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        i2 = superAppMainScreenPopupRepository$transformUiState$1.I$0;
                        Long l4 = (Long) superAppMainScreenPopupRepository$transformUiState$1.L$3;
                        b3w0 b3w0Var4 = (b3w0) superAppMainScreenPopupRepository$transformUiState$1.L$2;
                        vpr vprVar6 = (vpr) superAppMainScreenPopupRepository$transformUiState$1.L$0;
                        kotlin.b.b(obj);
                        l = l4;
                        b3w0Var2 = b3w0Var4;
                        vprVar2 = vprVar6;
                        r82 = i2;
                        longValue = l.longValue();
                        superAppMainScreenPopupRepository$transformUiState$1.L$0 = vprVar2;
                        superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$2 = b3w0Var2;
                        superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.I$0 = r82;
                        superAppMainScreenPopupRepository$transformUiState$1.label = 6;
                        if (kotlinx.coroutines.a.i(longValue, superAppMainScreenPopupRepository$transformUiState$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        i3 = superAppMainScreenPopupRepository$transformUiState$1.I$0;
                        b3w0Var2 = (b3w0) superAppMainScreenPopupRepository$transformUiState$1.L$2;
                        vpr vprVar7 = (vpr) superAppMainScreenPopupRepository$transformUiState$1.L$0;
                        kotlin.b.b(obj);
                        vprVar2 = vprVar7;
                        com.yandex.go.mainscreen.superapp.popup.data.state.scenario.c cVar32 = cVar.a;
                        j9p j9pVar2 = new j9p(i3 != 0, jl40.l(b3w0Var2.a.b, a2tVar));
                        superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$3 = vprVar2;
                        superAppMainScreenPopupRepository$transformUiState$1.L$4 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.I$0 = i3;
                        superAppMainScreenPopupRepository$transformUiState$1.label = 7;
                        obj = cVar32.a(j9pVar2, superAppMainScreenPopupRepository$transformUiState$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                        i4 = superAppMainScreenPopupRepository$transformUiState$1.I$0;
                        vprVar3 = (vpr) superAppMainScreenPopupRepository$transformUiState$1.L$3;
                        kotlin.b.b(obj);
                        superAppMainScreenPopupRepository$transformUiState$1.L$0 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$1 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$2 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$3 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.L$4 = null;
                        superAppMainScreenPopupRepository$transformUiState$1.I$0 = i4;
                        superAppMainScreenPopupRepository$transformUiState$1.label = 8;
                        break;
                    case 8:
                        kotlin.b.b(obj);
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        superAppMainScreenPopupRepository$transformUiState$1 = new SuperAppMainScreenPopupRepository$transformUiState$1(cVar, continuationImpl);
        Object obj2 = superAppMainScreenPopupRepository$transformUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (superAppMainScreenPopupRepository$transformUiState$1.label) {
        }
    }

    public final tpr c() {
        k r = e.r(e.t(e.X(e.t(new j0(new b3w0(0), e.n(new jqr(new b(this.c.b), new SuperAppMainScreenPopupRepository$observeUiState$2(2, this, c.class, "reportSuperAppFallbackBehaviourExperiment", "reportSuperAppFallbackBehaviourExperiment(Lcom/yandex/go/flex/main_screen/api/SuperappMainScreenState$LoadingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), ((f2t) this.d.a).g, this.e.b, SuperAppMainScreenPopupRepository$observeUiState$3.a), new SuperAppMainScreenPopupRepository$observeUiState$4(this, null))), new SuperAppMainScreenPopupRepository$observeUiState$5(this, null))), new ceu0(4));
        this.g.getClass();
        return e.F(r, uyj.a);
    }
}
