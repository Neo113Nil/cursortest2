package xsna;

import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.header.HeaderIcon;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.header.IconSize;
import java.util.List;

/* compiled from: PostHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class v3c0 extends ol60 {
    public final boolean A;
    public final boolean B;
    public final VerifyInfo C;
    public final IconSize D;
    public final int E;
    public final String F;
    public final ThemedColor G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final UserId K;
    public final NewsEntry L;
    public final boolean M;
    public final boolean N;
    public final NewsEntry O;
    public final NewsEntry P;
    public final String h;
    public final boolean i;
    public final String j;
    public final CharSequence k;
    public final UserId l;
    public final List<Description> m;
    public final String n;
    public final Integer o;
    public final boolean p;
    public final ImageStatus q;
    public final String r;
    public final String s;
    public final boolean t;
    public final HeaderIcon u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public v3c0(String str, boolean z, String str2, CharSequence charSequence, UserId userId, List list, String str3, Integer num, boolean z2, ImageStatus imageStatus, String str4, String str5, boolean z3, HeaderIcon headerIcon, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, VerifyInfo verifyInfo, IconSize iconSize, int i, String str6, ThemedColor themedColor, boolean z11, boolean z12, boolean z13, UserId userId2, NewsEntry newsEntry, boolean z14, boolean z15, NewsEntry newsEntry2, NewsEntry newsEntry3) {
        super(302, 0, 0, 0, null);
        this.h = str;
        this.i = z;
        this.j = str2;
        this.k = charSequence;
        this.l = userId;
        this.m = list;
        this.n = str3;
        this.o = num;
        this.p = z2;
        this.q = imageStatus;
        this.r = str4;
        this.s = str5;
        this.t = z3;
        this.u = headerIcon;
        this.v = z4;
        this.w = z5;
        this.x = z6;
        this.y = z7;
        this.z = z8;
        this.A = z9;
        this.B = z10;
        this.C = verifyInfo;
        this.D = iconSize;
        this.E = i;
        this.F = str6;
        this.G = themedColor;
        this.H = z11;
        this.I = z12;
        this.J = z13;
        this.K = userId2;
        this.L = newsEntry;
        this.M = z14;
        this.N = z15;
        this.O = newsEntry2;
        this.P = newsEntry3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3c0)) {
            return false;
        }
        v3c0 v3c0Var = (v3c0) obj;
        return epx.f(this.h, v3c0Var.h) && this.i == v3c0Var.i && epx.f(this.j, v3c0Var.j) && epx.f(this.k, v3c0Var.k) && epx.f(this.l, v3c0Var.l) && epx.f(this.m, v3c0Var.m) && epx.f(this.n, v3c0Var.n) && epx.f(this.o, v3c0Var.o) && this.p == v3c0Var.p && epx.f(this.q, v3c0Var.q) && epx.f(this.r, v3c0Var.r) && epx.f(this.s, v3c0Var.s) && this.t == v3c0Var.t && epx.f(this.u, v3c0Var.u) && this.v == v3c0Var.v && this.w == v3c0Var.w && this.x == v3c0Var.x && this.y == v3c0Var.y && this.z == v3c0Var.z && this.A == v3c0Var.A && this.B == v3c0Var.B && epx.f(this.C, v3c0Var.C) && this.D == v3c0Var.D && this.E == v3c0Var.E && epx.f(this.F, v3c0Var.F) && epx.f(this.G, v3c0Var.G) && this.H == v3c0Var.H && this.I == v3c0Var.I && this.J == v3c0Var.J && epx.f(this.K, v3c0Var.K) && epx.f(this.L, v3c0Var.L) && this.M == v3c0Var.M && this.N == v3c0Var.N && epx.f(this.O, v3c0Var.O) && epx.f(this.P, v3c0Var.P);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        String str = this.h;
        int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.i);
        String str2 = this.j;
        int c = u11.c((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k);
        UserId userId = this.l;
        int hashCode = (c + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<Description> list = this.m;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.n;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.o;
        int b2 = qoy.b((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.p);
        ImageStatus imageStatus = this.q;
        int hashCode4 = (b2 + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31;
        String str4 = this.r;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.s;
        int b3 = qoy.b((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.t);
        HeaderIcon headerIcon = this.u;
        int b4 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((b3 + (headerIcon == null ? 0 : headerIcon.hashCode())) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B);
        VerifyInfo verifyInfo = this.C;
        int a = shy.a(this.E, (this.D.hashCode() + ((b4 + (verifyInfo == null ? 0 : verifyInfo.hashCode())) * 31)) * 31, 31);
        String str6 = this.F;
        int hashCode6 = (a + (str6 == null ? 0 : str6.hashCode())) * 31;
        ThemedColor themedColor = this.G;
        int a2 = bh10.a(qoy.b(qoy.b(qoy.b((hashCode6 + (themedColor == null ? 0 : themedColor.hashCode())) * 31, 31, this.H), 31, this.I), 31, this.J), 31, this.K.b);
        NewsEntry newsEntry = this.L;
        return Integer.hashCode(0) + e630.b(e630.b(qoy.b(qoy.b((a2 + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31, 31, this.M), 31, this.N), 31, this.O), 31, this.P);
    }

    public final String toString() {
        return "PostHeaderHolderUiDto(avatarUrl=" + this.h + ", shouldAvatarCutoutForSubscribe=" + this.i + ", titleText=" + this.j + ", titleTextParsed=" + ((Object) this.k) + ", titleSourceId=" + this.l + ", descriptions=" + this.m + ", subtitleContainerContentDescription=" + this.n + ", date=" + this.o + ", shouldFormatFullDateTime=" + this.p + ", imageStatus=" + this.q + ", imageStatusText=" + this.r + ", imageStatusUrl=" + this.s + ", isImageStatusVisible=" + this.t + ", icon=" + this.u + ", isHeaderClickable=" + this.v + ", isPinned=" + this.w + ", isAdvertisement=" + this.x + ", showUnseenStories=" + this.y + ", shouldAnimateDescriptions=" + this.z + ", isGovernmentOrganization=" + this.A + ", isNonProfitOrganization=" + this.B + ", verifyInfo=" + this.C + ", verifiedDrawableSize=" + this.D + ", verifiedDrawableContentDescriptionResId=" + this.E + ", badgeText=" + this.F + ", badgeTextColor=" + this.G + ", isBadgeVisible=" + this.H + ", shouldShowSubscribe=" + this.I + ", isSubscribed=" + this.J + ", subscriptionId=" + this.K + ", subscribeButtonEntry=" + this.L + ", isDisabledActionsForPhotos=" + this.M + ", hasLiveBadge=" + this.N + ", entry=" + this.O + ", rootEntry=" + this.P + ", seqId=0)";
    }
}
