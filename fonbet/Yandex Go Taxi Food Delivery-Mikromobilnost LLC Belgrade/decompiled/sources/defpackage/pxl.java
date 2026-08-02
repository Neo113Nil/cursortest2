package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class pxl {
    public final cnr0 a;

    public pxl(cnr0 cnr0Var) {
        this.a = cnr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return pxl.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((pxl) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "DocumentContext(shared=" + this.a + Extension.C_BRAKE;
    }
}
