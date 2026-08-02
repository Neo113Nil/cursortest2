package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;

/* loaded from: classes15.dex */
public final class l270 {
    public final Looper a = Looper.myLooper();
    public final naz0 b;
    public final oab c;
    public final n5t0 d;
    public x08 e;

    public l270(naz0 naz0Var, oab oabVar, n5t0 n5t0Var) {
        this.b = naz0Var;
        this.c = oabVar;
        this.d = n5t0Var;
    }

    public static void a(l270 l270Var, HistoryResponse historyResponse) {
        ChatHistoryResponse chatHistoryResponse = null;
        z83.g(null, l270Var.a, Looper.myLooper());
        String str = l270Var.b.a.b;
        l270Var.e = null;
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        if (chatHistoryResponseArr == null || chatHistoryResponseArr.length == 0) {
            return;
        }
        int length = chatHistoryResponseArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ChatHistoryResponse chatHistoryResponse2 = chatHistoryResponseArr[i];
            if (chatHistoryResponse2.chatId.equals(str)) {
                chatHistoryResponse = chatHistoryResponse2;
                break;
            }
            i++;
        }
        if (chatHistoryResponse == null) {
            return;
        }
        l270Var.c.i(chatHistoryResponse);
    }
}
