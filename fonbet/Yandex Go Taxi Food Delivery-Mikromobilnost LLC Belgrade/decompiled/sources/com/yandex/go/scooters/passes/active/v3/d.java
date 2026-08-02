package com.yandex.go.scooters.passes.active.v3;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.etm0;
import defpackage.h3y;
import defpackage.mtm0;
import defpackage.ny61;
import defpackage.qxm0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class d {
    public final qxm0 a;
    public final h3y b;
    public final r c;
    public final com.yandex.go.scooters.passes.active.domain.d d;

    public d(qxm0 qxm0Var, h3y h3yVar, r rVar, com.yandex.go.scooters.passes.active.domain.d dVar) {
        this.a = qxm0Var;
        this.b = h3yVar;
        this.c = rVar;
        this.d = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|14|15|16|17))|7|(0)(0)|12|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        defpackage.zgz.a(null, r5);
        r6 = r7.a;
        r6.A((defpackage.m950) ((defpackage.yvf0) r6.J).get(), new defpackage.zjn0(r5, (java.util.List) null, 6), new defpackage.ftm0(0));
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, etm0 etm0Var, mtm0 mtm0Var, ScootersPassesFromScreen scootersPassesFromScreen, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3UiActionInteractor$unfreeze$1 scootersActivePassesV3UiActionInteractor$unfreeze$1;
        int i;
        try {
            try {
                if (continuationImpl instanceof ScootersActivePassesV3UiActionInteractor$unfreeze$1) {
                    scootersActivePassesV3UiActionInteractor$unfreeze$1 = (ScootersActivePassesV3UiActionInteractor$unfreeze$1) continuationImpl;
                    int i2 = scootersActivePassesV3UiActionInteractor$unfreeze$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        scootersActivePassesV3UiActionInteractor$unfreeze$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = scootersActivePassesV3UiActionInteractor$unfreeze$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = scootersActivePassesV3UiActionInteractor$unfreeze$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            r0 r0Var = mtm0Var.a;
                            Boolean bool = Boolean.TRUE;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                            com.yandex.go.scooters.passes.active.domain.d dVar = this.d;
                            scootersActivePassesV3UiActionInteractor$unfreeze$1.L$0 = null;
                            scootersActivePassesV3UiActionInteractor$unfreeze$1.L$1 = etm0Var;
                            scootersActivePassesV3UiActionInteractor$unfreeze$1.L$2 = mtm0Var;
                            scootersActivePassesV3UiActionInteractor$unfreeze$1.L$3 = null;
                            scootersActivePassesV3UiActionInteractor$unfreeze$1.label = 1;
                            if (dVar.b(scootersPassesFromScreen, str, scootersActivePassesV3UiActionInteractor$unfreeze$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mtm0Var = (mtm0) scootersActivePassesV3UiActionInteractor$unfreeze$1.L$2;
                            etm0Var = (etm0) scootersActivePassesV3UiActionInteractor$unfreeze$1.L$1;
                            kotlin.b.b(obj);
                        }
                        r0 r0Var2 = mtm0Var.a;
                        Boolean bool2 = Boolean.FALSE;
                        r0Var2.getClass();
                        r0Var2.m(null, bool2);
                        return zy11.a;
                    }
                }
                if (i != 0) {
                }
                r0 r0Var22 = mtm0Var.a;
                Boolean bool22 = Boolean.FALSE;
                r0Var22.getClass();
                r0Var22.m(null, bool22);
                return zy11.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            r0 r0Var3 = mtm0Var.a;
            Boolean bool3 = Boolean.FALSE;
            r0Var3.getClass();
            r0Var3.m(null, bool3);
            throw th;
        }
        scootersActivePassesV3UiActionInteractor$unfreeze$1 = new ScootersActivePassesV3UiActionInteractor$unfreeze$1(this, continuationImpl);
        Object obj2 = scootersActivePassesV3UiActionInteractor$unfreeze$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3UiActionInteractor$unfreeze$1.label;
    }
}
