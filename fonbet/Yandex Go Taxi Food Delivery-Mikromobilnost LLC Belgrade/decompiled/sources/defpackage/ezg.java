package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.MessageDataFilter;
import com.yandex.messaging.core.net.entities.proto.OnlyTimestampsChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.OnlyTimestampsHistoryResponse;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class ezg extends j370 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ fzg b;

    public ezg(boolean z, fzg fzgVar) {
        this.a = z;
        this.b = fzgVar;
    }

    @Override // defpackage.j370
    public final void b(OnlyTimestampsHistoryResponse onlyTimestampsHistoryResponse) {
        lbb lbbVar;
        OnlyTimestampsChatHistoryResponse[] onlyTimestampsChatHistoryResponseArr = onlyTimestampsHistoryResponse.chats;
        fzg fzgVar = this.b;
        if (onlyTimestampsChatHistoryResponseArr != null) {
            for (OnlyTimestampsChatHistoryResponse onlyTimestampsChatHistoryResponse : j73.A(onlyTimestampsChatHistoryResponseArr)) {
                s020 e = fzgVar.b.e(onlyTimestampsChatHistoryResponse.chatId);
                rsx rsxVar = e != null ? (rsx) ((m8g) e).r0.get() : null;
                if (rsxVar != null) {
                    rsxVar.a(onlyTimestampsChatHistoryResponse.lastMessageTimestamp, onlyTimestampsChatHistoryResponse.minMessageTimestamp, null);
                }
            }
        }
        if (this.a) {
            op3 op3Var = fzgVar.f;
            kgx kgxVar = fzg.g[1];
            op3Var.b(null);
        } else {
            op3 op3Var2 = fzgVar.e;
            kgx kgxVar2 = fzg.g[0];
            op3Var2.b(null);
        }
        op3 op3Var3 = fzgVar.f;
        kgx[] kgxVarArr = fzg.g;
        kgx kgxVar3 = kgxVarArr[1];
        if (op3Var3.a() == null) {
            op3 op3Var4 = fzgVar.e;
            kgx kgxVar4 = kgxVarArr[0];
            if (op3Var4.a() == null) {
                fzgVar.d.reportEvent("tech end deep message sync");
                lcz0 lcz0Var = fzgVar.c;
                for (String str : (List) a.b(lcz0Var.b.c().a, true, false, new rfa(29))) {
                    s020 e2 = lcz0Var.a.e(str);
                    if (e2 != null && (lbbVar = (lbb) ((m8g) e2).M.get()) != null) {
                        jbb jbbVar = new jbb(lbbVar, new kcz0(lcz0Var, str), 1);
                        if (!jbbVar.e()) {
                            jbbVar = null;
                        }
                        if (jbbVar != null) {
                            lcz0Var.d.c("tech start messages prefetch", "chatId", str);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.j370, defpackage.o5t0
    /* renamed from: f */
    public final HistoryRequest c(int i, int i2) {
        HistoryRequest historyRequest = new HistoryRequest();
        historyRequest.maxTimestamp = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        historyRequest.limit = 1L;
        MessageDataFilter messageDataFilter = new MessageDataFilter();
        messageDataFilter.onlyTimestamps = true;
        historyRequest.threads = this.a;
        messageDataFilter.dropPayload = true;
        historyRequest.messageDataFilter = messageDataFilter;
        historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return historyRequest;
    }
}
