package com.yandex.go.rida.bids.interactor;

import defpackage.as5;
import defpackage.ems;
import defpackage.ewz0;
import defpackage.gq5;
import defpackage.jh00;
import defpackage.kp5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vq5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lgq5;", "driveCardUiState", "Lvq5;", "bidsListUiState", "Lkp5;", "boostButtonUiState", "Lewz0;", "topContentHeight", "Ljh00;", "mapDecorationUiState", "Las5;", "<anonymous>", "(Lgq5;Lvq5;Lkp5;Lewz0;Ljh00;)Las5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsUiStateInteractor$uiStateFlow$1", f = "BidsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    public BidsUiStateInteractor$uiStateFlow$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        BidsUiStateInteractor$uiStateFlow$1 bidsUiStateInteractor$uiStateFlow$1 = new BidsUiStateInteractor$uiStateFlow$1((Continuation) obj6);
        bidsUiStateInteractor$uiStateFlow$1.L$0 = (gq5) obj;
        bidsUiStateInteractor$uiStateFlow$1.L$1 = (vq5) obj2;
        bidsUiStateInteractor$uiStateFlow$1.L$2 = (kp5) obj3;
        bidsUiStateInteractor$uiStateFlow$1.L$3 = (ewz0) obj4;
        bidsUiStateInteractor$uiStateFlow$1.L$4 = (jh00) obj5;
        return bidsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gq5 gq5Var = (gq5) this.L$0;
        vq5 vq5Var = (vq5) this.L$1;
        kp5 kp5Var = (kp5) this.L$2;
        ewz0 ewz0Var = (ewz0) this.L$3;
        jh00 jh00Var = (jh00) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new as5(gq5Var, vq5Var, !vq5Var.a.a.isEmpty(), kp5Var, ewz0Var, jh00Var, ewz0Var.a);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
