package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import xsna.vs60;

/* compiled from: NewsfeedMainAction.kt */
/* loaded from: classes4.dex */
public final class ys60 implements vs60.h {
    public final SituationalSuggest b;

    public ys60(SituationalSuggest situationalSuggest) {
        this.b = situationalSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys60) && epx.f(this.b, ((ys60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SwipeToHide(situationalSuggest=" + this.b + ')';
    }
}
