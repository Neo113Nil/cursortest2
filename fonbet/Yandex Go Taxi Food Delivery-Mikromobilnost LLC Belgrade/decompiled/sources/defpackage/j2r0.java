package defpackage;

import com.ybsdk.feature.card.internal.entities.SetCardStatusScreenEntity$SetResultState$StateType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j2r0 implements k2r0 {
    public final SetCardStatusScreenEntity$SetResultState$StateType a;
    public final String b;
    public final String c;
    public final g2r0 d;
    public final g2r0 e;
    public final String f;

    public j2r0(SetCardStatusScreenEntity$SetResultState$StateType setCardStatusScreenEntity$SetResultState$StateType, String str, String str2, g2r0 g2r0Var, g2r0 g2r0Var2, String str3) {
        this.a = setCardStatusScreenEntity$SetResultState$StateType;
        this.b = str;
        this.c = str2;
        this.d = g2r0Var;
        this.e = g2r0Var2;
        this.f = str3;
    }

    @Override // defpackage.k2r0
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2r0)) {
            return false;
        }
        j2r0 j2r0Var = (j2r0) obj;
        return this.a == j2r0Var.a && jl40.l(this.b, j2r0Var.b) && jl40.l(this.c, j2r0Var.c) && jl40.l(this.d, j2r0Var.d) && jl40.l(this.e, j2r0Var.e) && jl40.l(this.f, j2r0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        g2r0 g2r0Var = this.d;
        int hashCode = (b + (g2r0Var == null ? 0 : g2r0Var.hashCode())) * 31;
        g2r0 g2r0Var2 = this.e;
        int hashCode2 = (hashCode + (g2r0Var2 == null ? 0 : g2r0Var2.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SetResultState(stateType=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", primaryButton=" + this.d + ", secondaryButton=" + this.e + ", closeAction=" + this.f + Extension.C_BRAKE;
    }
}
