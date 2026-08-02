package com.yandex.go.address_confirmation.modal;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.a821;
import defpackage.aat0;
import defpackage.cwa1;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lpv0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lkotlin/Result;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalViewPresenter$attachView$6", f = "SourceAddressConfirmationModalViewPresenter.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationModalViewPresenter$attachView$6 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationModalViewPresenter$attachView$6(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SourceAddressConfirmationModalViewPresenter$attachView$6 sourceAddressConfirmationModalViewPresenter$attachView$6 = new SourceAddressConfirmationModalViewPresenter$attachView$6(this.this$0, continuation);
        sourceAddressConfirmationModalViewPresenter$attachView$6.L$0 = ((Result) obj).getValue();
        return sourceAddressConfirmationModalViewPresenter$attachView$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourceAddressConfirmationModalViewPresenter$attachView$6) create(new Result(((Result) obj).getValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var;
        d dVar;
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (obj2 instanceof Result.Failure) {
                obj2 = null;
            }
            pv0Var = (pv0) obj2;
            if (pv0Var != null) {
                d dVar2 = this.this$0;
                ru.yandex.taxi.preorder.source.sourcepointzone.a aVar = dVar2.F;
                this.L$0 = null;
                this.L$1 = dVar2;
                this.L$2 = pv0Var;
                this.label = 1;
                if (aVar.a(pv0Var, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pv0Var = (pv0) this.L$2;
        dVar = (d) this.L$1;
        kotlin.b.b(obj);
        a821 a821Var = dVar.G;
        a821Var.getClass();
        Address address = pv0Var.a;
        Address address2 = pv0Var.a;
        a821Var.b.m(new ZoneAddress(address2, a821Var.a.f(address.getZoneName())), null);
        dVar.C.w(new aat0(pv0Var));
        ((gh00) dVar.x).C(cwa1.d(address2.B()));
        return zy11.a;
    }
}
