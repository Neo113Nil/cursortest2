package xsna;

import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;

/* compiled from: PostingCarouselSwitcherViewState.kt */
/* loaded from: classes4.dex */
public final class mdc0 {
    public final boolean a;
    public final PhotoVideoDisplayMode b;

    public mdc0(PhotoVideoDisplayMode photoVideoDisplayMode, boolean z) {
        this.a = z;
        this.b = photoVideoDisplayMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdc0)) {
            return false;
        }
        mdc0 mdc0Var = (mdc0) obj;
        return this.a == mdc0Var.a && this.b == mdc0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PostingCarouselSwitcherViewState(isVisibleSwitcher=" + this.a + ", displayMode=" + this.b + ')';
    }
}
