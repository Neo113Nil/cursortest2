package com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing;

import android.os.SystemClock;
import defpackage.hnk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing.RideCardSharingViewInteractor$trackUiStateFlow$2", f = "RideCardSharingViewInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardSharingViewInteractor$trackUiStateFlow$2 extends SuspendLambda implements wls {
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ hnk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardSharingViewInteractor$trackUiStateFlow$2(hnk0 hnk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hnk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardSharingViewInteractor$trackUiStateFlow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardSharingViewInteractor$trackUiStateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.this$0.b - elapsedRealtime;
            this.J$0 = elapsedRealtime;
            this.J$1 = j;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        hnk0 hnk0Var = this.this$0;
        tje.N(hnk0Var.h, null, null, new RideCardSharingViewInteractor$shareOrderAndExit$1(hnk0Var, null, null), 3);
        return zy11.a;
    }
}
