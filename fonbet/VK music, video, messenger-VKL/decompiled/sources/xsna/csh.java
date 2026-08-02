package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vkontakte.android.data.groups.FullSourceJoinApi;

/* compiled from: CommunityProfileParams.kt */
/* loaded from: classes5.dex */
public final class csh {
    public final UserId a;
    public CommunityProfileDeeplinkParams b;
    public final mzp0 c;
    public final String d;
    public final String e;
    public final WallGetMode f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final FullSourceJoinApi.EntryServiceType j;
    public final String k;
    public final String l;

    public csh(UserId userId, CommunityProfileDeeplinkParams communityProfileDeeplinkParams, mzp0 mzp0Var, String str, String str2, WallGetMode wallGetMode, String str3, boolean z, boolean z2, FullSourceJoinApi.EntryServiceType entryServiceType, String str4, String str5) {
        this.a = userId;
        this.b = communityProfileDeeplinkParams;
        this.c = mzp0Var;
        this.d = str;
        this.e = str2;
        this.f = wallGetMode;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = entryServiceType;
        this.k = str4;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csh)) {
            return false;
        }
        csh cshVar = (csh) obj;
        return epx.f(this.a, cshVar.a) && epx.f(this.b, cshVar.b) && epx.f(this.c, cshVar.c) && epx.f(this.d, cshVar.d) && epx.f(this.e, cshVar.e) && this.f == cshVar.f && epx.f(this.g, cshVar.g) && this.h == cshVar.h && this.i == cshVar.i && this.j == cshVar.j && epx.f(this.k, cshVar.k) && epx.f(this.l, cshVar.l);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        CommunityProfileDeeplinkParams communityProfileDeeplinkParams = this.b;
        int hashCode2 = (hashCode + (communityProfileDeeplinkParams == null ? 0 : communityProfileDeeplinkParams.hashCode())) * 31;
        mzp0 mzp0Var = this.c;
        int hashCode3 = (hashCode2 + (mzp0Var == null ? 0 : mzp0Var.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallGetMode wallGetMode = this.f;
        int hashCode6 = (hashCode5 + (wallGetMode == null ? 0 : wallGetMode.hashCode())) * 31;
        String str3 = this.g;
        int b = qoy.b(qoy.b((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h), 31, this.i);
        FullSourceJoinApi.EntryServiceType entryServiceType = this.j;
        int hashCode7 = (b + (entryServiceType == null ? 0 : entryServiceType.hashCode())) * 31;
        String str4 = this.k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileParams(communityId=");
        sb.append(this.a);
        sb.append(", deeplinkParams=");
        sb.append(this.b);
        sb.append(", uiMeasuringSession=");
        sb.append(this.c);
        sb.append(", ref=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", wallMode=");
        sb.append(this.f);
        sb.append(", joinGroupSignature=");
        sb.append(this.g);
        sb.append(", isFromClip=");
        sb.append(this.h);
        sb.append(", isFromNewCreationFlow=");
        sb.append(this.i);
        sb.append(", entryService=");
        sb.append(this.j);
        sb.append(", prevSource=");
        sb.append(this.k);
        sb.append(", prevScreenName=");
        return ho8.a(sb, this.l, ')');
    }
}
