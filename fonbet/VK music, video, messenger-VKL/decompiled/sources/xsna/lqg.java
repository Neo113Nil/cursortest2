package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityAddDescriptionItemModel.kt */
/* loaded from: classes5.dex */
public final class lqg extends s4h {
    public final UserId b;

    public lqg(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqg) && epx.f(this.b, ((lqg) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        return "CommunityAddDescriptionItemModel(uid=" + this.b + ", shouldAddTopPadding=false)";
    }
}
