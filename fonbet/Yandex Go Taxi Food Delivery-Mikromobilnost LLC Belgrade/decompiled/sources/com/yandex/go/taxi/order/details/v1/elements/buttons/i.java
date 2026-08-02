package com.yandex.go.taxi.order.details.v1.elements.buttons;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.fh70;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class i {
    public final o2y0 a;
    public final fh70 b;

    public i(o2y0 o2y0Var, fh70 fh70Var) {
        this.a = o2y0Var;
        this.b = fh70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DetailsCardButtonsInteractor$awaitButtonsInitialization$1 detailsCardButtonsInteractor$awaitButtonsInitialization$1;
        int i;
        if (continuationImpl instanceof DetailsCardButtonsInteractor$awaitButtonsInitialization$1) {
            detailsCardButtonsInteractor$awaitButtonsInitialization$1 = (DetailsCardButtonsInteractor$awaitButtonsInitialization$1) continuationImpl;
            int i2 = detailsCardButtonsInteractor$awaitButtonsInitialization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailsCardButtonsInteractor$awaitButtonsInitialization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailsCardButtonsInteractor$awaitButtonsInitialization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailsCardButtonsInteractor$awaitButtonsInitialization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.order.superapp.orders.c d = ((com.yandex.go.taxi.order.superapp.orders.h) this.b).d(this.a, OrderScreen.ORDER_DETAILS);
                    detailsCardButtonsInteractor$awaitButtonsInitialization$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(d, detailsCardButtonsInteractor$awaitButtonsInitialization$1) == coroutineSingletons) {
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
        detailsCardButtonsInteractor$awaitButtonsInitialization$1 = new DetailsCardButtonsInteractor$awaitButtonsInitialization$1(this, continuationImpl);
        Object obj2 = detailsCardButtonsInteractor$awaitButtonsInitialization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailsCardButtonsInteractor$awaitButtonsInitialization$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
