package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.j1w0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;

    public t(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1 superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1) {
            superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1 = (SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j1w0 j1w0Var = new j1w0((mo21) obj, false);
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.L$1 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.L$2 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.L$3 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(j1w0Var, superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1 = new SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
