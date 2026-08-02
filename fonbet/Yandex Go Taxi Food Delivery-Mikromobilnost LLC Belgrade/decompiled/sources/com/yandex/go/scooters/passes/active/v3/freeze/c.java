package com.yandex.go.scooters.passes.active.v3.freeze;

import com.yandex.go.scooters.passes.active.domain.f;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.avm0;
import defpackage.krm0;
import defpackage.ny61;
import defpackage.prm0;
import defpackage.umm0;
import defpackage.wqm0;
import defpackage.yum0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class c {
    public final f a;
    public final com.yandex.go.scooters.passes.active.domain.d b;

    public c(f fVar, com.yandex.go.scooters.passes.active.domain.d dVar) {
        this.a = fVar;
        this.b = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:22|23))(3:24|25|(1:27))|13|14|15|16))|32|6|7|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        defpackage.zgz.a(null, r5);
        r8.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(avm0 avm0Var, ScootersPassesFromScreen scootersPassesFromScreen, krm0 krm0Var, prm0 prm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3FreezeUiActionInteractor$confirm$1 scootersActivePassesV3FreezeUiActionInteractor$confirm$1;
        int i;
        if (continuationImpl instanceof ScootersActivePassesV3FreezeUiActionInteractor$confirm$1) {
            scootersActivePassesV3FreezeUiActionInteractor$confirm$1 = (ScootersActivePassesV3FreezeUiActionInteractor$confirm$1) continuationImpl;
            int i2 = scootersActivePassesV3FreezeUiActionInteractor$confirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3FreezeUiActionInteractor$confirm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3FreezeUiActionInteractor$confirm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3FreezeUiActionInteractor$confirm$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = prm0Var.b;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    com.yandex.go.scooters.passes.active.domain.d dVar = this.b;
                    String str = avm0Var.a;
                    scootersActivePassesV3FreezeUiActionInteractor$confirm$1.L$0 = null;
                    scootersActivePassesV3FreezeUiActionInteractor$confirm$1.L$1 = null;
                    scootersActivePassesV3FreezeUiActionInteractor$confirm$1.L$2 = krm0Var;
                    scootersActivePassesV3FreezeUiActionInteractor$confirm$1.L$3 = prm0Var;
                    scootersActivePassesV3FreezeUiActionInteractor$confirm$1.label = 1;
                    if (dVar.a(scootersPassesFromScreen, str, scootersActivePassesV3FreezeUiActionInteractor$confirm$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    prm0Var = (prm0) scootersActivePassesV3FreezeUiActionInteractor$confirm$1.L$3;
                    krm0Var = (krm0) scootersActivePassesV3FreezeUiActionInteractor$confirm$1.L$2;
                    try {
                        kotlin.b.b(obj);
                    } finally {
                        r0 r0Var2 = prm0Var.b;
                        Boolean bool2 = Boolean.FALSE;
                        r0Var2.getClass();
                        r0Var2.m(null, bool2);
                    }
                }
                krm0Var.a.r(new umm0(11));
                return zy11.a;
            }
        }
        scootersActivePassesV3FreezeUiActionInteractor$confirm$1 = new ScootersActivePassesV3FreezeUiActionInteractor$confirm$1(this, continuationImpl);
        Object obj2 = scootersActivePassesV3FreezeUiActionInteractor$confirm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3FreezeUiActionInteractor$confirm$1.label;
        if (i != 0) {
        }
        krm0Var.a.r(new umm0(11));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(avm0 avm0Var, ScootersPassesFromScreen scootersPassesFromScreen, krm0 krm0Var, prm0 prm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3FreezeUiActionInteractor$reject$1 scootersActivePassesV3FreezeUiActionInteractor$reject$1;
        int i;
        zy11 zy11Var;
        try {
            if (continuationImpl instanceof ScootersActivePassesV3FreezeUiActionInteractor$reject$1) {
                scootersActivePassesV3FreezeUiActionInteractor$reject$1 = (ScootersActivePassesV3FreezeUiActionInteractor$reject$1) continuationImpl;
                int i2 = scootersActivePassesV3FreezeUiActionInteractor$reject$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersActivePassesV3FreezeUiActionInteractor$reject$1.label = i2 - Integer.MIN_VALUE;
                    ScootersActivePassesV3FreezeUiActionInteractor$reject$1 scootersActivePassesV3FreezeUiActionInteractor$reject$12 = scootersActivePassesV3FreezeUiActionInteractor$reject$1;
                    Object obj = scootersActivePassesV3FreezeUiActionInteractor$reject$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersActivePassesV3FreezeUiActionInteractor$reject$12.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (avm0Var.j != null) {
                            krm0Var.a.r(new umm0(10));
                            return zy11Var;
                        }
                        r0 r0Var = prm0Var.a;
                        Boolean bool = Boolean.TRUE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                        f fVar = this.a;
                        String str = avm0Var.a;
                        yum0 yum0Var = avm0Var.g;
                        boolean z = !yum0Var.g;
                        wqm0 wqm0Var = yum0Var.e;
                        scootersActivePassesV3FreezeUiActionInteractor$reject$12.L$0 = null;
                        scootersActivePassesV3FreezeUiActionInteractor$reject$12.L$1 = null;
                        scootersActivePassesV3FreezeUiActionInteractor$reject$12.L$2 = krm0Var;
                        scootersActivePassesV3FreezeUiActionInteractor$reject$12.L$3 = prm0Var;
                        scootersActivePassesV3FreezeUiActionInteractor$reject$12.label = 1;
                        if (fVar.a(scootersPassesFromScreen, str, z, wqm0Var, scootersActivePassesV3FreezeUiActionInteractor$reject$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        prm0Var = (prm0) scootersActivePassesV3FreezeUiActionInteractor$reject$12.L$3;
                        krm0Var = (krm0) scootersActivePassesV3FreezeUiActionInteractor$reject$12.L$2;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th) {
                            r0 r0Var2 = prm0Var.a;
                            Boolean bool2 = Boolean.FALSE;
                            r0Var2.getClass();
                            r0Var2.m(null, bool2);
                            throw th;
                        }
                    }
                    krm0Var.a.r(new umm0(12));
                    r0 r0Var3 = prm0Var.a;
                    Boolean bool3 = Boolean.FALSE;
                    r0Var3.getClass();
                    r0Var3.m(null, bool3);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            krm0Var.a.r(new umm0(12));
            r0 r0Var32 = prm0Var.a;
            Boolean bool32 = Boolean.FALSE;
            r0Var32.getClass();
            r0Var32.m(null, bool32);
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            zgz.a(null, th2);
            krm0Var.a(th2);
            r0 r0Var4 = prm0Var.a;
            Boolean bool4 = Boolean.FALSE;
            r0Var4.getClass();
            r0Var4.m(null, bool4);
            return zy11Var;
        }
        scootersActivePassesV3FreezeUiActionInteractor$reject$1 = new ScootersActivePassesV3FreezeUiActionInteractor$reject$1(this, continuationImpl);
        ScootersActivePassesV3FreezeUiActionInteractor$reject$1 scootersActivePassesV3FreezeUiActionInteractor$reject$122 = scootersActivePassesV3FreezeUiActionInteractor$reject$1;
        Object obj2 = scootersActivePassesV3FreezeUiActionInteractor$reject$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3FreezeUiActionInteractor$reject$122.label;
        zy11Var = zy11.a;
    }
}
