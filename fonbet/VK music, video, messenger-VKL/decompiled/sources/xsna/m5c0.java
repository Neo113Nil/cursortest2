package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import java.util.List;

/* compiled from: PostMviState.kt */
/* loaded from: classes4.dex */
public final class m5c0 implements tw60<m5c0> {
    public final UserId b;
    public final int c;
    public final int d;
    public final UserProfile e;
    public final String f;
    public final String g;
    public final ur60 h;
    public final NewsEntry i;
    public final Long j;
    public final int k;
    public final String l;
    public final String m;
    public final CoownershipStatusUiDto n;
    public final List<NewsfeedCoowners.CoownerRequest> o;

    public m5c0(UserId userId, int i, int i2, UserProfile userProfile, String str, String str2, ur60 ur60Var, NewsEntry newsEntry, Long l, int i3, String str3, String str4, CoownershipStatusUiDto coownershipStatusUiDto, List list) {
        this.b = userId;
        this.c = i;
        this.d = i2;
        this.e = userProfile;
        this.f = str;
        this.g = str2;
        this.h = ur60Var;
        this.i = newsEntry;
        this.j = l;
        this.k = i3;
        this.l = str3;
        this.m = str4;
        this.n = coownershipStatusUiDto;
        this.o = list;
    }

    public static m5c0 a(m5c0 m5c0Var, UserId userId, int i, UserProfile userProfile, ur60 ur60Var, NewsEntry newsEntry, String str, CoownershipStatusUiDto coownershipStatusUiDto, List list, int i2) {
        UserId userId2 = (i2 & 1) != 0 ? m5c0Var.b : userId;
        int i3 = (i2 & 2) != 0 ? m5c0Var.c : i;
        int i4 = m5c0Var.d;
        UserProfile userProfile2 = (i2 & 8) != 0 ? m5c0Var.e : userProfile;
        String str2 = (i2 & 16) != 0 ? m5c0Var.f : null;
        String str3 = (i2 & 32) != 0 ? m5c0Var.g : null;
        ur60 ur60Var2 = (i2 & 64) != 0 ? m5c0Var.h : ur60Var;
        NewsEntry newsEntry2 = (i2 & 128) != 0 ? m5c0Var.i : newsEntry;
        Long l = m5c0Var.j;
        int i5 = m5c0Var.k;
        String str4 = (i2 & 1024) != 0 ? m5c0Var.l : str;
        String str5 = m5c0Var.m;
        m5c0Var.getClass();
        CoownershipStatusUiDto coownershipStatusUiDto2 = (i2 & 8192) != 0 ? m5c0Var.n : coownershipStatusUiDto;
        List list2 = (i2 & 16384) != 0 ? m5c0Var.o : list;
        m5c0Var.getClass();
        return new m5c0(userId2, i3, i4, userProfile2, str2, str3, ur60Var2, newsEntry2, l, i5, str4, str5, coownershipStatusUiDto2, list2);
    }

    @Override // xsna.tw60
    public final m5c0 b(ur60 ur60Var) {
        return a(this, null, 0, null, ur60Var, null, null, null, null, 32703);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5c0)) {
            return false;
        }
        m5c0 m5c0Var = (m5c0) obj;
        return epx.f(this.b, m5c0Var.b) && this.c == m5c0Var.c && this.d == m5c0Var.d && epx.f(this.e, m5c0Var.e) && epx.f(this.f, m5c0Var.f) && epx.f(this.g, m5c0Var.g) && epx.f(this.h, m5c0Var.h) && epx.f(this.i, m5c0Var.i) && epx.f(this.j, m5c0Var.j) && this.k == m5c0Var.k && epx.f(this.l, m5c0Var.l) && epx.f(this.m, m5c0Var.m) && this.n == m5c0Var.n && epx.f(this.o, m5c0Var.o);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31);
        UserProfile userProfile = this.e;
        int a2 = urd0.a((a + (userProfile == null ? 0 : userProfile.hashCode())) * 31, 31, this.f);
        String str = this.g;
        int hashCode = (this.h.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        NewsEntry newsEntry = this.i;
        int hashCode2 = (hashCode + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31;
        Long l = this.j;
        int a3 = shy.a(this.k, (hashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str2 = this.l;
        int hashCode3 = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int hashCode4 = (this.n.hashCode() + shy.a(0, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31;
        List<NewsfeedCoowners.CoownerRequest> list = this.o;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostMviState(ownerId=");
        sb.append(this.b);
        sb.append(", itemId=");
        sb.append(this.c);
        sb.append(", tagId=");
        sb.append(this.d);
        sb.append(", tagPlacer=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", listState=");
        sb.append(this.h);
        sb.append(", entry=");
        sb.append(this.i);
        sb.append(", entryKey=");
        sb.append(this.j);
        sb.append(", entryType=");
        sb.append(this.k);
        sb.append(", accessKey=");
        sb.append(this.l);
        sb.append(", trackCode=");
        sb.append(this.m);
        sb.append(", itemType=0, status=");
        sb.append(this.n);
        sb.append(", requests=");
        return ms9.a(')', sb, this.o);
    }
}
