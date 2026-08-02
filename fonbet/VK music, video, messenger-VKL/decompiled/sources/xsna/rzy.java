package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: ActionButtonsEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class rzy {
    public final String a;
    public final PostingAction b;

    public rzy() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzy)) {
            return false;
        }
        rzy rzyVar = (rzy) obj;
        return epx.f(this.a, rzyVar.a) && epx.f(this.b, rzyVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PostingAction postingAction = this.b;
        return hashCode + (postingAction != null ? postingAction.hashCode() : 0);
    }

    public final String toString() {
        return "LeftContentTooltipTitleWithAction(tooltipTitle=" + this.a + ", dismissPostingAction=" + this.b + ')';
    }

    public rzy(String str, PostingAction.Hints hints) {
        this.a = str;
        this.b = hints;
    }
}
