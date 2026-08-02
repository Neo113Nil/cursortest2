package xsna;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class djc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final String b;

    public djc0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djc0) && epx.f(this.b, ((djc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AddRemoteDraftOnboardingHint(hint="), this.b, ')');
    }
}
