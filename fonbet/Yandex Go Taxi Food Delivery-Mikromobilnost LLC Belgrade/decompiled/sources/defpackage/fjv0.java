package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fjv0 implements ijv0 {
    public final ajv0 a;
    public final lsw b;

    public fjv0(ajv0 ajv0Var, lsw lswVar) {
        this.a = ajv0Var;
        this.b = lswVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjv0)) {
            return false;
        }
        fjv0 fjv0Var = (fjv0) obj;
        return jl40.l(this.a, fjv0Var.a) && jl40.l(this.b, fjv0Var.b);
    }

    public final int hashCode() {
        ajv0 ajv0Var = this.a;
        int hashCode = (ajv0Var == null ? 0 : ajv0Var.hashCode()) * 31;
        lsw lswVar = this.b;
        return hashCode + (lswVar != null ? lswVar.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppMain(additionalInfo=" + this.a + ", returnDeeplink=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ fjv0(int i) {
        this(null, null);
    }

    public fjv0() {
        this(null, null);
    }
}
