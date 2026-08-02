package com.yandex.go.taxi.tariffs.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ com.yandex.go.taxi.tariffs.internal.repository.h a;
    public final /* synthetic */ String b;

    public k(com.yandex.go.taxi.tariffs.internal.repository.h hVar, String str) {
        this.a = hVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FindTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1 findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1;
        int i;
        if (continuation instanceof FindTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1) {
            findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1 = (FindTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1) continuation;
            int i2 = findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.L$0 = null;
                    findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.L$1 = null;
                    findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.L$2 = null;
                    findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1) == coroutineSingletons) {
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
        findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1 = new FindTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1(this, continuation);
        Object obj2 = findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = findTariffInteractorImpl$awaitVerticalDescriptionWithId$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
