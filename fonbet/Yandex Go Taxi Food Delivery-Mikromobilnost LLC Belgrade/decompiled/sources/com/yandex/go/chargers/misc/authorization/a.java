package com.yandex.go.chargers.misc.authorization;

import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.j18;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.uj;
import defpackage.un9;
import defpackage.vj;
import defpackage.wj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes12.dex */
public final class a {
    public final e a;
    public final com.yandex.go.chargers.domain.a b;

    public a(e eVar, com.yandex.go.chargers.domain.a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r1.s() == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersAuthorizationInteractor$authIfNeeded$1 chargersAuthorizationInteractor$authIfNeeded$1;
        int i;
        if (continuationImpl instanceof ChargersAuthorizationInteractor$authIfNeeded$1) {
            chargersAuthorizationInteractor$authIfNeeded$1 = (ChargersAuthorizationInteractor$authIfNeeded$1) continuationImpl;
            int i2 = chargersAuthorizationInteractor$authIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAuthorizationInteractor$authIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersAuthorizationInteractor$authIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAuthorizationInteractor$authIfNeeded$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.chargers.domain.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!aVar.b()) {
                        chargersAuthorizationInteractor$authIfNeeded$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(chargersAuthorizationInteractor$authIfNeeded$1));
                        Ref$ObjectRef y = b64.y(j18Var);
                        vj vjVar = new vj(5, y);
                        cl7 cl7Var = new cl7(j18Var, vjVar);
                        e.e(this.a, new un9(0, new ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0)), Events$Zalogin$LoginContext.SCOOTERS);
                        y.element = uj.y;
                        if (cl7Var.c()) {
                            vjVar.invoke();
                        } else {
                            j18Var.w(new wj(cl7Var, 5));
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                jqr c = aVar.c();
                ChargersAuthorizationInteractor$authIfNeeded$3 chargersAuthorizationInteractor$authIfNeeded$3 = new ChargersAuthorizationInteractor$authIfNeeded$3(2, null);
                chargersAuthorizationInteractor$authIfNeeded$1.label = 2;
                return kotlinx.coroutines.flow.e.x(c, chargersAuthorizationInteractor$authIfNeeded$3, chargersAuthorizationInteractor$authIfNeeded$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        chargersAuthorizationInteractor$authIfNeeded$1 = new ChargersAuthorizationInteractor$authIfNeeded$1(this, continuationImpl);
        Object obj2 = chargersAuthorizationInteractor$authIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAuthorizationInteractor$authIfNeeded$1.label;
        zy11 zy11Var2 = zy11.a;
        com.yandex.go.chargers.domain.a aVar2 = this.b;
        if (i != 0) {
        }
        jqr c2 = aVar2.c();
        ChargersAuthorizationInteractor$authIfNeeded$3 chargersAuthorizationInteractor$authIfNeeded$32 = new ChargersAuthorizationInteractor$authIfNeeded$3(2, null);
        chargersAuthorizationInteractor$authIfNeeded$1.label = 2;
        if (kotlinx.coroutines.flow.e.x(c2, chargersAuthorizationInteractor$authIfNeeded$32, chargersAuthorizationInteractor$authIfNeeded$1) != coroutineSingletons2) {
        }
    }
}
