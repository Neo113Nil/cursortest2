package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aau {
    public final ncu a;
    public final hgx0 b;
    public final tze0 c;

    public aau(ncu ncuVar, hgx0 hgx0Var, tze0 tze0Var) {
        this.a = ncuVar;
        this.b = hgx0Var;
        this.c = tze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aau)) {
            return false;
        }
        aau aauVar = (aau) obj;
        return jl40.l(this.a, aauVar.a) && jl40.l(this.b, aauVar.b) && jl40.l(this.c, aauVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HeaderInfoUiState(headerToolbarUiState=" + this.a + ", tariffInfoUiState=" + this.b + ", priceInfoUiState=" + this.c + Extension.C_BRAKE;
    }
}
