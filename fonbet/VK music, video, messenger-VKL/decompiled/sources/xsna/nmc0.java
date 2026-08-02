package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class nmc0 implements fmc0.j {
    public final PostPrivacyData a;

    public nmc0(PostPrivacyData postPrivacyData) {
        this.a = postPrivacyData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmc0) && epx.f(this.a, ((nmc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPrivacyDatePicker(currentPrivacy=" + this.a + ')';
    }
}
