package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;

/* compiled from: CommunityProfileCommonMapper.kt */
/* loaded from: classes5.dex */
public final class o9d0 {
    public final ExtendedCommunityProfile a;
    public final r8h b;
    public final e6h c;
    public final xrh d;
    public final boolean e;
    public final int f;
    public final List<String> g;

    public o9d0(ExtendedCommunityProfile extendedCommunityProfile, r8h r8hVar, e6h e6hVar, xrh xrhVar, boolean z, int i, List<String> list) {
        this.a = extendedCommunityProfile;
        this.b = r8hVar;
        this.c = e6hVar;
        this.d = xrhVar;
        this.e = z;
        this.f = i;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9d0)) {
            return false;
        }
        o9d0 o9d0Var = (o9d0) obj;
        return epx.f(this.a, o9d0Var.a) && epx.f(this.b, o9d0Var.b) && epx.f(this.c, o9d0Var.c) && epx.f(this.d, o9d0Var.d) && this.e == o9d0Var.e && this.f == o9d0Var.f && epx.f(this.g, o9d0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r8h r8hVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (r8hVar == null ? 0 : r8hVar.hashCode())) * 31)) * 31;
        xrh xrhVar = this.d;
        return this.g.hashCode() + shy.a(this.f, qoy.b((hashCode2 + (xrhVar != null ? xrhVar.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimaryHeaderItemParams(community=");
        sb.append(this.a);
        sb.append(", liveCoverModel=");
        sb.append(this.b);
        sb.append(", invitePolicy=");
        sb.append(this.c);
        sb.append(", onboarding=");
        sb.append(this.d);
        sb.append(", isLiveCover=");
        sb.append(this.e);
        sb.append(", failedStoryUploadCount=");
        sb.append(this.f);
        sb.append(", avatarAlbumPhotoUrls=");
        return ms9.a(')', sb, this.g);
    }
}
