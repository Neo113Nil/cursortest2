package xsna;

import com.vk.feed.core.models.channels.ChannelsRecommendation;

/* compiled from: ChannelsCarouselItemUiDto.kt */
/* loaded from: classes4.dex */
public final class jeb {
    public final ChannelsRecommendation a;

    public jeb(ChannelsRecommendation channelsRecommendation) {
        this.a = channelsRecommendation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jeb) && epx.f(this.a, ((jeb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Channel(channelsRecommendation=" + this.a + ')';
    }
}
