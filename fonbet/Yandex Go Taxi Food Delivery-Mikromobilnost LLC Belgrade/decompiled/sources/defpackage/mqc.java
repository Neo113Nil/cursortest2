package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mqc {
    public final String a;
    public final String b;
    public final fqc c;

    public mqc(String str, String str2, fqc fqcVar) {
        this.a = str;
        this.b = str2;
        this.c = fqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqc)) {
            return false;
        }
        mqc mqcVar = (mqc) obj;
        return this.a.equals(mqcVar.a) && jl40.l(this.b, mqcVar.b) && jl40.l(this.c, mqcVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Payload(url=", this.a, ", botGuid=", this.b, ", source=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
