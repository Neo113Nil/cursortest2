package com.yandex.go.taxi.order.details.v2.state.elements.share_location;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.v2;
import com.yandex.go.slot.dto.x2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ShareLocation;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bdc;
import defpackage.irs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1t;
import defpackage.wls;
import defpackage.xmk0;
import defpackage.xng0;
import defpackage.xss0;
import defpackage.yjk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1t;", "geoSharingConfig", "Lzjk0;", "<anonymous>", "(Lp1t;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.share_location.RideCardShareLocationItemDataSource$stateFlow$1", f = "RideCardShareLocationItemDataSource.kt", l = {45, 49, 53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardShareLocationItemDataSource$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$ShareLocation $item;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardShareLocationItemDataSource$stateFlow$1(RideCardItemDto$ShareLocation rideCardItemDto$ShareLocation, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$ShareLocation;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardShareLocationItemDataSource$stateFlow$1 rideCardShareLocationItemDataSource$stateFlow$1 = new RideCardShareLocationItemDataSource$stateFlow$1(this.$item, this.this$0, continuation);
        rideCardShareLocationItemDataSource$stateFlow$1.L$0 = obj;
        return rideCardShareLocationItemDataSource$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardShareLocationItemDataSource$stateFlow$1) create((p1t) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r0 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r0 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        if (r0 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        if (r0 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        if (r0 == r7) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        Object a;
        Object a2;
        Object e3;
        xss0 xss0Var;
        p1t p1tVar = (p1t) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            RideCardItemDto$ShareLocation rideCardItemDto$ShareLocation = this.$item;
            SlotItemDto slotItemDto = rideCardItemDto$ShareLocation.c;
            if (slotItemDto == null) {
                return new yjk0(rideCardItemDto$ShareLocation.a);
            }
            if (!(((x2) kotlin.collections.a.R(slotItemDto.e)) instanceof v2)) {
                a aVar = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                irs0 irs0Var = aVar.a;
                e3 = ((com.yandex.go.slot.mapper.a) irs0Var).e(slotItemDto, aVar.b, false, false, null, this);
            } else if (!p1tVar.a) {
                a aVar2 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                a2 = a.a(aVar2, slotItemDto, this);
            } else if (p1tVar.c) {
                a aVar3 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                a = a.a(aVar3, slotItemDto, this);
            } else {
                boolean z = p1tVar.b;
                a aVar4 = this.this$0;
                if (z) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    e2 = ((com.yandex.go.slot.mapper.a) aVar4.a).e(slotItemDto, aVar4.b, true, true, null, this);
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    e = ((com.yandex.go.slot.mapper.a) aVar4.a).e(slotItemDto, aVar4.b, false, true, null, this);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
            e3 = obj;
            xss0Var = (xss0) e3;
        } else if (i == 2) {
            b.b(obj);
            a2 = obj;
            xss0Var = (xss0) a2;
        } else if (i == 3) {
            b.b(obj);
            a = obj;
            xss0Var = (xss0) a;
        } else if (i == 4) {
            b.b(obj);
            e2 = obj;
            xss0Var = (xss0) e2;
        } else {
            if (i != 5) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e = obj;
            xss0Var = (xss0) e;
        }
        RideCardItemDto$ShareLocation rideCardItemDto$ShareLocation2 = this.$item;
        return new xmk0(rideCardItemDto$ShareLocation2.a, rideCardItemDto$ShareLocation2.b, xss0Var, new bdc(xng0.bgTransparent));
    }
}
