package com.yandex.go.taxi.order.multi.tracking;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x6y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "errorHeight", "nonErrorHeight", "", "orderHasQueue", "organisationsCardOpened", "Lzy11;", "<anonymous>", "(IIZZ)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter$attachView$4", f = "TaxiOrderTrackingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderTrackingPresenter$attachView$4 extends SuspendLambda implements dms {
    final /* synthetic */ x6y0 $mvpView;
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingPresenter$attachView$4(x6y0 x6y0Var, i iVar, Continuation continuation) {
        super(5, continuation);
        this.$mvpView = x6y0Var;
        this.this$0 = iVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        TaxiOrderTrackingPresenter$attachView$4 taxiOrderTrackingPresenter$attachView$4 = new TaxiOrderTrackingPresenter$attachView$4(this.$mvpView, this.this$0, (Continuation) obj5);
        taxiOrderTrackingPresenter$attachView$4.I$0 = intValue;
        taxiOrderTrackingPresenter$attachView$4.I$1 = intValue2;
        taxiOrderTrackingPresenter$attachView$4.Z$0 = booleanValue;
        taxiOrderTrackingPresenter$attachView$4.Z$1 = booleanValue2;
        zy11 zy11Var = zy11.a;
        taxiOrderTrackingPresenter$attachView$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        int i2 = this.I$1;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z || z2) {
            x6y0 x6y0Var = this.$mvpView;
            ((com.yandex.go.taxi.order.queue.interactor.c) this.this$0.B).getClass();
            x6y0Var.Ob(i2 / 2);
            x6y0 x6y0Var2 = this.$mvpView;
            ((com.yandex.go.taxi.order.queue.interactor.c) this.this$0.B).getClass();
            x6y0Var2.Cb(i / 2);
            this.$mvpView.x2();
        } else {
            this.$mvpView.Ob(i2);
            this.$mvpView.Cb(i);
        }
        return zy11.a;
    }
}
