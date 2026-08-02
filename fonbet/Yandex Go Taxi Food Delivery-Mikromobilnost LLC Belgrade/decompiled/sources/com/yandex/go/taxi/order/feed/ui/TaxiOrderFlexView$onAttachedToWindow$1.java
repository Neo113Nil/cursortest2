package com.yandex.go.taxi.order.feed.ui;

import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import defpackage.gym;
import defpackage.k7y0;
import defpackage.l7s0;
import defpackage.m7y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q1y0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isError", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView$onAttachedToWindow$1", f = "TaxiOrderFlexView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderFlexView$onAttachedToWindow$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TaxiOrderFlexView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFlexView$onAttachedToWindow$1(TaxiOrderFlexView taxiOrderFlexView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = taxiOrderFlexView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderFlexView$onAttachedToWindow$1 taxiOrderFlexView$onAttachedToWindow$1 = new TaxiOrderFlexView$onAttachedToWindow$1(this.this$0, continuation);
        taxiOrderFlexView$onAttachedToWindow$1.Z$0 = ((Boolean) obj).booleanValue();
        return taxiOrderFlexView$onAttachedToWindow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        TaxiOrderFlexView$onAttachedToWindow$1 taxiOrderFlexView$onAttachedToWindow$1 = (TaxiOrderFlexView$onAttachedToWindow$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderFlexView$onAttachedToWindow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q1y0 q1y0Var;
        m7y0 m7y0Var;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (!z) {
            this.this$0.renderErrorState(false);
        }
        q1y0Var = this.this$0.flexViewCallback;
        m7y0Var = ((TaxiOrderFeedView) ((l7s0) ((gym) q1y0Var).a).a).delegate;
        ((k7y0) m7y0Var).a.updateNestedScrollingChild(true);
        return zy11.a;
    }
}
