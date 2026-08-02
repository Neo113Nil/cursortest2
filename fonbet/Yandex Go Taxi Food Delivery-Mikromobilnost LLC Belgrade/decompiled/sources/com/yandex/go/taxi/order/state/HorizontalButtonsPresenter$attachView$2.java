package com.yandex.go.taxi.order.state;

import defpackage.a3y0;
import defpackage.hst;
import defpackage.ist;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lwh70;", "", "throwable", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.HorizontalButtonsPresenter$attachView$2", f = "HorizontalButtonsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HorizontalButtonsPresenter$attachView$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalButtonsPresenter$attachView$2(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HorizontalButtonsPresenter$attachView$2 horizontalButtonsPresenter$attachView$2 = new HorizontalButtonsPresenter$attachView$2(this.this$0, (Continuation) obj3);
        horizontalButtonsPresenter$attachView$2.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        horizontalButtonsPresenter$attachView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a3y0 a3y0Var = this.this$0.I;
        String l = a3y0Var.l(new String[]{"attachView", "updateAllowedOrderChanges"});
        hst hstVar = jst.e;
        String str = a3y0Var.a;
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a != null && a.b(20)) {
            a.a(20, str, th, "Can't update allow changes", m.a);
        }
        return zy11.a;
    }
}
