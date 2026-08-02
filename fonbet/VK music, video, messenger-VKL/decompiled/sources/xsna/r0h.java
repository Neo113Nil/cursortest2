package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityCustomBadgeItemModel.kt */
/* loaded from: classes5.dex */
public final class r0h extends s4h {
    public final ExtendedUserProfile.f b;

    public r0h(ExtendedUserProfile.f fVar) {
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0h) && epx.f(this.b, ((r0h) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityCustomBadgeItemModel(badge=" + this.b + ')';
    }
}
