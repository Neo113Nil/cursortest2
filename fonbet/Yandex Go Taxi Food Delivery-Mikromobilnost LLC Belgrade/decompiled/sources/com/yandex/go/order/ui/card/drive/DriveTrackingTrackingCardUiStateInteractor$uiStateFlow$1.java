package com.yandex.go.order.ui.card.drive;

import defpackage.avc0;
import defpackage.bvc0;
import defpackage.hn70;
import defpackage.jem;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sm70;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yn70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyn70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.ui.card.drive.DriveTrackingTrackingCardUiStateInteractor$uiStateFlow$1", f = "DriveTrackingTrackingCardUiStateInteractor.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveTrackingTrackingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ jem $tracking;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveTrackingTrackingCardUiStateInteractor$uiStateFlow$1(jem jemVar, Continuation continuation) {
        super(2, continuation);
        this.$tracking = jemVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriveTrackingTrackingCardUiStateInteractor$uiStateFlow$1 driveTrackingTrackingCardUiStateInteractor$uiStateFlow$1 = new DriveTrackingTrackingCardUiStateInteractor$uiStateFlow$1(this.$tracking, continuation);
        driveTrackingTrackingCardUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return driveTrackingTrackingCardUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveTrackingTrackingCardUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$tracking.h;
            avc0 avc0Var = new avc0();
            jem jemVar = this.$tracking;
            avc0Var.b = jemVar.f;
            sm70 sm70Var = new sm70(new bvc0(avc0Var), null, str, new Integer(jemVar.i), null, null, 114);
            jem jemVar2 = this.$tracking;
            hn70 hn70Var = new hn70(jemVar2.d, null, null, null, null, false, null, jemVar2.e, null, null, sm70Var, false, 0, null, false, 0L, 0L, null, 2094846);
            yn70 yn70Var = new yn70(hn70Var, null, null, null, null, null, 510);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (vprVar.emit(yn70Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
