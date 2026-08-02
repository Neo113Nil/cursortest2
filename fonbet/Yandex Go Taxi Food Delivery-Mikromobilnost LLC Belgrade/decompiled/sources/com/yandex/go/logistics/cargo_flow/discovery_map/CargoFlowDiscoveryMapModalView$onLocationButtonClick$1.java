package com.yandex.go.logistics.cargo_flow.discovery_map;

import defpackage.ah00;
import defpackage.gh00;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.discovery_map.CargoFlowDiscoveryMapModalView$onLocationButtonClick$1", f = "CargoFlowDiscoveryMapModalView.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class CargoFlowDiscoveryMapModalView$onLocationButtonClick$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ CargoFlowDiscoveryMapModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFlowDiscoveryMapModalView$onLocationButtonClick$1(CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cargoFlowDiscoveryMapModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFlowDiscoveryMapModalView$onLocationButtonClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFlowDiscoveryMapModalView$onLocationButtonClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ah00 ah00Var;
        po21 po21Var;
        ah00 ah00Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ah00Var = this.this$0.mapController;
            po21Var = this.this$0.userLocationInteractor;
            this.L$0 = ah00Var;
            this.label = 1;
            Object h = ((e) po21Var).h(this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = h;
            ah00Var2 = ah00Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ah00Var2 = (ah00) this.L$0;
            b.b(obj);
        }
        ((gh00) ah00Var2).D(ru.yandex.taxi.map.utils.a.G((mo21) obj), 13.0f, 200.0f, null);
        return zy11.a;
    }
}
