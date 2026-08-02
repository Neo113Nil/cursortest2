package com.yandex.go.address.search.common.presenter;

import com.yandex.go.address.models.Address;
import defpackage.ftj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p931;
import defpackage.q931;
import defpackage.r931;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestionsPresenter$onItemSelected$1", f = "SuggestionsPresenter.kt", l = {369}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestionsPresenter$onItemSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionsPresenter$onItemSelected$1(i iVar, Address address, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$address = address;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestionsPresenter$onItemSelected$1(this.this$0, this.$address, this.$index, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestionsPresenter$onItemSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuggestionsPresenter$onItemSelected$1 suggestionsPresenter$onItemSelected$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            com.yandex.go.address.search.common.domain.interactor.a aVar = iVar.N;
            Address address = this.$address;
            RoutePointType routePointType = iVar.H.a;
            PositionInitAction positionInitAction = PositionInitAction.SUGGEST;
            boolean z = iVar.D;
            this.label = 1;
            suggestionsPresenter$onItemSelected$1 = this;
            obj = aVar.b(address, routePointType, positionInitAction, z, suggestionsPresenter$onItemSelected$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            suggestionsPresenter$onItemSelected$1 = this;
        }
        r931 r931Var = (r931) obj;
        i iVar2 = suggestionsPresenter$onItemSelected$1.this$0;
        int i2 = suggestionsPresenter$onItemSelected$1.$index;
        Address address2 = suggestionsPresenter$onItemSelected$1.$address;
        if (r931Var instanceof p931) {
            iVar2.Dh(i2, address2, r931Var.a);
        } else {
            r931Var.getClass();
        }
        i iVar3 = suggestionsPresenter$onItemSelected$1.this$0;
        if (r931Var instanceof q931) {
            iVar3.Ng(new ftj0(r931Var.a));
        }
        return zy11.a;
    }
}
