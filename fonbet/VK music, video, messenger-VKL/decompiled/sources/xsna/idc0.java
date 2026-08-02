package xsna;

/* compiled from: UserProfileState.kt */
/* loaded from: classes5.dex */
public final class idc0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;

    public idc0() {
        this(15);
    }

    public static idc0 a(idc0 idc0Var, boolean z, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = idc0Var.a;
        }
        if ((i3 & 2) != 0) {
            i = idc0Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = idc0Var.c;
        }
        boolean z2 = idc0Var.d;
        idc0Var.getClass();
        return new idc0(i, i2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idc0)) {
            return false;
        }
        idc0 idc0Var = (idc0) obj;
        return this.a == idc0Var.a && this.b == idc0Var.b && this.c == idc0Var.c && this.d == idc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingBlock(hasDraft=");
        sb.append(this.a);
        sb.append(", postponedCount=");
        sb.append(this.b);
        sb.append(", draftsCount=");
        sb.append(this.c);
        sb.append(", needShowDraftBage=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ idc0(int i) {
        this(0, 0, false, (i & 8) != 0);
    }

    public idc0(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
    }
}
