package com.yandex.go.places.impl.ui.main;

import com.yandex.go.places.impl.domain.interactors.address.PlacesAddressInteractor$updateAddress$$inlined$safeCollect$1;
import defpackage.dt20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.DiscoveryMainPresenter$initFlexRouter$2$onDocumentLoadingFinished$1", f = "DiscoveryMainPresenter.kt", l = {215}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryMainPresenter$initFlexRouter$2$onDocumentLoadingFinished$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryMainPresenter$initFlexRouter$2$onDocumentLoadingFinished$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryMainPresenter$initFlexRouter$2$onDocumentLoadingFinished$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryMainPresenter$initFlexRouter$2$onDocumentLoadingFinished$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            if (!dVar.p0) {
                dt20 dt20Var = dVar.o0;
                this.label = 1;
                if (new o(new com.yandex.go.places.impl.domain.interactors.address.b(new com.yandex.go.places.impl.domain.interactors.address.d(((com.yandex.go.route.interactor.b) dt20Var.b).k()), dt20Var), new PlacesAddressInteractor$updateAddress$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new com.yandex.go.places.impl.domain.interactors.address.e(dt20Var), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.p0 = true;
        return zy11.a;
    }
}
