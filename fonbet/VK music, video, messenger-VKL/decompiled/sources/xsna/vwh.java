package xsna;

import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CommunityRepliesState.kt */
/* loaded from: classes18.dex */
public final class vwh implements km50 {
    public final int b;
    public final UserId c;
    public final UserId d;
    public final boolean e;
    public final int f;
    public final int g;
    public final txh h;
    public final Map<Integer, k4g0> i;
    public final yig0 j;
    public final Map<UserId, big0> k;
    public final boolean l;
    public final Throwable m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Integer r;
    public final boolean s;

    public vwh() {
        this(0);
    }

    public static vwh a(vwh vwhVar, int i, UserId userId, UserId userId2, boolean z, int i2, int i3, txh txhVar, LinkedHashMap linkedHashMap, yig0 yig0Var, Map map, boolean z2, Throwable th, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, int i4) {
        int i5 = (i4 & 1) != 0 ? vwhVar.b : i;
        UserId userId3 = (i4 & 2) != 0 ? vwhVar.c : userId;
        UserId userId4 = (i4 & 4) != 0 ? vwhVar.d : userId2;
        boolean z7 = (i4 & 8) != 0 ? vwhVar.e : z;
        int i6 = (i4 & 16) != 0 ? vwhVar.f : i2;
        int i7 = (i4 & 32) != 0 ? vwhVar.g : i3;
        txh txhVar2 = (i4 & 64) != 0 ? vwhVar.h : txhVar;
        Map<Integer, k4g0> map2 = (i4 & 128) != 0 ? vwhVar.i : linkedHashMap;
        yig0 yig0Var2 = (i4 & 256) != 0 ? vwhVar.j : yig0Var;
        Map map3 = (i4 & 512) != 0 ? vwhVar.k : map;
        boolean z8 = (i4 & 1024) != 0 ? vwhVar.l : z2;
        Throwable th2 = (i4 & 2048) != 0 ? vwhVar.m : th;
        boolean z9 = (i4 & 4096) != 0 ? vwhVar.n : z3;
        boolean z10 = (i4 & 8192) != 0 ? vwhVar.o : z4;
        int i8 = i5;
        boolean z11 = (i4 & 16384) != 0 ? vwhVar.p : z5;
        boolean z12 = (i4 & 32768) != 0 ? vwhVar.q : z6;
        Integer num2 = (i4 & 65536) != 0 ? vwhVar.r : num;
        boolean z13 = (i4 & 131072) != 0 ? vwhVar.s : true;
        vwhVar.getClass();
        return new vwh(i8, userId3, userId4, z7, i6, i7, txhVar2, map2, yig0Var2, map3, z8, th2, z9, z10, z11, z12, num2, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwh)) {
            return false;
        }
        vwh vwhVar = (vwh) obj;
        return this.b == vwhVar.b && epx.f(this.c, vwhVar.c) && epx.f(this.d, vwhVar.d) && this.e == vwhVar.e && this.f == vwhVar.f && this.g == vwhVar.g && epx.f(this.h, vwhVar.h) && epx.f(this.i, vwhVar.i) && epx.f(this.j, vwhVar.j) && epx.f(this.k, vwhVar.k) && this.l == vwhVar.l && epx.f(this.m, vwhVar.m) && this.n == vwhVar.n && this.o == vwhVar.o && this.p == vwhVar.p && this.q == vwhVar.q && epx.f(this.r, vwhVar.r) && this.s == vwhVar.s;
    }

    public final int hashCode() {
        int a = shy.a(this.g, shy.a(this.f, qoy.b(bh10.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d.b), 31, this.e), 31), 31);
        txh txhVar = this.h;
        int b = qoy.b(v11.a((this.j.hashCode() + v11.a((a + (txhVar == null ? 0 : txhVar.hashCode())) * 31, 31, this.i)) * 31, 31, this.k), 31, this.l);
        Throwable th = this.m;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b((b + (th == null ? 0 : th.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        Integer num = this.r;
        return Boolean.hashCode(this.s) + ((b2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityRepliesState(reviewId=");
        sb.append(this.b);
        sb.append(", currentUserId=");
        sb.append(this.c);
        sb.append(", communityId=");
        sb.append(this.d);
        sb.append(", isCurrentUserHasEditorRole=");
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
        sb.append(", editingReplyId=");
        sb.append(this.r);
        sb.append(", dataOnScreenChanged=");
        return defpackage.q0.a(sb, this.s, ')');
    }

    public vwh(int i, UserId userId, UserId userId2, boolean z, int i2, int i3, txh txhVar, Map<Integer, k4g0> map, yig0 yig0Var, Map<UserId, big0> map2, boolean z2, Throwable th, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, boolean z7) {
        this.b = i;
        this.c = userId;
        this.d = userId2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = txhVar;
        this.i = map;
        this.j = yig0Var;
        this.k = map2;
        this.l = z2;
        this.m = th;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = num;
        this.s = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vwh(int i) {
        this(0, r2, r2, false, 0, 0, null, r8, r9, r8, false, null, false, false, false, false, null, false);
        UserId userId = UserId.d;
        yig0 yig0Var = new yig0(null, null, null, null);
        jgp jgpVar = jgp.b;
    }
}
