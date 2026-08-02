package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class nrq implements nui0, b8u {
    public final kr a;
    public final cnr0 b;
    public final cnr0 c;

    public nrq(kr krVar, cnr0 cnr0Var) {
        this.a = krVar;
        this.b = cnr0Var;
        this.c = cnr0Var;
    }

    @Override // defpackage.b8u
    public final cnr0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nrq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nrq nrqVar = (nrq) obj;
        return jl40.l(this.a, nrqVar.a) && jl40.l(this.b, nrqVar.b);
    }

    public final int hashCode() {
        kr krVar = this.a;
        int hashCode = (krVar != null ? krVar.hashCode() : 0) * 31;
        cnr0 cnr0Var = this.b;
        return hashCode + (cnr0Var != null ? cnr0Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "Feedback(action=" + this.a + ", shared=" + this.b + Extension.C_BRAKE;
    }
}
