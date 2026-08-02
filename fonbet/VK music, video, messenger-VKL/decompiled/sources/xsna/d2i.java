package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityShopConditionsItemModel.kt */
/* loaded from: classes5.dex */
public final class d2i extends s4h {
    public final UserId b;

    public d2i(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2i) && epx.f(this.b, ((d2i) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("CommunityShopConditionsItemModel(uid="), this.b, ')');
    }
}
