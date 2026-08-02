package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.message.HistoryTranslationDataFilter;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public abstract class hy10 extends ylu {
    public final String a;
    public final ry10 b;
    public final String c;
    public final String w;
    public final long x;
    public final x22 y;

    public hy10(String str, ry10 ry10Var, String str2, String str3, long j, x22 x22Var) {
        this.a = str;
        this.b = ry10Var;
        this.c = str2;
        this.w = str3;
        this.x = j;
        this.y = x22Var;
    }

    @Override // defpackage.ylu
    public void f(HistoryResponse historyResponse) {
        String chatId;
        ChatHistoryResponse chatHistoryResponse;
        ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
        int length = chatHistoryResponseArr != null ? chatHistoryResponseArr.length : 0;
        z83.i();
        String str = null;
        x22 x22Var = this.y;
        String str2 = this.a;
        if (length > 1) {
            ChatHistoryResponse[] chatHistoryResponseArr2 = historyResponse.chats;
            x22Var.reportEvent("tech_9225_multiple_chats_in_history", b.i(new Pair("chatsCount", Integer.valueOf(length)), new Pair("chats", chatHistoryResponseArr2 != null ? j73.L(chatHistoryResponseArr2, null, null, new rv10(5), 31) : null), new Pair("queriedChat", str2)));
        }
        if (length == 1) {
            ChatHistoryResponse[] chatHistoryResponseArr3 = historyResponse.chats;
            if (chatHistoryResponseArr3 != null && (chatHistoryResponse = (ChatHistoryResponse) j73.C(chatHistoryResponseArr3)) != null) {
                str = chatHistoryResponse.chatId;
            }
            z83.i();
            if (!jl40.l(str, str2)) {
                x22Var.reportEvent("tech_9225_incorrect_chat_answer", b.i(new Pair("queriedChatId", str2), new Pair("responseChatId", str)));
            }
        }
        ChatHistoryResponse[] chatHistoryResponseArr4 = historyResponse.chats;
        if (chatHistoryResponseArr4 != null) {
            for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr4) {
                ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse2.messages;
                if (outMessageArr != null) {
                    for (ChatHistoryResponse.OutMessage outMessage : outMessageArr) {
                        PlainMessage plainMessage = outMessage.serverMessage.clientMessage.plain;
                        if (plainMessage != null && (chatId = plainMessage.getChatId()) != null) {
                            z83.i();
                            if (!jl40.l(chatHistoryResponse2.chatId, chatId)) {
                                x22Var.reportEvent("tech_9225_incorrect_chat_id_in_messages", b.i(new Pair("queriedChatId", str2), new Pair("responseChatId", chatHistoryResponse2.chatId), new Pair("msgChatId", chatId)));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ylu, defpackage.o5t0
    /* renamed from: g */
    public HistoryRequest c(int i, int i2) {
        HistoryRequest historyRequest = new HistoryRequest();
        historyRequest.chatId = this.a;
        ry10 ry10Var = this.b;
        MessagesRange$LoadingType messagesRange$LoadingType = ry10Var.c;
        long j = ry10Var.a;
        long j2 = ry10Var.b;
        int i3 = gy10.a[messagesRange$LoadingType.ordinal()];
        long j3 = this.x;
        if (i3 == 1) {
            historyRequest.limit = j3;
            historyRequest.offset = 0L;
            historyRequest.maxTimestamp = j + 1;
            historyRequest.minTimestamp = j2;
        } else if (i3 == 2) {
            historyRequest.limit = 1 + j3;
            historyRequest.offset = j3;
            historyRequest.maxTimestamp = j2;
            historyRequest.minTimestamp = j2;
        } else {
            if (i3 != 3) {
                w511.b();
                return null;
            }
            historyRequest.limit = 2 * j3;
            historyRequest.offset = j3 + 1;
            historyRequest.maxTimestamp = j + 1;
            historyRequest.minTimestamp = j2;
        }
        historyRequest.inviteHash = this.c;
        String str = this.w;
        if (str != null) {
            historyRequest.translationDataFilter = new HistoryTranslationDataFilter(str, null);
        }
        historyRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return historyRequest;
    }
}
