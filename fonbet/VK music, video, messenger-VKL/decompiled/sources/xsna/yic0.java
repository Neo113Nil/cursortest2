package xsna;

import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class yic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PrivacyPostType b;

    public yic0(PrivacyPostType privacyPostType) {
        this.b = privacyPostType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yic0) && epx.f(this.b, ((yic0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "UpdateCurrentPrivacyTypePostSettings(currentType=" + this.b + ')';
    }
}
