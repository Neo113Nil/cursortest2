package defpackage;

import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.ErrorInfo;
import com.yandex.messaging.core.net.entities.proto.SubscriptionRequest;
import com.yandex.messaging.core.net.entities.proto.SubscriptionResponse;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.TranslationDataFilter;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import com.yandex.messaging.domain.statuses.l;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class iz01 extends n1v0 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public iz01(jz01 jz01Var, String str) {
        this.c = jz01Var;
        this.b = str;
    }

    @Override // defpackage.n1v0
    /* renamed from: B */
    public int n(SubscriptionResponse subscriptionResponse) {
        switch (this.a) {
            case 1:
                ErrorInfo errorInfo = subscriptionResponse.errorInfo;
                if (errorInfo == null) {
                    break;
                } else {
                    au21 au21Var = (au21) this.b;
                    long retryAfter = errorInfo.getRetryAfter();
                    au21Var.c.getClass();
                    long j = au21Var.l;
                    au21Var.f.getClass();
                    au21Var.l = Math.max(j, TimeUnit.SECONDS.toMillis(retryAfter) + System.currentTimeMillis());
                    au21Var.c();
                    break;
                }
        }
        return super.n(subscriptionResponse);
    }

    @Override // defpackage.n1v0, defpackage.o5t0
    public final /* bridge */ /* synthetic */ Object c(int i, int i2) {
        switch (this.a) {
        }
        return c(i, i2);
    }

    @Override // defpackage.n1v0, defpackage.o5t0
    public /* bridge */ /* synthetic */ int n(Object obj) {
        switch (this.a) {
            case 1:
                return n((SubscriptionResponse) obj);
            default:
                return super.n(obj);
        }
    }

    @Override // defpackage.n1v0
    public void v(SubscriptionResponse subscriptionResponse) {
        switch (this.a) {
            case 1:
                au21 au21Var = (au21) this.b;
                Long l = subscriptionResponse.currentTime;
                if (l != null) {
                    long longValue = l.longValue();
                    vtq0 vtq0Var = au21Var.i;
                    o430 o430Var = e3n.b;
                    long e = e3n.e(kp50.V(longValue, DurationUnit.MICROSECONDS));
                    vtq0Var.a.getClass();
                    vtq0Var.b = e - System.currentTimeMillis();
                }
                ServerMessage[] serverMessageArr = subscriptionResponse.lastMessages;
                if (serverMessageArr != null) {
                    for (ServerMessage serverMessage : serverMessageArr) {
                        UserStatusMessage userStatusMessage = serverMessage.clientMessage.userStatus;
                        if (userStatusMessage != null) {
                            ServerMessageInfo serverMessageInfo = serverMessage.serverMessageInfo;
                            String str = serverMessageInfo.from.userId;
                            au21Var.d(userStatusMessage, str, serverMessageInfo.timestamp);
                            ut21 ut21Var = au21Var.c;
                            userStatusMessage.toString();
                            ut21Var.getClass();
                            yt21 yt21Var = au21Var.b;
                            yt21Var.d.d(new sa6(yt21Var, str, serverMessage.serverMessageInfo.timestamp, userStatusMessage, 7));
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.n1v0
    /* renamed from: w */
    public final SubscriptionRequest c(int i, int i2) {
        int i3 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
                subscriptionRequest.chatId = ((jz01) obj).a.b;
                subscriptionRequest.ttlMcs = 30000000L;
                subscriptionRequest.commonFields = new CommonRequestFields(i2 > 0, i);
                subscriptionRequest.messageBodyType = 25;
                subscriptionRequest.translationDataFilter = new TranslationDataFilter((String) obj2);
                return subscriptionRequest;
            default:
                ut21 ut21Var = ((au21) obj2).c;
                l lVar = (l) obj;
                Objects.toString(lVar.a);
                ut21Var.getClass();
                SubscriptionRequest subscriptionRequest2 = new SubscriptionRequest();
                subscriptionRequest2.ttlMcs = 60000000L;
                subscriptionRequest2.toGuids = lVar.c;
                subscriptionRequest2.messageBodyTypes = new Integer[]{26};
                subscriptionRequest2.commonFields = new CommonRequestFields(i2 > 0, i);
                return subscriptionRequest2;
        }
    }

    public iz01(au21 au21Var, l lVar) {
        this.b = au21Var;
        this.c = lVar;
    }
}
