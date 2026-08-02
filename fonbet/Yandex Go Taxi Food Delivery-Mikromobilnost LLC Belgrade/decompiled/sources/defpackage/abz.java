package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class abz {
    public final kkz a;
    public final iie b;
    public final hyp0 c;
    public final r1f0 d;

    public abz(kkz kkzVar, iie iieVar, hyp0 hyp0Var, r1f0 r1f0Var) {
        this.a = kkzVar;
        this.b = iieVar;
        this.c = hyp0Var;
        this.d = r1f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abz)) {
            return false;
        }
        abz abzVar = (abz) obj;
        return jl40.l(this.a, abzVar.a) && jl40.l(this.b, abzVar.b) && jl40.l(this.c, abzVar.c) && this.d.equals(abzVar.d);
    }

    public final int hashCode() {
        kkz kkzVar = this.a;
        int hashCode = (this.b.hashCode() + ((kkzVar == null ? 0 : Integer.hashCode(kkzVar.a)) * 31)) * 31;
        hyp0 hyp0Var = this.c;
        return this.d.hashCode() + ((hashCode + (hyp0Var != null ? hyp0Var.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LocationPermissionV2UiState(logoUiState=" + this.a + ", contentUiState=" + this.b + ", secondaryButtonUiState=" + this.c + ", primaryButtonUiState=" + this.d + Extension.C_BRAKE;
    }
}
