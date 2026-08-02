package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class bs90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bs90(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs90)) {
            return false;
        }
        bs90 bs90Var = (bs90) obj;
        return this.a.equals(bs90Var.a) && this.b.equals(bs90Var.b) && jl40.l(this.c, bs90Var.c) && this.d.equals(bs90Var.d) && this.e.equals(bs90Var.e) && this.f.equals(bs90Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("PathsInternal(filesDirectoryPath=", this.a, ", workingDirectoryPath=", this.b, ", dataDirectoryPath=");
        g8e.D(v, this.c, ", systemDirectoryPath=", this.d, ", temporaryDirectoryPath=");
        return g8e.r(v, this.e, ", configPath=", this.f, Extension.C_BRAKE);
    }
}
