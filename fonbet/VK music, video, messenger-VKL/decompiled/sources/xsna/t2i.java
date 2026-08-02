package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityStrikesInfoItemModel.kt */
/* loaded from: classes5.dex */
public final class t2i extends s4h {
    public final ExtendedCommunityProfile.g b;

    public t2i(ExtendedCommunityProfile.g gVar) {
        this.b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2i) && epx.f(this.b, ((t2i) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityStrikesInfoItemModel(strikesInfo=" + this.b + ')';
    }
}
