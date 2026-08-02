package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gbj0 {
    public final hcj0 a;

    public gbj0(hcj0 hcj0Var) {
        this.a = hcj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbj0) && jl40.l(this.a, ((gbj0) obj).a);
    }

    public final int hashCode() {
        hcj0 hcj0Var = this.a;
        if (hcj0Var == null) {
            return 0;
        }
        return hcj0Var.hashCode();
    }

    public final String toString() {
        return "RequirementActions(addressInput=" + this.a + Extension.C_BRAKE;
    }
}
