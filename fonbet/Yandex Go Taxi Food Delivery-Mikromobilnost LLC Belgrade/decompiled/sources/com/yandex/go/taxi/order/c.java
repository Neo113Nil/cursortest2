package com.yandex.go.taxi.order;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ eci0 a;

    public c(eci0 eci0Var) {
        this.a = eci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1 bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1;
        int i;
        if (continuation instanceof BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1) {
            bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1 = (BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1) continuation;
            int i2 = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.L$0 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.L$1 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.L$2 = null;
                    bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(bVar, bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1) == coroutineSingletons) {
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
        bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1 = new BottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1(this, continuation);
        Object obj2 = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomCircleButtonsViewPresenter$observeCandidateButtonData$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
