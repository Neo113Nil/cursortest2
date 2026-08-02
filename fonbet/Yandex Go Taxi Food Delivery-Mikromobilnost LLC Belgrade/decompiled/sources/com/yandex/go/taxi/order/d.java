package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zb6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;

    public d(vpr vprVar, p pVar) {
        this.a = vprVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1 bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1) {
            bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1 = (BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1) continuation;
            int i2 = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    DriverCandidate driverCandidate = (DriverCandidate) obj;
                    this.b.getClass();
                    zb6 zb6Var = driverCandidate != null ? new zb6(driverCandidate.e, driverCandidate.f, driverCandidate.g, false) : null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.L$0 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.L$1 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.L$2 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.L$3 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(zb6Var, bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1) == coroutineSingletons) {
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
        bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1 = new BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1(this, continuation);
        Object obj22 = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
