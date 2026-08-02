package com.yandex.go.tariffcard.ui;

import defpackage.f6v;
import defpackage.i6v;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1 tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1;
        int i;
        if (continuation instanceof TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1) {
            tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1 = (TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = ((i6v) obj).a;
                    if (obj3 == null) {
                        ny61.t("null cannot be cast to non-null type ru.yandex.taxi.requirements.utils.Identifiable<ru.yandex.taxi.requirements.TariffRequirementsEqualsKey, com.yandex.go.tariffcard.ui.model.CarouselWithPosition?>");
                        return null;
                    }
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.L$0 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.L$1 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.L$2 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.L$3 = null;
                    tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.label = 1;
                    if (this.a.emit((f6v) obj3, tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1) == coroutineSingletons) {
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
        tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1 = new TariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1(this, continuation);
        Object obj22 = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$carouselRequirementsDataFlow$$inlined$combineIdentifiable$default$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
