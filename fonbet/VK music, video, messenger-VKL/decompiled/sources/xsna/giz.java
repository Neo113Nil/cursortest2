package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;

/* compiled from: LiveAuthorItem.kt */
/* loaded from: classes3.dex */
public final class giz implements hfz {
    public final oap<UserProfile, Group> b;

    /* JADX WARN: Multi-variable type inference failed */
    public giz(oap<? extends UserProfile, ? extends Group> oapVar) {
        this.b = oapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof giz) && epx.f(this.b, ((giz) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LiveAuthorItem(userOrGroup=" + this.b + ')';
    }
}
