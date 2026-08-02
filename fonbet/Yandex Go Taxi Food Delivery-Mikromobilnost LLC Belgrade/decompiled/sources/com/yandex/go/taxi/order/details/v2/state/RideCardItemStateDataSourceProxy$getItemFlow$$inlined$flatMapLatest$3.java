package com.yandex.go.taxi.order.details.v2.state;

import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojk0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3", f = "RideCardItemStateDataSourceProxy.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3 extends SuspendLambda implements zls {
    final /* synthetic */ fef $currencyRules$inlined;
    final /* synthetic */ a7 $dto$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3(Continuation continuation, a aVar, a7 a7Var, fef fefVar) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$dto$inlined = a7Var;
        this.$currencyRules$inlined = fefVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3 rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3 = new RideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3((Continuation) obj3, this.this$0, this.$dto$inlined, this.$currencyRules$inlined);
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3.L$0 = (vpr) obj;
        rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3.L$1 = obj2;
        return rideCardItemStateDataSourceProxy$getItemFlow$$inlined$flatMapLatest$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r9, r0, r8) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r9 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.details.v2.state.elements.generic.a aVar = (com.yandex.go.taxi.order.details.v2.state.elements.generic.a) this.this$0.l.get();
            ojk0 ojk0Var = (ojk0) this.$dto$inlined;
            fef fefVar = this.$currencyRules$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = aVar.a(ojk0Var, (List) obj2, fefVar, this);
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
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
