package defpackage;

/* loaded from: classes2.dex */
public final class lnz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lnz0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnz0)) {
            return false;
        }
        lnz0 lnz0Var = (lnz0) obj;
        return jl40.l(this.a, lnz0Var.a) && jl40.l(this.b, lnz0Var.b) && jl40.l(this.c, lnz0Var.c) && this.d.equals(lnz0Var.d);
    }

    public final int hashCode() {
        return unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return g8e.r(b64.v("TokenizeCardData(pan=", this.a, ", expirationYear=", this.b, ", expirationMonth="), this.c, ", secretCode=", this.d, ", holderName=null)");
    }
}
