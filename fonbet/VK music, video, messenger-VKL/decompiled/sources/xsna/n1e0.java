package xsna;

import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import java.util.AbstractList;
import java.util.List;

/* compiled from: ProfilesRecommendationsUiDto.kt */
/* loaded from: classes4.dex */
public final class n1e0 extends ol60 {
    public final String h;
    public final List<z0e0> i;
    public final ProfilesRecommendations j;
    public final RecommendedProfile k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final bwy o;
    public final boolean p;

    public n1e0(String str, AbstractList abstractList, ProfilesRecommendations profilesRecommendations, RecommendedProfile recommendedProfile, boolean z, boolean z2, String str2, bwy bwyVar, boolean z3) {
        super(13, 0, 0, 0, null);
        this.h = str;
        this.i = abstractList;
        this.j = profilesRecommendations;
        this.k = recommendedProfile;
        this.l = z;
        this.m = z2;
        this.n = str2;
        this.o = bwyVar;
        this.p = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1e0)) {
            return false;
        }
        n1e0 n1e0Var = (n1e0) obj;
        return epx.f(this.h, n1e0Var.h) && epx.f(this.i, n1e0Var.i) && epx.f(this.j, n1e0Var.j) && epx.f(this.k, n1e0Var.k) && this.l == n1e0Var.l && this.m == n1e0Var.m && epx.f(this.n, n1e0Var.n) && epx.f(this.o, n1e0Var.o) && this.p == n1e0Var.p;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + fw3.a(this.h.hashCode() * 31, 31, this.i)) * 31;
        RecommendedProfile recommendedProfile = this.k;
        int b = qoy.b(qoy.b((hashCode + (recommendedProfile == null ? 0 : recommendedProfile.hashCode())) * 31, 31, this.l), 31, this.m);
        String str = this.n;
        return Integer.hashCode(0) + qoy.b((this.o.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilesRecommendationsUiDto(adapterBlockType=");
        sb.append(this.h);
        sb.append(", profilesCarouselItemUiDtoList=");
        sb.append(this.i);
        sb.append(", recommendations=");
        sb.append(this.j);
        sb.append(", firstProfile=");
        sb.append(this.k);
        sb.append(", isContactSyncEnabled=");
        sb.append(this.l);
        sb.append(", hasMore=");
        sb.append(this.m);
        sb.append(", nextFrom=");
        sb.append(this.n);
        sb.append(", lazyLoadState=");
        sb.append(this.o);
        sb.append(", showError=");
        return n23.b(sb, this.p, ", seqId=0)");
    }
}
