package com.yandex.go.taxi.order.details.v2.state;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Accordion;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojk0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2", f = "RideCardItemStateDataSourceProxy.kt", l = {225, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    final /* synthetic */ fef $currencyRules$inlined;
    final /* synthetic */ a7 $dto$inlined;
    final /* synthetic */ Map $itemPool$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2(Continuation continuation, a aVar, a7 a7Var, fef fefVar, Map map) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$dto$inlined = a7Var;
        this.$currencyRules$inlined = fefVar;
        this.$itemPool$inlined = map;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 = new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2((Continuation) obj3, this.this$0, this.$dto$inlined, this.$currencyRules$inlined, this.$itemPool$inlined);
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$1 = obj2;
        return rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a8, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r14, r0, r12) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r14 == r2) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) obj2;
            MapBuilder mapBuilder = new MapBuilder();
            for (Map.Entry entry : this.$itemPool$inlined.entrySet()) {
                String str = (String) entry.getKey();
                a7 a7Var = (a7) entry.getValue();
                if (a7Var instanceof ojk0) {
                    mapBuilder.put(str, a7Var);
                }
            }
            MapBuilder j = mapBuilder.j();
            com.yandex.go.taxi.order.details.v2.state.elements.accordion.b bVar = (com.yandex.go.taxi.order.details.v2.state.elements.accordion.b) this.this$0.q.get();
            RideCardItemDto$Accordion rideCardItemDto$Accordion = (RideCardItemDto$Accordion) this.$dto$inlined;
            fef fefVar = this.$currencyRules$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 1;
            rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 = this;
            obj = bVar.a(rideCardItemDto$Accordion, j, list, fefVar, rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2 = this;
        }
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$0 = null;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$1 = null;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$2 = null;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$3 = null;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$4 = null;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.L$5 = null;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$2.label = 2;
    }
}
