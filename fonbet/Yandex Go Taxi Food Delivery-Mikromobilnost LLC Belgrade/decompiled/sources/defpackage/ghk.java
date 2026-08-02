package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ghk {
    public final rr51 a;
    public final boolean b;
    public final boolean c;
    public final Throwable d;
    public final String e;

    public /* synthetic */ ghk(String str, int i) {
        this(null, true, false, null, (i & 16) != 0 ? null : str);
    }

    public static ghk a(ghk ghkVar, rr51 rr51Var, boolean z, boolean z2, Throwable th, int i) {
        if ((i & 1) != 0) {
            rr51Var = ghkVar.a;
        }
        String str = ghkVar.e;
        ghkVar.getClass();
        return new ghk(rr51Var, z, z2, th, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghk)) {
            return false;
        }
        ghk ghkVar = (ghk) obj;
        return jl40.l(this.a, ghkVar.a) && this.b == ghkVar.b && this.c == ghkVar.c && jl40.l(this.d, ghkVar.d) && jl40.l(this.e, ghkVar.e);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int e = unr0.e(unr0.e((rr51Var == null ? 0 : rr51Var.hashCode()) * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        int hashCode = (e + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivBottomSheetState(divData=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", skeletonId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public ghk(rr51 rr51Var, boolean z, boolean z2, Throwable th, String str) {
        this.a = rr51Var;
        this.b = z;
        this.c = z2;
        this.d = th;
        this.e = str;
    }

    public ghk() {
        this(null, 31);
    }
}
