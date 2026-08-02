package com.yandex.go.places.address.loader.impl.modal;

import com.yandex.go.places.address.loader.impl.domain.interactors.a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w4c0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpv0;", "<anonymous>", "(Ltse;)Lpv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1", f = "PlacesAddressLoaderPresenter.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ w4c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1(w4c0 w4c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w4c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        w4c0 w4c0Var = this.this$0;
        a aVar = w4c0Var.B;
        zzs zzsVar = w4c0Var.x;
        RoutePointType routePointType = w4c0Var.y;
        String str = w4c0Var.z;
        this.label = 1;
        Object a = aVar.a(zzsVar, str, this, routePointType);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
