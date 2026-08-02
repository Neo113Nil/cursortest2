package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatDataFilter;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;

/* loaded from: classes15.dex */
public final class jzy0 extends wlu {
    public final String g;

    public jzy0(k020 k020Var, h3y h3yVar, h3y h3yVar2, dvg dvgVar) {
        super(k020Var, h3yVar, h3yVar2, dvgVar);
        this.g = "time2history4threads";
    }

    @Override // defpackage.wlu
    public final HistoryRequest a(long j) {
        HistoryRequest historyRequest = new HistoryRequest();
        historyRequest.limit = 1L;
        historyRequest.threads = true;
        historyRequest.filter = new ChatDataFilter();
        return historyRequest;
    }

    @Override // defpackage.wlu
    public final String b() {
        return this.g;
    }
}
