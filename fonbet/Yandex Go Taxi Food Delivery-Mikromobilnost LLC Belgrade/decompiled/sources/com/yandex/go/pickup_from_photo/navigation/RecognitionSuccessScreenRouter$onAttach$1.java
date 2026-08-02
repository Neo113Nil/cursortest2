package com.yandex.go.pickup_from_photo.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.cbg0;
import defpackage.cpb0;
import defpackage.cwa1;
import defpackage.dpb0;
import defpackage.epb0;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.uob0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lpv0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lkotlin/Result;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.navigation.RecognitionSuccessScreenRouter$onAttach$1", f = "RecognitionSuccessScreenRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RecognitionSuccessScreenRouter$onAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognitionSuccessScreenRouter$onAttach$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RecognitionSuccessScreenRouter$onAttach$1 recognitionSuccessScreenRouter$onAttach$1 = new RecognitionSuccessScreenRouter$onAttach$1(this.this$0, continuation);
        recognitionSuccessScreenRouter$onAttach$1.L$0 = ((Result) obj).getValue();
        return recognitionSuccessScreenRouter$onAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RecognitionSuccessScreenRouter$onAttach$1 recognitionSuccessScreenRouter$onAttach$1 = (RecognitionSuccessScreenRouter$onAttach$1) create(new Result(((Result) obj).getValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        recognitionSuccessScreenRouter$onAttach$1.invokeSuspend(zy11Var);
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
            Address address = pv0Var.a;
            d dVar = this.this$0;
            epb0 epb0Var = dVar.P;
            dpb0 dpb0Var = (dpb0) epb0Var.a.getValue();
            pv0 pv0Var2 = dpb0Var instanceof cpb0 ? ((cpb0) dpb0Var).a : null;
            if (!jl40.l(address.B(), pv0Var2 != null ? pv0Var2.a.B() : null)) {
                ((gh00) dVar.N).C(cwa1.d(address.B()));
                dVar.r(new cbg0(27));
                epb0Var.a(new uob0(pv0Var));
            }
        }
        return zy11.a;
    }
}
