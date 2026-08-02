package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;

/* loaded from: classes15.dex */
public final class abb extends hy10 {
    public final /* synthetic */ ry10 A;
    public final /* synthetic */ cbb B;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abb(cbb cbbVar, String str, ry10 ry10Var, String str2, String str3, long j, x22 x22Var, ry10 ry10Var2) {
        super(str, ry10Var, str2, str3, j, x22Var);
        this.B = cbbVar;
        this.A = ry10Var2;
    }

    @Override // defpackage.hy10, defpackage.ylu
    public final void f(HistoryResponse historyResponse) {
        ChatHistoryResponse chatHistoryResponse;
        ChatHistoryResponse.OutMessage[] outMessageArr;
        cbb cbbVar = this.B;
        z83.g(null, cbbVar.b, Looper.myLooper());
        super.f(historyResponse);
        cbbVar.j = null;
        ((jwa0) cbbVar.f.get()).a(this.z, "time2chat_history");
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        if (chatHistoryResponseArr != null) {
            int length = chatHistoryResponseArr.length;
            for (int i = 0; i < length; i++) {
                chatHistoryResponse = chatHistoryResponseArr[i];
                if (jl40.l(chatHistoryResponse.chatId, this.a)) {
                    break;
                }
            }
        }
        chatHistoryResponse = null;
        if (chatHistoryResponse == null || (outMessageArr = chatHistoryResponse.messages) == null || outMessageArr.length == 0) {
            cbbVar.h.add(this.A);
        } else {
            z83.d(cbbVar.k, null);
            e48 e48Var = cbbVar.k;
            if (e48Var != null) {
                ((oab) e48Var.b).h(chatHistoryResponse);
            }
        }
        cbbVar.b();
    }

    @Override // defpackage.hy10, defpackage.ylu, defpackage.o5t0
    /* renamed from: g */
    public final HistoryRequest c(int i, int i2) {
        ((jwa0) this.B.f.get()).getClass();
        this.z = SystemClock.elapsedRealtime();
        return super.c(i, i2);
    }
}
