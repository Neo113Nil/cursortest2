package xsna;

/* compiled from: PollUiState.kt */
/* loaded from: classes4.dex */
public final class yrb0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;

    public yrb0(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
    }

    public static yrb0 a(yrb0 yrb0Var, String str, boolean z, boolean z2, boolean z3, boolean z4, long j, int i) {
        if ((i & 1) != 0) {
            str = yrb0Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = yrb0Var.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = yrb0Var.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = yrb0Var.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = yrb0Var.e;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            j = yrb0Var.f;
        }
        yrb0Var.getClass();
        return new yrb0(z5, z6, z7, z8, str2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrb0)) {
            return false;
        }
        yrb0 yrb0Var = (yrb0) obj;
        return epx.f(this.a, yrb0Var.a) && this.b == yrb0Var.b && this.c == yrb0Var.c && this.d == yrb0Var.d && this.e == yrb0Var.e && this.f == yrb0Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollUiState(question=");
        sb.append(this.a);
        sb.append(", isAnonymous=");
        sb.append(this.b);
        sb.append(", canHaveMultipleVotes=");
        sb.append(this.c);
        sb.append(", disableUnvote=");
        sb.append(this.d);
        sb.append(", hasEndDate=");
        sb.append(this.e);
        sb.append(", endDateMs=");
        return vu5.a(')', this.f, sb);
    }
}
