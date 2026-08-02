package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class c4m implements k4m {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final a4m d;

    public c4m(String str, kdc kdcVar, kdc kdcVar2, kz80 kz80Var) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = kz80Var;
    }

    public final kdc a() {
        return this.c;
    }

    public final a4m b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final kdc d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4m)) {
            return false;
        }
        c4m c4mVar = (c4m) obj;
        return jl40.l(this.a, c4mVar.a) && jl40.l(this.b, c4mVar.b) && jl40.l(this.c, c4mVar.c) && jl40.l(this.d, c4mVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.c;
        int hashCode3 = (hashCode2 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        a4m a4mVar = this.d;
        return hashCode3 + (a4mVar != null ? a4mVar.hashCode() : 0);
    }

    public final String toString() {
        return "Custom(title=" + this.a + ", titleColor=" + this.b + ", backgroundColor=" + this.c + ", doneButtonClickAction=" + this.d + Extension.C_BRAKE;
    }
}
