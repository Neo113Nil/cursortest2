package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import xsna.xh60;

/* compiled from: NewsfeedEvent.kt */
/* loaded from: classes4.dex */
public final class zh60 implements xh60.g {
    public final SituationalSuggest a;

    public zh60(SituationalSuggest situationalSuggest) {
        this.a = situationalSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh60) && epx.f(this.a, ((zh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Publish(situationalPost=" + this.a + ')';
    }
}
