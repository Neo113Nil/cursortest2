package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class agv0 implements egv0 {
    public final String a;
    public final String b;

    public agv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agv0)) {
            return false;
        }
        agv0 agv0Var = (agv0) obj;
        return this.a.equals(agv0Var.a) && jl40.l(this.b, agv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Destination(contentDescription=", this.a, ", iconUrl=", this.b, Extension.C_BRAKE);
    }
}
