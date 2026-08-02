package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pdu implements sdu {
    public final String a;
    public final aau b;
    public final nvi0 c;
    public final u9u d;

    public pdu(String str, aau aauVar, nvi0 nvi0Var, u9u u9uVar) {
        this.a = str;
        this.b = aauVar;
        this.c = nvi0Var;
        this.d = u9uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdu)) {
            return false;
        }
        pdu pduVar = (pdu) obj;
        return jl40.l(this.a, pduVar.a) && jl40.l(this.b, pduVar.b) && jl40.l(this.c, pduVar.c) && jl40.l(this.d, pduVar.d);
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        u9u u9uVar = this.d;
        return hashCode + (u9uVar == null ? 0 : u9uVar.hashCode());
    }

    public final String toString() {
        return "BackgroundHeaderUiState(id=" + this.a + ", headerInfoUiState=" + this.b + ", backgroundImage=" + this.c + ", headerGradientUiState=" + this.d + Extension.C_BRAKE;
    }
}
