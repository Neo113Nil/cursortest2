package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class cjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PostPrivacyData b;

    public cjc0(PostPrivacyData postPrivacyData) {
        this.b = postPrivacyData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjc0) && epx.f(this.b, ((cjc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "UpdatePrivacyPostSettings(privacyData=" + this.b + ')';
    }
}
