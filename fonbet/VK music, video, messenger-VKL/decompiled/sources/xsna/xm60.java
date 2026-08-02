package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: NewsfeedItemOptionsParams.kt */
/* loaded from: classes4.dex */
public final class xm60 {
    public final NewsEntry a;
    public final NewsEntry b;
    public final FavePage c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final UserId h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public xm60(NewsEntry newsEntry, NewsEntry newsEntry2, FavePage favePage, boolean z, boolean z2, boolean z3, boolean z4, UserId userId, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i) {
        NewsEntry newsEntry3 = (i & 2) != 0 ? null : newsEntry2;
        FavePage favePage2 = (i & 4) != 0 ? null : favePage;
        boolean z12 = (i & 8) != 0 ? false : z;
        boolean z13 = (i & 16) != 0 ? false : z2;
        boolean z14 = (i & 32) != 0 ? false : z3;
        UserId userId2 = (i & 512) == 0 ? userId : null;
        boolean z15 = (i & 1024) != 0 ? false : z5;
        boolean z16 = (i & 2048) != 0 ? false : z6;
        boolean z17 = (i & 4096) != 0 ? false : z7;
        boolean z18 = (i & 8192) != 0 ? false : z8;
        boolean z19 = (i & 16384) != 0 ? false : z9;
        boolean z20 = (32768 & i) != 0 ? false : z10;
        boolean z21 = (i & 65536) == 0 ? z11 : false;
        this.a = newsEntry;
        this.b = newsEntry3;
        this.c = favePage2;
        this.d = z12;
        this.e = z13;
        this.f = z14;
        this.g = z4;
        this.h = userId2;
        this.i = z15;
        this.j = z16;
        this.k = z17;
        this.l = z18;
        this.m = z19;
        this.n = z20;
        this.o = z21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm60)) {
            return false;
        }
        xm60 xm60Var = (xm60) obj;
        return epx.f(this.a, xm60Var.a) && epx.f(this.b, xm60Var.b) && epx.f(this.c, xm60Var.c) && this.d == xm60Var.d && this.e == xm60Var.e && this.f == xm60Var.f && this.g == xm60Var.g && epx.f(this.h, xm60Var.h) && this.i == xm60Var.i && this.j == xm60Var.j && this.k == xm60Var.k && this.l == xm60Var.l && this.m == xm60Var.m && this.n == xm60Var.n && this.o == xm60Var.o;
    }

    public final int hashCode() {
        NewsEntry newsEntry = this.a;
        int hashCode = (newsEntry == null ? 0 : newsEntry.hashCode()) * 31;
        NewsEntry newsEntry2 = this.b;
        int hashCode2 = (hashCode + (newsEntry2 == null ? 0 : newsEntry2.hashCode())) * 31;
        FavePage favePage = this.c;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (favePage == null ? 0 : favePage.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, false), 31, true), 31, this.g);
        UserId userId = this.h;
        return Boolean.hashCode(this.o) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((b + (userId != null ? Long.hashCode(userId.b) : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemOptionsParams(entry=");
        sb.append(this.a);
        sb.append(", rootEntry=");
        sb.append(this.b);
        sb.append(", favePage=");
        sb.append(this.c);
        sb.append(", canHideNotInteresting=");
        sb.append(this.d);
        sb.append(", shouldShowBelowCentered=");
        sb.append(this.e);
        sb.append(", shouldHighlight=");
        sb.append(this.f);
        sb.append(", canShowSimilarPosts=false, canFave=true, isPinEnabled=");
        sb.append(this.g);
        sb.append(", currentUserId=");
        sb.append(this.h);
        sb.append(", isProfileWallOrCommunityWall=");
        sb.append(this.i);
        sb.append(", canShowMainTabActions=");
        sb.append(this.j);
        sb.append(", canShowBlacklistItems=");
        sb.append(this.k);
        sb.append(", isOnTheMainTab=");
        sb.append(this.l);
        sb.append(", canShowEasyPromoteActions=");
        sb.append(this.m);
        sb.append(", isAddToPlaylistActionAvailable=");
        sb.append(this.n);
        sb.append(", isEditPlaylistActionAvailable=");
        return defpackage.q0.a(sb, this.o, ')');
    }
}
