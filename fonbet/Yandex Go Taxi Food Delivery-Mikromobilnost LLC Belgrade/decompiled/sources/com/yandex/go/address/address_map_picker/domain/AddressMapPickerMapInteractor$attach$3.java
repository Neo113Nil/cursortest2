package com.yandex.go.address.address_map_picker.domain;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lpv0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lkotlin/Result;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerMapInteractor$attach$3", f = "AddressMapPickerMapInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapInteractor$attach$3 extends SuspendLambda implements wls {
    final /* synthetic */ f $overlayInteractor;
    final /* synthetic */ tse $scope;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapInteractor$attach$3(e eVar, tse tseVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$scope = tseVar;
        this.$overlayInteractor = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerMapInteractor$attach$3 addressMapPickerMapInteractor$attach$3 = new AddressMapPickerMapInteractor$attach$3(this.this$0, this.$scope, this.$overlayInteractor, continuation);
        addressMapPickerMapInteractor$attach$3.L$0 = ((Result) obj).getValue();
        return addressMapPickerMapInteractor$attach$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerMapInteractor$attach$3 addressMapPickerMapInteractor$attach$3 = (AddressMapPickerMapInteractor$attach$3) create(new Result(((Result) obj).getValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerMapInteractor$attach$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        pv0 pv0Var = (pv0) obj2;
        if (pv0Var != null) {
            e eVar = this.this$0;
            tse tseVar = this.$scope;
            f fVar = this.$overlayInteractor;
            pzt0 pzt0Var = eVar.g;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            eVar.g = tje.N(tseVar, null, null, new AddressMapPickerMapInteractor$attach$3$1$1(fVar, pv0Var, eVar, null), 3);
        }
        return zy11.a;
    }
}
