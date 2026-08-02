package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class k implements tpr {
    public final /* synthetic */ jqr a;

    public k(jqr jqrVar) {
        this.a = jqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1 superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1) {
            superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1 = (SuperAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.L$1 = null;
                    superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.L$2 = null;
                    superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(jVar, superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1 = new SuperAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$listenToAddress$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
