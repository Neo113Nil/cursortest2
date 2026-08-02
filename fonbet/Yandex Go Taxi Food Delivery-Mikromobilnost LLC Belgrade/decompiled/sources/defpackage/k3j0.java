package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class k3j0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public k3j0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3j0)) {
            return false;
        }
        k3j0 k3j0Var = (k3j0) obj;
        return jl40.l(this.a, k3j0Var.a) && jl40.l(this.b, k3j0Var.b) && jl40.l(this.c, k3j0Var.c) && jl40.l(this.d, k3j0Var.d) && jl40.l(this.e, k3j0Var.e) && jl40.l(this.f, k3j0Var.f) && jl40.l(this.g, k3j0Var.g) && jl40.l(this.h, k3j0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("ReportSettingsPageTexts(title=", this.a, ", emailInputTitle=", this.b, ", invalidEmail=");
        g8e.D(v, this.c, ", reportPeriodTitle=", this.d, ", save=");
        g8e.D(v, this.e, ", saving=", this.f, ", saved=");
        return g8e.r(v, this.g, ", selectOptionError=", this.h, Extension.C_BRAKE);
    }
}
