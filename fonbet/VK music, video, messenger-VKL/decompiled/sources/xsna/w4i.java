package xsna;

import com.vk.dto.user.deactivation.Deactivation;

/* compiled from: CommunityUserSubscribedItemModel.kt */
/* loaded from: classes5.dex */
public final class w4i extends s4h {
    public final int b;
    public final boolean c;
    public final Deactivation d;
    public final int e;

    public w4i(int i, boolean z, Deactivation deactivation, int i2) {
        this.b = i;
        this.c = z;
        this.d = deactivation;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4i)) {
            return false;
        }
        w4i w4iVar = (w4i) obj;
        return this.b == w4iVar.b && this.c == w4iVar.c && epx.f(this.d, w4iVar.d) && this.e == w4iVar.e;
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.b) * 31, 31, this.c);
        Deactivation deactivation = this.d;
        return Integer.hashCode(this.e) + ((b + (deactivation == null ? 0 : deactivation.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityUserSubscribedItemModel(groupType=");
        sb.append((Object) hr80.G(this.b));
        sb.append(", isHiddenFromFeed=");
        sb.append(this.c);
        sb.append(", ownerState=");
        sb.append(this.d);
        sb.append(", membersCount=");
        return vu5.b(sb, this.e, ')');
    }
}
