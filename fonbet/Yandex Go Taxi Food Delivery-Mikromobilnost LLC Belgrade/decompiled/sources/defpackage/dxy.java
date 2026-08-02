package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class dxy extends hy10 {
    public final /* synthetic */ exy A;
    public final /* synthetic */ kbb B;
    public final /* synthetic */ Long C;
    public final /* synthetic */ ry10 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxy(ry10 ry10Var, exy exyVar, kbb kbbVar, Long l, String str, String str2, String str3, long j, x22 x22Var) {
        super(str, ry10Var, str2, str3, j, x22Var);
        this.z = ry10Var;
        this.A = exyVar;
        this.B = kbbVar;
        this.C = l;
    }

    @Override // defpackage.hy10, defpackage.ylu
    public final void f(HistoryResponse historyResponse) {
        ChatHistoryResponse chatHistoryResponse;
        exy exyVar = this.A;
        ecz0 ecz0Var = exyVar.h;
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        if (chatHistoryResponseArr != null && (chatHistoryResponse = (ChatHistoryResponse) j73.D(chatHistoryResponseArr)) != null) {
            ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse.messages;
        }
        ecz0Var.getClass();
        ChatHistoryResponse chatHistoryResponse2 = null;
        z83.g(null, exyVar.c, Looper.myLooper());
        super.f(historyResponse);
        ChatHistoryResponse[] chatHistoryResponseArr2 = historyResponse.chats;
        if (chatHistoryResponseArr2 != null) {
            int length = chatHistoryResponseArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ChatHistoryResponse chatHistoryResponse3 = chatHistoryResponseArr2[i];
                if (jl40.l(chatHistoryResponse3.chatId, this.a)) {
                    chatHistoryResponse2 = chatHistoryResponse3;
                    break;
                }
                i++;
            }
        }
        kbb kbbVar = this.B;
        if (chatHistoryResponse2 == null) {
            kbbVar.a();
            return;
        }
        kbbVar.d(chatHistoryResponse2);
        Long l = this.C;
        if (l != null) {
            long longValue = l.longValue();
            ry10 ry10Var = this.z;
            long j = ry10Var.b;
            if (longValue > ry10Var.a || j > longValue) {
                return;
            }
            ChatHistoryResponse.OutMessage[] outMessageArr2 = chatHistoryResponse2.messages;
            Iterator it = (outMessageArr2 != null ? j73.A(outMessageArr2) : EmptyList.a).iterator();
            while (it.hasNext()) {
                if (((ChatHistoryResponse.OutMessage) it.next()).serverMessage.serverMessageInfo.timestamp == l.longValue()) {
                    return;
                }
            }
            kbbVar.a();
        }
    }
}
