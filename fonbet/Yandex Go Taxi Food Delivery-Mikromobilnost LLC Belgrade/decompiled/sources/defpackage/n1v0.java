package defpackage;

import com.yandex.messaging.core.net.entities.proto.SubscriptionRequest;
import com.yandex.messaging.core.net.entities.proto.SubscriptionResponse;

/* loaded from: classes15.dex */
public abstract class n1v0 implements o5t0 {
    @Override // defpackage.o5t0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int n(SubscriptionResponse subscriptionResponse) {
        int i = subscriptionResponse.status;
        if (i != 0) {
            return o5t0.o(i);
        }
        v(subscriptionResponse);
        return 0;
    }

    @Override // defpackage.o5t0
    public final Class e() {
        return SubscriptionResponse.class;
    }

    @Override // defpackage.o5t0
    public final String k() {
        return "subscribe";
    }

    public void v(SubscriptionResponse subscriptionResponse) {
    }

    @Override // defpackage.o5t0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract SubscriptionRequest c(int i, int i2);
}
