package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class pm20 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pm20(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm20)) {
            return false;
        }
        pm20 pm20Var = (pm20) obj;
        return jl40.l(this.a, pm20Var.a) && jl40.l(this.b, pm20Var.b) && jl40.l(this.c, pm20Var.c) && this.d.equals(pm20Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("MobClientInfo(packageId=", this.a, ", version=", this.b, ", buildNumber="), this.c, ", platformInfo=", this.d, Extension.C_BRAKE);
    }
}
