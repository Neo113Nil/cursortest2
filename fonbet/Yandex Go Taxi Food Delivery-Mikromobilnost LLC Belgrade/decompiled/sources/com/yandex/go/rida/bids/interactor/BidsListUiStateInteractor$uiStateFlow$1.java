package com.yandex.go.rida.bids.interactor;

import defpackage.bpl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vq5;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbpl0;", "Ltq5;", "bidsList", "", "isChangesLocked", "Lvq5;", "<anonymous>", "(Lbpl0;Z)Lvq5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsListUiStateInteractor$uiStateFlow$1", f = "BidsListUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsListUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        BidsListUiStateInteractor$uiStateFlow$1 bidsListUiStateInteractor$uiStateFlow$1 = new BidsListUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        bidsListUiStateInteractor$uiStateFlow$1.L$0 = (bpl0) obj;
        bidsListUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        return bidsListUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bpl0 bpl0Var = (bpl0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new vq5(bpl0Var, !z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
