package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;

    public f(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrganizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1 organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrganizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1) {
            organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1 = (OrganizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1) continuation;
            int i2 = organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.L$0 = null;
                    organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.L$1 = null;
                    organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.L$2 = null;
                    organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1) == coroutineSingletons) {
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
        organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1 = new OrganizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1(this, continuation);
        Object obj2 = organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardsSliderPresenter$subscribeToUltimaModeChanges$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
