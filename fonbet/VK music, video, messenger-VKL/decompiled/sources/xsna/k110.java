package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketItemCommentsState.kt */
/* loaded from: classes17.dex */
public final class k110 implements km50 {
    public final UserId b;
    public final long c;
    public final List<BoardComment> d;
    public final boolean e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final Throwable j;
    public final Integer k;
    public final boolean l;
    public final int m;
    public final Integer n;

    public k110() {
        this(0);
    }

    public static k110 a(k110 k110Var, UserId userId, long j, List list, boolean z, int i, boolean z2, boolean z3, Throwable th, Integer num, boolean z4, int i2, Integer num2, int i3) {
        UserId userId2 = (i3 & 1) != 0 ? k110Var.b : userId;
        long j2 = (i3 & 2) != 0 ? k110Var.c : j;
        List list2 = (i3 & 4) != 0 ? k110Var.d : list;
        boolean z5 = (i3 & 8) != 0 ? k110Var.e : z;
        int i4 = (i3 & 16) != 0 ? k110Var.f : i;
        k110Var.getClass();
        String str = k110Var.g;
        boolean z6 = (i3 & 128) != 0 ? k110Var.h : z2;
        boolean z7 = (i3 & 256) != 0 ? k110Var.i : z3;
        Throwable th2 = (i3 & 512) != 0 ? k110Var.j : th;
        Integer num3 = (i3 & 1024) != 0 ? k110Var.k : num;
        boolean z8 = (i3 & 2048) != 0 ? k110Var.l : z4;
        int i5 = (i3 & 4096) != 0 ? k110Var.m : i2;
        Integer num4 = (i3 & 8192) != 0 ? k110Var.n : num2;
        k110Var.getClass();
        return new k110(userId2, j2, list2, z5, i4, str, z6, z7, th2, num3, z8, i5, num4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k110)) {
            return false;
        }
        k110 k110Var = (k110) obj;
        return epx.f(this.b, k110Var.b) && this.c == k110Var.c && epx.f(this.d, k110Var.d) && this.e == k110Var.e && this.f == k110Var.f && epx.f(this.g, k110Var.g) && this.h == k110Var.h && this.i == k110Var.i && epx.f(this.j, k110Var.j) && epx.f(this.k, k110Var.k) && this.l == k110Var.l && this.m == k110Var.m && epx.f(this.n, k110Var.n);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(qoy.b(shy.a(this.f, qoy.b(fw3.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, false), 31, this.g), 31, this.h), 31, this.i);
        Throwable th = this.j;
        int hashCode = (b + (th == null ? 0 : th.hashCode())) * 31;
        Integer num = this.k;
        int a = shy.a(this.m, qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.l), 31);
        Integer num2 = this.n;
        return a + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCommentsState(ownerId=");
        sb.append(this.b);
        sb.append(", itemId=");
        sb.append(this.c);
        sb.append(", comments=");
        sb.append(this.d);
        sb.append(", canComment=");
        sb.append(this.e);
        sb.append(", commentCount=");
        sb.append(this.f);
        sb.append(", isCommentsClosed=false, ownerGroupName=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", isRefresh=");
        sb.append(this.i);
        sb.append(", throwable=");
        sb.append(this.j);
        sb.append(", lastResponseCommentCount=");
        sb.append(this.k);
        sb.append(", isLoadingPage=");
        sb.append(this.l);
        sb.append(", offset=");
        sb.append(this.m);
        sb.append(", replyCommentId=");
        return uqi.b(sb, this.n, ')');
    }

    public k110(UserId userId, long j, List list, boolean z, int i, String str, boolean z2, boolean z3, Throwable th, Integer num, boolean z4, int i2, Integer num2) {
        this.b = userId;
        this.c = j;
        this.d = list;
        this.e = z;
        this.f = i;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = th;
        this.k = num;
        this.l = z4;
        this.m = i2;
        this.n = num2;
    }

    public k110(int i) {
        this(UserId.d, 0L, EmptyList.b, true, 0, "", false, false, null, null, false, 0, null);
    }
}
