package xsna;

import com.vk.clips.sdk.models.SdkOwner;

/* compiled from: StaticAdsItemSubscriptionEvent.kt */
/* loaded from: classes17.dex */
public final class nwk0 implements qwk0 {
    public final SdkOwner a;

    public nwk0(SdkOwner sdkOwner) {
        this.a = sdkOwner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwk0) && epx.f(this.a, ((nwk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Owner(owner=" + this.a + ')';
    }
}
