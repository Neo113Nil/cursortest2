package xsna;

import xsna.g4b;

/* compiled from: ChannelMonetizationState.kt */
/* loaded from: classes16.dex */
public final class j4b implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final g4b h;

    public j4b() {
        this(0);
    }

    public static j4b a(j4b j4bVar, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, g4b g4bVar, int i2) {
        if ((i2 & 1) != 0) {
            z = j4bVar.b;
        }
        boolean z6 = z;
        if ((i2 & 2) != 0) {
            z2 = j4bVar.c;
        }
        boolean z7 = z2;
        if ((i2 & 4) != 0) {
            z3 = j4bVar.d;
        }
        boolean z8 = z3;
        if ((i2 & 8) != 0) {
            z4 = j4bVar.e;
        }
        boolean z9 = z4;
        if ((i2 & 16) != 0) {
            i = j4bVar.f;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z5 = j4bVar.g;
        }
        boolean z10 = z5;
        if ((i2 & 64) != 0) {
            g4bVar = j4bVar.h;
        }
        j4bVar.getClass();
        return new j4b(z6, z7, z8, z9, i3, z10, g4bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4b)) {
            return false;
        }
        j4b j4bVar = (j4b) obj;
        return this.b == j4bVar.b && this.c == j4bVar.c && this.d == j4bVar.d && this.e == j4bVar.e && this.f == j4bVar.f && this.g == j4bVar.g && epx.f(this.h, j4bVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b(shy.a(this.f, qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        return "ChannelMonetizationState(isLoading=" + this.b + ", isEditDonutAvailable=" + this.c + ", isRegularSupportEnabled=" + this.d + ", isPaidReactionEnabled=" + this.e + ", paidReactionCost=" + this.f + ", isOneTimePaymentsEnabled=" + this.g + ", payment=" + this.h + ')';
    }

    public j4b(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, g4b g4bVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
        this.g = z5;
        this.h = g4bVar;
    }

    public /* synthetic */ j4b(int i) {
        this(true, false, false, false, 0, false, g4b.b.a);
    }
}
