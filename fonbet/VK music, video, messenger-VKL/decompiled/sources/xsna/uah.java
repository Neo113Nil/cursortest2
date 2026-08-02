package xsna;

import com.vk.profile.community.details.api.name_history.data.dto.CommunityNameHistoryAction;

/* compiled from: CommunityNameHistoryListItem.kt */
/* loaded from: classes5.dex */
public final class uah implements hfz {
    public final CommunityNameHistoryAction b;
    public final String c;
    public final long d;

    public uah(long j, CommunityNameHistoryAction communityNameHistoryAction, String str) {
        this.b = communityNameHistoryAction;
        this.c = str;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uah)) {
            return false;
        }
        uah uahVar = (uah) obj;
        return this.b == uahVar.b && epx.f(this.c, uahVar.c) && this.d == uahVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityNameHistoryListItem(type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", time=");
        return vu5.a(')', this.d, sb);
    }
}
