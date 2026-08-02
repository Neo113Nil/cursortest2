package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import xsna.vs60;

/* compiled from: NewsfeedMainAction.kt */
/* loaded from: classes4.dex */
public final class ws60 implements vs60.h {
    public final SituationalSuggest b;

    public ws60(SituationalSuggest situationalSuggest) {
        this.b = situationalSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws60) && epx.f(this.b, ((ws60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ClickCloseButton(situationalSuggest=" + this.b + ')';
    }
}
