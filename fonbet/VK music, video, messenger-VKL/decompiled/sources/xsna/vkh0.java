package xsna;

import com.vk.subscription.api.SubscribeStatus;

/* compiled from: UsersBridgeAdapter.kt */
/* loaded from: classes17.dex */
public final class vkh0 {
    public final SubscribeStatus a;

    public vkh0(SubscribeStatus subscribeStatus) {
        this.a = subscribeStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vkh0) && this.a == ((vkh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SdkSubscribeStatusAdapter(original=" + this.a + ')';
    }
}
