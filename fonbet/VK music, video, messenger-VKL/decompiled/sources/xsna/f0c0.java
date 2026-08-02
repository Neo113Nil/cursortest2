package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PostArguments.kt */
/* loaded from: classes4.dex */
public final class f0c0 {
    public final String A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final Post.SourceFrom a;
    public final UserId b;
    public final int c;
    public final Integer d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final Long n;
    public final int o;
    public final NewsEntry p;
    public final String q;
    public final List<PhotoTag> r;
    public final UserProfile s;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public f0c0(Post.SourceFrom sourceFrom, UserId userId, int i, Integer num, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, Long l, int i4, NewsEntry newsEntry, String str2, ArrayList arrayList, UserProfile userProfile, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str5, int i5, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.a = sourceFrom;
        this.b = userId;
        this.c = i;
        this.d = num;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str;
        this.n = l;
        this.o = i4;
        this.p = newsEntry;
        this.q = str2;
        this.r = arrayList;
        this.s = userProfile;
        this.t = str3;
        this.u = str4;
        this.v = z7;
        this.w = z8;
        this.x = z9;
        this.y = z10;
        this.z = z11;
        this.A = str5;
        this.B = i5;
        this.C = z12;
        this.D = z13;
        this.E = z14;
        this.F = z15;
        this.G = z16;
        this.H = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0c0)) {
            return false;
        }
        f0c0 f0c0Var = (f0c0) obj;
        return this.a == f0c0Var.a && epx.f(this.b, f0c0Var.b) && this.c == f0c0Var.c && epx.f(this.d, f0c0Var.d) && this.e == f0c0Var.e && this.f == f0c0Var.f && this.g == f0c0Var.g && this.h == f0c0Var.h && this.i == f0c0Var.i && this.j == f0c0Var.j && this.k == f0c0Var.k && this.l == f0c0Var.l && epx.f(this.m, f0c0Var.m) && epx.f(this.n, f0c0Var.n) && this.o == f0c0Var.o && epx.f(this.p, f0c0Var.p) && epx.f(this.q, f0c0Var.q) && epx.f(this.r, f0c0Var.r) && epx.f(this.s, f0c0Var.s) && epx.f(this.t, f0c0Var.t) && epx.f(this.u, f0c0Var.u) && this.v == f0c0Var.v && this.w == f0c0Var.w && this.x == f0c0Var.x && this.y == f0c0Var.y && this.z == f0c0Var.z && epx.f(this.A, f0c0Var.A) && this.B == f0c0Var.B && this.C == f0c0Var.C && this.D == f0c0Var.D && this.E == f0c0Var.E && this.F == f0c0Var.F && this.G == f0c0Var.G && this.H == f0c0Var.H;
    }

    public final int hashCode() {
        int a = shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31);
        Integer num = this.d;
        int a2 = urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.f, shy.a(this.e, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        Long l = this.n;
        int a3 = shy.a(this.o, (a2 + (l == null ? 0 : l.hashCode())) * 31, 31);
        NewsEntry newsEntry = this.p;
        int hashCode = (a3 + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31;
        String str = this.q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PhotoTag> list = this.r;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        UserProfile userProfile = this.s;
        int hashCode4 = (hashCode3 + (userProfile == null ? 0 : userProfile.hashCode())) * 31;
        String str2 = this.t;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.u;
        return Boolean.hashCode(this.H) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.B, urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostArguments(postFrom=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", itemId=");
        sb.append(this.c);
        sb.append(", commentId=");
        sb.append(this.d);
        sb.append(", startCommentId=");
        sb.append(this.e);
        sb.append(", parentCommentId=");
        sb.append(this.f);
        sb.append(", dismissOnOpeningVideo=");
        sb.append(this.g);
        sb.append(", showLikesInfo=");
        sb.append(this.h);
        sb.append(", isSuggestSubscribeAllowed=");
        sb.append(this.i);
        sb.append(", shouldShowReactionsPanel=");
        sb.append(this.j);
        sb.append(", shouldDisplaySendDonutButton=");
        sb.append(this.k);
        sb.append(", isTimeSpentTrackerEnabled=");
        sb.append(this.l);
        sb.append(", referer=");
        sb.append(this.m);
        sb.append(", entryKey=");
        sb.append(this.n);
        sb.append(", entryType=");
        sb.append(this.o);
        sb.append(", entry=");
        sb.append(this.p);
        sb.append(", accessKey=");
        sb.append(this.q);
        sb.append(", suggestedTags=");
        sb.append(this.r);
        sb.append(", tagPlacer=");
        sb.append(this.s);
        sb.append(", trackCode=");
        sb.append(this.t);
        sb.append(", contentId=");
        sb.append(this.u);
        sb.append(", shouldLoadAsVideos=");
        sb.append(this.v);
        sb.append(", shouldLoadAsShortVideos=");
        sb.append(this.w);
        sb.append(", shouldLoadAsPhotos=");
        sb.append(this.x);
        sb.append(", scrollToComments=");
        sb.append(this.y);
        sb.append(", canShareOnWall=");
        sb.append(this.z);
        sb.append(", navScreen=");
        sb.append(this.A);
        sb.append(", tagId=");
        sb.append(this.B);
        sb.append(", isFooterDisabled=");
        sb.append(this.C);
        sb.append(", isOrderInfoDisabled=");
        sb.append(this.D);
        sb.append(", showCommentsCount=");
        sb.append(this.E);
        sb.append(", startFromParent=");
        sb.append(this.F);
        sb.append(", shouldShowKeyboard=");
        sb.append(this.G);
        sb.append(", shouldShowWriteBarAttach=");
        return defpackage.q0.a(sb, this.H, ')');
    }
}
