package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cpc implements bpc {
    public final y6o a;
    public final Integer b;
    public final fo2 c;

    public cpc(y6o y6oVar, Integer num, fo2 fo2Var) {
        this.a = y6oVar;
        this.b = num;
        this.c = fo2Var;
    }

    public final y6o a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpc)) {
            return false;
        }
        cpc cpcVar = (cpc) obj;
        return jl40.l(this.a, cpcVar.a) && jl40.l(this.b, cpcVar.b) && jl40.l(this.c, cpcVar.c);
    }

    @Override // defpackage.fpc
    public final fo2 getExtras() {
        return this.c;
    }

    public final int hashCode() {
        y6o y6oVar = this.a;
        int hashCode = (y6oVar == null ? 0 : y6oVar.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        fo2 fo2Var = this.c;
        return hashCode2 + (fo2Var != null ? fo2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(dialog=" + this.a + ", httpCode=" + this.b + ", extras=" + this.c + Extension.C_BRAKE;
    }

    public cpc() {
        this(null, null, null);
    }
}
