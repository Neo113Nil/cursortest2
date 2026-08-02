package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.yir;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1 clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1) {
            clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1 = (ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1) continuation;
            int i2 = clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object a0 = kotlin.collections.a.a0(((yir) obj).d);
                    clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.L$0 = null;
                    clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.L$1 = null;
                    clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.L$2 = null;
                    clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.L$3 = null;
                    clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a0, clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1 = new ClarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifyAddressInteractor$clarifyAddressReasonFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
