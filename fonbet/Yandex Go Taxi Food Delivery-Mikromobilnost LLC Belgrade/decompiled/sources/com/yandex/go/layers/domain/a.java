package com.yandex.go.layers.domain;

import defpackage.ah00;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.fz1;
import defpackage.gh00;
import defpackage.j18;
import defpackage.ny61;
import defpackage.tqs;
import defpackage.uxx;
import defpackage.vj;
import defpackage.wj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class a {
    public final uxx a;
    public final ah00 b;

    public a(uxx uxxVar, ah00 ah00Var) {
        this.a = uxxVar;
        this.b = ah00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, tqs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Continuation continuation) {
        FinalizeAddressObjectsInteractor$waitToCameraMove$1 finalizeAddressObjectsInteractor$waitToCameraMove$1;
        int i;
        aVar.getClass();
        if (continuation instanceof FinalizeAddressObjectsInteractor$waitToCameraMove$1) {
            finalizeAddressObjectsInteractor$waitToCameraMove$1 = (FinalizeAddressObjectsInteractor$waitToCameraMove$1) continuation;
            int i2 = finalizeAddressObjectsInteractor$waitToCameraMove$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                finalizeAddressObjectsInteractor$waitToCameraMove$1.label = i2 - Integer.MIN_VALUE;
                Object obj = finalizeAddressObjectsInteractor$waitToCameraMove$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = finalizeAddressObjectsInteractor$waitToCameraMove$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    finalizeAddressObjectsInteractor$waitToCameraMove$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(finalizeAddressObjectsInteractor$waitToCameraMove$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(13, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    fz1 fz1Var = new fz1(1, new FinalizeAddressObjectsInteractor$waitToCameraMove$$inlined$suspendCallbackApi$2(cl7Var));
                    ((gh00) aVar.b).e(fz1Var);
                    y.element = new tqs(8, aVar, fz1Var);
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 13));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        finalizeAddressObjectsInteractor$waitToCameraMove$1 = new FinalizeAddressObjectsInteractor$waitToCameraMove$1(aVar, continuation);
        Object obj2 = finalizeAddressObjectsInteractor$waitToCameraMove$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = finalizeAddressObjectsInteractor$waitToCameraMove$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
