package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu60;
import defpackage.pz40;
import defpackage.qu60;
import defpackage.ru60;
import defpackage.su60;
import defpackage.tu60;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltu60;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltu60;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractorV2$offersStateFlow$2$2", f = "VerticalOffersStateInteractorV2.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractorV2$offersStateFlow$2$2 extends SuspendLambda implements wls {
    final /* synthetic */ pz40 $lastResponse;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractorV2$offersStateFlow$2$2(pz40 pz40Var, Continuation continuation) {
        super(2, continuation);
        this.$lastResponse = pz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalOffersStateInteractorV2$offersStateFlow$2$2 verticalOffersStateInteractorV2$offersStateFlow$2$2 = new VerticalOffersStateInteractorV2$offersStateFlow$2$2(this.$lastResponse, continuation);
        verticalOffersStateInteractorV2$offersStateFlow$2$2.L$0 = obj;
        return verticalOffersStateInteractorV2$offersStateFlow$2$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalOffersStateInteractorV2$offersStateFlow$2$2 verticalOffersStateInteractorV2$offersStateFlow$2$2 = (VerticalOffersStateInteractorV2$offersStateFlow$2$2) create((tu60) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalOffersStateInteractorV2$offersStateFlow$2$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tu60 tu60Var = (tu60) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(tu60Var, pu60.a) || (tu60Var instanceof su60)) {
            ((r0) this.$lastResponse).l(null);
        } else if (tu60Var instanceof qu60) {
            pz40 pz40Var = this.$lastResponse;
            HubScreenResponseV2 hubScreenResponseV2 = ((qu60) tu60Var).a;
            r0 r0Var = (r0) pz40Var;
            r0Var.getClass();
            r0Var.m(null, hubScreenResponseV2);
        } else if (!(tu60Var instanceof ru60)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
