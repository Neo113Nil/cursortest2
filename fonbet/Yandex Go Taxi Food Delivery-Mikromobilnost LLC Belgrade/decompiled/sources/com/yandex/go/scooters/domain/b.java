package com.yandex.go.scooters.domain;

import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.j18;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.uj;
import defpackage.un9;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes13.dex */
public final class b {
    public final ru.yandex.taxi.am.e a;
    public final a b;

    public b(ru.yandex.taxi.am.e eVar, a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r1.s() == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersAuthorizationInteractor$authIfNeeded$1 scootersAuthorizationInteractor$authIfNeeded$1;
        int i;
        if (continuationImpl instanceof ScootersAuthorizationInteractor$authIfNeeded$1) {
            scootersAuthorizationInteractor$authIfNeeded$1 = (ScootersAuthorizationInteractor$authIfNeeded$1) continuationImpl;
            int i2 = scootersAuthorizationInteractor$authIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAuthorizationInteractor$authIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersAuthorizationInteractor$authIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAuthorizationInteractor$authIfNeeded$1.label;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!aVar.b()) {
                        scootersAuthorizationInteractor$authIfNeeded$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(scootersAuthorizationInteractor$authIfNeeded$1));
                        Ref$ObjectRef y = b64.y(j18Var);
                        cx60 cx60Var = new cx60(4, y);
                        cl7 cl7Var = new cl7(j18Var, cx60Var);
                        ru.yandex.taxi.am.e.e(this.a, new un9(3, new ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0)), Events$Zalogin$LoginContext.SCOOTERS);
                        y.element = uj.F;
                        if (cl7Var.c()) {
                            cx60Var.invoke();
                        } else {
                            j18Var.w(new dx60(cl7Var, 5));
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
                ScootersAuthorizationInteractor$authIfNeeded$3 scootersAuthorizationInteractor$authIfNeeded$3 = new ScootersAuthorizationInteractor$authIfNeeded$3(2, null);
                scootersAuthorizationInteractor$authIfNeeded$1.label = 2;
                return kotlinx.coroutines.flow.e.x(c, scootersAuthorizationInteractor$authIfNeeded$3, scootersAuthorizationInteractor$authIfNeeded$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        scootersAuthorizationInteractor$authIfNeeded$1 = new ScootersAuthorizationInteractor$authIfNeeded$1(this, continuationImpl);
        Object obj2 = scootersAuthorizationInteractor$authIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAuthorizationInteractor$authIfNeeded$1.label;
        zy11 zy11Var2 = zy11.a;
        a aVar2 = this.b;
        if (i != 0) {
        }
        jqr c2 = aVar2.c();
        ScootersAuthorizationInteractor$authIfNeeded$3 scootersAuthorizationInteractor$authIfNeeded$32 = new ScootersAuthorizationInteractor$authIfNeeded$3(2, null);
        scootersAuthorizationInteractor$authIfNeeded$1.label = 2;
        if (kotlinx.coroutines.flow.e.x(c2, scootersAuthorizationInteractor$authIfNeeded$32, scootersAuthorizationInteractor$authIfNeeded$1) != coroutineSingletons2) {
        }
    }
}
