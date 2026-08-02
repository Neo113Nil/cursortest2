package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityWebsiteItemModel.kt */
/* loaded from: classes5.dex */
public final class f5i extends s4h {
    public final String b;
    public final UserId c;

    public f5i(String str, UserId userId) {
        this.b = str;
        this.c = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5i)) {
            return false;
        }
        f5i f5iVar = (f5i) obj;
        return epx.f(this.b, f5iVar.b) && epx.f(this.c, f5iVar.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityWebsiteItemModel(website=");
        sb.append(this.b);
        sb.append(", uid=");
        return gp.b(sb, this.c, ')');
    }
}
