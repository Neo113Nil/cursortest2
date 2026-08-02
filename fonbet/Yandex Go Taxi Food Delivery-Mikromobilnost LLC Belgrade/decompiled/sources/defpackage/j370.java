package defpackage;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.OnlyTimestampsHistoryResponse;

/* loaded from: classes15.dex */
public abstract class j370 implements o5t0 {
    public void b(OnlyTimestampsHistoryResponse onlyTimestampsHistoryResponse) {
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return OnlyTimestampsHistoryResponse.class;
    }

    @Override // defpackage.o5t0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract HistoryRequest c(int i, int i2);

    @Override // defpackage.o5t0
    public final String k() {
        return "history";
    }

    @Override // defpackage.o5t0
    public final int n(Object obj) {
        OnlyTimestampsHistoryResponse onlyTimestampsHistoryResponse = (OnlyTimestampsHistoryResponse) obj;
        int i = onlyTimestampsHistoryResponse.status;
        if (i != 0) {
            return o5t0.o(i);
        }
        b(onlyTimestampsHistoryResponse);
        return 0;
    }
}
