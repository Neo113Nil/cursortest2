package xsna;

import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: FooterHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class q6s extends ol60 {
    public final boolean A;
    public final int B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final int U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final List<String> a0;
    public final List<String> b0;
    public final boolean c0;
    public final int d0;
    public final boolean e0;
    public final boolean f0;
    public final NewsEntry g0;
    public final boolean h;
    public final NewsEntry h0;
    public final boolean i;
    public final int i0;
    public final boolean j;
    public final ReactionMeta k;
    public final String l;
    public final String m;
    public final List<ReactionMeta> n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final CharSequence v;
    public final CharSequence w;
    public final CharSequence x;
    public final CharSequence y;
    public final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public q6s(boolean z, boolean z2, boolean z3, ReactionMeta reactionMeta, String str, String str2, List<? extends ReactionMeta> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z4, boolean z5, int i8, int i9, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, boolean z18, boolean z19, boolean z20, int i12, int i13, boolean z21, boolean z22, boolean z23, boolean z24, List<String> list2, List<String> list3, boolean z25, int i14, boolean z26, boolean z27, NewsEntry newsEntry, NewsEntry newsEntry2, int i15) {
        super(1, 0, i15, 0, null);
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = reactionMeta;
        this.l = str;
        this.m = str2;
        this.n = list;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.s = i5;
        this.t = i6;
        this.u = i7;
        this.v = charSequence;
        this.w = charSequence2;
        this.x = charSequence3;
        this.y = charSequence4;
        this.z = z4;
        this.A = z5;
        this.B = i8;
        this.C = i9;
        this.D = z6;
        this.E = z7;
        this.F = z8;
        this.G = z9;
        this.H = z10;
        this.I = i10;
        this.J = z11;
        this.K = z12;
        this.L = z13;
        this.M = z14;
        this.N = z15;
        this.O = z16;
        this.P = z17;
        this.Q = i11;
        this.R = z18;
        this.S = z19;
        this.T = z20;
        this.U = i12;
        this.V = i13;
        this.W = z21;
        this.X = z22;
        this.Y = z23;
        this.Z = z24;
        this.a0 = list2;
        this.b0 = list3;
        this.c0 = z25;
        this.d0 = i14;
        this.e0 = z26;
        this.f0 = z27;
        this.g0 = newsEntry;
        this.h0 = newsEntry2;
        this.i0 = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6s)) {
            return false;
        }
        q6s q6sVar = (q6s) obj;
        return this.h == q6sVar.h && this.i == q6sVar.i && this.j == q6sVar.j && epx.f(this.k, q6sVar.k) && epx.f(this.l, q6sVar.l) && epx.f(this.m, q6sVar.m) && epx.f(this.n, q6sVar.n) && this.o == q6sVar.o && this.p == q6sVar.p && this.q == q6sVar.q && this.r == q6sVar.r && this.s == q6sVar.s && this.t == q6sVar.t && this.u == q6sVar.u && epx.f(this.v, q6sVar.v) && epx.f(this.w, q6sVar.w) && epx.f(this.x, q6sVar.x) && epx.f(this.y, q6sVar.y) && this.z == q6sVar.z && this.A == q6sVar.A && this.B == q6sVar.B && this.C == q6sVar.C && this.D == q6sVar.D && this.E == q6sVar.E && this.F == q6sVar.F && this.G == q6sVar.G && this.H == q6sVar.H && this.I == q6sVar.I && this.J == q6sVar.J && this.K == q6sVar.K && this.L == q6sVar.L && this.M == q6sVar.M && this.N == q6sVar.N && this.O == q6sVar.O && this.P == q6sVar.P && this.Q == q6sVar.Q && this.R == q6sVar.R && this.S == q6sVar.S && this.T == q6sVar.T && this.U == q6sVar.U && this.V == q6sVar.V && this.W == q6sVar.W && this.X == q6sVar.X && this.Y == q6sVar.Y && this.Z == q6sVar.Z && epx.f(this.a0, q6sVar.a0) && epx.f(this.b0, q6sVar.b0) && this.c0 == q6sVar.c0 && this.d0 == q6sVar.d0 && this.e0 == q6sVar.e0 && this.f0 == q6sVar.f0 && epx.f(this.g0, q6sVar.g0) && epx.f(this.h0, q6sVar.h0) && this.i0 == q6sVar.i0;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.i0;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.h) * 31, 31, this.i), 31, this.j);
        ReactionMeta reactionMeta = this.k;
        int hashCode = (b + (reactionMeta == null ? 0 : reactionMeta.hashCode())) * 31;
        String str = this.l;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ReactionMeta> list = this.n;
        int a = shy.a(this.u, shy.a(this.t, shy.a(this.s, shy.a(this.r, shy.a(this.q, shy.a(this.p, shy.a(this.o, (hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        CharSequence charSequence = this.v;
        int hashCode4 = (a + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.w;
        int hashCode5 = (hashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.x;
        int hashCode6 = (hashCode5 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.y;
        return Integer.hashCode(this.i0) + e630.b(e630.b(qoy.b(qoy.b(shy.a(this.d0, qoy.b(fw3.a(fw3.a(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.V, shy.a(this.U, qoy.b(qoy.b(qoy.b(shy.a(this.Q, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.I, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.C, shy.a(this.B, qoy.b(qoy.b((hashCode6 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31, 31, this.z), 31, this.A), 31), 31), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31), 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P), 31), 31, this.R), 31, this.S), 31, this.T), 31), 31), 31, this.W), 31, this.X), 31, this.Y), 31, this.Z), 31, this.a0), 31, this.b0), 31, this.c0), 31), 31, this.e0), 31, this.f0), 31, this.g0), 31, this.h0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FooterHolderUiDto(isLiked=");
        sb.append(this.h);
        sb.append(", animateOnChange=");
        sb.append(this.i);
        sb.append(", isReacted=");
        sb.append(this.j);
        sb.append(", userReaction=");
        sb.append(this.k);
        sb.append(", userReactionImageUrl=");
        sb.append(this.l);
        sb.append(", userReactionAnimationUrl=");
        sb.append(this.m);
        sb.append(", topReactions=");
        sb.append(this.n);
        sb.append(", reactionsScore=");
        sb.append(this.o);
        sb.append(", reactionsCount=");
        sb.append(this.p);
        sb.append(", numLikes=");
        sb.append(this.q);
        sb.append(", numComments=");
        sb.append(this.r);
        sb.append(", numShares=");
        sb.append(this.s);
        sb.append(", numViews=");
        sb.append(this.t);
        sb.append(", numBadges=");
        sb.append(this.u);
        sb.append(", numLikesFormatted=");
        sb.append((Object) this.v);
        sb.append(", numCommentsFormatted=");
        sb.append((Object) this.w);
        sb.append(", numSharesFormatted=");
        sb.append((Object) this.x);
        sb.append(", numViewsFormatted=");
        sb.append((Object) this.y);
        sb.append(", isAddVisible=");
        sb.append(this.z);
        sb.append(", isAddWrapperVisible=");
        sb.append(this.A);
        sb.append(", addWrapperContentDescription=");
        sb.append(this.B);
        sb.append(", likeStateDescription=");
        sb.append(this.C);
        sb.append(", isCommentsWrapperVisible=");
        sb.append(this.D);
        sb.append(", isCommentsVisible=");
        sb.append(this.E);
        sb.append(", isLikesVisible=");
        sb.append(this.F);
        sb.append(", isSharesCounterVisible=");
        sb.append(this.G);
        sb.append(", isSharesWrapperVisible=");
        sb.append(this.H);
        sb.append(", sharesIconDrawableResId=");
        sb.append(this.I);
        sb.append(", isViewsVisible=");
        sb.append(this.J);
        sb.append(", isDateVisible=");
        sb.append(this.K);
        sb.append(", bindReactions=");
        sb.append(this.L);
        sb.append(", isReactionViewVisible=");
        sb.append(this.M);
        sb.append(", isReactionsTextVisible=");
        sb.append(this.N);
        sb.append(", isReactionsInfoVisible=");
        sb.append(this.O);
        sb.append(", isReactionInfoVisible=");
        sb.append(this.P);
        sb.append(", reactionInfoInset=");
        sb.append(this.Q);
        sb.append(", isBadgesVisible=");
        sb.append(this.R);
        sb.append(", isBadgesCounterWrapperVisible=");
        sb.append(this.S);
        sb.append(", isBadgesSendTextVisible=");
        sb.append(this.T);
        sb.append(", badgesTotalCount=");
        sb.append(this.U);
        sb.append(", badgesItemsSize=");
        sb.append(this.V);
        sb.append(", hasBadges=");
        sb.append(this.W);
        sb.append(", isDonutReactionButtonVisible=");
        sb.append(this.X);
        sb.append(", isDonutReactionEnabled=");
        sb.append(this.Y);
        sb.append(", hasDonutPaywall=");
        sb.append(this.Z);
        sb.append(", badgesUrlsDarkList=");
        sb.append(this.a0);
        sb.append(", badgesUrlsLightList=");
        sb.append(this.b0);
        sb.append(", badgesNeedDirtyCrutch=");
        sb.append(this.c0);
        sb.append(", date=");
        sb.append(this.d0);
        sb.append(", hasLikesButton=");
        sb.append(this.e0);
        sb.append(", isWallRepostUnavailable=");
        sb.append(this.f0);
        sb.append(", entry=");
        sb.append(this.g0);
        sb.append(", rootEntry=");
        sb.append(this.h0);
        sb.append(", seqId=");
        return vu5.b(sb, this.i0, ')');
    }
}
