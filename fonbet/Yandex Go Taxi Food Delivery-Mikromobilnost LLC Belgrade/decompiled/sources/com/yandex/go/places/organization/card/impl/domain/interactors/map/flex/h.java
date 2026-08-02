package com.yandex.go.places.organization.card.impl.domain.interactors.map.flex;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrganizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1 organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrganizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1) {
            organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1 = (OrganizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1) continuation;
            int i2 = organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Point F = ru.yandex.taxi.map.utils.a.F(((com.yandex.go.places.models.data.entities.network.map.e) ((Pair) obj).getSecond()).getB());
                    organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.L$0 = null;
                    organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.L$1 = null;
                    organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.L$2 = null;
                    organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.L$3 = null;
                    organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(F, organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1 = new OrganizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardsSliderFlexMapInteractor$getSelectedPointFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
