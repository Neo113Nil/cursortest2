package xsna;

import com.vkontakte.android.data.groups.FullSourceJoinApi;

/* compiled from: CommunityProfileFollowAnalyticParams.kt */
/* loaded from: classes5.dex */
public final class qoh {
    public final String a;
    public final FullSourceJoinApi.EntryServiceType b;
    public final String c;

    public qoh(FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
        this.a = str;
        this.b = entryServiceType;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoh)) {
            return false;
        }
        qoh qohVar = (qoh) obj;
        return epx.f(this.a, qohVar.a) && this.b == qohVar.b && epx.f(this.c, qohVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FullSourceJoinApi.EntryServiceType entryServiceType = this.b;
        int hashCode2 = (hashCode + (entryServiceType == null ? 0 : entryServiceType.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileFollowAnalyticParams(prevSource=");
        sb.append(this.a);
        sb.append(", entryService=");
        sb.append(this.b);
        sb.append(", prevScreenName=");
        return ho8.a(sb, this.c, ')');
    }
}
