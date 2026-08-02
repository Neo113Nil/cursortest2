package com.yandex.go.chargers.offer.passes.data;

import com.yandex.go.chargers.offer.passes.data.api.ChargersPassesApi;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseStatusResponse;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseStatusResponse;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.offer.passes.data.ChargersPassesDataSource$getPassPurchaseStatus$2", f = "ChargersPassesDataSource.kt", l = {46, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesDataSource$getPassPurchaseStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $operationId;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesDataSource$getPassPurchaseStatus$2(f fVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$operationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChargersPassesDataSource$getPassPurchaseStatus$2(this.this$0, this.$operationId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ChargersPassesDataSource$getPassPurchaseStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChargersPassesApi chargersPassesApi;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            chargersPassesApi = fVar.b;
            com.yandex.go.chargers.data.f fVar2 = fVar.d;
            this.L$0 = chargersPassesApi;
            this.label = 1;
            obj = fVar2.d(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            chargersPassesApi = (ChargersPassesApi) this.L$0;
            kotlin.b.b(obj);
        }
        cmt<PassPurchaseStatusResponse> a = chargersPassesApi.a((Map) obj, this.$operationId);
        this.L$0 = null;
        this.label = 2;
        Object a2 = ru.yandex.taxi.network.api.a.a(a, null, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
