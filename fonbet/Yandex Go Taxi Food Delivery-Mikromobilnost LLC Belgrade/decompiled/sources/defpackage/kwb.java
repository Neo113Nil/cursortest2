package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kwb {
    public final String a;
    public final String b;

    public kwb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwb)) {
            return false;
        }
        kwb kwbVar = (kwb) obj;
        return jl40.l(this.a, kwbVar.a) && jl40.l(this.b, kwbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("RequirementParams(tariffName=", this.a, ", requirementName=", this.b, Extension.C_BRAKE);
    }
}
