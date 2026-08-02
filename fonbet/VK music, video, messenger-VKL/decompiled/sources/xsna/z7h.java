package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityLegoTemporaryBlacklistItemModel.kt */
/* loaded from: classes5.dex */
public final class z7h extends s4h {
    public final ExtendedUserProfile.e b;

    public z7h(ExtendedUserProfile.e eVar) {
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7h) && epx.f(this.b, ((z7h) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityLegoTemporaryBlacklistItemModel(ban=" + this.b + ')';
    }
}
