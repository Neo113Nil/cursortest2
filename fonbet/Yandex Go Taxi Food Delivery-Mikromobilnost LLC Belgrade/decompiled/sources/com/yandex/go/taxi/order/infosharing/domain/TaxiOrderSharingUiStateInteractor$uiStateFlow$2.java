package com.yandex.go.taxi.order.infosharing.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s2y0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lw5y0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.domain.TaxiOrderSharingUiStateInteractor$uiStateFlow$2", f = "TaxiOrderSharingUiStateInteractor.kt", l = {20, 20}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderSharingUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ s2y0 $model;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderSharingUiStateInteractor$uiStateFlow$2(e eVar, s2y0 s2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$model = s2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderSharingUiStateInteractor$uiStateFlow$2 taxiOrderSharingUiStateInteractor$uiStateFlow$2 = new TaxiOrderSharingUiStateInteractor$uiStateFlow$2(this.this$0, this.$model, continuation);
        taxiOrderSharingUiStateInteractor$uiStateFlow$2.L$0 = obj;
        return taxiOrderSharingUiStateInteractor$uiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderSharingUiStateInteractor$uiStateFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.a;
            s2y0 s2y0Var = this.$model;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = aVar.a(s2y0Var, true, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
