package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mex0 {
    public final ej31 a;
    public final i69 b;
    public final k58 c;
    public final ogx0 d;
    public final oco e;
    public final y1f f;
    public final d1f0 g;
    public final qm4 h;
    public final quz0 i;
    public final twa0 j;
    public final String k;
    public final String l;
    public final String m;

    public mex0(ej31 ej31Var, i69 i69Var, k58 k58Var, ogx0 ogx0Var, oco ocoVar, y1f y1fVar, d1f0 d1f0Var, qm4 qm4Var, quz0 quz0Var, twa0 twa0Var, String str, String str2) {
        this.a = ej31Var;
        this.b = i69Var;
        this.c = k58Var;
        this.d = ogx0Var;
        this.e = ocoVar;
        this.f = y1fVar;
        this.g = d1f0Var;
        this.h = qm4Var;
        this.i = quz0Var;
        this.j = twa0Var;
        this.k = str;
        this.l = str2;
        this.m = ej31Var.a.e;
    }

    public static mex0 a(mex0 mex0Var, d1f0 d1f0Var, qm4 qm4Var, quz0 quz0Var, int i) {
        ej31 ej31Var = mex0Var.a;
        i69 i69Var = mex0Var.b;
        k58 k58Var = mex0Var.c;
        ogx0 ogx0Var = mex0Var.d;
        oco ocoVar = mex0Var.e;
        y1f y1fVar = mex0Var.f;
        if ((i & 64) != 0) {
            d1f0Var = mex0Var.g;
        }
        d1f0 d1f0Var2 = d1f0Var;
        qm4 qm4Var2 = (i & 128) != 0 ? mex0Var.h : qm4Var;
        quz0 quz0Var2 = (i & 256) != 0 ? mex0Var.i : quz0Var;
        twa0 twa0Var = mex0Var.j;
        String str = mex0Var.k;
        String str2 = mex0Var.l;
        mex0Var.getClass();
        return new mex0(ej31Var, i69Var, k58Var, ogx0Var, ocoVar, y1fVar, d1f0Var2, qm4Var2, quz0Var2, twa0Var, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mex0)) {
            return false;
        }
        mex0 mex0Var = (mex0) obj;
        return this.a.equals(mex0Var.a) && this.b.equals(mex0Var.b) && this.c.equals(mex0Var.c) && this.d.equals(mex0Var.d) && jl40.l(this.e, mex0Var.e) && jl40.l(this.f, mex0Var.f) && jl40.l(this.g, mex0Var.g) && jl40.l(this.h, mex0Var.h) && jl40.l(this.i, mex0Var.i) && jl40.l(this.j, mex0Var.j) && this.k.equals(mex0Var.k) && jl40.l(this.l, mex0Var.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        oco ocoVar = this.e;
        int hashCode2 = (hashCode + (ocoVar == null ? 0 : ocoVar.hashCode())) * 31;
        y1f y1fVar = this.f;
        int hashCode3 = (hashCode2 + (y1fVar == null ? 0 : Integer.hashCode(y1fVar.a))) * 31;
        d1f0 d1f0Var = this.g;
        int hashCode4 = (hashCode3 + (d1f0Var == null ? 0 : d1f0Var.hashCode())) * 31;
        qm4 qm4Var = this.h;
        int hashCode5 = (hashCode4 + (qm4Var == null ? 0 : qm4Var.hashCode())) * 31;
        quz0 quz0Var = this.i;
        int hashCode6 = (hashCode5 + (quz0Var == null ? 0 : quz0Var.hashCode())) * 31;
        twa0 twa0Var = this.j;
        return this.l.hashCode() + unr0.b((hashCode6 + (twa0Var != null ? twa0Var.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffCellUiState(verticalTariffUiState=");
        sb.append(this.a);
        sb.append(", cellUiState=");
        sb.append(this.b);
        sb.append(", carImageUiState=");
        sb.append(this.c);
        sb.append(", tariffNameUiState=");
        sb.append(this.d);
        sb.append(", etaUiState=");
        sb.append(this.e);
        sb.append(", couponUiState=");
        sb.append(this.f);
        sb.append(", priceUiState=");
        sb.append(this.g);
        sb.append(", badgeUiState=");
        sb.append(this.h);
        sb.append(", tooltipContentUiState=");
        sb.append(this.i);
        sb.append(", performanceUiAction=");
        sb.append(this.j);
        sb.append(", contentDescription=");
        return g8e.r(sb, this.k, ", clickActionLabel=", this.l, Extension.C_BRAKE);
    }
}
