package com.yandex.messaging.domain.poll;

import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequestBuilder;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.Vote;
import defpackage.nxd0;
import defpackage.oxd0;
import defpackage.ree0;
import defpackage.tje;
import defpackage.xxd0;

/* loaded from: classes15.dex */
public final class d extends ree0 {
    public final /* synthetic */ nxd0 a;
    public final /* synthetic */ oxd0 b;
    public final /* synthetic */ oxd0 c;

    public d(nxd0 nxd0Var, oxd0 oxd0Var, oxd0 oxd0Var2, oxd0 oxd0Var3) {
        this.a = nxd0Var;
        this.b = oxd0Var2;
        this.c = oxd0Var3;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        MessageRef messageRef;
        nxd0 nxd0Var = this.a;
        String str = nxd0Var.b;
        long j = nxd0Var.a;
        Integer[] numArr = (Integer[]) nxd0Var.c.toArray(new Integer[0]);
        int ordinal = nxd0Var.d.ordinal();
        String str2 = nxd0Var.f;
        Long l = nxd0Var.e;
        if (str2 == null || l == null) {
            messageRef = null;
        } else {
            long longValue = l.longValue();
            messageRef = new MessageRef();
            messageRef.chatId = str2;
            messageRef.timestamp = longValue;
        }
        return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Vote(str, j, numArr, ordinal, messageRef), null, null, null, null, null, null, false, 0, false, 268173311, null);
    }

    @Override // defpackage.ree0
    public final boolean f(PostMessageResponse postMessageResponse) {
        xxd0 xxd0Var = this.b.b;
        nxd0 nxd0Var = this.a;
        xxd0Var.a(nxd0Var.a, nxd0Var.b);
        return true;
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        MessageRef messageRef;
        PollInfoRequestBuilder pollInfoRequestBuilder = new PollInfoRequestBuilder();
        nxd0 nxd0Var = this.a;
        if (nxd0Var.f == null || nxd0Var.e == null) {
            messageRef = null;
        } else {
            messageRef = MessageRef.a(nxd0Var.a, nxd0Var.b);
        }
        if (messageRef != null) {
            pollInfoRequestBuilder.a = messageRef.chatId;
            pollInfoRequestBuilder.b = messageRef.timestamp;
            pollInfoRequestBuilder.e = Long.valueOf(nxd0Var.a().timestamp);
            pollInfoRequestBuilder.d = nxd0Var.a().chatId;
        } else {
            pollInfoRequestBuilder.a = nxd0Var.a().chatId;
            pollInfoRequestBuilder.b = nxd0Var.a().timestamp;
        }
        pollInfoRequestBuilder.f = 15;
        PollInfoRequest pollInfoRequest = new PollInfoRequest(pollInfoRequestBuilder);
        oxd0 oxd0Var = this.c;
        tje.N(oxd0Var.d, null, null, new PollMessageVoteController$pullPollMessageInfo$1(oxd0Var, pollInfoRequest, nxd0Var, null), 3);
    }
}
