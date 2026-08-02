package defpackage;

import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.MessageDataFilter;
import com.yandex.messaging.core.net.entities.proto.MessageInfoRequest;
import com.yandex.messaging.core.net.entities.proto.MessageInfoResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReactionInfo;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.FullReactionInfo;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class gai0 extends st10 {
    public final /* synthetic */ kdd0 a;
    public final /* synthetic */ hai0 b;

    public gai0(kdd0 kdd0Var, hai0 hai0Var) {
        this.a = kdd0Var;
        this.b = hai0Var;
    }

    @Override // defpackage.st10
    public final void b(MessageInfoResponse messageInfoResponse) {
        ReactionInfo[] reactionInfoArr;
        UserReaction[] userReactionArr;
        ReducedServerMessage reducedServerMessage;
        ReducedServerMessage reducedServerMessage2;
        ReducedServerMessage reducedServerMessage3;
        int[] iArr = messageInfoResponse.myReactions;
        if (iArr == null) {
            iArr = new int[0];
        }
        MessageInfoResponse.OutMessage outMessage = messageInfoResponse.message;
        long j = (outMessage == null || (reducedServerMessage3 = outMessage.serverMessage) == null) ? 0L : reducedServerMessage3.reactionsVersion;
        if (outMessage == null || (reducedServerMessage2 = outMessage.serverMessage) == null || (reactionInfoArr = reducedServerMessage2.reactions) == null) {
            reactionInfoArr = new ReactionInfo[0];
        }
        if (outMessage == null || (reducedServerMessage = outMessage.serverMessage) == null || (userReactionArr = reducedServerMessage.recentUserReactions) == null) {
            userReactionArr = new UserReaction[0];
        }
        UserReaction[] userReactionArr2 = userReactionArr;
        hai0 hai0Var = this.b;
        hai0Var.x = Math.max(j, hai0Var.x);
        hai0Var.y = j;
        hai0Var.w = null;
        hai0Var.a();
        g070 g070Var = hai0Var.b;
        ServerMessageRef serverMessageRef = hai0Var.a;
        ArrayList arrayList = new ArrayList(reactionInfoArr.length);
        for (ReactionInfo reactionInfo : reactionInfoArr) {
            int i = reactionInfo.type;
            arrayList.add(new FullReactionInfo(i, reactionInfo.count, j73.w(i, iArr)));
        }
        g070Var.l(serverMessageRef, j, arrayList, userReactionArr2);
    }

    @Override // defpackage.st10, defpackage.o5t0
    /* renamed from: f */
    public final MessageInfoRequest c(int i, int i2) {
        MessageInfoRequest messageInfoRequest = new MessageInfoRequest();
        naz0 naz0Var = (naz0) this.a.b;
        messageInfoRequest.chatId = naz0Var.a.b;
        messageInfoRequest.inviteHash = naz0Var.e();
        messageInfoRequest.timestamp = this.b.a.getTimestamp();
        MessageDataFilter messageDataFilter = new MessageDataFilter();
        messageDataFilter.dropPayload = true;
        messageInfoRequest.messageDataFilter = messageDataFilter;
        messageInfoRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return messageInfoRequest;
    }
}
