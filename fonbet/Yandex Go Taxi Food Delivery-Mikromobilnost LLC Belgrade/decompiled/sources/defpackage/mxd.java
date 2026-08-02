package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mxd {
    public final String a;
    public final String b;
    public final Object c;

    public mxd(String str, String str2, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxd)) {
            return false;
        }
        mxd mxdVar = (mxd) obj;
        return jl40.l(this.a, mxdVar.a) && jl40.l(this.b, mxdVar.b) && jl40.l(this.c, mxdVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return x4e.h(b64.v("Condition(tariff=", this.a, ", requirementName=", this.b, ", requirementValue="), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ mxd(int i) {
        this("", "", null);
    }

    public mxd() {
        this(0);
    }
}
