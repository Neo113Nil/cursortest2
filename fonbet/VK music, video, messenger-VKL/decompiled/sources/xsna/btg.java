package xsna;

import com.vk.dto.user.deactivation.Deactivation;

/* compiled from: CommunityBlockedOrPrivateItemModel.kt */
/* loaded from: classes5.dex */
public final class btg extends s4h {
    public final boolean b;
    public final Deactivation c;

    public btg(boolean z, Deactivation deactivation) {
        this.b = z;
        this.c = deactivation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btg)) {
            return false;
        }
        btg btgVar = (btg) obj;
        return this.b == btgVar.b && epx.f(this.c, btgVar.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Deactivation deactivation = this.c;
        return hashCode + (deactivation == null ? 0 : deactivation.hashCode());
    }

    public final String toString() {
        return "CommunityBlockedOrPrivateItemModel(isPrivate=" + this.b + ", ownerState=" + this.c + ')';
    }
}
