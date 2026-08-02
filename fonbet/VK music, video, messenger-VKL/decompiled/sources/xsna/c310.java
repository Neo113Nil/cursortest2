package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Map;

/* compiled from: MarketItemReviewRepliesState.kt */
/* loaded from: classes18.dex */
public final class c310 implements lm50 {
    public final int b;
    public final long c;
    public final UserId d;
    public final UserId e;
    public final int f;
    public final int g;
    public final n210 h;
    public final Map<Integer, k4g0> i;
    public final s410 j;
    public final Map<UserId, big0> k;
    public final boolean l;
    public final Throwable m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c310() {
        this(r1, 262143, 0L, null);
        int i = 0;
    }

    public static c310 a(c310 c310Var, UserId userId, int i, int i2, n210 n210Var, Map map, s410 s410Var, Map map2, boolean z, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3) {
        int i4 = c310Var.b;
        long j = c310Var.c;
        UserId userId2 = (i3 & 4) != 0 ? c310Var.d : userId;
        UserId userId3 = c310Var.e;
        int i5 = (i3 & 16) != 0 ? c310Var.f : i;
        int i6 = (i3 & 32) != 0 ? c310Var.g : i2;
        n210 n210Var2 = (i3 & 64) != 0 ? c310Var.h : n210Var;
        Map map3 = (i3 & 128) != 0 ? c310Var.i : map;
        s410 s410Var2 = (i3 & 256) != 0 ? c310Var.j : s410Var;
        Map map4 = (i3 & 512) != 0 ? c310Var.k : map2;
        boolean z7 = (i3 & 1024) != 0 ? c310Var.l : z;
        Throwable th2 = (i3 & 2048) != 0 ? c310Var.m : th;
        boolean z8 = (i3 & 4096) != 0 ? c310Var.n : z2;
        boolean z9 = (i3 & 8192) != 0 ? c310Var.o : z3;
        boolean z10 = (i3 & 16384) != 0 ? c310Var.p : z4;
        boolean z11 = (i3 & 32768) != 0 ? c310Var.q : z5;
        boolean z12 = (i3 & 65536) != 0 ? c310Var.r : true;
        boolean z13 = (i3 & 131072) != 0 ? c310Var.s : z6;
        c310Var.getClass();
        return new c310(i4, j, userId2, userId3, i5, i6, n210Var2, map3, s410Var2, map4, z7, th2, z8, z9, z10, z11, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c310)) {
            return false;
        }
        c310 c310Var = (c310) obj;
        return this.b == c310Var.b && this.c == c310Var.c && epx.f(this.d, c310Var.d) && epx.f(this.e, c310Var.e) && this.f == c310Var.f && this.g == c310Var.g && epx.f(this.h, c310Var.h) && epx.f(this.i, c310Var.i) && epx.f(this.j, c310Var.j) && epx.f(this.k, c310Var.k) && this.l == c310Var.l && epx.f(this.m, c310Var.m) && this.n == c310Var.n && this.o == c310Var.o && this.p == c310Var.p && this.q == c310Var.q && this.r == c310Var.r && this.s == c310Var.s;
    }

    public final int hashCode() {
        int a = shy.a(this.g, shy.a(this.f, bh10.a(bh10.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d.b), 31, this.e.b), 31), 31);
        n210 n210Var = this.h;
        int b = qoy.b(v11.a((this.j.hashCode() + v11.a((a + (n210Var == null ? 0 : n210Var.hashCode())) * 31, 31, this.i)) * 31, 31, this.k), 31, this.l);
        Throwable th = this.m;
        return Boolean.hashCode(this.s) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((b + (th != null ? th.hashCode() : 0)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewRepliesState(reviewId=");
        sb.append(this.b);
        sb.append(", marketItemId=");
        sb.append(this.c);
        sb.append(", currentUserId=");
        sb.append(this.d);
        sb.append(", communityId=");
        sb.append(this.e);
        sb.append(", offset=");
        sb.append(this.f);
        sb.append(", replyCount=");
        sb.append(this.g);
        sb.append(", review=");
        sb.append(this.h);
        sb.append(", replies=");
        sb.append(this.i);
        sb.append(", newReplyDraft=");
        sb.append(this.j);
        sb.append(", usersAndGroups=");
        sb.append(this.k);
        sb.append(", isError=");
        sb.append(this.l);
        sb.append(", paginationError=");
        sb.append(this.m);
        sb.append(", isLoading=");
        sb.append(this.n);
        sb.append(", isRefresh=");
        sb.append(this.o);
        sb.append(", isLoadingPage=");
        sb.append(this.p);
        sb.append(", isScreenSpinnerVisible=");
        sb.append(this.q);
        sb.append(", dataOnScreenChanged=");
        sb.append(this.r);
        sb.append(", isCurrentUserHasEditorRole=");
        return defpackage.q0.a(sb, this.s, ')');
    }

    public c310(int i, long j, UserId userId, UserId userId2, int i2, int i3, n210 n210Var, Map<Integer, k4g0> map, s410 s410Var, Map<UserId, big0> map2, boolean z, Throwable th, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = i;
        this.c = j;
        this.d = userId;
        this.e = userId2;
        this.f = i2;
        this.g = i3;
        this.h = n210Var;
        this.i = map;
        this.j = s410Var;
        this.k = map2;
        this.l = z;
        this.m = th;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c310(int i, int i2, long j, UserId userId) {
        this(r4, r5, r7, r8, 0, 0, null, r12, r13, r12, false, null, r17, false, false, false, false, false);
        int i3 = (i2 & 1) != 0 ? 0 : i;
        long j2 = (i2 & 2) != 0 ? 0L : j;
        UserId userId2 = UserId.d;
        UserId userId3 = (i2 & 8) != 0 ? userId2 : userId;
        s410 s410Var = new s410(r2);
        boolean z = (i2 & 4096) == 0 ? 1 : 0;
        jgp jgpVar = jgp.b;
    }
}
