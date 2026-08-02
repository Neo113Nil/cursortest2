package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mzi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public mzi0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzi0)) {
            return false;
        }
        mzi0 mzi0Var = (mzi0) obj;
        return jl40.l(this.a, mzi0Var.a) && jl40.l(this.b, mzi0Var.b) && jl40.l(this.c, mzi0Var.c) && jl40.l(this.d, mzi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("ReorderActionLabels(setFirst=", this.a, ", moveAbove=", this.b, ", moveBelow="), this.c, ", setLast=", this.d, Extension.C_BRAKE);
    }
}
