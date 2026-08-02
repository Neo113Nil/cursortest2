package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.qq80;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$buildAddresses$2$endAddress$1", f = "TransportTrackingCardUiStateInteractor.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardUiStateInteractor$buildAddresses$2$endAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $destAddress;
    final /* synthetic */ Point $endPoint;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$buildAddresses$2$endAddress$1(Address address, s sVar, Point point, Continuation continuation) {
        super(2, continuation);
        this.$destAddress = address;
        this.this$0 = sVar;
        this.$endPoint = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportTrackingCardUiStateInteractor$buildAddresses$2$endAddress$1(this.$destAddress, this.this$0, this.$endPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportTrackingCardUiStateInteractor$buildAddresses$2$endAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Address address = this.$destAddress;
            if (address != null) {
                return address;
            }
            g = ((ru.yandex.taxi.search.suggest.i) this.this$0.h).g(new zzs(this.$endPoint.getLatitude(), this.$endPoint.getLongitude(), 0, null, null, 28), "", RoutePointType.POINT_B, true, false, qq80.b, null);
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(g, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return ((pv0) obj).a;
    }
}
