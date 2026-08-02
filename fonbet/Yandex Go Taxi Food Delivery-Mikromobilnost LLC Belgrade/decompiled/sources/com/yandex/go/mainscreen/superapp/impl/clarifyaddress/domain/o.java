package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class o implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ v b;

    public o(tpr tprVar, v vVar) {
        this.a = tprVar;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1 superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1) {
            superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1 = (SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b);
                    superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(nVar, superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1 = new SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
