package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class eku0 {
    public final String a;
    public final String b;
    public final String c;
    public final qn11 d;
    public final b e;

    public eku0(String str, String str2, String str3, qn11 qn11Var, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qn11Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eku0)) {
            return false;
        }
        eku0 eku0Var = (eku0) obj;
        return jl40.l(this.a, eku0Var.a) && jl40.l(this.b, eku0Var.b) && jl40.l(this.c, eku0Var.c) && jl40.l(this.d, eku0Var.d) && jl40.l(this.e, eku0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        b bVar = this.e;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("StoredExperimentTypedEntry(name=", this.a, ", version=", this.b, ", rawValue=");
        v.append(this.c);
        v.append(", experiment=");
        v.append(this.d);
        v.append(", jsonValue=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
