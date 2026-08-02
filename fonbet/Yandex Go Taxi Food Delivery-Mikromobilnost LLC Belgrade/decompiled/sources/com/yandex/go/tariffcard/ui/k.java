package com.yandex.go.tariffcard.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ i a;

    public k(i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1 tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1) {
            tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1 = (TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.L$0 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.L$1 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.L$2 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.label = 1;
                    if (this.a.collect(jVar, tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1 = new TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1(this, continuation);
        Object obj2 = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
