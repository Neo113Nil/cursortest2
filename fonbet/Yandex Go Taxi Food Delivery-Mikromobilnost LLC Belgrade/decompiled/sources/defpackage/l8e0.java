package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l8e0 implements m8e0 {
    public final String a;
    public final String b;
    public final String c;

    public l8e0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8e0)) {
            return false;
        }
        l8e0 l8e0Var = (l8e0) obj;
        return jl40.l(this.a, l8e0Var.a) && jl40.l(this.b, l8e0Var.b) && jl40.l(this.c, l8e0Var.c);
    }

    @Override // defpackage.m8e0
    public final String getTag() {
        return this.b;
    }

    @Override // defpackage.m8e0
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("DriverAvatar(url=", this.a, ", tag=", this.b, ", badgeImageTag="), this.c, Extension.C_BRAKE);
    }

    public l8e0() {
        this("", "", "");
    }
}
