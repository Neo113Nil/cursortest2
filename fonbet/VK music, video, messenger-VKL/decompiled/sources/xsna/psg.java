package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityBannedItemModel.kt */
/* loaded from: classes5.dex */
public final class psg extends s4h {
    public final ExtendedUserProfile.e b;

    public psg(ExtendedUserProfile.e eVar) {
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psg) && epx.f(this.b, ((psg) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityBannedItemModel(ban=" + this.b + ')';
    }
}
