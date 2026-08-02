package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class o2o {
    public static final n2o Companion = new n2o();
    public final String a;
    public final String b;

    public /* synthetic */ o2o(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, m2o.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2o)) {
            return false;
        }
        o2o o2oVar = (o2o) obj;
        return jl40.l(this.a, o2oVar.a) && jl40.l(this.b, o2oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("EnrichLinkParam(urlParameterName=", this.a, ", variableName=", this.b, Extension.C_BRAKE);
    }
}
