package ru.ok.android.externcalls.sdk.api.request;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.api.methods.batch.execute.BatchApiResult;
import xsna.c5g;

/* compiled from: BatchRequest.kt */
/* loaded from: classes9.dex */
public final class BatchRequestKt {
    public static final <R extends ApiExecutableRequest<T>, T> List<T> parseBatchResponse(BatchApiResult batchApiResult, List<? extends R> list) {
        List<? extends R> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(batchApiResult.get((ApiExecutableRequest) it.next()));
        }
        return arrayList;
    }

    public static final ApiExecutableRequest<BatchApiResult> toBatchRequest(List<? extends ApiExecutableRequest<?>> list) {
        BatchApiRequest.Builder batchBuilder = BatchApiRequest.Companion.batchBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            batchBuilder.add((ApiExecutableRequest<?>) it.next());
        }
        return batchBuilder.build();
    }
}
