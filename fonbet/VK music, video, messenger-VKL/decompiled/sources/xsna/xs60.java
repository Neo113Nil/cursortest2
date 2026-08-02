package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import xsna.vs60;

/* compiled from: NewsfeedMainAction.kt */
/* loaded from: classes4.dex */
public final class xs60 implements vs60.h {
    public final SituationalSuggest b;

    public xs60(SituationalSuggest situationalSuggest) {
        this.b = situationalSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs60) && epx.f(this.b, ((xs60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ClickPublishButton(situationalSuggest=" + this.b + ')';
    }
}
