package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: FriendsDialogConfig.kt */
/* loaded from: classes5.dex */
public final class hos {
    public final ExtendedUserProfile a;
    public final ios b;

    public hos(ExtendedUserProfile extendedUserProfile, ios iosVar) {
        this.a = extendedUserProfile;
        this.b = iosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hos)) {
            return false;
        }
        hos hosVar = (hos) obj;
        return epx.f(this.a, hosVar.a) && epx.f(this.b, hosVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FriendsDialogConfig(profile=" + this.a + ", option=" + this.b + ')';
    }
}
