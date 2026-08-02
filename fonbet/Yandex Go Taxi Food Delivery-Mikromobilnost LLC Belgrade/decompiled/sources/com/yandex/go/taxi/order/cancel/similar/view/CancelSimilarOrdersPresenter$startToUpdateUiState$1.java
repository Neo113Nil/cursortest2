package com.yandex.go.taxi.order.cancel.similar.view;

import com.yandex.go.taxi.order.cancel.similar.interactor.CancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$safeCollect$1;
import com.yandex.go.taxi.order.cancel.similar.interactor.g;
import com.yandex.go.taxi.order.cancel.similar.interactor.h;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.titles.f;
import defpackage.j08;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.similar.view.CancelSimilarOrdersPresenter$startToUpdateUiState$1", f = "CancelSimilarOrdersPresenter.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CancelSimilarOrdersPresenter$startToUpdateUiState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j08 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSimilarOrdersPresenter$startToUpdateUiState$1(j08 j08Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelSimilarOrdersPresenter$startToUpdateUiState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelSimilarOrdersPresenter$startToUpdateUiState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            h hVar = this.this$0.z;
            this.label = 1;
            f a = hVar.e.a();
            mth mthVar = new mth(new com.yandex.go.taxi.order.cancel.similar.interactor.f(((a) hVar.f).a(), hVar), 6);
            hVar.i.getClass();
            sjh sjhVar = uyj.a;
            if (new o(e.F(mthVar, mdh.b), new CancelSimilarOrdersFeatureInteractor$startToCollectUiState$$inlined$safeCollect$1(null, hVar)).collect(new g(a, hVar), this) == coroutineSingletons) {
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
