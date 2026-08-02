package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.SubscriptionRequest;
import com.yandex.messaging.core.net.entities.proto.SubscriptionResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PinMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;

/* loaded from: classes15.dex */
public final class dw10 extends n1v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dw10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n1v0, defpackage.o5t0
    public final /* bridge */ /* synthetic */ Object c(int i, int i2) {
        switch (this.a) {
        }
        return c(i, i2);
    }

    @Override // defpackage.n1v0
    public void v(SubscriptionResponse subscriptionResponse) {
        ServerMessageInfo serverMessageInfo;
        ClientMessage clientMessage;
        PinMessage pinMessage;
        switch (this.a) {
            case 1:
                ServerMessage serverMessage = subscriptionResponse.lastMessage;
                if (serverMessage != null && (serverMessageInfo = serverMessage.serverMessageInfo) != null && (clientMessage = serverMessage.clientMessage) != null && (pinMessage = clientMessage.pin) != null) {
                    w2c0 w2c0Var = (w2c0) this.b;
                    z83.g(null, w2c0Var.f, Looper.myLooper());
                    z83.b(null, w2c0Var.c.a.b, pinMessage.chatId);
                    w2c0Var.a(pinMessage.timestamp, serverMessageInfo.lastEditTimestamp);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n1v0
    /* renamed from: w */
    public final SubscriptionRequest c(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
                naz0 naz0Var = ((fw10) obj).a;
                subscriptionRequest.chatId = naz0Var.a.b;
                subscriptionRequest.inviteHash = naz0Var.e();
                subscriptionRequest.ttlMcs = 30000000L;
                subscriptionRequest.commonFields = new CommonRequestFields(i2 > 0, i);
                return subscriptionRequest;
            default:
                SubscriptionRequest subscriptionRequest2 = new SubscriptionRequest();
                naz0 naz0Var2 = ((w2c0) obj).c;
                subscriptionRequest2.chatId = naz0Var2.a.b;
                subscriptionRequest2.inviteHash = naz0Var2.e();
                subscriptionRequest2.messageBodyType = 13;
                subscriptionRequest2.ttlMcs = 30000000L;
                subscriptionRequest2.commonFields = new CommonRequestFields(i2 > 0, i);
                return subscriptionRequest2;
        }
    }
}
