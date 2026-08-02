package defpackage;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.ReducedHistoryResponse;

/* loaded from: classes15.dex */
public abstract class pmi0 implements o5t0 {
    public void b(ReducedHistoryResponse reducedHistoryResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return ReducedHistoryResponse.class;
    }

    @Override // defpackage.o5t0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract HistoryRequest c(int i, int i2);

    @Override // defpackage.o5t0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int n(ReducedHistoryResponse reducedHistoryResponse) {
        int i = reducedHistoryResponse.status;
        if (i != 0) {
            return o5t0.o(i);
        }
        b(reducedHistoryResponse);
        return 0;
    }

    @Override // defpackage.o5t0
    public final String k() {
        return "history";
    }
}
