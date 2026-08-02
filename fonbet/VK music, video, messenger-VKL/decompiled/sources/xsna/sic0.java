package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class sic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final ActionButton b;

    public sic0(ActionButton actionButton) {
        this.b = actionButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sic0) && epx.f(this.b, ((sic0) obj).b);
    }

    public final int hashCode() {
        ActionButton actionButton = this.b;
        if (actionButton == null) {
            return 0;
        }
        return actionButton.hashCode();
    }

    public final String toString() {
        return "SetActionButton(action=" + this.b + ')';
    }
}
