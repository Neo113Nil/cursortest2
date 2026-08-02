package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ebm0 {
    public final lur0 a;
    public final boolean b;
    public final Throwable c;
    public final boolean d;
    public final rbv e;
    public final iam0 f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final ham0 j;

    public ebm0(lur0 lur0Var, boolean z, Throwable th, boolean z2, rbv rbvVar, iam0 iam0Var, int i, boolean z3, boolean z4, ham0 ham0Var) {
        this.a = lur0Var;
        this.b = z;
        this.c = th;
        this.d = z2;
        this.e = rbvVar;
        this.f = iam0Var;
        this.g = i;
        this.h = z3;
        this.i = z4;
        this.j = ham0Var;
    }

    public static ebm0 a(ebm0 ebm0Var, lur0 lur0Var, boolean z, Throwable th, boolean z2, rbv rbvVar, iam0 iam0Var, int i, boolean z3, boolean z4, ham0 ham0Var, int i2) {
        if ((i2 & 1) != 0) {
            lur0Var = ebm0Var.a;
        }
        lur0 lur0Var2 = lur0Var;
        if ((i2 & 2) != 0) {
            z = ebm0Var.b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            th = ebm0Var.c;
        }
        Throwable th2 = th;
        if ((i2 & 8) != 0) {
            z2 = ebm0Var.d;
        }
        boolean z6 = z2;
        rbv rbvVar2 = (i2 & 16) != 0 ? ebm0Var.e : rbvVar;
        iam0 iam0Var2 = (i2 & 32) != 0 ? ebm0Var.f : iam0Var;
        int i3 = (i2 & 64) != 0 ? ebm0Var.g : i;
        boolean z7 = (i2 & 128) != 0 ? ebm0Var.h : z3;
        boolean z8 = (i2 & 256) != 0 ? ebm0Var.i : z4;
        ham0 ham0Var2 = (i2 & 512) != 0 ? ebm0Var.j : ham0Var;
        ebm0Var.getClass();
        return new ebm0(lur0Var2, z5, th2, z6, rbvVar2, iam0Var2, i3, z7, z8, ham0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebm0)) {
            return false;
        }
        ebm0 ebm0Var = (ebm0) obj;
        return this.a.equals(ebm0Var.a) && this.b == ebm0Var.b && jl40.l(this.c, ebm0Var.c) && this.d == ebm0Var.d && jl40.l(this.e, ebm0Var.e) && jl40.l(this.f, ebm0Var.f) && this.g == ebm0Var.g && this.h == ebm0Var.h && this.i == ebm0Var.i && jl40.l(this.j, ebm0Var.j);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        int e2 = unr0.e((e + (th == null ? 0 : th.hashCode())) * 31, 31, this.d);
        rbv rbvVar = this.e;
        int hashCode = (e2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        iam0 iam0Var = this.f;
        int e3 = unr0.e(unr0.e(oyr.b(this.g, (hashCode + (iam0Var == null ? 0 : iam0Var.hashCode())) * 31, 31), 31, this.h), 31, this.i);
        ham0 ham0Var = this.j;
        return e3 + (ham0Var != null ? ham0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsDashboardState(shimmerStatus=");
        sb.append(this.a);
        sb.append(", isError=");
        sb.append(this.b);
        sb.append(", throwable=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", supportImageModel=");
        sb.append(this.e);
        sb.append(", savingsDashboardDataEntity=");
        sb.append(this.f);
        sb.append(", shownDescriptionIndex=");
        tse0.z(sb, this.g, ", canShowBalanceAnimation=", this.h, ", shouldShowDragAndDropOnboarding=");
        sb.append(this.i);
        sb.append(", noAccountsEntity=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
