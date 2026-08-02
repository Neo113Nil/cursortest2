package xsna;

import com.vk.dto.messages.MsgSyncState;

/* compiled from: MsgHistoryEntryStorageModel.kt */
/* loaded from: classes2.dex */
public final class lj30 implements Comparable<lj30> {
    public final long b;
    public final int c;
    public final int d;
    public final boolean e;
    public final gkx0 f;
    public final gkx0 g;
    public final gkx0 h;
    public final boolean i;
    public final boolean j;
    public final MsgSyncState k;
    public final int l;
    public final boolean m;
    public final long n;

    public lj30(long j, int i, int i2, boolean z, gkx0 gkx0Var, gkx0 gkx0Var2, gkx0 gkx0Var3, boolean z2, boolean z3, MsgSyncState msgSyncState, int i3, boolean z4, long j2) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = gkx0Var;
        this.g = gkx0Var2;
        this.h = gkx0Var3;
        this.i = z2;
        this.j = z3;
        this.k = msgSyncState;
        this.l = i3;
        this.m = z4;
        this.n = j2;
    }

    public static lj30 a(lj30 lj30Var, int i) {
        long j = lj30Var.b;
        int i2 = lj30Var.c;
        int i3 = lj30Var.d;
        boolean z = lj30Var.e;
        gkx0 gkx0Var = lj30Var.f;
        gkx0 gkx0Var2 = lj30Var.g;
        gkx0 gkx0Var3 = lj30Var.h;
        boolean z2 = (i & 128) != 0 ? lj30Var.i : true;
        boolean z3 = (i & 256) != 0 ? lj30Var.j : true;
        MsgSyncState msgSyncState = lj30Var.k;
        int i4 = lj30Var.l;
        boolean z4 = lj30Var.m;
        long j2 = lj30Var.n;
        lj30Var.getClass();
        return new lj30(j, i2, i3, z, gkx0Var, gkx0Var2, gkx0Var3, z2, z3, msgSyncState, i4, z4, j2);
    }

    public final boolean c() {
        return this.k == MsgSyncState.SENDING;
    }

    @Override // java.lang.Comparable
    public final int compareTo(lj30 lj30Var) {
        return this.h.compareTo(lj30Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj30)) {
            return false;
        }
        lj30 lj30Var = (lj30) obj;
        return this.b == lj30Var.b && this.c == lj30Var.c && this.d == lj30Var.d && this.e == lj30Var.e && epx.f(this.f, lj30Var.f) && epx.f(this.g, lj30Var.g) && epx.f(this.h, lj30Var.h) && this.i == lj30Var.i && this.j == lj30Var.j && this.k == lj30Var.k && this.l == lj30Var.l && this.m == lj30Var.m && this.n == lj30Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + qoy.b(shy.a(this.l, (this.k.hashCode() + qoy.b(qoy.b(bh10.a(bh10.a(bh10.a(qoy.b(shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31), 31, this.e), 31, this.f.b), 31, this.g.b), 31, this.h.b), 31, this.i), 31, this.j)) * 31, 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistoryEntryStorageModel(dialogId=");
        sb.append(this.b);
        sb.append(", localId=");
        sb.append(this.c);
        sb.append(", cnvId=");
        sb.append(this.d);
        sb.append(", isHidden=");
        sb.append(this.e);
        sb.append(", weightBefore=");
        sb.append(this.f);
        sb.append(", weightAfter=");
        sb.append(this.g);
        sb.append(", weight=");
        sb.append(this.h);
        sb.append(", hasSpaceBefore=");
        sb.append(this.i);
        sb.append(", hasSpaceAfter=");
        sb.append(this.j);
        sb.append(", syncState=");
        sb.append(this.k);
        sb.append(", phase=");
        sb.append(this.l);
        sb.append(", isLocal=");
        sb.append(this.m);
        sb.append(", time=");
        return vu5.a(')', this.n, sb);
    }
}
