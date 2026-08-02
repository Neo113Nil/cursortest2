package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.MessageDataFilter;
import com.yandex.messaging.core.net.entities.proto.OnlyTimestampsHistoryResponse;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class ny10 extends j370 {
    public final /* synthetic */ oy10 a;
    public final /* synthetic */ py10 b;

    public ny10(oy10 oy10Var, py10 py10Var) {
        this.a = oy10Var;
        this.b = py10Var;
    }

    @Override // defpackage.j370
    public final void b(OnlyTimestampsHistoryResponse onlyTimestampsHistoryResponse) {
        oy10 oy10Var = this.a;
        oy10Var.c.postDelayed(new p500(22, oy10Var, onlyTimestampsHistoryResponse), 10000L);
        op3 op3Var = oy10Var.b;
        kgx kgxVar = oy10.e[0];
        op3Var.b(null);
    }

    @Override // defpackage.j370, defpackage.o5t0
    /* renamed from: f */
    public final HistoryRequest c(int i, int i2) {
        HistoryRequest historyRequest = new HistoryRequest();
        oy10 oy10Var = this.a;
        boolean z = oy10Var.a;
        k020 k020Var = this.b.d;
        long longValue = z ? ((Number) a.b(k020Var.b.A().a, true, false, new nqi0(17))).longValue() : k020Var.e();
        historyRequest.maxTimestamp = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        historyRequest.limit = 1L;
        historyRequest.threads = oy10Var.a;
        MessageDataFilter messageDataFilter = new MessageDataFilter();
        messageDataFilter.onlyTimestamps = true;
        messageDataFilter.dropPayload = true;
        historyRequest.messageDataFilter = messageDataFilter;
        historyRequest.minTimestamp = Math.max(0L, longValue - 5000);
        historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return historyRequest;
    }
}
