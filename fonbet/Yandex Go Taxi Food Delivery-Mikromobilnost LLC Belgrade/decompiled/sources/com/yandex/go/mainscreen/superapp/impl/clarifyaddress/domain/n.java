package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.c34;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;

    public n(vpr vprVar, v vVar) {
        this.a = vprVar;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1 superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1) {
            superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1 = (SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj).getValue();
                    boolean z = value instanceof Result.Failure;
                    if (z) {
                        c34 c34Var = (c34) this.b.m.get();
                        Throwable a = Result.a(value);
                        if (a == null) {
                            a = new IllegalArgumentException("Some super unknown error");
                        }
                        c34Var.getClass();
                        c34.a(a, "Error while listening address change point A");
                    }
                    if (z) {
                        value = null;
                    }
                    if (value != null) {
                        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(value, superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1 = new SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
