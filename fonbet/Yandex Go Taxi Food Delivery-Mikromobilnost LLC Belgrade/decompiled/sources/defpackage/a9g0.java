package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a9g0 implements b9g0 {
    public final yj1 a;
    public final BigDecimal b;
    public final o8p c;
    public final String d;

    public a9g0(yj1 yj1Var, BigDecimal bigDecimal, o8p o8pVar) {
        this.a = yj1Var;
        this.b = bigDecimal;
        this.c = o8pVar;
        this.d = o8pVar != null ? o8pVar.c : null;
    }

    @Override // defpackage.b9g0
    public final String a() {
        return this.d;
    }

    @Override // defpackage.g9g0
    public final yj1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9g0)) {
            return false;
        }
        a9g0 a9g0Var = (a9g0) obj;
        return jl40.l(this.a, a9g0Var.a) && jl40.l(this.b, a9g0Var.b) && jl40.l(this.c, a9g0Var.c);
    }

    @Override // defpackage.g9g0
    public final BigDecimal getAmount() {
        return this.b;
    }

    public final int hashCode() {
        yj1 yj1Var = this.a;
        int hashCode = (yj1Var == null ? 0 : yj1Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.b;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        o8p o8pVar = this.c;
        return hashCode2 + (o8pVar != null ? o8pVar.hashCode() : 0);
    }

    public final String toString() {
        return "QrError(agreement=" + this.a + ", amount=" + this.b + ", failData=" + this.c + Extension.C_BRAKE;
    }
}
