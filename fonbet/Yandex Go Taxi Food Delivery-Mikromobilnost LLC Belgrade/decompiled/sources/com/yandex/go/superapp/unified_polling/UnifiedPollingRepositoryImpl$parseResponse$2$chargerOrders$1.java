package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersPayloadDto;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersResponseDto;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Ltaa;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$parseResponse$2$chargerOrders$1", f = "UnifiedPollingRepositoryImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingRepositoryImpl$parseResponse$2$chargerOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ fmt $response;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$parseResponse$2$chargerOrders$1(k kVar, fmt fmtVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$response = fmtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingRepositoryImpl$parseResponse$2$chargerOrders$1(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingRepositoryImpl$parseResponse$2$chargerOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.serialization.json.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        fmt fmtVar = this.$response;
        this.label = 1;
        kVar.getClass();
        SuperAppOrdersPayloadDto superAppOrdersPayloadDto = ((SuperAppOrdersResponseDto) fmtVar.a).a;
        Object a = (superAppOrdersPayloadDto == null || (bVar = superAppOrdersPayloadDto.d) == null) ? EmptyList.a : ((com.yandex.go.chargers.order.data.mapper.a) kVar.f.get()).a(fmtVar.e.a("X-YaTraceId"), this, bVar);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
