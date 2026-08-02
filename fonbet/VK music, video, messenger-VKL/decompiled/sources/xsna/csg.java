package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityAuthorHeaderModel.kt */
/* loaded from: classes5.dex */
public final class csg extends s4h {
    public final AuthorHeaderConfig b;
    public final ExtendedCommunityProfile c;

    public csg(AuthorHeaderConfig authorHeaderConfig, ExtendedCommunityProfile extendedCommunityProfile) {
        this.b = authorHeaderConfig;
        this.c = extendedCommunityProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csg)) {
            return false;
        }
        csg csgVar = (csg) obj;
        return epx.f(this.b, csgVar.b) && epx.f(this.c, csgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityAuthorHeaderModel(config=");
        sb.append(this.b);
        sb.append(", community=");
        return at.a(sb, this.c, ')');
    }
}
