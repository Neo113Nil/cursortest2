package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportTrackingCardUiStateInteractor$buildAddresses$2", f = "TransportTrackingCardUiStateInteractor.kt", l = {111, 112}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardUiStateInteractor$buildAddresses$2 extends SuspendLambda implements wls {
    final /* synthetic */ Address $destAddress;
    final /* synthetic */ Point $endPoint;
    final /* synthetic */ Point $startPoint;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiStateInteractor$buildAddresses$2(s sVar, Point point, Address address, Point point2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$startPoint = point;
        this.$destAddress = address;
        this.$endPoint = point2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$buildAddresses$2 transportTrackingCardUiStateInteractor$buildAddresses$2 = new TransportTrackingCardUiStateInteractor$buildAddresses$2(this.this$0, this.$startPoint, this.$destAddress, this.$endPoint, continuation);
        transportTrackingCardUiStateInteractor$buildAddresses$2.L$0 = obj;
        return transportTrackingCardUiStateInteractor$buildAddresses$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportTrackingCardUiStateInteractor$buildAddresses$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh h;
        List a;
        List list;
        List list2;
        List list3;
        List list4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new TransportTrackingCardUiStateInteractor$buildAddresses$2$startAddress$1(this.this$0, this.$startPoint, null), 3);
            h = tje.h(tseVar, null, null, new TransportTrackingCardUiStateInteractor$buildAddresses$2$endAddress$1(this.$destAddress, this.this$0, this.$endPoint, null), 3);
            a = rcc.a();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = a;
            this.L$4 = a;
            this.L$5 = a;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                list = a;
                list2 = list;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = (List) this.L$5;
            list4 = (List) this.L$3;
            kotlin.b.b(obj);
            list3.add(obj);
            return ((ListBuilder) list4).j();
        }
        a = (List) this.L$5;
        list = (List) this.L$4;
        list2 = (List) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        a.add(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = list2;
        this.L$4 = null;
        this.L$5 = list;
        this.label = 2;
        obj = h.k(this);
        if (obj != coroutineSingletons) {
            list3 = list;
            list4 = list2;
            list3.add(obj);
            return ((ListBuilder) list4).j();
        }
        return coroutineSingletons;
    }
}
