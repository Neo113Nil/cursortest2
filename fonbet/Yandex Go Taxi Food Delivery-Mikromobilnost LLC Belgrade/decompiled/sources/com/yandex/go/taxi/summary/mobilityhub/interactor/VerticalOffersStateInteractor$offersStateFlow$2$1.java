package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import defpackage.jl40;
import defpackage.ku60;
import defpackage.lu60;
import defpackage.mu60;
import defpackage.mvg;
import defpackage.nu60;
import defpackage.ny61;
import defpackage.ou60;
import defpackage.pz40;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou60;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lou60;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.VerticalOffersStateInteractor$offersStateFlow$2$1", f = "VerticalOffersStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalOffersStateInteractor$offersStateFlow$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ pz40 $lastResponse;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalOffersStateInteractor$offersStateFlow$2$1(pz40 pz40Var, Continuation continuation) {
        super(2, continuation);
        this.$lastResponse = pz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalOffersStateInteractor$offersStateFlow$2$1 verticalOffersStateInteractor$offersStateFlow$2$1 = new VerticalOffersStateInteractor$offersStateFlow$2$1(this.$lastResponse, continuation);
        verticalOffersStateInteractor$offersStateFlow$2$1.L$0 = obj;
        return verticalOffersStateInteractor$offersStateFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalOffersStateInteractor$offersStateFlow$2$1 verticalOffersStateInteractor$offersStateFlow$2$1 = (VerticalOffersStateInteractor$offersStateFlow$2$1) create((ou60) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalOffersStateInteractor$offersStateFlow$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ou60 ou60Var = (ou60) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(ou60Var, ku60.a) || (ou60Var instanceof nu60)) {
            ((r0) this.$lastResponse).l(null);
        } else if (ou60Var instanceof lu60) {
            pz40 pz40Var = this.$lastResponse;
            MobilityHubScreenResponse mobilityHubScreenResponse = ((lu60) ou60Var).a;
            r0 r0Var = (r0) pz40Var;
            r0Var.getClass();
            r0Var.m(null, mobilityHubScreenResponse);
        } else if (!(ou60Var instanceof mu60)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
