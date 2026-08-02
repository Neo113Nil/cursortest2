package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersPayloadDto;
import defpackage.bgi;
import defpackage.dgi;
import defpackage.fy11;
import defpackage.hfi;
import defpackage.jst;
import defpackage.mgi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lhfi;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$parseResponse$2$deliveryOrders$1", f = "UnifiedPollingRepositoryImpl.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingRepositoryImpl$parseResponse$2$deliveryOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ SuperAppOrdersPayloadDto $payload;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$parseResponse$2$deliveryOrders$1(k kVar, SuperAppOrdersPayloadDto superAppOrdersPayloadDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$payload = superAppOrdersPayloadDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingRepositoryImpl$parseResponse$2$deliveryOrders$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingRepositoryImpl$parseResponse$2$deliveryOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        SuperAppOrdersPayloadDto superAppOrdersPayloadDto = this.$payload;
        this.label = 1;
        kVar.getClass();
        kotlinx.serialization.json.b bVar = superAppOrdersPayloadDto.e;
        EmptyList emptyList = EmptyList.a;
        if (bVar != null) {
            fy11 fy11Var = (fy11) kVar.g.get();
            fy11Var.getClass();
            try {
                mgi mgiVar = (mgi) ((xnt) fy11Var.a).d(bVar, mgi.Companion.serializer());
                if (!mgiVar.a.isEmpty()) {
                    bgi bgiVar = (bgi) fy11Var.b.get();
                    List list = mgiVar.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hfi a = ((dgi) bgiVar).a(((kotlinx.serialization.json.b) it.next()).toString());
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    emptyList = arrayList;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                jst.e.k(th, "Error on delivery orders mapping");
            }
        }
        return emptyList == coroutineSingletons ? coroutineSingletons : emptyList;
    }
}
