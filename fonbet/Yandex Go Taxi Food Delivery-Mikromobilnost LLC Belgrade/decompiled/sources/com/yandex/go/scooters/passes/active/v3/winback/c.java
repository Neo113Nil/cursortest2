package com.yandex.go.scooters.passes.active.v3.winback;

import com.yandex.go.scooters.passes.active.domain.f;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.avm0;
import defpackage.ium0;
import defpackage.lum0;
import defpackage.ny61;
import defpackage.umm0;
import defpackage.wqm0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final f a;
    public final com.yandex.go.scooters.passes.active.v3.winback.domain.a b;

    public c(f fVar, com.yandex.go.scooters.passes.active.v3.winback.domain.a aVar) {
        this.a = fVar;
        this.b = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(2:21|22))(6:23|24|25|26|27|(1:29)(1:20)))(1:37))(3:48|(1:50)|29)|38|39|(4:41|26|27|(0))|29))|55|6|7|(0)(0)|38|39|(0)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0169, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0164, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0165, code lost:
    
        r15 = r2;
        r2 = r1;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0190, code lost:
    
        r2 = java.lang.Boolean.FALSE;
        r4.L$0 = null;
        r4.L$1 = null;
        r4.L$2 = null;
        r4.L$3 = null;
        r4.L$4 = null;
        r4.L$5 = null;
        r4.L$6 = null;
        r4.L$7 = r0;
        r4.label = 5;
        r1.Cg(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a7, code lost:
    
        if (r12 == r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, r8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersPassesFromScreen scootersPassesFromScreen, ium0 ium0Var, avm0 avm0Var, lum0 lum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3WinbackUiActionInteractor$confirm$1 scootersActivePassesV3WinbackUiActionInteractor$confirm$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersPassesFromScreen scootersPassesFromScreen2;
        avm0 avm0Var2;
        ium0 ium0Var2;
        ium0 ium0Var3;
        ium0 ium0Var4;
        lum0 lum0Var2;
        com.yandex.go.scooters.passes.active.v3.winback.domain.a aVar;
        String str;
        ium0 ium0Var5;
        ?? r1 = ium0Var;
        lum0 lum0Var3 = lum0Var;
        if (continuationImpl instanceof ScootersActivePassesV3WinbackUiActionInteractor$confirm$1) {
            scootersActivePassesV3WinbackUiActionInteractor$confirm$1 = (ScootersActivePassesV3WinbackUiActionInteractor$confirm$1) continuationImpl;
            int i2 = scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3WinbackUiActionInteractor$confirm$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean bool = Boolean.TRUE;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0 = scootersPassesFromScreen;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1 = r1;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2 = avm0Var;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$3 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$4 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5 = r1;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6 = lum0Var3;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = 1;
                    lum0Var3.Cg(bool, scootersActivePassesV3WinbackUiActionInteractor$confirm$1);
                    if (zy11Var != coroutineSingletons) {
                        scootersPassesFromScreen2 = scootersPassesFromScreen;
                        avm0Var2 = avm0Var;
                        ium0Var2 = r1;
                        ium0Var3 = r1;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i == 4) {
                            kotlin.b.b(obj);
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$7;
                        kotlin.b.b(obj);
                        throw th;
                    }
                    lum0Var2 = (lum0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6;
                    ium0Var4 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5;
                    ium0Var5 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1;
                    try {
                        kotlin.b.b(obj);
                        ium0Var5.a.r(new umm0(18));
                        Boolean bool2 = Boolean.FALSE;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$3 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$4 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$7 = zy11Var;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = 3;
                        lum0Var2.Cg(bool2, scootersActivePassesV3WinbackUiActionInteractor$confirm$1);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        zgz.a(null, th);
                        ium0Var4.a(th);
                        Boolean bool3 = Boolean.FALSE;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$3 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$4 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$7 = zy11Var;
                        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = 4;
                        lum0Var2.Cg(bool3, scootersActivePassesV3WinbackUiActionInteractor$confirm$1);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                    return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                lum0 lum0Var4 = (lum0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6;
                ium0 ium0Var6 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5;
                avm0Var2 = (avm0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2;
                ium0Var2 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1;
                scootersPassesFromScreen2 = (ScootersPassesFromScreen) scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0;
                kotlin.b.b(obj);
                lum0Var3 = lum0Var4;
                ium0Var3 = ium0Var6;
                aVar = this.b;
                str = avm0Var2.a;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0 = null;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1 = ium0Var2;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2 = null;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$3 = null;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$4 = null;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5 = ium0Var3;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6 = lum0Var3;
                scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = 2;
                if (aVar.a(scootersPassesFromScreen2, str, scootersActivePassesV3WinbackUiActionInteractor$confirm$1) != coroutineSingletons) {
                    lum0 lum0Var5 = lum0Var3;
                    ium0Var4 = ium0Var3;
                    lum0Var2 = lum0Var5;
                    ium0Var5 = ium0Var2;
                    ium0Var5.a.r(new umm0(18));
                    Boolean bool22 = Boolean.FALSE;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$3 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$4 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$7 = zy11Var;
                    scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = 3;
                    lum0Var2.Cg(bool22, scootersActivePassesV3WinbackUiActionInteractor$confirm$1);
                    if (zy11Var != coroutineSingletons) {
                    }
                }
            }
        }
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1 = new ScootersActivePassesV3WinbackUiActionInteractor$confirm$1(this, continuationImpl);
        Object obj2 = scootersActivePassesV3WinbackUiActionInteractor$confirm$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        aVar = this.b;
        str = avm0Var2.a;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$0 = null;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$1 = ium0Var2;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$2 = null;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$3 = null;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$4 = null;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$5 = ium0Var3;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.L$6 = lum0Var3;
        scootersActivePassesV3WinbackUiActionInteractor$confirm$1.label = 2;
        if (aVar.a(scootersPassesFromScreen2, str, scootersActivePassesV3WinbackUiActionInteractor$confirm$1) != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(2:21|22))(6:23|24|25|26|27|(1:29)(1:20)))(1:37))(3:56|(1:58)|29)|38|39|40|41|42|(4:44|26|27|(0))|29))|63|6|7|(0)(0)|38|39|40|41|42|(0)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0175, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0178, code lost:
    
        r15 = r2;
        r2 = r1;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0183, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0181, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a9, code lost:
    
        r2 = java.lang.Boolean.FALSE;
        r4.L$0 = null;
        r4.L$1 = null;
        r4.L$2 = null;
        r4.L$3 = null;
        r4.L$4 = null;
        r4.L$5 = null;
        r4.L$6 = null;
        r4.L$7 = r0;
        r4.label = 5;
        r1.Cg(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
    
        if (r12 == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, r8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ScootersPassesFromScreen scootersPassesFromScreen, ium0 ium0Var, avm0 avm0Var, lum0 lum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3WinbackUiActionInteractor$reject$1 scootersActivePassesV3WinbackUiActionInteractor$reject$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersPassesFromScreen scootersPassesFromScreen2;
        avm0 avm0Var2;
        ium0 ium0Var2;
        ium0 ium0Var3;
        ium0 ium0Var4;
        lum0 lum0Var2;
        f fVar;
        String str;
        wqm0 wqm0Var;
        ScootersActivePassesV3WinbackUiActionInteractor$reject$1 scootersActivePassesV3WinbackUiActionInteractor$reject$12;
        ium0 ium0Var5;
        ?? r1 = ium0Var;
        lum0 lum0Var3 = lum0Var;
        if (continuationImpl instanceof ScootersActivePassesV3WinbackUiActionInteractor$reject$1) {
            scootersActivePassesV3WinbackUiActionInteractor$reject$1 = (ScootersActivePassesV3WinbackUiActionInteractor$reject$1) continuationImpl;
            int i2 = scootersActivePassesV3WinbackUiActionInteractor$reject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3WinbackUiActionInteractor$reject$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3WinbackUiActionInteractor$reject$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean bool = Boolean.TRUE;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0 = scootersPassesFromScreen;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1 = r1;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2 = avm0Var;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$3 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$4 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5 = r1;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6 = lum0Var3;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = 1;
                    lum0Var3.Cg(bool, scootersActivePassesV3WinbackUiActionInteractor$reject$1);
                    if (zy11Var != coroutineSingletons) {
                        scootersPassesFromScreen2 = scootersPassesFromScreen;
                        avm0Var2 = avm0Var;
                        ium0Var2 = r1;
                        ium0Var3 = r1;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i == 4) {
                            kotlin.b.b(obj);
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$7;
                        kotlin.b.b(obj);
                        throw th;
                    }
                    lum0Var2 = (lum0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6;
                    ium0Var4 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5;
                    ium0Var5 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1;
                    try {
                        kotlin.b.b(obj);
                        ium0Var5.a.r(new umm0(18));
                        Boolean bool2 = Boolean.FALSE;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$3 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$4 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$7 = zy11Var;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = 3;
                        lum0Var2.Cg(bool2, scootersActivePassesV3WinbackUiActionInteractor$reject$1);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        zgz.a(null, th);
                        ium0Var4.a(th);
                        Boolean bool3 = Boolean.FALSE;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$3 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$4 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6 = null;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$7 = zy11Var;
                        scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = 4;
                        lum0Var2.Cg(bool3, scootersActivePassesV3WinbackUiActionInteractor$reject$1);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                    return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                lum0 lum0Var4 = (lum0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6;
                ium0 ium0Var6 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5;
                avm0Var2 = (avm0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2;
                ium0Var2 = (ium0) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1;
                scootersPassesFromScreen2 = (ScootersPassesFromScreen) scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0;
                kotlin.b.b(obj);
                lum0Var3 = lum0Var4;
                ium0Var3 = ium0Var6;
                fVar = this.a;
                str = avm0Var2.a;
                wqm0Var = avm0Var2.g.e;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0 = null;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1 = ium0Var2;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2 = null;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$3 = null;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$4 = null;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5 = ium0Var3;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6 = lum0Var3;
                scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = 2;
                scootersActivePassesV3WinbackUiActionInteractor$reject$12 = scootersActivePassesV3WinbackUiActionInteractor$reject$1;
                if (fVar.a(scootersPassesFromScreen2, str, false, wqm0Var, scootersActivePassesV3WinbackUiActionInteractor$reject$12) != coroutineSingletons) {
                    lum0 lum0Var5 = lum0Var3;
                    ium0Var4 = ium0Var3;
                    lum0Var2 = lum0Var5;
                    ium0Var5 = ium0Var2;
                    ium0Var5.a.r(new umm0(18));
                    Boolean bool22 = Boolean.FALSE;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$3 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$4 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6 = null;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$7 = zy11Var;
                    scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = 3;
                    lum0Var2.Cg(bool22, scootersActivePassesV3WinbackUiActionInteractor$reject$1);
                    if (zy11Var != coroutineSingletons) {
                    }
                }
            }
        }
        scootersActivePassesV3WinbackUiActionInteractor$reject$1 = new ScootersActivePassesV3WinbackUiActionInteractor$reject$1(this, continuationImpl);
        Object obj2 = scootersActivePassesV3WinbackUiActionInteractor$reject$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3WinbackUiActionInteractor$reject$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        fVar = this.a;
        str = avm0Var2.a;
        wqm0Var = avm0Var2.g.e;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$0 = null;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$1 = ium0Var2;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$2 = null;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$3 = null;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$4 = null;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$5 = ium0Var3;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.L$6 = lum0Var3;
        scootersActivePassesV3WinbackUiActionInteractor$reject$1.label = 2;
        scootersActivePassesV3WinbackUiActionInteractor$reject$12 = scootersActivePassesV3WinbackUiActionInteractor$reject$1;
        if (fVar.a(scootersPassesFromScreen2, str, false, wqm0Var, scootersActivePassesV3WinbackUiActionInteractor$reject$12) != coroutineSingletons) {
        }
    }
}
