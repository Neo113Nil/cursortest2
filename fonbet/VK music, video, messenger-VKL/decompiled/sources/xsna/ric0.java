package xsna;

import java.util.Set;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class ric0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final Set<Integer> b;

    public ric0(Set<Integer> set) {
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ric0) && epx.f(this.b, ((ric0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ur.c(new StringBuilder("RemovePhotoTags(photoIds="), this.b, ')');
    }
}
