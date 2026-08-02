package com.yandex.go.places.impl.ui.nearby.flex;

import defpackage.c9c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.nearby.flex.NearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1", f = "NearbyFlexPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class NearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ tj50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1(tj50 tj50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tj50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1 nearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1 = (NearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nearbyFlexPresenter$flexRouter$2$2$onDocumentRendered$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tj50 tj50Var = this.this$0;
        if (!tj50Var.Q) {
            tj50Var.Q = true;
            ((c9c0) tj50Var.T.getValue()).b0(tj50Var.Q);
        }
        return zy11.a;
    }
}
