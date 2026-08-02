package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import xsna.xh60;

/* compiled from: NewsfeedEvent.kt */
/* loaded from: classes4.dex */
public final class ai60 implements xh60.g {
    public final SituationalSuggest a;

    public ai60(SituationalSuggest situationalSuggest) {
        this.a = situationalSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai60) && epx.f(this.a, ((ai60) obj).a);
    }

    public final int hashCode() {
        SituationalSuggest situationalSuggest = this.a;
        if (situationalSuggest == null) {
            return 0;
        }
        return situationalSuggest.hashCode();
    }

    public final String toString() {
        return "Show(situationalPost=" + this.a + ')';
    }
}
