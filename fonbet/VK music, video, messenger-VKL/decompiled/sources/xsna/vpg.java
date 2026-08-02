package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityAdBloggerBannerItemModel.kt */
/* loaded from: classes5.dex */
public final class vpg extends s4h {
    public final ed0 b;
    public final UserId c;

    public vpg(ed0 ed0Var, UserId userId) {
        this.b = ed0Var;
        this.c = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpg)) {
            return false;
        }
        vpg vpgVar = (vpg) obj;
        return epx.f(this.b, vpgVar.b) && epx.f(this.c, vpgVar.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityAdBloggerBannerItemModel(bannerData=");
        sb.append(this.b);
        sb.append(", groupId=");
        return gp.b(sb, this.c, ')');
    }
}
