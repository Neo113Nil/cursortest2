package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class olb implements plb {
    public final String a;
    public final String b;
    public final String c;
    public final glb d;

    public olb(String str, String str2, String str3, glb glbVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = glbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olb)) {
            return false;
        }
        olb olbVar = (olb) obj;
        return jl40.l(this.a, olbVar.a) && jl40.l(this.b, olbVar.b) && jl40.l(this.c, olbVar.c) && this.d.equals(olbVar.d);
    }

    @Override // defpackage.plb
    public final snb getAnalytics() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Success(orderId=", this.a, ", tripId=", this.b, ", requestId=");
        v.append(this.c);
        v.append(", analytics=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
