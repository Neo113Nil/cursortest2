package com.yandex.go.payments.shared;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.tmr0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;
    public final /* synthetic */ String c;

    public r(vpr vprVar, v vVar, String str) {
        this.a = vprVar;
        this.b = vVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1 sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof SharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1) {
            sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1 = (SharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1) continuation;
            int i2 = sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = this.b.i.a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((tmr0) obj2).a, this.c)) {
                            break;
                        }
                    }
                    sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.L$0 = null;
                    sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.L$1 = null;
                    sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.L$2 = null;
                    sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.L$3 = null;
                    sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1 = new SharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1(this, continuation);
        Object obj32 = sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$getSharedAccountTypeById$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
