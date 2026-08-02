package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bpi {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public bpi(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpi)) {
            return false;
        }
        bpi bpiVar = (bpi) obj;
        return jl40.l(this.a, bpiVar.a) && jl40.l(this.b, bpiVar.b) && jl40.l(this.c, bpiVar.c) && this.d == bpiVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", isNextButtonEnabled=", Extension.C_BRAKE, b64.v("DeliverySelectorRequirementsPayload(title=", this.a, ", subtitle=", this.b, ", requirementName="), this.d);
    }
}
