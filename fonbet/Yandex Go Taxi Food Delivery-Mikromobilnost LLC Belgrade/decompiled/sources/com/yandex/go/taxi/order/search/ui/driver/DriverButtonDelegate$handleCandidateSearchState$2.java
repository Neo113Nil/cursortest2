package com.yandex.go.taxi.order.search.ui.driver;

import android.view.View;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import defpackage.bim;
import defpackage.dim;
import defpackage.eim;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wqj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.ui.driver.DriverButtonDelegate$handleCandidateSearchState$2", f = "DriverButtonDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DriverButtonDelegate$handleCandidateSearchState$2 extends SuspendLambda implements wls {
    final /* synthetic */ SearchInfoResponse$TaxiSearch.CandidateSearchState $state;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverButtonDelegate$handleCandidateSearchState$2(SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$state = candidateSearchState;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriverButtonDelegate$handleCandidateSearchState$2(this.$state, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriverButtonDelegate$handleCandidateSearchState$2 driverButtonDelegate$handleCandidateSearchState$2 = (DriverButtonDelegate$handleCandidateSearchState$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        driverButtonDelegate$handleCandidateSearchState$2.invokeSuspend(zy11Var);
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
        int i = bim.a[this.$state.ordinal()];
        if (i == 1) {
            eim eimVar = this.this$0.e;
            eimVar.getClass();
            dim dimVar = new dim(eimVar, 0);
            View view = (View) eimVar.d.get();
            if (view != null) {
                view.postDelayed(new wqj(8, eimVar, dimVar), 200L);
            }
        } else if (i == 2) {
            eim eimVar2 = this.this$0.e;
            eimVar2.b.cancel();
            View view2 = (View) eimVar2.d.get();
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
        }
        return zy11.a;
    }
}
