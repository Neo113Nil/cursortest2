package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ ru.yandex.taxi.persuggest.source.l a;

    public e(ru.yandex.taxi.persuggest.source.l lVar) {
        this.a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ClarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1 clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof ClarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1) {
            clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1 = (ClarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1 = new ClarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifyAddressInteractor$unsupportedAddressFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
