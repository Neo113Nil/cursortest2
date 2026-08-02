package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PrimaryPollAttachmentHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class lad0 extends ol60 {
    public final tjo A;
    public final Drawable B;
    public final String C;
    public final String D;
    public final Drawable E;
    public final int F;
    public final v1c0 G;
    public final boolean H;
    public final m7x0 I;
    public final PollAttachment J;
    public final NewsEntry K;
    public final NewsEntry L;
    public final int h;
    public final boolean i;
    public final int j;
    public final ArrayList k;
    public final boolean l;
    public final String m;
    public final CharSequence n;
    public final String o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final CharSequence t;
    public final boolean u;
    public final List<String> v;
    public final Drawable w;
    public final int x;
    public final mkl y;
    public final mkq0 z;

    public lad0(int i, boolean z, int i2, ArrayList arrayList, boolean z2, String str, CharSequence charSequence, String str2, int i3, int i4, int i5, int i6, String str3, boolean z3, List list, Drawable drawable, int i7, mkl mklVar, mkq0 mkq0Var, tjo tjoVar, GradientDrawable gradientDrawable, String str4, String str5, dqb0 dqb0Var, v1c0 v1c0Var, boolean z4, m7x0 m7x0Var, PollAttachment pollAttachment, NewsEntry newsEntry, NewsEntry newsEntry2) {
        super(293, 0, 0, 0, null);
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = arrayList;
        this.l = z2;
        this.m = str;
        this.n = charSequence;
        this.o = str2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = str3;
        this.u = z3;
        this.v = list;
        this.w = drawable;
        this.x = i7;
        this.y = mklVar;
        this.z = mkq0Var;
        this.A = tjoVar;
        this.B = gradientDrawable;
        this.C = str4;
        this.D = str5;
        this.E = dqb0Var;
        this.F = R.drawable.default_poll_background;
        this.G = v1c0Var;
        this.H = z4;
        this.I = m7x0Var;
        this.J = pollAttachment;
        this.K = newsEntry;
        this.L = newsEntry2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lad0)) {
            return false;
        }
        lad0 lad0Var = (lad0) obj;
        return this.h == lad0Var.h && this.i == lad0Var.i && this.j == lad0Var.j && epx.f(this.k, lad0Var.k) && this.l == lad0Var.l && epx.f(this.m, lad0Var.m) && epx.f(this.n, lad0Var.n) && epx.f(this.o, lad0Var.o) && this.p == lad0Var.p && this.q == lad0Var.q && this.r == lad0Var.r && this.s == lad0Var.s && epx.f(this.t, lad0Var.t) && this.u == lad0Var.u && epx.f(this.v, lad0Var.v) && epx.f(this.w, lad0Var.w) && this.x == lad0Var.x && epx.f(this.y, lad0Var.y) && epx.f(this.z, lad0Var.z) && epx.f(this.A, lad0Var.A) && epx.f(this.B, lad0Var.B) && epx.f(this.C, lad0Var.C) && epx.f(this.D, lad0Var.D) && epx.f(this.E, lad0Var.E) && this.F == lad0Var.F && epx.f(this.G, lad0Var.G) && this.H == lad0Var.H && epx.f(this.I, lad0Var.I) && epx.f(this.J, lad0Var.J) && epx.f(this.K, lad0Var.K) && epx.f(this.L, lad0Var.L);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = fw3.a(qoy.b(u11.c(shy.a(this.s, shy.a(this.r, shy.a(this.q, shy.a(this.p, urd0.a(u11.c(urd0.a(qoy.b(qr.a(this.k, shy.a(this.j, qoy.b(Integer.hashCode(this.h) * 31, 31, this.i), 31), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31), 31), 31), 31, this.t), 31, this.u), 31, this.v);
        Drawable drawable = this.w;
        int hashCode = (this.z.hashCode() + ((this.y.hashCode() + shy.a(this.x, (a + (drawable == null ? 0 : drawable.hashCode())) * 31, 31)) * 31)) * 31;
        tjo tjoVar = this.A;
        int hashCode2 = (hashCode + (tjoVar == null ? 0 : tjoVar.hashCode())) * 31;
        Drawable drawable2 = this.B;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        String str = this.C;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.D;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable3 = this.E;
        return Integer.hashCode(0) + e630.b(e630.b((this.J.f.hashCode() + ((this.I.a.hashCode() + qoy.b((this.G.hashCode() + shy.a(this.F, (hashCode5 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31, 31)) * 31, 31, this.H)) * 31)) * 31, 31, this.K), 31, this.L);
    }

    public final v1c0 i() {
        return this.G;
    }

    public final String toString() {
        return "PrimaryPollAttachmentHolderUiDto(actionsImageResourceId=" + this.h + ", isAnswersEnabled=" + this.i + ", answersCount=" + this.j + ", answers=" + this.k + ", canVote=" + this.l + ", titleViewText=" + this.m + ", infoText=" + ((Object) this.n) + ", showResultsButtonText=" + this.o + ", showResultsDynamicBackgroundResource=" + this.p + ", multipleVoteButtonVisibility=" + this.q + ", multipleVoteButtonBackgroundResource=" + this.r + ", votesCountVisibility=" + this.s + ", votesCountText=" + ((Object) this.t) + ", isFriendsPhotosVisible=" + this.u + ", friendsPhotos=" + this.v + ", foregroundDrawable=" + this.w + ", multipleProgressVisibility=" + this.x + ", pollContext=" + this.y + ", linkClickListener=" + this.z + ", backgroundDrawableFactory=" + this.A + ", backgroundBackgroundDrawable=" + this.B + ", backgroundUrl=" + this.C + ", backgroundLowUrl=" + this.D + ", backgroundImageDrawable=" + this.E + ", backgroundImageResourceId=" + this.F + ", displayItemContext=" + this.G + ", isInAdvertisement=" + this.H + ", votingStateUiDto=" + this.I + ", attachment=" + this.J + ", entry=" + this.K + ", rootEntry=" + this.L + ", seqId=0)";
    }
}
