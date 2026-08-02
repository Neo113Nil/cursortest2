package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class pqp0 extends crp0 {
    public final String c;
    public final String d;
    public final Object e;

    public pqp0(String str, String str2, String str3) {
        super("NonEncodedQueryParameter");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.e;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqp0)) {
            return false;
        }
        pqp0 pqp0Var = (pqp0) obj;
        return this.c.equals(pqp0Var.c) && jl40.l(this.d, pqp0Var.d) && jl40.l(this.e, pqp0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.c.hashCode() * 31, 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return x4e.h(b64.v("NonEncodedQueryParameter(url=", this.c, ", deeplinkSource=", this.d, ", payload="), this.e, Extension.C_BRAKE);
    }
}
