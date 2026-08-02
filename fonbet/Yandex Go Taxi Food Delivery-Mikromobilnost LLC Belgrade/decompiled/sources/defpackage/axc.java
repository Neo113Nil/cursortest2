package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class axc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public axc(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axc)) {
            return false;
        }
        axc axcVar = (axc) obj;
        return this.a.equals(axcVar.a) && jl40.l(this.b, axcVar.b) && jl40.l(this.c, axcVar.c) && this.d.equals(axcVar.d) && jl40.l(this.e, axcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("ComplaintButtonEntity(title=", this.a, ", iconUrl=", this.b, ", type=");
        g8e.D(v, this.c, ", notificationText=", this.d, ", notificationIconUrl=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
