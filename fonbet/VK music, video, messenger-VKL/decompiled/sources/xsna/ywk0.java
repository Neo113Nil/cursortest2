package xsna;

import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;

/* compiled from: StaticAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class ywk0 implements StaticAdsItemViewEvent {
    public long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywk0) && this.b == ((ywk0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Success(timestamp="));
    }
}
