package xsna;

import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;

/* compiled from: StaticAdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class uwk0 implements StaticAdsItemViewEvent {
    public final String b;

    public uwk0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwk0) && epx.f(this.b, ((uwk0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("HashtagClicked(hashtag="), this.b, ')');
    }
}
