package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class u implements tpr {
    public final /* synthetic */ jqr a;

    public u(jqr jqrVar) {
        this.a = jqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1 superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1) {
            superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1 = (SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar);
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.L$1 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.L$2 = null;
                    superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(tVar, superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1 = new SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
