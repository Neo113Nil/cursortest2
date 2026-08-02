package com.yandex.go.taxi.order.infosharing.ui;

import defpackage.mvg;
import defpackage.n5y0;
import defpackage.ny61;
import defpackage.o5y0;
import defpackage.p9g0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.ui.TaxiOrderScreenshotSharingPresenter$attachView$1", f = "TaxiOrderScreenshotSharingPresenter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderScreenshotSharingPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ n5y0 $mvpView;
    int label;
    final /* synthetic */ o5y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderScreenshotSharingPresenter$attachView$1(o5y0 o5y0Var, n5y0 n5y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o5y0Var;
        this.$mvpView = n5y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderScreenshotSharingPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderScreenshotSharingPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            o5y0 o5y0Var = this.this$0;
            n a = o5y0Var.B.a(o5y0Var.x);
            p9g0 p9g0Var = new p9g0(23, this.this$0, this.$mvpView);
            this.label = 1;
            if (a.collect(p9g0Var, this) == coroutineSingletons) {
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
