package com.yandex.go.scooters.live.domain;

import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o2b1;
import defpackage.pwn0;
import defpackage.qwn0;
import defpackage.qxm0;
import defpackage.x4o0;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final h3y a;
    public final h3y b;
    public final h3y c;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersLiveAction scootersLiveAction, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersLiveActionInteractor$evolveToNextState$1 scootersLiveActionInteractor$evolveToNextState$1;
        int i;
        String str;
        if (continuationImpl instanceof ScootersLiveActionInteractor$evolveToNextState$1) {
            scootersLiveActionInteractor$evolveToNextState$1 = (ScootersLiveActionInteractor$evolveToNextState$1) continuationImpl;
            int i2 = scootersLiveActionInteractor$evolveToNextState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveActionInteractor$evolveToNextState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveActionInteractor$evolveToNextState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveActionInteractor$evolveToNextState$1.label;
                zy11 zy11Var = zy11.a;
                h3y h3yVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String sessionId = zuo0Var.getSessionId();
                    if (((x4o0) h3yVar.get()).b(sessionId) != null) {
                        hst hstVar = jst.e;
                        Objects.toString(scootersLiveAction);
                        hstVar.getClass();
                        return zy11Var;
                    }
                    ((x4o0) h3yVar.get()).d(scootersLiveAction.getOnTheWayAction(), sessionId);
                    ru.yandex.taxi.scooters.domain.b bVar = (ru.yandex.taxi.scooters.domain.b) this.b.get();
                    pwn0 pwn0Var = new pwn0();
                    scootersLiveActionInteractor$evolveToNextState$1.L$0 = null;
                    scootersLiveActionInteractor$evolveToNextState$1.L$1 = null;
                    scootersLiveActionInteractor$evolveToNextState$1.L$2 = sessionId;
                    scootersLiveActionInteractor$evolveToNextState$1.label = 1;
                    if (bVar.e(pwn0Var, zuo0Var, scootersLiveActionInteractor$evolveToNextState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = sessionId;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersLiveActionInteractor$evolveToNextState$1.L$2;
                    kotlin.b.b(obj);
                }
                ((x4o0) h3yVar.get()).d(null, str);
                return zy11Var;
            }
        }
        scootersLiveActionInteractor$evolveToNextState$1 = new ScootersLiveActionInteractor$evolveToNextState$1(this, continuationImpl);
        Object obj2 = scootersLiveActionInteractor$evolveToNextState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveActionInteractor$evolveToNextState$1.label;
        zy11 zy11Var2 = zy11.a;
        h3y h3yVar2 = this.c;
        if (i != 0) {
        }
        ((x4o0) h3yVar2.get()).d(null, str);
        return zy11Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(5:19|20|21|14|15))(3:22|23|24)))|38|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r10 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        defpackage.zgz.a("Error through scooters live action handling", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ScootersLiveAction scootersLiveAction, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersLiveActionInteractor$handleAction$1 scootersLiveActionInteractor$handleAction$1;
        int i;
        if (continuationImpl instanceof ScootersLiveActionInteractor$handleAction$1) {
            scootersLiveActionInteractor$handleAction$1 = (ScootersLiveActionInteractor$handleAction$1) continuationImpl;
            int i2 = scootersLiveActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveActionInteractor$handleAction$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                ((qxm0) this.a.get()).d(o2b1.f(scootersLiveAction));
                switch (qwn0.a[scootersLiveAction.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        scootersLiveActionInteractor$handleAction$1.L$0 = null;
                        scootersLiveActionInteractor$handleAction$1.L$1 = null;
                        scootersLiveActionInteractor$handleAction$1.label = 1;
                        obj = a(scootersLiveAction, zuo0Var, scootersLiveActionInteractor$handleAction$1);
                        break;
                    case 4:
                        scootersLiveActionInteractor$handleAction$1.L$0 = null;
                        scootersLiveActionInteractor$handleAction$1.L$1 = null;
                        scootersLiveActionInteractor$handleAction$1.label = 2;
                        obj = ((ru.yandex.taxi.scooters.domain.b) this.b.get()).k(new pwn0(), zuo0Var, scootersLiveActionInteractor$handleAction$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                        return zy11.a;
                    case 5:
                    case 6:
                    case 7:
                        jst.e.u("Action " + scootersLiveAction + " must be handled in Activity");
                        return zy11.a;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        scootersLiveActionInteractor$handleAction$1 = new ScootersLiveActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = scootersLiveActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveActionInteractor$handleAction$1.label;
        if (i == 0) {
        }
    }
}
