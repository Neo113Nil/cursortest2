package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendsGetRequestsSwipePage.kt */
/* loaded from: classes13.dex */
public final class gps {
    public final int a;
    public final VKList<RequestUserProfile> b;
    public final String c;
    public final ass d;

    public gps(int i, VKList<RequestUserProfile> vKList, String str, ass assVar) {
        this.a = i;
        this.b = vKList;
        this.c = str;
        this.d = assVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gps)) {
            return false;
        }
        gps gpsVar = (gps) obj;
        return this.a == gpsVar.a && epx.f(this.b, gpsVar.b) && epx.f(this.c, gpsVar.c) && epx.f(this.d, gpsVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        VKList<RequestUserProfile> vKList = this.b;
        int hashCode2 = (hashCode + (vKList == null ? 0 : vKList.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FriendsGetRequestsSwipePage(unreadRequestsCounter=" + this.a + ", requests=" + this.b + ", recommendationsTitle=" + this.c + ", recommendations=" + this.d + ')';
    }
}
