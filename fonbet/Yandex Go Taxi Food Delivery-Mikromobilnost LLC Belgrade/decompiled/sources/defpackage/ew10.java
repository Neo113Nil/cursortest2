package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.MessageDataFilter;
import com.yandex.messaging.core.net.entities.proto.MessageInfoRequest;
import com.yandex.messaging.core.net.entities.proto.MessageInfoResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedServerMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageReactions;

/* loaded from: classes15.dex */
public final class ew10 extends st10 {
    public final /* synthetic */ fw10 a;
    public final /* synthetic */ ServerMessageRef b;
    public final /* synthetic */ agc0 c;

    public ew10(fw10 fw10Var, ServerMessageRef serverMessageRef, agc0 agc0Var) {
        this.a = fw10Var;
        this.b = serverMessageRef;
        this.c = agc0Var;
    }

    @Override // defpackage.st10
    public final void b(MessageInfoResponse messageInfoResponse) {
        fw10 fw10Var = this.a;
        z83.g(null, fw10Var.k.getLooper(), Looper.myLooper());
        MessageInfoResponse.OutMessage outMessage = messageInfoResponse.message;
        ReducedServerMessage reducedServerMessage = outMessage != null ? outMessage.serverMessage : null;
        if (reducedServerMessage != null) {
            l020 C = fw10Var.c.C();
            fw10 fw10Var2 = this.a;
            ServerMessageRef serverMessageRef = this.b;
            try {
                fw10Var2.d(C, serverMessageRef.getTimestamp(), reducedServerMessage.reactionsVersion, MessageReactions.a(reducedServerMessage.reactions, reducedServerMessage.recentUserReactions));
                fw10Var2.e(C, serverMessageRef.getTimestamp(), reducedServerMessage.serverMessageInfo.threadState);
                fw10.a(fw10Var2, C, reducedServerMessage);
                C.s();
                C.close();
            } finally {
            }
        }
        this.c.invoke();
    }

    @Override // defpackage.st10, defpackage.o5t0
    /* renamed from: f */
    public final MessageInfoRequest c(int i, int i2) {
        MessageInfoRequest messageInfoRequest = new MessageInfoRequest();
        fw10 fw10Var = this.a;
        z83.g(null, fw10Var.k.getLooper(), Looper.myLooper());
        naz0 naz0Var = fw10Var.a;
        messageInfoRequest.chatId = naz0Var.a.b;
        messageInfoRequest.inviteHash = naz0Var.e();
        messageInfoRequest.timestamp = this.b.getTimestamp();
        MessageDataFilter messageDataFilter = new MessageDataFilter();
        messageDataFilter.dropPayload = true;
        messageInfoRequest.messageDataFilter = messageDataFilter;
        messageInfoRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return messageInfoRequest;
    }
}
