package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lm01 {
    public final s910 a;
    public final gl1 b;
    public final gcq0 c;
    public final List d;
    public final boolean e;

    public lm01(s910 s910Var, gl1 gl1Var, gcq0 gcq0Var, List list, boolean z) {
        this.a = s910Var;
        this.b = gl1Var;
        this.c = gcq0Var;
        this.d = list;
        this.e = z;
    }

    public static lm01 a(lm01 lm01Var, gl1 gl1Var, gcq0 gcq0Var, int i) {
        s910 s910Var = lm01Var.a;
        if ((i & 2) != 0) {
            gl1Var = lm01Var.b;
        }
        gl1 gl1Var2 = gl1Var;
        if ((i & 4) != 0) {
            gcq0Var = lm01Var.c;
        }
        List list = lm01Var.d;
        boolean z = lm01Var.e;
        lm01Var.getClass();
        return new lm01(s910Var, gl1Var2, gcq0Var, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm01)) {
            return false;
        }
        lm01 lm01Var = (lm01) obj;
        return jl40.l(this.a, lm01Var.a) && jl40.l(this.b, lm01Var.b) && jl40.l(this.c, lm01Var.c) && this.d.equals(lm01Var.d) && this.e == lm01Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gcq0 gcq0Var = this.c;
        return Boolean.hashCode(this.e) + unr0.c((hashCode + (gcq0Var == null ? 0 : gcq0Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferMe2MeConfirmSuccessState(me2meDebitEntity=");
        sb.append(this.a);
        sb.append(", currentAgreement=");
        sb.append(this.b);
        sb.append(", bottomSheetState=");
        sb.append(this.c);
        sb.append(", bottomSheetItems=");
        sb.append(this.d);
        sb.append(", showOpenAccountsMarker=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
