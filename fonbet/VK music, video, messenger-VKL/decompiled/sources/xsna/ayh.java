package xsna;

import kotlin.collections.builders.MapBuilder;

/* compiled from: CommunityReviewRepliesInteractor.kt */
/* loaded from: classes18.dex */
public final class ayh {
    public final txh a;
    public final MapBuilder b;

    public ayh(txh txhVar, MapBuilder mapBuilder) {
        this.a = txhVar;
        this.b = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayh)) {
            return false;
        }
        ayh ayhVar = (ayh) obj;
        return this.a.equals(ayhVar.a) && this.b.equals(ayhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityReviewRepliesResponse(review=" + this.a + ", usersAndGroups=" + this.b + ')';
    }
}
