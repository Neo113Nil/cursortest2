package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;

/* compiled from: NewsfeedExternalAction.kt */
/* loaded from: classes4.dex */
public final class fi60 implements NewsfeedExternalAction {
    public final SituationalSuggest a;

    public fi60(SituationalSuggest situationalSuggest) {
        this.a = situationalSuggest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi60) && epx.f(this.a, ((fi60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DismissSuggestion(situationalSuggest=" + this.a + ')';
    }
}
