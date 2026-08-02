package defpackage;

/* loaded from: classes15.dex */
public final class i6 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public i6(String str, String str2, String str3, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public static i6 a(i6 i6Var, boolean z, String str, String str2, int i) {
        boolean z2 = (i & 1) != 0 ? i6Var.a : true;
        if ((i & 2) != 0) {
            z = i6Var.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = i6Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = i6Var.d;
        }
        String str4 = i6Var.e;
        i6Var.getClass();
        i6Var.getClass();
        return new i6(str3, str2, str4, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return this.a == i6Var.a && this.b == i6Var.b && this.c.equals(i6Var.c) && this.d.equals(i6Var.d) && jl40.l(this.e, i6Var.e);
    }

    public final int hashCode() {
        return Long.hashCode(1778686173618L) + unr0.b(unr0.b(unr0.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("AboutUiState(showHiddenOptions=", ", canShowDownloadLogs=", ", uuid=", this.a, this.b);
        g8e.D(u, this.c, ", deviceId=", this.d, ", version=");
        return oyr.t(u, this.e, ", buildDate=1778686173618)");
    }
}
