package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;

/* compiled from: CommunityProfileItemBuilder.kt */
/* loaded from: classes5.dex */
public final class kn00 {
    public final ExtendedCommunityProfile a;
    public final r8h b;
    public final xrh c;
    public final k9h d;
    public final int e;
    public final boolean f;
    public final List<String> g;
    public final ed0 h;
    public final kdh i;
    public final spg j;
    public final boolean k;

    public kn00(ExtendedCommunityProfile extendedCommunityProfile, r8h r8hVar, xrh xrhVar, k9h k9hVar, int i, boolean z, List<String> list, ed0 ed0Var, kdh kdhVar, spg spgVar, boolean z2) {
        this.a = extendedCommunityProfile;
        this.b = r8hVar;
        this.c = xrhVar;
        this.d = k9hVar;
        this.e = i;
        this.f = z;
        this.g = list;
        this.h = ed0Var;
        this.i = kdhVar;
        this.j = spgVar;
        this.k = z2;
    }

    public static kn00 a(kn00 kn00Var, r8h r8hVar, xrh xrhVar, k9h k9hVar, int i, List list, ed0 ed0Var, kdh kdhVar, int i2) {
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        if ((i2 & 2) != 0) {
            r8hVar = kn00Var.b;
        }
        r8h r8hVar2 = r8hVar;
        if ((i2 & 4) != 0) {
            xrhVar = kn00Var.c;
        }
        xrh xrhVar2 = xrhVar;
        k9h k9hVar2 = (i2 & 8) != 0 ? kn00Var.d : k9hVar;
        int i3 = (i2 & 16) != 0 ? kn00Var.e : i;
        boolean z = kn00Var.f;
        List list2 = (i2 & 64) != 0 ? kn00Var.g : list;
        ed0 ed0Var2 = (i2 & 128) != 0 ? kn00Var.h : ed0Var;
        kdh kdhVar2 = (i2 & 256) != 0 ? kn00Var.i : kdhVar;
        spg spgVar = kn00Var.j;
        boolean z2 = kn00Var.k;
        kn00Var.getClass();
        return new kn00(extendedCommunityProfile, r8hVar2, xrhVar2, k9hVar2, i3, z, list2, ed0Var2, kdhVar2, spgVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn00)) {
            return false;
        }
        kn00 kn00Var = (kn00) obj;
        return epx.f(this.a, kn00Var.a) && epx.f(this.b, kn00Var.b) && epx.f(this.c, kn00Var.c) && epx.f(this.d, kn00Var.d) && this.e == kn00Var.e && this.f == kn00Var.f && epx.f(this.g, kn00Var.g) && epx.f(this.h, kn00Var.h) && epx.f(this.i, kn00Var.i) && epx.f(this.j, kn00Var.j) && this.k == kn00Var.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r8h r8hVar = this.b;
        int hashCode2 = (hashCode + (r8hVar == null ? 0 : r8hVar.hashCode())) * 31;
        xrh xrhVar = this.c;
        int hashCode3 = (hashCode2 + (xrhVar == null ? 0 : xrhVar.hashCode())) * 31;
        k9h k9hVar = this.d;
        int a = fw3.a(qoy.b(shy.a(this.e, (hashCode3 + (k9hVar == null ? 0 : k9hVar.hashCode())) * 31, 31), 31, this.f), 31, this.g);
        ed0 ed0Var = this.h;
        int hashCode4 = (a + (ed0Var == null ? 0 : ed0Var.hashCode())) * 31;
        kdh kdhVar = this.i;
        int hashCode5 = (hashCode4 + (kdhVar == null ? 0 : kdhVar.hashCode())) * 31;
        spg spgVar = this.j;
        return Boolean.hashCode(this.k) + ((hashCode5 + (spgVar != null ? spgVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MappingParameters(community=");
        sb.append(this.a);
        sb.append(", liveCoverModel=");
        sb.append(this.b);
        sb.append(", onboarding=");
        sb.append(this.c);
        sb.append(", liveVideosModel=");
        sb.append(this.d);
        sb.append(", failedStoryUploadCount=");
        sb.append(this.e);
        sb.append(", useLegoAuthorHeader=");
        sb.append(this.f);
        sb.append(", avatarAlbumPhotoUrls=");
        sb.append(this.g);
        sb.append(", adBloggerBannerData=");
        sb.append(this.h);
        sb.append(", priorityBlockData=");
        sb.append(this.i);
        sb.append(", adBannerData=");
        sb.append(this.j);
        sb.append(", isAdBannerLoaded=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
