package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;

/* compiled from: RxUsersSubscriptionBus.kt */
/* loaded from: classes6.dex */
public final class kym0 {
    public final SubscribeStatus a;
    public final UserId b;
    public final String c;
    public final Peer.Type d;

    public kym0(SubscribeStatus subscribeStatus, UserId userId, String str, Peer.Type type) {
        this.a = subscribeStatus;
        this.b = userId;
        this.c = str;
        this.d = type;
    }

    public final SubscribeStatus a() {
        return this.a;
    }

    public final UserId b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kym0)) {
            return false;
        }
        kym0 kym0Var = (kym0) obj;
        return this.a == kym0Var.a && epx.f(this.b, kym0Var.b) && epx.f(this.c, kym0Var.c) && this.d == kym0Var.d;
    }

    public final int hashCode() {
        int a = bh10.a(this.a.hashCode() * 31, 31, this.b.b);
        String str = this.c;
        return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SubscriptionInfo(status=" + this.a + ", userId=" + this.b + ", accessKey=" + this.c + ", type=" + this.d + ')';
    }

    public /* synthetic */ kym0(SubscribeStatus subscribeStatus, UserId userId, String str, Peer.Type type, int i) {
        this(subscribeStatus, userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? Peer.Type.UNKNOWN : type);
    }
}
