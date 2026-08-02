package defpackage;

import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.internal.entities.MessageTranslation;
import com.yandex.messaging.internal.translator.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes15.dex */
public final class bz01 implements tls {
    public final /* synthetic */ HistoryResponse a;
    public final /* synthetic */ j b;
    public final /* synthetic */ LinkedHashSet c;

    public bz01(HistoryResponse historyResponse, j jVar, LinkedHashSet linkedHashSet) {
        this.a = historyResponse;
        this.b = jVar;
        this.c = linkedHashSet;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        j jVar;
        ChatHistoryResponse chatHistoryResponse;
        ChatHistoryResponse.OutMessage[] outMessageArr;
        ServerMessage serverMessage;
        ServerMessageInfo serverMessageInfo;
        l020 l020Var = (l020) obj;
        ChatHistoryResponse[] chatHistoryResponseArr = this.a.chats;
        if (chatHistoryResponseArr != null) {
            int length = chatHistoryResponseArr.length;
            int i = 0;
            while (true) {
                jVar = this.b;
                if (i >= length) {
                    chatHistoryResponse = null;
                    break;
                }
                chatHistoryResponse = chatHistoryResponseArr[i];
                if (jl40.l(chatHistoryResponse.chatId, jVar.f.b)) {
                    break;
                }
                i++;
            }
            if (chatHistoryResponse != null && (outMessageArr = chatHistoryResponse.messages) != null) {
                ArrayList arrayList = new ArrayList();
                for (ChatHistoryResponse.OutMessage outMessage : outMessageArr) {
                    if (outMessage != null && (serverMessage = outMessage.serverMessage) != null && (serverMessageInfo = serverMessage.serverMessageInfo) != null) {
                        this.c.add(Long.valueOf(serverMessageInfo.timestamp));
                    }
                    MessageTranslation b = jVar.d.b(outMessage.serverMessage);
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MessageTranslation messageTranslation = (MessageTranslation) it.next();
                    kgx[] kgxVarArr = j.n;
                    jVar.a(messageTranslation);
                    l020Var.f0(jVar.f, messageTranslation);
                }
                return zy11.a;
            }
        }
        return null;
    }
}
