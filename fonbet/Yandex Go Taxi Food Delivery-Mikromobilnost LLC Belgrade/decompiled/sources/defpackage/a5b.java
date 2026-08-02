package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.core.net.entities.proto.SubscriptionRequest;
import com.yandex.messaging.core.net.entities.proto.SubscriptionResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.SystemMessage;

/* loaded from: classes15.dex */
public final class a5b extends n1v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5b b;

    public /* synthetic */ a5b(b5b b5bVar, int i) {
        this.a = i;
        this.b = b5bVar;
    }

    @Override // defpackage.n1v0, defpackage.o5t0
    public final /* bridge */ /* synthetic */ Object c(int i, int i2) {
        switch (this.a) {
        }
        return c(i, i2);
    }

    @Override // defpackage.n1v0
    public final void v(SubscriptionResponse subscriptionResponse) {
        PlainMessage plainMessage;
        ClientMessage clientMessage;
        SystemMessage systemMessage;
        int i = this.a;
        boolean z = false;
        b5b b5bVar = this.b;
        switch (i) {
            case 0:
                z83.g(null, b5bVar.a, Looper.myLooper());
                ServerMessage serverMessage = subscriptionResponse.lastMessage;
                if (serverMessage != null && (plainMessage = serverMessage.clientMessage.plain) != null) {
                    ((oab) b5bVar.d.get()).f(b5bVar.e.c(serverMessage, plainMessage, false));
                    break;
                }
                break;
            default:
                z83.g(null, b5bVar.a, Looper.myLooper());
                ServerMessage serverMessage2 = subscriptionResponse.lastMessage;
                if (serverMessage2 != null && (systemMessage = (clientMessage = serverMessage2.clientMessage).systemMessage) != null) {
                    ks10 ks10Var = b5bVar.e;
                    ServerMessageInfo serverMessageInfo = serverMessage2.serverMessageInfo;
                    boolean z2 = clientMessage.isSilent;
                    int i2 = clientMessage.notificationBehaviour;
                    NotificationMeta notificationMeta = serverMessage2.notificationMeta;
                    PlainMessage plainMessage2 = clientMessage.plain;
                    if (plainMessage2 != null && plainMessage2.isStarred()) {
                        z = true;
                    }
                    ((oab) b5bVar.d.get()).f(ks10Var.e(serverMessageInfo, systemMessage, z2, i2, notificationMeta, z, false));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n1v0
    /* renamed from: w */
    public final SubscriptionRequest c(int i, int i2) {
        int i3 = this.a;
        b5b b5bVar = this.b;
        switch (i3) {
            case 0:
                SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
                subscriptionRequest.chatId = b5bVar.b.a.b;
                subscriptionRequest.messageBodyType = 4;
                subscriptionRequest.inviteHash = b5bVar.b.e();
                subscriptionRequest.ttlMcs = 30000000L;
                subscriptionRequest.commonFields = new CommonRequestFields(i2 > 0, i);
                return subscriptionRequest;
            default:
                SubscriptionRequest subscriptionRequest2 = new SubscriptionRequest();
                subscriptionRequest2.chatId = b5bVar.b.a.b;
                subscriptionRequest2.messageBodyType = 6;
                subscriptionRequest2.inviteHash = b5bVar.b.e();
                subscriptionRequest2.ttlMcs = 30000000L;
                subscriptionRequest2.commonFields = new CommonRequestFields(i2 > 0, i);
                return subscriptionRequest2;
        }
    }
}
