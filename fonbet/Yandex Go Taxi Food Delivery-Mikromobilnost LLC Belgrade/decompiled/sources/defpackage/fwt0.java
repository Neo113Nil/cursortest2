package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fwt0 {
    public final fxy0 a;

    public fwt0(fxy0 fxy0Var) {
        this.a = fxy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwt0) && jl40.l(this.a, ((fwt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SpoilerParamEntity(particleColor=" + this.a + Extension.C_BRAKE;
    }
}
