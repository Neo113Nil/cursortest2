package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pzd {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public pzd(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzd)) {
            return false;
        }
        pzd pzdVar = (pzd) obj;
        return this.a == pzdVar.a && jl40.l(this.b, pzdVar.b) && jl40.l(this.c, pzdVar.c) && jl40.l(this.d, pzdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(unr0.v(this.a, "SelfTimerConfig(timeout=", ", dialogTitle=", this.b, ", dialogButtonText="), this.c, ", dialogCloseText=", this.d, Extension.C_BRAKE);
    }
}
