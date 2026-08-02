package com.yandex.go.order.ui.card.linked;

import defpackage.bi;
import defpackage.hn70;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q48;
import defpackage.q5z;
import defpackage.sm70;
import defpackage.vpr;
import defpackage.web1;
import defpackage.wls;
import defpackage.y2y0;
import defpackage.yn70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyn70;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.ui.card.linked.TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1", f = "TaxiTrackingLinkedTrackingCardUiStateInteractor.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ y2y0 $tracking;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1(y2y0 y2y0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$tracking = y2y0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1 taxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1 = new TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1(this.$tracking, this.this$0, continuation);
        taxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return taxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sm70 sm70Var;
        String a;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y2y0 y2y0Var = this.$tracking;
            String str = y2y0Var.d;
            String str2 = y2y0Var.e;
            String str3 = y2y0Var.f;
            if (str3 == null || (a = ((m7x0) this.this$0.a).a(str3)) == null) {
                sm70Var = null;
            } else {
                y2y0 y2y0Var2 = this.$tracking;
                a aVar = this.this$0;
                q48 q48Var = y2y0Var2.g;
                Integer S = q5z.S(q48Var != null ? q48Var.c : null);
                bi biVar = new bi(aVar.b, 0);
                q48 q48Var2 = y2y0Var2.g;
                sm70Var = new sm70(q48Var2 != null ? q48Var2.c() : null, S, a, null, biVar, null, 104);
            }
            yn70 yn70Var = new yn70(new hn70(str, null, null, null, null, false, null, str2, null, null, sm70Var, web1.i(this.$tracking.g), 0, null, false, 0L, 0L, null, 2074366), null, null, null, null, null, 510);
            this.L$0 = null;
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
