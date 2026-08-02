package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersMetaDto;
import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersPayloadDto;
import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersResponseDto;
import defpackage.jst;
import defpackage.p53;
import defpackage.tls;
import defpackage.uhm;
import defpackage.xnt;
import defpackage.ycw0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import retrofit2.Response;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class EatsKitPollingRepositoryImpl$forceUpdate$1$newCall$2 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List list;
        Object failure;
        Object value;
        ycw0 ycw0Var;
        Integer num;
        Response response = (Response) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        ScheduledExecutorService scheduledExecutorService = aVar.n;
        CopyOnWriteArrayList copyOnWriteArrayList = aVar.p;
        boolean z = response.a.J;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (z) {
            EatsOrdersResponseDto eatsOrdersResponseDto = (EatsOrdersResponseDto) response.b;
            if (eatsOrdersResponseDto != null) {
                EatsOrdersPayloadDto eatsOrdersPayloadDto = eatsOrdersResponseDto.a;
                Object obj2 = null;
                kotlinx.serialization.json.b bVar = eatsOrdersPayloadDto != null ? eatsOrdersPayloadDto.a : null;
                ?? r9 = EmptyList.a;
                if (bVar != null) {
                    com.yandex.go.order.external.unifiedpolling.a aVar2 = (com.yandex.go.order.external.unifiedpolling.a) aVar.g.get();
                    list = aVar2.b(bVar, ((ru.yandex.taxi.experiments.superapp.j) aVar2.c.get()).a());
                } else {
                    list = r9;
                }
                if (bVar != null) {
                    try {
                        failure = (List) ((xnt) aVar.f).d(bVar, new p53(EatsOrdersMetaDto.Companion.serializer(), 0));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a == null) {
                        obj2 = failure;
                    } else {
                        jst.e.k(a, "failed to parse check after for orders");
                    }
                    List list2 = (List) obj2;
                    if (list2 != null) {
                        r9 = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            Integer num2 = ((EatsOrdersMetaDto) it.next()).a;
                            if (num2 != null) {
                                r9.add(num2);
                            }
                        }
                    }
                }
                r0 r0Var = aVar.k;
                do {
                    value = r0Var.getValue();
                    ycw0Var = (ycw0) value;
                } while (!r0Var.k(value, new ycw0(list, ycw0Var.b, ycw0Var.c, ycw0Var.d, ycw0Var.e)));
                EatsOrdersMetaDto eatsOrdersMetaDto = eatsOrdersResponseDto.b;
                int intValue = (eatsOrdersMetaDto == null || (num = eatsOrdersMetaDto.a) == null) ? 90 : num.intValue();
                Iterator it2 = r9.iterator();
                while (it2.hasNext()) {
                    intValue = Math.min(intValue, ((Number) it2.next()).intValue());
                }
                Iterator it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    ((ScheduledFuture) it3.next()).cancel(true);
                }
                copyOnWriteArrayList.clear();
                aVar.t = intValue;
                copyOnWriteArrayList.add(scheduledExecutorService.schedule(new uhm(8, aVar), intValue, timeUnit));
            }
        } else {
            jst.e.k(new IllegalStateException(), "Error during updating service orders: response code: " + response.a.w);
            int i = aVar.t;
            Iterator it4 = copyOnWriteArrayList.iterator();
            while (it4.hasNext()) {
                ((ScheduledFuture) it4.next()).cancel(true);
            }
            copyOnWriteArrayList.clear();
            aVar.t = i;
            copyOnWriteArrayList.add(scheduledExecutorService.schedule(new uhm(8, aVar), i, timeUnit));
        }
        return zy11.a;
    }
}
