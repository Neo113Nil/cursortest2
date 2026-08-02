package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: FriendsRequestsComponent.kt */
/* loaded from: classes16.dex */
public final class nss {
    public final String a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b;
    public final cis c;
    public final boolean d;

    public nss(String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, cis cisVar, boolean z) {
        this.a = str;
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        this.c = cisVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nss)) {
            return false;
        }
        nss nssVar = (nss) obj;
        return epx.f(this.a, nssVar.a) && this.b == nssVar.b && epx.f(this.c, nssVar.c) && this.d == nssVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsRequestsHolderConfig(referrer=");
        sb.append(this.a);
        sb.append(", eventScreen=");
        sb.append(this.b);
        sb.append(", cellDesignConfig=");
        sb.append(this.c);
        sb.append(", showActionMessages=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
