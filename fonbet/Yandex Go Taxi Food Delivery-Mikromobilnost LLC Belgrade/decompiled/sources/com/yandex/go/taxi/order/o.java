package com.yandex.go.taxi.order;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ p b;

    public o(jqr jqrVar, p pVar) {
        this.a = jqrVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1 bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1;
        int i;
        if (continuation instanceof BottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1) {
            bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1 = (BottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1) continuation;
            int i2 = bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b);
                    bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.L$0 = null;
                    bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.L$1 = null;
                    bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.L$2 = null;
                    bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.label = 1;
                    if (this.a.collect(nVar, bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1) == coroutineSingletons) {
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
        bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1 = new BottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1(this, continuation);
        Object obj2 = bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomCircleButtonsViewPresenter$observeTransportInfoButtonData$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
