package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendsGetRequestsNotificationsPage.kt */
/* loaded from: classes13.dex */
public final class cps {
    public final VKList<RequestUserProfile> a;
    public final VKList<RequestUserProfile> b;
    public final ass c;

    public cps(VKList<RequestUserProfile> vKList, VKList<RequestUserProfile> vKList2, ass assVar) {
        this.a = vKList;
        this.b = vKList2;
        this.c = assVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cps)) {
            return false;
        }
        cps cpsVar = (cps) obj;
        return epx.f(this.a, cpsVar.a) && epx.f(this.b, cpsVar.b) && epx.f(this.c, cpsVar.c);
    }

    public final int hashCode() {
        VKList<RequestUserProfile> vKList = this.a;
        int hashCode = (vKList == null ? 0 : vKList.hashCode()) * 31;
        VKList<RequestUserProfile> vKList2 = this.b;
        return this.c.hashCode() + ((hashCode + (vKList2 != null ? vKList2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FriendsGetRequestsNotificationsPage(unreadRequests=" + this.a + ", readRequests=" + this.b + ", recommendations=" + this.c + ')';
    }
}
