package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i24 {
    public final rr51 a;
    public final rr51 b;
    public final rr51 c;
    public final rr51 d;

    public i24(rr51 rr51Var, rr51 rr51Var2, rr51 rr51Var3, rr51 rr51Var4) {
        this.a = rr51Var;
        this.b = rr51Var2;
        this.c = rr51Var3;
        this.d = rr51Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i24)) {
            return false;
        }
        i24 i24Var = (i24) obj;
        return jl40.l(this.a, i24Var.a) && jl40.l(this.b, i24Var.b) && jl40.l(this.c, i24Var.c) && jl40.l(this.d, i24Var.d);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int hashCode = (rr51Var == null ? 0 : rr51Var.hashCode()) * 31;
        rr51 rr51Var2 = this.b;
        int hashCode2 = (hashCode + (rr51Var2 == null ? 0 : rr51Var2.hashCode())) * 31;
        rr51 rr51Var3 = this.c;
        int hashCode3 = (hashCode2 + (rr51Var3 == null ? 0 : rr51Var3.hashCode())) * 31;
        rr51 rr51Var4 = this.d;
        return hashCode3 + (rr51Var4 != null ? rr51Var4.hashCode() : 0);
    }

    public final String toString() {
        return "AutoTopupStatusYbDivData(pending=" + this.a + ", fail=" + this.b + ", timeout=" + this.c + ", success=" + this.d + Extension.C_BRAKE;
    }
}
